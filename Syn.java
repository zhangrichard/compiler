
// $ANTLR 3.5.2 Syn.g 2016-04-28 20:39:35


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class Syn extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ASSIGN", "CLOSEPAREN", 
		"COMMENT", "DIVIDE", "DO", "ELSE", "EQUALS", "FALSE", "IF", "INTNUM", 
		"LEQUALS", "MINUS", "NOT", "OPENPAREN", "PLUS", "READ", "SEMICOLON", "SKIP", 
		"STRING", "THEN", "TIMES", "TRUE", "VARIABLE", "WHILE", "WRITE", "WRITELN", 
		"WS"
	};
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
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public Syn(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public Syn(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return Syn.tokenNames; }
	@Override public String getGrammarFileName() { return "Syn.g"; }


	  private String cleanString(String s){
	    String tmp;
	    tmp = s.replaceAll("^'", "");
	    s = tmp.replaceAll("'$", "");
	    tmp = s.replaceAll("''", "'");
	    return tmp;
	  }


	public static class program_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "program"
	// Syn.g:20:1: program : statements ;
	public final Syn.program_return program() throws RecognitionException {
		Syn.program_return retval = new Syn.program_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope statements1 =null;


		try {
			// Syn.g:20:9: ( statements )
			// Syn.g:21:5: statements
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_statements_in_program52);
			statements1=statements();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statements1.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "program"


	public static class statements_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statements"
	// Syn.g:24:1: statements : statement ( SEMICOLON ^ statement )* ;
	public final Syn.statements_return statements() throws RecognitionException {
		Syn.statements_return retval = new Syn.statements_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMICOLON3=null;
		ParserRuleReturnScope statement2 =null;
		ParserRuleReturnScope statement4 =null;

		Object SEMICOLON3_tree=null;

		try {
			// Syn.g:24:12: ( statement ( SEMICOLON ^ statement )* )
			// Syn.g:25:5: statement ( SEMICOLON ^ statement )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_statement_in_statements67);
			statement2=statement();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, statement2.getTree());

			// Syn.g:25:15: ( SEMICOLON ^ statement )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( (LA1_0==SEMICOLON) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// Syn.g:25:17: SEMICOLON ^ statement
					{
					SEMICOLON3=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_statements71); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SEMICOLON3_tree = (Object)adaptor.create(SEMICOLON3);
					root_0 = (Object)adaptor.becomeRoot(SEMICOLON3_tree, root_0);
					}

					pushFollow(FOLLOW_statement_in_statements74);
					statement4=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement4.getTree());

					}
					break;

				default :
					break loop1;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statements"


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// Syn.g:28:1: statement : ( WRITE ^ OPENPAREN ! ( string | exp | boolexp ) CLOSEPAREN !| READ ^ OPENPAREN ! ( VARIABLE ) CLOSEPAREN !| IF ^ boolexp THEN statement ELSE statement | WHILE ^ boolexp DO statement | WRITELN | VARIABLE | SKIP | OPENPAREN ! statements CLOSEPAREN !| VARIABLE ASSIGN ^ exp );
	public final Syn.statement_return statement() throws RecognitionException {
		Syn.statement_return retval = new Syn.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WRITE5=null;
		Token OPENPAREN6=null;
		Token CLOSEPAREN10=null;
		Token READ11=null;
		Token OPENPAREN12=null;
		Token VARIABLE13=null;
		Token CLOSEPAREN14=null;
		Token IF15=null;
		Token THEN17=null;
		Token ELSE19=null;
		Token WHILE21=null;
		Token DO23=null;
		Token WRITELN25=null;
		Token VARIABLE26=null;
		Token SKIP27=null;
		Token OPENPAREN28=null;
		Token CLOSEPAREN30=null;
		Token VARIABLE31=null;
		Token ASSIGN32=null;
		ParserRuleReturnScope string7 =null;
		ParserRuleReturnScope exp8 =null;
		ParserRuleReturnScope boolexp9 =null;
		ParserRuleReturnScope boolexp16 =null;
		ParserRuleReturnScope statement18 =null;
		ParserRuleReturnScope statement20 =null;
		ParserRuleReturnScope boolexp22 =null;
		ParserRuleReturnScope statement24 =null;
		ParserRuleReturnScope statements29 =null;
		ParserRuleReturnScope exp33 =null;

		Object WRITE5_tree=null;
		Object OPENPAREN6_tree=null;
		Object CLOSEPAREN10_tree=null;
		Object READ11_tree=null;
		Object OPENPAREN12_tree=null;
		Object VARIABLE13_tree=null;
		Object CLOSEPAREN14_tree=null;
		Object IF15_tree=null;
		Object THEN17_tree=null;
		Object ELSE19_tree=null;
		Object WHILE21_tree=null;
		Object DO23_tree=null;
		Object WRITELN25_tree=null;
		Object VARIABLE26_tree=null;
		Object SKIP27_tree=null;
		Object OPENPAREN28_tree=null;
		Object CLOSEPAREN30_tree=null;
		Object VARIABLE31_tree=null;
		Object ASSIGN32_tree=null;

		try {
			// Syn.g:28:11: ( WRITE ^ OPENPAREN ! ( string | exp | boolexp ) CLOSEPAREN !| READ ^ OPENPAREN ! ( VARIABLE ) CLOSEPAREN !| IF ^ boolexp THEN statement ELSE statement | WHILE ^ boolexp DO statement | WRITELN | VARIABLE | SKIP | OPENPAREN ! statements CLOSEPAREN !| VARIABLE ASSIGN ^ exp )
			int alt3=9;
			switch ( input.LA(1) ) {
			case WRITE:
				{
				alt3=1;
				}
				break;
			case READ:
				{
				alt3=2;
				}
				break;
			case IF:
				{
				alt3=3;
				}
				break;
			case WHILE:
				{
				alt3=4;
				}
				break;
			case WRITELN:
				{
				alt3=5;
				}
				break;
			case VARIABLE:
				{
				int LA3_6 = input.LA(2);
				if ( (LA3_6==ASSIGN) ) {
					alt3=9;
				}
				else if ( (LA3_6==EOF||LA3_6==CLOSEPAREN||LA3_6==ELSE||LA3_6==SEMICOLON) ) {
					alt3=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 6, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SKIP:
				{
				alt3=7;
				}
				break;
			case OPENPAREN:
				{
				alt3=8;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}
			switch (alt3) {
				case 1 :
					// Syn.g:29:5: WRITE ^ OPENPAREN ! ( string | exp | boolexp ) CLOSEPAREN !
					{
					root_0 = (Object)adaptor.nil();


					WRITE5=(Token)match(input,WRITE,FOLLOW_WRITE_in_statement92); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					WRITE5_tree = (Object)adaptor.create(WRITE5);
					root_0 = (Object)adaptor.becomeRoot(WRITE5_tree, root_0);
					}

					OPENPAREN6=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_statement95); if (state.failed) return retval;
					// Syn.g:29:23: ( string | exp | boolexp )
					int alt2=3;
					switch ( input.LA(1) ) {
					case STRING:
						{
						alt2=1;
						}
						break;
					case VARIABLE:
						{
						int LA2_2 = input.LA(2);
						if ( (synpred3_Syn()) ) {
							alt2=2;
						}
						else if ( (true) ) {
							alt2=3;
						}

						}
						break;
					case INTNUM:
						{
						int LA2_3 = input.LA(2);
						if ( (synpred3_Syn()) ) {
							alt2=2;
						}
						else if ( (true) ) {
							alt2=3;
						}

						}
						break;
					case OPENPAREN:
						{
						int LA2_4 = input.LA(2);
						if ( (synpred3_Syn()) ) {
							alt2=2;
						}
						else if ( (true) ) {
							alt2=3;
						}

						}
						break;
					case FALSE:
					case NOT:
					case TRUE:
						{
						alt2=3;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						throw nvae;
					}
					switch (alt2) {
						case 1 :
							// Syn.g:29:26: string
							{
							pushFollow(FOLLOW_string_in_statement101);
							string7=string();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, string7.getTree());

							}
							break;
						case 2 :
							// Syn.g:29:35: exp
							{
							pushFollow(FOLLOW_exp_in_statement105);
							exp8=exp();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, exp8.getTree());

							}
							break;
						case 3 :
							// Syn.g:29:41: boolexp
							{
							pushFollow(FOLLOW_boolexp_in_statement109);
							boolexp9=boolexp();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, boolexp9.getTree());

							}
							break;

					}

					CLOSEPAREN10=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_statement113); if (state.failed) return retval;
					}
					break;
				case 2 :
					// Syn.g:30:5: READ ^ OPENPAREN ! ( VARIABLE ) CLOSEPAREN !
					{
					root_0 = (Object)adaptor.nil();


					READ11=(Token)match(input,READ,FOLLOW_READ_in_statement120); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					READ11_tree = (Object)adaptor.create(READ11);
					root_0 = (Object)adaptor.becomeRoot(READ11_tree, root_0);
					}

					OPENPAREN12=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_statement123); if (state.failed) return retval;
					// Syn.g:30:21: ( VARIABLE )
					// Syn.g:30:22: VARIABLE
					{
					VARIABLE13=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_statement126); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VARIABLE13_tree = (Object)adaptor.create(VARIABLE13);
					adaptor.addChild(root_0, VARIABLE13_tree);
					}

					}

					CLOSEPAREN14=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_statement129); if (state.failed) return retval;
					}
					break;
				case 3 :
					// Syn.g:31:5: IF ^ boolexp THEN statement ELSE statement
					{
					root_0 = (Object)adaptor.nil();


					IF15=(Token)match(input,IF,FOLLOW_IF_in_statement136); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					IF15_tree = (Object)adaptor.create(IF15);
					root_0 = (Object)adaptor.becomeRoot(IF15_tree, root_0);
					}

					pushFollow(FOLLOW_boolexp_in_statement139);
					boolexp16=boolexp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolexp16.getTree());

					THEN17=(Token)match(input,THEN,FOLLOW_THEN_in_statement141); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					THEN17_tree = (Object)adaptor.create(THEN17);
					adaptor.addChild(root_0, THEN17_tree);
					}

					pushFollow(FOLLOW_statement_in_statement143);
					statement18=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement18.getTree());

					ELSE19=(Token)match(input,ELSE,FOLLOW_ELSE_in_statement145); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ELSE19_tree = (Object)adaptor.create(ELSE19);
					adaptor.addChild(root_0, ELSE19_tree);
					}

					pushFollow(FOLLOW_statement_in_statement147);
					statement20=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement20.getTree());

					}
					break;
				case 4 :
					// Syn.g:32:5: WHILE ^ boolexp DO statement
					{
					root_0 = (Object)adaptor.nil();


					WHILE21=(Token)match(input,WHILE,FOLLOW_WHILE_in_statement153); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					WHILE21_tree = (Object)adaptor.create(WHILE21);
					root_0 = (Object)adaptor.becomeRoot(WHILE21_tree, root_0);
					}

					pushFollow(FOLLOW_boolexp_in_statement156);
					boolexp22=boolexp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolexp22.getTree());

					DO23=(Token)match(input,DO,FOLLOW_DO_in_statement158); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DO23_tree = (Object)adaptor.create(DO23);
					adaptor.addChild(root_0, DO23_tree);
					}

					pushFollow(FOLLOW_statement_in_statement160);
					statement24=statement();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statement24.getTree());

					}
					break;
				case 5 :
					// Syn.g:33:5: WRITELN
					{
					root_0 = (Object)adaptor.nil();


					WRITELN25=(Token)match(input,WRITELN,FOLLOW_WRITELN_in_statement166); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					WRITELN25_tree = (Object)adaptor.create(WRITELN25);
					adaptor.addChild(root_0, WRITELN25_tree);
					}

					}
					break;
				case 6 :
					// Syn.g:34:5: VARIABLE
					{
					root_0 = (Object)adaptor.nil();


					VARIABLE26=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_statement172); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VARIABLE26_tree = (Object)adaptor.create(VARIABLE26);
					adaptor.addChild(root_0, VARIABLE26_tree);
					}

					}
					break;
				case 7 :
					// Syn.g:35:5: SKIP
					{
					root_0 = (Object)adaptor.nil();


					SKIP27=(Token)match(input,SKIP,FOLLOW_SKIP_in_statement179); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					SKIP27_tree = (Object)adaptor.create(SKIP27);
					adaptor.addChild(root_0, SKIP27_tree);
					}

					}
					break;
				case 8 :
					// Syn.g:36:5: OPENPAREN ! statements CLOSEPAREN !
					{
					root_0 = (Object)adaptor.nil();


					OPENPAREN28=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_statement185); if (state.failed) return retval;
					pushFollow(FOLLOW_statements_in_statement188);
					statements29=statements();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, statements29.getTree());

					CLOSEPAREN30=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_statement190); if (state.failed) return retval;
					}
					break;
				case 9 :
					// Syn.g:37:5: VARIABLE ASSIGN ^ exp
					{
					root_0 = (Object)adaptor.nil();


					VARIABLE31=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_statement197); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VARIABLE31_tree = (Object)adaptor.create(VARIABLE31);
					adaptor.addChild(root_0, VARIABLE31_tree);
					}

					ASSIGN32=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_statement199); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ASSIGN32_tree = (Object)adaptor.create(ASSIGN32);
					root_0 = (Object)adaptor.becomeRoot(ASSIGN32_tree, root_0);
					}

					pushFollow(FOLLOW_exp_in_statement202);
					exp33=exp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exp33.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class boolexp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "boolexp"
	// Syn.g:41:1: boolexp : boolterm ( AND ^ boolterm )* ;
	public final Syn.boolexp_return boolexp() throws RecognitionException {
		Syn.boolexp_return retval = new Syn.boolexp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AND35=null;
		ParserRuleReturnScope boolterm34 =null;
		ParserRuleReturnScope boolterm36 =null;

		Object AND35_tree=null;

		try {
			// Syn.g:41:9: ( boolterm ( AND ^ boolterm )* )
			// Syn.g:42:3: boolterm ( AND ^ boolterm )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_boolterm_in_boolexp217);
			boolterm34=boolterm();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, boolterm34.getTree());

			// Syn.g:42:13: ( AND ^ boolterm )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( (LA4_0==AND) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// Syn.g:42:15: AND ^ boolterm
					{
					AND35=(Token)match(input,AND,FOLLOW_AND_in_boolexp222); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					AND35_tree = (Object)adaptor.create(AND35);
					root_0 = (Object)adaptor.becomeRoot(AND35_tree, root_0);
					}

					pushFollow(FOLLOW_boolterm_in_boolexp226);
					boolterm36=boolterm();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolterm36.getTree());

					}
					break;

				default :
					break loop4;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "boolexp"


	public static class boolterm_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "boolterm"
	// Syn.g:44:1: boolterm : ( NOT ^ bool | bool );
	public final Syn.boolterm_return boolterm() throws RecognitionException {
		Syn.boolterm_return retval = new Syn.boolterm_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NOT37=null;
		ParserRuleReturnScope bool38 =null;
		ParserRuleReturnScope bool39 =null;

		Object NOT37_tree=null;

		try {
			// Syn.g:44:9: ( NOT ^ bool | bool )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==NOT) ) {
				alt5=1;
			}
			else if ( (LA5_0==FALSE||LA5_0==INTNUM||LA5_0==OPENPAREN||(LA5_0 >= TRUE && LA5_0 <= VARIABLE)) ) {
				alt5=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// Syn.g:45:3: NOT ^ bool
					{
					root_0 = (Object)adaptor.nil();


					NOT37=(Token)match(input,NOT,FOLLOW_NOT_in_boolterm239); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT37_tree = (Object)adaptor.create(NOT37);
					root_0 = (Object)adaptor.becomeRoot(NOT37_tree, root_0);
					}

					pushFollow(FOLLOW_bool_in_boolterm242);
					bool38=bool();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool38.getTree());

					}
					break;
				case 2 :
					// Syn.g:46:5: bool
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_bool_in_boolterm249);
					bool39=bool();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, bool39.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "boolterm"


	public static class bool_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "bool"
	// Syn.g:48:1: bool : ( TRUE | FALSE | exp EQUALS ^ exp | exp LEQUALS ^ exp | OPENPAREN ! boolexp CLOSEPAREN !);
	public final Syn.bool_return bool() throws RecognitionException {
		Syn.bool_return retval = new Syn.bool_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TRUE40=null;
		Token FALSE41=null;
		Token EQUALS43=null;
		Token LEQUALS46=null;
		Token OPENPAREN48=null;
		Token CLOSEPAREN50=null;
		ParserRuleReturnScope exp42 =null;
		ParserRuleReturnScope exp44 =null;
		ParserRuleReturnScope exp45 =null;
		ParserRuleReturnScope exp47 =null;
		ParserRuleReturnScope boolexp49 =null;

		Object TRUE40_tree=null;
		Object FALSE41_tree=null;
		Object EQUALS43_tree=null;
		Object LEQUALS46_tree=null;
		Object OPENPAREN48_tree=null;
		Object CLOSEPAREN50_tree=null;

		try {
			// Syn.g:48:5: ( TRUE | FALSE | exp EQUALS ^ exp | exp LEQUALS ^ exp | OPENPAREN ! boolexp CLOSEPAREN !)
			int alt6=5;
			switch ( input.LA(1) ) {
			case TRUE:
				{
				alt6=1;
				}
				break;
			case FALSE:
				{
				alt6=2;
				}
				break;
			case VARIABLE:
				{
				int LA6_3 = input.LA(2);
				if ( (synpred16_Syn()) ) {
					alt6=3;
				}
				else if ( (synpred17_Syn()) ) {
					alt6=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case INTNUM:
				{
				int LA6_4 = input.LA(2);
				if ( (synpred16_Syn()) ) {
					alt6=3;
				}
				else if ( (synpred17_Syn()) ) {
					alt6=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case OPENPAREN:
				{
				int LA6_5 = input.LA(2);
				if ( (synpred16_Syn()) ) {
					alt6=3;
				}
				else if ( (synpred17_Syn()) ) {
					alt6=4;
				}
				else if ( (true) ) {
					alt6=5;
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// Syn.g:49:3: TRUE
					{
					root_0 = (Object)adaptor.nil();


					TRUE40=(Token)match(input,TRUE,FOLLOW_TRUE_in_bool260); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TRUE40_tree = (Object)adaptor.create(TRUE40);
					adaptor.addChild(root_0, TRUE40_tree);
					}

					}
					break;
				case 2 :
					// Syn.g:50:4: FALSE
					{
					root_0 = (Object)adaptor.nil();


					FALSE41=(Token)match(input,FALSE,FOLLOW_FALSE_in_bool265); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FALSE41_tree = (Object)adaptor.create(FALSE41);
					adaptor.addChild(root_0, FALSE41_tree);
					}

					}
					break;
				case 3 :
					// Syn.g:51:4: exp EQUALS ^ exp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_exp_in_bool270);
					exp42=exp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exp42.getTree());

					EQUALS43=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_bool272); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EQUALS43_tree = (Object)adaptor.create(EQUALS43);
					root_0 = (Object)adaptor.becomeRoot(EQUALS43_tree, root_0);
					}

					pushFollow(FOLLOW_exp_in_bool275);
					exp44=exp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exp44.getTree());

					}
					break;
				case 4 :
					// Syn.g:52:4: exp LEQUALS ^ exp
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_exp_in_bool280);
					exp45=exp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exp45.getTree());

					LEQUALS46=(Token)match(input,LEQUALS,FOLLOW_LEQUALS_in_bool282); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LEQUALS46_tree = (Object)adaptor.create(LEQUALS46);
					root_0 = (Object)adaptor.becomeRoot(LEQUALS46_tree, root_0);
					}

					pushFollow(FOLLOW_exp_in_bool285);
					exp47=exp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exp47.getTree());

					}
					break;
				case 5 :
					// Syn.g:53:4: OPENPAREN ! boolexp CLOSEPAREN !
					{
					root_0 = (Object)adaptor.nil();


					OPENPAREN48=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_bool290); if (state.failed) return retval;
					pushFollow(FOLLOW_boolexp_in_bool293);
					boolexp49=boolexp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, boolexp49.getTree());

					CLOSEPAREN50=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_bool295); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "bool"


	public static class exp_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exp"
	// Syn.g:55:1: exp : term ( ( PLUS ^| MINUS ^) term )* ;
	public final Syn.exp_return exp() throws RecognitionException {
		Syn.exp_return retval = new Syn.exp_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token PLUS52=null;
		Token MINUS53=null;
		ParserRuleReturnScope term51 =null;
		ParserRuleReturnScope term54 =null;

		Object PLUS52_tree=null;
		Object MINUS53_tree=null;

		try {
			// Syn.g:55:4: ( term ( ( PLUS ^| MINUS ^) term )* )
			// Syn.g:56:3: term ( ( PLUS ^| MINUS ^) term )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_term_in_exp307);
			term51=term();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, term51.getTree());

			// Syn.g:56:8: ( ( PLUS ^| MINUS ^) term )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0==MINUS||LA8_0==PLUS) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// Syn.g:56:9: ( PLUS ^| MINUS ^) term
					{
					// Syn.g:56:9: ( PLUS ^| MINUS ^)
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==PLUS) ) {
						alt7=1;
					}
					else if ( (LA7_0==MINUS) ) {
						alt7=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 7, 0, input);
						throw nvae;
					}

					switch (alt7) {
						case 1 :
							// Syn.g:56:10: PLUS ^
							{
							PLUS52=(Token)match(input,PLUS,FOLLOW_PLUS_in_exp311); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							PLUS52_tree = (Object)adaptor.create(PLUS52);
							root_0 = (Object)adaptor.becomeRoot(PLUS52_tree, root_0);
							}

							}
							break;
						case 2 :
							// Syn.g:56:16: MINUS ^
							{
							MINUS53=(Token)match(input,MINUS,FOLLOW_MINUS_in_exp314); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							MINUS53_tree = (Object)adaptor.create(MINUS53);
							root_0 = (Object)adaptor.becomeRoot(MINUS53_tree, root_0);
							}

							}
							break;

					}

					pushFollow(FOLLOW_term_in_exp317);
					term54=term();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, term54.getTree());

					}
					break;

				default :
					break loop8;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exp"


	public static class term_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "term"
	// Syn.g:58:1: term : factor ( TIMES ^ factor )* ;
	public final Syn.term_return term() throws RecognitionException {
		Syn.term_return retval = new Syn.term_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token TIMES56=null;
		ParserRuleReturnScope factor55 =null;
		ParserRuleReturnScope factor57 =null;

		Object TIMES56_tree=null;

		try {
			// Syn.g:58:5: ( factor ( TIMES ^ factor )* )
			// Syn.g:59:3: factor ( TIMES ^ factor )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_factor_in_term330);
			factor55=factor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, factor55.getTree());

			// Syn.g:59:9: ( TIMES ^ factor )*
			loop9:
			while (true) {
				int alt9=2;
				int LA9_0 = input.LA(1);
				if ( (LA9_0==TIMES) ) {
					alt9=1;
				}

				switch (alt9) {
				case 1 :
					// Syn.g:59:10: TIMES ^ factor
					{
					TIMES56=(Token)match(input,TIMES,FOLLOW_TIMES_in_term332); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TIMES56_tree = (Object)adaptor.create(TIMES56);
					root_0 = (Object)adaptor.becomeRoot(TIMES56_tree, root_0);
					}

					pushFollow(FOLLOW_factor_in_term335);
					factor57=factor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, factor57.getTree());

					}
					break;

				default :
					break loop9;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "term"


	public static class factor_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "factor"
	// Syn.g:62:1: factor : ( VARIABLE | INTNUM | OPENPAREN ! exp CLOSEPAREN !);
	public final Syn.factor_return factor() throws RecognitionException {
		Syn.factor_return retval = new Syn.factor_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VARIABLE58=null;
		Token INTNUM59=null;
		Token OPENPAREN60=null;
		Token CLOSEPAREN62=null;
		ParserRuleReturnScope exp61 =null;

		Object VARIABLE58_tree=null;
		Object INTNUM59_tree=null;
		Object OPENPAREN60_tree=null;
		Object CLOSEPAREN62_tree=null;

		try {
			// Syn.g:62:7: ( VARIABLE | INTNUM | OPENPAREN ! exp CLOSEPAREN !)
			int alt10=3;
			switch ( input.LA(1) ) {
			case VARIABLE:
				{
				alt10=1;
				}
				break;
			case INTNUM:
				{
				alt10=2;
				}
				break;
			case OPENPAREN:
				{
				alt10=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}
			switch (alt10) {
				case 1 :
					// Syn.g:63:3: VARIABLE
					{
					root_0 = (Object)adaptor.nil();


					VARIABLE58=(Token)match(input,VARIABLE,FOLLOW_VARIABLE_in_factor351); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					VARIABLE58_tree = (Object)adaptor.create(VARIABLE58);
					adaptor.addChild(root_0, VARIABLE58_tree);
					}

					}
					break;
				case 2 :
					// Syn.g:64:4: INTNUM
					{
					root_0 = (Object)adaptor.nil();


					INTNUM59=(Token)match(input,INTNUM,FOLLOW_INTNUM_in_factor356); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INTNUM59_tree = (Object)adaptor.create(INTNUM59);
					adaptor.addChild(root_0, INTNUM59_tree);
					}

					}
					break;
				case 3 :
					// Syn.g:65:4: OPENPAREN ! exp CLOSEPAREN !
					{
					root_0 = (Object)adaptor.nil();


					OPENPAREN60=(Token)match(input,OPENPAREN,FOLLOW_OPENPAREN_in_factor361); if (state.failed) return retval;
					pushFollow(FOLLOW_exp_in_factor364);
					exp61=exp();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exp61.getTree());

					CLOSEPAREN62=(Token)match(input,CLOSEPAREN,FOLLOW_CLOSEPAREN_in_factor366); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "factor"


	protected static class string_scope {
		String tmp;
	}
	protected Stack<string_scope> string_stack = new Stack<string_scope>();

	public static class string_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "string"
	// Syn.g:67:1: string : s= STRING -> STRING[$string::tmp] ;
	public final Syn.string_return string() throws RecognitionException {
		string_stack.push(new string_scope());
		Syn.string_return retval = new Syn.string_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token s=null;

		Object s_tree=null;
		RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

		try {
			// Syn.g:69:5: (s= STRING -> STRING[$string::tmp] )
			// Syn.g:70:5: s= STRING
			{
			s=(Token)match(input,STRING,FOLLOW_STRING_in_string395); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_STRING.add(s);

			if ( state.backtracking==0 ) { string_stack.peek().tmp = cleanString((s!=null?s.getText():null)); }
			// AST REWRITE
			// elements: STRING
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (Object)adaptor.nil();
			// 70:54: -> STRING[$string::tmp]
			{
				adaptor.addChild(root_0, (Object)adaptor.create(STRING, string_stack.peek().tmp));
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
			string_stack.pop();
		}
		return retval;
	}
	// $ANTLR end "string"

	// $ANTLR start synpred3_Syn
	public final void synpred3_Syn_fragment() throws RecognitionException {
		// Syn.g:29:35: ( exp )
		// Syn.g:29:35: exp
		{
		pushFollow(FOLLOW_exp_in_synpred3_Syn105);
		exp();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred3_Syn

	// $ANTLR start synpred16_Syn
	public final void synpred16_Syn_fragment() throws RecognitionException {
		// Syn.g:51:4: ( exp EQUALS exp )
		// Syn.g:51:4: exp EQUALS exp
		{
		pushFollow(FOLLOW_exp_in_synpred16_Syn270);
		exp();
		state._fsp--;
		if (state.failed) return;

		match(input,EQUALS,FOLLOW_EQUALS_in_synpred16_Syn272); if (state.failed) return;

		pushFollow(FOLLOW_exp_in_synpred16_Syn275);
		exp();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred16_Syn

	// $ANTLR start synpred17_Syn
	public final void synpred17_Syn_fragment() throws RecognitionException {
		// Syn.g:52:4: ( exp LEQUALS exp )
		// Syn.g:52:4: exp LEQUALS exp
		{
		pushFollow(FOLLOW_exp_in_synpred17_Syn280);
		exp();
		state._fsp--;
		if (state.failed) return;

		match(input,LEQUALS,FOLLOW_LEQUALS_in_synpred17_Syn282); if (state.failed) return;

		pushFollow(FOLLOW_exp_in_synpred17_Syn285);
		exp();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred17_Syn

	// Delegated rules

	public final boolean synpred17_Syn() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred17_Syn_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred3_Syn() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_Syn_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred16_Syn() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred16_Syn_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_statements_in_program52 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_statement_in_statements67 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_SEMICOLON_in_statements71 = new BitSet(new long[]{0x0000000078542000L});
	public static final BitSet FOLLOW_statement_in_statements74 = new BitSet(new long[]{0x0000000000200002L});
	public static final BitSet FOLLOW_WRITE_in_statement92 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_OPENPAREN_in_statement95 = new BitSet(new long[]{0x000000000C865000L});
	public static final BitSet FOLLOW_string_in_statement101 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_exp_in_statement105 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_boolexp_in_statement109 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CLOSEPAREN_in_statement113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_READ_in_statement120 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_OPENPAREN_in_statement123 = new BitSet(new long[]{0x0000000008000000L});
	public static final BitSet FOLLOW_VARIABLE_in_statement126 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CLOSEPAREN_in_statement129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_statement136 = new BitSet(new long[]{0x000000000C065000L});
	public static final BitSet FOLLOW_boolexp_in_statement139 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_THEN_in_statement141 = new BitSet(new long[]{0x0000000078542000L});
	public static final BitSet FOLLOW_statement_in_statement143 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_ELSE_in_statement145 = new BitSet(new long[]{0x0000000078542000L});
	public static final BitSet FOLLOW_statement_in_statement147 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHILE_in_statement153 = new BitSet(new long[]{0x000000000C065000L});
	public static final BitSet FOLLOW_boolexp_in_statement156 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_DO_in_statement158 = new BitSet(new long[]{0x0000000078542000L});
	public static final BitSet FOLLOW_statement_in_statement160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WRITELN_in_statement166 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_statement172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SKIP_in_statement179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPENPAREN_in_statement185 = new BitSet(new long[]{0x0000000078542000L});
	public static final BitSet FOLLOW_statements_in_statement188 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CLOSEPAREN_in_statement190 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VARIABLE_in_statement197 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ASSIGN_in_statement199 = new BitSet(new long[]{0x0000000008044000L});
	public static final BitSet FOLLOW_exp_in_statement202 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_boolterm_in_boolexp217 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_AND_in_boolexp222 = new BitSet(new long[]{0x000000000C065000L});
	public static final BitSet FOLLOW_boolterm_in_boolexp226 = new BitSet(new long[]{0x0000000000000012L});
	public static final BitSet FOLLOW_NOT_in_boolterm239 = new BitSet(new long[]{0x000000000C045000L});
	public static final BitSet FOLLOW_bool_in_boolterm242 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_bool_in_boolterm249 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_bool260 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_bool265 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp_in_bool270 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_EQUALS_in_bool272 = new BitSet(new long[]{0x0000000008044000L});
	public static final BitSet FOLLOW_exp_in_bool275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp_in_bool280 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_LEQUALS_in_bool282 = new BitSet(new long[]{0x0000000008044000L});
	public static final BitSet FOLLOW_exp_in_bool285 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPENPAREN_in_bool290 = new BitSet(new long[]{0x000000000C065000L});
	public static final BitSet FOLLOW_boolexp_in_bool293 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CLOSEPAREN_in_bool295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_exp307 = new BitSet(new long[]{0x0000000000090002L});
	public static final BitSet FOLLOW_PLUS_in_exp311 = new BitSet(new long[]{0x0000000008044000L});
	public static final BitSet FOLLOW_MINUS_in_exp314 = new BitSet(new long[]{0x0000000008044000L});
	public static final BitSet FOLLOW_term_in_exp317 = new BitSet(new long[]{0x0000000000090002L});
	public static final BitSet FOLLOW_factor_in_term330 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_TIMES_in_term332 = new BitSet(new long[]{0x0000000008044000L});
	public static final BitSet FOLLOW_factor_in_term335 = new BitSet(new long[]{0x0000000002000002L});
	public static final BitSet FOLLOW_VARIABLE_in_factor351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTNUM_in_factor356 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_OPENPAREN_in_factor361 = new BitSet(new long[]{0x0000000008044000L});
	public static final BitSet FOLLOW_exp_in_factor364 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_CLOSEPAREN_in_factor366 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STRING_in_string395 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp_in_synpred3_Syn105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp_in_synpred16_Syn270 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_EQUALS_in_synpred16_Syn272 = new BitSet(new long[]{0x0000000008044000L});
	public static final BitSet FOLLOW_exp_in_synpred16_Syn275 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exp_in_synpred17_Syn280 = new BitSet(new long[]{0x0000000000008000L});
	public static final BitSet FOLLOW_LEQUALS_in_synpred17_Syn282 = new BitSet(new long[]{0x0000000008044000L});
	public static final BitSet FOLLOW_exp_in_synpred17_Syn285 = new BitSet(new long[]{0x0000000000000002L});
}
