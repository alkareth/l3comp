// Grammaire du langage PROJET
// COMP L3  
// Anne Grazon, Véronique Masson
// il convient d'y insérer les appels à {PtGen.pt(k);}
// relancer Antlr après chaque modification et raffraichir le projet Eclipse le cas échéant
// attention l'analyse est poursuivie après erreur si l'on supprime la clause rulecatch

grammar projet;
options {
    language=Java; k=1;
}
@header {           
    import java.io.IOException;
    import java.io.DataInputStream;
    import java.io.FileInputStream;
} 

// partie syntaxique - description de la grammaire //
// les non-terminaux doivent commencer par une minuscule

@members {
    // variables globales et méthodes utiles à placer ici
}
// la directive rulecatch permet d'interrompre l'analyse à la première erreur de syntaxe
@rulecatch {
    catch (RecognitionException e) {reportError (e); throw e;}
}

unite      : unitprog EOF | unitmodule  EOF;
unitprog   : 'programme' ident ':' declarations  
             corps { PtGen.pt(999); System.out.println("succès, arret de la compilation "); };
unitmodule : 'module' ident ':' declarations;

declarations : partiedef? partieref? consts? vars? decprocs?;
partiedef    : 'def' ident  (',' ident )* ptvg;
partieref    : 'ref'  specif (',' specif)* ptvg;
specif       : ident ( 'fixe' '(' type ( ',' type  )* ')' )? 
                     ( 'mod'  '(' type ( ',' type  )* ')' )?;
consts       : 'const' ( ident { PtGen.pt(1); } '=' valeur { PtGen.pt(200); } ptvg )+;
vars         : 'var' ( type ident { PtGen.pt(1); PtGen.pt(201); }
                     ( ','  ident { PtGen.pt(1); PtGen.pt(201); } )* ptvg )+ { PtGen.pt(202); };
type         : 'ent' { PtGen.pt(2); } | 'bool' { PtGen.pt(3); };

decprocs : (decproc ptvg)+;
decproc  : 'proc' ident parfixe? parmod? consts? vars? corps;
ptvg     : ';' |;
parfixe  : 'fixe' '(' pf ( ';' pf)* ')';
pf       : type ident  ( ',' ident  )*;
parmod   : 'mod' '(' pm ( ';' pm)* ')';
pm       : type ident  ( ',' ident  )*;

corps        : 'debut' instructions 'fin';
instructions : instruction ( ';' instruction)*;
instruction  : inssi
             | inscond
             | boucle
             | lecture
             | ecriture
             | affouappel;
inssi        : 'si' expression { PtGen.pt(6); PtGen.pt(307); PtGen.pt(304); }
               'alors' instructions ('sinon' { PtGen.pt(308); PtGen.pt(305); PtGen.pt(304); } instructions)?
               'fsi' { PtGen.pt(305); };
inscond      : 'cond' expression { PtGen.pt(6); PtGen.pt(307); PtGen.pt(304); } ':'
                      instructions { PtGen.pt(306); PtGen.pt(308); PtGen.pt(304); }
               ( ','  expression { PtGen.pt(6); PtGen.pt(307); PtGen.pt(304); } ':'
                      instructions { PtGen.pt(306); PtGen.pt(309); PtGen.pt(304); } )* 
               ('aut' instructions)? { PtGen.pt(310); } 'fcond';
boucle       : 'ttq'  { PtGen.pt(304); } expression { PtGen.pt(6); PtGen.pt(307); PtGen.pt(304); }
               'faire' instructions { PtGen.pt(306); PtGen.pt(309); } 'fait';
lecture      : 'lire' '(' ident { PtGen.pt(5); PtGen.pt(300); }
                    ( ',' ident { PtGen.pt(5); PtGen.pt(300); } )* ')';
ecriture     : 'ecrire' '(' expression { PtGen.pt(301); }
                      ( ',' expression { PtGen.pt(301); } )* ')';
affouappel   : ident { PtGen.pt(5); PtGen.pt(302); } ( ':=' expression { PtGen.pt(303); }
                      | (effixes (effmods)?)? );
