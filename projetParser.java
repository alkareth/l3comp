// $ANTLR 3.5.2 projet.g 2016-04-02 20:06:10
           
    import java.io.IOException;
    import java.io.DataInputStream;
    import java.io.FileInputStream;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class projetParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "ID", "INT", "ML_COMMENT", 
		"WS", "'('", "')'", "'*'", "'+'", "','", "'-'", "':'", "':='", "';'", 
		"'<'", "'<='", "'<>'", "'='", "'>'", "'>='", "'alors'", "'aut'", "'bool'", 
		"'cond'", "'const'", "'debut'", "'def'", "'div'", "'ecrire'", "'ent'", 
		"'et'", "'faire'", "'fait'", "'faux'", "'fcond'", "'fin'", "'fixe'", "'fsi'", 
		"'lire'", "'mod'", "'module'", "'non'", "'ou'", "'proc'", "'programme'", 
		"'ref'", "'si'", "'sinon'", "'ttq'", "'var'", "'vrai'"
	};
	public static final int EOF=-1;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int T__34=34;
	public static final int T__35=35;
	public static final int T__36=36;
	public static final int T__37=37;
	public static final int T__38=38;
	public static final int T__39=39;
	public static final int T__40=40;
	public static final int T__41=41;
	public static final int T__42=42;
	public static final int T__43=43;
	public static final int T__44=44;
	public static final int T__45=45;
	public static final int T__46=46;
	public static final int T__47=47;
	public static final int T__48=48;
	public static final int T__49=49;
	public static final int T__50=50;
	public static final int T__51=51;
	public static final int T__52=52;
	public static final int T__53=53;
	public static final int T__54=54;
	public static final int COMMENT=4;
	public static final int ID=5;
	public static final int INT=6;
	public static final int ML_COMMENT=7;
	public static final int WS=8;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public projetParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public projetParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return projetParser.tokenNames; }
	@Override public String getGrammarFileName() { return "projet.g"; }


	    // variables globales et méthodes utiles à placer ici



	// $ANTLR start "unite"
	// projet.g:29:1: unite : ( unitprog EOF | unitmodule EOF ) ;
	public final void unite() throws RecognitionException {
		try {
			// projet.g:29:12: ( ( unitprog EOF | unitmodule EOF ) )
			// projet.g:29:14: ( unitprog EOF | unitmodule EOF )
			{
			// projet.g:29:14: ( unitprog EOF | unitmodule EOF )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==48) ) {
				alt1=1;
			}
			else if ( (LA1_0==44) ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// projet.g:29:15: unitprog EOF
					{
					pushFollow(FOLLOW_unitprog_in_unite62);
					unitprog();
					state._fsp--;

					match(input,EOF,FOLLOW_EOF_in_unite64); 
					}
					break;
				case 2 :
					// projet.g:29:30: unitmodule EOF
					{
					pushFollow(FOLLOW_unitmodule_in_unite68);
					unitmodule();
					state._fsp--;

					match(input,EOF,FOLLOW_EOF_in_unite70); 
					}
					break;

			}

			 PtGen.pt(666); System.out.println("succès, arret de la compilation "); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "unite"



	// $ANTLR start "unitprog"
	// projet.g:30:1: unitprog : 'programme' ident ':' declarations corps ;
	public final void unitprog() throws RecognitionException {
		try {
			// projet.g:30:12: ( 'programme' ident ':' declarations corps )
			// projet.g:30:14: 'programme' ident ':' declarations corps
			{
			match(input,48,FOLLOW_48_in_unitprog82); 
			 PtGen.pt(10); 
			pushFollow(FOLLOW_ident_in_unitprog86);
			ident();
			state._fsp--;

			match(input,15,FOLLOW_15_in_unitprog88); 
			pushFollow(FOLLOW_declarations_in_unitprog90);
			declarations();
			state._fsp--;

			pushFollow(FOLLOW_corps_in_unitprog92);
			corps();
			state._fsp--;

			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "unitprog"



	// $ANTLR start "unitmodule"
	// projet.g:31:1: unitmodule : 'module' ident ':' declarations ;
	public final void unitmodule() throws RecognitionException {
		try {
			// projet.g:31:12: ( 'module' ident ':' declarations )
			// projet.g:31:14: 'module' ident ':' declarations
			{
			match(input,44,FOLLOW_44_in_unitmodule99); 
			 PtGen.pt(11); 
			pushFollow(FOLLOW_ident_in_unitmodule103);
			ident();
			state._fsp--;

			match(input,15,FOLLOW_15_in_unitmodule105); 
			pushFollow(FOLLOW_declarations_in_unitmodule107);
			declarations();
			state._fsp--;

			 PtGen.pt(212); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "unitmodule"



	// $ANTLR start "declarations"
	// projet.g:33:1: declarations : ( partiedef )? ( partieref )? ( consts )? ( vars )? ( decprocs )? ;
	public final void declarations() throws RecognitionException {
		try {
			// projet.g:33:14: ( ( partiedef )? ( partieref )? ( consts )? ( vars )? ( decprocs )? )
			// projet.g:33:16: ( partiedef )? ( partieref )? ( consts )? ( vars )? ( decprocs )?
			{
			// projet.g:33:16: ( partiedef )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==30) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// projet.g:33:16: partiedef
					{
					pushFollow(FOLLOW_partiedef_in_declarations117);
					partiedef();
					state._fsp--;

					}
					break;

			}

			// projet.g:33:27: ( partieref )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==49) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// projet.g:33:27: partieref
					{
					pushFollow(FOLLOW_partieref_in_declarations120);
					partieref();
					state._fsp--;

					}
					break;

			}

			// projet.g:33:38: ( consts )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==28) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// projet.g:33:38: consts
					{
					pushFollow(FOLLOW_consts_in_declarations123);
					consts();
					state._fsp--;

					}
					break;

			}

			// projet.g:33:46: ( vars )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==53) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// projet.g:33:46: vars
					{
					pushFollow(FOLLOW_vars_in_declarations126);
					vars();
					state._fsp--;

					}
					break;

			}

			// projet.g:33:52: ( decprocs )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==47) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// projet.g:33:52: decprocs
					{
					pushFollow(FOLLOW_decprocs_in_declarations129);
					decprocs();
					state._fsp--;

					}
					break;

			}

			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "declarations"



	// $ANTLR start "partiedef"
	// projet.g:34:1: partiedef : 'def' ident ( ',' ident )* ptvg ;
	public final void partiedef() throws RecognitionException {
		try {
			// projet.g:34:14: ( 'def' ident ( ',' ident )* ptvg )
			// projet.g:34:16: 'def' ident ( ',' ident )* ptvg
			{
			match(input,30,FOLLOW_30_in_partiedef140); 
			pushFollow(FOLLOW_ident_in_partiedef142);
			ident();
			state._fsp--;

			 PtGen.pt(211); 
			// projet.g:34:47: ( ',' ident )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==13) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// projet.g:34:48: ',' ident
					{
					match(input,13,FOLLOW_13_in_partiedef147); 
					pushFollow(FOLLOW_ident_in_partiedef149);
					ident();
					state._fsp--;

					 PtGen.pt(211); 
					}
					break;

				default :
					break loop7;
				}
			}

			pushFollow(FOLLOW_ptvg_in_partiedef156);
			ptvg();
			state._fsp--;

			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "partiedef"



	// $ANTLR start "partieref"
	// projet.g:35:1: partieref : 'ref' specif ( ',' specif )* ptvg ;
	public final void partieref() throws RecognitionException {
		try {
			// projet.g:35:14: ( 'ref' specif ( ',' specif )* ptvg )
			// projet.g:35:16: 'ref' specif ( ',' specif )* ptvg
			{
			match(input,49,FOLLOW_49_in_partieref166); 
			pushFollow(FOLLOW_specif_in_partieref168);
			specif();
			state._fsp--;

			// projet.g:35:29: ( ',' specif )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==13) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// projet.g:35:30: ',' specif
					{
					match(input,13,FOLLOW_13_in_partieref171); 
					pushFollow(FOLLOW_specif_in_partieref173);
					specif();
					state._fsp--;

					}
					break;

				default :
					break loop8;
				}
			}

			pushFollow(FOLLOW_ptvg_in_partieref177);
			ptvg();
			state._fsp--;

			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "partieref"



	// $ANTLR start "specif"
	// projet.g:36:1: specif : ident ( 'fixe' '(' type ( ',' type )* ')' )? ( 'mod' '(' type ( ',' type )* ')' )? ;
	public final void specif() throws RecognitionException {
		try {
			// projet.g:36:14: ( ident ( 'fixe' '(' type ( ',' type )* ')' )? ( 'mod' '(' type ( ',' type )* ')' )? )
			// projet.g:36:16: ident ( 'fixe' '(' type ( ',' type )* ')' )? ( 'mod' '(' type ( ',' type )* ')' )?
			{
			pushFollow(FOLLOW_ident_in_specif190);
			ident();
			state._fsp--;

			 PtGen.pt(209); 
			// projet.g:37:22: ( 'fixe' '(' type ( ',' type )* ')' )?
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0==40) ) {
				alt10=1;
			}
			switch (alt10) {
				case 1 :
					// projet.g:37:24: 'fixe' '(' type ( ',' type )* ')'
					{
					match(input,40,FOLLOW_40_in_specif217); 
					match(input,9,FOLLOW_9_in_specif219); 
					pushFollow(FOLLOW_type_in_specif221);
					type();
					state._fsp--;

					 PtGen.pt(206); 
					// projet.g:37:59: ( ',' type )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==13) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// projet.g:37:61: ',' type
							{
							match(input,13,FOLLOW_13_in_specif227); 
							pushFollow(FOLLOW_type_in_specif229);
							type();
							state._fsp--;

							 PtGen.pt(206); 
							}
							break;

						default :
							break loop9;
						}
					}

					match(input,10,FOLLOW_10_in_specif236); 
					}
					break;

			}

			// projet.g:38:22: ( 'mod' '(' type ( ',' type )* ')' )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==43) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// projet.g:38:24: 'mod' '(' type ( ',' type )* ')'
					{
					match(input,43,FOLLOW_43_in_specif265); 
					match(input,9,FOLLOW_9_in_specif268); 
					pushFollow(FOLLOW_type_in_specif270);
					type();
					state._fsp--;

					 PtGen.pt(207); 
					// projet.g:38:59: ( ',' type )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==13) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// projet.g:38:61: ',' type
							{
							match(input,13,FOLLOW_13_in_specif276); 
							pushFollow(FOLLOW_type_in_specif278);
							type();
							state._fsp--;

							 PtGen.pt(207); 
							}
							break;

						default :
							break loop11;
						}
					}

					match(input,10,FOLLOW_10_in_specif285); 
					}
					break;

			}

			 PtGen.pt(210); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "specif"



	// $ANTLR start "consts"
	// projet.g:39:1: consts : 'const' ( ident '=' valeur ptvg )+ ;
	public final void consts() throws RecognitionException {
		try {
			// projet.g:39:14: ( 'const' ( ident '=' valeur ptvg )+ )
			// projet.g:39:16: 'const' ( ident '=' valeur ptvg )+
			{
			match(input,28,FOLLOW_28_in_consts303); 
			// projet.g:39:24: ( ident '=' valeur ptvg )+
			int cnt13=0;
			loop13:
			while (true) {
				int alt13=2;
				int LA13_0 = input.LA(1);
				if ( (LA13_0==ID) ) {
					alt13=1;
				}

				switch (alt13) {
				case 1 :
					// projet.g:39:26: ident '=' valeur ptvg
					{
					pushFollow(FOLLOW_ident_in_consts307);
					ident();
					state._fsp--;

					 PtGen.pt(299); PtGen.pt(200); 
					match(input,21,FOLLOW_21_in_consts311); 
					pushFollow(FOLLOW_valeur_in_consts313);
					valeur();
					state._fsp--;

					 PtGen.pt(205); 
					pushFollow(FOLLOW_ptvg_in_consts317);
					ptvg();
					state._fsp--;

					}
					break;

				default :
					if ( cnt13 >= 1 ) break loop13;
					EarlyExitException eee = new EarlyExitException(13, input);
					throw eee;
				}
				cnt13++;
			}

			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "consts"



	// $ANTLR start "vars"
	// projet.g:40:1: vars : 'var' ( type ident ( ',' ident )* ptvg )+ ;
	public final void vars() throws RecognitionException {
		try {
			// projet.g:40:14: ( 'var' ( type ident ( ',' ident )* ptvg )+ )
			// projet.g:40:16: 'var' ( type ident ( ',' ident )* ptvg )+
			{
			match(input,53,FOLLOW_53_in_vars335); 
			// projet.g:40:22: ( type ident ( ',' ident )* ptvg )+
			int cnt15=0;
			loop15:
			while (true) {
				int alt15=2;
				int LA15_0 = input.LA(1);
				if ( (LA15_0==26||LA15_0==33) ) {
					alt15=1;
				}

				switch (alt15) {
				case 1 :
					// projet.g:40:24: type ident ( ',' ident )* ptvg
					{
					pushFollow(FOLLOW_type_in_vars339);
					type();
					state._fsp--;

					pushFollow(FOLLOW_ident_in_vars341);
					ident();
					state._fsp--;

					 PtGen.pt(299); PtGen.pt(201); 
					// projet.g:41:22: ( ',' ident )*
					loop14:
					while (true) {
						int alt14=2;
						int LA14_0 = input.LA(1);
						if ( (LA14_0==13) ) {
							alt14=1;
						}

						switch (alt14) {
						case 1 :
							// projet.g:41:24: ',' ident
							{
							match(input,13,FOLLOW_13_in_vars368); 
							pushFollow(FOLLOW_ident_in_vars371);
							ident();
							state._fsp--;

							 PtGen.pt(299); PtGen.pt(201); 
							}
							break;

						default :
							break loop14;
						}
					}

					pushFollow(FOLLOW_ptvg_in_vars378);
					ptvg();
					state._fsp--;

					}
					break;

				default :
					if ( cnt15 >= 1 ) break loop15;
					EarlyExitException eee = new EarlyExitException(15, input);
					throw eee;
				}
				cnt15++;
			}

			 PtGen.pt(202); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "vars"



	// $ANTLR start "type"
	// projet.g:42:1: type : ( 'ent' | 'bool' );
	public final void type() throws RecognitionException {
		try {
			// projet.g:42:14: ( 'ent' | 'bool' )
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==33) ) {
				alt16=1;
			}
			else if ( (LA16_0==26) ) {
				alt16=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}

			switch (alt16) {
				case 1 :
					// projet.g:42:16: 'ent'
					{
					match(input,33,FOLLOW_33_in_type398); 
					 PtGen.pt(2); 
					}
					break;
				case 2 :
					// projet.g:42:41: 'bool'
					{
					match(input,26,FOLLOW_26_in_type404); 
					 PtGen.pt(3); 
					}
					break;

			}
		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "type"



	// $ANTLR start "decprocs"
	// projet.g:44:1: decprocs : ( decproc ptvg )+ ;
	public final void decprocs() throws RecognitionException {
		try {
			// projet.g:44:10: ( ( decproc ptvg )+ )
			// projet.g:44:12: ( decproc ptvg )+
			{
			 if (PtGen.estProg()) { PtGen.pt(308); PtGen.pt(304); } 
			// projet.g:45:12: ( decproc ptvg )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==47) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// projet.g:45:13: decproc ptvg
					{
					pushFollow(FOLLOW_decproc_in_decprocs428);
					decproc();
					state._fsp--;

					pushFollow(FOLLOW_ptvg_in_decprocs430);
					ptvg();
					state._fsp--;

					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			 if (PtGen.estProg()) PtGen.pt(305); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "decprocs"



	// $ANTLR start "decproc"
	// projet.g:46:1: decproc : 'proc' ident ( parfixe )? ( parmod )? ( consts )? ( vars )? corps ;
	public final void decproc() throws RecognitionException {
		try {
			// projet.g:46:10: ( 'proc' ident ( parfixe )? ( parmod )? ( consts )? ( vars )? corps )
			// projet.g:46:12: 'proc' ident ( parfixe )? ( parmod )? ( consts )? ( vars )? corps
			{
			match(input,47,FOLLOW_47_in_decproc442); 
			pushFollow(FOLLOW_ident_in_decproc444);
			ident();
			state._fsp--;

			 PtGen.pt(203); 
			// projet.g:46:44: ( parfixe )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==40) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// projet.g:46:44: parfixe
					{
					pushFollow(FOLLOW_parfixe_in_decproc448);
					parfixe();
					state._fsp--;

					}
					break;

			}

			// projet.g:46:53: ( parmod )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==43) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// projet.g:46:53: parmod
					{
					pushFollow(FOLLOW_parmod_in_decproc451);
					parmod();
					state._fsp--;

					}
					break;

			}

			// projet.g:46:61: ( consts )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==28) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// projet.g:46:61: consts
					{
					pushFollow(FOLLOW_consts_in_decproc454);
					consts();
					state._fsp--;

					}
					break;

			}

			// projet.g:46:69: ( vars )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==53) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// projet.g:46:69: vars
					{
					pushFollow(FOLLOW_vars_in_decproc457);
					vars();
					state._fsp--;

					}
					break;

			}

			 PtGen.pt(204); 
			pushFollow(FOLLOW_corps_in_decproc462);
			corps();
			state._fsp--;

			 PtGen.pt(208); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "decproc"



	// $ANTLR start "ptvg"
	// projet.g:47:1: ptvg : ( ';' |);
	public final void ptvg() throws RecognitionException {
		try {
			// projet.g:47:10: ( ';' |)
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==17) ) {
				alt22=1;
			}
			else if ( (LA22_0==EOF||LA22_0==ID||LA22_0==26||(LA22_0 >= 28 && LA22_0 <= 29)||LA22_0==33||LA22_0==47||LA22_0==49||LA22_0==53) ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// projet.g:47:12: ';'
					{
					match(input,17,FOLLOW_17_in_ptvg475); 
					}
					break;
				case 2 :
					// projet.g:47:17: 
					{
					}
					break;

			}
		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ptvg"



	// $ANTLR start "parfixe"
	// projet.g:48:1: parfixe : 'fixe' '(' pf ( ';' pf )* ')' ;
	public final void parfixe() throws RecognitionException {
		try {
			// projet.g:48:10: ( 'fixe' '(' pf ( ';' pf )* ')' )
			// projet.g:48:12: 'fixe' '(' pf ( ';' pf )* ')'
			{
			match(input,40,FOLLOW_40_in_parfixe485); 
			match(input,9,FOLLOW_9_in_parfixe487); 
			pushFollow(FOLLOW_pf_in_parfixe489);
			pf();
			state._fsp--;

			// projet.g:48:26: ( ';' pf )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==17) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// projet.g:48:28: ';' pf
					{
					match(input,17,FOLLOW_17_in_parfixe493); 
					pushFollow(FOLLOW_pf_in_parfixe495);
					pf();
					state._fsp--;

					}
					break;

				default :
					break loop23;
				}
			}

			match(input,10,FOLLOW_10_in_parfixe499); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parfixe"



	// $ANTLR start "pf"
	// projet.g:49:1: pf : type ident ( ',' ident )* ;
	public final void pf() throws RecognitionException {
		try {
			// projet.g:49:10: ( type ident ( ',' ident )* )
			// projet.g:49:12: type ident ( ',' ident )*
			{
			pushFollow(FOLLOW_type_in_pf512);
			type();
			state._fsp--;

			pushFollow(FOLLOW_ident_in_pf514);
			ident();
			state._fsp--;

			 PtGen.pt(299); PtGen.pt(206); 
			// projet.g:49:57: ( ',' ident )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==13) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// projet.g:49:59: ',' ident
					{
					match(input,13,FOLLOW_13_in_pf520); 
					pushFollow(FOLLOW_ident_in_pf522);
					ident();
					state._fsp--;

					 PtGen.pt(299); PtGen.pt(206); 
					}
					break;

				default :
					break loop24;
				}
			}

			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "pf"



	// $ANTLR start "parmod"
	// projet.g:50:1: parmod : 'mod' '(' pm ( ';' pm )* ')' ;
	public final void parmod() throws RecognitionException {
		try {
			// projet.g:50:10: ( 'mod' '(' pm ( ';' pm )* ')' )
			// projet.g:50:12: 'mod' '(' pm ( ';' pm )* ')'
			{
			match(input,43,FOLLOW_43_in_parmod536); 
			match(input,9,FOLLOW_9_in_parmod538); 
			pushFollow(FOLLOW_pm_in_parmod540);
			pm();
			state._fsp--;

			// projet.g:50:25: ( ';' pm )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==17) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// projet.g:50:27: ';' pm
					{
					match(input,17,FOLLOW_17_in_parmod544); 
					pushFollow(FOLLOW_pm_in_parmod546);
					pm();
					state._fsp--;

					}
					break;

				default :
					break loop25;
				}
			}

			match(input,10,FOLLOW_10_in_parmod550); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parmod"



	// $ANTLR start "pm"
	// projet.g:51:1: pm : type ident ( ',' ident )* ;
	public final void pm() throws RecognitionException {
		try {
			// projet.g:51:10: ( type ident ( ',' ident )* )
			// projet.g:51:12: type ident ( ',' ident )*
			{
			pushFollow(FOLLOW_type_in_pm563);
			type();
			state._fsp--;

			pushFollow(FOLLOW_ident_in_pm565);
			ident();
			state._fsp--;

			 PtGen.pt(299); PtGen.pt(207); 
			// projet.g:51:57: ( ',' ident )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==13) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// projet.g:51:59: ',' ident
					{
					match(input,13,FOLLOW_13_in_pm571); 
					pushFollow(FOLLOW_ident_in_pm573);
					ident();
					state._fsp--;

					 PtGen.pt(299); PtGen.pt(207); 
					}
					break;

				default :
					break loop26;
				}
			}

			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "pm"



	// $ANTLR start "corps"
	// projet.g:53:1: corps : 'debut' instructions 'fin' ;
	public final void corps() throws RecognitionException {
		try {
			// projet.g:53:14: ( 'debut' instructions 'fin' )
			// projet.g:53:16: 'debut' instructions 'fin'
			{
			match(input,29,FOLLOW_29_in_corps593); 
			pushFollow(FOLLOW_instructions_in_corps595);
			instructions();
			state._fsp--;

			match(input,39,FOLLOW_39_in_corps597); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "corps"



	// $ANTLR start "instructions"
	// projet.g:54:1: instructions : instruction ( ';' instruction )* ;
	public final void instructions() throws RecognitionException {
		try {
			// projet.g:54:14: ( instruction ( ';' instruction )* )
			// projet.g:54:16: instruction ( ';' instruction )*
			{
			pushFollow(FOLLOW_instruction_in_instructions604);
			instruction();
			state._fsp--;

			// projet.g:54:28: ( ';' instruction )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==17) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// projet.g:54:30: ';' instruction
					{
					match(input,17,FOLLOW_17_in_instructions608); 
					pushFollow(FOLLOW_instruction_in_instructions610);
					instruction();
					state._fsp--;

					}
					break;

				default :
					break loop27;
				}
			}

			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "instructions"



	// $ANTLR start "instruction"
	// projet.g:55:1: instruction : ( inssi | inscond | boucle | lecture | ecriture | affouappel |);
	public final void instruction() throws RecognitionException {
		try {
			// projet.g:55:14: ( inssi | inscond | boucle | lecture | ecriture | affouappel |)
			int alt28=7;
			switch ( input.LA(1) ) {
			case 50:
				{
				alt28=1;
				}
				break;
			case 27:
				{
				alt28=2;
				}
				break;
			case 52:
				{
				alt28=3;
				}
				break;
			case 42:
				{
				alt28=4;
				}
				break;
			case 32:
				{
				alt28=5;
				}
				break;
			case ID:
				{
				alt28=6;
				}
				break;
			case 13:
			case 17:
			case 25:
			case 36:
			case 38:
			case 39:
			case 41:
			case 51:
				{
				alt28=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}
			switch (alt28) {
				case 1 :
					// projet.g:55:16: inssi
					{
					pushFollow(FOLLOW_inssi_in_instruction620);
					inssi();
					state._fsp--;

					}
					break;
				case 2 :
					// projet.g:55:24: inscond
					{
					pushFollow(FOLLOW_inscond_in_instruction624);
					inscond();
					state._fsp--;

					}
					break;
				case 3 :
					// projet.g:55:34: boucle
					{
					pushFollow(FOLLOW_boucle_in_instruction628);
					boucle();
					state._fsp--;

					}
					break;
				case 4 :
					// projet.g:55:43: lecture
					{
					pushFollow(FOLLOW_lecture_in_instruction632);
					lecture();
					state._fsp--;

					}
					break;
				case 5 :
					// projet.g:55:53: ecriture
					{
					pushFollow(FOLLOW_ecriture_in_instruction636);
					ecriture();
					state._fsp--;

					}
					break;
				case 6 :
					// projet.g:55:64: affouappel
					{
					pushFollow(FOLLOW_affouappel_in_instruction640);
					affouappel();
					state._fsp--;

					}
					break;
				case 7 :
					// projet.g:55:77: 
					{
					}
					break;

			}
		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "instruction"



	// $ANTLR start "inssi"
	// projet.g:56:1: inssi : 'si' expression 'alors' instructions ( 'sinon' instructions )? 'fsi' ;
	public final void inssi() throws RecognitionException {
		try {
			// projet.g:56:14: ( 'si' expression 'alors' instructions ( 'sinon' instructions )? 'fsi' )
			// projet.g:56:16: 'si' expression 'alors' instructions ( 'sinon' instructions )? 'fsi'
			{
			match(input,50,FOLLOW_50_in_inssi657); 
			pushFollow(FOLLOW_expression_in_inssi659);
			expression();
			state._fsp--;

			 PtGen.pt(6); PtGen.pt(307); PtGen.pt(304); 
			match(input,24,FOLLOW_24_in_inssi678); 
			pushFollow(FOLLOW_instructions_in_inssi680);
			instructions();
			state._fsp--;

			// projet.g:57:37: ( 'sinon' instructions )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==51) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// projet.g:57:38: 'sinon' instructions
					{
					match(input,51,FOLLOW_51_in_inssi683); 
					 PtGen.pt(308); PtGen.pt(305); PtGen.pt(304); 
					pushFollow(FOLLOW_instructions_in_inssi687);
					instructions();
					state._fsp--;

					}
					break;

			}

			match(input,41,FOLLOW_41_in_inssi706); 
			 PtGen.pt(305); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "inssi"



	// $ANTLR start "inscond"
	// projet.g:59:1: inscond : 'cond' expression ':' instructions ( ',' expression ':' instructions )* ( 'aut' instructions )? 'fcond' ;
	public final void inscond() throws RecognitionException {
		try {
			// projet.g:59:14: ( 'cond' expression ':' instructions ( ',' expression ':' instructions )* ( 'aut' instructions )? 'fcond' )
			// projet.g:59:16: 'cond' expression ':' instructions ( ',' expression ':' instructions )* ( 'aut' instructions )? 'fcond'
			{
			match(input,27,FOLLOW_27_in_inscond720); 
			pushFollow(FOLLOW_expression_in_inscond722);
			expression();
			state._fsp--;

			 PtGen.pt(6); PtGen.pt(307); PtGen.pt(304); 
			match(input,15,FOLLOW_15_in_inscond726); 
			pushFollow(FOLLOW_instructions_in_inscond750);
			instructions();
			state._fsp--;

			 PtGen.pt(306); PtGen.pt(308); PtGen.pt(304); 
			// projet.g:61:16: ( ',' expression ':' instructions )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==13) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// projet.g:61:18: ',' expression ':' instructions
					{
					match(input,13,FOLLOW_13_in_inscond771); 
					pushFollow(FOLLOW_expression_in_inscond774);
					expression();
					state._fsp--;

					 PtGen.pt(6); PtGen.pt(307); PtGen.pt(304); 
					match(input,15,FOLLOW_15_in_inscond778); 
					pushFollow(FOLLOW_instructions_in_inscond802);
					instructions();
					state._fsp--;

					 PtGen.pt(306); PtGen.pt(309); PtGen.pt(304); 
					}
					break;

				default :
					break loop30;
				}
			}

			// projet.g:63:16: ( 'aut' instructions )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==25) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// projet.g:63:17: 'aut' instructions
					{
					match(input,25,FOLLOW_25_in_inscond826); 
					pushFollow(FOLLOW_instructions_in_inscond828);
					instructions();
					state._fsp--;

					}
					break;

			}

			 PtGen.pt(310); 
			match(input,38,FOLLOW_38_in_inscond834); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "inscond"



	// $ANTLR start "boucle"
	// projet.g:64:1: boucle : 'ttq' expression 'faire' instructions 'fait' ;
	public final void boucle() throws RecognitionException {
		try {
			// projet.g:64:14: ( 'ttq' expression 'faire' instructions 'fait' )
			// projet.g:64:16: 'ttq' expression 'faire' instructions 'fait'
			{
			match(input,52,FOLLOW_52_in_boucle847); 
			 PtGen.pt(304); 
			pushFollow(FOLLOW_expression_in_boucle851);
			expression();
			state._fsp--;

			 PtGen.pt(6); PtGen.pt(307); PtGen.pt(304); 
			match(input,35,FOLLOW_35_in_boucle870); 
			pushFollow(FOLLOW_instructions_in_boucle872);
			instructions();
			state._fsp--;

			 PtGen.pt(306); PtGen.pt(311); 
			match(input,36,FOLLOW_36_in_boucle876); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "boucle"



	// $ANTLR start "lecture"
	// projet.g:66:1: lecture : 'lire' '(' ident ( ',' ident )* ')' ;
	public final void lecture() throws RecognitionException {
		try {
			// projet.g:66:14: ( 'lire' '(' ident ( ',' ident )* ')' )
			// projet.g:66:16: 'lire' '(' ident ( ',' ident )* ')'
			{
			match(input,42,FOLLOW_42_in_lecture888); 
			match(input,9,FOLLOW_9_in_lecture890); 
			pushFollow(FOLLOW_ident_in_lecture892);
			ident();
			state._fsp--;

			 PtGen.pt(1); PtGen.pt(399); PtGen.pt(300); PtGen.pt(303); 
			// projet.g:67:21: ( ',' ident )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==13) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// projet.g:67:23: ',' ident
					{
					match(input,13,FOLLOW_13_in_lecture918); 
					pushFollow(FOLLOW_ident_in_lecture920);
					ident();
					state._fsp--;

					 PtGen.pt(1); PtGen.pt(399); PtGen.pt(300); PtGen.pt(303); 
					}
					break;

				default :
					break loop32;
				}
			}

			match(input,10,FOLLOW_10_in_lecture927); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "lecture"



	// $ANTLR start "ecriture"
	// projet.g:68:1: ecriture : 'ecrire' '(' expression ( ',' expression )* ')' ;
	public final void ecriture() throws RecognitionException {
		try {
			// projet.g:68:14: ( 'ecrire' '(' expression ( ',' expression )* ')' )
			// projet.g:68:16: 'ecrire' '(' expression ( ',' expression )* ')'
			{
			match(input,32,FOLLOW_32_in_ecriture938); 
			match(input,9,FOLLOW_9_in_ecriture940); 
			pushFollow(FOLLOW_expression_in_ecriture942);
			expression();
			state._fsp--;

			 PtGen.pt(301); 
			// projet.g:69:23: ( ',' expression )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==13) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// projet.g:69:25: ',' expression
					{
					match(input,13,FOLLOW_13_in_ecriture970); 
					pushFollow(FOLLOW_expression_in_ecriture972);
					expression();
					state._fsp--;

					 PtGen.pt(301); 
					}
					break;

				default :
					break loop33;
				}
			}

			match(input,10,FOLLOW_10_in_ecriture979); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ecriture"



	// $ANTLR start "affouappel"
	// projet.g:70:1: affouappel : ident ( ':=' expression | ( effixes ( effmods )? )? ) ;
	public final void affouappel() throws RecognitionException {
		try {
			// projet.g:70:14: ( ident ( ':=' expression | ( effixes ( effmods )? )? ) )
			// projet.g:70:16: ident ( ':=' expression | ( effixes ( effmods )? )? )
			{
			pushFollow(FOLLOW_ident_in_affouappel988);
			ident();
			state._fsp--;

			 PtGen.pt(1); 
			// projet.g:70:39: ( ':=' expression | ( effixes ( effmods )? )? )
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==16) ) {
				alt36=1;
			}
			else if ( (LA36_0==9||LA36_0==13||LA36_0==17||LA36_0==25||LA36_0==36||(LA36_0 >= 38 && LA36_0 <= 39)||LA36_0==41||LA36_0==51) ) {
				alt36=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 36, 0, input);
				throw nvae;
			}

			switch (alt36) {
				case 1 :
					// projet.g:70:41: ':=' expression
					{
					match(input,16,FOLLOW_16_in_affouappel994); 
					 PtGen.pt(399); PtGen.pt(302); 
					pushFollow(FOLLOW_expression_in_affouappel998);
					expression();
					state._fsp--;

					 PtGen.pt(303); 
					}
					break;
				case 2 :
					// projet.g:71:25: ( effixes ( effmods )? )?
					{
					 PtGen.pt(312); 
					// projet.g:71:44: ( effixes ( effmods )? )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==9) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// projet.g:71:45: effixes ( effmods )?
							{
							pushFollow(FOLLOW_effixes_in_affouappel1029);
							effixes();
							state._fsp--;

							// projet.g:71:53: ( effmods )?
							int alt34=2;
							int LA34_0 = input.LA(1);
							if ( (LA34_0==9) ) {
								alt34=1;
							}
							switch (alt34) {
								case 1 :
									// projet.g:71:54: effmods
									{
									pushFollow(FOLLOW_effmods_in_affouappel1032);
									effmods();
									state._fsp--;

									}
									break;

							}

							}
							break;

					}

					 PtGen.pt(315); 
					}
					break;

			}

			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "affouappel"



	// $ANTLR start "effixes"
	// projet.g:72:1: effixes : '(' ( expression ( ',' expression )* )? ')' ;
	public final void effixes() throws RecognitionException {
		try {
			// projet.g:72:14: ( '(' ( expression ( ',' expression )* )? ')' )
			// projet.g:72:16: '(' ( expression ( ',' expression )* )? ')'
			{
			match(input,9,FOLLOW_9_in_effixes1052); 
			// projet.g:72:20: ( expression ( ',' expression )* )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( ((LA38_0 >= ID && LA38_0 <= INT)||LA38_0==9||LA38_0==12||LA38_0==14||LA38_0==37||LA38_0==45||LA38_0==54) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// projet.g:72:21: expression ( ',' expression )*
					{
					pushFollow(FOLLOW_expression_in_effixes1055);
					expression();
					state._fsp--;

					 PtGen.pt(313); 
					// projet.g:72:51: ( ',' expression )*
					loop37:
					while (true) {
						int alt37=2;
						int LA37_0 = input.LA(1);
						if ( (LA37_0==13) ) {
							alt37=1;
						}

						switch (alt37) {
						case 1 :
							// projet.g:72:52: ',' expression
							{
							match(input,13,FOLLOW_13_in_effixes1060); 
							pushFollow(FOLLOW_expression_in_effixes1062);
							expression();
							state._fsp--;

							 PtGen.pt(313); 
							}
							break;

						default :
							break loop37;
						}
					}

					}
					break;

			}

			match(input,10,FOLLOW_10_in_effixes1071); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "effixes"



	// $ANTLR start "effmods"
	// projet.g:73:1: effmods : '(' ( ident ( ',' ident )* )? ')' ;
	public final void effmods() throws RecognitionException {
		try {
			// projet.g:73:14: ( '(' ( ident ( ',' ident )* )? ')' )
			// projet.g:73:15: '(' ( ident ( ',' ident )* )? ')'
			{
			match(input,9,FOLLOW_9_in_effmods1082); 
			// projet.g:73:19: ( ident ( ',' ident )* )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==ID) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// projet.g:73:20: ident ( ',' ident )*
					{
					pushFollow(FOLLOW_ident_in_effmods1085);
					ident();
					state._fsp--;

					 PtGen.pt(1); PtGen.pt(399); PtGen.pt(314); 
					// projet.g:74:15: ( ',' ident )*
					loop39:
					while (true) {
						int alt39=2;
						int LA39_0 = input.LA(1);
						if ( (LA39_0==13) ) {
							alt39=1;
						}

						switch (alt39) {
						case 1 :
							// projet.g:74:16: ',' ident
							{
							match(input,13,FOLLOW_13_in_effmods1104); 
							pushFollow(FOLLOW_ident_in_effmods1106);
							ident();
							state._fsp--;

							 PtGen.pt(1); PtGen.pt(399); PtGen.pt(314); 
							}
							break;

						default :
							break loop39;
						}
					}

					}
					break;

			}

			match(input,10,FOLLOW_10_in_effmods1115); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "effmods"



	// $ANTLR start "expression"
	// projet.g:76:1: expression : ( exp1 ) ( 'ou' exp1 )* ;
	public final void expression() throws RecognitionException {
		try {
			// projet.g:76:12: ( ( exp1 ) ( 'ou' exp1 )* )
			// projet.g:76:14: ( exp1 ) ( 'ou' exp1 )*
			{
			// projet.g:76:14: ( exp1 )
			// projet.g:76:15: exp1
			{
			pushFollow(FOLLOW_exp1_in_expression1125);
			exp1();
			state._fsp--;

			}

			// projet.g:76:21: ( 'ou' exp1 )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==46) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// projet.g:76:22: 'ou' exp1
					{
					 PtGen.pt(6); 
					match(input,46,FOLLOW_46_in_expression1131); 
					pushFollow(FOLLOW_exp1_in_expression1133);
					exp1();
					state._fsp--;

					 PtGen.pt(6); PtGen.pt(117); 
					}
					break;

				default :
					break loop41;
				}
			}

			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "expression"



	// $ANTLR start "exp1"
	// projet.g:77:1: exp1 : exp2 ( 'et' exp2 )* ;
	public final void exp1() throws RecognitionException {
		try {
			// projet.g:77:12: ( exp2 ( 'et' exp2 )* )
			// projet.g:77:14: exp2 ( 'et' exp2 )*
			{
			pushFollow(FOLLOW_exp2_in_exp11151);
			exp2();
			state._fsp--;

			// projet.g:77:19: ( 'et' exp2 )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==34) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// projet.g:77:20: 'et' exp2
					{
					 PtGen.pt(6); 
					match(input,34,FOLLOW_34_in_exp11156); 
					pushFollow(FOLLOW_exp2_in_exp11158);
					exp2();
					state._fsp--;

					 PtGen.pt(6); PtGen.pt(118); 
					}
					break;

				default :
					break loop42;
				}
			}

			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "exp1"



	// $ANTLR start "exp2"
	// projet.g:78:1: exp2 : ( 'non' exp2 | exp3 );
	public final void exp2() throws RecognitionException {
		try {
			// projet.g:78:12: ( 'non' exp2 | exp3 )
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==45) ) {
				alt43=1;
			}
			else if ( ((LA43_0 >= ID && LA43_0 <= INT)||LA43_0==9||LA43_0==12||LA43_0==14||LA43_0==37||LA43_0==54) ) {
				alt43=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 43, 0, input);
				throw nvae;
			}

			switch (alt43) {
				case 1 :
					// projet.g:78:14: 'non' exp2
					{
					match(input,45,FOLLOW_45_in_exp21176); 
					pushFollow(FOLLOW_exp2_in_exp21178);
					exp2();
					state._fsp--;

					 PtGen.pt(6); PtGen.pt(116); 
					}
					break;
				case 2 :
					// projet.g:79:14: exp3
					{
					pushFollow(FOLLOW_exp3_in_exp21195);
					exp3();
					state._fsp--;

					}
					break;

			}
		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "exp2"



	// $ANTLR start "exp3"
	// projet.g:80:1: exp3 : exp4 ( '=' exp4 | '<>' exp4 | '>' exp4 | '>=' exp4 | '<' exp4 | '<=' exp4 )? ;
	public final void exp3() throws RecognitionException {
		try {
			// projet.g:80:12: ( exp4 ( '=' exp4 | '<>' exp4 | '>' exp4 | '>=' exp4 | '<' exp4 | '<=' exp4 )? )
			// projet.g:80:14: exp4 ( '=' exp4 | '<>' exp4 | '>' exp4 | '>=' exp4 | '<' exp4 | '<=' exp4 )?
			{
			pushFollow(FOLLOW_exp4_in_exp31208);
			exp4();
			state._fsp--;

			// projet.g:80:19: ( '=' exp4 | '<>' exp4 | '>' exp4 | '>=' exp4 | '<' exp4 | '<=' exp4 )?
			int alt44=7;
			switch ( input.LA(1) ) {
				case 21:
					{
					alt44=1;
					}
					break;
				case 20:
					{
					alt44=2;
					}
					break;
				case 22:
					{
					alt44=3;
					}
					break;
				case 23:
					{
					alt44=4;
					}
					break;
				case 18:
					{
					alt44=5;
					}
					break;
				case 19:
					{
					alt44=6;
					}
					break;
			}
			switch (alt44) {
				case 1 :
					// projet.g:80:20: '=' exp4
					{
					 PtGen.pt(4); 
					match(input,21,FOLLOW_21_in_exp31213); 
					pushFollow(FOLLOW_exp4_in_exp31216);
					exp4();
					state._fsp--;

					 PtGen.pt(4); PtGen.pt(3); PtGen.pt(114); 
					}
					break;
				case 2 :
					// projet.g:81:20: '<>' exp4
					{
					 PtGen.pt(4); 
					match(input,20,FOLLOW_20_in_exp31241); 
					pushFollow(FOLLOW_exp4_in_exp31243);
					exp4();
					state._fsp--;

					 PtGen.pt(4); PtGen.pt(3); PtGen.pt(115); 
					}
					break;
				case 3 :
					// projet.g:82:20: '>' exp4
					{
					 PtGen.pt(4); 
					match(input,22,FOLLOW_22_in_exp31268); 
					pushFollow(FOLLOW_exp4_in_exp31271);
					exp4();
					state._fsp--;

					 PtGen.pt(4); PtGen.pt(3); PtGen.pt(112); 
					}
					break;
				case 4 :
					// projet.g:83:20: '>=' exp4
					{
					 PtGen.pt(4); 
					match(input,23,FOLLOW_23_in_exp31296); 
					pushFollow(FOLLOW_exp4_in_exp31298);
					exp4();
					state._fsp--;

					 PtGen.pt(4); PtGen.pt(3); PtGen.pt(113); 
					}
					break;
				case 5 :
					// projet.g:84:20: '<' exp4
					{
					 PtGen.pt(4); 
					match(input,18,FOLLOW_18_in_exp31323); 
					pushFollow(FOLLOW_exp4_in_exp31326);
					exp4();
					state._fsp--;

					 PtGen.pt(4); PtGen.pt(3); PtGen.pt(110); 
					}
					break;
				case 6 :
					// projet.g:85:20: '<=' exp4
					{
					 PtGen.pt(4); 
					match(input,19,FOLLOW_19_in_exp31351); 
					pushFollow(FOLLOW_exp4_in_exp31353);
					exp4();
					state._fsp--;

					 PtGen.pt(4); PtGen.pt(3); PtGen.pt(111); 
					}
					break;

			}

			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "exp3"



	// $ANTLR start "exp4"
	// projet.g:86:1: exp4 : exp5 ( '+' exp5 | '-' exp5 )* ;
	public final void exp4() throws RecognitionException {
		try {
			// projet.g:86:12: ( exp5 ( '+' exp5 | '-' exp5 )* )
			// projet.g:86:14: exp5 ( '+' exp5 | '-' exp5 )*
			{
			pushFollow(FOLLOW_exp5_in_exp41371);
			exp5();
			state._fsp--;

			// projet.g:86:19: ( '+' exp5 | '-' exp5 )*
			loop45:
			while (true) {
				int alt45=3;
				int LA45_0 = input.LA(1);
				if ( (LA45_0==12) ) {
					alt45=1;
				}
				else if ( (LA45_0==14) ) {
					alt45=2;
				}

				switch (alt45) {
				case 1 :
					// projet.g:86:20: '+' exp5
					{
					 PtGen.pt(4); 
					match(input,12,FOLLOW_12_in_exp41376); 
					pushFollow(FOLLOW_exp5_in_exp41379);
					exp5();
					state._fsp--;

					 PtGen.pt(4); PtGen.pt(108); 
					}
					break;
				case 2 :
					// projet.g:87:20: '-' exp5
					{
					 PtGen.pt(4); 
					match(input,14,FOLLOW_14_in_exp41404); 
					pushFollow(FOLLOW_exp5_in_exp41407);
					exp5();
					state._fsp--;

					 PtGen.pt(4); PtGen.pt(109); 
					}
					break;

				default :
					break loop45;
				}
			}

			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "exp4"



	// $ANTLR start "exp5"
	// projet.g:88:1: exp5 : primaire ( '*' primaire | 'div' primaire )* ;
	public final void exp5() throws RecognitionException {
		try {
			// projet.g:88:12: ( primaire ( '*' primaire | 'div' primaire )* )
			// projet.g:88:14: primaire ( '*' primaire | 'div' primaire )*
			{
			pushFollow(FOLLOW_primaire_in_exp51425);
			primaire();
			state._fsp--;

			// projet.g:88:23: ( '*' primaire | 'div' primaire )*
			loop46:
			while (true) {
				int alt46=3;
				int LA46_0 = input.LA(1);
				if ( (LA46_0==11) ) {
					alt46=1;
				}
				else if ( (LA46_0==31) ) {
					alt46=2;
				}

				switch (alt46) {
				case 1 :
					// projet.g:88:24: '*' primaire
					{
					 PtGen.pt(4); 
					match(input,11,FOLLOW_11_in_exp51430); 
					pushFollow(FOLLOW_primaire_in_exp51432);
					primaire();
					state._fsp--;

					 PtGen.pt(4); PtGen.pt(106); 
					}
					break;
				case 2 :
					// projet.g:89:24: 'div' primaire
					{
					 PtGen.pt(4); 
					match(input,31,FOLLOW_31_in_exp51461); 
					pushFollow(FOLLOW_primaire_in_exp51463);
					primaire();
					state._fsp--;

					 PtGen.pt(4);  PtGen.pt(107); 
					}
					break;

				default :
					break loop46;
				}
			}

			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "exp5"



	// $ANTLR start "primaire"
	// projet.g:90:1: primaire : ( valeur | ident | '(' expression ')' );
	public final void primaire() throws RecognitionException {
		try {
			// projet.g:90:12: ( valeur | ident | '(' expression ')' )
			int alt47=3;
			switch ( input.LA(1) ) {
			case INT:
			case 12:
			case 14:
			case 37:
			case 54:
				{
				alt47=1;
				}
				break;
			case ID:
				{
				alt47=2;
				}
				break;
			case 9:
				{
				alt47=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}
			switch (alt47) {
				case 1 :
					// projet.g:90:14: valeur
					{
					pushFollow(FOLLOW_valeur_in_primaire1477);
					valeur();
					state._fsp--;

					 PtGen.pt(104); 
					}
					break;
				case 2 :
					// projet.g:91:14: ident
					{
					pushFollow(FOLLOW_ident_in_primaire1494);
					ident();
					state._fsp--;

					 PtGen.pt(1); PtGen.pt(105); 
					}
					break;
				case 3 :
					// projet.g:92:14: '(' expression ')'
					{
					match(input,9,FOLLOW_9_in_primaire1511); 
					pushFollow(FOLLOW_expression_in_primaire1513);
					expression();
					state._fsp--;

					match(input,10,FOLLOW_10_in_primaire1515); 
					}
					break;

			}
		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "primaire"



	// $ANTLR start "valeur"
	// projet.g:93:1: valeur : ( nbentier | '+' nbentier | '-' nbentier | 'vrai' | 'faux' );
	public final void valeur() throws RecognitionException {
		try {
			// projet.g:93:12: ( nbentier | '+' nbentier | '-' nbentier | 'vrai' | 'faux' )
			int alt48=5;
			switch ( input.LA(1) ) {
			case INT:
				{
				alt48=1;
				}
				break;
			case 12:
				{
				alt48=2;
				}
				break;
			case 14:
				{
				alt48=3;
				}
				break;
			case 54:
				{
				alt48=4;
				}
				break;
			case 37:
				{
				alt48=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}
			switch (alt48) {
				case 1 :
					// projet.g:93:14: nbentier
					{
					pushFollow(FOLLOW_nbentier_in_valeur1526);
					nbentier();
					state._fsp--;

					 PtGen.pt(2); PtGen.pt(101); 
					}
					break;
				case 2 :
					// projet.g:94:14: '+' nbentier
					{
					match(input,12,FOLLOW_12_in_valeur1543); 
					pushFollow(FOLLOW_nbentier_in_valeur1545);
					nbentier();
					state._fsp--;

					 PtGen.pt(2); PtGen.pt(101); 
					}
					break;
				case 3 :
					// projet.g:95:14: '-' nbentier
					{
					match(input,14,FOLLOW_14_in_valeur1562); 
					 PtGen.pt(100); 
					pushFollow(FOLLOW_nbentier_in_valeur1566);
					nbentier();
					state._fsp--;

					 PtGen.pt(2); PtGen.pt(101); 
					}
					break;
				case 4 :
					// projet.g:96:14: 'vrai'
					{
					match(input,54,FOLLOW_54_in_valeur1583); 
					 PtGen.pt(3); PtGen.pt(102); 
					}
					break;
				case 5 :
					// projet.g:97:14: 'faux'
					{
					match(input,37,FOLLOW_37_in_valeur1600); 
					 PtGen.pt(3); PtGen.pt(103); 
					}
					break;

			}
		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "valeur"



	// $ANTLR start "nbentier"
	// projet.g:106:1: nbentier : INT ;
	public final void nbentier() throws RecognitionException {
		Token INT1=null;

		try {
			// projet.g:106:11: ( INT )
			// projet.g:106:15: INT
			{
			INT1=(Token)match(input,INT,FOLLOW_INT_in_nbentier1627); 
			 UtilLex.valNb = Integer.parseInt((INT1!=null?INT1.getText():null));
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "nbentier"



	// $ANTLR start "ident"
	// projet.g:108:1: ident : ID ;
	public final void ident() throws RecognitionException {
		Token ID2=null;

		try {
			// projet.g:108:7: ( ID )
			// projet.g:108:9: ID
			{
			ID2=(Token)match(input,ID,FOLLOW_ID_in_ident1638); 
			 UtilLex.traiterId((ID2!=null?ID2.getText():null), (ID2!=null?ID2.getLine():0)); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ident"

	// Delegated rules



	public static final BitSet FOLLOW_unitprog_in_unite62 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_unite64 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unitmodule_in_unite68 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_unite70 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_unitprog82 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_unitprog86 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_unitprog88 = new BitSet(new long[]{0x0022800070000000L});
	public static final BitSet FOLLOW_declarations_in_unitprog90 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_corps_in_unitprog92 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_unitmodule99 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_unitmodule103 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_unitmodule105 = new BitSet(new long[]{0x0022800050000000L});
	public static final BitSet FOLLOW_declarations_in_unitmodule107 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_partiedef_in_declarations117 = new BitSet(new long[]{0x0022800010000002L});
	public static final BitSet FOLLOW_partieref_in_declarations120 = new BitSet(new long[]{0x0020800010000002L});
	public static final BitSet FOLLOW_consts_in_declarations123 = new BitSet(new long[]{0x0020800000000002L});
	public static final BitSet FOLLOW_vars_in_declarations126 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_decprocs_in_declarations129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_partiedef140 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_partiedef142 = new BitSet(new long[]{0x0000000000022000L});
	public static final BitSet FOLLOW_13_in_partiedef147 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_partiedef149 = new BitSet(new long[]{0x0000000000022000L});
	public static final BitSet FOLLOW_ptvg_in_partiedef156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_partieref166 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_specif_in_partieref168 = new BitSet(new long[]{0x0000000000022000L});
	public static final BitSet FOLLOW_13_in_partieref171 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_specif_in_partieref173 = new BitSet(new long[]{0x0000000000022000L});
	public static final BitSet FOLLOW_ptvg_in_partieref177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_specif190 = new BitSet(new long[]{0x0000090000000002L});
	public static final BitSet FOLLOW_40_in_specif217 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_specif219 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_type_in_specif221 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_13_in_specif227 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_type_in_specif229 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_10_in_specif236 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_43_in_specif265 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_specif268 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_type_in_specif270 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_13_in_specif276 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_type_in_specif278 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_10_in_specif285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_consts303 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_consts307 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_consts311 = new BitSet(new long[]{0x0040002000005040L});
	public static final BitSet FOLLOW_valeur_in_consts313 = new BitSet(new long[]{0x0000000000020020L});
	public static final BitSet FOLLOW_ptvg_in_consts317 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_53_in_vars335 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_type_in_vars339 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_vars341 = new BitSet(new long[]{0x0000000204022000L});
	public static final BitSet FOLLOW_13_in_vars368 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_vars371 = new BitSet(new long[]{0x0000000204022000L});
	public static final BitSet FOLLOW_ptvg_in_vars378 = new BitSet(new long[]{0x0000000204000002L});
	public static final BitSet FOLLOW_33_in_type398 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_type404 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decproc_in_decprocs428 = new BitSet(new long[]{0x0000800000020000L});
	public static final BitSet FOLLOW_ptvg_in_decprocs430 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_47_in_decproc442 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_decproc444 = new BitSet(new long[]{0x0020090030000000L});
	public static final BitSet FOLLOW_parfixe_in_decproc448 = new BitSet(new long[]{0x0020080030000000L});
	public static final BitSet FOLLOW_parmod_in_decproc451 = new BitSet(new long[]{0x0020000030000000L});
	public static final BitSet FOLLOW_consts_in_decproc454 = new BitSet(new long[]{0x0020000020000000L});
	public static final BitSet FOLLOW_vars_in_decproc457 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_corps_in_decproc462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_ptvg475 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_parfixe485 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_parfixe487 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_pf_in_parfixe489 = new BitSet(new long[]{0x0000000000020400L});
	public static final BitSet FOLLOW_17_in_parfixe493 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_pf_in_parfixe495 = new BitSet(new long[]{0x0000000000020400L});
	public static final BitSet FOLLOW_10_in_parfixe499 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_pf512 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_pf514 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_13_in_pf520 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_pf522 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_43_in_parmod536 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_parmod538 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_pm_in_parmod540 = new BitSet(new long[]{0x0000000000020400L});
	public static final BitSet FOLLOW_17_in_parmod544 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_pm_in_parmod546 = new BitSet(new long[]{0x0000000000020400L});
	public static final BitSet FOLLOW_10_in_parmod550 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_pm563 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_pm565 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_13_in_pm571 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_pm573 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_29_in_corps593 = new BitSet(new long[]{0x0014040108020020L});
	public static final BitSet FOLLOW_instructions_in_corps595 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_corps597 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructions604 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_instructions608 = new BitSet(new long[]{0x0014040108020020L});
	public static final BitSet FOLLOW_instruction_in_instructions610 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_inssi_in_instruction620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inscond_in_instruction624 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boucle_in_instruction628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lecture_in_instruction632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ecriture_in_instruction636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_affouappel_in_instruction640 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_inssi657 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_inssi659 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_inssi678 = new BitSet(new long[]{0x0014040108020020L});
	public static final BitSet FOLLOW_instructions_in_inssi680 = new BitSet(new long[]{0x0008020000000000L});
	public static final BitSet FOLLOW_51_in_inssi683 = new BitSet(new long[]{0x0014040108020020L});
	public static final BitSet FOLLOW_instructions_in_inssi687 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_inssi706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_inscond720 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_inscond722 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_inscond726 = new BitSet(new long[]{0x0014040108020020L});
	public static final BitSet FOLLOW_instructions_in_inscond750 = new BitSet(new long[]{0x0000004002002000L});
	public static final BitSet FOLLOW_13_in_inscond771 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_inscond774 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_inscond778 = new BitSet(new long[]{0x0014040108020020L});
	public static final BitSet FOLLOW_instructions_in_inscond802 = new BitSet(new long[]{0x0000004002002000L});
	public static final BitSet FOLLOW_25_in_inscond826 = new BitSet(new long[]{0x0014040108020020L});
	public static final BitSet FOLLOW_instructions_in_inscond828 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_inscond834 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_boucle847 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_boucle851 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_boucle870 = new BitSet(new long[]{0x0014040108020020L});
	public static final BitSet FOLLOW_instructions_in_boucle872 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_boucle876 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_lecture888 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_lecture890 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_lecture892 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_13_in_lecture918 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_lecture920 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_10_in_lecture927 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_ecriture938 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_ecriture940 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_ecriture942 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_13_in_ecriture970 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_ecriture972 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_10_in_ecriture979 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_affouappel988 = new BitSet(new long[]{0x0000000000010202L});
	public static final BitSet FOLLOW_16_in_affouappel994 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_affouappel998 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_effixes_in_affouappel1029 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_effmods_in_affouappel1032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_effixes1052 = new BitSet(new long[]{0x0040202000005660L});
	public static final BitSet FOLLOW_expression_in_effixes1055 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_13_in_effixes1060 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_effixes1062 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_10_in_effixes1071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_effmods1082 = new BitSet(new long[]{0x0000000000000420L});
	public static final BitSet FOLLOW_ident_in_effmods1085 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_13_in_effmods1104 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_effmods1106 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_10_in_effmods1115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp1_in_expression1125 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_46_in_expression1131 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_exp1_in_expression1133 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_exp2_in_exp11151 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_34_in_exp11156 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_exp2_in_exp11158 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_45_in_exp21176 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_exp2_in_exp21178 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp3_in_exp21195 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp4_in_exp31208 = new BitSet(new long[]{0x0000000000FC0002L});
	public static final BitSet FOLLOW_21_in_exp31213 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp4_in_exp31216 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_exp31241 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp4_in_exp31243 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_exp31268 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp4_in_exp31271 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_exp31296 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp4_in_exp31298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_exp31323 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp4_in_exp31326 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_exp31351 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp4_in_exp31353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp5_in_exp41371 = new BitSet(new long[]{0x0000000000005002L});
	public static final BitSet FOLLOW_12_in_exp41376 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp5_in_exp41379 = new BitSet(new long[]{0x0000000000005002L});
	public static final BitSet FOLLOW_14_in_exp41404 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp5_in_exp41407 = new BitSet(new long[]{0x0000000000005002L});
	public static final BitSet FOLLOW_primaire_in_exp51425 = new BitSet(new long[]{0x0000000080000802L});
	public static final BitSet FOLLOW_11_in_exp51430 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_primaire_in_exp51432 = new BitSet(new long[]{0x0000000080000802L});
	public static final BitSet FOLLOW_31_in_exp51461 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_primaire_in_exp51463 = new BitSet(new long[]{0x0000000080000802L});
	public static final BitSet FOLLOW_valeur_in_primaire1477 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_primaire1494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_primaire1511 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_primaire1513 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_primaire1515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nbentier_in_valeur1526 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_valeur1543 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_nbentier_in_valeur1545 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_valeur1562 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_nbentier_in_valeur1566 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_valeur1583 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_valeur1600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_nbentier1627 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_ident1638 = new BitSet(new long[]{0x0000000000000002L});
}
