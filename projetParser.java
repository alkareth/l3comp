// $ANTLR 3.5.2 projet.g 2016-02-25 20:32:23
           
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
	// projet.g:29:1: unite : ( unitprog EOF | unitmodule EOF );
	public final void unite() throws RecognitionException {
		try {
			// projet.g:29:12: ( unitprog EOF | unitmodule EOF )
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
					// projet.g:29:14: unitprog EOF
					{
					pushFollow(FOLLOW_unitprog_in_unite61);
					unitprog();
					state._fsp--;

					match(input,EOF,FOLLOW_EOF_in_unite63); 
					}
					break;
				case 2 :
					// projet.g:29:29: unitmodule EOF
					{
					pushFollow(FOLLOW_unitmodule_in_unite67);
					unitmodule();
					state._fsp--;

					match(input,EOF,FOLLOW_EOF_in_unite70); 
					}
					break;

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
			match(input,48,FOLLOW_48_in_unitprog79); 
			pushFollow(FOLLOW_ident_in_unitprog81);
			ident();
			state._fsp--;

			match(input,15,FOLLOW_15_in_unitprog83); 
			pushFollow(FOLLOW_declarations_in_unitprog85);
			declarations();
			state._fsp--;

			pushFollow(FOLLOW_corps_in_unitprog102);
			corps();
			state._fsp--;

			 PtGen.pt(999); System.out.println("succès, arret de la compilation "); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "unitprog"



	// $ANTLR start "unitmodule"
	// projet.g:32:1: unitmodule : 'module' ident ':' declarations ;
	public final void unitmodule() throws RecognitionException {
		try {
			// projet.g:32:12: ( 'module' ident ':' declarations )
			// projet.g:32:14: 'module' ident ':' declarations
			{
			match(input,44,FOLLOW_44_in_unitmodule111); 
			pushFollow(FOLLOW_ident_in_unitmodule113);
			ident();
			state._fsp--;

			match(input,15,FOLLOW_15_in_unitmodule115); 
			pushFollow(FOLLOW_declarations_in_unitmodule117);
			declarations();
			state._fsp--;

			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "unitmodule"



	// $ANTLR start "declarations"
	// projet.g:34:1: declarations : ( partiedef )? ( partieref )? ( consts )? ( vars )? ( decprocs )? ;
	public final void declarations() throws RecognitionException {
		try {
			// projet.g:34:14: ( ( partiedef )? ( partieref )? ( consts )? ( vars )? ( decprocs )? )
			// projet.g:34:16: ( partiedef )? ( partieref )? ( consts )? ( vars )? ( decprocs )?
			{
			// projet.g:34:16: ( partiedef )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==30) ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// projet.g:34:16: partiedef
					{
					pushFollow(FOLLOW_partiedef_in_declarations125);
					partiedef();
					state._fsp--;

					}
					break;

			}

			// projet.g:34:27: ( partieref )?
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==49) ) {
				alt3=1;
			}
			switch (alt3) {
				case 1 :
					// projet.g:34:27: partieref
					{
					pushFollow(FOLLOW_partieref_in_declarations128);
					partieref();
					state._fsp--;

					}
					break;

			}

			// projet.g:34:38: ( consts )?
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==28) ) {
				alt4=1;
			}
			switch (alt4) {
				case 1 :
					// projet.g:34:38: consts
					{
					pushFollow(FOLLOW_consts_in_declarations131);
					consts();
					state._fsp--;

					}
					break;

			}

			// projet.g:34:46: ( vars )?
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==53) ) {
				alt5=1;
			}
			switch (alt5) {
				case 1 :
					// projet.g:34:46: vars
					{
					pushFollow(FOLLOW_vars_in_declarations134);
					vars();
					state._fsp--;

					}
					break;

			}

			// projet.g:34:52: ( decprocs )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==47) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// projet.g:34:52: decprocs
					{
					pushFollow(FOLLOW_decprocs_in_declarations137);
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
	// projet.g:35:1: partiedef : 'def' ident ( ',' ident )* ptvg ;
	public final void partiedef() throws RecognitionException {
		try {
			// projet.g:35:14: ( 'def' ident ( ',' ident )* ptvg )
			// projet.g:35:16: 'def' ident ( ',' ident )* ptvg
			{
			match(input,30,FOLLOW_30_in_partiedef148); 
			pushFollow(FOLLOW_ident_in_partiedef150);
			ident();
			state._fsp--;

			// projet.g:35:29: ( ',' ident )*
			loop7:
			while (true) {
				int alt7=2;
				int LA7_0 = input.LA(1);
				if ( (LA7_0==13) ) {
					alt7=1;
				}

				switch (alt7) {
				case 1 :
					// projet.g:35:30: ',' ident
					{
					match(input,13,FOLLOW_13_in_partiedef154); 
					pushFollow(FOLLOW_ident_in_partiedef156);
					ident();
					state._fsp--;

					}
					break;

				default :
					break loop7;
				}
			}

			pushFollow(FOLLOW_ptvg_in_partiedef161);
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
	// projet.g:36:1: partieref : 'ref' specif ( ',' specif )* ptvg ;
	public final void partieref() throws RecognitionException {
		try {
			// projet.g:36:14: ( 'ref' specif ( ',' specif )* ptvg )
			// projet.g:36:16: 'ref' specif ( ',' specif )* ptvg
			{
			match(input,49,FOLLOW_49_in_partieref171); 
			pushFollow(FOLLOW_specif_in_partieref174);
			specif();
			state._fsp--;

			// projet.g:36:30: ( ',' specif )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==13) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// projet.g:36:31: ',' specif
					{
					match(input,13,FOLLOW_13_in_partieref177); 
					pushFollow(FOLLOW_specif_in_partieref179);
					specif();
					state._fsp--;

					}
					break;

				default :
					break loop8;
				}
			}

			pushFollow(FOLLOW_ptvg_in_partieref183);
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
	// projet.g:37:1: specif : ident ( 'fixe' '(' type ( ',' type )* ')' )? ( 'mod' '(' type ( ',' type )* ')' )? ;
	public final void specif() throws RecognitionException {
		try {
			// projet.g:37:14: ( ident ( 'fixe' '(' type ( ',' type )* ')' )? ( 'mod' '(' type ( ',' type )* ')' )? )
			// projet.g:37:16: ident ( 'fixe' '(' type ( ',' type )* ')' )? ( 'mod' '(' type ( ',' type )* ')' )?
			{
			pushFollow(FOLLOW_ident_in_specif196);
			ident();
			state._fsp--;

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
					match(input,40,FOLLOW_40_in_specif200); 
					match(input,9,FOLLOW_9_in_specif202); 
					pushFollow(FOLLOW_type_in_specif204);
					type();
					state._fsp--;

					// projet.g:37:40: ( ',' type )*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==13) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// projet.g:37:42: ',' type
							{
							match(input,13,FOLLOW_13_in_specif208); 
							pushFollow(FOLLOW_type_in_specif210);
							type();
							state._fsp--;

							}
							break;

						default :
							break loop9;
						}
					}

					match(input,10,FOLLOW_10_in_specif216); 
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
					match(input,43,FOLLOW_43_in_specif245); 
					match(input,9,FOLLOW_9_in_specif248); 
					pushFollow(FOLLOW_type_in_specif250);
					type();
					state._fsp--;

					// projet.g:38:40: ( ',' type )*
					loop11:
					while (true) {
						int alt11=2;
						int LA11_0 = input.LA(1);
						if ( (LA11_0==13) ) {
							alt11=1;
						}

						switch (alt11) {
						case 1 :
							// projet.g:38:42: ',' type
							{
							match(input,13,FOLLOW_13_in_specif254); 
							pushFollow(FOLLOW_type_in_specif256);
							type();
							state._fsp--;

							}
							break;

						default :
							break loop11;
						}
					}

					match(input,10,FOLLOW_10_in_specif262); 
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
	// $ANTLR end "specif"



	// $ANTLR start "consts"
	// projet.g:39:1: consts : 'const' ( ident '=' valeur ptvg )+ ;
	public final void consts() throws RecognitionException {
		try {
			// projet.g:39:14: ( 'const' ( ident '=' valeur ptvg )+ )
			// projet.g:39:16: 'const' ( ident '=' valeur ptvg )+
			{
			match(input,28,FOLLOW_28_in_consts278); 
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
					pushFollow(FOLLOW_ident_in_consts282);
					ident();
					state._fsp--;

					 PtGen.pt(1); 
					match(input,21,FOLLOW_21_in_consts286); 
					pushFollow(FOLLOW_valeur_in_consts288);
					valeur();
					state._fsp--;

					 PtGen.pt(200); 
					pushFollow(FOLLOW_ptvg_in_consts292);
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
			match(input,53,FOLLOW_53_in_vars310); 
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
					pushFollow(FOLLOW_type_in_vars314);
					type();
					state._fsp--;

					pushFollow(FOLLOW_ident_in_vars316);
					ident();
					state._fsp--;

					 PtGen.pt(1); PtGen.pt(201); 
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
							match(input,13,FOLLOW_13_in_vars343); 
							pushFollow(FOLLOW_ident_in_vars346);
							ident();
							state._fsp--;

							 PtGen.pt(1); PtGen.pt(201); 
							}
							break;

						default :
							break loop14;
						}
					}

					pushFollow(FOLLOW_ptvg_in_vars353);
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
					match(input,33,FOLLOW_33_in_type373); 
					 PtGen.pt(2); 
					}
					break;
				case 2 :
					// projet.g:42:41: 'bool'
					{
					match(input,26,FOLLOW_26_in_type379); 
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
			// projet.g:44:12: ( decproc ptvg )+
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
					// projet.g:44:13: decproc ptvg
					{
					pushFollow(FOLLOW_decproc_in_decprocs390);
					decproc();
					state._fsp--;

					pushFollow(FOLLOW_ptvg_in_decprocs392);
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

			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "decprocs"



	// $ANTLR start "decproc"
	// projet.g:45:1: decproc : 'proc' ident ( parfixe )? ( parmod )? ( consts )? ( vars )? corps ;
	public final void decproc() throws RecognitionException {
		try {
			// projet.g:45:10: ( 'proc' ident ( parfixe )? ( parmod )? ( consts )? ( vars )? corps )
			// projet.g:45:12: 'proc' ident ( parfixe )? ( parmod )? ( consts )? ( vars )? corps
			{
			match(input,47,FOLLOW_47_in_decproc402); 
			pushFollow(FOLLOW_ident_in_decproc404);
			ident();
			state._fsp--;

			// projet.g:45:25: ( parfixe )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==40) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// projet.g:45:25: parfixe
					{
					pushFollow(FOLLOW_parfixe_in_decproc406);
					parfixe();
					state._fsp--;

					}
					break;

			}

			// projet.g:45:34: ( parmod )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==43) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// projet.g:45:34: parmod
					{
					pushFollow(FOLLOW_parmod_in_decproc409);
					parmod();
					state._fsp--;

					}
					break;

			}

			// projet.g:45:42: ( consts )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==28) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// projet.g:45:42: consts
					{
					pushFollow(FOLLOW_consts_in_decproc412);
					consts();
					state._fsp--;

					}
					break;

			}

			// projet.g:45:50: ( vars )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==53) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// projet.g:45:50: vars
					{
					pushFollow(FOLLOW_vars_in_decproc415);
					vars();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_corps_in_decproc418);
			corps();
			state._fsp--;

			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "decproc"



	// $ANTLR start "ptvg"
	// projet.g:46:1: ptvg : ( ';' |);
	public final void ptvg() throws RecognitionException {
		try {
			// projet.g:46:10: ( ';' |)
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
					// projet.g:46:12: ';'
					{
					match(input,17,FOLLOW_17_in_ptvg429); 
					}
					break;
				case 2 :
					// projet.g:46:17: 
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
	// projet.g:47:1: parfixe : 'fixe' '(' pf ( ';' pf )* ')' ;
	public final void parfixe() throws RecognitionException {
		try {
			// projet.g:47:10: ( 'fixe' '(' pf ( ';' pf )* ')' )
			// projet.g:47:12: 'fixe' '(' pf ( ';' pf )* ')'
			{
			match(input,40,FOLLOW_40_in_parfixe439); 
			match(input,9,FOLLOW_9_in_parfixe441); 
			pushFollow(FOLLOW_pf_in_parfixe443);
			pf();
			state._fsp--;

			// projet.g:47:26: ( ';' pf )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==17) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// projet.g:47:28: ';' pf
					{
					match(input,17,FOLLOW_17_in_parfixe447); 
					pushFollow(FOLLOW_pf_in_parfixe449);
					pf();
					state._fsp--;

					}
					break;

				default :
					break loop23;
				}
			}

			match(input,10,FOLLOW_10_in_parfixe453); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parfixe"



	// $ANTLR start "pf"
	// projet.g:48:1: pf : type ident ( ',' ident )* ;
	public final void pf() throws RecognitionException {
		try {
			// projet.g:48:10: ( type ident ( ',' ident )* )
			// projet.g:48:12: type ident ( ',' ident )*
			{
			pushFollow(FOLLOW_type_in_pf466);
			type();
			state._fsp--;

			pushFollow(FOLLOW_ident_in_pf468);
			ident();
			state._fsp--;

			// projet.g:48:24: ( ',' ident )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==13) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// projet.g:48:26: ',' ident
					{
					match(input,13,FOLLOW_13_in_pf473); 
					pushFollow(FOLLOW_ident_in_pf475);
					ident();
					state._fsp--;

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
	// projet.g:49:1: parmod : 'mod' '(' pm ( ';' pm )* ')' ;
	public final void parmod() throws RecognitionException {
		try {
			// projet.g:49:10: ( 'mod' '(' pm ( ';' pm )* ')' )
			// projet.g:49:12: 'mod' '(' pm ( ';' pm )* ')'
			{
			match(input,43,FOLLOW_43_in_parmod488); 
			match(input,9,FOLLOW_9_in_parmod490); 
			pushFollow(FOLLOW_pm_in_parmod492);
			pm();
			state._fsp--;

			// projet.g:49:25: ( ';' pm )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==17) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// projet.g:49:27: ';' pm
					{
					match(input,17,FOLLOW_17_in_parmod496); 
					pushFollow(FOLLOW_pm_in_parmod498);
					pm();
					state._fsp--;

					}
					break;

				default :
					break loop25;
				}
			}

			match(input,10,FOLLOW_10_in_parmod502); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parmod"



	// $ANTLR start "pm"
	// projet.g:50:1: pm : type ident ( ',' ident )* ;
	public final void pm() throws RecognitionException {
		try {
			// projet.g:50:10: ( type ident ( ',' ident )* )
			// projet.g:50:12: type ident ( ',' ident )*
			{
			pushFollow(FOLLOW_type_in_pm515);
			type();
			state._fsp--;

			pushFollow(FOLLOW_ident_in_pm517);
			ident();
			state._fsp--;

			// projet.g:50:24: ( ',' ident )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==13) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// projet.g:50:26: ',' ident
					{
					match(input,13,FOLLOW_13_in_pm522); 
					pushFollow(FOLLOW_ident_in_pm524);
					ident();
					state._fsp--;

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
	// projet.g:52:1: corps : 'debut' instructions 'fin' ;
	public final void corps() throws RecognitionException {
		try {
			// projet.g:52:14: ( 'debut' instructions 'fin' )
			// projet.g:52:16: 'debut' instructions 'fin'
			{
			match(input,29,FOLLOW_29_in_corps543); 
			pushFollow(FOLLOW_instructions_in_corps545);
			instructions();
			state._fsp--;

			match(input,39,FOLLOW_39_in_corps547); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "corps"



	// $ANTLR start "instructions"
	// projet.g:53:1: instructions : instruction ( ';' instruction )* ;
	public final void instructions() throws RecognitionException {
		try {
			// projet.g:53:14: ( instruction ( ';' instruction )* )
			// projet.g:53:16: instruction ( ';' instruction )*
			{
			pushFollow(FOLLOW_instruction_in_instructions554);
			instruction();
			state._fsp--;

			// projet.g:53:28: ( ';' instruction )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==17) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// projet.g:53:30: ';' instruction
					{
					match(input,17,FOLLOW_17_in_instructions558); 
					pushFollow(FOLLOW_instruction_in_instructions560);
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
	// projet.g:54:1: instruction : ( inssi | inscond | boucle | lecture | ecriture | affouappel );
	public final void instruction() throws RecognitionException {
		try {
			// projet.g:54:14: ( inssi | inscond | boucle | lecture | ecriture | affouappel )
			int alt28=6;
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
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}
			switch (alt28) {
				case 1 :
					// projet.g:54:16: inssi
					{
					pushFollow(FOLLOW_inssi_in_instruction570);
					inssi();
					state._fsp--;

					}
					break;
				case 2 :
					// projet.g:55:16: inscond
					{
					pushFollow(FOLLOW_inscond_in_instruction587);
					inscond();
					state._fsp--;

					}
					break;
				case 3 :
					// projet.g:56:16: boucle
					{
					pushFollow(FOLLOW_boucle_in_instruction604);
					boucle();
					state._fsp--;

					}
					break;
				case 4 :
					// projet.g:57:16: lecture
					{
					pushFollow(FOLLOW_lecture_in_instruction621);
					lecture();
					state._fsp--;

					}
					break;
				case 5 :
					// projet.g:58:16: ecriture
					{
					pushFollow(FOLLOW_ecriture_in_instruction638);
					ecriture();
					state._fsp--;

					}
					break;
				case 6 :
					// projet.g:59:16: affouappel
					{
					pushFollow(FOLLOW_affouappel_in_instruction655);
					affouappel();
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
	// $ANTLR end "instruction"



	// $ANTLR start "inssi"
	// projet.g:60:1: inssi : 'si' expression 'alors' instructions ( 'sinon' instructions )? 'fsi' ;
	public final void inssi() throws RecognitionException {
		try {
			// projet.g:60:14: ( 'si' expression 'alors' instructions ( 'sinon' instructions )? 'fsi' )
			// projet.g:60:16: 'si' expression 'alors' instructions ( 'sinon' instructions )? 'fsi'
			{
			match(input,50,FOLLOW_50_in_inssi669); 
			pushFollow(FOLLOW_expression_in_inssi671);
			expression();
			state._fsp--;

			 PtGen.pt(6); PtGen.pt(307); PtGen.pt(304); 
			match(input,24,FOLLOW_24_in_inssi690); 
			pushFollow(FOLLOW_instructions_in_inssi692);
			instructions();
			state._fsp--;

			// projet.g:61:37: ( 'sinon' instructions )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==51) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// projet.g:61:38: 'sinon' instructions
					{
					match(input,51,FOLLOW_51_in_inssi695); 
					 PtGen.pt(308); PtGen.pt(305); PtGen.pt(304); 
					pushFollow(FOLLOW_instructions_in_inssi699);
					instructions();
					state._fsp--;

					}
					break;

			}

			match(input,41,FOLLOW_41_in_inssi718); 
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
	// projet.g:63:1: inscond : 'cond' expression ':' instructions ( ',' expression ':' instructions )* ( 'aut' instructions )? 'fcond' ;
	public final void inscond() throws RecognitionException {
		try {
			// projet.g:63:14: ( 'cond' expression ':' instructions ( ',' expression ':' instructions )* ( 'aut' instructions )? 'fcond' )
			// projet.g:63:16: 'cond' expression ':' instructions ( ',' expression ':' instructions )* ( 'aut' instructions )? 'fcond'
			{
			match(input,27,FOLLOW_27_in_inscond732); 
			pushFollow(FOLLOW_expression_in_inscond734);
			expression();
			state._fsp--;

			 PtGen.pt(6); PtGen.pt(307); PtGen.pt(304); 
			match(input,15,FOLLOW_15_in_inscond738); 
			pushFollow(FOLLOW_instructions_in_inscond762);
			instructions();
			state._fsp--;

			 PtGen.pt(306); PtGen.pt(308); PtGen.pt(304); 
			// projet.g:65:16: ( ',' expression ':' instructions )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==13) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// projet.g:65:18: ',' expression ':' instructions
					{
					match(input,13,FOLLOW_13_in_inscond783); 
					pushFollow(FOLLOW_expression_in_inscond786);
					expression();
					state._fsp--;

					 PtGen.pt(6); PtGen.pt(307); PtGen.pt(304); 
					match(input,15,FOLLOW_15_in_inscond790); 
					pushFollow(FOLLOW_instructions_in_inscond814);
					instructions();
					state._fsp--;

					 PtGen.pt(306); PtGen.pt(309); PtGen.pt(304); 
					}
					break;

				default :
					break loop30;
				}
			}

			// projet.g:67:16: ( 'aut' instructions )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==25) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// projet.g:67:17: 'aut' instructions
					{
					match(input,25,FOLLOW_25_in_inscond838); 
					pushFollow(FOLLOW_instructions_in_inscond840);
					instructions();
					state._fsp--;

					}
					break;

			}

			 PtGen.pt(312); 
			match(input,38,FOLLOW_38_in_inscond846); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "inscond"



	// $ANTLR start "boucle"
	// projet.g:68:1: boucle : 'ttq' expression 'faire' instructions 'fait' ;
	public final void boucle() throws RecognitionException {
		try {
			// projet.g:68:14: ( 'ttq' expression 'faire' instructions 'fait' )
			// projet.g:68:16: 'ttq' expression 'faire' instructions 'fait'
			{
			match(input,52,FOLLOW_52_in_boucle859); 
			 PtGen.pt(304); 
			pushFollow(FOLLOW_expression_in_boucle864);
			expression();
			state._fsp--;

			 PtGen.pt(6); PtGen.pt(307); PtGen.pt(304); 
			match(input,35,FOLLOW_35_in_boucle883); 
			pushFollow(FOLLOW_instructions_in_boucle885);
			instructions();
			state._fsp--;

			 PtGen.pt(306); PtGen.pt(309); 
			match(input,36,FOLLOW_36_in_boucle889); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "boucle"



	// $ANTLR start "lecture"
	// projet.g:70:1: lecture : 'lire' '(' ident ( ',' ident )* ')' ;
	public final void lecture() throws RecognitionException {
		try {
			// projet.g:70:14: ( 'lire' '(' ident ( ',' ident )* ')' )
			// projet.g:70:16: 'lire' '(' ident ( ',' ident )* ')'
			{
			match(input,42,FOLLOW_42_in_lecture901); 
			match(input,9,FOLLOW_9_in_lecture903); 
			pushFollow(FOLLOW_ident_in_lecture905);
			ident();
			state._fsp--;

			 PtGen.pt(5); PtGen.pt(300); 
			// projet.g:71:21: ( ',' ident )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==13) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// projet.g:71:23: ',' ident
					{
					match(input,13,FOLLOW_13_in_lecture931); 
					pushFollow(FOLLOW_ident_in_lecture933);
					ident();
					state._fsp--;

					 PtGen.pt(5); PtGen.pt(300); 
					}
					break;

				default :
					break loop32;
				}
			}

			match(input,10,FOLLOW_10_in_lecture940); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "lecture"



	// $ANTLR start "ecriture"
	// projet.g:72:1: ecriture : 'ecrire' '(' expression ( ',' expression )* ')' ;
	public final void ecriture() throws RecognitionException {
		try {
			// projet.g:72:14: ( 'ecrire' '(' expression ( ',' expression )* ')' )
			// projet.g:72:16: 'ecrire' '(' expression ( ',' expression )* ')'
			{
			match(input,32,FOLLOW_32_in_ecriture951); 
			match(input,9,FOLLOW_9_in_ecriture953); 
			pushFollow(FOLLOW_expression_in_ecriture955);
			expression();
			state._fsp--;

			 PtGen.pt(301); 
			// projet.g:73:23: ( ',' expression )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==13) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// projet.g:73:25: ',' expression
					{
					match(input,13,FOLLOW_13_in_ecriture983); 
					pushFollow(FOLLOW_expression_in_ecriture985);
					expression();
					state._fsp--;

					 PtGen.pt(301); 
					}
					break;

				default :
					break loop33;
				}
			}

			match(input,10,FOLLOW_10_in_ecriture992); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ecriture"



	// $ANTLR start "affouappel"
	// projet.g:74:1: affouappel : ident ( ':=' expression | ( effixes ( effmods )? )? ) ;
	public final void affouappel() throws RecognitionException {
		try {
			// projet.g:74:14: ( ident ( ':=' expression | ( effixes ( effmods )? )? ) )
			// projet.g:74:16: ident ( ':=' expression | ( effixes ( effmods )? )? )
			{
			pushFollow(FOLLOW_ident_in_affouappel1001);
			ident();
			state._fsp--;

			 PtGen.pt(5); PtGen.pt(302); 
			// projet.g:74:54: ( ':=' expression | ( effixes ( effmods )? )? )
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
					// projet.g:74:56: ':=' expression
					{
					match(input,16,FOLLOW_16_in_affouappel1007); 
					pushFollow(FOLLOW_expression_in_affouappel1009);
					expression();
					state._fsp--;

					 PtGen.pt(303); 
					}
					break;
				case 2 :
					// projet.g:75:25: ( effixes ( effmods )? )?
					{
					// projet.g:75:25: ( effixes ( effmods )? )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==9) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// projet.g:75:26: effixes ( effmods )?
							{
							pushFollow(FOLLOW_effixes_in_affouappel1038);
							effixes();
							state._fsp--;

							// projet.g:75:34: ( effmods )?
							int alt34=2;
							int LA34_0 = input.LA(1);
							if ( (LA34_0==9) ) {
								alt34=1;
							}
							switch (alt34) {
								case 1 :
									// projet.g:75:35: effmods
									{
									pushFollow(FOLLOW_effmods_in_affouappel1041);
									effmods();
									state._fsp--;

									}
									break;

							}

							}
							break;

					}

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
	// projet.g:76:1: effixes : '(' ( expression ( ',' expression )* )? ')' ;
	public final void effixes() throws RecognitionException {
		try {
			// projet.g:76:14: ( '(' ( expression ( ',' expression )* )? ')' )
			// projet.g:76:16: '(' ( expression ( ',' expression )* )? ')'
			{
			match(input,9,FOLLOW_9_in_effixes1059); 
			// projet.g:76:20: ( expression ( ',' expression )* )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( ((LA38_0 >= ID && LA38_0 <= INT)||LA38_0==9||LA38_0==12||LA38_0==14||LA38_0==37||LA38_0==45||LA38_0==54) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// projet.g:76:21: expression ( ',' expression )*
					{
					pushFollow(FOLLOW_expression_in_effixes1062);
					expression();
					state._fsp--;

					// projet.g:76:33: ( ',' expression )*
					loop37:
					while (true) {
						int alt37=2;
						int LA37_0 = input.LA(1);
						if ( (LA37_0==13) ) {
							alt37=1;
						}

						switch (alt37) {
						case 1 :
							// projet.g:76:34: ',' expression
							{
							match(input,13,FOLLOW_13_in_effixes1066); 
							pushFollow(FOLLOW_expression_in_effixes1068);
							expression();
							state._fsp--;

							}
							break;

						default :
							break loop37;
						}
					}

					}
					break;

			}

			match(input,10,FOLLOW_10_in_effixes1076); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "effixes"



	// $ANTLR start "effmods"
	// projet.g:77:1: effmods : '(' ( ident ( ',' ident )* )? ')' ;
	public final void effmods() throws RecognitionException {
		try {
			// projet.g:77:14: ( '(' ( ident ( ',' ident )* )? ')' )
			// projet.g:77:15: '(' ( ident ( ',' ident )* )? ')'
			{
			match(input,9,FOLLOW_9_in_effmods1087); 
			// projet.g:77:19: ( ident ( ',' ident )* )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==ID) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// projet.g:77:20: ident ( ',' ident )*
					{
					pushFollow(FOLLOW_ident_in_effmods1090);
					ident();
					state._fsp--;

					// projet.g:77:27: ( ',' ident )*
					loop39:
					while (true) {
						int alt39=2;
						int LA39_0 = input.LA(1);
						if ( (LA39_0==13) ) {
							alt39=1;
						}

						switch (alt39) {
						case 1 :
							// projet.g:77:28: ',' ident
							{
							match(input,13,FOLLOW_13_in_effmods1094); 
							pushFollow(FOLLOW_ident_in_effmods1096);
							ident();
							state._fsp--;

							}
							break;

						default :
							break loop39;
						}
					}

					}
					break;

			}

			match(input,10,FOLLOW_10_in_effmods1104); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "effmods"



	// $ANTLR start "expression"
	// projet.g:79:1: expression : ( exp1 ) ( 'ou' exp1 )* ;
	public final void expression() throws RecognitionException {
		try {
			// projet.g:79:12: ( ( exp1 ) ( 'ou' exp1 )* )
			// projet.g:79:14: ( exp1 ) ( 'ou' exp1 )*
			{
			// projet.g:79:14: ( exp1 )
			// projet.g:79:15: exp1
			{
			pushFollow(FOLLOW_exp1_in_expression1114);
			exp1();
			state._fsp--;

			}

			// projet.g:79:21: ( 'ou' exp1 )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==46) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// projet.g:79:22: 'ou' exp1
					{
					 PtGen.pt(6); 
					match(input,46,FOLLOW_46_in_expression1120); 
					pushFollow(FOLLOW_exp1_in_expression1122);
					exp1();
					state._fsp--;

					 PtGen.pt(6); PtGen.pt(118); 
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
	// projet.g:80:1: exp1 : exp2 ( 'et' exp2 )* ;
	public final void exp1() throws RecognitionException {
		try {
			// projet.g:80:12: ( exp2 ( 'et' exp2 )* )
			// projet.g:80:14: exp2 ( 'et' exp2 )*
			{
			pushFollow(FOLLOW_exp2_in_exp11140);
			exp2();
			state._fsp--;

			// projet.g:80:19: ( 'et' exp2 )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==34) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// projet.g:80:20: 'et' exp2
					{
					 PtGen.pt(6); 
					match(input,34,FOLLOW_34_in_exp11145); 
					pushFollow(FOLLOW_exp2_in_exp11147);
					exp2();
					state._fsp--;

					 PtGen.pt(6); PtGen.pt(117); 
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
	// projet.g:81:1: exp2 : ( 'non' exp2 | exp3 );
	public final void exp2() throws RecognitionException {
		try {
			// projet.g:81:12: ( 'non' exp2 | exp3 )
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
					// projet.g:81:14: 'non' exp2
					{
					match(input,45,FOLLOW_45_in_exp21165); 
					pushFollow(FOLLOW_exp2_in_exp21167);
					exp2();
					state._fsp--;

					 PtGen.pt(6); PtGen.pt(116); 
					}
					break;
				case 2 :
					// projet.g:82:14: exp3
					{
					pushFollow(FOLLOW_exp3_in_exp21184);
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
	// projet.g:83:1: exp3 : exp4 ( '=' exp4 | '<>' exp4 | '>' exp4 | '>=' exp4 | '<' exp4 | '<=' exp4 )? ;
	public final void exp3() throws RecognitionException {
		try {
			// projet.g:83:12: ( exp4 ( '=' exp4 | '<>' exp4 | '>' exp4 | '>=' exp4 | '<' exp4 | '<=' exp4 )? )
			// projet.g:83:14: exp4 ( '=' exp4 | '<>' exp4 | '>' exp4 | '>=' exp4 | '<' exp4 | '<=' exp4 )?
			{
			pushFollow(FOLLOW_exp4_in_exp31197);
			exp4();
			state._fsp--;

			// projet.g:83:19: ( '=' exp4 | '<>' exp4 | '>' exp4 | '>=' exp4 | '<' exp4 | '<=' exp4 )?
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
					// projet.g:83:20: '=' exp4
					{
					 PtGen.pt(4); 
					match(input,21,FOLLOW_21_in_exp31202); 
					pushFollow(FOLLOW_exp4_in_exp31205);
					exp4();
					state._fsp--;

					 PtGen.pt(4); PtGen.pt(3); PtGen.pt(114); 
					}
					break;
				case 2 :
					// projet.g:84:20: '<>' exp4
					{
					 PtGen.pt(4); 
					match(input,20,FOLLOW_20_in_exp31230); 
					pushFollow(FOLLOW_exp4_in_exp31232);
					exp4();
					state._fsp--;

					 PtGen.pt(4); PtGen.pt(3); PtGen.pt(115); 
					}
					break;
				case 3 :
					// projet.g:85:20: '>' exp4
					{
					 PtGen.pt(4); 
					match(input,22,FOLLOW_22_in_exp31257); 
					pushFollow(FOLLOW_exp4_in_exp31260);
					exp4();
					state._fsp--;

					 PtGen.pt(4); PtGen.pt(3); PtGen.pt(112); 
					}
					break;
				case 4 :
					// projet.g:86:20: '>=' exp4
					{
					 PtGen.pt(4); 
					match(input,23,FOLLOW_23_in_exp31285); 
					pushFollow(FOLLOW_exp4_in_exp31287);
					exp4();
					state._fsp--;

					 PtGen.pt(4); PtGen.pt(3); PtGen.pt(113); 
					}
					break;
				case 5 :
					// projet.g:87:20: '<' exp4
					{
					 PtGen.pt(4); 
					match(input,18,FOLLOW_18_in_exp31312); 
					pushFollow(FOLLOW_exp4_in_exp31315);
					exp4();
					state._fsp--;

					 PtGen.pt(4); PtGen.pt(3); PtGen.pt(110); 
					}
					break;
				case 6 :
					// projet.g:88:20: '<=' exp4
					{
					 PtGen.pt(4); 
					match(input,19,FOLLOW_19_in_exp31340); 
					pushFollow(FOLLOW_exp4_in_exp31342);
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
	// projet.g:89:1: exp4 : exp5 ( '+' exp5 | '-' exp5 )* ;
	public final void exp4() throws RecognitionException {
		try {
			// projet.g:89:12: ( exp5 ( '+' exp5 | '-' exp5 )* )
			// projet.g:89:14: exp5 ( '+' exp5 | '-' exp5 )*
			{
			pushFollow(FOLLOW_exp5_in_exp41360);
			exp5();
			state._fsp--;

			// projet.g:89:19: ( '+' exp5 | '-' exp5 )*
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
					// projet.g:89:20: '+' exp5
					{
					 PtGen.pt(4); 
					match(input,12,FOLLOW_12_in_exp41365); 
					pushFollow(FOLLOW_exp5_in_exp41368);
					exp5();
					state._fsp--;

					 PtGen.pt(4); PtGen.pt(108); 
					}
					break;
				case 2 :
					// projet.g:90:20: '-' exp5
					{
					 PtGen.pt(4); 
					match(input,14,FOLLOW_14_in_exp41393); 
					pushFollow(FOLLOW_exp5_in_exp41396);
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
	// projet.g:91:1: exp5 : primaire ( '*' primaire | 'div' primaire )* ;
	public final void exp5() throws RecognitionException {
		try {
			// projet.g:91:12: ( primaire ( '*' primaire | 'div' primaire )* )
			// projet.g:91:14: primaire ( '*' primaire | 'div' primaire )*
			{
			pushFollow(FOLLOW_primaire_in_exp51414);
			primaire();
			state._fsp--;

			// projet.g:91:23: ( '*' primaire | 'div' primaire )*
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
					// projet.g:91:24: '*' primaire
					{
					 PtGen.pt(4); 
					match(input,11,FOLLOW_11_in_exp51419); 
					pushFollow(FOLLOW_primaire_in_exp51421);
					primaire();
					state._fsp--;

					 PtGen.pt(4); PtGen.pt(106); 
					}
					break;
				case 2 :
					// projet.g:92:24: 'div' primaire
					{
					 PtGen.pt(4); 
					match(input,31,FOLLOW_31_in_exp51450); 
					pushFollow(FOLLOW_primaire_in_exp51452);
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
	// projet.g:93:1: primaire : ( valeur | ident | '(' expression ')' );
	public final void primaire() throws RecognitionException {
		try {
			// projet.g:93:12: ( valeur | ident | '(' expression ')' )
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
					// projet.g:93:14: valeur
					{
					pushFollow(FOLLOW_valeur_in_primaire1466);
					valeur();
					state._fsp--;

					 PtGen.pt(104); 
					}
					break;
				case 2 :
					// projet.g:94:14: ident
					{
					pushFollow(FOLLOW_ident_in_primaire1483);
					ident();
					state._fsp--;

					 PtGen.pt(5); PtGen.pt(105); 
					}
					break;
				case 3 :
					// projet.g:95:14: '(' expression ')'
					{
					match(input,9,FOLLOW_9_in_primaire1500); 
					pushFollow(FOLLOW_expression_in_primaire1502);
					expression();
					state._fsp--;

					match(input,10,FOLLOW_10_in_primaire1504); 
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
	// projet.g:96:1: valeur : ( nbentier | '+' nbentier | '-' nbentier | 'vrai' | 'faux' );
	public final void valeur() throws RecognitionException {
		try {
			// projet.g:96:12: ( nbentier | '+' nbentier | '-' nbentier | 'vrai' | 'faux' )
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
					// projet.g:96:14: nbentier
					{
					pushFollow(FOLLOW_nbentier_in_valeur1515);
					nbentier();
					state._fsp--;

					 PtGen.pt(2); PtGen.pt(101); 
					}
					break;
				case 2 :
					// projet.g:97:14: '+' nbentier
					{
					match(input,12,FOLLOW_12_in_valeur1532); 
					pushFollow(FOLLOW_nbentier_in_valeur1534);
					nbentier();
					state._fsp--;

					 PtGen.pt(2); PtGen.pt(101); 
					}
					break;
				case 3 :
					// projet.g:98:14: '-' nbentier
					{
					match(input,14,FOLLOW_14_in_valeur1551); 
					 PtGen.pt(100); 
					pushFollow(FOLLOW_nbentier_in_valeur1555);
					nbentier();
					state._fsp--;

					 PtGen.pt(2); PtGen.pt(101); 
					}
					break;
				case 4 :
					// projet.g:99:14: 'vrai'
					{
					match(input,54,FOLLOW_54_in_valeur1572); 
					 PtGen.pt(3); PtGen.pt(102); 
					}
					break;
				case 5 :
					// projet.g:100:14: 'faux'
					{
					match(input,37,FOLLOW_37_in_valeur1589); 
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
	// projet.g:109:1: nbentier : INT ;
	public final void nbentier() throws RecognitionException {
		Token INT1=null;

		try {
			// projet.g:109:11: ( INT )
			// projet.g:109:15: INT
			{
			INT1=(Token)match(input,INT,FOLLOW_INT_in_nbentier1616); 
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
	// projet.g:111:1: ident : ID ;
	public final void ident() throws RecognitionException {
		Token ID2=null;

		try {
			// projet.g:111:7: ( ID )
			// projet.g:111:9: ID
			{
			ID2=(Token)match(input,ID,FOLLOW_ID_in_ident1627); 
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



	public static final BitSet FOLLOW_unitprog_in_unite61 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_unite63 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unitmodule_in_unite67 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_unite70 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_48_in_unitprog79 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_unitprog81 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_unitprog83 = new BitSet(new long[]{0x0022800070000000L});
	public static final BitSet FOLLOW_declarations_in_unitprog85 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_corps_in_unitprog102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_unitmodule111 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_unitmodule113 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_unitmodule115 = new BitSet(new long[]{0x0022800050000000L});
	public static final BitSet FOLLOW_declarations_in_unitmodule117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_partiedef_in_declarations125 = new BitSet(new long[]{0x0022800010000002L});
	public static final BitSet FOLLOW_partieref_in_declarations128 = new BitSet(new long[]{0x0020800010000002L});
	public static final BitSet FOLLOW_consts_in_declarations131 = new BitSet(new long[]{0x0020800000000002L});
	public static final BitSet FOLLOW_vars_in_declarations134 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_decprocs_in_declarations137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_partiedef148 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_partiedef150 = new BitSet(new long[]{0x0000000000022000L});
	public static final BitSet FOLLOW_13_in_partiedef154 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_partiedef156 = new BitSet(new long[]{0x0000000000022000L});
	public static final BitSet FOLLOW_ptvg_in_partiedef161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_partieref171 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_specif_in_partieref174 = new BitSet(new long[]{0x0000000000022000L});
	public static final BitSet FOLLOW_13_in_partieref177 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_specif_in_partieref179 = new BitSet(new long[]{0x0000000000022000L});
	public static final BitSet FOLLOW_ptvg_in_partieref183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_specif196 = new BitSet(new long[]{0x0000090000000002L});
	public static final BitSet FOLLOW_40_in_specif200 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_specif202 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_type_in_specif204 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_13_in_specif208 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_type_in_specif210 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_10_in_specif216 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_43_in_specif245 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_specif248 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_type_in_specif250 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_13_in_specif254 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_type_in_specif256 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_10_in_specif262 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_consts278 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_consts282 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_consts286 = new BitSet(new long[]{0x0040002000005040L});
	public static final BitSet FOLLOW_valeur_in_consts288 = new BitSet(new long[]{0x0000000000020020L});
	public static final BitSet FOLLOW_ptvg_in_consts292 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_53_in_vars310 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_type_in_vars314 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_vars316 = new BitSet(new long[]{0x0000000204022000L});
	public static final BitSet FOLLOW_13_in_vars343 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_vars346 = new BitSet(new long[]{0x0000000204022000L});
	public static final BitSet FOLLOW_ptvg_in_vars353 = new BitSet(new long[]{0x0000000204000002L});
	public static final BitSet FOLLOW_33_in_type373 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_type379 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decproc_in_decprocs390 = new BitSet(new long[]{0x0000800000020000L});
	public static final BitSet FOLLOW_ptvg_in_decprocs392 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_47_in_decproc402 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_decproc404 = new BitSet(new long[]{0x0020090030000000L});
	public static final BitSet FOLLOW_parfixe_in_decproc406 = new BitSet(new long[]{0x0020080030000000L});
	public static final BitSet FOLLOW_parmod_in_decproc409 = new BitSet(new long[]{0x0020000030000000L});
	public static final BitSet FOLLOW_consts_in_decproc412 = new BitSet(new long[]{0x0020000020000000L});
	public static final BitSet FOLLOW_vars_in_decproc415 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_corps_in_decproc418 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_ptvg429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_parfixe439 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_parfixe441 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_pf_in_parfixe443 = new BitSet(new long[]{0x0000000000020400L});
	public static final BitSet FOLLOW_17_in_parfixe447 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_pf_in_parfixe449 = new BitSet(new long[]{0x0000000000020400L});
	public static final BitSet FOLLOW_10_in_parfixe453 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_pf466 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_pf468 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_13_in_pf473 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_pf475 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_43_in_parmod488 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_parmod490 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_pm_in_parmod492 = new BitSet(new long[]{0x0000000000020400L});
	public static final BitSet FOLLOW_17_in_parmod496 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_pm_in_parmod498 = new BitSet(new long[]{0x0000000000020400L});
	public static final BitSet FOLLOW_10_in_parmod502 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_pm515 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_pm517 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_13_in_pm522 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_pm524 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_29_in_corps543 = new BitSet(new long[]{0x0014040108000020L});
	public static final BitSet FOLLOW_instructions_in_corps545 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_corps547 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructions554 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_instructions558 = new BitSet(new long[]{0x0014040108000020L});
	public static final BitSet FOLLOW_instruction_in_instructions560 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_inssi_in_instruction570 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inscond_in_instruction587 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boucle_in_instruction604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lecture_in_instruction621 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ecriture_in_instruction638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_affouappel_in_instruction655 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_inssi669 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_inssi671 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_inssi690 = new BitSet(new long[]{0x0014040108000020L});
	public static final BitSet FOLLOW_instructions_in_inssi692 = new BitSet(new long[]{0x0008020000000000L});
	public static final BitSet FOLLOW_51_in_inssi695 = new BitSet(new long[]{0x0014040108000020L});
	public static final BitSet FOLLOW_instructions_in_inssi699 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_inssi718 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_inscond732 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_inscond734 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_inscond738 = new BitSet(new long[]{0x0014040108000020L});
	public static final BitSet FOLLOW_instructions_in_inscond762 = new BitSet(new long[]{0x0000004002002000L});
	public static final BitSet FOLLOW_13_in_inscond783 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_inscond786 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_inscond790 = new BitSet(new long[]{0x0014040108000020L});
	public static final BitSet FOLLOW_instructions_in_inscond814 = new BitSet(new long[]{0x0000004002002000L});
	public static final BitSet FOLLOW_25_in_inscond838 = new BitSet(new long[]{0x0014040108000020L});
	public static final BitSet FOLLOW_instructions_in_inscond840 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_inscond846 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_boucle859 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_boucle864 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_boucle883 = new BitSet(new long[]{0x0014040108000020L});
	public static final BitSet FOLLOW_instructions_in_boucle885 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_boucle889 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_lecture901 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_lecture903 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_lecture905 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_13_in_lecture931 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_lecture933 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_10_in_lecture940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_ecriture951 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_ecriture953 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_ecriture955 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_13_in_ecriture983 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_ecriture985 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_10_in_ecriture992 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_affouappel1001 = new BitSet(new long[]{0x0000000000010202L});
	public static final BitSet FOLLOW_16_in_affouappel1007 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_affouappel1009 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_effixes_in_affouappel1038 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_effmods_in_affouappel1041 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_effixes1059 = new BitSet(new long[]{0x0040202000005660L});
	public static final BitSet FOLLOW_expression_in_effixes1062 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_13_in_effixes1066 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_effixes1068 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_10_in_effixes1076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_effmods1087 = new BitSet(new long[]{0x0000000000000420L});
	public static final BitSet FOLLOW_ident_in_effmods1090 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_13_in_effmods1094 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_effmods1096 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_10_in_effmods1104 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp1_in_expression1114 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_46_in_expression1120 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_exp1_in_expression1122 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_exp2_in_exp11140 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_34_in_exp11145 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_exp2_in_exp11147 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_45_in_exp21165 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_exp2_in_exp21167 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp3_in_exp21184 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp4_in_exp31197 = new BitSet(new long[]{0x0000000000FC0002L});
	public static final BitSet FOLLOW_21_in_exp31202 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp4_in_exp31205 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_exp31230 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp4_in_exp31232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_exp31257 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp4_in_exp31260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_exp31285 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp4_in_exp31287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_exp31312 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp4_in_exp31315 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_exp31340 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp4_in_exp31342 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp5_in_exp41360 = new BitSet(new long[]{0x0000000000005002L});
	public static final BitSet FOLLOW_12_in_exp41365 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp5_in_exp41368 = new BitSet(new long[]{0x0000000000005002L});
	public static final BitSet FOLLOW_14_in_exp41393 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp5_in_exp41396 = new BitSet(new long[]{0x0000000000005002L});
	public static final BitSet FOLLOW_primaire_in_exp51414 = new BitSet(new long[]{0x0000000080000802L});
	public static final BitSet FOLLOW_11_in_exp51419 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_primaire_in_exp51421 = new BitSet(new long[]{0x0000000080000802L});
	public static final BitSet FOLLOW_31_in_exp51450 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_primaire_in_exp51452 = new BitSet(new long[]{0x0000000080000802L});
	public static final BitSet FOLLOW_valeur_in_primaire1466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_primaire1483 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_primaire1500 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_primaire1502 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_primaire1504 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nbentier_in_valeur1515 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_valeur1532 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_nbentier_in_valeur1534 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_valeur1551 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_nbentier_in_valeur1555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_valeur1572 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_valeur1589 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_nbentier1616 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_ident1627 = new BitSet(new long[]{0x0000000000000002L});
}
