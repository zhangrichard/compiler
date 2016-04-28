// $ANTLR 3.5.2 Lex.g 2016-04-28 20:19:22

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class Lex extends Lexer {
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ASSIGN=5;
	public static final int CLOSEPAREN=6;
	public static final int COMMENT=7;
	public static final int DIVIDE=8;
	public static final int DO=9;
	public static final int ELSE=10;
	public static final int EQUALS=11;
	public static final int FALSE=12;
	public static final int IF=13;
	public static final int INTNUM=14;
	public static final int LEQUALS=15;
	public static final int MINUS=16;
	public static final int NOT=17;
	public static final int OPENPAREN=18;
	public static final int PLUS=19;
	public static final int READ=20;
	public static final int SEMICOLON=21;
	public static final int SKIP=22;
	public static final int STRING=23;
	public static final int THEN=24;
	public static final int TIMES=25;
	public static final int TRUE=26;
	public static final int VARIABLE=27;
	public static final int WHILE=28;
	public static final int WRITE=29;
	public static final int WRITELN=30;
	public static final int WS=31;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public Lex() {} 
	public Lex(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public Lex(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "Lex.g"; }

	// $ANTLR start "WRITE"
	public final void mWRITE() throws RecognitionException {
		try {
			int _type = WRITE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:8:12: ( 'write' )
			// Lex.g:8:14: 'write'
			{
			match("write"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WRITE"

	// $ANTLR start "WRITELN"
	public final void mWRITELN() throws RecognitionException {
		try {
			int _type = WRITELN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:9:12: ( 'writeln' )
			// Lex.g:9:14: 'writeln'
			{
			match("writeln"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WRITELN"

	// $ANTLR start "READ"
	public final void mREAD() throws RecognitionException {
		try {
			int _type = READ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:10:12: ( 'read' )
			// Lex.g:10:14: 'read'
			{
			match("read"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "READ"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:11:12: ( 'then' )
			// Lex.g:11:14: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "WHILE"
	public final void mWHILE() throws RecognitionException {
		try {
			int _type = WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:12:10: ( 'while' )
			// Lex.g:12:12: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHILE"

	// $ANTLR start "DO"
	public final void mDO() throws RecognitionException {
		try {
			int _type = DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:13:12: ( 'do' )
			// Lex.g:13:14: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DO"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:14:12: ( 'else' )
			// Lex.g:14:14: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:15:12: ( 'if' )
			// Lex.g:15:14: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "SKIP"
	public final void mSKIP() throws RecognitionException {
		try {
			int _type = SKIP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:16:12: ( 'skip' )
			// Lex.g:16:14: 'skip'
			{
			match("skip"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SKIP"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:17:12: ( 'false' )
			// Lex.g:17:15: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:18:9: ( 'true' )
			// Lex.g:18:12: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:23:14: ( ';' )
			// Lex.g:23:16: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "OPENPAREN"
	public final void mOPENPAREN() throws RecognitionException {
		try {
			int _type = OPENPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:24:14: ( '(' )
			// Lex.g:24:16: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OPENPAREN"

	// $ANTLR start "CLOSEPAREN"
	public final void mCLOSEPAREN() throws RecognitionException {
		try {
			int _type = CLOSEPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:25:14: ( ')' )
			// Lex.g:25:16: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CLOSEPAREN"

	// $ANTLR start "EQUALS"
	public final void mEQUALS() throws RecognitionException {
		try {
			int _type = EQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:26:14: ( '=' )
			// Lex.g:26:16: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUALS"

	// $ANTLR start "LEQUALS"
	public final void mLEQUALS() throws RecognitionException {
		try {
			int _type = LEQUALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:27:14: ( '<=' )
			// Lex.g:27:16: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEQUALS"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:28:14: ( '+' )
			// Lex.g:28:16: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:29:14: ( '-' )
			// Lex.g:29:16: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "TIMES"
	public final void mTIMES() throws RecognitionException {
		try {
			int _type = TIMES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:30:14: ( '*' )
			// Lex.g:30:16: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TIMES"

	// $ANTLR start "DIVIDE"
	public final void mDIVIDE() throws RecognitionException {
		try {
			int _type = DIVIDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:31:14: ( '/' )
			// Lex.g:31:16: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVIDE"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:32:14: ( ':=' )
			// Lex.g:32:16: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:33:11: ( '&' )
			// Lex.g:33:13: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:34:8: ( '!' )
			// Lex.g:34:10: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "INTNUM"
	public final void mINTNUM() throws RecognitionException {
		try {
			int _type = INTNUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:36:14: ( ( '0' .. '9' )+ )
			// Lex.g:36:16: ( '0' .. '9' )+
			{
			// Lex.g:36:16: ( '0' .. '9' )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Lex.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTNUM"

	// $ANTLR start "STRING"
	public final void mSTRING() throws RecognitionException {
		try {
			int _type = STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:38:14: ( '\\'' ( '\\'' '\\'' |~ '\\'' )* '\\'' )
			// Lex.g:38:16: '\\'' ( '\\'' '\\'' |~ '\\'' )* '\\''
			{
			match('\''); 
			// Lex.g:38:21: ( '\\'' '\\'' |~ '\\'' )*
			loop2:
			while (true) {
				int alt2=3;
				int LA2_0 = input.LA(1);
				if ( (LA2_0=='\'') ) {
					int LA2_1 = input.LA(2);
					if ( (LA2_1=='\'') ) {
						alt2=1;
					}

				}
				else if ( ((LA2_0 >= '\u0000' && LA2_0 <= '&')||(LA2_0 >= '(' && LA2_0 <= '\uFFFF')) ) {
					alt2=2;
				}

				switch (alt2) {
				case 1 :
					// Lex.g:38:22: '\\'' '\\''
					{
					match('\''); 
					match('\''); 
					}
					break;
				case 2 :
					// Lex.g:38:34: ~ '\\''
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop2;
				}
			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRING"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:40:14: ( '{' (~ '}' )* '}' )
			// Lex.g:40:16: '{' (~ '}' )* '}'
			{
			match('{'); 
			// Lex.g:40:20: (~ '}' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '\u0000' && LA3_0 <= '|')||(LA3_0 >= '~' && LA3_0 <= '\uFFFF')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// Lex.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '|')||(input.LA(1) >= '~' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			match('}'); 
			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:42:14: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// Lex.g:42:16: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// Lex.g:42:16: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||LA4_0=='\r'||LA4_0==' ') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Lex.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "VARIABLE"
	public final void mVARIABLE() throws RecognitionException {
		try {
			int _type = VARIABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// Lex.g:44:12: ( ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( '0' .. '9' ) | ( 'A' .. 'Z' | 'a' .. 'z' ) )* )
			// Lex.g:44:14: ( 'A' .. 'Z' | 'a' .. 'z' ) ( ( '0' .. '9' ) | ( 'A' .. 'Z' | 'a' .. 'z' ) )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// Lex.g:44:36: ( ( '0' .. '9' ) | ( 'A' .. 'Z' | 'a' .. 'z' ) )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '0' && LA5_0 <= '9')||(LA5_0 >= 'A' && LA5_0 <= 'Z')||(LA5_0 >= 'a' && LA5_0 <= 'z')) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// Lex.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop5;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VARIABLE"

	@Override
	public void mTokens() throws RecognitionException {
		// Lex.g:1:8: ( WRITE | WRITELN | READ | THEN | WHILE | DO | ELSE | IF | SKIP | FALSE | TRUE | SEMICOLON | OPENPAREN | CLOSEPAREN | EQUALS | LEQUALS | PLUS | MINUS | TIMES | DIVIDE | ASSIGN | AND | NOT | INTNUM | STRING | COMMENT | WS | VARIABLE )
		int alt6=28;
		alt6 = dfa6.predict(input);
		switch (alt6) {
			case 1 :
				// Lex.g:1:10: WRITE
				{
				mWRITE(); 

				}
				break;
			case 2 :
				// Lex.g:1:16: WRITELN
				{
				mWRITELN(); 

				}
				break;
			case 3 :
				// Lex.g:1:24: READ
				{
				mREAD(); 

				}
				break;
			case 4 :
				// Lex.g:1:29: THEN
				{
				mTHEN(); 

				}
				break;
			case 5 :
				// Lex.g:1:34: WHILE
				{
				mWHILE(); 

				}
				break;
			case 6 :
				// Lex.g:1:40: DO
				{
				mDO(); 

				}
				break;
			case 7 :
				// Lex.g:1:43: ELSE
				{
				mELSE(); 

				}
				break;
			case 8 :
				// Lex.g:1:48: IF
				{
				mIF(); 

				}
				break;
			case 9 :
				// Lex.g:1:51: SKIP
				{
				mSKIP(); 

				}
				break;
			case 10 :
				// Lex.g:1:56: FALSE
				{
				mFALSE(); 

				}
				break;
			case 11 :
				// Lex.g:1:62: TRUE
				{
				mTRUE(); 

				}
				break;
			case 12 :
				// Lex.g:1:67: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 13 :
				// Lex.g:1:77: OPENPAREN
				{
				mOPENPAREN(); 

				}
				break;
			case 14 :
				// Lex.g:1:87: CLOSEPAREN
				{
				mCLOSEPAREN(); 

				}
				break;
			case 15 :
				// Lex.g:1:98: EQUALS
				{
				mEQUALS(); 

				}
				break;
			case 16 :
				// Lex.g:1:105: LEQUALS
				{
				mLEQUALS(); 

				}
				break;
			case 17 :
				// Lex.g:1:113: PLUS
				{
				mPLUS(); 

				}
				break;
			case 18 :
				// Lex.g:1:118: MINUS
				{
				mMINUS(); 

				}
				break;
			case 19 :
				// Lex.g:1:124: TIMES
				{
				mTIMES(); 

				}
				break;
			case 20 :
				// Lex.g:1:130: DIVIDE
				{
				mDIVIDE(); 

				}
				break;
			case 21 :
				// Lex.g:1:137: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 22 :
				// Lex.g:1:144: AND
				{
				mAND(); 

				}
				break;
			case 23 :
				// Lex.g:1:148: NOT
				{
				mNOT(); 

				}
				break;
			case 24 :
				// Lex.g:1:152: INTNUM
				{
				mINTNUM(); 

				}
				break;
			case 25 :
				// Lex.g:1:159: STRING
				{
				mSTRING(); 

				}
				break;
			case 26 :
				// Lex.g:1:166: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 27 :
				// Lex.g:1:174: WS
				{
				mWS(); 

				}
				break;
			case 28 :
				// Lex.g:1:177: VARIABLE
				{
				mVARIABLE(); 

				}
				break;

		}
	}


	protected DFA6 dfa6 = new DFA6(this);
	static final String DFA6_eotS =
		"\1\uffff\10\31\21\uffff\5\31\1\51\1\31\1\53\7\31\1\uffff\1\31\1\uffff"+
		"\4\31\1\70\1\71\1\72\1\73\1\74\1\31\1\77\1\100\5\uffff\1\101\1\31\3\uffff"+
		"\1\103\1\uffff";
	static final String DFA6_eofS =
		"\104\uffff";
	static final String DFA6_minS =
		"\1\11\1\150\1\145\1\150\1\157\1\154\1\146\1\153\1\141\21\uffff\2\151\1"+
		"\141\1\145\1\165\1\60\1\163\1\60\1\151\1\154\1\164\1\154\1\144\1\156\1"+
		"\145\1\uffff\1\145\1\uffff\1\160\1\163\2\145\5\60\1\145\2\60\5\uffff\1"+
		"\60\1\156\3\uffff\1\60\1\uffff";
	static final String DFA6_maxS =
		"\1\173\1\162\1\145\1\162\1\157\1\154\1\146\1\153\1\141\21\uffff\2\151"+
		"\1\141\1\145\1\165\1\172\1\163\1\172\1\151\1\154\1\164\1\154\1\144\1\156"+
		"\1\145\1\uffff\1\145\1\uffff\1\160\1\163\2\145\5\172\1\145\2\172\5\uffff"+
		"\1\172\1\156\3\uffff\1\172\1\uffff";
	static final String DFA6_acceptS =
		"\11\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
		"\1\30\1\31\1\32\1\33\1\34\17\uffff\1\6\1\uffff\1\10\14\uffff\1\3\1\4\1"+
		"\13\1\7\1\11\2\uffff\1\1\1\5\1\12\1\uffff\1\2";
	static final String DFA6_specialS =
		"\104\uffff}>";
	static final String[] DFA6_transitionS = {
			"\2\30\2\uffff\1\30\22\uffff\1\30\1\24\4\uffff\1\23\1\26\1\12\1\13\1\20"+
			"\1\16\1\uffff\1\17\1\uffff\1\21\12\25\1\22\1\11\1\15\1\14\3\uffff\32"+
			"\31\6\uffff\3\31\1\4\1\5\1\10\2\31\1\6\10\31\1\2\1\7\1\3\2\31\1\1\3\31"+
			"\1\27",
			"\1\33\11\uffff\1\32",
			"\1\34",
			"\1\35\11\uffff\1\36",
			"\1\37",
			"\1\40",
			"\1\41",
			"\1\42",
			"\1\43",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"\1\50",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\1\52",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"\1\61",
			"\1\62",
			"",
			"\1\63",
			"",
			"\1\64",
			"\1\65",
			"\1\66",
			"\1\67",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\1\75",
			"\12\31\7\uffff\32\31\6\uffff\13\31\1\76\16\31",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"",
			"",
			"",
			"",
			"",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			"\1\102",
			"",
			"",
			"",
			"\12\31\7\uffff\32\31\6\uffff\32\31",
			""
	};

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( WRITE | WRITELN | READ | THEN | WHILE | DO | ELSE | IF | SKIP | FALSE | TRUE | SEMICOLON | OPENPAREN | CLOSEPAREN | EQUALS | LEQUALS | PLUS | MINUS | TIMES | DIVIDE | ASSIGN | AND | NOT | INTNUM | STRING | COMMENT | WS | VARIABLE );";
		}
	}

}