effixes      : '(' (expression  (',' expression  )*)? ')';
effmods      :'(' (ident  (',' ident  )*)? ')'; 

expression : (exp1) ({ PtGen.pt(6); } 'ou' exp1 { PtGen.pt(6); PtGen.pt(118); } )*;
exp1       : exp2 ({ PtGen.pt(6); } 'et' exp2 { PtGen.pt(6); PtGen.pt(117); } )*;
exp2       : 'non' exp2 { PtGen.pt(6); PtGen.pt(116); }
           | exp3;
exp3       : exp4 ({ PtGen.pt(4); } '='  exp4 { PtGen.pt(4); PtGen.pt(3); PtGen.pt(114); }
                  |{ PtGen.pt(4); } '<>' exp4 { PtGen.pt(4); PtGen.pt(3); PtGen.pt(115); }
                  |{ PtGen.pt(4); } '>'  exp4 { PtGen.pt(4); PtGen.pt(3); PtGen.pt(112); }
                  |{ PtGen.pt(4); } '>=' exp4 { PtGen.pt(4); PtGen.pt(3); PtGen.pt(113); }
                  |{ PtGen.pt(4); } '<'  exp4 { PtGen.pt(4); PtGen.pt(3); PtGen.pt(110); }
                  |{ PtGen.pt(4); } '<=' exp4 { PtGen.pt(4); PtGen.pt(3); PtGen.pt(111); } )?;
exp4       : exp5 ({ PtGen.pt(4); } '+'  exp5 { PtGen.pt(4); PtGen.pt(108); }
                  |{ PtGen.pt(4); } '-'  exp5 { PtGen.pt(4); PtGen.pt(109); } )*;
exp5       : primaire ({ PtGen.pt(4); } '*' primaire { PtGen.pt(4); PtGen.pt(106); }
                      |{ PtGen.pt(4); } 'div' primaire { PtGen.pt(4);  PtGen.pt(107); } )*;
primaire   : valeur { PtGen.pt(104); }
           | ident { PtGen.pt(5); PtGen.pt(105); }
           | '(' expression ')';
valeur     : nbentier { PtGen.pt(2); PtGen.pt(101); }
           | '+' nbentier { PtGen.pt(2); PtGen.pt(101); }
           | '-' { PtGen.pt(100); } nbentier { PtGen.pt(2); PtGen.pt(101); }
           | 'vrai' { PtGen.pt(3); PtGen.pt(102); }
           | 'faux' { PtGen.pt(3); PtGen.pt(103); };

// partie lexicale  : cette partie ne doit pas être modifiée  //
// les unités lexicales de ANTLR doivent commencer par une majuscule
// attention : ANTLR n'autorise pas certains traitements sur les unités lexicales, 
// il est alors nécessaire de passer par un non-terminal intermédiaire 
// exemple : pour l'unité lexicale INT, le non-terminal nbentier a dû être introduit
 
      
nbentier  :   INT { UtilLex.valNb = Integer.parseInt($INT.text);}; // mise à jour de valNb

ident : ID  { UtilLex.traiterId($ID.text, $ID.line); } ; // mise à jour de numId
     // tous les identificateurs seront placés dans la table des identificateurs, y compris le nom du programme ou module
     // la table des symboles n'est pas gérée au niveau lexical
        
  
ID  :   ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ; 
     
// zone purement lexicale //

INT :   '0'..'9'+ ;
WS  :   (' '|'\t' | '\n' |'\r')+ {skip();} ; // définition des "espaces"


COMMENT
  :  '\{' (.)* '\}' {skip();}   // toute suite de caractères entourée d'accolades est un commentaire
  |  '#' ~( '\r' | '\n' )* {skip();}  // tout ce qui suit un caractère dièse sur une ligne est un commentaire
  ;

// commentaires sur plusieurs lignes
ML_COMMENT    :   '/*' (options {greedy=false;} : .)* '*/' {$channel=HIDDEN;}
    ;      



       