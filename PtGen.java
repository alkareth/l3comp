/*********************************************************************************
 *       VARIABLES ET METHODES FOURNIES PAR LA CLASSE UtilLex.java               *
 *       complément à l'ANALYSEUR LEXICAL produit par ANTLR                      *
 *                                                                               *
 *   nom du programme compilé, sans suffixe : String UtilLex.nomSource           *
 *   attributs lexicaux (selon items figurant dans la grammaire):                *
 *   -  int UtilLex.valNb = valeur du dernier nombre entier lu (item nbentier)   *
 *   -  int UtilLex.numId = code du dernier identificateur lu (item ident)       *
 *   méthodes utiles :                                                           *
 *   -  void UtilLex.messErr(String m)  affichage de m et arrêt compilation      *
 *   -  String UtilLex.repId(int nId) délivre l'ident de codage nId              *
 *********************************************************************************     
 *     METHODES FOURNIES PAR LA CLASSE PtGen.java                                *
 *     constGen() et constObj()  fournissent les deux fichiers objets            *  
 *     void afftabSymb()  affiche la table des symboles                          *
 *********************************************************************************/

import java.io.*;

public class PtGen {

// constantes manipulées par le compilateur
// ----------------------------------------

private static final int 
    MAXSYMB=300,MAXOBJ=1000,
    // codes MAPILE :
    RESERVER=1,EMPILER=2,CONTENUG=3,AFFECTERG=4,OU=5,ET=6,NON=7,INF=8,
    INFEG=9,SUP=10,SUPEG=11,EG=12,DIFF=13,ADD=14,SOUS=15,MUL=16,DIV=17,
    BSIFAUX=18,BINCOND=19,LIRENT=20,LIREBOOL=21,ECRENT=22,ECRBOOL=23,
    ARRET=24,EMPILERADG=25,EMPILERADL=26,CONTENUL=27,AFFECTERL=28,
    APPEL=29,RETOUR=30,
    // types permis :
    ENT=1,BOOL=2,NEUTRE=3,VRAI=1, FAUX=0,
    // catégories possibles :
    CONSTANTE=1,VARGLOBALE=2,VARLOCALE=3,PARAMFIXE=4,PARAMMOD=5,PROC=6,
    DEF=7,REF=8,PRIVEE=9;

// table des symboles 
// ------------------

private static class EltTabSymb {
    public int code,categorie,type,info;
    public EltTabSymb() { }
    public EltTabSymb(int code,int categorie,int type,int info) { 
        this.code=code;this.categorie=categorie;
        this.type=type;this.info=info;
    }
    public String toString() {
        final String[] chcat={"",
        "CONSTANTE      ","VARGLOBALE     ","VARLOCALE      ",
        "PARAMFIXE      ","PARAMMOD       ","PROC           ",
        "DEF            ","REF            ","PRIVEE         "};
        final String[] chtype={"","ENT     ","BOOL    ","NEUTRE  "};
        String ch="";
        if (code==-1) ch+="-1"; else ch+="@"+UtilLex.repId(code);
        while (ch.length()<15) ch+=' ';
        return ch+chcat[categorie]+chtype[type]+info;
    }
} // EltTabSymb
private static EltTabSymb [] tabSymb=new EltTabSymb [MAXSYMB+1];
private static int it,bc;  

private static int presentIdent(int binf) {
    int i=it;
    while (i>=binf && tabSymb[i].code!=UtilLex.numId) i--;
    if (i>=binf) return i; else return 0;
}

private static void placeIdent(int c,int cat,int t,int v) {
    if (it==MAXSYMB) 
        UtilLex.messErr("débordement de la table des symboles");
    it=it+1;tabSymb[it]=new EltTabSymb(c,cat,t,v);
}

private static void afftabSymb() { // affiche la table des symboles
    System.out.println("       code           categorie      type    info");
    System.out.println("      |--------------|--------------|-------|----");
    for (int i=1;i<=it;i++) {
        if (i==bc) {System.out.print("bc=");Ecriture.ecrireInt(i,3);}
        else if (i==it) {System.out.print("it=");Ecriture.ecrireInt(i,3);}
        else Ecriture.ecrireInt(i,6);
        if (tabSymb[i]==null) System.out.println(" référence NULL");
        else System.out.println(" "+tabSymb[i]);
    }
    System.out.println();
}

// contrôle de type
// ----------------

private static void verifEnt() {
    if (tCour!=ENT) UtilLex.messErr("expression entière attendue");
}

private static void verifBool() {
    if (tCour!=BOOL) UtilLex.messErr("expression booléenne attendue");
}

// pile pour gérer les chaînes de reprise et les branchements en avant
// -------------------------------------------------------------------

private static class TpileRep { // chaines de reprise itérations, conditionnelles
    private final int MAXPILEREP=50;
    private int ip;
    private int [] T = new int [MAXPILEREP+1];
    public void empiler(int x) {
        if (ip==MAXPILEREP) 
            UtilLex.messErr("débordement de la pile de gestion des reprises");
        ip=ip+1;T[ip]=x;
    }
    public int depiler() {
        if (ip==0) 
            UtilLex.messErr("compilateur en croix sur chaine de reprise ");
        ip=ip-1;return T[ip+1];
    }
    public TpileRep() {ip=0;}
} // TpileRep
private static TpileRep pileRep = new TpileRep();  ; // chaines de reprise itérations, conditionnelles

// production du code objet en mémoire, dans le tableau po
// -------------------------------------------------------

private static int [] po = new int [MAXOBJ+1]; 
private static int ipo;

private static void produire(int codeouarg) {
    if (ipo==MAXOBJ) 
        UtilLex.messErr("débordement : programme objet trop long");
    ipo=ipo+1;po[ipo]=codeouarg;
}

// construction des fichiers objets
// -------------------------------- 

private static void constGen() {
    Mnemo.creerFichier(ipo,po,UtilLex.nomSource+".gen");  // recopie de po sous forme mnémonique 
}

private static void constObj() {
    OutputStream f=Ecriture.ouvrir(UtilLex.nomSource+".obj");
    if (f==null) {
        System.out.println("impossible de créer "+UtilLex.nomSource+".obj");
        System.exit(1);
    }
    for (int i=1;i<=ipo;i++) 
        if (vTrans[i]!=-1) Ecriture.ecrireStringln(f,i+"   "+vTrans[i]);
    for (int i=1;i<=ipo;i++) Ecriture.ecrireStringln(f,""+po[i]);
    Ecriture.fermer(f);
}

// compilation séparée : vecteur de translation et descripteur
// -----------------------------------------------------------

private static int[] vTrans=new int[MAXOBJ+1];
private static void initvTrans () { for (int i=1;i<=MAXOBJ;i++) vTrans[i]=-1; }
private static Descripteur desc;
private static void vecteurTrans(int x) { // ajout d'un doublet au vecteur de translation
    if (x==Descripteur.REFEXT || desc.unite.equals("module")) vTrans[ipo]=x;desc.nbTransExt++;
}  // descripteur

// autres variables
// ----------------

public static String trinome="Thomas Boucherie, Léo Noël-Baron et Thierry Sampaio";

private static int cptVar; // compteur de variables
private static int cptPar; // compteur de paramètres
private static int mulFac; // facteur pour les constantes négatives
private static int code; // code de l'ident courant
private static int iSymb; // adresse de la table des symboles
private static int iAff; // adresse de la table des symboles
private static int tCour; // type courant pour vérifications
private static int vCour; // valeur de l'expression compilée le cas echeant
private static int nbPars;
private static int adProc;
private static int nbParsLu;
private static int curPar;
private static int cat;

// initialisations
// ---------------

private static void initialisations() { // à compléter si nécessaire mais NE RIEN SUPPRIMER
    initvTrans(); 
    desc=new Descripteur(); // initialisation du descripteur pour compilation séparée   
    it = 0; bc = 1; ipo = 0;
    cptVar = 0; cptPar = 0; mulFac = 1;
    nbPars = 0; curPar = 0;
    code = 0; iSymb = 0;
    tCour = NEUTRE; vCour = 0;
} // initialisations

// code des points de génération
// -----------------------------

public static void pt(int numGen) {
    switch (numGen) {
    case 0: initialisations(); break;
    
    // Quelques points de génération fréquemment utiles
    case 1:
        iSymb = presentIdent(1);
        if (iSymb == 0)
            UtilLex.messErr("Identifiant non déclaré");
        break;
    // Gestion des erreurs de typage
    case 2: tCour = ENT; break;
    case 3: tCour = BOOL; break;
    case 4: verifEnt(); break;
    case 6: verifBool(); break;

    // Expressions
    case 100: mulFac = -1; break;
    case 101:
        vCour = UtilLex.valNb * mulFac;
        mulFac = 1;
        break;
    case 102: vCour = VRAI; break;
    case 103: vCour = FAUX; break;
    case 104: produire(EMPILER); produire(vCour); break;
    case 105:
        tCour = tabSymb[iSymb].type;
        cat = tabSymb[iSymb].categorie;
        switch (cat) {
            case CONSTANTE:
                produire(EMPILER); break;
            case VARGLOBALE:
                produire(CONTENUG); break;
            case VARLOCALE: case PARAMFIXE: case PARAMMOD:
                produire(CONTENUL); break;
        }
        produire(tabSymb[iSymb].info);
        if (cat == VARLOCALE || cat == PARAMFIXE) produire(0);
        else if (cat == PARAMMOD) produire(1);
        break;
    // Production des codes Mapile
    case 106: produire(MUL); break;
    case 107: produire(DIV); break;
    case 108: produire(ADD); break;
    case 109: produire(SOUS); break;
    case 110: produire(INF); break;
    case 111: produire(INFEG); break;
    case 112: produire(SUP); break;
    case 113: produire(SUPEG); break;
    case 114: produire(EG); break;
    case 115: produire(DIFF); break;
    case 116: produire(NON); break;
    case 117: produire(OU); break;
    case 118: produire(ET); break;

    // Déclarations
    case 299:
        if (presentIdent(bc) != 0)
            UtilLex.messErr("Identifiant déjà réservé");
        break;
    case 200: placeIdent(UtilLex.numId, CONSTANTE, NEUTRE, 0); break;
    case 205: tabSymb[it].type = tCour; tabSymb[it].info = vCour; break;
    case 201:
        if (bc == 1) placeIdent(UtilLex.numId, VARGLOBALE, tCour, cptVar);
        else placeIdent(UtilLex.numId, VARLOCALE, tCour, cptPar + 2 + cptVar);
        cptVar++;
        break;
    case 202:
        produire(RESERVER); produire(cptVar); cptVar = 0; break;
    case 203:
        if (presentIdent(1) != 0)
            UtilLex.messErr("Identifiant déjà réservé");
        placeIdent(UtilLex.numId, PROC, NEUTRE, ipo+1);
        placeIdent(-1, PRIVEE, NEUTRE, 0);
        bc = it+1;
        break;
    case 204: tabSymb[bc-1].info = cptPar; cptPar = 0; break;
    case 206:
        placeIdent(UtilLex.numId, PARAMFIXE, tCour, cptPar);
        cptPar++;
        break;
    case 207:
        placeIdent(UtilLex.numId, PARAMMOD, tCour, cptPar);
        cptPar++;
        break;
    case 208:
        produire(RETOUR); produire(tabSymb[bc-1].info);
        it = bc + tabSymb[bc-1].info - 1;
        for (int i=bc; i<=it; i++) tabSymb[i].code = -1;
        bc = 1;
        break;

    // Lecture, écriture, affectation
    case 399:
        cat = tabSymb[iSymb].categorie;
        if (cat != VARGLOBALE && cat != VARLOCALE && cat != PARAMMOD)
            UtilLex.messErr("Impossible d'affecter cet identifiant");
        iAff = iSymb;
        break;
    case 300:
        if (tabSymb[iSymb].type == ENT) produire(LIRENT);
        if (tabSymb[iSymb].type == BOOL) produire(LIREBOOL);
        break;
    case 301:
        if (tCour == ENT) produire(ECRENT);
        if (tCour == BOOL) produire(ECRBOOL);
        break;
    case 302: tCour = tabSymb[iSymb].type; break;
    case 303:
        cat = tabSymb[iAff].categorie;
        if (cat == VARGLOBALE) produire(AFFECTERG);
        else produire(AFFECTERL);
        produire(tabSymb[iAff].info);
        if (cat == VARLOCALE) produire(0);
        if (cat == PARAMMOD) produire(1);
        break;
    // Structures conditionnelles et boucle
    case 304: pileRep.empiler(ipo); break;
    case 305: po[pileRep.depiler()] = ipo+1; break;
    case 306: po[pileRep.depiler()] = ipo+3; break;
    case 307: produire(BSIFAUX); produire(0); break;
    case 308: produire(BINCOND); produire(0); break;
    case 309: produire(BINCOND); produire(pileRep.depiler()); break;
    case 311: produire(BINCOND); produire(pileRep.depiler()+1); break;
    case 310:
        int last = pileRep.depiler();
        while (last != 0) {
            int prev = po[last];
            po[last] = ipo+1;
            last = prev;
        }
        break;
    // Appel de procédure
    case 312:
        adProc = tabSymb[iSymb].info;
        nbPars = tabSymb[iSymb+1].info;
        nbParsLu = 0;
        curPar = iSymb+2;
        break;
    case 313:
        if (nbParsLu > nbPars)
            UtilLex.messErr("Trop de paramètres");
        if (tabSymb[curPar].categorie != PARAMFIXE)
            UtilLex.messErr("Mauvais paramètre");
        if (tabSymb[curPar].type != tCour)
            UtilLex.messErr("Erreur de typage");
        nbParsLu++; curPar++;
        break;
    case 314:
        if (nbParsLu > nbPars)
            UtilLex.messErr("Trop de paramètres");
        if (tabSymb[curPar].categorie != PARAMMOD)
            UtilLex.messErr("Mauvais paramètre");
        if (tabSymb[curPar].type != tabSymb[iSymb].type)
            UtilLex.messErr("Erreur de typage");
        nbParsLu++; curPar++;
        cat = tabSymb[iSymb].categorie;
        if (cat == VARGLOBALE) produire(EMPILERADG);
        else produire(EMPILERADL);
        produire(tabSymb[iSymb].info);
        if (cat == VARLOCALE) produire(0);
        if (cat == PARAMMOD) produire(1);
        break;
    case 315:
        produire(APPEL); produire(adProc); produire(nbPars); break;
    
    case 666:
        produire(ARRET);
        constObj();
        constGen();
        break;
    default:
        System.out.println("Point de génération non prévu dans votre liste");
        break;
    }
} // pt

} // PtGen
