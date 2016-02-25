/*********************************************************************************
 *       VARIABLES ET METHODES FOURNIES PAR LA CLASSE UtilLex.java               *
 *       complément à l'ANALYSEUR LEXICAL produit par ANTLR                      *
 *                                                                               *
 *                                                                               *
 *   nom du programme compilé, sans suffixe : String UtilLex.nomSource           *
 *   ------------------------                                                    *
 *                                                                               *
 *   attributs lexicaux (selon items figurant dans la grammaire):                *
 *   ------------------                                                          *
 *     int UtilLex.valNb = valeur du dernier nombre entier lu (item nbentier)    *
 *     int UtilLex.numId = code du dernier identificateur lu (item ident)        *
 *                                                                               *
 *                                                                               *
 *   méthodes utiles :                                                           *
 *   ---------------                                                             *
 *     void UtilLex.messErr(String m)  affichage de m et arrêt compilation       *
 *     String UtilLex.repId(int nId) délivre l'ident de codage nId               *
 *     
 *********************************************************************************     
 *     METHODES FOURNIES PAR LA CLASSE PtGen.java                                *
 *     constGen() et constObj()  fournissent les deux fichiers objets            *  
 *     void afftabSymb()  affiche la table des symboles                          *
 *********************************************************************************/
 
 // NB: Merci de renseigner la variable (String) trinome, définie plus loin


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
    ENT=1,BOOL=2,NEUTRE=3,

    VRAI=1, FAUX=0,

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
    } //toString
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
        else 
        if (i==it) {System.out.print("it=");Ecriture.ecrireInt(i,3);}
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

// construction du fichier objet sous forme mnémonique
// ---------------------------------------------------   
private static void constGen() {
Mnemo.creerFichier(ipo,po,UtilLex.nomSource+".gen");  // recopie de po sous forme mnémonique 
}

// construction du fichier objet pour MAPILE
// -----------------------------------------
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
private static void initvTrans () {  
    for (int i=1;i<=MAXOBJ;i++) vTrans[i]=-1;
    }
private static Descripteur desc;
private static void vecteurTrans(int x) { // ajout d'un doublet au vecteur de translation
    if (x==Descripteur.REFEXT || desc.unite.equals("module")) {
        vTrans[ipo]=x;desc.nbTransExt++;
    }
}  // descripteur

// autres variables et procédures fournies
// ---------------------------------------
public static String trinome="Thomas Boucherie, Léo Noël-Baron et Thierry Sampaio"; // RENSEIGNER ICI LES NOMS DU TRINOME, constitués exclusivement de lettres

private static int cptVar; // compteur de variables
private static int code; // code de l'ident courant
private static int iSymb;
private static int tCour; // type de l'expression compilée
private static int mulFac; // facteur pour les constantes négatives
private static int vCour; // valeur de l'expression compilée le cas echeant


// initialisations  à  compléter 
// -----------------------------

private static void initialisations() { // à compléter si nécessaire mais NE RIEN SUPPRIMER
    initvTrans(); 
    desc=new Descripteur(); // initialisation du descripteur pour compilation séparée   
    it = 0;
    bc = 1;
    ipo = 0;

    cptVar = 0;
    code = 0;
    iSymb = 0;
    tCour = NEUTRE;
    mulFac = 1;
    vCour = 0;

} // initialisations

// autres variables et procédures introduites par le trinome 


// code des points de génération à compléter
// -----------------------------------------
public static void pt(int numGen) {
    int cat;
    switch (numGen) {
    
    case 0: initialisations(); break;
    
    // Quelques points de génération fréquemment utiles
    case 1: code = UtilLex.numId; break;
    case 5:
        iSymb = presentIdent(UtilLex.numId);
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
        if (tabSymb[iSymb].categorie == CONSTANTE)
            produire(EMPILER);
        if (tabSymb[iSymb].categorie == VARGLOBALE)
            produire(CONTENUG); 
        produire(tabSymb[iSymb].info);
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
    case 200:
        if (presentIdent(code) != 0)
            UtilLex.messErr("Identifiant déjà réservé");
        placeIdent(code, CONSTANTE, tCour, vCour);
        break;
    case 201:
        if (presentIdent(code) != 0)
            UtilLex.messErr("Identifiant déjà réservé");
        placeIdent(code, VARGLOBALE, tCour, cptVar);
        cptVar++;
        break;
    case 202:
        produire(RESERVER); produire(cptVar); break;

    // Lecture, écriture, affectation
    case 300:
        if (tabSymb[iSymb].categorie != VARGLOBALE)
            UtilLex.messErr("Erreur de syntaxe (lire)");
        if (tabSymb[iSymb].type == ENT) produire(LIRENT);
        if (tabSymb[iSymb].type == BOOL) produire(LIREBOOL);
        produire(AFFECTERG); produire(tabSymb[iSymb].info);
        break;
    case 301:
        if (tCour == ENT) produire(ECRENT);
        if (tCour == BOOL) produire(ECRBOOL);
        break;
    case 302:
        if (tabSymb[iSymb].categorie != VARGLOBALE)
            UtilLex.messErr("Erreur de syntaxe (affectation)");
        tCour = tabSymb[iSymb].type;
        break;
    case 303:
        produire(AFFECTERG); produire(tabSymb[iSymb].info); break;
    // Structures conditionnelles et boucle
    case 304: pileRep.empiler(ipo); break;
    case 305: po[pileRep.depiler()] = ipo+1; break;
    case 306: po[pileRep.depiler()] = ipo+3; break;
    case 307: produire(BSIFAUX); produire(0); break;
    case 308: produire(BINCOND); produire(0); break;
    case 309: produire(BINCOND); produire(pileRep.depiler()); break;
    case 310:
        int last = pileRep.depiler();
        while (last != 0) {
            int prev = po[last];
            po[last] = ipo+1;
            last = prev;
        }
        break;
        
        
    // traitement du cond
    
    // etc
    
    case 999:
        produire(ARRET);
        constObj();
        constGen();
        break;
    default : System.out.println("Point de génération non prévu dans votre liste");break;
    
    }
    }
}
