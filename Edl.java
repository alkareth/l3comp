import java.io.*;

public class Edl {
    static final int MAXMOD=5,MAXOBJ=1000;
    static final int FATALE=0,NONFATALE=1;
    static Descripteur[] tabDesc=new Descripteur[MAXMOD+1];
    static int ipo,nMod,nbErr;
    static String nomProg;
    static String[] nomMods = new String[MAXMOD+1];
    // Tableaux utilisés pour la résolution des translations et références
    static int[] transDon = new int[MAXMOD+1];
    static int[] transCode = new int[MAXMOD+1];
    static EltDef[] dicoDef = new EltDef[(MAXMOD+1)*Descripteur.MAXDEF];
    static int nbDef = 0;
    static int[][] adFinale = new int[MAXMOD+1][Descripteur.MAXDEF+1];

    static void erreur(int te,String m) {
        System.out.println(m);
        if (te == FATALE) {
            System.out.println("ABANDON DE L'EDITION DE LIENS");;
            System.exit(1);
        }
        nbErr=nbErr+1;
    }

    static void lireDescripteurs() {
        boolean existe=false;
        String s;
        System.out.println("les noms doivent etre fournis sans suffixe");
        System.out.print("nom du programme : ");
        s=Lecture.lireString();
        nomProg=s; nomMods[0]=s;
        tabDesc[0]=new Descripteur();
        tabDesc[0].lireDesc(s);
        if (!tabDesc[0].unite.equals("programme")) 
            erreur(FATALE,"programme attendu");
        while (!s.equals("") && nMod<MAXMOD) {
            System.out.print("nom de module "+(nMod+1)+" (RC si termine) ");
            s=Lecture.lireString();
            if (!s.equals("")) {
                nMod=nMod+1;
                nomMods[nMod]=s;
                tabDesc[nMod]=new Descripteur();
                tabDesc[nMod].lireDesc(s);
                if (!tabDesc[nMod].unite.equals("module"))
                    erreur(FATALE,"module attendu");
            }
        }
    }

    static void constMap() {
        OutputStream f1=Ecriture.ouvrir(nomProg+".map");
        if (f1==null) erreur(FATALE,"creation du fichier "+
                     nomProg+".map impossible");
        int[] po=new int[(nMod+1)*MAXOBJ+1];
        ipo=1;
        // On concatène le code objet des modules un à un
        for (int i=0; i<=nMod; i++) {
            // On commence par ouvrir un module
            InputStream unite = Lecture.ouvrir(nomMods[i] + ".obj");
            if (unite == null) erreur(FATALE, nomMods[i] + ".obj illisible");
            int[] vTrans=new int[MAXOBJ+1];
            for (int j=1; j<=MAXOBJ; j++) vTrans[j]=-1;
            // On récupère sa liste de translations
            for (int j=0; j<tabDesc[i].nbTransExt; j++) {
                int at = Lecture.lireInt(unite) + transCode[i];
                vTrans[at] = Lecture.lireIntln(unite);
            }
            // Puis on ajoute son code objet au code général
            int iRef = 1;
            for (int j=0; j<tabDesc[i].tailleCode; j++) {
                po[ipo] = Lecture.lireIntln(unite);
                switch (vTrans[ipo]) { // S'il y a une translation à faire
                    case Descripteur.TRANSDON: po[ipo] += transDon[i]; break;
                    case Descripteur.TRANSCODE: po[ipo] += transCode[i]; break;
                    case Descripteur.REFEXT: po[ipo] = adFinale[i][iRef]; iRef++; break;
                }
                ipo++;
            }
            Lecture.fermer(unite);
        } // Tous les modules sont concaténés
        ipo--; // Pour compenser la dernière incrémentation (en trop)
        po[2] = transDon[nMod] + tabDesc[nMod].tailleGlobaux; // Mise à jour du premier RESERVER n
        for (int i=1; i<=ipo; i++) Ecriture.ecrireStringln(f1, ""+po[i]); // Ecriture dans le fichier
        Ecriture.fermer(f1);
        Mnemo.creerFichier(ipo,po,nomProg+".ima");
    }

    public static void main (String argv[]) {
        System.out.println("EDITEUR DE LIENS / PROJET LICENCE");
        System.out.println("---------------------------------");
        System.out.println("");
        nbErr=0;
        // Phase 1 de l'édition de liens
        lireDescripteurs();
        transDon[0] = 0; transCode[0] = 0;
        for (int i=1; i<=nMod; i++) { // Remplissage de transDon, transCode et dicoDef
            transDon[i] = transDon[i-1] + tabDesc[i-1].tailleGlobaux;
            transCode[i] = transCode[i-1] + tabDesc[i-1].tailleCode;
            for (int j=1; j<=tabDesc[i].nbDef; j++) { // Union des tabDef
                EltDef cur = tabDesc[i].tabDef[j];
                for (int k=0; k<nbDef; k++) // On parcourt les def déjà ajoutées
                    if (dicoDef[k].nomProc.equals(cur.nomProc))
                        erreur(FATALE, "double définition "+cur.nomProc);
                cur.adPo += transCode[i];
                dicoDef[nbDef] = cur; // Ajout de la def courante
                nbDef++;
            }
        }
        for (int i=0; i<=nMod; i++) { // Remplissage de adFinale
            for (int j=1; j<=tabDesc[i].nbRef; j++) {
                EltRef cur = tabDesc[i].tabRef[j];
                int k;
                for (k=0; k<nbDef; k++) // On cherche la ref dans dicoDef (même nom et nb de paramètres)
                    if (dicoDef[k].nomProc.equals(cur.nomProc) && dicoDef[k].nbParam == cur.nbParam) {
                        adFinale[i][j] = dicoDef[k].adPo;
                        break;
                    }
                if (k >= nbDef) erreur(FATALE, "référence introuvable "+cur.nomProc);
            }
        }
        if (nbErr>0) {
            System.out.println("programme executable non produit");
            System.exit(1);
        }
        // Phase 2 de l'edition de liens
        constMap();
        System.out.println("edition de liens terminee");
    }
}

