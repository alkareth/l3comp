// $ANTLR 3.5.2 projet.g 2016-03-01 03:05:32
           
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

			 PtGen.pt(666); System.out.println("succès, arret de la compilation "); 
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

					 PtGen.pt(299); PtGen.pt(200); 
					match(input,21,FOLLOW_21_in_consts286); 
					pushFollow(FOLLOW_valeur_in_consts288);
					valeur();
					state._fsp--;

					 PtGen.pt(205); 
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
							match(input,13,FOLLOW_13_in_vars343); 
							pushFollow(FOLLOW_ident_in_vars346);
							ident();
							state._fsp--;

							 PtGen.pt(299); PtGen.pt(201); 
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
			 PtGen.pt(308); PtGen.pt(304); 
			// projet.g:44:46: ( decproc ptvg )+
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
					// projet.g:44:47: decproc ptvg
					{
					pushFollow(FOLLOW_decproc_in_decprocs392);
					decproc();
					state._fsp--;

					pushFollow(FOLLOW_ptvg_in_decprocs394);
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

			 PtGen.pt(305); 
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
			match(input,47,FOLLOW_47_in_decproc406); 
			pushFollow(FOLLOW_ident_in_decproc408);
			ident();
			state._fsp--;

			 PtGen.pt(203); 
			// projet.g:45:44: ( parfixe )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==40) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// projet.g:45:44: parfixe
					{
					pushFollow(FOLLOW_parfixe_in_decproc412);
					parfixe();
					state._fsp--;

					}
					break;

			}

			// projet.g:45:53: ( parmod )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==43) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// projet.g:45:53: parmod
					{
					pushFollow(FOLLOW_parmod_in_decproc415);
					parmod();
					state._fsp--;

					}
					break;

			}

			// projet.g:45:61: ( consts )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==28) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// projet.g:45:61: consts
					{
					pushFollow(FOLLOW_consts_in_decproc418);
					consts();
					state._fsp--;

					}
					break;

			}

			// projet.g:45:69: ( vars )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==53) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// projet.g:45:69: vars
					{
					pushFollow(FOLLOW_vars_in_decproc421);
					vars();
					state._fsp--;

					}
					break;

			}

			 PtGen.pt(204); 
			pushFollow(FOLLOW_corps_in_decproc426);
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
					match(input,17,FOLLOW_17_in_ptvg439); 
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
			match(input,40,FOLLOW_40_in_parfixe449); 
			match(input,9,FOLLOW_9_in_parfixe451); 
			pushFollow(FOLLOW_pf_in_parfixe453);
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
					match(input,17,FOLLOW_17_in_parfixe457); 
					pushFollow(FOLLOW_pf_in_parfixe459);
					pf();
					state._fsp--;

					}
					break;

				default :
					break loop23;
				}
			}

			match(input,10,FOLLOW_10_in_parfixe463); 
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
			pushFollow(FOLLOW_type_in_pf476);
			type();
			state._fsp--;

			pushFollow(FOLLOW_ident_in_pf478);
			ident();
			state._fsp--;

			 PtGen.pt(299); PtGen.pt(206); 
			// projet.g:48:57: ( ',' ident )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==13) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// projet.g:48:59: ',' ident
					{
					match(input,13,FOLLOW_13_in_pf484); 
					pushFollow(FOLLOW_ident_in_pf486);
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
	// projet.g:49:1: parmod : 'mod' '(' pm ( ';' pm )* ')' ;
	public final void parmod() throws RecognitionException {
		try {
			// projet.g:49:10: ( 'mod' '(' pm ( ';' pm )* ')' )
			// projet.g:49:12: 'mod' '(' pm ( ';' pm )* ')'
			{
			match(input,43,FOLLOW_43_in_parmod500); 
			match(input,9,FOLLOW_9_in_parmod502); 
			pushFollow(FOLLOW_pm_in_parmod504);
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
					match(input,17,FOLLOW_17_in_parmod508); 
					pushFollow(FOLLOW_pm_in_parmod510);
					pm();
					state._fsp--;

					}
					break;

				default :
					break loop25;
				}
			}

			match(input,10,FOLLOW_10_in_parmod514); 
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
			pushFollow(FOLLOW_type_in_pm527);
			type();
			state._fsp--;

			pushFollow(FOLLOW_ident_in_pm529);
			ident();
			state._fsp--;

			 PtGen.pt(299); PtGen.pt(207); 
			// projet.g:50:57: ( ',' ident )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==13) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// projet.g:50:59: ',' ident
					{
					match(input,13,FOLLOW_13_in_pm535); 
					pushFollow(FOLLOW_ident_in_pm537);
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
	// projet.g:52:1: corps : 'debut' instructions 'fin' ;
	public final void corps() throws RecognitionException {
		try {
			// projet.g:52:14: ( 'debut' instructions 'fin' )
			// projet.g:52:16: 'debut' instructions 'fin'
			{
			match(input,29,FOLLOW_29_in_corps557); 
			pushFollow(FOLLOW_instructions_in_corps559);
			instructions();
			state._fsp--;

			match(input,39,FOLLOW_39_in_corps561); 
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
			pushFollow(FOLLOW_instruction_in_instructions568);
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
					match(input,17,FOLLOW_17_in_instructions572); 
					pushFollow(FOLLOW_instruction_in_instructions574);
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
					pushFollow(FOLLOW_inssi_in_instruction584);
					inssi();
					state._fsp--;

					}
					break;
				case 2 :
					// projet.g:54:24: inscond
					{
					pushFollow(FOLLOW_inscond_in_instruction588);
					inscond();
					state._fsp--;

					}
					break;
				case 3 :
					// projet.g:54:34: boucle
					{
					pushFollow(FOLLOW_boucle_in_instruction592);
					boucle();
					state._fsp--;

					}
					break;
				case 4 :
					// projet.g:54:43: lecture
					{
					pushFollow(FOLLOW_lecture_in_instruction596);
					lecture();
					state._fsp--;

					}
					break;
				case 5 :
					// projet.g:54:53: ecriture
					{
					pushFollow(FOLLOW_ecriture_in_instruction600);
					ecriture();
					state._fsp--;

					}
					break;
				case 6 :
					// projet.g:54:64: affouappel
					{
					pushFollow(FOLLOW_affouappel_in_instruction604);
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
	// projet.g:55:1: inssi : 'si' expression 'alors' instructions ( 'sinon' instructions )? 'fsi' ;
	public final void inssi() throws RecognitionException {
		try {
			// projet.g:55:14: ( 'si' expression 'alors' instructions ( 'sinon' instructions )? 'fsi' )
			// projet.g:55:16: 'si' expression 'alors' instructions ( 'sinon' instructions )? 'fsi'
			{
			match(input,50,FOLLOW_50_in_inssi618); 
			pushFollow(FOLLOW_expression_in_inssi620);
			expression();
			state._fsp--;

			 PtGen.pt(6); PtGen.pt(307); PtGen.pt(304); 
			match(input,24,FOLLOW_24_in_inssi639); 
			pushFollow(FOLLOW_instructions_in_inssi641);
			instructions();
			state._fsp--;

			// projet.g:56:37: ( 'sinon' instructions )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==51) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// projet.g:56:38: 'sinon' instructions
					{
					match(input,51,FOLLOW_51_in_inssi644); 
					 PtGen.pt(308); PtGen.pt(305); PtGen.pt(304); 
					pushFollow(FOLLOW_instructions_in_inssi648);
					instructions();
					state._fsp--;

					}
					break;

			}

			match(input,41,FOLLOW_41_in_inssi667); 
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
	// projet.g:58:1: inscond : 'cond' expression ':' instructions ( ',' expression ':' instructions )* ( 'aut' instructions )? 'fcond' ;
	public final void inscond() throws RecognitionException {
		try {
			// projet.g:58:14: ( 'cond' expression ':' instructions ( ',' expression ':' instructions )* ( 'aut' instructions )? 'fcond' )
			// projet.g:58:16: 'cond' expression ':' instructions ( ',' expression ':' instructions )* ( 'aut' instructions )? 'fcond'
			{
			match(input,27,FOLLOW_27_in_inscond681); 
			pushFollow(FOLLOW_expression_in_inscond683);
			expression();
			state._fsp--;

			 PtGen.pt(6); PtGen.pt(307); PtGen.pt(304); 
			match(input,15,FOLLOW_15_in_inscond687); 
			pushFollow(FOLLOW_instructions_in_inscond711);
			instructions();
			state._fsp--;

			 PtGen.pt(306); PtGen.pt(308); PtGen.pt(304); 
			// projet.g:60:16: ( ',' expression ':' instructions )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==13) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// projet.g:60:18: ',' expression ':' instructions
					{
					match(input,13,FOLLOW_13_in_inscond732); 
					pushFollow(FOLLOW_expression_in_inscond735);
					expression();
					state._fsp--;

					 PtGen.pt(6); PtGen.pt(307); PtGen.pt(304); 
					match(input,15,FOLLOW_15_in_inscond739); 
					pushFollow(FOLLOW_instructions_in_inscond763);
					instructions();
					state._fsp--;

					 PtGen.pt(306); PtGen.pt(309); PtGen.pt(304); 
					}
					break;

				default :
					break loop30;
				}
			}

			// projet.g:62:16: ( 'aut' instructions )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==25) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// projet.g:62:17: 'aut' instructions
					{
					match(input,25,FOLLOW_25_in_inscond787); 
					pushFollow(FOLLOW_instructions_in_inscond789);
					instructions();
					state._fsp--;

					}
					break;

			}

			 PtGen.pt(310); 
			match(input,38,FOLLOW_38_in_inscond795); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "inscond"



	// $ANTLR start "boucle"
	// projet.g:63:1: boucle : 'ttq' expression 'faire' instructions 'fait' ;
	public final void boucle() throws RecognitionException {
		try {
			// projet.g:63:14: ( 'ttq' expression 'faire' instructions 'fait' )
			// projet.g:63:16: 'ttq' expression 'faire' instructions 'fait'
			{
			match(input,52,FOLLOW_52_in_boucle808); 
			 PtGen.pt(304); 
			pushFollow(FOLLOW_expression_in_boucle812);
			expression();
			state._fsp--;

			 PtGen.pt(6); PtGen.pt(307); PtGen.pt(304); 
			match(input,35,FOLLOW_35_in_boucle831); 
			pushFollow(FOLLOW_instructions_in_boucle833);
			instructions();
			state._fsp--;

			 PtGen.pt(306); PtGen.pt(311); 
			match(input,36,FOLLOW_36_in_boucle837); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "boucle"



	// $ANTLR start "lecture"
	// projet.g:65:1: lecture : 'lire' '(' ident ( ',' ident )* ')' ;
	public final void lecture() throws RecognitionException {
		try {
			// projet.g:65:14: ( 'lire' '(' ident ( ',' ident )* ')' )
			// projet.g:65:16: 'lire' '(' ident ( ',' ident )* ')'
			{
			match(input,42,FOLLOW_42_in_lecture849); 
			match(input,9,FOLLOW_9_in_lecture851); 
			pushFollow(FOLLOW_ident_in_lecture853);
			ident();
			state._fsp--;

			 PtGen.pt(1); PtGen.pt(399); PtGen.pt(300); PtGen.pt(303); 
			// projet.g:66:21: ( ',' ident )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==13) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// projet.g:66:23: ',' ident
					{
					match(input,13,FOLLOW_13_in_lecture879); 
					pushFollow(FOLLOW_ident_in_lecture881);
					ident();
					state._fsp--;

					 PtGen.pt(1); PtGen.pt(399); PtGen.pt(300); PtGen.pt(303); 
					}
					break;

				default :
					break loop32;
				}
			}

			match(input,10,FOLLOW_10_in_lecture888); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "lecture"



	// $ANTLR start "ecriture"
	// projet.g:67:1: ecriture : 'ecrire' '(' expression ( ',' expression )* ')' ;
	public final void ecriture() throws RecognitionException {
		try {
			// projet.g:67:14: ( 'ecrire' '(' expression ( ',' expression )* ')' )
			// projet.g:67:16: 'ecrire' '(' expression ( ',' expression )* ')'
			{
			match(input,32,FOLLOW_32_in_ecriture899); 
			match(input,9,FOLLOW_9_in_ecriture901); 
			pushFollow(FOLLOW_expression_in_ecriture903);
			expression();
			state._fsp--;

			 PtGen.pt(301); 
			// projet.g:68:23: ( ',' expression )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==13) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// projet.g:68:25: ',' expression
					{
					match(input,13,FOLLOW_13_in_ecriture931); 
					pushFollow(FOLLOW_expression_in_ecriture933);
					expression();
					state._fsp--;

					 PtGen.pt(301); 
					}
					break;

				default :
					break loop33;
				}
			}

			match(input,10,FOLLOW_10_in_ecriture940); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ecriture"



	// $ANTLR start "affouappel"
	// projet.g:69:1: affouappel : ident ( ':=' expression | ( effixes ( effmods )? )? ) ;
	public final void affouappel() throws RecognitionException {
		try {
			// projet.g:69:14: ( ident ( ':=' expression | ( effixes ( effmods )? )? ) )
			// projet.g:69:16: ident ( ':=' expression | ( effixes ( effmods )? )? )
			{
			pushFollow(FOLLOW_ident_in_affouappel949);
			ident();
			state._fsp--;

			 PtGen.pt(1); 
			// projet.g:69:39: ( ':=' expression | ( effixes ( effmods )? )? )
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
					// projet.g:69:41: ':=' expression
					{
					match(input,16,FOLLOW_16_in_affouappel955); 
					 PtGen.pt(399); PtGen.pt(302); 
					pushFollow(FOLLOW_expression_in_affouappel959);
					expression();
					state._fsp--;

					 PtGen.pt(303); 
					}
					break;
				case 2 :
					// projet.g:70:25: ( effixes ( effmods )? )?
					{
					 PtGen.pt(312); 
					// projet.g:70:44: ( effixes ( effmods )? )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==9) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// projet.g:70:45: effixes ( effmods )?
							{
							pushFollow(FOLLOW_effixes_in_affouappel990);
							effixes();
							state._fsp--;

							// projet.g:70:53: ( effmods )?
							int alt34=2;
							int LA34_0 = input.LA(1);
							if ( (LA34_0==9) ) {
								alt34=1;
							}
							switch (alt34) {
								case 1 :
									// projet.g:70:54: effmods
									{
									pushFollow(FOLLOW_effmods_in_affouappel993);
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
	// projet.g:71:1: effixes : '(' ( expression ( ',' expression )* )? ')' ;
	public final void effixes() throws RecognitionException {
		try {
			// projet.g:71:14: ( '(' ( expression ( ',' expression )* )? ')' )
			// projet.g:71:16: '(' ( expression ( ',' expression )* )? ')'
			{
			match(input,9,FOLLOW_9_in_effixes1013); 
			// projet.g:71:20: ( expression ( ',' expression )* )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( ((LA38_0 >= ID && LA38_0 <= INT)||LA38_0==9||LA38_0==12||LA38_0==14||LA38_0==37||LA38_0==45||LA38_0==54) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// projet.g:71:21: expression ( ',' expression )*
					{
					pushFollow(FOLLOW_expression_in_effixes1016);
					expression();
					state._fsp--;

					 PtGen.pt(313); 
					// projet.g:71:51: ( ',' expression )*
					loop37:
					while (true) {
						int alt37=2;
						int LA37_0 = input.LA(1);
						if ( (LA37_0==13) ) {
							alt37=1;
						}

						switch (alt37) {
						case 1 :
							// projet.g:71:52: ',' expression
							{
							match(input,13,FOLLOW_13_in_effixes1021); 
							pushFollow(FOLLOW_expression_in_effixes1023);
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

			match(input,10,FOLLOW_10_in_effixes1032); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "effixes"



	// $ANTLR start "effmods"
	// projet.g:72:1: effmods : '(' ( ident ( ',' ident )* )? ')' ;
	public final void effmods() throws RecognitionException {
		try {
			// projet.g:72:14: ( '(' ( ident ( ',' ident )* )? ')' )
			// projet.g:72:15: '(' ( ident ( ',' ident )* )? ')'
			{
			match(input,9,FOLLOW_9_in_effmods1043); 
			// projet.g:72:19: ( ident ( ',' ident )* )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==ID) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// projet.g:72:20: ident ( ',' ident )*
					{
					pushFollow(FOLLOW_ident_in_effmods1046);
					ident();
					state._fsp--;

					 PtGen.pt(1); PtGen.pt(399); PtGen.pt(314); 
					// projet.g:73:15: ( ',' ident )*
					loop39:
					while (true) {
						int alt39=2;
						int LA39_0 = input.LA(1);
						if ( (LA39_0==13) ) {
							alt39=1;
						}

						switch (alt39) {
						case 1 :
							// projet.g:73:16: ',' ident
							{
							match(input,13,FOLLOW_13_in_effmods1065); 
							pushFollow(FOLLOW_ident_in_effmods1067);
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

			match(input,10,FOLLOW_10_in_effmods1076); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "effmods"



	// $ANTLR start "expression"
	// projet.g:75:1: expression : ( exp1 ) ( 'ou' exp1 )* ;
	public final void expression() throws RecognitionException {
		try {
			// projet.g:75:12: ( ( exp1 ) ( 'ou' exp1 )* )
			// projet.g:75:14: ( exp1 ) ( 'ou' exp1 )*
			{
			// projet.g:75:14: ( exp1 )
			// projet.g:75:15: exp1
			{
			pushFollow(FOLLOW_exp1_in_expression1086);
			exp1();
			state._fsp--;

			}

			// projet.g:75:21: ( 'ou' exp1 )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==46) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// projet.g:75:22: 'ou' exp1
					{
					 PtGen.pt(6); 
					match(input,46,FOLLOW_46_in_expression1092); 
					pushFollow(FOLLOW_exp1_in_expression1094);
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
	// projet.g:76:1: exp1 : exp2 ( 'et' exp2 )* ;
	public final void exp1() throws RecognitionException {
		try {
			// projet.g:76:12: ( exp2 ( 'et' exp2 )* )
			// projet.g:76:14: exp2 ( 'et' exp2 )*
			{
			pushFollow(FOLLOW_exp2_in_exp11112);
			exp2();
			state._fsp--;

			// projet.g:76:19: ( 'et' exp2 )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==34) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// projet.g:76:20: 'et' exp2
					{
					 PtGen.pt(6); 
					match(input,34,FOLLOW_34_in_exp11117); 
					pushFollow(FOLLOW_exp2_in_exp11119);
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
	// projet.g:77:1: exp2 : ( 'non' exp2 | exp3 );
	public final void exp2() throws RecognitionException {
		try {
			// projet.g:77:12: ( 'non' exp2 | exp3 )
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
					// projet.g:77:14: 'non' exp2
					{
					match(input,45,FOLLOW_45_in_exp21137); 
					pushFollow(FOLLOW_exp2_in_exp21139);
					exp2();
					state._fsp--;

					 PtGen.pt(6); PtGen.pt(116); 
					}
					break;
				case 2 :
					// projet.g:78:14: exp3
					{
					pushFollow(FOLLOW_exp3_in_exp21156);
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
	// projet.g:79:1: exp3 : exp4 ( '=' exp4 | '<>' exp4 | '>' exp4 | '>=' exp4 | '<' exp4 | '<=' exp4 )? ;
	public final void exp3() throws RecognitionException {
		try {
			// projet.g:79:12: ( exp4 ( '=' exp4 | '<>' exp4 | '>' exp4 | '>=' exp4 | '<' exp4 | '<=' exp4 )? )
			// projet.g:79:14: exp4 ( '=' exp4 | '<>' exp4 | '>' exp4 | '>=' exp4 | '<' exp4 | '<=' exp4 )?
			{
			pushFollow(FOLLOW_exp4_in_exp31169);
			exp4();
			state._fsp--;

			// projet.g:79:19: ( '=' exp4 | '<>' exp4 | '>' exp4 | '>=' exp4 | '<' exp4 | '<=' exp4 )?
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
					// projet.g:79:20: '=' exp4
					{
					 PtGen.pt(4); 
					match(input,21,FOLLOW_21_in_exp31174); 
					pushFollow(FOLLOW_exp4_in_exp31177);
					exp4();
					state._fsp--;

					 PtGen.pt(4); PtGen.pt(3); PtGen.pt(114); 
					}
					break;
				case 2 :
					// projet.g:80:20: '<>' exp4
					{
					 PtGen.pt(4); 
					match(input,20,FOLLOW_20_in_exp31202); 
					pushFollow(FOLLOW_exp4_in_exp31204);
					exp4();
					state._fsp--;

					 PtGen.pt(4); PtGen.pt(3); PtGen.pt(115); 
					}
					break;
				case 3 :
					// projet.g:81:20: '>' exp4
					{
					 PtGen.pt(4); 
					match(input,22,FOLLOW_22_in_exp31229); 
					pushFollow(FOLLOW_exp4_in_exp31232);
					exp4();
					state._fsp--;

					 PtGen.pt(4); PtGen.pt(3); PtGen.pt(112); 
					}
					break;
				case 4 :
					// projet.g:82:20: '>=' exp4
					{
					 PtGen.pt(4); 
					match(input,23,FOLLOW_23_in_exp31257); 
					pushFollow(FOLLOW_exp4_in_exp31259);
					exp4();
					state._fsp--;

					 PtGen.pt(4); PtGen.pt(3); PtGen.pt(113); 
					}
					break;
				case 5 :
					// projet.g:83:20: '<' exp4
					{
					 PtGen.pt(4); 
					match(input,18,FOLLOW_18_in_exp31284); 
					pushFollow(FOLLOW_exp4_in_exp31287);
					exp4();
					state._fsp--;

					 PtGen.pt(4); PtGen.pt(3); PtGen.pt(110); 
					}
					break;
				case 6 :
					// projet.g:84:20: '<=' exp4
					{
					 PtGen.pt(4); 
					match(input,19,FOLLOW_19_in_exp31312); 
					pushFollow(FOLLOW_exp4_in_exp31314);
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
	// projet.g:85:1: exp4 : exp5 ( '+' exp5 | '-' exp5 )* ;
	public final void exp4() throws RecognitionException {
		try {
			// projet.g:85:12: ( exp5 ( '+' exp5 | '-' exp5 )* )
			// projet.g:85:14: exp5 ( '+' exp5 | '-' exp5 )*
			{
			pushFollow(FOLLOW_exp5_in_exp41332);
			exp5();
			state._fsp--;

			// projet.g:85:19: ( '+' exp5 | '-' exp5 )*
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
					// projet.g:85:20: '+' exp5
					{
					 PtGen.pt(4); 
					match(input,12,FOLLOW_12_in_exp41337); 
					pushFollow(FOLLOW_exp5_in_exp41340);
					exp5();
					state._fsp--;

					 PtGen.pt(4); PtGen.pt(108); 
					}
					break;
				case 2 :
					// projet.g:86:20: '-' exp5
					{
					 PtGen.pt(4); 
					match(input,14,FOLLOW_14_in_exp41365); 
					pushFollow(FOLLOW_exp5_in_exp41368);
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
	// projet.g:87:1: exp5 : primaire ( '*' primaire | 'div' primaire )* ;
	public final void exp5() throws RecognitionException {
		try {
			// projet.g:87:12: ( primaire ( '*' primaire | 'div' primaire )* )
			// projet.g:87:14: primaire ( '*' primaire | 'div' primaire )*
			{
			pushFollow(FOLLOW_primaire_in_exp51386);
			primaire();
			state._fsp--;

			// projet.g:87:23: ( '*' primaire | 'div' primaire )*
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
					// projet.g:87:24: '*' primaire
					{
					 PtGen.pt(4); 
					match(input,11,FOLLOW_11_in_exp51391); 
					pushFollow(FOLLOW_primaire_in_exp51393);
					primaire();
					state._fsp--;

					 PtGen.pt(4); PtGen.pt(106); 
					}
					break;
				case 2 :
					// projet.g:88:24: 'div' primaire
					{
					 PtGen.pt(4); 
					match(input,31,FOLLOW_31_in_exp51422); 
					pushFollow(FOLLOW_primaire_in_exp51424);
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
	// projet.g:89:1: primaire : ( valeur | ident | '(' expression ')' );
	public final void primaire() throws RecognitionException {
		try {
			// projet.g:89:12: ( valeur | ident | '(' expression ')' )
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
					// projet.g:89:14: valeur
					{
					pushFollow(FOLLOW_valeur_in_primaire1438);
					valeur();
					state._fsp--;

					 PtGen.pt(104); 
					}
					break;
				case 2 :
					// projet.g:90:14: ident
					{
					pushFollow(FOLLOW_ident_in_primaire1455);
					ident();
					state._fsp--;

					 PtGen.pt(1); PtGen.pt(105); 
					}
					break;
				case 3 :
					// projet.g:91:14: '(' expression ')'
					{
					match(input,9,FOLLOW_9_in_primaire1472); 
					pushFollow(FOLLOW_expression_in_primaire1474);
					expression();
					state._fsp--;

					match(input,10,FOLLOW_10_in_primaire1476); 
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
	// projet.g:92:1: valeur : ( nbentier | '+' nbentier | '-' nbentier | 'vrai' | 'faux' );
	public final void valeur() throws RecognitionException {
		try {
			// projet.g:92:12: ( nbentier | '+' nbentier | '-' nbentier | 'vrai' | 'faux' )
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
					// projet.g:92:14: nbentier
					{
					pushFollow(FOLLOW_nbentier_in_valeur1487);
					nbentier();
					state._fsp--;

					 PtGen.pt(2); PtGen.pt(101); 
					}
					break;
				case 2 :
					// projet.g:93:14: '+' nbentier
					{
					match(input,12,FOLLOW_12_in_valeur1504); 
					pushFollow(FOLLOW_nbentier_in_valeur1506);
					nbentier();
					state._fsp--;

					 PtGen.pt(2); PtGen.pt(101); 
					}
					break;
				case 3 :
					// projet.g:94:14: '-' nbentier
					{
					match(input,14,FOLLOW_14_in_valeur1523); 
					 PtGen.pt(100); 
					pushFollow(FOLLOW_nbentier_in_valeur1527);
					nbentier();
					state._fsp--;

					 PtGen.pt(2); PtGen.pt(101); 
					}
					break;
				case 4 :
					// projet.g:95:14: 'vrai'
					{
					match(input,54,FOLLOW_54_in_valeur1544); 
					 PtGen.pt(3); PtGen.pt(102); 
					}
					break;
				case 5 :
					// projet.g:96:14: 'faux'
					{
					match(input,37,FOLLOW_37_in_valeur1561); 
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
	// projet.g:105:1: nbentier : INT ;
	public final void nbentier() throws RecognitionException {
		Token INT1=null;

		try {
			// projet.g:105:11: ( INT )
			// projet.g:105:15: INT
			{
			INT1=(Token)match(input,INT,FOLLOW_INT_in_nbentier1588); 
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
	// projet.g:107:1: ident : ID ;
	public final void ident() throws RecognitionException {
		Token ID2=null;

		try {
			// projet.g:107:7: ( ID )
			// projet.g:107:9: ID
			{
			ID2=(Token)match(input,ID,FOLLOW_ID_in_ident1599); 
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
	public static final BitSet FOLLOW_decproc_in_decprocs392 = new BitSet(new long[]{0x0000800000020000L});
	public static final BitSet FOLLOW_ptvg_in_decprocs394 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_47_in_decproc406 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_decproc408 = new BitSet(new long[]{0x0020090030000000L});
	public static final BitSet FOLLOW_parfixe_in_decproc412 = new BitSet(new long[]{0x0020080030000000L});
	public static final BitSet FOLLOW_parmod_in_decproc415 = new BitSet(new long[]{0x0020000030000000L});
	public static final BitSet FOLLOW_consts_in_decproc418 = new BitSet(new long[]{0x0020000020000000L});
	public static final BitSet FOLLOW_vars_in_decproc421 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_corps_in_decproc426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_ptvg439 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_parfixe449 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_parfixe451 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_pf_in_parfixe453 = new BitSet(new long[]{0x0000000000020400L});
	public static final BitSet FOLLOW_17_in_parfixe457 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_pf_in_parfixe459 = new BitSet(new long[]{0x0000000000020400L});
	public static final BitSet FOLLOW_10_in_parfixe463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_pf476 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_pf478 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_13_in_pf484 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_pf486 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_43_in_parmod500 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_parmod502 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_pm_in_parmod504 = new BitSet(new long[]{0x0000000000020400L});
	public static final BitSet FOLLOW_17_in_parmod508 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_pm_in_parmod510 = new BitSet(new long[]{0x0000000000020400L});
	public static final BitSet FOLLOW_10_in_parmod514 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_pm527 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_pm529 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_13_in_pm535 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_pm537 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_29_in_corps557 = new BitSet(new long[]{0x0014040108000020L});
	public static final BitSet FOLLOW_instructions_in_corps559 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_corps561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructions568 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_instructions572 = new BitSet(new long[]{0x0014040108000020L});
	public static final BitSet FOLLOW_instruction_in_instructions574 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_inssi_in_instruction584 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inscond_in_instruction588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boucle_in_instruction592 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lecture_in_instruction596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ecriture_in_instruction600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_affouappel_in_instruction604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_inssi618 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_inssi620 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_inssi639 = new BitSet(new long[]{0x0014040108000020L});
	public static final BitSet FOLLOW_instructions_in_inssi641 = new BitSet(new long[]{0x0008020000000000L});
	public static final BitSet FOLLOW_51_in_inssi644 = new BitSet(new long[]{0x0014040108000020L});
	public static final BitSet FOLLOW_instructions_in_inssi648 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_inssi667 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_inscond681 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_inscond683 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_inscond687 = new BitSet(new long[]{0x0014040108000020L});
	public static final BitSet FOLLOW_instructions_in_inscond711 = new BitSet(new long[]{0x0000004002002000L});
	public static final BitSet FOLLOW_13_in_inscond732 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_inscond735 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_inscond739 = new BitSet(new long[]{0x0014040108000020L});
	public static final BitSet FOLLOW_instructions_in_inscond763 = new BitSet(new long[]{0x0000004002002000L});
	public static final BitSet FOLLOW_25_in_inscond787 = new BitSet(new long[]{0x0014040108000020L});
	public static final BitSet FOLLOW_instructions_in_inscond789 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_inscond795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_boucle808 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_boucle812 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_boucle831 = new BitSet(new long[]{0x0014040108000020L});
	public static final BitSet FOLLOW_instructions_in_boucle833 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_boucle837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_lecture849 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_lecture851 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_lecture853 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_13_in_lecture879 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_lecture881 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_10_in_lecture888 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_ecriture899 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_ecriture901 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_ecriture903 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_13_in_ecriture931 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_ecriture933 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_10_in_ecriture940 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_affouappel949 = new BitSet(new long[]{0x0000000000010202L});
	public static final BitSet FOLLOW_16_in_affouappel955 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_affouappel959 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_effixes_in_affouappel990 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_effmods_in_affouappel993 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_effixes1013 = new BitSet(new long[]{0x0040202000005660L});
	public static final BitSet FOLLOW_expression_in_effixes1016 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_13_in_effixes1021 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_effixes1023 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_10_in_effixes1032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_effmods1043 = new BitSet(new long[]{0x0000000000000420L});
	public static final BitSet FOLLOW_ident_in_effmods1046 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_13_in_effmods1065 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_effmods1067 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_10_in_effmods1076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp1_in_expression1086 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_46_in_expression1092 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_exp1_in_expression1094 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_exp2_in_exp11112 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_34_in_exp11117 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_exp2_in_exp11119 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_45_in_exp21137 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_exp2_in_exp21139 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp3_in_exp21156 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp4_in_exp31169 = new BitSet(new long[]{0x0000000000FC0002L});
	public static final BitSet FOLLOW_21_in_exp31174 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp4_in_exp31177 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_exp31202 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp4_in_exp31204 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_exp31229 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp4_in_exp31232 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_exp31257 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp4_in_exp31259 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_exp31284 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp4_in_exp31287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_exp31312 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp4_in_exp31314 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp5_in_exp41332 = new BitSet(new long[]{0x0000000000005002L});
	public static final BitSet FOLLOW_12_in_exp41337 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp5_in_exp41340 = new BitSet(new long[]{0x0000000000005002L});
	public static final BitSet FOLLOW_14_in_exp41365 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp5_in_exp41368 = new BitSet(new long[]{0x0000000000005002L});
	public static final BitSet FOLLOW_primaire_in_exp51386 = new BitSet(new long[]{0x0000000080000802L});
	public static final BitSet FOLLOW_11_in_exp51391 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_primaire_in_exp51393 = new BitSet(new long[]{0x0000000080000802L});
	public static final BitSet FOLLOW_31_in_exp51422 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_primaire_in_exp51424 = new BitSet(new long[]{0x0000000080000802L});
	public static final BitSet FOLLOW_valeur_in_primaire1438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_primaire1455 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_primaire1472 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_primaire1474 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_primaire1476 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nbentier_in_valeur1487 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_valeur1504 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_nbentier_in_valeur1506 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_valeur1523 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_nbentier_in_valeur1527 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_valeur1544 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_valeur1561 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_nbentier1588 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_ident1599 = new BitSet(new long[]{0x0000000000000002L});
}
