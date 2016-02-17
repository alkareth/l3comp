// $ANTLR 3.5.2 projet.g 2016-02-17 23:06:32
           
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

			pushFollow(FOLLOW_corps_in_unitprog100);
			corps();
			state._fsp--;

			 System.out.println("succès, arret de la compilation "); 
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
			match(input,44,FOLLOW_44_in_unitmodule109); 
			pushFollow(FOLLOW_ident_in_unitmodule111);
			ident();
			state._fsp--;

			match(input,15,FOLLOW_15_in_unitmodule113); 
			pushFollow(FOLLOW_declarations_in_unitmodule115);
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
					pushFollow(FOLLOW_partiedef_in_declarations123);
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
					pushFollow(FOLLOW_partieref_in_declarations126);
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
					pushFollow(FOLLOW_consts_in_declarations129);
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
					pushFollow(FOLLOW_vars_in_declarations132);
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
					pushFollow(FOLLOW_decprocs_in_declarations135);
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
			match(input,30,FOLLOW_30_in_partiedef147); 
			pushFollow(FOLLOW_ident_in_partiedef149);
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
					match(input,13,FOLLOW_13_in_partiedef153); 
					pushFollow(FOLLOW_ident_in_partiedef155);
					ident();
					state._fsp--;

					}
					break;

				default :
					break loop7;
				}
			}

			pushFollow(FOLLOW_ptvg_in_partiedef160);
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
			pushFollow(FOLLOW_ident_in_specif197);
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
					match(input,40,FOLLOW_40_in_specif201); 
					match(input,9,FOLLOW_9_in_specif203); 
					pushFollow(FOLLOW_type_in_specif205);
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
							match(input,13,FOLLOW_13_in_specif209); 
							pushFollow(FOLLOW_type_in_specif211);
							type();
							state._fsp--;

							}
							break;

						default :
							break loop9;
						}
					}

					match(input,10,FOLLOW_10_in_specif217); 
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
					match(input,43,FOLLOW_43_in_specif246); 
					match(input,9,FOLLOW_9_in_specif249); 
					pushFollow(FOLLOW_type_in_specif251);
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
							match(input,13,FOLLOW_13_in_specif255); 
							pushFollow(FOLLOW_type_in_specif257);
							type();
							state._fsp--;

							}
							break;

						default :
							break loop11;
						}
					}

					match(input,10,FOLLOW_10_in_specif263); 
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
			match(input,28,FOLLOW_28_in_consts280); 
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
					pushFollow(FOLLOW_ident_in_consts284);
					ident();
					state._fsp--;

					 PtGen.pt(1); 
					match(input,21,FOLLOW_21_in_consts288); 
					pushFollow(FOLLOW_valeur_in_consts290);
					valeur();
					state._fsp--;

					 PtGen.pt(2); 
					pushFollow(FOLLOW_ptvg_in_consts294);
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
			match(input,53,FOLLOW_53_in_vars313); 
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
					pushFollow(FOLLOW_type_in_vars317);
					type();
					state._fsp--;

					pushFollow(FOLLOW_ident_in_vars319);
					ident();
					state._fsp--;

					 PtGen.pt(1); PtGen.pt(7); 
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
							match(input,13,FOLLOW_13_in_vars346); 
							pushFollow(FOLLOW_ident_in_vars349);
							ident();
							state._fsp--;

							 PtGen.pt(1); PtGen.pt(7); 
							}
							break;

						default :
							break loop14;
						}
					}

					pushFollow(FOLLOW_ptvg_in_vars356);
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

			 PtGen.pt(8); 
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
					match(input,33,FOLLOW_33_in_type377); 
					 PtGen.pt(9); 
					}
					break;
				case 2 :
					// projet.g:42:41: 'bool'
					{
					match(input,26,FOLLOW_26_in_type383); 
					 PtGen.pt(10); 
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
	// projet.g:43:1: decprocs : ( decproc ptvg )+ ;
	public final void decprocs() throws RecognitionException {
		try {
			// projet.g:43:14: ( ( decproc ptvg )+ )
			// projet.g:43:16: ( decproc ptvg )+
			{
			// projet.g:43:16: ( decproc ptvg )+
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
					// projet.g:43:17: decproc ptvg
					{
					pushFollow(FOLLOW_decproc_in_decprocs398);
					decproc();
					state._fsp--;

					pushFollow(FOLLOW_ptvg_in_decprocs400);
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
	// projet.g:44:1: decproc : 'proc' ident ( parfixe )? ( parmod )? ( consts )? ( vars )? corps ;
	public final void decproc() throws RecognitionException {
		try {
			// projet.g:44:14: ( 'proc' ident ( parfixe )? ( parmod )? ( consts )? ( vars )? corps )
			// projet.g:44:16: 'proc' ident ( parfixe )? ( parmod )? ( consts )? ( vars )? corps
			{
			match(input,47,FOLLOW_47_in_decproc414); 
			pushFollow(FOLLOW_ident_in_decproc416);
			ident();
			state._fsp--;

			// projet.g:44:29: ( parfixe )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==40) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// projet.g:44:29: parfixe
					{
					pushFollow(FOLLOW_parfixe_in_decproc418);
					parfixe();
					state._fsp--;

					}
					break;

			}

			// projet.g:44:38: ( parmod )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==43) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// projet.g:44:38: parmod
					{
					pushFollow(FOLLOW_parmod_in_decproc421);
					parmod();
					state._fsp--;

					}
					break;

			}

			// projet.g:44:46: ( consts )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==28) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// projet.g:44:46: consts
					{
					pushFollow(FOLLOW_consts_in_decproc424);
					consts();
					state._fsp--;

					}
					break;

			}

			// projet.g:44:54: ( vars )?
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==53) ) {
				alt21=1;
			}
			switch (alt21) {
				case 1 :
					// projet.g:44:54: vars
					{
					pushFollow(FOLLOW_vars_in_decproc427);
					vars();
					state._fsp--;

					}
					break;

			}

			pushFollow(FOLLOW_corps_in_decproc430);
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
	// projet.g:45:1: ptvg : ( ';' |);
	public final void ptvg() throws RecognitionException {
		try {
			// projet.g:45:14: ( ';' |)
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
					// projet.g:45:16: ';'
					{
					match(input,17,FOLLOW_17_in_ptvg445); 
					}
					break;
				case 2 :
					// projet.g:45:22: 
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



	// $ANTLR start "corps"
	// projet.g:47:1: corps : 'debut' instructions 'fin' ;
	public final void corps() throws RecognitionException {
		try {
			// projet.g:47:7: ( 'debut' instructions 'fin' )
			// projet.g:47:9: 'debut' instructions 'fin'
			{
			match(input,29,FOLLOW_29_in_corps458); 
			pushFollow(FOLLOW_instructions_in_corps460);
			instructions();
			state._fsp--;

			match(input,39,FOLLOW_39_in_corps462); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "corps"



	// $ANTLR start "parfixe"
	// projet.g:50:1: parfixe : 'fixe' '(' pf ( ';' pf )* ')' ;
	public final void parfixe() throws RecognitionException {
		try {
			// projet.g:50:8: ( 'fixe' '(' pf ( ';' pf )* ')' )
			// projet.g:50:10: 'fixe' '(' pf ( ';' pf )* ')'
			{
			match(input,40,FOLLOW_40_in_parfixe474); 
			match(input,9,FOLLOW_9_in_parfixe476); 
			pushFollow(FOLLOW_pf_in_parfixe478);
			pf();
			state._fsp--;

			// projet.g:50:24: ( ';' pf )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==17) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// projet.g:50:26: ';' pf
					{
					match(input,17,FOLLOW_17_in_parfixe482); 
					pushFollow(FOLLOW_pf_in_parfixe484);
					pf();
					state._fsp--;

					}
					break;

				default :
					break loop23;
				}
			}

			match(input,10,FOLLOW_10_in_parfixe488); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parfixe"



	// $ANTLR start "pf"
	// projet.g:53:1: pf : type ident ( ',' ident )* ;
	public final void pf() throws RecognitionException {
		try {
			// projet.g:53:5: ( type ident ( ',' ident )* )
			// projet.g:53:7: type ident ( ',' ident )*
			{
			pushFollow(FOLLOW_type_in_pf502);
			type();
			state._fsp--;

			pushFollow(FOLLOW_ident_in_pf504);
			ident();
			state._fsp--;

			// projet.g:53:19: ( ',' ident )*
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( (LA24_0==13) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// projet.g:53:21: ',' ident
					{
					match(input,13,FOLLOW_13_in_pf509); 
					pushFollow(FOLLOW_ident_in_pf511);
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
	// projet.g:56:1: parmod : 'mod' '(' pm ( ';' pm )* ')' ;
	public final void parmod() throws RecognitionException {
		try {
			// projet.g:56:9: ( 'mod' '(' pm ( ';' pm )* ')' )
			// projet.g:56:11: 'mod' '(' pm ( ';' pm )* ')'
			{
			match(input,43,FOLLOW_43_in_parmod529); 
			match(input,9,FOLLOW_9_in_parmod531); 
			pushFollow(FOLLOW_pm_in_parmod533);
			pm();
			state._fsp--;

			// projet.g:56:24: ( ';' pm )*
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( (LA25_0==17) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// projet.g:56:26: ';' pm
					{
					match(input,17,FOLLOW_17_in_parmod537); 
					pushFollow(FOLLOW_pm_in_parmod539);
					pm();
					state._fsp--;

					}
					break;

				default :
					break loop25;
				}
			}

			match(input,10,FOLLOW_10_in_parmod543); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "parmod"



	// $ANTLR start "pm"
	// projet.g:59:1: pm : type ident ( ',' ident )* ;
	public final void pm() throws RecognitionException {
		try {
			// projet.g:59:5: ( type ident ( ',' ident )* )
			// projet.g:59:7: type ident ( ',' ident )*
			{
			pushFollow(FOLLOW_type_in_pm557);
			type();
			state._fsp--;

			pushFollow(FOLLOW_ident_in_pm559);
			ident();
			state._fsp--;

			// projet.g:59:19: ( ',' ident )*
			loop26:
			while (true) {
				int alt26=2;
				int LA26_0 = input.LA(1);
				if ( (LA26_0==13) ) {
					alt26=1;
				}

				switch (alt26) {
				case 1 :
					// projet.g:59:21: ',' ident
					{
					match(input,13,FOLLOW_13_in_pm564); 
					pushFollow(FOLLOW_ident_in_pm566);
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



	// $ANTLR start "instructions"
	// projet.g:62:1: instructions : instruction ( ';' instruction )* ;
	public final void instructions() throws RecognitionException {
		try {
			// projet.g:63:3: ( instruction ( ';' instruction )* )
			// projet.g:63:5: instruction ( ';' instruction )*
			{
			pushFollow(FOLLOW_instruction_in_instructions585);
			instruction();
			state._fsp--;

			// projet.g:63:17: ( ';' instruction )*
			loop27:
			while (true) {
				int alt27=2;
				int LA27_0 = input.LA(1);
				if ( (LA27_0==17) ) {
					alt27=1;
				}

				switch (alt27) {
				case 1 :
					// projet.g:63:19: ';' instruction
					{
					match(input,17,FOLLOW_17_in_instructions589); 
					pushFollow(FOLLOW_instruction_in_instructions591);
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
	// projet.g:66:1: instruction : ( inssi | inscond | boucle | lecture | ecriture | affouappel |);
	public final void instruction() throws RecognitionException {
		try {
			// projet.g:67:3: ( inssi | inscond | boucle | lecture | ecriture | affouappel |)
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
					// projet.g:67:5: inssi
					{
					pushFollow(FOLLOW_inssi_in_instruction608);
					inssi();
					state._fsp--;

					}
					break;
				case 2 :
					// projet.g:68:5: inscond
					{
					pushFollow(FOLLOW_inscond_in_instruction614);
					inscond();
					state._fsp--;

					}
					break;
				case 3 :
					// projet.g:69:5: boucle
					{
					pushFollow(FOLLOW_boucle_in_instruction620);
					boucle();
					state._fsp--;

					}
					break;
				case 4 :
					// projet.g:70:5: lecture
					{
					pushFollow(FOLLOW_lecture_in_instruction626);
					lecture();
					state._fsp--;

					}
					break;
				case 5 :
					// projet.g:71:5: ecriture
					{
					pushFollow(FOLLOW_ecriture_in_instruction632);
					ecriture();
					state._fsp--;

					}
					break;
				case 6 :
					// projet.g:72:5: affouappel
					{
					pushFollow(FOLLOW_affouappel_in_instruction638);
					affouappel();
					state._fsp--;

					}
					break;
				case 7 :
					// projet.g:74:3: 
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
	// projet.g:76:1: inssi : 'si' expression 'alors' instructions ( 'sinon' instructions )? 'fsi' ;
	public final void inssi() throws RecognitionException {
		try {
			// projet.g:76:7: ( 'si' expression 'alors' instructions ( 'sinon' instructions )? 'fsi' )
			// projet.g:76:9: 'si' expression 'alors' instructions ( 'sinon' instructions )? 'fsi'
			{
			match(input,50,FOLLOW_50_in_inssi655); 
			pushFollow(FOLLOW_expression_in_inssi657);
			expression();
			state._fsp--;

			match(input,24,FOLLOW_24_in_inssi659); 
			pushFollow(FOLLOW_instructions_in_inssi661);
			instructions();
			state._fsp--;

			// projet.g:76:46: ( 'sinon' instructions )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==51) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// projet.g:76:47: 'sinon' instructions
					{
					match(input,51,FOLLOW_51_in_inssi664); 
					pushFollow(FOLLOW_instructions_in_inssi667);
					instructions();
					state._fsp--;

					}
					break;

			}

			match(input,41,FOLLOW_41_in_inssi671); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "inssi"



	// $ANTLR start "inscond"
	// projet.g:79:1: inscond : 'cond' expression ':' instructions ( ',' expression ':' instructions )* ( 'aut' instructions )? 'fcond' ;
	public final void inscond() throws RecognitionException {
		try {
			// projet.g:79:9: ( 'cond' expression ':' instructions ( ',' expression ':' instructions )* ( 'aut' instructions )? 'fcond' )
			// projet.g:79:11: 'cond' expression ':' instructions ( ',' expression ':' instructions )* ( 'aut' instructions )? 'fcond'
			{
			match(input,27,FOLLOW_27_in_inscond685); 
			pushFollow(FOLLOW_expression_in_inscond688);
			expression();
			state._fsp--;

			match(input,15,FOLLOW_15_in_inscond691); 
			pushFollow(FOLLOW_instructions_in_inscond693);
			instructions();
			state._fsp--;

			// projet.g:80:11: ( ',' expression ':' instructions )*
			loop30:
			while (true) {
				int alt30=2;
				int LA30_0 = input.LA(1);
				if ( (LA30_0==13) ) {
					alt30=1;
				}

				switch (alt30) {
				case 1 :
					// projet.g:80:12: ',' expression ':' instructions
					{
					match(input,13,FOLLOW_13_in_inscond707); 
					pushFollow(FOLLOW_expression_in_inscond710);
					expression();
					state._fsp--;

					match(input,15,FOLLOW_15_in_inscond713); 
					pushFollow(FOLLOW_instructions_in_inscond715);
					instructions();
					state._fsp--;

					}
					break;

				default :
					break loop30;
				}
			}

			// projet.g:81:11: ( 'aut' instructions )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==25) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// projet.g:81:12: 'aut' instructions
					{
					match(input,25,FOLLOW_25_in_inscond732); 
					pushFollow(FOLLOW_instructions_in_inscond735);
					instructions();
					state._fsp--;

					}
					break;

			}

			match(input,38,FOLLOW_38_in_inscond739); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "inscond"



	// $ANTLR start "boucle"
	// projet.g:84:1: boucle : 'ttq' expression 'faire' instructions 'fait' ;
	public final void boucle() throws RecognitionException {
		try {
			// projet.g:84:9: ( 'ttq' expression 'faire' instructions 'fait' )
			// projet.g:84:11: 'ttq' expression 'faire' instructions 'fait'
			{
			match(input,52,FOLLOW_52_in_boucle754); 
			pushFollow(FOLLOW_expression_in_boucle757);
			expression();
			state._fsp--;

			match(input,35,FOLLOW_35_in_boucle759); 
			pushFollow(FOLLOW_instructions_in_boucle761);
			instructions();
			state._fsp--;

			match(input,36,FOLLOW_36_in_boucle763); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "boucle"



	// $ANTLR start "lecture"
	// projet.g:87:1: lecture : 'lire' '(' ident ( ',' ident )* ')' ;
	public final void lecture() throws RecognitionException {
		try {
			// projet.g:87:8: ( 'lire' '(' ident ( ',' ident )* ')' )
			// projet.g:87:10: 'lire' '(' ident ( ',' ident )* ')'
			{
			match(input,42,FOLLOW_42_in_lecture776); 
			match(input,9,FOLLOW_9_in_lecture778); 
			pushFollow(FOLLOW_ident_in_lecture780);
			ident();
			state._fsp--;

			// projet.g:87:28: ( ',' ident )*
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( (LA32_0==13) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// projet.g:87:30: ',' ident
					{
					match(input,13,FOLLOW_13_in_lecture785); 
					pushFollow(FOLLOW_ident_in_lecture787);
					ident();
					state._fsp--;

					}
					break;

				default :
					break loop32;
				}
			}

			match(input,10,FOLLOW_10_in_lecture793); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "lecture"



	// $ANTLR start "ecriture"
	// projet.g:90:1: ecriture : 'ecrire' '(' expression ( ',' expression )* ')' ;
	public final void ecriture() throws RecognitionException {
		try {
			// projet.g:90:9: ( 'ecrire' '(' expression ( ',' expression )* ')' )
			// projet.g:90:11: 'ecrire' '(' expression ( ',' expression )* ')'
			{
			match(input,32,FOLLOW_32_in_ecriture806); 
			match(input,9,FOLLOW_9_in_ecriture808); 
			pushFollow(FOLLOW_expression_in_ecriture810);
			expression();
			state._fsp--;

			// projet.g:90:36: ( ',' expression )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( (LA33_0==13) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// projet.g:90:38: ',' expression
					{
					match(input,13,FOLLOW_13_in_ecriture815); 
					pushFollow(FOLLOW_expression_in_ecriture817);
					expression();
					state._fsp--;

					}
					break;

				default :
					break loop33;
				}
			}

			match(input,10,FOLLOW_10_in_ecriture823); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ecriture"



	// $ANTLR start "affouappel"
	// projet.g:93:1: affouappel : ident ( ':=' expression | ( effixes ( effmods )? )? ) ;
	public final void affouappel() throws RecognitionException {
		try {
			// projet.g:94:3: ( ident ( ':=' expression | ( effixes ( effmods )? )? ) )
			// projet.g:94:5: ident ( ':=' expression | ( effixes ( effmods )? )? )
			{
			pushFollow(FOLLOW_ident_in_affouappel839);
			ident();
			state._fsp--;

			// projet.g:94:12: ( ':=' expression | ( effixes ( effmods )? )? )
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
					// projet.g:94:17: ':=' expression
					{
					match(input,16,FOLLOW_16_in_affouappel847); 
					pushFollow(FOLLOW_expression_in_affouappel849);
					expression();
					state._fsp--;

					}
					break;
				case 2 :
					// projet.g:95:17: ( effixes ( effmods )? )?
					{
					// projet.g:95:17: ( effixes ( effmods )? )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==9) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// projet.g:95:18: effixes ( effmods )?
							{
							pushFollow(FOLLOW_effixes_in_affouappel869);
							effixes();
							state._fsp--;

							// projet.g:95:26: ( effmods )?
							int alt34=2;
							int LA34_0 = input.LA(1);
							if ( (LA34_0==9) ) {
								alt34=1;
							}
							switch (alt34) {
								case 1 :
									// projet.g:95:27: effmods
									{
									pushFollow(FOLLOW_effmods_in_affouappel872);
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
	// projet.g:99:1: effixes : '(' ( expression ( ',' expression )* )? ')' ;
	public final void effixes() throws RecognitionException {
		try {
			// projet.g:99:9: ( '(' ( expression ( ',' expression )* )? ')' )
			// projet.g:99:11: '(' ( expression ( ',' expression )* )? ')'
			{
			match(input,9,FOLLOW_9_in_effixes904); 
			// projet.g:99:15: ( expression ( ',' expression )* )?
			int alt38=2;
			int LA38_0 = input.LA(1);
			if ( ((LA38_0 >= ID && LA38_0 <= INT)||LA38_0==9||LA38_0==12||LA38_0==14||LA38_0==37||LA38_0==45||LA38_0==54) ) {
				alt38=1;
			}
			switch (alt38) {
				case 1 :
					// projet.g:99:16: expression ( ',' expression )*
					{
					pushFollow(FOLLOW_expression_in_effixes907);
					expression();
					state._fsp--;

					// projet.g:99:28: ( ',' expression )*
					loop37:
					while (true) {
						int alt37=2;
						int LA37_0 = input.LA(1);
						if ( (LA37_0==13) ) {
							alt37=1;
						}

						switch (alt37) {
						case 1 :
							// projet.g:99:29: ',' expression
							{
							match(input,13,FOLLOW_13_in_effixes911); 
							pushFollow(FOLLOW_expression_in_effixes913);
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

			match(input,10,FOLLOW_10_in_effixes921); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "effixes"



	// $ANTLR start "effmods"
	// projet.g:102:1: effmods : '(' ( ident ( ',' ident )* )? ')' ;
	public final void effmods() throws RecognitionException {
		try {
			// projet.g:102:9: ( '(' ( ident ( ',' ident )* )? ')' )
			// projet.g:102:10: '(' ( ident ( ',' ident )* )? ')'
			{
			match(input,9,FOLLOW_9_in_effmods933); 
			// projet.g:102:14: ( ident ( ',' ident )* )?
			int alt40=2;
			int LA40_0 = input.LA(1);
			if ( (LA40_0==ID) ) {
				alt40=1;
			}
			switch (alt40) {
				case 1 :
					// projet.g:102:15: ident ( ',' ident )*
					{
					pushFollow(FOLLOW_ident_in_effmods936);
					ident();
					state._fsp--;

					// projet.g:102:22: ( ',' ident )*
					loop39:
					while (true) {
						int alt39=2;
						int LA39_0 = input.LA(1);
						if ( (LA39_0==13) ) {
							alt39=1;
						}

						switch (alt39) {
						case 1 :
							// projet.g:102:23: ',' ident
							{
							match(input,13,FOLLOW_13_in_effmods940); 
							pushFollow(FOLLOW_ident_in_effmods942);
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

			match(input,10,FOLLOW_10_in_effmods950); 
			}

		}

		    catch (RecognitionException e) {reportError (e); throw e;}

		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "effmods"



	// $ANTLR start "expression"
	// projet.g:105:1: expression : ( exp1 ) ( 'ou' exp1 )* ;
	public final void expression() throws RecognitionException {
		try {
			// projet.g:105:11: ( ( exp1 ) ( 'ou' exp1 )* )
			// projet.g:105:13: ( exp1 ) ( 'ou' exp1 )*
			{
			// projet.g:105:13: ( exp1 )
			// projet.g:105:14: exp1
			{
			pushFollow(FOLLOW_exp1_in_expression964);
			exp1();
			state._fsp--;

			}

			// projet.g:105:20: ( 'ou' exp1 )*
			loop41:
			while (true) {
				int alt41=2;
				int LA41_0 = input.LA(1);
				if ( (LA41_0==46) ) {
					alt41=1;
				}

				switch (alt41) {
				case 1 :
					// projet.g:105:21: 'ou' exp1
					{
					match(input,46,FOLLOW_46_in_expression968); 
					pushFollow(FOLLOW_exp1_in_expression971);
					exp1();
					state._fsp--;

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
	// projet.g:108:1: exp1 : exp2 ( 'et' exp2 )* ;
	public final void exp1() throws RecognitionException {
		try {
			// projet.g:108:7: ( exp2 ( 'et' exp2 )* )
			// projet.g:108:9: exp2 ( 'et' exp2 )*
			{
			pushFollow(FOLLOW_exp2_in_exp1989);
			exp2();
			state._fsp--;

			// projet.g:108:14: ( 'et' exp2 )*
			loop42:
			while (true) {
				int alt42=2;
				int LA42_0 = input.LA(1);
				if ( (LA42_0==34) ) {
					alt42=1;
				}

				switch (alt42) {
				case 1 :
					// projet.g:108:15: 'et' exp2
					{
					match(input,34,FOLLOW_34_in_exp1992); 
					pushFollow(FOLLOW_exp2_in_exp1995);
					exp2();
					state._fsp--;

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
	// projet.g:111:1: exp2 : ( 'non' exp2 | exp3 );
	public final void exp2() throws RecognitionException {
		try {
			// projet.g:111:7: ( 'non' exp2 | exp3 )
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
					// projet.g:111:9: 'non' exp2
					{
					match(input,45,FOLLOW_45_in_exp21013); 
					pushFollow(FOLLOW_exp2_in_exp21015);
					exp2();
					state._fsp--;

					}
					break;
				case 2 :
					// projet.g:112:5: exp3
					{
					pushFollow(FOLLOW_exp3_in_exp21022);
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
	// projet.g:115:1: exp3 : exp4 ( '=' exp4 | '<>' exp4 | '>' exp4 | '>=' exp4 | '<' exp4 | '<=' exp4 )? ;
	public final void exp3() throws RecognitionException {
		try {
			// projet.g:115:7: ( exp4 ( '=' exp4 | '<>' exp4 | '>' exp4 | '>=' exp4 | '<' exp4 | '<=' exp4 )? )
			// projet.g:115:9: exp4 ( '=' exp4 | '<>' exp4 | '>' exp4 | '>=' exp4 | '<' exp4 | '<=' exp4 )?
			{
			pushFollow(FOLLOW_exp4_in_exp31038);
			exp4();
			state._fsp--;

			// projet.g:116:3: ( '=' exp4 | '<>' exp4 | '>' exp4 | '>=' exp4 | '<' exp4 | '<=' exp4 )?
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
					// projet.g:116:5: '=' exp4
					{
					match(input,21,FOLLOW_21_in_exp31045); 
					pushFollow(FOLLOW_exp4_in_exp31049);
					exp4();
					state._fsp--;

					}
					break;
				case 2 :
					// projet.g:117:5: '<>' exp4
					{
					match(input,20,FOLLOW_20_in_exp31056); 
					pushFollow(FOLLOW_exp4_in_exp31059);
					exp4();
					state._fsp--;

					}
					break;
				case 3 :
					// projet.g:118:5: '>' exp4
					{
					match(input,22,FOLLOW_22_in_exp31066); 
					pushFollow(FOLLOW_exp4_in_exp31070);
					exp4();
					state._fsp--;

					}
					break;
				case 4 :
					// projet.g:119:5: '>=' exp4
					{
					match(input,23,FOLLOW_23_in_exp31077); 
					pushFollow(FOLLOW_exp4_in_exp31080);
					exp4();
					state._fsp--;

					}
					break;
				case 5 :
					// projet.g:120:5: '<' exp4
					{
					match(input,18,FOLLOW_18_in_exp31087); 
					pushFollow(FOLLOW_exp4_in_exp31091);
					exp4();
					state._fsp--;

					}
					break;
				case 6 :
					// projet.g:121:5: '<=' exp4
					{
					match(input,19,FOLLOW_19_in_exp31098); 
					pushFollow(FOLLOW_exp4_in_exp31101);
					exp4();
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
	// $ANTLR end "exp3"



	// $ANTLR start "exp4"
	// projet.g:125:1: exp4 : exp5 ( '+' exp5 | '-' exp5 )* ;
	public final void exp4() throws RecognitionException {
		try {
			// projet.g:125:7: ( exp5 ( '+' exp5 | '-' exp5 )* )
			// projet.g:125:9: exp5 ( '+' exp5 | '-' exp5 )*
			{
			pushFollow(FOLLOW_exp5_in_exp41123);
			exp5();
			state._fsp--;

			// projet.g:126:9: ( '+' exp5 | '-' exp5 )*
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
					// projet.g:126:10: '+' exp5
					{
					match(input,12,FOLLOW_12_in_exp41135); 
					pushFollow(FOLLOW_exp5_in_exp41138);
					exp5();
					state._fsp--;

					}
					break;
				case 2 :
					// projet.g:127:10: '-' exp5
					{
					match(input,14,FOLLOW_14_in_exp41150); 
					pushFollow(FOLLOW_exp5_in_exp41153);
					exp5();
					state._fsp--;

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
	// projet.g:131:1: exp5 : primaire ( '*' primaire | 'div' primaire )* ;
	public final void exp5() throws RecognitionException {
		try {
			// projet.g:131:7: ( primaire ( '*' primaire | 'div' primaire )* )
			// projet.g:131:9: primaire ( '*' primaire | 'div' primaire )*
			{
			pushFollow(FOLLOW_primaire_in_exp51179);
			primaire();
			state._fsp--;

			// projet.g:132:9: ( '*' primaire | 'div' primaire )*
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
					// projet.g:132:14: '*' primaire
					{
					match(input,11,FOLLOW_11_in_exp51195); 
					pushFollow(FOLLOW_primaire_in_exp51199);
					primaire();
					state._fsp--;

					 PtGen.pt(13); 
					}
					break;
				case 2 :
					// projet.g:133:13: 'div' primaire
					{
					match(input,31,FOLLOW_31_in_exp51215); 
					pushFollow(FOLLOW_primaire_in_exp51218);
					primaire();
					state._fsp--;

					 PtGen.pt(14); 
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
	// projet.g:136:1: primaire : ( valeur | ident | '(' expression ')' );
	public final void primaire() throws RecognitionException {
		try {
			// projet.g:136:9: ( valeur | ident | '(' expression ')' )
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
					// projet.g:136:11: valeur
					{
					pushFollow(FOLLOW_valeur_in_primaire1240);
					valeur();
					state._fsp--;

					 PtGen.pt(11); 
					}
					break;
				case 2 :
					// projet.g:137:7: ident
					{
					pushFollow(FOLLOW_ident_in_primaire1250);
					ident();
					state._fsp--;

					 PtGen.pt(1); PtGen.pt(12); PtGen.pt(11); 
					}
					break;
				case 3 :
					// projet.g:138:7: '(' expression ')'
					{
					match(input,9,FOLLOW_9_in_primaire1260); 
					pushFollow(FOLLOW_expression_in_primaire1262);
					expression();
					state._fsp--;

					match(input,10,FOLLOW_10_in_primaire1264); 
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
	// projet.g:139:1: valeur : ( nbentier | '+' nbentier | '-' nbentier | 'vrai' | 'faux' );
	public final void valeur() throws RecognitionException {
		try {
			// projet.g:139:9: ( nbentier | '+' nbentier | '-' nbentier | 'vrai' | 'faux' )
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
					// projet.g:139:11: nbentier
					{
					pushFollow(FOLLOW_nbentier_in_valeur1272);
					nbentier();
					state._fsp--;

					 PtGen.pt(6); 
					}
					break;
				case 2 :
					// projet.g:140:7: '+' nbentier
					{
					match(input,12,FOLLOW_12_in_valeur1282); 
					pushFollow(FOLLOW_nbentier_in_valeur1284);
					nbentier();
					state._fsp--;

					 PtGen.pt(6); 
					}
					break;
				case 3 :
					// projet.g:141:7: '-' nbentier
					{
					match(input,14,FOLLOW_14_in_valeur1294); 
					 PtGen.pt(5); 
					pushFollow(FOLLOW_nbentier_in_valeur1298);
					nbentier();
					state._fsp--;

					 PtGen.pt(6); 
					}
					break;
				case 4 :
					// projet.g:142:7: 'vrai'
					{
					match(input,54,FOLLOW_54_in_valeur1308); 
					 PtGen.pt(10); PtGen.pt(3); 
					}
					break;
				case 5 :
					// projet.g:143:7: 'faux'
					{
					match(input,37,FOLLOW_37_in_valeur1318); 
					 PtGen.pt(10); PtGen.pt(4); 
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
	// projet.g:152:1: nbentier : INT ;
	public final void nbentier() throws RecognitionException {
		Token INT1=null;

		try {
			// projet.g:152:11: ( INT )
			// projet.g:152:15: INT
			{
			INT1=(Token)match(input,INT,FOLLOW_INT_in_nbentier1345); 
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
	// projet.g:154:1: ident : ID ;
	public final void ident() throws RecognitionException {
		Token ID2=null;

		try {
			// projet.g:154:7: ( ID )
			// projet.g:154:9: ID
			{
			ID2=(Token)match(input,ID,FOLLOW_ID_in_ident1356); 
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
	public static final BitSet FOLLOW_corps_in_unitprog100 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_44_in_unitmodule109 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_unitmodule111 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_unitmodule113 = new BitSet(new long[]{0x0022800050000000L});
	public static final BitSet FOLLOW_declarations_in_unitmodule115 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_partiedef_in_declarations123 = new BitSet(new long[]{0x0022800010000002L});
	public static final BitSet FOLLOW_partieref_in_declarations126 = new BitSet(new long[]{0x0020800010000002L});
	public static final BitSet FOLLOW_consts_in_declarations129 = new BitSet(new long[]{0x0020800000000002L});
	public static final BitSet FOLLOW_vars_in_declarations132 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_decprocs_in_declarations135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_30_in_partiedef147 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_partiedef149 = new BitSet(new long[]{0x0000000000022000L});
	public static final BitSet FOLLOW_13_in_partiedef153 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_partiedef155 = new BitSet(new long[]{0x0000000000022000L});
	public static final BitSet FOLLOW_ptvg_in_partiedef160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_49_in_partieref171 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_specif_in_partieref174 = new BitSet(new long[]{0x0000000000022000L});
	public static final BitSet FOLLOW_13_in_partieref177 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_specif_in_partieref179 = new BitSet(new long[]{0x0000000000022000L});
	public static final BitSet FOLLOW_ptvg_in_partieref183 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_specif197 = new BitSet(new long[]{0x0000090000000002L});
	public static final BitSet FOLLOW_40_in_specif201 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_specif203 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_type_in_specif205 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_13_in_specif209 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_type_in_specif211 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_10_in_specif217 = new BitSet(new long[]{0x0000080000000002L});
	public static final BitSet FOLLOW_43_in_specif246 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_specif249 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_type_in_specif251 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_13_in_specif255 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_type_in_specif257 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_10_in_specif263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_28_in_consts280 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_consts284 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_21_in_consts288 = new BitSet(new long[]{0x0040002000005040L});
	public static final BitSet FOLLOW_valeur_in_consts290 = new BitSet(new long[]{0x0000000000020020L});
	public static final BitSet FOLLOW_ptvg_in_consts294 = new BitSet(new long[]{0x0000000000000022L});
	public static final BitSet FOLLOW_53_in_vars313 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_type_in_vars317 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_vars319 = new BitSet(new long[]{0x0000000204022000L});
	public static final BitSet FOLLOW_13_in_vars346 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_vars349 = new BitSet(new long[]{0x0000000204022000L});
	public static final BitSet FOLLOW_ptvg_in_vars356 = new BitSet(new long[]{0x0000000204000002L});
	public static final BitSet FOLLOW_33_in_type377 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_26_in_type383 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_decproc_in_decprocs398 = new BitSet(new long[]{0x0000800000020000L});
	public static final BitSet FOLLOW_ptvg_in_decprocs400 = new BitSet(new long[]{0x0000800000000002L});
	public static final BitSet FOLLOW_47_in_decproc414 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_decproc416 = new BitSet(new long[]{0x0020090030000000L});
	public static final BitSet FOLLOW_parfixe_in_decproc418 = new BitSet(new long[]{0x0020080030000000L});
	public static final BitSet FOLLOW_parmod_in_decproc421 = new BitSet(new long[]{0x0020000030000000L});
	public static final BitSet FOLLOW_consts_in_decproc424 = new BitSet(new long[]{0x0020000020000000L});
	public static final BitSet FOLLOW_vars_in_decproc427 = new BitSet(new long[]{0x0000000020000000L});
	public static final BitSet FOLLOW_corps_in_decproc430 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_ptvg445 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_29_in_corps458 = new BitSet(new long[]{0x0014040108020020L});
	public static final BitSet FOLLOW_instructions_in_corps460 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_39_in_corps462 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_40_in_parfixe474 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_parfixe476 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_pf_in_parfixe478 = new BitSet(new long[]{0x0000000000020400L});
	public static final BitSet FOLLOW_17_in_parfixe482 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_pf_in_parfixe484 = new BitSet(new long[]{0x0000000000020400L});
	public static final BitSet FOLLOW_10_in_parfixe488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_pf502 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_pf504 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_13_in_pf509 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_pf511 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_43_in_parmod529 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_parmod531 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_pm_in_parmod533 = new BitSet(new long[]{0x0000000000020400L});
	public static final BitSet FOLLOW_17_in_parmod537 = new BitSet(new long[]{0x0000000204000000L});
	public static final BitSet FOLLOW_pm_in_parmod539 = new BitSet(new long[]{0x0000000000020400L});
	public static final BitSet FOLLOW_10_in_parmod543 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_type_in_pm557 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_pm559 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_13_in_pm564 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_pm566 = new BitSet(new long[]{0x0000000000002002L});
	public static final BitSet FOLLOW_instruction_in_instructions585 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_17_in_instructions589 = new BitSet(new long[]{0x0014040108020020L});
	public static final BitSet FOLLOW_instruction_in_instructions591 = new BitSet(new long[]{0x0000000000020002L});
	public static final BitSet FOLLOW_inssi_in_instruction608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_inscond_in_instruction614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boucle_in_instruction620 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_lecture_in_instruction626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ecriture_in_instruction632 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_affouappel_in_instruction638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_50_in_inssi655 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_inssi657 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_24_in_inssi659 = new BitSet(new long[]{0x0014040108020020L});
	public static final BitSet FOLLOW_instructions_in_inssi661 = new BitSet(new long[]{0x0008020000000000L});
	public static final BitSet FOLLOW_51_in_inssi664 = new BitSet(new long[]{0x0014040108020020L});
	public static final BitSet FOLLOW_instructions_in_inssi667 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_41_in_inssi671 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_27_in_inscond685 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_inscond688 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_inscond691 = new BitSet(new long[]{0x0014040108020020L});
	public static final BitSet FOLLOW_instructions_in_inscond693 = new BitSet(new long[]{0x0000004002002000L});
	public static final BitSet FOLLOW_13_in_inscond707 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_inscond710 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_15_in_inscond713 = new BitSet(new long[]{0x0014040108020020L});
	public static final BitSet FOLLOW_instructions_in_inscond715 = new BitSet(new long[]{0x0000004002002000L});
	public static final BitSet FOLLOW_25_in_inscond732 = new BitSet(new long[]{0x0014040108020020L});
	public static final BitSet FOLLOW_instructions_in_inscond735 = new BitSet(new long[]{0x0000004000000000L});
	public static final BitSet FOLLOW_38_in_inscond739 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_52_in_boucle754 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_boucle757 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_35_in_boucle759 = new BitSet(new long[]{0x0014040108020020L});
	public static final BitSet FOLLOW_instructions_in_boucle761 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_36_in_boucle763 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_42_in_lecture776 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_lecture778 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_lecture780 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_13_in_lecture785 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_lecture787 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_10_in_lecture793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_32_in_ecriture806 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_9_in_ecriture808 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_ecriture810 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_13_in_ecriture815 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_ecriture817 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_10_in_ecriture823 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_affouappel839 = new BitSet(new long[]{0x0000000000010202L});
	public static final BitSet FOLLOW_16_in_affouappel847 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_affouappel849 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_effixes_in_affouappel869 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_effmods_in_affouappel872 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_effixes904 = new BitSet(new long[]{0x0040202000005660L});
	public static final BitSet FOLLOW_expression_in_effixes907 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_13_in_effixes911 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_effixes913 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_10_in_effixes921 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_effmods933 = new BitSet(new long[]{0x0000000000000420L});
	public static final BitSet FOLLOW_ident_in_effmods936 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_13_in_effmods940 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ident_in_effmods942 = new BitSet(new long[]{0x0000000000002400L});
	public static final BitSet FOLLOW_10_in_effmods950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp1_in_expression964 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_46_in_expression968 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_exp1_in_expression971 = new BitSet(new long[]{0x0000400000000002L});
	public static final BitSet FOLLOW_exp2_in_exp1989 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_34_in_exp1992 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_exp2_in_exp1995 = new BitSet(new long[]{0x0000000400000002L});
	public static final BitSet FOLLOW_45_in_exp21013 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_exp2_in_exp21015 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp3_in_exp21022 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp4_in_exp31038 = new BitSet(new long[]{0x0000000000FC0002L});
	public static final BitSet FOLLOW_21_in_exp31045 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp4_in_exp31049 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_exp31056 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp4_in_exp31059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_exp31066 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp4_in_exp31070 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_exp31077 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp4_in_exp31080 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_exp31087 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp4_in_exp31091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_exp31098 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp4_in_exp31101 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp5_in_exp41123 = new BitSet(new long[]{0x0000000000005002L});
	public static final BitSet FOLLOW_12_in_exp41135 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp5_in_exp41138 = new BitSet(new long[]{0x0000000000005002L});
	public static final BitSet FOLLOW_14_in_exp41150 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_exp5_in_exp41153 = new BitSet(new long[]{0x0000000000005002L});
	public static final BitSet FOLLOW_primaire_in_exp51179 = new BitSet(new long[]{0x0000000080000802L});
	public static final BitSet FOLLOW_11_in_exp51195 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_primaire_in_exp51199 = new BitSet(new long[]{0x0000000080000802L});
	public static final BitSet FOLLOW_31_in_exp51215 = new BitSet(new long[]{0x0040002000005260L});
	public static final BitSet FOLLOW_primaire_in_exp51218 = new BitSet(new long[]{0x0000000080000802L});
	public static final BitSet FOLLOW_valeur_in_primaire1240 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ident_in_primaire1250 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_9_in_primaire1260 = new BitSet(new long[]{0x0040202000005260L});
	public static final BitSet FOLLOW_expression_in_primaire1262 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_primaire1264 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nbentier_in_valeur1272 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_12_in_valeur1282 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_nbentier_in_valeur1284 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_14_in_valeur1294 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_nbentier_in_valeur1298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_54_in_valeur1308 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_37_in_valeur1318 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INT_in_nbentier1345 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_ident1356 = new BitSet(new long[]{0x0000000000000002L});
}
