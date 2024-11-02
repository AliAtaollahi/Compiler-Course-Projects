// Generated from C:/Users/ali18/Desktop/UTL/UTL/src/main/grammar/UTL.g4 by ANTLR 4.13.1
package main.grammar;

    import main.ast.node.*;
    import main.ast.node.declaration.*;
    import main.ast.node.statement.*;
    import main.ast.node.expression.*;
    import main.ast.node.expression.operators.*;
    import main.ast.node.expression.values.*;
    import main.ast.type.primitiveType.*;
    import main.ast.type.complexType.*;
    import main.ast.type.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class UTLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACES=1, SEMICOLON=2, COMMA=3, COLON=4, DOT=5, LPAREN=6, RPAREN=7, LBRACE=8, 
		RBRACE=9, LBRACK=10, RBRACK=11, PLUS=12, MINUS=13, MULT=14, DIV=15, MOD=16, 
		AND=17, OR=18, NOT=19, BIT_AND=20, BIT_OR=21, BIT_XOR=22, L_SHIFT=23, 
		R_SHIFT=24, BIT_NOT=25, LT=26, GT=27, EQ=28, NEQ=29, INC=30, DEC=31, ASSIGN=32, 
		ADD_ASSIGN=33, SUB_ASSIGN=34, MUL_ASSIGN=35, DIV_ASSIGN=36, MOD_ASSIGN=37, 
		TRY=38, THROW=39, CATCH=40, IF=41, ELSE=42, FOR=43, WHILE=44, BREAK=45, 
		CONTINUE=46, RETURN=47, MAIN=48, ONINIT=49, ONSTART=50, FLOAT=51, STRING=52, 
		BOOL=53, VOID=54, INT=55, BUY=56, SELL=57, ASK=58, BID=59, TIME=60, HIGH=61, 
		LOW=62, DIGITS=63, VOLUME=64, TYPE=65, TEXT=66, OPEN=67, CLOSE=68, TRADE=69, 
		ORDER=70, CANDLE=71, EXCEPTION=72, REFRESH_RATE=73, GET_CANDLE=74, TERMINATE=75, 
		CONNECT=76, OBSERVE=77, PRINT=78, ID=79, INT_LITERAL=80, FLOAT_LITERAL=81, 
		STRING_LITERAL=82, COMMENT=83;
	public static final int
		RULE_program = 0, RULE_identifier = 1, RULE_statement = 2, RULE_printStatement = 3, 
		RULE_varDeclaration = 4, RULE_funcVarDeclaration = 5, RULE_functionDeclaration = 6, 
		RULE_mainDeclaration = 7, RULE_initDeclaration = 8, RULE_startDeclaration = 9, 
		RULE_assignStatement = 10, RULE_ifStatement = 11, RULE_whileStatement = 12, 
		RULE_forStatement = 13, RULE_tryCatchStatement = 14, RULE_continueBreakStatement = 15, 
		RULE_returnStatement = 16, RULE_throwStatement = 17, RULE_functionCall = 18, 
		RULE_methodCall = 19, RULE_expression = 20, RULE_value = 21, RULE_primitiveType = 22, 
		RULE_complexType = 23, RULE_complexValue = 24, RULE_allType = 25, RULE_espetialFunction = 26, 
		RULE_espetialVariable = 27, RULE_espetialMethod = 28, RULE_assign = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "identifier", "statement", "printStatement", "varDeclaration", 
			"funcVarDeclaration", "functionDeclaration", "mainDeclaration", "initDeclaration", 
			"startDeclaration", "assignStatement", "ifStatement", "whileStatement", 
			"forStatement", "tryCatchStatement", "continueBreakStatement", "returnStatement", 
			"throwStatement", "functionCall", "methodCall", "expression", "value", 
			"primitiveType", "complexType", "complexValue", "allType", "espetialFunction", 
			"espetialVariable", "espetialMethod", "assign"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "';'", "','", "':'", "'.'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "'+'", "'-'", "'*'", "'/'", "'%'", "'&&'", "'||'", "'!'", "'&'", 
			"'|'", "'^'", "'<<'", "'>>'", "'~'", "'<'", "'>'", "'=='", "'!='", "'++'", 
			"'--'", "'='", "'+='", "'-='", "'*='", "'/='", "'%='", "'try'", "'throw'", 
			"'catch'", "'if'", "'else'", "'for'", "'while'", "'break'", "'continue'", 
			"'return'", "'Main'", "'OnInit'", "'OnStart'", "'float'", "'string'", 
			"'bool'", "'void'", "'int'", "'BUY'", "'SELL'", "'Ask'", "'Bid'", "'Time'", 
			"'High'", "'Low'", "'Digits'", "'Volume'", "'Type'", "'Text'", "'Open'", 
			"'Close'", "'Trade'", "'Order'", "'Candle'", "'Exception'", "'RefreshRate'", 
			"'GetCandle'", "'Terminate'", "'Connect'", "'Observe'", "'Print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SPACES", "SEMICOLON", "COMMA", "COLON", "DOT", "LPAREN", "RPAREN", 
			"LBRACE", "RBRACE", "LBRACK", "RBRACK", "PLUS", "MINUS", "MULT", "DIV", 
			"MOD", "AND", "OR", "NOT", "BIT_AND", "BIT_OR", "BIT_XOR", "L_SHIFT", 
			"R_SHIFT", "BIT_NOT", "LT", "GT", "EQ", "NEQ", "INC", "DEC", "ASSIGN", 
			"ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", "MOD_ASSIGN", 
			"TRY", "THROW", "CATCH", "IF", "ELSE", "FOR", "WHILE", "BREAK", "CONTINUE", 
			"RETURN", "MAIN", "ONINIT", "ONSTART", "FLOAT", "STRING", "BOOL", "VOID", 
			"INT", "BUY", "SELL", "ASK", "BID", "TIME", "HIGH", "LOW", "DIGITS", 
			"VOLUME", "TYPE", "TEXT", "OPEN", "CLOSE", "TRADE", "ORDER", "CANDLE", 
			"EXCEPTION", "REFRESH_RATE", "GET_CANDLE", "TERMINATE", "CONNECT", "OBSERVE", 
			"PRINT", "ID", "INT_LITERAL", "FLOAT_LITERAL", "STRING_LITERAL", "COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "UTL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public UTLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Program pro;
		public VarDeclarationContext varDeclaration;
		public FunctionDeclarationContext functionDeclaration;
		public InitDeclarationContext initDeclaration;
		public StartDeclarationContext startDeclaration;
		public MainDeclarationContext mainDeclaration;
		public MainDeclarationContext mainDeclaration() {
			return getRuleContext(MainDeclarationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(UTLParser.EOF, 0); }
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<FunctionDeclarationContext> functionDeclaration() {
			return getRuleContexts(FunctionDeclarationContext.class);
		}
		public FunctionDeclarationContext functionDeclaration(int i) {
			return getRuleContext(FunctionDeclarationContext.class,i);
		}
		public List<InitDeclarationContext> initDeclaration() {
			return getRuleContexts(InitDeclarationContext.class);
		}
		public InitDeclarationContext initDeclaration(int i) {
			return getRuleContext(InitDeclarationContext.class,i);
		}
		public List<StartDeclarationContext> startDeclaration() {
			return getRuleContexts(StartDeclarationContext.class);
		}
		public StartDeclarationContext startDeclaration(int i) {
			return getRuleContext(StartDeclarationContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			((ProgramContext)_localctx).pro =  new Program(); _localctx.pro.setLine(0);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(73);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(61);
						((ProgramContext)_localctx).varDeclaration = varDeclaration();
						 _localctx.pro.addVar(((ProgramContext)_localctx).varDeclaration.varDecRet); 
						}
						break;
					case 2:
						{
						setState(64);
						((ProgramContext)_localctx).functionDeclaration = functionDeclaration();
						 _localctx.pro.addFunction(((ProgramContext)_localctx).functionDeclaration.funcDecRet); 
						}
						break;
					case 3:
						{
						setState(67);
						((ProgramContext)_localctx).initDeclaration = initDeclaration();
						 _localctx.pro.addInit(((ProgramContext)_localctx).initDeclaration.initDecRet); 
						}
						break;
					case 4:
						{
						setState(70);
						((ProgramContext)_localctx).startDeclaration = startDeclaration();
						 _localctx.pro.addStart(((ProgramContext)_localctx).startDeclaration.startDecRet); 
						}
						break;
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(78);
			((ProgramContext)_localctx).mainDeclaration = mainDeclaration();
			 _localctx.pro.setMain(((ProgramContext)_localctx).mainDeclaration.mainDecRet); 
			setState(80);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public Identifier identRet;
		public Token ID;
		public TerminalNode ID() { return getToken(UTLParser.ID, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((IdentifierContext)_localctx).identRet =  new Identifier("");
			setState(83);
			((IdentifierContext)_localctx).ID = match(ID);
			 _localctx.identRet.setName((((IdentifierContext)_localctx).ID!=null?((IdentifierContext)_localctx).ID.getText():null)); _localctx.identRet.setLine((((IdentifierContext)_localctx).ID!=null?((IdentifierContext)_localctx).ID.getLine():0));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StatementContext extends ParserRuleContext {
		public Statement statementRet;
		public VarDeclarationContext varDeclaration;
		public FunctionDeclarationContext functionDeclaration;
		public AssignStatementContext assignStatement;
		public ContinueBreakStatementContext continueBreakStatement;
		public ReturnStatementContext returnStatement;
		public IfStatementContext ifStatement;
		public WhileStatementContext whileStatement;
		public ForStatementContext forStatement;
		public TryCatchStatementContext tryCatchStatement;
		public ThrowStatementContext throwStatement;
		public ExpressionContext expression;
		public PrintStatementContext printStatement;
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public ContinueBreakStatementContext continueBreakStatement() {
			return getRuleContext(ContinueBreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public TryCatchStatementContext tryCatchStatement() {
			return getRuleContext(TryCatchStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public PrintStatementContext printStatement() {
			return getRuleContext(PrintStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(86);
				((StatementContext)_localctx).varDeclaration = varDeclaration();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).varDeclaration.varDecRet; 
				}
				break;
			case 2:
				{
				setState(89);
				((StatementContext)_localctx).functionDeclaration = functionDeclaration();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).functionDeclaration.funcDecRet; 
				}
				break;
			case 3:
				{
				setState(92);
				((StatementContext)_localctx).assignStatement = assignStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).assignStatement.assignStmtRet; 
				}
				break;
			case 4:
				{
				setState(95);
				((StatementContext)_localctx).continueBreakStatement = continueBreakStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).continueBreakStatement.contBreakRet; 
				}
				break;
			case 5:
				{
				setState(98);
				((StatementContext)_localctx).returnStatement = returnStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).returnStatement.retStmtRet; 
				}
				break;
			case 6:
				{
				setState(101);
				((StatementContext)_localctx).ifStatement = ifStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).ifStatement.ifStmtRet; 
				}
				break;
			case 7:
				{
				setState(104);
				((StatementContext)_localctx).whileStatement = whileStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).whileStatement.whileStmtRet; 
				}
				break;
			case 8:
				{
				setState(107);
				((StatementContext)_localctx).forStatement = forStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).forStatement.forStmtRet; 
				}
				break;
			case 9:
				{
				setState(110);
				((StatementContext)_localctx).tryCatchStatement = tryCatchStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).tryCatchStatement.tryCatchStmtRet; 
				}
				break;
			case 10:
				{
				setState(113);
				((StatementContext)_localctx).throwStatement = throwStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).throwStatement.throwStmtRet; 
				}
				break;
			case 11:
				{
				setState(116);
				((StatementContext)_localctx).expression = expression(0);
				setState(117);
				match(SEMICOLON);
				 ExpressionStmt expret = new ExpressionStmt(((StatementContext)_localctx).expression.expressionRet);((StatementContext)_localctx).statementRet =  expret; 
				}
				break;
			case 12:
				{
				setState(120);
				((StatementContext)_localctx).printStatement = printStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).printStatement.printRet; 
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintStatementContext extends ParserRuleContext {
		public PrintStmt printRet;
		public Token p;
		public ExpressionContext exp1;
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public TerminalNode PRINT() { return getToken(UTLParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_printStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			((PrintStatementContext)_localctx).p = match(PRINT);
			setState(126);
			match(LPAREN);
			setState(127);
			((PrintStatementContext)_localctx).exp1 = expression(0);
			 ((PrintStatementContext)_localctx).printRet =  new PrintStmt(((PrintStatementContext)_localctx).exp1.expressionRet); _localctx.printRet.setLine(((PrintStatementContext)_localctx).p.getLine()); 
			setState(129);
			match(RPAREN);
			setState(130);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDeclaration varDecRet;
		public AllTypeContext allType;
		public Token INT_LITERAL;
		public IdentifierContext i1;
		public IdentifierContext identifier;
		public ExpressionContext expression;
		public AllTypeContext allType() {
			return getRuleContext(AllTypeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(UTLParser.LBRACK, 0); }
		public TerminalNode INT_LITERAL() { return getToken(UTLParser.INT_LITERAL, 0); }
		public TerminalNode RBRACK() { return getToken(UTLParser.RBRACK, 0); }
		public TerminalNode ASSIGN() { return getToken(UTLParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((VarDeclarationContext)_localctx).varDecRet =  new VarDeclaration(); 
			setState(133);
			((VarDeclarationContext)_localctx).allType = allType();
			 _localctx.varDecRet.setType(((VarDeclarationContext)_localctx).allType.allTypeRet); 
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(135);
				match(LBRACK);
				setState(136);
				((VarDeclarationContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				setState(137);
				match(RBRACK);
				 _localctx.varDecRet.setLength(Integer.parseInt((((VarDeclarationContext)_localctx).INT_LITERAL!=null?((VarDeclarationContext)_localctx).INT_LITERAL.getText():null))); 
				}
			}

			setState(141);
			((VarDeclarationContext)_localctx).i1 = ((VarDeclarationContext)_localctx).identifier = identifier();
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(142);
				match(ASSIGN);
				setState(143);
				((VarDeclarationContext)_localctx).expression = expression(0);
				_localctx.varDecRet.setRValue(((VarDeclarationContext)_localctx).expression.expressionRet);
				}
			}

			setState(148);
			match(SEMICOLON);
			 _localctx.varDecRet.setIdentifier(((VarDeclarationContext)_localctx).identifier.identRet); _localctx.varDecRet.setLine(((VarDeclarationContext)_localctx).i1.identRet.getLine());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncVarDeclarationContext extends ParserRuleContext {
		public VarDeclaration funcVarDecRet;
		public AllTypeContext allType;
		public Token INT_LITERAL;
		public IdentifierContext i1;
		public IdentifierContext identifier;
		public ExpressionContext expression;
		public AllTypeContext allType() {
			return getRuleContext(AllTypeContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(UTLParser.LBRACK, 0); }
		public TerminalNode INT_LITERAL() { return getToken(UTLParser.INT_LITERAL, 0); }
		public TerminalNode RBRACK() { return getToken(UTLParser.RBRACK, 0); }
		public TerminalNode ASSIGN() { return getToken(UTLParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FuncVarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcVarDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterFuncVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitFuncVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitFuncVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncVarDeclarationContext funcVarDeclaration() throws RecognitionException {
		FuncVarDeclarationContext _localctx = new FuncVarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_funcVarDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((FuncVarDeclarationContext)_localctx).funcVarDecRet =  new VarDeclaration(); 
			setState(152);
			((FuncVarDeclarationContext)_localctx).allType = allType();
			 _localctx.funcVarDecRet.setType(((FuncVarDeclarationContext)_localctx).allType.allTypeRet); 
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(154);
				match(LBRACK);
				setState(155);
				((FuncVarDeclarationContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				setState(156);
				match(RBRACK);
				 _localctx.funcVarDecRet.setLength(Integer.parseInt((((FuncVarDeclarationContext)_localctx).INT_LITERAL!=null?((FuncVarDeclarationContext)_localctx).INT_LITERAL.getText():null))); 
				}
			}

			setState(160);
			((FuncVarDeclarationContext)_localctx).i1 = ((FuncVarDeclarationContext)_localctx).identifier = identifier();
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(161);
				match(ASSIGN);
				setState(162);
				((FuncVarDeclarationContext)_localctx).expression = expression(0);
				_localctx.funcVarDecRet.setRValue(((FuncVarDeclarationContext)_localctx).expression.expressionRet);
				}
			}

			 _localctx.funcVarDecRet.setIdentifier(((FuncVarDeclarationContext)_localctx).identifier.identRet); _localctx.funcVarDecRet.setLine(((FuncVarDeclarationContext)_localctx).i1.identRet.getLine());
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionDeclaration funcDecRet;
		public PrimitiveTypeContext primitiveType;
		public IdentifierContext i1;
		public IdentifierContext identifier;
		public FuncVarDeclarationContext funcVarDeclaration;
		public StatementContext statement;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<FuncVarDeclarationContext> funcVarDeclaration() {
			return getRuleContexts(FuncVarDeclarationContext.class);
		}
		public FuncVarDeclarationContext funcVarDeclaration(int i) {
			return getRuleContext(FuncVarDeclarationContext.class,i);
		}
		public TerminalNode THROW() { return getToken(UTLParser.THROW, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public List<TerminalNode> COMMA() { return getTokens(UTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UTLParser.COMMA, i);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitFunctionDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitFunctionDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((FunctionDeclarationContext)_localctx).funcDecRet =  new FunctionDeclaration(); 
			setState(170);
			((FunctionDeclarationContext)_localctx).primitiveType = primitiveType();
			 _localctx.funcDecRet.setReturnType(((FunctionDeclarationContext)_localctx).primitiveType.primTypeRet); 
			setState(172);
			((FunctionDeclarationContext)_localctx).i1 = ((FunctionDeclarationContext)_localctx).identifier = identifier();
			 _localctx.funcDecRet.setName(((FunctionDeclarationContext)_localctx).identifier.identRet); _localctx.funcDecRet.setLine(((FunctionDeclarationContext)_localctx).i1.identRet.getLine()); 
			setState(174);
			match(LPAREN);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 3932191L) != 0)) {
				{
				setState(175);
				((FunctionDeclarationContext)_localctx).funcVarDeclaration = funcVarDeclaration();
				 _localctx.funcDecRet.addArg(((FunctionDeclarationContext)_localctx).funcVarDeclaration.funcVarDecRet);
				setState(183);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(177);
					match(COMMA);
					setState(178);
					((FunctionDeclarationContext)_localctx).funcVarDeclaration = funcVarDeclaration();
					 _localctx.funcDecRet.addArg(((FunctionDeclarationContext)_localctx).funcVarDeclaration.funcVarDecRet); 
					}
					}
					setState(185);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(188);
			match(RPAREN);
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(189);
				match(THROW);
				setState(190);
				match(EXCEPTION);
				}
				break;
			}
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(193);
				match(LBRACE);
				setState(199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 286254282134003776L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 16383L) != 0)) {
					{
					{
					setState(194);
					((FunctionDeclarationContext)_localctx).statement = statement();
					 _localctx.funcDecRet.addStatement(((FunctionDeclarationContext)_localctx).statement.statementRet); 
					}
					}
					setState(201);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(202);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(203);
				((FunctionDeclarationContext)_localctx).statement = statement();
				 _localctx.funcDecRet.addStatement(((FunctionDeclarationContext)_localctx).statement.statementRet);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MainDeclarationContext extends ParserRuleContext {
		public MainDeclaration mainDecRet;
		public Token MAIN;
		public StatementContext statement;
		public TerminalNode VOID() { return getToken(UTLParser.VOID, 0); }
		public TerminalNode MAIN() { return getToken(UTLParser.MAIN, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterMainDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitMainDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitMainDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainDeclarationContext mainDeclaration() throws RecognitionException {
		MainDeclarationContext _localctx = new MainDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_mainDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((MainDeclarationContext)_localctx).mainDecRet =  new MainDeclaration(); 
			setState(209);
			match(VOID);
			setState(210);
			((MainDeclarationContext)_localctx).MAIN = match(MAIN);
			setState(211);
			match(LPAREN);
			setState(212);
			match(RPAREN);
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(213);
				match(LBRACE);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 286254282134003776L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 16383L) != 0)) {
					{
					{
					setState(214);
					((MainDeclarationContext)_localctx).statement = statement();
					_localctx.mainDecRet.setLine((((MainDeclarationContext)_localctx).MAIN!=null?((MainDeclarationContext)_localctx).MAIN.getLine():0));_localctx.mainDecRet.addStatement(((MainDeclarationContext)_localctx).statement.statementRet);
					}
					}
					setState(221);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(222);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(223);
				((MainDeclarationContext)_localctx).statement = statement();
				 _localctx.mainDecRet.addStatement(((MainDeclarationContext)_localctx).statement.statementRet);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitDeclarationContext extends ParserRuleContext {
		public OnInitDeclaration initDecRet;
		public Token ONINIT;
		public IdentifierContext identifier;
		public StatementContext statement;
		public TerminalNode VOID() { return getToken(UTLParser.VOID, 0); }
		public TerminalNode ONINIT() { return getToken(UTLParser.ONINIT, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode TRADE() { return getToken(UTLParser.TRADE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode THROW() { return getToken(UTLParser.THROW, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public InitDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterInitDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitInitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitInitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitDeclarationContext initDeclaration() throws RecognitionException {
		InitDeclarationContext _localctx = new InitDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_initDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((InitDeclarationContext)_localctx).initDecRet =  new OnInitDeclaration();
			setState(229);
			match(VOID);
			setState(230);
			((InitDeclarationContext)_localctx).ONINIT = match(ONINIT);
			setState(231);
			match(LPAREN);
			setState(232);
			match(TRADE);
			setState(233);
			((InitDeclarationContext)_localctx).identifier = identifier();
			_localctx.initDecRet.setLine((((InitDeclarationContext)_localctx).ONINIT!=null?((InitDeclarationContext)_localctx).ONINIT.getLine():0)); _localctx.initDecRet.setTradeName(((InitDeclarationContext)_localctx).identifier.identRet);
			setState(235);
			match(RPAREN);
			setState(238);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(236);
				match(THROW);
				setState(237);
				match(EXCEPTION);
				}
				break;
			}
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(240);
				match(LBRACE);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 286254282134003776L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 16383L) != 0)) {
					{
					{
					setState(241);
					((InitDeclarationContext)_localctx).statement = statement();
					_localctx.initDecRet.addStatement(((InitDeclarationContext)_localctx).statement.statementRet);
					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(250);
				((InitDeclarationContext)_localctx).statement = statement();
				_localctx.initDecRet.addStatement(((InitDeclarationContext)_localctx).statement.statementRet);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartDeclarationContext extends ParserRuleContext {
		public OnStartDeclaration startDecRet;
		public Token VOID;
		public IdentifierContext identifier;
		public StatementContext statement;
		public TerminalNode VOID() { return getToken(UTLParser.VOID, 0); }
		public TerminalNode ONSTART() { return getToken(UTLParser.ONSTART, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode TRADE() { return getToken(UTLParser.TRADE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode THROW() { return getToken(UTLParser.THROW, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public StartDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterStartDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitStartDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitStartDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartDeclarationContext startDeclaration() throws RecognitionException {
		StartDeclarationContext _localctx = new StartDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_startDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((StartDeclarationContext)_localctx).startDecRet =  new OnStartDeclaration(null);
			setState(256);
			((StartDeclarationContext)_localctx).VOID = match(VOID);
			setState(257);
			match(ONSTART);
			setState(258);
			match(LPAREN);
			setState(259);
			match(TRADE);
			_localctx.startDecRet.setLine((((StartDeclarationContext)_localctx).VOID!=null?((StartDeclarationContext)_localctx).VOID.getLine():0));
			setState(261);
			((StartDeclarationContext)_localctx).identifier = identifier();
			_localctx.startDecRet.setTradeName(((StartDeclarationContext)_localctx).identifier.identRet);
			setState(263);
			match(RPAREN);
			setState(266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(264);
				match(THROW);
				setState(265);
				match(EXCEPTION);
				}
				break;
			}
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(268);
				match(LBRACE);
				setState(274);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 286254282134003776L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 16383L) != 0)) {
					{
					{
					setState(269);
					((StartDeclarationContext)_localctx).statement = statement();
					_localctx.startDecRet.addStatement(((StartDeclarationContext)_localctx).statement.statementRet);
					}
					}
					setState(276);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(277);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(278);
				((StartDeclarationContext)_localctx).statement = statement();
				_localctx.startDecRet.addStatement(((StartDeclarationContext)_localctx).statement.statementRet);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignStatementContext extends ParserRuleContext {
		public AssignStmt assignStmtRet;
		public IdentifierContext i1;
		public IdentifierContext i2;
		public ExpressionContext ex1;
		public AssignContext assignType;
		public ExpressionContext ex2;
		public Token SEMICOLON;
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(UTLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(UTLParser.RBRACK, 0); }
		public AssignStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterAssignStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitAssignStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitAssignStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignStatementContext assignStatement() throws RecognitionException {
		AssignStatementContext _localctx = new AssignStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((AssignStatementContext)_localctx).assignStmtRet =  new AssignStmt(null,null);
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(284);
				((AssignStatementContext)_localctx).i1 = identifier();
				_localctx.assignStmtRet.setLValue(((AssignStatementContext)_localctx).i1.identRet);
				}
				break;
			case 2:
				{
				{
				setState(287);
				((AssignStatementContext)_localctx).i2 = identifier();
				setState(288);
				match(LBRACK);
				setState(289);
				((AssignStatementContext)_localctx).ex1 = expression(0);
				setState(290);
				match(RBRACK);
				ArrayIdentifier arrayRet = new ArrayIdentifier(((AssignStatementContext)_localctx).i2.identRet.getName(),((AssignStatementContext)_localctx).ex1.expressionRet);arrayRet.setLine(((AssignStatementContext)_localctx).i2.identRet.getLine());_localctx.assignStmtRet.setLValue(arrayRet);
				}
				}
				break;
			}
			setState(295);
			((AssignStatementContext)_localctx).assignType = assign();
			_localctx.assignStmtRet.setBinaryOperator(((AssignStatementContext)_localctx).assignType.op);
			setState(297);
			((AssignStatementContext)_localctx).ex2 = expression(0);
			_localctx.assignStmtRet.setRValue(((AssignStatementContext)_localctx).ex2.expressionRet);
			setState(299);
			((AssignStatementContext)_localctx).SEMICOLON = match(SEMICOLON);
			_localctx.assignStmtRet.setLine((((AssignStatementContext)_localctx).SEMICOLON!=null?((AssignStatementContext)_localctx).SEMICOLON.getLine():0));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public IfElseStmt ifStmtRet;
		public Token IF;
		public ExpressionContext expression;
		public StatementContext statement;
		public TerminalNode IF() { return getToken(UTLParser.IF, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(UTLParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(UTLParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(UTLParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(UTLParser.RBRACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(UTLParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((IfStatementContext)_localctx).ifStmtRet =  new IfElseStmt(null);
			setState(303);
			((IfStatementContext)_localctx).IF = match(IF);
			_localctx.ifStmtRet.setLine((((IfStatementContext)_localctx).IF!=null?((IfStatementContext)_localctx).IF.getLine():0));
			setState(305);
			match(LPAREN);
			setState(306);
			((IfStatementContext)_localctx).expression = expression(0);
			_localctx.ifStmtRet.setCondition(((IfStatementContext)_localctx).expression.expressionRet);
			setState(308);
			match(RPAREN);
			setState(322);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(309);
				match(LBRACE);
				setState(315);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 286254282134003776L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 16383L) != 0)) {
					{
					{
					setState(310);
					((IfStatementContext)_localctx).statement = statement();
					_localctx.ifStmtRet.addThenStatement(((IfStatementContext)_localctx).statement.statementRet);
					}
					}
					setState(317);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(318);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(319);
				((IfStatementContext)_localctx).statement = statement();
				_localctx.ifStmtRet.addThenStatement(((IfStatementContext)_localctx).statement.statementRet);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(324);
				match(ELSE);
				setState(338);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE:
					{
					setState(325);
					match(LBRACE);
					setState(331);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 286254282134003776L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 16383L) != 0)) {
						{
						{
						setState(326);
						((IfStatementContext)_localctx).statement = statement();
						_localctx.ifStmtRet.addElseStatement(((IfStatementContext)_localctx).statement.statementRet);
						}
						}
						setState(333);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(334);
					match(RBRACE);
					}
					break;
				case LPAREN:
				case MINUS:
				case NOT:
				case BIT_NOT:
				case INC:
				case DEC:
				case TRY:
				case THROW:
				case IF:
				case FOR:
				case WHILE:
				case BREAK:
				case CONTINUE:
				case RETURN:
				case FLOAT:
				case STRING:
				case BOOL:
				case VOID:
				case INT:
				case BUY:
				case SELL:
				case TRADE:
				case ORDER:
				case CANDLE:
				case EXCEPTION:
				case REFRESH_RATE:
				case GET_CANDLE:
				case TERMINATE:
				case CONNECT:
				case OBSERVE:
				case PRINT:
				case ID:
				case INT_LITERAL:
				case FLOAT_LITERAL:
				case STRING_LITERAL:
					{
					setState(335);
					((IfStatementContext)_localctx).statement = statement();
					_localctx.ifStmtRet.addElseStatement(((IfStatementContext)_localctx).statement.statementRet);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileStatementContext extends ParserRuleContext {
		public WhileStmt whileStmtRet;
		public Token WHILE;
		public ExpressionContext expression;
		public StatementContext statement;
		public TerminalNode WHILE() { return getToken(UTLParser.WHILE, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((WhileStatementContext)_localctx).whileStmtRet =  new WhileStmt(null);
			setState(343);
			((WhileStatementContext)_localctx).WHILE = match(WHILE);
			_localctx.whileStmtRet.setLine((((WhileStatementContext)_localctx).WHILE!=null?((WhileStatementContext)_localctx).WHILE.getLine():0));
			setState(345);
			match(LPAREN);
			setState(346);
			((WhileStatementContext)_localctx).expression = expression(0);
			_localctx.whileStmtRet.setCondition(((WhileStatementContext)_localctx).expression.expressionRet);
			setState(348);
			match(RPAREN);
			setState(362);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(349);
				match(LBRACE);
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 286254282134003776L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 16383L) != 0)) {
					{
					{
					setState(350);
					((WhileStatementContext)_localctx).statement = statement();
					_localctx.whileStmtRet.addBody(((WhileStatementContext)_localctx).statement.statementRet);
					}
					}
					setState(357);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(358);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(359);
				((WhileStatementContext)_localctx).statement = statement();
				_localctx.whileStmtRet.addBody(((WhileStatementContext)_localctx).statement.statementRet);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ForStatementContext extends ParserRuleContext {
		public ForStmt forStmtRet;
		public Token FOR;
		public StatementContext statement;
		public ExpressionContext expression;
		public TerminalNode FOR() { return getToken(UTLParser.FOR, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((ForStatementContext)_localctx).forStmtRet =  new ForStmt();
			setState(365);
			((ForStatementContext)_localctx).FOR = match(FOR);
			_localctx.forStmtRet.setLine((((ForStatementContext)_localctx).FOR!=null?((ForStatementContext)_localctx).FOR.getLine():0));
			setState(367);
			match(LPAREN);
			setState(368);
			((ForStatementContext)_localctx).statement = statement();
			_localctx.forStmtRet.addInit(((ForStatementContext)_localctx).statement.statementRet);
			setState(370);
			((ForStatementContext)_localctx).expression = expression(0);
			_localctx.forStmtRet.setCondition(((ForStatementContext)_localctx).expression.expressionRet);
			setState(372);
			match(SEMICOLON);
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 216172785369096256L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 15871L) != 0)) {
				{
				setState(373);
				((ForStatementContext)_localctx).expression = expression(0);
				_localctx.forStmtRet.addUpdate(((ForStatementContext)_localctx).expression.expressionRet);
				}
			}

			setState(378);
			match(RPAREN);
			setState(392);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(379);
				match(LBRACE);
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 286254282134003776L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 16383L) != 0)) {
					{
					{
					setState(380);
					((ForStatementContext)_localctx).statement = statement();
					_localctx.forStmtRet.addBody(((ForStatementContext)_localctx).statement.statementRet);
					}
					}
					setState(387);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(388);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(389);
				((ForStatementContext)_localctx).statement = statement();
				_localctx.forStmtRet.addBody(((ForStatementContext)_localctx).statement.statementRet);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TryCatchStatementContext extends ParserRuleContext {
		public TryCatchStmt tryCatchStmtRet;
		public Token TRY;
		public StatementContext statement;
		public TerminalNode TRY() { return getToken(UTLParser.TRY, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(UTLParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(UTLParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(UTLParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(UTLParser.RBRACE, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode CATCH() { return getToken(UTLParser.CATCH, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public TerminalNode ID() { return getToken(UTLParser.ID, 0); }
		public TryCatchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryCatchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterTryCatchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitTryCatchStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitTryCatchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TryCatchStatementContext tryCatchStatement() throws RecognitionException {
		TryCatchStatementContext _localctx = new TryCatchStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tryCatchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((TryCatchStatementContext)_localctx).tryCatchStmtRet =  new TryCatchStmt();
			setState(395);
			((TryCatchStatementContext)_localctx).TRY = match(TRY);
			_localctx.tryCatchStmtRet.setLine((((TryCatchStatementContext)_localctx).TRY!=null?((TryCatchStatementContext)_localctx).TRY.getLine():0));
			setState(410);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(397);
				match(LBRACE);
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 286254282134003776L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 16383L) != 0)) {
					{
					{
					setState(398);
					((TryCatchStatementContext)_localctx).statement = statement();
					_localctx.tryCatchStmtRet.addThenStatement(((TryCatchStatementContext)_localctx).statement.statementRet);
					}
					}
					setState(405);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(406);
				match(RBRACE);
				}
				break;
			case LPAREN:
			case MINUS:
			case NOT:
			case BIT_NOT:
			case INC:
			case DEC:
			case TRY:
			case THROW:
			case IF:
			case FOR:
			case WHILE:
			case BREAK:
			case CONTINUE:
			case RETURN:
			case FLOAT:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
			case BUY:
			case SELL:
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
			case ID:
			case INT_LITERAL:
			case FLOAT_LITERAL:
			case STRING_LITERAL:
				{
				setState(407);
				((TryCatchStatementContext)_localctx).statement = statement();
				_localctx.tryCatchStmtRet.addThenStatement(((TryCatchStatementContext)_localctx).statement.statementRet);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(412);
				match(CATCH);
				setState(413);
				match(EXCEPTION);
				setState(414);
				match(ID);
				setState(428);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE:
					{
					setState(415);
					match(LBRACE);
					setState(421);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 286254282134003776L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 16383L) != 0)) {
						{
						{
						setState(416);
						((TryCatchStatementContext)_localctx).statement = statement();
						_localctx.tryCatchStmtRet.addElseStatement(((TryCatchStatementContext)_localctx).statement.statementRet);
						}
						}
						setState(423);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(424);
					match(RBRACE);
					}
					break;
				case LPAREN:
				case MINUS:
				case NOT:
				case BIT_NOT:
				case INC:
				case DEC:
				case TRY:
				case THROW:
				case IF:
				case FOR:
				case WHILE:
				case BREAK:
				case CONTINUE:
				case RETURN:
				case FLOAT:
				case STRING:
				case BOOL:
				case VOID:
				case INT:
				case BUY:
				case SELL:
				case TRADE:
				case ORDER:
				case CANDLE:
				case EXCEPTION:
				case REFRESH_RATE:
				case GET_CANDLE:
				case TERMINATE:
				case CONNECT:
				case OBSERVE:
				case PRINT:
				case ID:
				case INT_LITERAL:
				case FLOAT_LITERAL:
				case STRING_LITERAL:
					{
					setState(425);
					((TryCatchStatementContext)_localctx).statement = statement();
					_localctx.tryCatchStmtRet.addElseStatement(((TryCatchStatementContext)_localctx).statement.statementRet);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ContinueBreakStatementContext extends ParserRuleContext {
		public ContinueBreakStmt contBreakRet;
		public Token BREAK;
		public Token CONTINUE;
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public TerminalNode BREAK() { return getToken(UTLParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(UTLParser.CONTINUE, 0); }
		public ContinueBreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueBreakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterContinueBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitContinueBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitContinueBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContinueBreakStatementContext continueBreakStatement() throws RecognitionException {
		ContinueBreakStatementContext _localctx = new ContinueBreakStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_continueBreakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(436);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BREAK:
				{
				setState(432);
				((ContinueBreakStatementContext)_localctx).BREAK = match(BREAK);
				((ContinueBreakStatementContext)_localctx).contBreakRet =  new ContinueBreakStmt((((ContinueBreakStatementContext)_localctx).BREAK!=null?((ContinueBreakStatementContext)_localctx).BREAK.getText():null));_localctx.contBreakRet.setLine((((ContinueBreakStatementContext)_localctx).BREAK!=null?((ContinueBreakStatementContext)_localctx).BREAK.getLine():0));
				}
				break;
			case CONTINUE:
				{
				setState(434);
				((ContinueBreakStatementContext)_localctx).CONTINUE = match(CONTINUE);
				((ContinueBreakStatementContext)_localctx).contBreakRet =  new ContinueBreakStmt((((ContinueBreakStatementContext)_localctx).CONTINUE!=null?((ContinueBreakStatementContext)_localctx).CONTINUE.getText():null)); _localctx.contBreakRet.setLine((((ContinueBreakStatementContext)_localctx).CONTINUE!=null?((ContinueBreakStatementContext)_localctx).CONTINUE.getLine():0));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(438);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public ReturnStmt retStmtRet;
		public Token RETURN;
		public ExpressionContext expression;
		public TerminalNode RETURN() { return getToken(UTLParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			((ReturnStatementContext)_localctx).RETURN = match(RETURN);
			setState(441);
			((ReturnStatementContext)_localctx).expression = expression(0);
			((ReturnStatementContext)_localctx).retStmtRet =  new ReturnStmt(((ReturnStatementContext)_localctx).expression.expressionRet);_localctx.retStmtRet.setLine((((ReturnStatementContext)_localctx).RETURN!=null?((ReturnStatementContext)_localctx).RETURN.getLine():0));
			setState(443);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ThrowStatementContext extends ParserRuleContext {
		public ThrowStmt throwStmtRet;
		public Token THROW;
		public ExpressionContext expression;
		public TerminalNode THROW() { return getToken(UTLParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitThrowStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitThrowStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			((ThrowStatementContext)_localctx).THROW = match(THROW);
			setState(446);
			((ThrowStatementContext)_localctx).expression = expression(0);
			((ThrowStatementContext)_localctx).throwStmtRet =  new ThrowStmt(((ThrowStatementContext)_localctx).expression.expressionRet);_localctx.throwStmtRet.setLine((((ThrowStatementContext)_localctx).THROW!=null?((ThrowStatementContext)_localctx).THROW.getLine():0));
			setState(448);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCall funcCallRet;
		public EspetialFunctionContext espetialFunction;
		public ComplexValueContext complexValue;
		public IdentifierContext identifier;
		public Token LPAREN;
		public ExpressionContext expression;
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public EspetialFunctionContext espetialFunction() {
			return getRuleContext(EspetialFunctionContext.class,0);
		}
		public ComplexValueContext complexValue() {
			return getRuleContext(ComplexValueContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(UTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UTLParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((FunctionCallContext)_localctx).funcCallRet =  new FunctionCall(null);
			setState(460);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
				{
				setState(451);
				((FunctionCallContext)_localctx).espetialFunction = espetialFunction();
				_localctx.funcCallRet.setFunctionName(((FunctionCallContext)_localctx).espetialFunction.name);
				}
				break;
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
				{
				setState(454);
				((FunctionCallContext)_localctx).complexValue = complexValue();
				_localctx.funcCallRet.setFunctionName(((FunctionCallContext)_localctx).complexValue.compTypeRet);
				}
				break;
			case ID:
				{
				setState(457);
				((FunctionCallContext)_localctx).identifier = identifier();
				_localctx.funcCallRet.setFunctionName(((FunctionCallContext)_localctx).identifier.identRet);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(462);
			((FunctionCallContext)_localctx).LPAREN = match(LPAREN);
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 216172785369096256L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 15871L) != 0)) {
				{
				setState(463);
				((FunctionCallContext)_localctx).expression = expression(0);
				_localctx.funcCallRet.addArg(((FunctionCallContext)_localctx).expression.expressionRet);
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(465);
					match(COMMA);
					setState(466);
					((FunctionCallContext)_localctx).expression = expression(0);
					_localctx.funcCallRet.addArg(((FunctionCallContext)_localctx).expression.expressionRet);
					}
					}
					setState(473);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(476);
			match(RPAREN);
			_localctx.funcCallRet.setLine((((FunctionCallContext)_localctx).LPAREN!=null?((FunctionCallContext)_localctx).LPAREN.getLine():0));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallContext extends ParserRuleContext {
		public MethodCall methodCallRet;
		public IdentifierContext identifier;
		public ExpressionContext expression;
		public Token DOT;
		public EspetialMethodContext espetialMethod;
		public TerminalNode DOT() { return getToken(UTLParser.DOT, 0); }
		public EspetialMethodContext espetialMethod() {
			return getRuleContext(EspetialMethodContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode LBRACK() { return getToken(UTLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(UTLParser.RBRACK, 0); }
		public List<TerminalNode> COMMA() { return getTokens(UTLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(UTLParser.COMMA, i);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			((MethodCallContext)_localctx).methodCallRet =  new MethodCall(null,null);
			setState(490);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(480);
				((MethodCallContext)_localctx).identifier = identifier();
				_localctx.methodCallRet.setInstance(((MethodCallContext)_localctx).identifier.identRet);
				}
				break;
			case 2:
				{
				{
				setState(483);
				((MethodCallContext)_localctx).identifier = identifier();
				setState(484);
				match(LBRACK);
				setState(485);
				((MethodCallContext)_localctx).expression = expression(0);
				setState(486);
				match(RBRACK);
				}
				ArrayIdentifier arrayRet = new ArrayIdentifier(((MethodCallContext)_localctx).identifier.identRet.getName(),((MethodCallContext)_localctx).expression.expressionRet); _localctx.methodCallRet.setInstance(arrayRet);
				}
				break;
			}
			setState(492);
			((MethodCallContext)_localctx).DOT = match(DOT);
			_localctx.methodCallRet.setLine((((MethodCallContext)_localctx).DOT!=null?((MethodCallContext)_localctx).DOT.getLine():0));
			setState(494);
			((MethodCallContext)_localctx).espetialMethod = espetialMethod();
			_localctx.methodCallRet.setFunctionName(((MethodCallContext)_localctx).espetialMethod.name);
			setState(496);
			match(LPAREN);
			setState(508);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 216172785369096256L) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & 15871L) != 0)) {
				{
				setState(497);
				((MethodCallContext)_localctx).expression = expression(0);
				_localctx.methodCallRet.addArg(((MethodCallContext)_localctx).expression.expressionRet);
				setState(505);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(499);
					match(COMMA);
					setState(500);
					((MethodCallContext)_localctx).expression = expression(0);
					_localctx.methodCallRet.addArg(((MethodCallContext)_localctx).expression.expressionRet);
					}
					}
					setState(507);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(510);
			match(RPAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public Expression expressionRet;
		public ExpressionContext exp1;
		public ValueContext value;
		public Token NOT;
		public Token MINUS;
		public Token BIT_NOT;
		public Token INC;
		public Token DEC;
		public ExpressionContext expression;
		public IdentifierContext i1;
		public IdentifierContext i2;
		public FunctionCallContext functionCall;
		public MethodCallContext methodCall;
		public Token MULT;
		public Token DIV;
		public Token MOD;
		public ExpressionContext exp2;
		public Token PLUS;
		public Token L_SHIFT;
		public Token R_SHIFT;
		public Token LT;
		public Token GT;
		public Token EQ;
		public Token NEQ;
		public Token BIT_AND;
		public Token BIT_OR;
		public Token BIT_XOR;
		public Token AND;
		public Token OR;
		public Token DOT;
		public EspetialVariableContext espetialVariable;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(UTLParser.NOT, 0); }
		public TerminalNode MINUS() { return getToken(UTLParser.MINUS, 0); }
		public TerminalNode BIT_NOT() { return getToken(UTLParser.BIT_NOT, 0); }
		public TerminalNode INC() { return getToken(UTLParser.INC, 0); }
		public TerminalNode DEC() { return getToken(UTLParser.DEC, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(UTLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(UTLParser.RBRACK, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public TerminalNode MULT() { return getToken(UTLParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(UTLParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(UTLParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(UTLParser.PLUS, 0); }
		public TerminalNode L_SHIFT() { return getToken(UTLParser.L_SHIFT, 0); }
		public TerminalNode R_SHIFT() { return getToken(UTLParser.R_SHIFT, 0); }
		public TerminalNode LT() { return getToken(UTLParser.LT, 0); }
		public TerminalNode GT() { return getToken(UTLParser.GT, 0); }
		public TerminalNode EQ() { return getToken(UTLParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(UTLParser.NEQ, 0); }
		public TerminalNode BIT_AND() { return getToken(UTLParser.BIT_AND, 0); }
		public TerminalNode BIT_OR() { return getToken(UTLParser.BIT_OR, 0); }
		public TerminalNode BIT_XOR() { return getToken(UTLParser.BIT_XOR, 0); }
		public TerminalNode AND() { return getToken(UTLParser.AND, 0); }
		public TerminalNode OR() { return getToken(UTLParser.OR, 0); }
		public TerminalNode DOT() { return getToken(UTLParser.DOT, 0); }
		public EspetialVariableContext espetialVariable() {
			return getRuleContext(EspetialVariableContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(513);
				((ExpressionContext)_localctx).value = value();
				((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).value.valRet;
				}
				break;
			case 2:
				{
				 UnaryOperator op = UnaryOperator.NOT;Integer line;
				setState(527);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(517);
					((ExpressionContext)_localctx).NOT = match(NOT);
					op = UnaryOperator.NOT;line = (((ExpressionContext)_localctx).NOT!=null?((ExpressionContext)_localctx).NOT.getLine():0);
					}
					break;
				case MINUS:
					{
					setState(519);
					((ExpressionContext)_localctx).MINUS = match(MINUS);
					op = UnaryOperator.MINUS;line = (((ExpressionContext)_localctx).MINUS!=null?((ExpressionContext)_localctx).MINUS.getLine():0);
					}
					break;
				case BIT_NOT:
					{
					setState(521);
					((ExpressionContext)_localctx).BIT_NOT = match(BIT_NOT);
					op = UnaryOperator.BIT_NOT;line=(((ExpressionContext)_localctx).BIT_NOT!=null?((ExpressionContext)_localctx).BIT_NOT.getLine():0);
					}
					break;
				case INC:
					{
					setState(523);
					((ExpressionContext)_localctx).INC = match(INC);
					op = UnaryOperator.INC;line = (((ExpressionContext)_localctx).INC!=null?((ExpressionContext)_localctx).INC.getLine():0);
					}
					break;
				case DEC:
					{
					setState(525);
					((ExpressionContext)_localctx).DEC = match(DEC);
					op = UnaryOperator.DEC;line= (((ExpressionContext)_localctx).DEC!=null?((ExpressionContext)_localctx).DEC.getLine():0);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(529);
				((ExpressionContext)_localctx).expression = expression(14);
				UnaryExpression unaryexpr = new UnaryExpression(op,((ExpressionContext)_localctx).expression.expressionRet);unaryexpr.setLine(line);((ExpressionContext)_localctx).expressionRet =  unaryexpr;
				}
				break;
			case 3:
				{
				setState(532);
				((ExpressionContext)_localctx).i1 = identifier();
				((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).i1.identRet;
				}
				break;
			case 4:
				{
				setState(535);
				((ExpressionContext)_localctx).i2 = identifier();
				{
				setState(536);
				match(LBRACK);
				setState(537);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(538);
				match(RBRACK);
				}
				ArrayIdentifier arrayRet = new ArrayIdentifier(((ExpressionContext)_localctx).i2.identRet.getName(),((ExpressionContext)_localctx).expression.expressionRet);arrayRet.setLine(((ExpressionContext)_localctx).i2.identRet.getLine()); ((ExpressionContext)_localctx).expressionRet =  arrayRet;
				}
				break;
			case 5:
				{
				setState(542);
				match(LPAREN);
				setState(543);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(544);
				match(RPAREN);
				((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).expression.expressionRet;
				}
				break;
			case 6:
				{
				setState(547);
				((ExpressionContext)_localctx).functionCall = functionCall();
				((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).functionCall.funcCallRet;
				}
				break;
			case 7:
				{
				setState(550);
				((ExpressionContext)_localctx).methodCall = methodCall();
				((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).methodCall.methodCallRet;
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(653);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(651);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(555);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						 BinaryOperator op = BinaryOperator.PLUS; Integer line;
						setState(563);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MULT:
							{
							setState(557);
							((ExpressionContext)_localctx).MULT = match(MULT);
							op = BinaryOperator.MULT; line = (((ExpressionContext)_localctx).MULT!=null?((ExpressionContext)_localctx).MULT.getLine():0);
							}
							break;
						case DIV:
							{
							setState(559);
							((ExpressionContext)_localctx).DIV = match(DIV);
							op = BinaryOperator.DIV; line = (((ExpressionContext)_localctx).DIV!=null?((ExpressionContext)_localctx).DIV.getLine():0);
							}
							break;
						case MOD:
							{
							setState(561);
							((ExpressionContext)_localctx).MOD = match(MOD);
							op = BinaryOperator.MULT; line = (((ExpressionContext)_localctx).MOD!=null?((ExpressionContext)_localctx).MOD.getLine():0);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(565);
						((ExpressionContext)_localctx).exp2 = ((ExpressionContext)_localctx).expression = expression(14);
						BinaryExpression binaryexpr = new BinaryExpression(((ExpressionContext)_localctx).exp1.expressionRet,((ExpressionContext)_localctx).exp2.expressionRet,op);binaryexpr.setLine(line);((ExpressionContext)_localctx).expressionRet =  binaryexpr;
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(568);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						 BinaryOperator op = BinaryOperator.PLUS; Integer line;
						setState(574);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case PLUS:
							{
							setState(570);
							((ExpressionContext)_localctx).PLUS = match(PLUS);
							op = BinaryOperator.PLUS; line = (((ExpressionContext)_localctx).PLUS!=null?((ExpressionContext)_localctx).PLUS.getLine():0);
							}
							break;
						case MINUS:
							{
							setState(572);
							((ExpressionContext)_localctx).MINUS = match(MINUS);
							op = BinaryOperator.MINUS;line = (((ExpressionContext)_localctx).MINUS!=null?((ExpressionContext)_localctx).MINUS.getLine():0);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(576);
						((ExpressionContext)_localctx).exp2 = ((ExpressionContext)_localctx).expression = expression(13);
						BinaryExpression binaryexpr = new BinaryExpression(((ExpressionContext)_localctx).exp1.expressionRet,((ExpressionContext)_localctx).exp2.expressionRet,op);binaryexpr.setLine(line);((ExpressionContext)_localctx).expressionRet =  binaryexpr;
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(579);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						 BinaryOperator op = BinaryOperator.PLUS; Integer line;
						setState(585);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case L_SHIFT:
							{
							setState(581);
							((ExpressionContext)_localctx).L_SHIFT = match(L_SHIFT);
							op = BinaryOperator.L_SHIFT; line = (((ExpressionContext)_localctx).L_SHIFT!=null?((ExpressionContext)_localctx).L_SHIFT.getLine():0);
							}
							break;
						case R_SHIFT:
							{
							setState(583);
							((ExpressionContext)_localctx).R_SHIFT = match(R_SHIFT);
							op = BinaryOperator.R_SHIFT;line = (((ExpressionContext)_localctx).R_SHIFT!=null?((ExpressionContext)_localctx).R_SHIFT.getLine():0);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(587);
						((ExpressionContext)_localctx).exp2 = ((ExpressionContext)_localctx).expression = expression(12);
						BinaryExpression binaryexpr = new BinaryExpression(((ExpressionContext)_localctx).exp1.expressionRet,((ExpressionContext)_localctx).exp2.expressionRet,op);binaryexpr.setLine(line);((ExpressionContext)_localctx).expressionRet =  binaryexpr;
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(590);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						 BinaryOperator op = BinaryOperator.PLUS; Integer line;
						setState(596);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LT:
							{
							setState(592);
							((ExpressionContext)_localctx).LT = match(LT);
							op = BinaryOperator.LT; line = (((ExpressionContext)_localctx).LT!=null?((ExpressionContext)_localctx).LT.getLine():0);
							}
							break;
						case GT:
							{
							setState(594);
							((ExpressionContext)_localctx).GT = match(GT);
							op = BinaryOperator.GT; line = (((ExpressionContext)_localctx).GT!=null?((ExpressionContext)_localctx).GT.getLine():0);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(598);
						((ExpressionContext)_localctx).exp2 = ((ExpressionContext)_localctx).expression = expression(11);
						BinaryExpression binaryexpr = new BinaryExpression(((ExpressionContext)_localctx).exp1.expressionRet,((ExpressionContext)_localctx).exp2.expressionRet,op);binaryexpr.setLine(line);((ExpressionContext)_localctx).expressionRet =  binaryexpr;
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(601);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						 BinaryOperator op = BinaryOperator.PLUS; Integer line;
						setState(607);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case EQ:
							{
							setState(603);
							((ExpressionContext)_localctx).EQ = match(EQ);
							op = BinaryOperator.EQ;line = (((ExpressionContext)_localctx).EQ!=null?((ExpressionContext)_localctx).EQ.getLine():0);
							}
							break;
						case NEQ:
							{
							setState(605);
							((ExpressionContext)_localctx).NEQ = match(NEQ);
							op = BinaryOperator.NEQ;line = (((ExpressionContext)_localctx).NEQ!=null?((ExpressionContext)_localctx).NEQ.getLine():0);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(609);
						((ExpressionContext)_localctx).exp2 = ((ExpressionContext)_localctx).expression = expression(10);
						BinaryExpression binaryexpr = new BinaryExpression(((ExpressionContext)_localctx).exp1.expressionRet,((ExpressionContext)_localctx).exp2.expressionRet,op);binaryexpr.setLine(line);((ExpressionContext)_localctx).expressionRet =  binaryexpr;
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(612);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						 BinaryOperator op = BinaryOperator.PLUS; Integer line;
						setState(620);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case BIT_AND:
							{
							setState(614);
							((ExpressionContext)_localctx).BIT_AND = match(BIT_AND);
							op = BinaryOperator.BIT_AND;line = (((ExpressionContext)_localctx).BIT_AND!=null?((ExpressionContext)_localctx).BIT_AND.getLine():0);
							}
							break;
						case BIT_OR:
							{
							setState(616);
							((ExpressionContext)_localctx).BIT_OR = match(BIT_OR);
							op =  BinaryOperator.BIT_OR; line = (((ExpressionContext)_localctx).BIT_OR!=null?((ExpressionContext)_localctx).BIT_OR.getLine():0);
							}
							break;
						case BIT_XOR:
							{
							setState(618);
							((ExpressionContext)_localctx).BIT_XOR = match(BIT_XOR);
							op = BinaryOperator.BIT_XOR; line = (((ExpressionContext)_localctx).BIT_XOR!=null?((ExpressionContext)_localctx).BIT_XOR.getLine():0);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(622);
						((ExpressionContext)_localctx).exp2 = ((ExpressionContext)_localctx).expression = expression(9);
						BinaryExpression binaryexpr = new BinaryExpression(((ExpressionContext)_localctx).exp1.expressionRet,((ExpressionContext)_localctx).exp2.expressionRet,op);binaryexpr.setLine(line);((ExpressionContext)_localctx).expressionRet =  binaryexpr;
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(625);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(626);
						((ExpressionContext)_localctx).AND = match(AND);
						 BinaryOperator op = BinaryOperator.AND; Integer line = (((ExpressionContext)_localctx).AND!=null?((ExpressionContext)_localctx).AND.getLine():0);
						setState(628);
						((ExpressionContext)_localctx).exp2 = ((ExpressionContext)_localctx).expression = expression(8);
						BinaryExpression binaryexpr = new BinaryExpression(((ExpressionContext)_localctx).exp1.expressionRet,((ExpressionContext)_localctx).exp2.expressionRet,op);binaryexpr.setLine(line);((ExpressionContext)_localctx).expressionRet =  binaryexpr;
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(631);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(632);
						((ExpressionContext)_localctx).OR = match(OR);
						 BinaryOperator op = BinaryOperator.OR; Integer line = (((ExpressionContext)_localctx).OR!=null?((ExpressionContext)_localctx).OR.getLine():0);
						setState(634);
						((ExpressionContext)_localctx).exp2 = ((ExpressionContext)_localctx).expression = expression(7);
						BinaryExpression binaryexpr = new BinaryExpression(((ExpressionContext)_localctx).exp1.expressionRet,((ExpressionContext)_localctx).exp2.expressionRet,op);binaryexpr.setLine(line);((ExpressionContext)_localctx).expressionRet =  binaryexpr;
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(637);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(638);
						((ExpressionContext)_localctx).DOT = match(DOT);
						setState(639);
						((ExpressionContext)_localctx).espetialVariable = espetialVariable();
						VarAccess varaccRet = new VarAccess(((ExpressionContext)_localctx).exp1.expressionRet,((ExpressionContext)_localctx).espetialVariable.name);varaccRet.setLine((((ExpressionContext)_localctx).DOT!=null?((ExpressionContext)_localctx).DOT.getLine():0)); ((ExpressionContext)_localctx).expressionRet =  varaccRet;
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.exp1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(642);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						 UnaryOperator op = UnaryOperator.NOT; Integer line;
						setState(648);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case INC:
							{
							setState(644);
							((ExpressionContext)_localctx).INC = match(INC);
							op = UnaryOperator.INC; line = (((ExpressionContext)_localctx).INC!=null?((ExpressionContext)_localctx).INC.getLine():0);
							}
							break;
						case DEC:
							{
							setState(646);
							((ExpressionContext)_localctx).DEC = match(DEC);
							op = UnaryOperator.DEC;line= (((ExpressionContext)_localctx).DEC!=null?((ExpressionContext)_localctx).DEC.getLine():0);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						UnaryExpression unaryexpr = new UnaryExpression(op,((ExpressionContext)_localctx).exp1.expressionRet);unaryexpr.setLine(line);((ExpressionContext)_localctx).expressionRet =  unaryexpr;
						}
						break;
					}
					} 
				}
				setState(655);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,53,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValueContext extends ParserRuleContext {
		public Value valRet;
		public Token INT_LITERAL;
		public Token FLOAT_LITERAL;
		public Token STRING_LITERAL;
		public Token SELL;
		public Token BUY;
		public TerminalNode INT_LITERAL() { return getToken(UTLParser.INT_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(UTLParser.FLOAT_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(UTLParser.STRING_LITERAL, 0); }
		public TerminalNode SELL() { return getToken(UTLParser.SELL, 0); }
		public TerminalNode BUY() { return getToken(UTLParser.BUY, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_value);
		try {
			setState(666);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(656);
				((ValueContext)_localctx).INT_LITERAL = match(INT_LITERAL);
				((ValueContext)_localctx).valRet =  new IntValue(Integer.parseInt((((ValueContext)_localctx).INT_LITERAL!=null?((ValueContext)_localctx).INT_LITERAL.getText():null)));_localctx.valRet.setLine((((ValueContext)_localctx).INT_LITERAL!=null?((ValueContext)_localctx).INT_LITERAL.getLine():0));
				}
				break;
			case FLOAT_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(658);
				((ValueContext)_localctx).FLOAT_LITERAL = match(FLOAT_LITERAL);
				((ValueContext)_localctx).valRet =  new FloatValue(Float.parseFloat((((ValueContext)_localctx).FLOAT_LITERAL!=null?((ValueContext)_localctx).FLOAT_LITERAL.getText():null)));_localctx.valRet.setLine((((ValueContext)_localctx).FLOAT_LITERAL!=null?((ValueContext)_localctx).FLOAT_LITERAL.getLine():0));
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(660);
				((ValueContext)_localctx).STRING_LITERAL = match(STRING_LITERAL);
				((ValueContext)_localctx).valRet =  new StringValue((((ValueContext)_localctx).STRING_LITERAL!=null?((ValueContext)_localctx).STRING_LITERAL.getText():null));_localctx.valRet.setLine((((ValueContext)_localctx).STRING_LITERAL!=null?((ValueContext)_localctx).STRING_LITERAL.getLine():0));
				}
				break;
			case SELL:
				enterOuterAlt(_localctx, 4);
				{
				setState(662);
				((ValueContext)_localctx).SELL = match(SELL);
				((ValueContext)_localctx).valRet =  new TradeValue((((ValueContext)_localctx).SELL!=null?((ValueContext)_localctx).SELL.getText():null));_localctx.valRet.setLine((((ValueContext)_localctx).SELL!=null?((ValueContext)_localctx).SELL.getLine():0));
				}
				break;
			case BUY:
				enterOuterAlt(_localctx, 5);
				{
				setState(664);
				((ValueContext)_localctx).BUY = match(BUY);
				((ValueContext)_localctx).valRet =  new TradeValue((((ValueContext)_localctx).BUY!=null?((ValueContext)_localctx).BUY.getText():null));_localctx.valRet.setLine((((ValueContext)_localctx).BUY!=null?((ValueContext)_localctx).BUY.getLine():0));
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public Type primTypeRet;
		public TerminalNode FLOAT() { return getToken(UTLParser.FLOAT, 0); }
		public TerminalNode INT() { return getToken(UTLParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(UTLParser.BOOL, 0); }
		public TerminalNode STRING() { return getToken(UTLParser.STRING, 0); }
		public TerminalNode VOID() { return getToken(UTLParser.VOID, 0); }
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitPrimitiveType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitPrimitiveType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_primitiveType);
		try {
			setState(678);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(668);
				match(FLOAT);
				((PrimitiveTypeContext)_localctx).primTypeRet =  new FloatType();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(670);
				match(INT);
				((PrimitiveTypeContext)_localctx).primTypeRet =  new IntType();
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 3);
				{
				setState(672);
				match(BOOL);
				((PrimitiveTypeContext)_localctx).primTypeRet =  new BoolType();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(674);
				match(STRING);
				((PrimitiveTypeContext)_localctx).primTypeRet =  new StringType();
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 5);
				{
				setState(676);
				match(VOID);
				((PrimitiveTypeContext)_localctx).primTypeRet =  new VoidType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComplexTypeContext extends ParserRuleContext {
		public Type compTypeRet;
		public TerminalNode ORDER() { return getToken(UTLParser.ORDER, 0); }
		public TerminalNode TRADE() { return getToken(UTLParser.TRADE, 0); }
		public TerminalNode CANDLE() { return getToken(UTLParser.CANDLE, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public ComplexTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterComplexType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitComplexType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitComplexType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexTypeContext complexType() throws RecognitionException {
		ComplexTypeContext _localctx = new ComplexTypeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_complexType);
		try {
			setState(688);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORDER:
				enterOuterAlt(_localctx, 1);
				{
				setState(680);
				match(ORDER);
				((ComplexTypeContext)_localctx).compTypeRet =  new OrderType();
				}
				break;
			case TRADE:
				enterOuterAlt(_localctx, 2);
				{
				setState(682);
				match(TRADE);
				((ComplexTypeContext)_localctx).compTypeRet =  new TradeType();
				}
				break;
			case CANDLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(684);
				match(CANDLE);
				((ComplexTypeContext)_localctx).compTypeRet =  new CandleType();
				}
				break;
			case EXCEPTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(686);
				match(EXCEPTION);
				((ComplexTypeContext)_localctx).compTypeRet =  new ExceptionType();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComplexValueContext extends ParserRuleContext {
		public Identifier compTypeRet;
		public Token n;
		public TerminalNode ORDER() { return getToken(UTLParser.ORDER, 0); }
		public TerminalNode TRADE() { return getToken(UTLParser.TRADE, 0); }
		public TerminalNode CANDLE() { return getToken(UTLParser.CANDLE, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public ComplexValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterComplexValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitComplexValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitComplexValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexValueContext complexValue() throws RecognitionException {
		ComplexValueContext _localctx = new ComplexValueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_complexValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(694);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ORDER:
				{
				setState(690);
				((ComplexValueContext)_localctx).n = match(ORDER);
				}
				break;
			case TRADE:
				{
				setState(691);
				((ComplexValueContext)_localctx).n = match(TRADE);
				}
				break;
			case CANDLE:
				{
				setState(692);
				((ComplexValueContext)_localctx).n = match(CANDLE);
				}
				break;
			case EXCEPTION:
				{
				setState(693);
				((ComplexValueContext)_localctx).n = match(EXCEPTION);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			((ComplexValueContext)_localctx).compTypeRet =  new Identifier(null);_localctx.compTypeRet.setName((((ComplexValueContext)_localctx).n!=null?((ComplexValueContext)_localctx).n.getText():null));_localctx.compTypeRet.setLine((((ComplexValueContext)_localctx).n!=null?((ComplexValueContext)_localctx).n.getLine():0));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AllTypeContext extends ParserRuleContext {
		public Type allTypeRet;
		public PrimitiveTypeContext primitiveType;
		public ComplexTypeContext complexType;
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public ComplexTypeContext complexType() {
			return getRuleContext(ComplexTypeContext.class,0);
		}
		public AllTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterAllType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitAllType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitAllType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllTypeContext allType() throws RecognitionException {
		AllTypeContext _localctx = new AllTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_allType);
		try {
			setState(704);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(698);
				((AllTypeContext)_localctx).primitiveType = primitiveType();
				((AllTypeContext)_localctx).allTypeRet =  ((AllTypeContext)_localctx).primitiveType.primTypeRet;
				}
				break;
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(701);
				((AllTypeContext)_localctx).complexType = complexType();
				((AllTypeContext)_localctx).allTypeRet =  ((AllTypeContext)_localctx).complexType.compTypeRet;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EspetialFunctionContext extends ParserRuleContext {
		public Identifier name;
		public Token n;
		public TerminalNode REFRESH_RATE() { return getToken(UTLParser.REFRESH_RATE, 0); }
		public TerminalNode CONNECT() { return getToken(UTLParser.CONNECT, 0); }
		public TerminalNode OBSERVE() { return getToken(UTLParser.OBSERVE, 0); }
		public TerminalNode GET_CANDLE() { return getToken(UTLParser.GET_CANDLE, 0); }
		public TerminalNode TERMINATE() { return getToken(UTLParser.TERMINATE, 0); }
		public EspetialFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_espetialFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterEspetialFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitEspetialFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitEspetialFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EspetialFunctionContext espetialFunction() throws RecognitionException {
		EspetialFunctionContext _localctx = new EspetialFunctionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_espetialFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((EspetialFunctionContext)_localctx).name =  new Identifier(null);
			setState(712);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REFRESH_RATE:
				{
				setState(707);
				((EspetialFunctionContext)_localctx).n = match(REFRESH_RATE);
				}
				break;
			case CONNECT:
				{
				setState(708);
				((EspetialFunctionContext)_localctx).n = match(CONNECT);
				}
				break;
			case OBSERVE:
				{
				setState(709);
				((EspetialFunctionContext)_localctx).n = match(OBSERVE);
				}
				break;
			case GET_CANDLE:
				{
				setState(710);
				((EspetialFunctionContext)_localctx).n = match(GET_CANDLE);
				}
				break;
			case TERMINATE:
				{
				setState(711);
				((EspetialFunctionContext)_localctx).n = match(TERMINATE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_localctx.name.setName((((EspetialFunctionContext)_localctx).n!=null?((EspetialFunctionContext)_localctx).n.getText():null));_localctx.name.setLine((((EspetialFunctionContext)_localctx).n!=null?((EspetialFunctionContext)_localctx).n.getLine():0));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EspetialVariableContext extends ParserRuleContext {
		public Identifier name;
		public Token n;
		public TerminalNode ASK() { return getToken(UTLParser.ASK, 0); }
		public TerminalNode BID() { return getToken(UTLParser.BID, 0); }
		public TerminalNode TIME() { return getToken(UTLParser.TIME, 0); }
		public TerminalNode HIGH() { return getToken(UTLParser.HIGH, 0); }
		public TerminalNode LOW() { return getToken(UTLParser.LOW, 0); }
		public TerminalNode DIGITS() { return getToken(UTLParser.DIGITS, 0); }
		public TerminalNode VOLUME() { return getToken(UTLParser.VOLUME, 0); }
		public TerminalNode TYPE() { return getToken(UTLParser.TYPE, 0); }
		public TerminalNode TEXT() { return getToken(UTLParser.TEXT, 0); }
		public TerminalNode OPEN() { return getToken(UTLParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(UTLParser.CLOSE, 0); }
		public EspetialVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_espetialVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterEspetialVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitEspetialVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitEspetialVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EspetialVariableContext espetialVariable() throws RecognitionException {
		EspetialVariableContext _localctx = new EspetialVariableContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_espetialVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((EspetialVariableContext)_localctx).name =  new Identifier(null);
			setState(728);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASK:
				{
				setState(717);
				((EspetialVariableContext)_localctx).n = match(ASK);
				}
				break;
			case BID:
				{
				setState(718);
				((EspetialVariableContext)_localctx).n = match(BID);
				}
				break;
			case TIME:
				{
				setState(719);
				((EspetialVariableContext)_localctx).n = match(TIME);
				}
				break;
			case HIGH:
				{
				setState(720);
				((EspetialVariableContext)_localctx).n = match(HIGH);
				}
				break;
			case LOW:
				{
				setState(721);
				((EspetialVariableContext)_localctx).n = match(LOW);
				}
				break;
			case DIGITS:
				{
				setState(722);
				((EspetialVariableContext)_localctx).n = match(DIGITS);
				}
				break;
			case VOLUME:
				{
				setState(723);
				((EspetialVariableContext)_localctx).n = match(VOLUME);
				}
				break;
			case TYPE:
				{
				setState(724);
				((EspetialVariableContext)_localctx).n = match(TYPE);
				}
				break;
			case TEXT:
				{
				setState(725);
				((EspetialVariableContext)_localctx).n = match(TEXT);
				}
				break;
			case OPEN:
				{
				setState(726);
				((EspetialVariableContext)_localctx).n = match(OPEN);
				}
				break;
			case CLOSE:
				{
				setState(727);
				((EspetialVariableContext)_localctx).n = match(CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_localctx.name.setName((((EspetialVariableContext)_localctx).n!=null?((EspetialVariableContext)_localctx).n.getText():null));_localctx.name.setLine((((EspetialVariableContext)_localctx).n!=null?((EspetialVariableContext)_localctx).n.getLine():0));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EspetialMethodContext extends ParserRuleContext {
		public Identifier name;
		public Token n;
		public TerminalNode OPEN() { return getToken(UTLParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(UTLParser.CLOSE, 0); }
		public EspetialMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_espetialMethod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterEspetialMethod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitEspetialMethod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitEspetialMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EspetialMethodContext espetialMethod() throws RecognitionException {
		EspetialMethodContext _localctx = new EspetialMethodContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_espetialMethod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			((EspetialMethodContext)_localctx).name =  new Identifier(null);
			setState(735);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN:
				{
				setState(733);
				((EspetialMethodContext)_localctx).n = match(OPEN);
				}
				break;
			case CLOSE:
				{
				setState(734);
				((EspetialMethodContext)_localctx).n = match(CLOSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_localctx.name.setName((((EspetialMethodContext)_localctx).n!=null?((EspetialMethodContext)_localctx).n.getText():null));_localctx.name.setLine((((EspetialMethodContext)_localctx).n!=null?((EspetialMethodContext)_localctx).n.getLine():0));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends ParserRuleContext {
		public BinaryOperator op;
		public TerminalNode ASSIGN() { return getToken(UTLParser.ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(UTLParser.ADD_ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(UTLParser.SUB_ASSIGN, 0); }
		public TerminalNode MUL_ASSIGN() { return getToken(UTLParser.MUL_ASSIGN, 0); }
		public TerminalNode DIV_ASSIGN() { return getToken(UTLParser.DIV_ASSIGN, 0); }
		public TerminalNode MOD_ASSIGN() { return getToken(UTLParser.MOD_ASSIGN, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(751);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				setState(739);
				match(ASSIGN);
				((AssignContext)_localctx).op =  BinaryOperator.ASSIGN;
				}
				break;
			case ADD_ASSIGN:
				{
				setState(741);
				match(ADD_ASSIGN);
				((AssignContext)_localctx).op =  BinaryOperator.ADD_ASSIGN;
				}
				break;
			case SUB_ASSIGN:
				{
				setState(743);
				match(SUB_ASSIGN);
				((AssignContext)_localctx).op =  BinaryOperator.SUB_ASSIGN;
				}
				break;
			case MUL_ASSIGN:
				{
				setState(745);
				match(MUL_ASSIGN);
				((AssignContext)_localctx).op =  BinaryOperator.MUL_ASSIGN;
				}
				break;
			case DIV_ASSIGN:
				{
				setState(747);
				match(DIV_ASSIGN);
				((AssignContext)_localctx).op =  BinaryOperator.DIV_ASSIGN;
				}
				break;
			case MOD_ASSIGN:
				{
				setState(749);
				match(MOD_ASSIGN);
				((AssignContext)_localctx).op =  BinaryOperator.MOD_ASSIGN;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		case 6:
			return precpred(_ctx, 7);
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 16);
		case 9:
			return precpred(_ctx, 15);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001S\u02f2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		"J\b\u0000\n\u0000\f\u0000M\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0003\u0002|\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u008c\b\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004"+
		"\u0093\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u009f\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u00a6\b\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00b6\b\u0006"+
		"\n\u0006\f\u0006\u00b9\t\u0006\u0003\u0006\u00bb\b\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00c0\b\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0005\u0006\u00c6\b\u0006\n\u0006\f\u0006\u00c9\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00cf\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00da\b\u0007\n\u0007"+
		"\f\u0007\u00dd\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0003\u0007\u00e3\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00ef\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0005\b\u00f5\b\b\n\b\f\b\u00f8\t\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0003\b\u00fe\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u010b\b\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u0111\b\t\n\t\f\t\u0114\t\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0003\t\u011a\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u0126\b\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u013a\b\u000b\n\u000b\f\u000b"+
		"\u013d\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0143\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0005\u000b\u014a\b\u000b\n\u000b\f\u000b\u014d\t\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0153\b\u000b\u0003\u000b\u0155"+
		"\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0005\f\u0162\b\f\n\f\f\f\u0165\t\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u016b\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u0179\b\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u0180\b\r"+
		"\n\r\f\r\u0183\t\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u0189\b\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u0192\b\u000e\n\u000e\f\u000e\u0195\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u019b\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0005\u000e\u01a4\b\u000e\n\u000e\f\u000e\u01a7\t\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u01ad\b\u000e\u0003\u000e\u01af"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u01b5"+
		"\b\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01cd"+
		"\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0005\u0012\u01d6\b\u0012\n\u0012\f\u0012\u01d9\t\u0012"+
		"\u0003\u0012\u01db\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u01eb\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013"+
		"\u01f8\b\u0013\n\u0013\f\u0013\u01fb\t\u0013\u0003\u0013\u01fd\b\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0210\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u022a\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u0234\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u023f\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u024a\b\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u0255\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0003\u0014\u0260\b\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0003\u0014\u026d\b\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u0289\b\u0014\u0001\u0014\u0005\u0014\u028c\b\u0014\n\u0014"+
		"\f\u0014\u028f\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0003\u0015\u029b\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0003\u0016\u02a7\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u02b1\b\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u02b7\b\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0003\u0019\u02c1\b\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u02c9\b\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u02d9\b\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u02e0\b\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u02f0\b\u001d\u0001\u001d\u0000\u0001(\u001e"+
		"\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:\u0000\u0000\u034b\u0000<\u0001\u0000\u0000"+
		"\u0000\u0002R\u0001\u0000\u0000\u0000\u0004{\u0001\u0000\u0000\u0000\u0006"+
		"}\u0001\u0000\u0000\u0000\b\u0084\u0001\u0000\u0000\u0000\n\u0097\u0001"+
		"\u0000\u0000\u0000\f\u00a9\u0001\u0000\u0000\u0000\u000e\u00d0\u0001\u0000"+
		"\u0000\u0000\u0010\u00e4\u0001\u0000\u0000\u0000\u0012\u00ff\u0001\u0000"+
		"\u0000\u0000\u0014\u011b\u0001\u0000\u0000\u0000\u0016\u012e\u0001\u0000"+
		"\u0000\u0000\u0018\u0156\u0001\u0000\u0000\u0000\u001a\u016c\u0001\u0000"+
		"\u0000\u0000\u001c\u018a\u0001\u0000\u0000\u0000\u001e\u01b4\u0001\u0000"+
		"\u0000\u0000 \u01b8\u0001\u0000\u0000\u0000\"\u01bd\u0001\u0000\u0000"+
		"\u0000$\u01c2\u0001\u0000\u0000\u0000&\u01df\u0001\u0000\u0000\u0000("+
		"\u0229\u0001\u0000\u0000\u0000*\u029a\u0001\u0000\u0000\u0000,\u02a6\u0001"+
		"\u0000\u0000\u0000.\u02b0\u0001\u0000\u0000\u00000\u02b6\u0001\u0000\u0000"+
		"\u00002\u02c0\u0001\u0000\u0000\u00004\u02c2\u0001\u0000\u0000\u00006"+
		"\u02cc\u0001\u0000\u0000\u00008\u02dc\u0001\u0000\u0000\u0000:\u02ef\u0001"+
		"\u0000\u0000\u0000<K\u0006\u0000\uffff\uffff\u0000=>\u0003\b\u0004\u0000"+
		">?\u0006\u0000\uffff\uffff\u0000?J\u0001\u0000\u0000\u0000@A\u0003\f\u0006"+
		"\u0000AB\u0006\u0000\uffff\uffff\u0000BJ\u0001\u0000\u0000\u0000CD\u0003"+
		"\u0010\b\u0000DE\u0006\u0000\uffff\uffff\u0000EJ\u0001\u0000\u0000\u0000"+
		"FG\u0003\u0012\t\u0000GH\u0006\u0000\uffff\uffff\u0000HJ\u0001\u0000\u0000"+
		"\u0000I=\u0001\u0000\u0000\u0000I@\u0001\u0000\u0000\u0000IC\u0001\u0000"+
		"\u0000\u0000IF\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000KI\u0001"+
		"\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000LN\u0001\u0000\u0000\u0000"+
		"MK\u0001\u0000\u0000\u0000NO\u0003\u000e\u0007\u0000OP\u0006\u0000\uffff"+
		"\uffff\u0000PQ\u0005\u0000\u0000\u0001Q\u0001\u0001\u0000\u0000\u0000"+
		"RS\u0006\u0001\uffff\uffff\u0000ST\u0005O\u0000\u0000TU\u0006\u0001\uffff"+
		"\uffff\u0000U\u0003\u0001\u0000\u0000\u0000VW\u0003\b\u0004\u0000WX\u0006"+
		"\u0002\uffff\uffff\u0000X|\u0001\u0000\u0000\u0000YZ\u0003\f\u0006\u0000"+
		"Z[\u0006\u0002\uffff\uffff\u0000[|\u0001\u0000\u0000\u0000\\]\u0003\u0014"+
		"\n\u0000]^\u0006\u0002\uffff\uffff\u0000^|\u0001\u0000\u0000\u0000_`\u0003"+
		"\u001e\u000f\u0000`a\u0006\u0002\uffff\uffff\u0000a|\u0001\u0000\u0000"+
		"\u0000bc\u0003 \u0010\u0000cd\u0006\u0002\uffff\uffff\u0000d|\u0001\u0000"+
		"\u0000\u0000ef\u0003\u0016\u000b\u0000fg\u0006\u0002\uffff\uffff\u0000"+
		"g|\u0001\u0000\u0000\u0000hi\u0003\u0018\f\u0000ij\u0006\u0002\uffff\uffff"+
		"\u0000j|\u0001\u0000\u0000\u0000kl\u0003\u001a\r\u0000lm\u0006\u0002\uffff"+
		"\uffff\u0000m|\u0001\u0000\u0000\u0000no\u0003\u001c\u000e\u0000op\u0006"+
		"\u0002\uffff\uffff\u0000p|\u0001\u0000\u0000\u0000qr\u0003\"\u0011\u0000"+
		"rs\u0006\u0002\uffff\uffff\u0000s|\u0001\u0000\u0000\u0000tu\u0003(\u0014"+
		"\u0000uv\u0005\u0002\u0000\u0000vw\u0006\u0002\uffff\uffff\u0000w|\u0001"+
		"\u0000\u0000\u0000xy\u0003\u0006\u0003\u0000yz\u0006\u0002\uffff\uffff"+
		"\u0000z|\u0001\u0000\u0000\u0000{V\u0001\u0000\u0000\u0000{Y\u0001\u0000"+
		"\u0000\u0000{\\\u0001\u0000\u0000\u0000{_\u0001\u0000\u0000\u0000{b\u0001"+
		"\u0000\u0000\u0000{e\u0001\u0000\u0000\u0000{h\u0001\u0000\u0000\u0000"+
		"{k\u0001\u0000\u0000\u0000{n\u0001\u0000\u0000\u0000{q\u0001\u0000\u0000"+
		"\u0000{t\u0001\u0000\u0000\u0000{x\u0001\u0000\u0000\u0000|\u0005\u0001"+
		"\u0000\u0000\u0000}~\u0005N\u0000\u0000~\u007f\u0005\u0006\u0000\u0000"+
		"\u007f\u0080\u0003(\u0014\u0000\u0080\u0081\u0006\u0003\uffff\uffff\u0000"+
		"\u0081\u0082\u0005\u0007\u0000\u0000\u0082\u0083\u0005\u0002\u0000\u0000"+
		"\u0083\u0007\u0001\u0000\u0000\u0000\u0084\u0085\u0006\u0004\uffff\uffff"+
		"\u0000\u0085\u0086\u00032\u0019\u0000\u0086\u008b\u0006\u0004\uffff\uffff"+
		"\u0000\u0087\u0088\u0005\n\u0000\u0000\u0088\u0089\u0005P\u0000\u0000"+
		"\u0089\u008a\u0005\u000b\u0000\u0000\u008a\u008c\u0006\u0004\uffff\uffff"+
		"\u0000\u008b\u0087\u0001\u0000\u0000\u0000\u008b\u008c\u0001\u0000\u0000"+
		"\u0000\u008c\u008d\u0001\u0000\u0000\u0000\u008d\u0092\u0003\u0002\u0001"+
		"\u0000\u008e\u008f\u0005 \u0000\u0000\u008f\u0090\u0003(\u0014\u0000\u0090"+
		"\u0091\u0006\u0004\uffff\uffff\u0000\u0091\u0093\u0001\u0000\u0000\u0000"+
		"\u0092\u008e\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000"+
		"\u0093\u0094\u0001\u0000\u0000\u0000\u0094\u0095\u0005\u0002\u0000\u0000"+
		"\u0095\u0096\u0006\u0004\uffff\uffff\u0000\u0096\t\u0001\u0000\u0000\u0000"+
		"\u0097\u0098\u0006\u0005\uffff\uffff\u0000\u0098\u0099\u00032\u0019\u0000"+
		"\u0099\u009e\u0006\u0005\uffff\uffff\u0000\u009a\u009b\u0005\n\u0000\u0000"+
		"\u009b\u009c\u0005P\u0000\u0000\u009c\u009d\u0005\u000b\u0000\u0000\u009d"+
		"\u009f\u0006\u0005\uffff\uffff\u0000\u009e\u009a\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a5\u0003\u0002\u0001\u0000\u00a1\u00a2\u0005 \u0000\u0000\u00a2"+
		"\u00a3\u0003(\u0014\u0000\u00a3\u00a4\u0006\u0005\uffff\uffff\u0000\u00a4"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a5\u00a1\u0001\u0000\u0000\u0000\u00a5"+
		"\u00a6\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7"+
		"\u00a8\u0006\u0005\uffff\uffff\u0000\u00a8\u000b\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0006\u0006\uffff\uffff\u0000\u00aa\u00ab\u0003,\u0016\u0000"+
		"\u00ab\u00ac\u0006\u0006\uffff\uffff\u0000\u00ac\u00ad\u0003\u0002\u0001"+
		"\u0000\u00ad\u00ae\u0006\u0006\uffff\uffff\u0000\u00ae\u00ba\u0005\u0006"+
		"\u0000\u0000\u00af\u00b0\u0003\n\u0005\u0000\u00b0\u00b7\u0006\u0006\uffff"+
		"\uffff\u0000\u00b1\u00b2\u0005\u0003\u0000\u0000\u00b2\u00b3\u0003\n\u0005"+
		"\u0000\u00b3\u00b4\u0006\u0006\uffff\uffff\u0000\u00b4\u00b6\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b1\u0001\u0000\u0000\u0000\u00b6\u00b9\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9\u00b7\u0001\u0000"+
		"\u0000\u0000\u00ba\u00af\u0001\u0000\u0000\u0000\u00ba\u00bb\u0001\u0000"+
		"\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc\u00bf\u0005\u0007"+
		"\u0000\u0000\u00bd\u00be\u0005\'\u0000\u0000\u00be\u00c0\u0005H\u0000"+
		"\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c0\u00ce\u0001\u0000\u0000\u0000\u00c1\u00c7\u0005\b\u0000\u0000"+
		"\u00c2\u00c3\u0003\u0004\u0002\u0000\u00c3\u00c4\u0006\u0006\uffff\uffff"+
		"\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c9\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000"+
		"\u0000\u00c7\u00c8\u0001\u0000\u0000\u0000\u00c8\u00ca\u0001\u0000\u0000"+
		"\u0000\u00c9\u00c7\u0001\u0000\u0000\u0000\u00ca\u00cf\u0005\t\u0000\u0000"+
		"\u00cb\u00cc\u0003\u0004\u0002\u0000\u00cc\u00cd\u0006\u0006\uffff\uffff"+
		"\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce\u00c1\u0001\u0000\u0000"+
		"\u0000\u00ce\u00cb\u0001\u0000\u0000\u0000\u00cf\r\u0001\u0000\u0000\u0000"+
		"\u00d0\u00d1\u0006\u0007\uffff\uffff\u0000\u00d1\u00d2\u00056\u0000\u0000"+
		"\u00d2\u00d3\u00050\u0000\u0000\u00d3\u00d4\u0005\u0006\u0000\u0000\u00d4"+
		"\u00e2\u0005\u0007\u0000\u0000\u00d5\u00db\u0005\b\u0000\u0000\u00d6\u00d7"+
		"\u0003\u0004\u0002\u0000\u00d7\u00d8\u0006\u0007\uffff\uffff\u0000\u00d8"+
		"\u00da\u0001\u0000\u0000\u0000\u00d9\u00d6\u0001\u0000\u0000\u0000\u00da"+
		"\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db"+
		"\u00dc\u0001\u0000\u0000\u0000\u00dc\u00de\u0001\u0000\u0000\u0000\u00dd"+
		"\u00db\u0001\u0000\u0000\u0000\u00de\u00e3\u0005\t\u0000\u0000\u00df\u00e0"+
		"\u0003\u0004\u0002\u0000\u00e0\u00e1\u0006\u0007\uffff\uffff\u0000\u00e1"+
		"\u00e3\u0001\u0000\u0000\u0000\u00e2\u00d5\u0001\u0000\u0000\u0000\u00e2"+
		"\u00df\u0001\u0000\u0000\u0000\u00e3\u000f\u0001\u0000\u0000\u0000\u00e4"+
		"\u00e5\u0006\b\uffff\uffff\u0000\u00e5\u00e6\u00056\u0000\u0000\u00e6"+
		"\u00e7\u00051\u0000\u0000\u00e7\u00e8\u0005\u0006\u0000\u0000\u00e8\u00e9"+
		"\u0005E\u0000\u0000\u00e9\u00ea\u0003\u0002\u0001\u0000\u00ea\u00eb\u0006"+
		"\b\uffff\uffff\u0000\u00eb\u00ee\u0005\u0007\u0000\u0000\u00ec\u00ed\u0005"+
		"\'\u0000\u0000\u00ed\u00ef\u0005H\u0000\u0000\u00ee\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000\u00ef\u00fd\u0001\u0000"+
		"\u0000\u0000\u00f0\u00f6\u0005\b\u0000\u0000\u00f1\u00f2\u0003\u0004\u0002"+
		"\u0000\u00f2\u00f3\u0006\b\uffff\uffff\u0000\u00f3\u00f5\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f1\u0001\u0000\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f7\u00f9\u0001\u0000\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000"+
		"\u0000\u00f9\u00fe\u0005\t\u0000\u0000\u00fa\u00fb\u0003\u0004\u0002\u0000"+
		"\u00fb\u00fc\u0006\b\uffff\uffff\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000"+
		"\u00fd\u00f0\u0001\u0000\u0000\u0000\u00fd\u00fa\u0001\u0000\u0000\u0000"+
		"\u00fe\u0011\u0001\u0000\u0000\u0000\u00ff\u0100\u0006\t\uffff\uffff\u0000"+
		"\u0100\u0101\u00056\u0000\u0000\u0101\u0102\u00052\u0000\u0000\u0102\u0103"+
		"\u0005\u0006\u0000\u0000\u0103\u0104\u0005E\u0000\u0000\u0104\u0105\u0006"+
		"\t\uffff\uffff\u0000\u0105\u0106\u0003\u0002\u0001\u0000\u0106\u0107\u0006"+
		"\t\uffff\uffff\u0000\u0107\u010a\u0005\u0007\u0000\u0000\u0108\u0109\u0005"+
		"\'\u0000\u0000\u0109\u010b\u0005H\u0000\u0000\u010a\u0108\u0001\u0000"+
		"\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u0119\u0001\u0000"+
		"\u0000\u0000\u010c\u0112\u0005\b\u0000\u0000\u010d\u010e\u0003\u0004\u0002"+
		"\u0000\u010e\u010f\u0006\t\uffff\uffff\u0000\u010f\u0111\u0001\u0000\u0000"+
		"\u0000\u0110\u010d\u0001\u0000\u0000\u0000\u0111\u0114\u0001\u0000\u0000"+
		"\u0000\u0112\u0110\u0001\u0000\u0000\u0000\u0112\u0113\u0001\u0000\u0000"+
		"\u0000\u0113\u0115\u0001\u0000\u0000\u0000\u0114\u0112\u0001\u0000\u0000"+
		"\u0000\u0115\u011a\u0005\t\u0000\u0000\u0116\u0117\u0003\u0004\u0002\u0000"+
		"\u0117\u0118\u0006\t\uffff\uffff\u0000\u0118\u011a\u0001\u0000\u0000\u0000"+
		"\u0119\u010c\u0001\u0000\u0000\u0000\u0119\u0116\u0001\u0000\u0000\u0000"+
		"\u011a\u0013\u0001\u0000\u0000\u0000\u011b\u0125\u0006\n\uffff\uffff\u0000"+
		"\u011c\u011d\u0003\u0002\u0001\u0000\u011d\u011e\u0006\n\uffff\uffff\u0000"+
		"\u011e\u0126\u0001\u0000\u0000\u0000\u011f\u0120\u0003\u0002\u0001\u0000"+
		"\u0120\u0121\u0005\n\u0000\u0000\u0121\u0122\u0003(\u0014\u0000\u0122"+
		"\u0123\u0005\u000b\u0000\u0000\u0123\u0124\u0006\n\uffff\uffff\u0000\u0124"+
		"\u0126\u0001\u0000\u0000\u0000\u0125\u011c\u0001\u0000\u0000\u0000\u0125"+
		"\u011f\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127"+
		"\u0128\u0003:\u001d\u0000\u0128\u0129\u0006\n\uffff\uffff\u0000\u0129"+
		"\u012a\u0003(\u0014\u0000\u012a\u012b\u0006\n\uffff\uffff\u0000\u012b"+
		"\u012c\u0005\u0002\u0000\u0000\u012c\u012d\u0006\n\uffff\uffff\u0000\u012d"+
		"\u0015\u0001\u0000\u0000\u0000\u012e\u012f\u0006\u000b\uffff\uffff\u0000"+
		"\u012f\u0130\u0005)\u0000\u0000\u0130\u0131\u0006\u000b\uffff\uffff\u0000"+
		"\u0131\u0132\u0005\u0006\u0000\u0000\u0132\u0133\u0003(\u0014\u0000\u0133"+
		"\u0134\u0006\u000b\uffff\uffff\u0000\u0134\u0142\u0005\u0007\u0000\u0000"+
		"\u0135\u013b\u0005\b\u0000\u0000\u0136\u0137\u0003\u0004\u0002\u0000\u0137"+
		"\u0138\u0006\u000b\uffff\uffff\u0000\u0138\u013a\u0001\u0000\u0000\u0000"+
		"\u0139\u0136\u0001\u0000\u0000\u0000\u013a\u013d\u0001\u0000\u0000\u0000"+
		"\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000"+
		"\u013c\u013e\u0001\u0000\u0000\u0000\u013d\u013b\u0001\u0000\u0000\u0000"+
		"\u013e\u0143\u0005\t\u0000\u0000\u013f\u0140\u0003\u0004\u0002\u0000\u0140"+
		"\u0141\u0006\u000b\uffff\uffff\u0000\u0141\u0143\u0001\u0000\u0000\u0000"+
		"\u0142\u0135\u0001\u0000\u0000\u0000\u0142\u013f\u0001\u0000\u0000\u0000"+
		"\u0143\u0154\u0001\u0000\u0000\u0000\u0144\u0152\u0005*\u0000\u0000\u0145"+
		"\u014b\u0005\b\u0000\u0000\u0146\u0147\u0003\u0004\u0002\u0000\u0147\u0148"+
		"\u0006\u000b\uffff\uffff\u0000\u0148\u014a\u0001\u0000\u0000\u0000\u0149"+
		"\u0146\u0001\u0000\u0000\u0000\u014a\u014d\u0001\u0000\u0000\u0000\u014b"+
		"\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000\u0000\u014c"+
		"\u014e\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000\u014e"+
		"\u0153\u0005\t\u0000\u0000\u014f\u0150\u0003\u0004\u0002\u0000\u0150\u0151"+
		"\u0006\u000b\uffff\uffff\u0000\u0151\u0153\u0001\u0000\u0000\u0000\u0152"+
		"\u0145\u0001\u0000\u0000\u0000\u0152\u014f\u0001\u0000\u0000\u0000\u0153"+
		"\u0155\u0001\u0000\u0000\u0000\u0154\u0144\u0001\u0000\u0000\u0000\u0154"+
		"\u0155\u0001\u0000\u0000\u0000\u0155\u0017\u0001\u0000\u0000\u0000\u0156"+
		"\u0157\u0006\f\uffff\uffff\u0000\u0157\u0158\u0005,\u0000\u0000\u0158"+
		"\u0159\u0006\f\uffff\uffff\u0000\u0159\u015a\u0005\u0006\u0000\u0000\u015a"+
		"\u015b\u0003(\u0014\u0000\u015b\u015c\u0006\f\uffff\uffff\u0000\u015c"+
		"\u016a\u0005\u0007\u0000\u0000\u015d\u0163\u0005\b\u0000\u0000\u015e\u015f"+
		"\u0003\u0004\u0002\u0000\u015f\u0160\u0006\f\uffff\uffff\u0000\u0160\u0162"+
		"\u0001\u0000\u0000\u0000\u0161\u015e\u0001\u0000\u0000\u0000\u0162\u0165"+
		"\u0001\u0000\u0000\u0000\u0163\u0161\u0001\u0000\u0000\u0000\u0163\u0164"+
		"\u0001\u0000\u0000\u0000\u0164\u0166\u0001\u0000\u0000\u0000\u0165\u0163"+
		"\u0001\u0000\u0000\u0000\u0166\u016b\u0005\t\u0000\u0000\u0167\u0168\u0003"+
		"\u0004\u0002\u0000\u0168\u0169\u0006\f\uffff\uffff\u0000\u0169\u016b\u0001"+
		"\u0000\u0000\u0000\u016a\u015d\u0001\u0000\u0000\u0000\u016a\u0167\u0001"+
		"\u0000\u0000\u0000\u016b\u0019\u0001\u0000\u0000\u0000\u016c\u016d\u0006"+
		"\r\uffff\uffff\u0000\u016d\u016e\u0005+\u0000\u0000\u016e\u016f\u0006"+
		"\r\uffff\uffff\u0000\u016f\u0170\u0005\u0006\u0000\u0000\u0170\u0171\u0003"+
		"\u0004\u0002\u0000\u0171\u0172\u0006\r\uffff\uffff\u0000\u0172\u0173\u0003"+
		"(\u0014\u0000\u0173\u0174\u0006\r\uffff\uffff\u0000\u0174\u0178\u0005"+
		"\u0002\u0000\u0000\u0175\u0176\u0003(\u0014\u0000\u0176\u0177\u0006\r"+
		"\uffff\uffff\u0000\u0177\u0179\u0001\u0000\u0000\u0000\u0178\u0175\u0001"+
		"\u0000\u0000\u0000\u0178\u0179\u0001\u0000\u0000\u0000\u0179\u017a\u0001"+
		"\u0000\u0000\u0000\u017a\u0188\u0005\u0007\u0000\u0000\u017b\u0181\u0005"+
		"\b\u0000\u0000\u017c\u017d\u0003\u0004\u0002\u0000\u017d\u017e\u0006\r"+
		"\uffff\uffff\u0000\u017e\u0180\u0001\u0000\u0000\u0000\u017f\u017c\u0001"+
		"\u0000\u0000\u0000\u0180\u0183\u0001\u0000\u0000\u0000\u0181\u017f\u0001"+
		"\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182\u0184\u0001"+
		"\u0000\u0000\u0000\u0183\u0181\u0001\u0000\u0000\u0000\u0184\u0189\u0005"+
		"\t\u0000\u0000\u0185\u0186\u0003\u0004\u0002\u0000\u0186\u0187\u0006\r"+
		"\uffff\uffff\u0000\u0187\u0189\u0001\u0000\u0000\u0000\u0188\u017b\u0001"+
		"\u0000\u0000\u0000\u0188\u0185\u0001\u0000\u0000\u0000\u0189\u001b\u0001"+
		"\u0000\u0000\u0000\u018a\u018b\u0006\u000e\uffff\uffff\u0000\u018b\u018c"+
		"\u0005&\u0000\u0000\u018c\u019a\u0006\u000e\uffff\uffff\u0000\u018d\u0193"+
		"\u0005\b\u0000\u0000\u018e\u018f\u0003\u0004\u0002\u0000\u018f\u0190\u0006"+
		"\u000e\uffff\uffff\u0000\u0190\u0192\u0001\u0000\u0000\u0000\u0191\u018e"+
		"\u0001\u0000\u0000\u0000\u0192\u0195\u0001\u0000\u0000\u0000\u0193\u0191"+
		"\u0001\u0000\u0000\u0000\u0193\u0194\u0001\u0000\u0000\u0000\u0194\u0196"+
		"\u0001\u0000\u0000\u0000\u0195\u0193\u0001\u0000\u0000\u0000\u0196\u019b"+
		"\u0005\t\u0000\u0000\u0197\u0198\u0003\u0004\u0002\u0000\u0198\u0199\u0006"+
		"\u000e\uffff\uffff\u0000\u0199\u019b\u0001\u0000\u0000\u0000\u019a\u018d"+
		"\u0001\u0000\u0000\u0000\u019a\u0197\u0001\u0000\u0000\u0000\u019b\u01ae"+
		"\u0001\u0000\u0000\u0000\u019c\u019d\u0005(\u0000\u0000\u019d\u019e\u0005"+
		"H\u0000\u0000\u019e\u01ac\u0005O\u0000\u0000\u019f\u01a5\u0005\b\u0000"+
		"\u0000\u01a0\u01a1\u0003\u0004\u0002\u0000\u01a1\u01a2\u0006\u000e\uffff"+
		"\uffff\u0000\u01a2\u01a4\u0001\u0000\u0000\u0000\u01a3\u01a0\u0001\u0000"+
		"\u0000\u0000\u01a4\u01a7\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a8\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a5\u0001\u0000\u0000\u0000\u01a8\u01ad\u0005\t\u0000"+
		"\u0000\u01a9\u01aa\u0003\u0004\u0002\u0000\u01aa\u01ab\u0006\u000e\uffff"+
		"\uffff\u0000\u01ab\u01ad\u0001\u0000\u0000\u0000\u01ac\u019f\u0001\u0000"+
		"\u0000\u0000\u01ac\u01a9\u0001\u0000\u0000\u0000\u01ad\u01af\u0001\u0000"+
		"\u0000\u0000\u01ae\u019c\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000"+
		"\u0000\u0000\u01af\u001d\u0001\u0000\u0000\u0000\u01b0\u01b1\u0005-\u0000"+
		"\u0000\u01b1\u01b5\u0006\u000f\uffff\uffff\u0000\u01b2\u01b3\u0005.\u0000"+
		"\u0000\u01b3\u01b5\u0006\u000f\uffff\uffff\u0000\u01b4\u01b0\u0001\u0000"+
		"\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001\u0000"+
		"\u0000\u0000\u01b6\u01b7\u0005\u0002\u0000\u0000\u01b7\u001f\u0001\u0000"+
		"\u0000\u0000\u01b8\u01b9\u0005/\u0000\u0000\u01b9\u01ba\u0003(\u0014\u0000"+
		"\u01ba\u01bb\u0006\u0010\uffff\uffff\u0000\u01bb\u01bc\u0005\u0002\u0000"+
		"\u0000\u01bc!\u0001\u0000\u0000\u0000\u01bd\u01be\u0005\'\u0000\u0000"+
		"\u01be\u01bf\u0003(\u0014\u0000\u01bf\u01c0\u0006\u0011\uffff\uffff\u0000"+
		"\u01c0\u01c1\u0005\u0002\u0000\u0000\u01c1#\u0001\u0000\u0000\u0000\u01c2"+
		"\u01cc\u0006\u0012\uffff\uffff\u0000\u01c3\u01c4\u00034\u001a\u0000\u01c4"+
		"\u01c5\u0006\u0012\uffff\uffff\u0000\u01c5\u01cd\u0001\u0000\u0000\u0000"+
		"\u01c6\u01c7\u00030\u0018\u0000\u01c7\u01c8\u0006\u0012\uffff\uffff\u0000"+
		"\u01c8\u01cd\u0001\u0000\u0000\u0000\u01c9\u01ca\u0003\u0002\u0001\u0000"+
		"\u01ca\u01cb\u0006\u0012\uffff\uffff\u0000\u01cb\u01cd\u0001\u0000\u0000"+
		"\u0000\u01cc\u01c3\u0001\u0000\u0000\u0000\u01cc\u01c6\u0001\u0000\u0000"+
		"\u0000\u01cc\u01c9\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000"+
		"\u0000\u01ce\u01da\u0005\u0006\u0000\u0000\u01cf\u01d0\u0003(\u0014\u0000"+
		"\u01d0\u01d7\u0006\u0012\uffff\uffff\u0000\u01d1\u01d2\u0005\u0003\u0000"+
		"\u0000\u01d2\u01d3\u0003(\u0014\u0000\u01d3\u01d4\u0006\u0012\uffff\uffff"+
		"\u0000\u01d4\u01d6\u0001\u0000\u0000\u0000\u01d5\u01d1\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d9\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000"+
		"\u0000\u01d7\u01d8\u0001\u0000\u0000\u0000\u01d8\u01db\u0001\u0000\u0000"+
		"\u0000\u01d9\u01d7\u0001\u0000\u0000\u0000\u01da\u01cf\u0001\u0000\u0000"+
		"\u0000\u01da\u01db\u0001\u0000\u0000\u0000\u01db\u01dc\u0001\u0000\u0000"+
		"\u0000\u01dc\u01dd\u0005\u0007\u0000\u0000\u01dd\u01de\u0006\u0012\uffff"+
		"\uffff\u0000\u01de%\u0001\u0000\u0000\u0000\u01df\u01ea\u0006\u0013\uffff"+
		"\uffff\u0000\u01e0\u01e1\u0003\u0002\u0001\u0000\u01e1\u01e2\u0006\u0013"+
		"\uffff\uffff\u0000\u01e2\u01eb\u0001\u0000\u0000\u0000\u01e3\u01e4\u0003"+
		"\u0002\u0001\u0000\u01e4\u01e5\u0005\n\u0000\u0000\u01e5\u01e6\u0003("+
		"\u0014\u0000\u01e6\u01e7\u0005\u000b\u0000\u0000\u01e7\u01e8\u0001\u0000"+
		"\u0000\u0000\u01e8\u01e9\u0006\u0013\uffff\uffff\u0000\u01e9\u01eb\u0001"+
		"\u0000\u0000\u0000\u01ea\u01e0\u0001\u0000\u0000\u0000\u01ea\u01e3\u0001"+
		"\u0000\u0000\u0000\u01eb\u01ec\u0001\u0000\u0000\u0000\u01ec\u01ed\u0005"+
		"\u0005\u0000\u0000\u01ed\u01ee\u0006\u0013\uffff\uffff\u0000\u01ee\u01ef"+
		"\u00038\u001c\u0000\u01ef\u01f0\u0006\u0013\uffff\uffff\u0000\u01f0\u01fc"+
		"\u0005\u0006\u0000\u0000\u01f1\u01f2\u0003(\u0014\u0000\u01f2\u01f9\u0006"+
		"\u0013\uffff\uffff\u0000\u01f3\u01f4\u0005\u0003\u0000\u0000\u01f4\u01f5"+
		"\u0003(\u0014\u0000\u01f5\u01f6\u0006\u0013\uffff\uffff\u0000\u01f6\u01f8"+
		"\u0001\u0000\u0000\u0000\u01f7\u01f3\u0001\u0000\u0000\u0000\u01f8\u01fb"+
		"\u0001\u0000\u0000\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000\u01f9\u01fa"+
		"\u0001\u0000\u0000\u0000\u01fa\u01fd\u0001\u0000\u0000\u0000\u01fb\u01f9"+
		"\u0001\u0000\u0000\u0000\u01fc\u01f1\u0001\u0000\u0000\u0000\u01fc\u01fd"+
		"\u0001\u0000\u0000\u0000\u01fd\u01fe\u0001\u0000\u0000\u0000\u01fe\u01ff"+
		"\u0005\u0007\u0000\u0000\u01ff\'\u0001\u0000\u0000\u0000\u0200\u0201\u0006"+
		"\u0014\uffff\uffff\u0000\u0201\u0202\u0003*\u0015\u0000\u0202\u0203\u0006"+
		"\u0014\uffff\uffff\u0000\u0203\u022a\u0001\u0000\u0000\u0000\u0204\u020f"+
		"\u0006\u0014\uffff\uffff\u0000\u0205\u0206\u0005\u0013\u0000\u0000\u0206"+
		"\u0210\u0006\u0014\uffff\uffff\u0000\u0207\u0208\u0005\r\u0000\u0000\u0208"+
		"\u0210\u0006\u0014\uffff\uffff\u0000\u0209\u020a\u0005\u0019\u0000\u0000"+
		"\u020a\u0210\u0006\u0014\uffff\uffff\u0000\u020b\u020c\u0005\u001e\u0000"+
		"\u0000\u020c\u0210\u0006\u0014\uffff\uffff\u0000\u020d\u020e\u0005\u001f"+
		"\u0000\u0000\u020e\u0210\u0006\u0014\uffff\uffff\u0000\u020f\u0205\u0001"+
		"\u0000\u0000\u0000\u020f\u0207\u0001\u0000\u0000\u0000\u020f\u0209\u0001"+
		"\u0000\u0000\u0000\u020f\u020b\u0001\u0000\u0000\u0000\u020f\u020d\u0001"+
		"\u0000\u0000\u0000\u0210\u0211\u0001\u0000\u0000\u0000\u0211\u0212\u0003"+
		"(\u0014\u000e\u0212\u0213\u0006\u0014\uffff\uffff\u0000\u0213\u022a\u0001"+
		"\u0000\u0000\u0000\u0214\u0215\u0003\u0002\u0001\u0000\u0215\u0216\u0006"+
		"\u0014\uffff\uffff\u0000\u0216\u022a\u0001\u0000\u0000\u0000\u0217\u0218"+
		"\u0003\u0002\u0001\u0000\u0218\u0219\u0005\n\u0000\u0000\u0219\u021a\u0003"+
		"(\u0014\u0000\u021a\u021b\u0005\u000b\u0000\u0000\u021b\u021c\u0001\u0000"+
		"\u0000\u0000\u021c\u021d\u0006\u0014\uffff\uffff\u0000\u021d\u022a\u0001"+
		"\u0000\u0000\u0000\u021e\u021f\u0005\u0006\u0000\u0000\u021f\u0220\u0003"+
		"(\u0014\u0000\u0220\u0221\u0005\u0007\u0000\u0000\u0221\u0222\u0006\u0014"+
		"\uffff\uffff\u0000\u0222\u022a\u0001\u0000\u0000\u0000\u0223\u0224\u0003"+
		"$\u0012\u0000\u0224\u0225\u0006\u0014\uffff\uffff\u0000\u0225\u022a\u0001"+
		"\u0000\u0000\u0000\u0226\u0227\u0003&\u0013\u0000\u0227\u0228\u0006\u0014"+
		"\uffff\uffff\u0000\u0228\u022a\u0001\u0000\u0000\u0000\u0229\u0200\u0001"+
		"\u0000\u0000\u0000\u0229\u0204\u0001\u0000\u0000\u0000\u0229\u0214\u0001"+
		"\u0000\u0000\u0000\u0229\u0217\u0001\u0000\u0000\u0000\u0229\u021e\u0001"+
		"\u0000\u0000\u0000\u0229\u0223\u0001\u0000\u0000\u0000\u0229\u0226\u0001"+
		"\u0000\u0000\u0000\u022a\u028d\u0001\u0000\u0000\u0000\u022b\u022c\n\r"+
		"\u0000\u0000\u022c\u0233\u0006\u0014\uffff\uffff\u0000\u022d\u022e\u0005"+
		"\u000e\u0000\u0000\u022e\u0234\u0006\u0014\uffff\uffff\u0000\u022f\u0230"+
		"\u0005\u000f\u0000\u0000\u0230\u0234\u0006\u0014\uffff\uffff\u0000\u0231"+
		"\u0232\u0005\u0010\u0000\u0000\u0232\u0234\u0006\u0014\uffff\uffff\u0000"+
		"\u0233\u022d\u0001\u0000\u0000\u0000\u0233\u022f\u0001\u0000\u0000\u0000"+
		"\u0233\u0231\u0001\u0000\u0000\u0000\u0234\u0235\u0001\u0000\u0000\u0000"+
		"\u0235\u0236\u0003(\u0014\u000e\u0236\u0237\u0006\u0014\uffff\uffff\u0000"+
		"\u0237\u028c\u0001\u0000\u0000\u0000\u0238\u0239\n\f\u0000\u0000\u0239"+
		"\u023e\u0006\u0014\uffff\uffff\u0000\u023a\u023b\u0005\f\u0000\u0000\u023b"+
		"\u023f\u0006\u0014\uffff\uffff\u0000\u023c\u023d\u0005\r\u0000\u0000\u023d"+
		"\u023f\u0006\u0014\uffff\uffff\u0000\u023e\u023a\u0001\u0000\u0000\u0000"+
		"\u023e\u023c\u0001\u0000\u0000\u0000\u023f\u0240\u0001\u0000\u0000\u0000"+
		"\u0240\u0241\u0003(\u0014\r\u0241\u0242\u0006\u0014\uffff\uffff\u0000"+
		"\u0242\u028c\u0001\u0000\u0000\u0000\u0243\u0244\n\u000b\u0000\u0000\u0244"+
		"\u0249\u0006\u0014\uffff\uffff\u0000\u0245\u0246\u0005\u0017\u0000\u0000"+
		"\u0246\u024a\u0006\u0014\uffff\uffff\u0000\u0247\u0248\u0005\u0018\u0000"+
		"\u0000\u0248\u024a\u0006\u0014\uffff\uffff\u0000\u0249\u0245\u0001\u0000"+
		"\u0000\u0000\u0249\u0247\u0001\u0000\u0000\u0000\u024a\u024b\u0001\u0000"+
		"\u0000\u0000\u024b\u024c\u0003(\u0014\f\u024c\u024d\u0006\u0014\uffff"+
		"\uffff\u0000\u024d\u028c\u0001\u0000\u0000\u0000\u024e\u024f\n\n\u0000"+
		"\u0000\u024f\u0254\u0006\u0014\uffff\uffff\u0000\u0250\u0251\u0005\u001a"+
		"\u0000\u0000\u0251\u0255\u0006\u0014\uffff\uffff\u0000\u0252\u0253\u0005"+
		"\u001b\u0000\u0000\u0253\u0255\u0006\u0014\uffff\uffff\u0000\u0254\u0250"+
		"\u0001\u0000\u0000\u0000\u0254\u0252\u0001\u0000\u0000\u0000\u0255\u0256"+
		"\u0001\u0000\u0000\u0000\u0256\u0257\u0003(\u0014\u000b\u0257\u0258\u0006"+
		"\u0014\uffff\uffff\u0000\u0258\u028c\u0001\u0000\u0000\u0000\u0259\u025a"+
		"\n\t\u0000\u0000\u025a\u025f\u0006\u0014\uffff\uffff\u0000\u025b\u025c"+
		"\u0005\u001c\u0000\u0000\u025c\u0260\u0006\u0014\uffff\uffff\u0000\u025d"+
		"\u025e\u0005\u001d\u0000\u0000\u025e\u0260\u0006\u0014\uffff\uffff\u0000"+
		"\u025f\u025b\u0001\u0000\u0000\u0000\u025f\u025d\u0001\u0000\u0000\u0000"+
		"\u0260\u0261\u0001\u0000\u0000\u0000\u0261\u0262\u0003(\u0014\n\u0262"+
		"\u0263\u0006\u0014\uffff\uffff\u0000\u0263\u028c\u0001\u0000\u0000\u0000"+
		"\u0264\u0265\n\b\u0000\u0000\u0265\u026c\u0006\u0014\uffff\uffff\u0000"+
		"\u0266\u0267\u0005\u0014\u0000\u0000\u0267\u026d\u0006\u0014\uffff\uffff"+
		"\u0000\u0268\u0269\u0005\u0015\u0000\u0000\u0269\u026d\u0006\u0014\uffff"+
		"\uffff\u0000\u026a\u026b\u0005\u0016\u0000\u0000\u026b\u026d\u0006\u0014"+
		"\uffff\uffff\u0000\u026c\u0266\u0001\u0000\u0000\u0000\u026c\u0268\u0001"+
		"\u0000\u0000\u0000\u026c\u026a\u0001\u0000\u0000\u0000\u026d\u026e\u0001"+
		"\u0000\u0000\u0000\u026e\u026f\u0003(\u0014\t\u026f\u0270\u0006\u0014"+
		"\uffff\uffff\u0000\u0270\u028c\u0001\u0000\u0000\u0000\u0271\u0272\n\u0007"+
		"\u0000\u0000\u0272\u0273\u0005\u0011\u0000\u0000\u0273\u0274\u0006\u0014"+
		"\uffff\uffff\u0000\u0274\u0275\u0003(\u0014\b\u0275\u0276\u0006\u0014"+
		"\uffff\uffff\u0000\u0276\u028c\u0001\u0000\u0000\u0000\u0277\u0278\n\u0006"+
		"\u0000\u0000\u0278\u0279\u0005\u0012\u0000\u0000\u0279\u027a\u0006\u0014"+
		"\uffff\uffff\u0000\u027a\u027b\u0003(\u0014\u0007\u027b\u027c\u0006\u0014"+
		"\uffff\uffff\u0000\u027c\u028c\u0001\u0000\u0000\u0000\u027d\u027e\n\u0010"+
		"\u0000\u0000\u027e\u027f\u0005\u0005\u0000\u0000\u027f\u0280\u00036\u001b"+
		"\u0000\u0280\u0281\u0006\u0014\uffff\uffff\u0000\u0281\u028c\u0001\u0000"+
		"\u0000\u0000\u0282\u0283\n\u000f\u0000\u0000\u0283\u0288\u0006\u0014\uffff"+
		"\uffff\u0000\u0284\u0285\u0005\u001e\u0000\u0000\u0285\u0289\u0006\u0014"+
		"\uffff\uffff\u0000\u0286\u0287\u0005\u001f\u0000\u0000\u0287\u0289\u0006"+
		"\u0014\uffff\uffff\u0000\u0288\u0284\u0001\u0000\u0000\u0000\u0288\u0286"+
		"\u0001\u0000\u0000\u0000\u0289\u028a\u0001\u0000\u0000\u0000\u028a\u028c"+
		"\u0006\u0014\uffff\uffff\u0000\u028b\u022b\u0001\u0000\u0000\u0000\u028b"+
		"\u0238\u0001\u0000\u0000\u0000\u028b\u0243\u0001\u0000\u0000\u0000\u028b"+
		"\u024e\u0001\u0000\u0000\u0000\u028b\u0259\u0001\u0000\u0000\u0000\u028b"+
		"\u0264\u0001\u0000\u0000\u0000\u028b\u0271\u0001\u0000\u0000\u0000\u028b"+
		"\u0277\u0001\u0000\u0000\u0000\u028b\u027d\u0001\u0000\u0000\u0000\u028b"+
		"\u0282\u0001\u0000\u0000\u0000\u028c\u028f\u0001\u0000\u0000\u0000\u028d"+
		"\u028b\u0001\u0000\u0000\u0000\u028d\u028e\u0001\u0000\u0000\u0000\u028e"+
		")\u0001\u0000\u0000\u0000\u028f\u028d\u0001\u0000\u0000\u0000\u0290\u0291"+
		"\u0005P\u0000\u0000\u0291\u029b\u0006\u0015\uffff\uffff\u0000\u0292\u0293"+
		"\u0005Q\u0000\u0000\u0293\u029b\u0006\u0015\uffff\uffff\u0000\u0294\u0295"+
		"\u0005R\u0000\u0000\u0295\u029b\u0006\u0015\uffff\uffff\u0000\u0296\u0297"+
		"\u00059\u0000\u0000\u0297\u029b\u0006\u0015\uffff\uffff\u0000\u0298\u0299"+
		"\u00058\u0000\u0000\u0299\u029b\u0006\u0015\uffff\uffff\u0000\u029a\u0290"+
		"\u0001\u0000\u0000\u0000\u029a\u0292\u0001\u0000\u0000\u0000\u029a\u0294"+
		"\u0001\u0000\u0000\u0000\u029a\u0296\u0001\u0000\u0000\u0000\u029a\u0298"+
		"\u0001\u0000\u0000\u0000\u029b+\u0001\u0000\u0000\u0000\u029c\u029d\u0005"+
		"3\u0000\u0000\u029d\u02a7\u0006\u0016\uffff\uffff\u0000\u029e\u029f\u0005"+
		"7\u0000\u0000\u029f\u02a7\u0006\u0016\uffff\uffff\u0000\u02a0\u02a1\u0005"+
		"5\u0000\u0000\u02a1\u02a7\u0006\u0016\uffff\uffff\u0000\u02a2\u02a3\u0005"+
		"4\u0000\u0000\u02a3\u02a7\u0006\u0016\uffff\uffff\u0000\u02a4\u02a5\u0005"+
		"6\u0000\u0000\u02a5\u02a7\u0006\u0016\uffff\uffff\u0000\u02a6\u029c\u0001"+
		"\u0000\u0000\u0000\u02a6\u029e\u0001\u0000\u0000\u0000\u02a6\u02a0\u0001"+
		"\u0000\u0000\u0000\u02a6\u02a2\u0001\u0000\u0000\u0000\u02a6\u02a4\u0001"+
		"\u0000\u0000\u0000\u02a7-\u0001\u0000\u0000\u0000\u02a8\u02a9\u0005F\u0000"+
		"\u0000\u02a9\u02b1\u0006\u0017\uffff\uffff\u0000\u02aa\u02ab\u0005E\u0000"+
		"\u0000\u02ab\u02b1\u0006\u0017\uffff\uffff\u0000\u02ac\u02ad\u0005G\u0000"+
		"\u0000\u02ad\u02b1\u0006\u0017\uffff\uffff\u0000\u02ae\u02af\u0005H\u0000"+
		"\u0000\u02af\u02b1\u0006\u0017\uffff\uffff\u0000\u02b0\u02a8\u0001\u0000"+
		"\u0000\u0000\u02b0\u02aa\u0001\u0000\u0000\u0000\u02b0\u02ac\u0001\u0000"+
		"\u0000\u0000\u02b0\u02ae\u0001\u0000\u0000\u0000\u02b1/\u0001\u0000\u0000"+
		"\u0000\u02b2\u02b7\u0005F\u0000\u0000\u02b3\u02b7\u0005E\u0000\u0000\u02b4"+
		"\u02b7\u0005G\u0000\u0000\u02b5\u02b7\u0005H\u0000\u0000\u02b6\u02b2\u0001"+
		"\u0000\u0000\u0000\u02b6\u02b3\u0001\u0000\u0000\u0000\u02b6\u02b4\u0001"+
		"\u0000\u0000\u0000\u02b6\u02b5\u0001\u0000\u0000\u0000\u02b7\u02b8\u0001"+
		"\u0000\u0000\u0000\u02b8\u02b9\u0006\u0018\uffff\uffff\u0000\u02b91\u0001"+
		"\u0000\u0000\u0000\u02ba\u02bb\u0003,\u0016\u0000\u02bb\u02bc\u0006\u0019"+
		"\uffff\uffff\u0000\u02bc\u02c1\u0001\u0000\u0000\u0000\u02bd\u02be\u0003"+
		".\u0017\u0000\u02be\u02bf\u0006\u0019\uffff\uffff\u0000\u02bf\u02c1\u0001"+
		"\u0000\u0000\u0000\u02c0\u02ba\u0001\u0000\u0000\u0000\u02c0\u02bd\u0001"+
		"\u0000\u0000\u0000\u02c13\u0001\u0000\u0000\u0000\u02c2\u02c8\u0006\u001a"+
		"\uffff\uffff\u0000\u02c3\u02c9\u0005I\u0000\u0000\u02c4\u02c9\u0005L\u0000"+
		"\u0000\u02c5\u02c9\u0005M\u0000\u0000\u02c6\u02c9\u0005J\u0000\u0000\u02c7"+
		"\u02c9\u0005K\u0000\u0000\u02c8\u02c3\u0001\u0000\u0000\u0000\u02c8\u02c4"+
		"\u0001\u0000\u0000\u0000\u02c8\u02c5\u0001\u0000\u0000\u0000\u02c8\u02c6"+
		"\u0001\u0000\u0000\u0000\u02c8\u02c7\u0001\u0000\u0000\u0000\u02c9\u02ca"+
		"\u0001\u0000\u0000\u0000\u02ca\u02cb\u0006\u001a\uffff\uffff\u0000\u02cb"+
		"5\u0001\u0000\u0000\u0000\u02cc\u02d8\u0006\u001b\uffff\uffff\u0000\u02cd"+
		"\u02d9\u0005:\u0000\u0000\u02ce\u02d9\u0005;\u0000\u0000\u02cf\u02d9\u0005"+
		"<\u0000\u0000\u02d0\u02d9\u0005=\u0000\u0000\u02d1\u02d9\u0005>\u0000"+
		"\u0000\u02d2\u02d9\u0005?\u0000\u0000\u02d3\u02d9\u0005@\u0000\u0000\u02d4"+
		"\u02d9\u0005A\u0000\u0000\u02d5\u02d9\u0005B\u0000\u0000\u02d6\u02d9\u0005"+
		"C\u0000\u0000\u02d7\u02d9\u0005D\u0000\u0000\u02d8\u02cd\u0001\u0000\u0000"+
		"\u0000\u02d8\u02ce\u0001\u0000\u0000\u0000\u02d8\u02cf\u0001\u0000\u0000"+
		"\u0000\u02d8\u02d0\u0001\u0000\u0000\u0000\u02d8\u02d1\u0001\u0000\u0000"+
		"\u0000\u02d8\u02d2\u0001\u0000\u0000\u0000\u02d8\u02d3\u0001\u0000\u0000"+
		"\u0000\u02d8\u02d4\u0001\u0000\u0000\u0000\u02d8\u02d5\u0001\u0000\u0000"+
		"\u0000\u02d8\u02d6\u0001\u0000\u0000\u0000\u02d8\u02d7\u0001\u0000\u0000"+
		"\u0000\u02d9\u02da\u0001\u0000\u0000\u0000\u02da\u02db\u0006\u001b\uffff"+
		"\uffff\u0000\u02db7\u0001\u0000\u0000\u0000\u02dc\u02df\u0006\u001c\uffff"+
		"\uffff\u0000\u02dd\u02e0\u0005C\u0000\u0000\u02de\u02e0\u0005D\u0000\u0000"+
		"\u02df\u02dd\u0001\u0000\u0000\u0000\u02df\u02de\u0001\u0000\u0000\u0000"+
		"\u02e0\u02e1\u0001\u0000\u0000\u0000\u02e1\u02e2\u0006\u001c\uffff\uffff"+
		"\u0000\u02e29\u0001\u0000\u0000\u0000\u02e3\u02e4\u0005 \u0000\u0000\u02e4"+
		"\u02f0\u0006\u001d\uffff\uffff\u0000\u02e5\u02e6\u0005!\u0000\u0000\u02e6"+
		"\u02f0\u0006\u001d\uffff\uffff\u0000\u02e7\u02e8\u0005\"\u0000\u0000\u02e8"+
		"\u02f0\u0006\u001d\uffff\uffff\u0000\u02e9\u02ea\u0005#\u0000\u0000\u02ea"+
		"\u02f0\u0006\u001d\uffff\uffff\u0000\u02eb\u02ec\u0005$\u0000\u0000\u02ec"+
		"\u02f0\u0006\u001d\uffff\uffff\u0000\u02ed\u02ee\u0005%\u0000\u0000\u02ee"+
		"\u02f0\u0006\u001d\uffff\uffff\u0000\u02ef\u02e3\u0001\u0000\u0000\u0000"+
		"\u02ef\u02e5\u0001\u0000\u0000\u0000\u02ef\u02e7\u0001\u0000\u0000\u0000"+
		"\u02ef\u02e9\u0001\u0000\u0000\u0000\u02ef\u02eb\u0001\u0000\u0000\u0000"+
		"\u02ef\u02ed\u0001\u0000\u0000\u0000\u02f0;\u0001\u0000\u0000\u0000?I"+
		"K{\u008b\u0092\u009e\u00a5\u00b7\u00ba\u00bf\u00c7\u00ce\u00db\u00e2\u00ee"+
		"\u00f6\u00fd\u010a\u0112\u0119\u0125\u013b\u0142\u014b\u0152\u0154\u0163"+
		"\u016a\u0178\u0181\u0188\u0193\u019a\u01a5\u01ac\u01ae\u01b4\u01cc\u01d7"+
		"\u01da\u01ea\u01f9\u01fc\u020f\u0229\u0233\u023e\u0249\u0254\u025f\u026c"+
		"\u0288\u028b\u028d\u029a\u02a6\u02b0\u02b6\u02c0\u02c8\u02d8\u02df\u02ef";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}