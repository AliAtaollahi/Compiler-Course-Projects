// Generated from D:/7/Compiler/CAs/Phase2/code/src/main/grammar/UTL.g4 by ANTLR 4.13.1
package parsers;

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
		CONTINUE=46, RETURN=47, MAIN=48, ONINIT=49, ONSTART=50, FLOAT=51, DOUBLE=52, 
		STRING=53, BOOL=54, VOID=55, INT=56, BUY=57, SELL=58, ASK=59, BID=60, 
		TIME=61, HIGH=62, LOW=63, DIGITS=64, VOLUME=65, TYPE=66, TEXT=67, OPEN=68, 
		CLOSE=69, TRADE=70, ORDER=71, CANDLE=72, EXCEPTION=73, REFRESH_RATE=74, 
		GET_CANDLE=75, TERMINATE=76, CONNECT=77, OBSERVE=78, PRINT=79, ID=80, 
		INT_LITERAL=81, FLOAT_LITERAL=82, STRING_LITERAL=83, COMMENT=84;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_varDeclaration = 2, RULE_functionDeclaration = 3, 
		RULE_mainDeclaration = 4, RULE_initDeclaration = 5, RULE_startDeclaration = 6, 
		RULE_primitiveType = 7, RULE_complexType = 8, RULE_allType = 9, RULE_espetialFunction = 10, 
		RULE_espetialVariable = 11, RULE_espetialMethod = 12, RULE_assign = 13, 
		RULE_identifier = 14, RULE_methodCall = 15, RULE_expression = 16, RULE_value = 17, 
		RULE_assignStatement = 18, RULE_ifStatement = 19, RULE_whileStatement = 20, 
		RULE_forStatement = 21, RULE_tryCatchStatement = 22, RULE_continueBreakStatement = 23, 
		RULE_returnStatement = 24, RULE_throwStatement = 25, RULE_functionCall = 26, 
		RULE_globVariableDeclaration = 27;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "varDeclaration", "functionDeclaration", "mainDeclaration", 
			"initDeclaration", "startDeclaration", "primitiveType", "complexType", 
			"allType", "espetialFunction", "espetialVariable", "espetialMethod", 
			"assign", "identifier", "methodCall", "expression", "value", "assignStatement", 
			"ifStatement", "whileStatement", "forStatement", "tryCatchStatement", 
			"continueBreakStatement", "returnStatement", "throwStatement", "functionCall", 
			"globVariableDeclaration"
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
			"'return'", "'Main'", "'OnInit'", "'OnStart'", "'float'", "'double'", 
			"'string'", "'bool'", "'void'", "'int'", "'BUY'", "'SELL'", "'Ask'", 
			"'Bid'", "'Time'", "'High'", "'Low'", "'Digits'", "'Volume'", "'Type'", 
			"'Text'", "'Open'", "'Close'", "'Trade'", "'Order'", "'Candle'", "'Exception'", 
			"'RefreshRate'", "'GetCandle'", "'Terminate'", "'Connect'", "'Observe'", 
			"'Print'"
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
			"RETURN", "MAIN", "ONINIT", "ONSTART", "FLOAT", "DOUBLE", "STRING", "BOOL", 
			"VOID", "INT", "BUY", "SELL", "ASK", "BID", "TIME", "HIGH", "LOW", "DIGITS", 
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
		public FunctionDeclarationContext functionDeclaration;
		public InitDeclarationContext initDeclaration;
		public StartDeclarationContext startDeclaration;
		public GlobVariableDeclarationContext globVariableDeclaration;
		public MainDeclarationContext mainDeclaration;
		public MainDeclarationContext mainDeclaration() {
			return getRuleContext(MainDeclarationContext.class,0);
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
		public List<GlobVariableDeclarationContext> globVariableDeclaration() {
			return getRuleContexts(GlobVariableDeclarationContext.class);
		}
		public GlobVariableDeclarationContext globVariableDeclaration(int i) {
			return getRuleContext(GlobVariableDeclarationContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(UTLParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(UTLParser.SEMICOLON, i);
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
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(70);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
					case 1:
						{
						setState(57);
						((ProgramContext)_localctx).functionDeclaration = functionDeclaration();
						 _localctx.pro.addFunction(((ProgramContext)_localctx).functionDeclaration.funcDecRet); 
						}
						break;
					case 2:
						{
						setState(60);
						((ProgramContext)_localctx).initDeclaration = initDeclaration();
						 _localctx.pro.addInit(((ProgramContext)_localctx).initDeclaration.onInitDecRet); 
						}
						break;
					case 3:
						{
						setState(63);
						((ProgramContext)_localctx).startDeclaration = startDeclaration();
						 _localctx.pro.addStart(((ProgramContext)_localctx).startDeclaration.onStartDecRet); 
						}
						break;
					case 4:
						{
						{
						setState(66);
						((ProgramContext)_localctx).globVariableDeclaration = globVariableDeclaration();
						setState(67);
						match(SEMICOLON);
						 _localctx.pro.addVar(((ProgramContext)_localctx).globVariableDeclaration.globalVarDecRet); 
						}
						}
						break;
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(75);
			((ProgramContext)_localctx).mainDeclaration = mainDeclaration();
			 _localctx.pro.setMain(((ProgramContext)_localctx).mainDeclaration.mainDecRet); 
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
		public IfStatementContext ifStatement;
		public FunctionDeclarationContext functionDeclaration;
		public ThrowStatementContext throwStatement;
		public ContinueBreakStatementContext continueBreakStatement;
		public AssignStatementContext assignStatement;
		public ReturnStatementContext returnStatement;
		public WhileStatementContext whileStatement;
		public ForStatementContext forStatement;
		public TryCatchStatementContext tryCatchStatement;
		public ExpressionContext expression;
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public ContinueBreakStatementContext continueBreakStatement() {
			return getRuleContext(ContinueBreakStatementContext.class,0);
		}
		public AssignStatementContext assignStatement() {
			return getRuleContext(AssignStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
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
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 2, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				{
				setState(78);
				((StatementContext)_localctx).varDeclaration = varDeclaration();
				setState(79);
				match(SEMICOLON);
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).varDeclaration.varDecRet; 
				}
				}
				break;
			case 2:
				{
				setState(82);
				((StatementContext)_localctx).ifStatement = ifStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).ifStatement.ifStmtRet; 
				}
				break;
			case 3:
				{
				setState(85);
				((StatementContext)_localctx).functionDeclaration = functionDeclaration();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).functionDeclaration.funcDecRet; 
				}
				break;
			case 4:
				{
				setState(88);
				((StatementContext)_localctx).throwStatement = throwStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).throwStatement.throwStmtRet; 
				}
				break;
			case 5:
				{
				setState(91);
				((StatementContext)_localctx).continueBreakStatement = continueBreakStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).continueBreakStatement.continueBreakStmtRet; 
				}
				break;
			case 6:
				{
				setState(94);
				((StatementContext)_localctx).assignStatement = assignStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).assignStatement.assignStmtRet; 
				}
				break;
			case 7:
				{
				setState(97);
				((StatementContext)_localctx).returnStatement = returnStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).returnStatement.returnStmtRet; 
				}
				break;
			case 8:
				{
				setState(100);
				((StatementContext)_localctx).whileStatement = whileStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).whileStatement.whileStmtRet; 
				}
				break;
			case 9:
				{
				setState(103);
				((StatementContext)_localctx).forStatement = forStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).forStatement.forStmtRet; 
				}
				break;
			case 10:
				{
				setState(106);
				((StatementContext)_localctx).tryCatchStatement = tryCatchStatement();
				 ((StatementContext)_localctx).statementRet =  ((StatementContext)_localctx).tryCatchStatement.tryCatchStmtRet; 
				}
				break;
			case 11:
				{
				{
				setState(109);
				((StatementContext)_localctx).expression = expression(0);
				setState(110);
				match(SEMICOLON);
				 ((StatementContext)_localctx).statementRet =  new ExpressionStmt(((StatementContext)_localctx).expression.expressionRet); 
				}
				}
				break;
			}
			 _localctx.statementRet.setLine(_localctx.statementRet.getLine()); 
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
		public Token temp_int_literal;
		public IdentifierContext identifier;
		public EspetialVariableContext espetialVariable;
		public ExpressionContext expression;
		public AllTypeContext allType() {
			return getRuleContext(AllTypeContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(UTLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(UTLParser.RBRACK, 0); }
		public TerminalNode ASSIGN() { return getToken(UTLParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INT_LITERAL() { return getToken(UTLParser.INT_LITERAL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EspetialVariableContext espetialVariable() {
			return getRuleContext(EspetialVariableContext.class,0);
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
		enterRule(_localctx, 4, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((VarDeclarationContext)_localctx).varDecRet =  new VarDeclaration(); 
			setState(118);
			((VarDeclarationContext)_localctx).allType = allType();
			 _localctx.varDecRet.setType(((VarDeclarationContext)_localctx).allType.allTypeRet); 
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(120);
				match(LBRACK);
				setState(121);
				((VarDeclarationContext)_localctx).temp_int_literal = match(INT_LITERAL);
				setState(122);
				match(RBRACK);
				 _localctx.varDecRet.setLength(Integer.parseInt((((VarDeclarationContext)_localctx).temp_int_literal!=null?((VarDeclarationContext)_localctx).temp_int_literal.getText():null))); 
				}
			}

			{
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(126);
				((VarDeclarationContext)_localctx).identifier = identifier();
				 _localctx.varDecRet.setIdentifier(((VarDeclarationContext)_localctx).identifier.identifierRet); 
				}
				break;
			case ASK:
			case BID:
			case TIME:
			case HIGH:
			case LOW:
			case DIGITS:
			case VOLUME:
			case TYPE:
			case TEXT:
			case OPEN:
			case CLOSE:
				{
				setState(129);
				((VarDeclarationContext)_localctx).espetialVariable = espetialVariable();
				 _localctx.varDecRet.setIdentifier(((VarDeclarationContext)_localctx).espetialVariable.espetialVariableRet); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 _localctx.varDecRet.setLine(_localctx.varDecRet.getIdentifier().getLine()); 
			}
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(136);
				match(ASSIGN);
				setState(137);
				((VarDeclarationContext)_localctx).expression = expression(0);
				 _localctx.varDecRet.setExpression(((VarDeclarationContext)_localctx).expression.expressionRet); 
				}
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
	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionDeclaration funcDecRet;
		public PrimitiveTypeContext primitiveType;
		public IdentifierContext temp_identifier;
		public VarDeclarationContext varDeclaration;
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
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
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
		enterRule(_localctx, 6, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((FunctionDeclarationContext)_localctx).funcDecRet =  new FunctionDeclaration(); 
			setState(143);
			((FunctionDeclarationContext)_localctx).primitiveType = primitiveType();
			 _localctx.funcDecRet.setReturnType(((FunctionDeclarationContext)_localctx).primitiveType.primitiveTypeRet); 
			setState(145);
			((FunctionDeclarationContext)_localctx).temp_identifier = identifier();
			 _localctx.funcDecRet.setName(((FunctionDeclarationContext)_localctx).temp_identifier.identifierRet); _localctx.funcDecRet.setLine(((FunctionDeclarationContext)_localctx).temp_identifier.identifierRet.getLine()); 
			setState(147);
			match(LPAREN);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 51)) & ~0x3f) == 0 && ((1L << (_la - 51)) & 7864383L) != 0)) {
				{
				setState(148);
				((FunctionDeclarationContext)_localctx).varDeclaration = varDeclaration();
				 _localctx.funcDecRet.addArg(((FunctionDeclarationContext)_localctx).varDeclaration.varDecRet); 
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(150);
					match(COMMA);
					setState(151);
					((FunctionDeclarationContext)_localctx).varDeclaration = varDeclaration();
					 _localctx.funcDecRet.addArg(((FunctionDeclarationContext)_localctx).varDeclaration.varDecRet); 
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(161);
			match(RPAREN);
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(162);
				match(THROW);
				setState(163);
				match(EXCEPTION);
				}
				break;
			}
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(166);
				match(LBRACE);
				setState(172);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(167);
					((FunctionDeclarationContext)_localctx).statement = statement();
					 _localctx.funcDecRet.addStatement(((FunctionDeclarationContext)_localctx).statement.statementRet); 
					}
					}
					setState(174);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(175);
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
			case DOUBLE:
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
				setState(176);
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
		public Token temp_main;
		public StatementContext statement;
		public TerminalNode VOID() { return getToken(UTLParser.VOID, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode MAIN() { return getToken(UTLParser.MAIN, 0); }
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
		enterRule(_localctx, 8, RULE_mainDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((MainDeclarationContext)_localctx).mainDecRet =  new MainDeclaration(); 
			setState(182);
			match(VOID);
			setState(183);
			((MainDeclarationContext)_localctx).temp_main = match(MAIN);
			setState(184);
			match(LPAREN);
			setState(185);
			match(RPAREN);
			 _localctx.mainDecRet.setLine(((MainDeclarationContext)_localctx).temp_main.getLine()); 
			setState(200);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				setState(187);
				match(LBRACE);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(188);
					((MainDeclarationContext)_localctx).statement = statement();
					 
					            if (((MainDeclarationContext)_localctx).statement.statementRet instanceof VarDeclaration varDeclaration) 
					                {
					                    if (varDeclaration.getType().equals("Trade")) { _localctx.mainDecRet.addActorInstantiation(varDeclaration); }
					                    else { _localctx.mainDecRet.addStatement(varDeclaration); }
					                }
					            else { _localctx.mainDecRet.addStatement(((MainDeclarationContext)_localctx).statement.statementRet); } 
					        
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(196);
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
			case DOUBLE:
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
				setState(197);
				((MainDeclarationContext)_localctx).statement = statement();
				 
				            if (((MainDeclarationContext)_localctx).statement.statementRet instanceof VarDeclaration varDeclaration) 
				            {
				                if (varDeclaration.getType().equals("Trade")) { _localctx.mainDecRet.addActorInstantiation(varDeclaration); }
				                else { _localctx.mainDecRet.addStatement(varDeclaration); }
				            }
				            else { _localctx.mainDecRet.addStatement(((MainDeclarationContext)_localctx).statement.statementRet); } 
				        
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
		public OnInitDeclaration onInitDecRet;
		public Token temp_oninit;
		public IdentifierContext temp_identifier;
		public StatementContext statement;
		public TerminalNode VOID() { return getToken(UTLParser.VOID, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode TRADE() { return getToken(UTLParser.TRADE, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode ONINIT() { return getToken(UTLParser.ONINIT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode THROW() { return getToken(UTLParser.THROW, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
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
		enterRule(_localctx, 10, RULE_initDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((InitDeclarationContext)_localctx).onInitDecRet =  new OnInitDeclaration(); 
			setState(203);
			match(VOID);
			setState(204);
			((InitDeclarationContext)_localctx).temp_oninit = match(ONINIT);
			setState(205);
			match(LPAREN);
			setState(206);
			match(TRADE);
			setState(207);
			((InitDeclarationContext)_localctx).temp_identifier = identifier();
			 _localctx.onInitDecRet.setTradeName(((InitDeclarationContext)_localctx).temp_identifier.identifierRet); _localctx.onInitDecRet.setLine(((InitDeclarationContext)_localctx).temp_oninit.getLine()); 
			setState(209);
			match(RPAREN);
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(210);
				match(THROW);
				setState(211);
				match(EXCEPTION);
				}
				break;
			}
			setState(227);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				{
				setState(214);
				match(LBRACE);
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(215);
					((InitDeclarationContext)_localctx).statement = statement();
					 _localctx.onInitDecRet.addStatement(((InitDeclarationContext)_localctx).statement.statementRet); 
					}
					}
					setState(222);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(223);
				match(RBRACE);
				}
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
			case DOUBLE:
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
				setState(224);
				((InitDeclarationContext)_localctx).statement = statement();
				 _localctx.onInitDecRet.addStatement(((InitDeclarationContext)_localctx).statement.statementRet); 
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
		public OnStartDeclaration onStartDecRet;
		public Token temp_onstart;
		public IdentifierContext temp_identifier;
		public StatementContext statement;
		public TerminalNode VOID() { return getToken(UTLParser.VOID, 0); }
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode TRADE() { return getToken(UTLParser.TRADE, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode ONSTART() { return getToken(UTLParser.ONSTART, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode THROW() { return getToken(UTLParser.THROW, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
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
		enterRule(_localctx, 12, RULE_startDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((StartDeclarationContext)_localctx).onStartDecRet =  new OnStartDeclaration(); 
			setState(230);
			match(VOID);
			setState(231);
			((StartDeclarationContext)_localctx).temp_onstart = match(ONSTART);
			setState(232);
			match(LPAREN);
			setState(233);
			match(TRADE);
			setState(234);
			((StartDeclarationContext)_localctx).temp_identifier = identifier();
			 _localctx.onStartDecRet.setTradeName(((StartDeclarationContext)_localctx).temp_identifier.identifierRet); _localctx.onStartDecRet.setLine(((StartDeclarationContext)_localctx).temp_onstart.getLine()); 
			setState(236);
			match(RPAREN);
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(237);
				match(THROW);
				setState(238);
				match(EXCEPTION);
				}
				break;
			}
			setState(254);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				{
				setState(241);
				match(LBRACE);
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(242);
					((StartDeclarationContext)_localctx).statement = statement();
					 _localctx.onStartDecRet.addStatement(((StartDeclarationContext)_localctx).statement.statementRet); 
					}
					}
					setState(249);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(250);
				match(RBRACE);
				}
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
			case DOUBLE:
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
				setState(251);
				((StartDeclarationContext)_localctx).statement = statement();
				 _localctx.onStartDecRet.addStatement(((StartDeclarationContext)_localctx).statement.statementRet); 
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
	public static class PrimitiveTypeContext extends ParserRuleContext {
		public Type primitiveTypeRet;
		public TerminalNode STRING() { return getToken(UTLParser.STRING, 0); }
		public TerminalNode FLOAT() { return getToken(UTLParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(UTLParser.DOUBLE, 0); }
		public TerminalNode INT() { return getToken(UTLParser.INT, 0); }
		public TerminalNode VOID() { return getToken(UTLParser.VOID, 0); }
		public TerminalNode BOOL() { return getToken(UTLParser.BOOL, 0); }
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
		enterRule(_localctx, 14, RULE_primitiveType);
		try {
			setState(268);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				match(STRING);
				 ((PrimitiveTypeContext)_localctx).primitiveTypeRet =  new StringType(); 
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				match(FLOAT);
				 ((PrimitiveTypeContext)_localctx).primitiveTypeRet =  new FloatType(); 
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(260);
				match(DOUBLE);
				 ((PrimitiveTypeContext)_localctx).primitiveTypeRet =  new DoubleType(); 
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 4);
				{
				setState(262);
				match(INT);
				 ((PrimitiveTypeContext)_localctx).primitiveTypeRet =  new IntType(); 
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 5);
				{
				setState(264);
				match(VOID);
				 ((PrimitiveTypeContext)_localctx).primitiveTypeRet =  new VoidType(); 
				}
				break;
			case BOOL:
				enterOuterAlt(_localctx, 6);
				{
				setState(266);
				match(BOOL);
				 ((PrimitiveTypeContext)_localctx).primitiveTypeRet =  new BoolType(); 
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
		public Type complexTypeRet;
		public TerminalNode TRADE() { return getToken(UTLParser.TRADE, 0); }
		public TerminalNode ORDER() { return getToken(UTLParser.ORDER, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public TerminalNode CANDLE() { return getToken(UTLParser.CANDLE, 0); }
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
		enterRule(_localctx, 16, RULE_complexType);
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRADE:
				enterOuterAlt(_localctx, 1);
				{
				setState(270);
				match(TRADE);
				 ((ComplexTypeContext)_localctx).complexTypeRet =  new TradeType(); 
				}
				break;
			case ORDER:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(ORDER);
				 ((ComplexTypeContext)_localctx).complexTypeRet =  new OrderType(); 
				}
				break;
			case EXCEPTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(274);
				match(EXCEPTION);
				 ((ComplexTypeContext)_localctx).complexTypeRet =  new ExceptionType(); 
				}
				break;
			case CANDLE:
				enterOuterAlt(_localctx, 4);
				{
				setState(276);
				match(CANDLE);
				 ((ComplexTypeContext)_localctx).complexTypeRet =  new CandleType(); 
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
		enterRule(_localctx, 18, RULE_allType);
		try {
			setState(286);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
			case DOUBLE:
			case STRING:
			case BOOL:
			case VOID:
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				((AllTypeContext)_localctx).primitiveType = primitiveType();
				 ((AllTypeContext)_localctx).allTypeRet =  ((AllTypeContext)_localctx).primitiveType.primitiveTypeRet; 
				}
				break;
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(283);
				((AllTypeContext)_localctx).complexType = complexType();
				 ((AllTypeContext)_localctx).allTypeRet =  ((AllTypeContext)_localctx).complexType.complexTypeRet; 
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
		public Identifier espetialFunctionRet;
		public Token temp_id;
		public TerminalNode GET_CANDLE() { return getToken(UTLParser.GET_CANDLE, 0); }
		public TerminalNode CONNECT() { return getToken(UTLParser.CONNECT, 0); }
		public TerminalNode REFRESH_RATE() { return getToken(UTLParser.REFRESH_RATE, 0); }
		public TerminalNode OBSERVE() { return getToken(UTLParser.OBSERVE, 0); }
		public TerminalNode PRINT() { return getToken(UTLParser.PRINT, 0); }
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
		enterRule(_localctx, 20, RULE_espetialFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			((EspetialFunctionContext)_localctx).temp_id = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & 63L) != 0)) ) {
				((EspetialFunctionContext)_localctx).temp_id = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 ((EspetialFunctionContext)_localctx).espetialFunctionRet =  new Identifier((((EspetialFunctionContext)_localctx).temp_id!=null?((EspetialFunctionContext)_localctx).temp_id.getText():null)); _localctx.espetialFunctionRet.setLine(((EspetialFunctionContext)_localctx).temp_id.getLine()); 
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
		public Identifier espetialVariableRet;
		public Token temp_id;
		public TerminalNode BID() { return getToken(UTLParser.BID, 0); }
		public TerminalNode ASK() { return getToken(UTLParser.ASK, 0); }
		public TerminalNode HIGH() { return getToken(UTLParser.HIGH, 0); }
		public TerminalNode TIME() { return getToken(UTLParser.TIME, 0); }
		public TerminalNode VOLUME() { return getToken(UTLParser.VOLUME, 0); }
		public TerminalNode LOW() { return getToken(UTLParser.LOW, 0); }
		public TerminalNode OPEN() { return getToken(UTLParser.OPEN, 0); }
		public TerminalNode TYPE() { return getToken(UTLParser.TYPE, 0); }
		public TerminalNode CLOSE() { return getToken(UTLParser.CLOSE, 0); }
		public TerminalNode DIGITS() { return getToken(UTLParser.DIGITS, 0); }
		public TerminalNode TEXT() { return getToken(UTLParser.TEXT, 0); }
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
		enterRule(_localctx, 22, RULE_espetialVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			((EspetialVariableContext)_localctx).temp_id = _input.LT(1);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 2047L) != 0)) ) {
				((EspetialVariableContext)_localctx).temp_id = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 ((EspetialVariableContext)_localctx).espetialVariableRet =  new Identifier((((EspetialVariableContext)_localctx).temp_id!=null?((EspetialVariableContext)_localctx).temp_id.getText():null)); _localctx.espetialVariableRet.setLine(((EspetialVariableContext)_localctx).temp_id.getLine()); 
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
		public Identifier espetialMethodRet;
		public Token temp_id;
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
		enterRule(_localctx, 24, RULE_espetialMethod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			((EspetialMethodContext)_localctx).temp_id = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==OPEN || _la==CLOSE) ) {
				((EspetialMethodContext)_localctx).temp_id = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 ((EspetialMethodContext)_localctx).espetialMethodRet =  new Identifier((((EspetialMethodContext)_localctx).temp_id!=null?((EspetialMethodContext)_localctx).temp_id.getText():null)); _localctx.espetialMethodRet.setLine(((EspetialMethodContext)_localctx).temp_id.getLine()); 
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
		public TerminalNode ASSIGN() { return getToken(UTLParser.ASSIGN, 0); }
		public TerminalNode SUB_ASSIGN() { return getToken(UTLParser.SUB_ASSIGN, 0); }
		public TerminalNode ADD_ASSIGN() { return getToken(UTLParser.ADD_ASSIGN, 0); }
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
		enterRule(_localctx, 26, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 270582939648L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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
	public static class IdentifierContext extends ParserRuleContext {
		public Identifier identifierRet;
		public Token temp_id;
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
		enterRule(_localctx, 28, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			((IdentifierContext)_localctx).temp_id = match(ID);
			 ((IdentifierContext)_localctx).identifierRet =  new Identifier((((IdentifierContext)_localctx).temp_id!=null?((IdentifierContext)_localctx).temp_id.getText():null)); _localctx.identifierRet.setLine(((IdentifierContext)_localctx).temp_id.getLine()); 
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
		public EspetialMethodContext espetialMethod;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(UTLParser.DOT, 0); }
		public EspetialMethodContext espetialMethod() {
			return getRuleContext(EspetialMethodContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode LBRACK() { return getToken(UTLParser.LBRACK, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
		enterRule(_localctx, 30, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((MethodCallContext)_localctx).methodCallRet =  new MethodCall(); 
			setState(303);
			((MethodCallContext)_localctx).identifier = identifier();
			 _localctx.methodCallRet.setIdentifierName(((MethodCallContext)_localctx).identifier.identifierRet); _localctx.methodCallRet.setLine(((MethodCallContext)_localctx).identifier.identifierRet.getLine()); 
			setState(310);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(305);
				match(LBRACK);
				setState(306);
				((MethodCallContext)_localctx).expression = expression(0);
				 _localctx.methodCallRet.setInstance(((MethodCallContext)_localctx).expression.expressionRet); 
				setState(308);
				match(RBRACK);
				}
			}

			setState(312);
			match(DOT);
			setState(313);
			((MethodCallContext)_localctx).espetialMethod = espetialMethod();
			 _localctx.methodCallRet.setFunctionName(((MethodCallContext)_localctx).espetialMethod.espetialMethodRet); 
			setState(315);
			match(LPAREN);
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 432345567482880064L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
				{
				setState(316);
				((MethodCallContext)_localctx).expression = expression(0);
				 _localctx.methodCallRet.addArg(((MethodCallContext)_localctx).expression.expressionRet); 
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(318);
					match(COMMA);
					setState(319);
					((MethodCallContext)_localctx).expression = expression(0);
					 _localctx.methodCallRet.addArg(((MethodCallContext)_localctx).expression.expressionRet); 
					}
					}
					setState(326);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(329);
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
		public ExpressionContext first_temp_expression;
		public ValueContext value;
		public ExpressionContext expression;
		public Token temp_id;
		public FunctionCallContext functionCall;
		public MethodCallContext methodCall;
		public ExpressionContext second_temp_expression;
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
		public TerminalNode DEC() { return getToken(UTLParser.DEC, 0); }
		public TerminalNode INC() { return getToken(UTLParser.INC, 0); }
		public TerminalNode ID() { return getToken(UTLParser.ID, 0); }
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
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(372);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(332);
				((ExpressionContext)_localctx).value = value();
				 ((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).value.valueRet; _localctx.expressionRet.setLine(((ExpressionContext)_localctx).value.valueRet.getLine()); 
				}
				break;
			case 2:
				{
				UnaryOperator op;
				setState(346);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NOT:
					{
					setState(336);
					match(NOT);
					op=UnaryOperator.NOT;
					}
					break;
				case MINUS:
					{
					setState(338);
					match(MINUS);
					op=UnaryOperator.MINUS;
					}
					break;
				case BIT_NOT:
					{
					setState(340);
					match(BIT_NOT);
					op=UnaryOperator.BIT_NOT;
					}
					break;
				case DEC:
					{
					setState(342);
					match(DEC);
					op=UnaryOperator.DEC;
					}
					break;
				case INC:
					{
					setState(344);
					match(INC);
					op=UnaryOperator.INC;
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(348);
				((ExpressionContext)_localctx).first_temp_expression = ((ExpressionContext)_localctx).expression = expression(14);
				 ((ExpressionContext)_localctx).expressionRet = new UnaryExpression(op, ((ExpressionContext)_localctx).first_temp_expression.expressionRet); _localctx.expressionRet.setLine(((ExpressionContext)_localctx).first_temp_expression.expressionRet.getLine()); 
				}
				break;
			case 3:
				{
				setState(351);
				((ExpressionContext)_localctx).temp_id = match(ID);
				{
				setState(352);
				match(LBRACK);
				setState(353);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(354);
				match(RBRACK);
				}
				 ((ExpressionContext)_localctx).expressionRet =  new ArrayIdentifier((((ExpressionContext)_localctx).temp_id!=null?((ExpressionContext)_localctx).temp_id.getText():null), ((ExpressionContext)_localctx).expression.expressionRet); 
				 _localctx.expressionRet.setLine(((ExpressionContext)_localctx).temp_id.getLine()); 
				}
				break;
			case 4:
				{
				setState(359);
				((ExpressionContext)_localctx).temp_id = match(ID);
				 ((ExpressionContext)_localctx).expressionRet =  new Identifier((((ExpressionContext)_localctx).temp_id!=null?((ExpressionContext)_localctx).temp_id.getText():null)); _localctx.expressionRet.setLine(((ExpressionContext)_localctx).temp_id.getLine()); 
				}
				break;
			case 5:
				{
				setState(361);
				match(LPAREN);
				setState(362);
				((ExpressionContext)_localctx).expression = expression(0);
				setState(363);
				match(RPAREN);
				 ((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).expression.expressionRet; _localctx.expressionRet.setLine(((ExpressionContext)_localctx).expression.expressionRet.getLine()); 
				}
				break;
			case 6:
				{
				setState(366);
				((ExpressionContext)_localctx).functionCall = functionCall();
				 ((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).functionCall.functionCallRet; _localctx.expressionRet.setLine(((ExpressionContext)_localctx).functionCall.functionCallRet.getLine()); 
				}
				break;
			case 7:
				{
				setState(369);
				((ExpressionContext)_localctx).methodCall = methodCall();
				 ((ExpressionContext)_localctx).expressionRet =  ((ExpressionContext)_localctx).methodCall.methodCallRet; _localctx.expressionRet.setLine(((ExpressionContext)_localctx).methodCall.methodCallRet.getLine()); 
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(470);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(468);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.first_temp_expression = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(374);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						BinaryOperator op;
						setState(382);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case MULT:
							{
							setState(376);
							match(MULT);
							op=BinaryOperator.MULT;
							}
							break;
						case DIV:
							{
							setState(378);
							match(DIV);
							op=BinaryOperator.DIV;
							}
							break;
						case MOD:
							{
							setState(380);
							match(MOD);
							op=BinaryOperator.MOD;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(384);
						((ExpressionContext)_localctx).second_temp_expression = ((ExpressionContext)_localctx).expression = expression(14);
						 ((ExpressionContext)_localctx).expressionRet = new BinaryExpression(((ExpressionContext)_localctx).first_temp_expression.expressionRet, ((ExpressionContext)_localctx).second_temp_expression.expressionRet, op); _localctx.expressionRet.setLine(((ExpressionContext)_localctx).first_temp_expression.expressionRet.getLine()); 
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.first_temp_expression = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(387);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						BinaryOperator op;
						setState(393);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case PLUS:
							{
							setState(389);
							match(PLUS);
							op=BinaryOperator.PLUS;
							}
							break;
						case MINUS:
							{
							setState(391);
							match(MINUS);
							op=BinaryOperator.MINUS;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(395);
						((ExpressionContext)_localctx).second_temp_expression = ((ExpressionContext)_localctx).expression = expression(13);
						 ((ExpressionContext)_localctx).expressionRet = new BinaryExpression(((ExpressionContext)_localctx).first_temp_expression.expressionRet, ((ExpressionContext)_localctx).second_temp_expression.expressionRet, op); _localctx.expressionRet.setLine(((ExpressionContext)_localctx).first_temp_expression.expressionRet.getLine()); 
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.first_temp_expression = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(398);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						BinaryOperator op;
						setState(404);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case L_SHIFT:
							{
							setState(400);
							match(L_SHIFT);
							op=BinaryOperator.L_SHIFT;
							}
							break;
						case R_SHIFT:
							{
							setState(402);
							match(R_SHIFT);
							op=BinaryOperator.R_SHIFT;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(406);
						((ExpressionContext)_localctx).second_temp_expression = ((ExpressionContext)_localctx).expression = expression(12);
						 ((ExpressionContext)_localctx).expressionRet = new BinaryExpression(((ExpressionContext)_localctx).first_temp_expression.expressionRet, ((ExpressionContext)_localctx).second_temp_expression.expressionRet, op); _localctx.expressionRet.setLine(((ExpressionContext)_localctx).first_temp_expression.expressionRet.getLine()); 
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.first_temp_expression = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(409);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						BinaryOperator op;
						setState(415);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case LT:
							{
							setState(411);
							match(LT);
							op=BinaryOperator.LT;
							}
							break;
						case GT:
							{
							setState(413);
							match(GT);
							op=BinaryOperator.GT;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(417);
						((ExpressionContext)_localctx).second_temp_expression = ((ExpressionContext)_localctx).expression = expression(11);
						 ((ExpressionContext)_localctx).expressionRet = new BinaryExpression(((ExpressionContext)_localctx).first_temp_expression.expressionRet, ((ExpressionContext)_localctx).second_temp_expression.expressionRet, op); _localctx.expressionRet.setLine(((ExpressionContext)_localctx).first_temp_expression.expressionRet.getLine()); 
						}
						break;
					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.first_temp_expression = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(420);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						BinaryOperator op;
						setState(426);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case EQ:
							{
							setState(422);
							match(EQ);
							op=BinaryOperator.EQ;
							}
							break;
						case NEQ:
							{
							setState(424);
							match(NEQ);
							op=BinaryOperator.NEQ;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(428);
						((ExpressionContext)_localctx).second_temp_expression = ((ExpressionContext)_localctx).expression = expression(10);
						 ((ExpressionContext)_localctx).expressionRet = new BinaryExpression(((ExpressionContext)_localctx).first_temp_expression.expressionRet, ((ExpressionContext)_localctx).second_temp_expression.expressionRet, op); _localctx.expressionRet.setLine(((ExpressionContext)_localctx).first_temp_expression.expressionRet.getLine()); 
						}
						break;
					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.first_temp_expression = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(431);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						BinaryOperator op;
						setState(439);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case BIT_AND:
							{
							setState(433);
							match(BIT_AND);
							op=BinaryOperator.BIT_AND;
							}
							break;
						case BIT_OR:
							{
							setState(435);
							match(BIT_OR);
							op=BinaryOperator.BIT_OR;
							}
							break;
						case BIT_XOR:
							{
							setState(437);
							match(BIT_XOR);
							op=BinaryOperator.BIT_XOR;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(441);
						((ExpressionContext)_localctx).second_temp_expression = ((ExpressionContext)_localctx).expression = expression(9);
						 ((ExpressionContext)_localctx).expressionRet = new BinaryExpression(((ExpressionContext)_localctx).first_temp_expression.expressionRet, ((ExpressionContext)_localctx).second_temp_expression.expressionRet, op); _localctx.expressionRet.setLine(((ExpressionContext)_localctx).first_temp_expression.expressionRet.getLine()); 
						}
						break;
					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.first_temp_expression = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(444);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(445);
						match(AND);
						setState(446);
						((ExpressionContext)_localctx).second_temp_expression = ((ExpressionContext)_localctx).expression = expression(8);
						 ((ExpressionContext)_localctx).expressionRet = new BinaryExpression(((ExpressionContext)_localctx).first_temp_expression.expressionRet, ((ExpressionContext)_localctx).second_temp_expression.expressionRet, BinaryOperator.AND); _localctx.expressionRet.setLine(((ExpressionContext)_localctx).first_temp_expression.expressionRet.getLine()); 
						}
						break;
					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.first_temp_expression = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(449);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(450);
						match(OR);
						setState(451);
						((ExpressionContext)_localctx).second_temp_expression = ((ExpressionContext)_localctx).expression = expression(7);
						 ((ExpressionContext)_localctx).expressionRet = new BinaryExpression(((ExpressionContext)_localctx).first_temp_expression.expressionRet, ((ExpressionContext)_localctx).second_temp_expression.expressionRet, BinaryOperator.OR); _localctx.expressionRet.setLine(((ExpressionContext)_localctx).first_temp_expression.expressionRet.getLine()); 
						}
						break;
					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.first_temp_expression = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(454);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(455);
						match(DOT);
						setState(456);
						((ExpressionContext)_localctx).espetialVariable = espetialVariable();
						 ((ExpressionContext)_localctx).expressionRet =  new VarAccess(((ExpressionContext)_localctx).first_temp_expression.expressionRet, ((ExpressionContext)_localctx).espetialVariable.espetialVariableRet); _localctx.expressionRet.setLine(((ExpressionContext)_localctx).first_temp_expression.expressionRet.getLine()); 
						}
						break;
					case 10:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						_localctx.first_temp_expression = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(459);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						UnaryOperator op;
						setState(465);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case DEC:
							{
							setState(461);
							match(DEC);
							op=UnaryOperator.DEC;
							}
							break;
						case INC:
							{
							setState(463);
							match(INC);
							op=UnaryOperator.INC;
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						 ((ExpressionContext)_localctx).expressionRet = new UnaryExpression(op, ((ExpressionContext)_localctx).first_temp_expression.expressionRet); _localctx.expressionRet.setLine(((ExpressionContext)_localctx).first_temp_expression.expressionRet.getLine()); 
						}
						break;
					}
					} 
				}
				setState(472);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
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
		public Value valueRet;
		public Token res;
		public TerminalNode INT_LITERAL() { return getToken(UTLParser.INT_LITERAL, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(UTLParser.STRING_LITERAL, 0); }
		public TerminalNode FLOAT_LITERAL() { return getToken(UTLParser.FLOAT_LITERAL, 0); }
		public TerminalNode BUY() { return getToken(UTLParser.BUY, 0); }
		public TerminalNode SELL() { return getToken(UTLParser.SELL, 0); }
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
		enterRule(_localctx, 34, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LITERAL:
				{
				setState(473);
				((ValueContext)_localctx).res = match(INT_LITERAL);
				 ((ValueContext)_localctx).valueRet =  new IntValue(Integer.parseInt((((ValueContext)_localctx).res!=null?((ValueContext)_localctx).res.getText():null))); 
				}
				break;
			case STRING_LITERAL:
				{
				setState(475);
				((ValueContext)_localctx).res = match(STRING_LITERAL);
				 ((ValueContext)_localctx).valueRet =  new StringValue((((ValueContext)_localctx).res!=null?((ValueContext)_localctx).res.getText():null)); 
				}
				break;
			case FLOAT_LITERAL:
				{
				setState(477);
				((ValueContext)_localctx).res = match(FLOAT_LITERAL);
				 ((ValueContext)_localctx).valueRet =  new FloatValue(Float.parseFloat((((ValueContext)_localctx).res!=null?((ValueContext)_localctx).res.getText():null))); 
				}
				break;
			case BUY:
				{
				setState(479);
				((ValueContext)_localctx).res = match(BUY);
				 ((ValueContext)_localctx).valueRet =  new TradeValue((((ValueContext)_localctx).res!=null?((ValueContext)_localctx).res.getText():null)); 
				}
				break;
			case SELL:
				{
				setState(481);
				((ValueContext)_localctx).res = match(SELL);
				 ((ValueContext)_localctx).valueRet =  new TradeValue((((ValueContext)_localctx).res!=null?((ValueContext)_localctx).res.getText():null)); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 _localctx.valueRet.setLine(((ValueContext)_localctx).res.getLine()); 
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
		public ExpressionContext first_temp_expression;
		public ExpressionContext second_temp_expression;
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
		enterRule(_localctx, 36, RULE_assignStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((AssignStatementContext)_localctx).assignStmtRet =  new AssignStmt(); 
			setState(488);
			((AssignStatementContext)_localctx).first_temp_expression = expression(0);
			 _localctx.assignStmtRet.setLValue(((AssignStatementContext)_localctx).first_temp_expression.expressionRet); _localctx.assignStmtRet.setLine(((AssignStatementContext)_localctx).first_temp_expression.expressionRet.getLine()); 
			setState(490);
			assign();
			setState(491);
			((AssignStatementContext)_localctx).second_temp_expression = expression(0);
			 _localctx.assignStmtRet.setRValue(((AssignStatementContext)_localctx).second_temp_expression.expressionRet); 
			setState(493);
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
	public static class IfStatementContext extends ParserRuleContext {
		public IfElseStmt ifStmtRet;
		public Token temp_if;
		public ExpressionContext temp_expression;
		public StatementContext statement;
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode IF() { return getToken(UTLParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(UTLParser.ELSE, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(UTLParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(UTLParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(UTLParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(UTLParser.RBRACE, i);
		}
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
		enterRule(_localctx, 38, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((IfStatementContext)_localctx).ifStmtRet =  new IfElseStmt(); 
			setState(496);
			((IfStatementContext)_localctx).temp_if = match(IF);
			setState(497);
			match(LPAREN);
			setState(498);
			((IfStatementContext)_localctx).temp_expression = expression(0);
			 _localctx.ifStmtRet.setCondition(((IfStatementContext)_localctx).temp_expression.expressionRet); _localctx.ifStmtRet.setLine(((IfStatementContext)_localctx).temp_if.getLine()); 
			setState(500);
			match(RPAREN);
			setState(514);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				{
				setState(501);
				match(LBRACE);
				setState(507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(502);
					((IfStatementContext)_localctx).statement = statement();
					 _localctx.ifStmtRet.addThenStatement(((IfStatementContext)_localctx).statement.statementRet); 
					}
					}
					setState(509);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(510);
				match(RBRACE);
				}
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
			case DOUBLE:
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
				setState(511);
				((IfStatementContext)_localctx).statement = statement();
				 _localctx.ifStmtRet.addThenStatement(((IfStatementContext)_localctx).statement.statementRet); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(532);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(516);
				match(ELSE);
				setState(530);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE:
					{
					{
					setState(517);
					match(LBRACE);
					setState(523);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
						{
						{
						setState(518);
						((IfStatementContext)_localctx).statement = statement();
						 _localctx.ifStmtRet.addElseStatement(((IfStatementContext)_localctx).statement.statementRet); 
						}
						}
						setState(525);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(526);
					match(RBRACE);
					}
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
				case DOUBLE:
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
					setState(527);
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
		public Token temp_while;
		public ExpressionContext temp_expression;
		public StatementContext statement;
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode WHILE() { return getToken(UTLParser.WHILE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode LBRACE() { return getToken(UTLParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(UTLParser.RBRACE, 0); }
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
		enterRule(_localctx, 40, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((WhileStatementContext)_localctx).whileStmtRet =  new WhileStmt(); 
			setState(535);
			((WhileStatementContext)_localctx).temp_while = match(WHILE);
			setState(536);
			match(LPAREN);
			setState(537);
			((WhileStatementContext)_localctx).temp_expression = expression(0);
			 _localctx.whileStmtRet.setCondition(((WhileStatementContext)_localctx).temp_expression.expressionRet); _localctx.whileStmtRet.setLine(((WhileStatementContext)_localctx).temp_while.getLine()); 
			setState(539);
			match(RPAREN);
			setState(553);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				{
				setState(540);
				match(LBRACE);
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(541);
					((WhileStatementContext)_localctx).statement = statement();
					 _localctx.whileStmtRet.addBody(((WhileStatementContext)_localctx).statement.statementRet); 
					}
					}
					setState(548);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(549);
				match(RBRACE);
				}
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
			case DOUBLE:
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
				setState(550);
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
		public Token temp_for;
		public StatementContext statement;
		public ExpressionContext temp_expression;
		public ExpressionContext first_temp_expression;
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public TerminalNode FOR() { return getToken(UTLParser.FOR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
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
		enterRule(_localctx, 42, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ForStatementContext)_localctx).forStmtRet =  new ForStmt(); 
			setState(556);
			((ForStatementContext)_localctx).temp_for = match(FOR);
			setState(557);
			match(LPAREN);
			 _localctx.forStmtRet.setLine(((ForStatementContext)_localctx).temp_for.getLine()); 
			setState(559);
			((ForStatementContext)_localctx).statement = statement();
			 _localctx.forStmtRet.addInit(((ForStatementContext)_localctx).statement.statementRet); 
			setState(561);
			((ForStatementContext)_localctx).temp_expression = expression(0);
			 _localctx.forStmtRet.setCondition(((ForStatementContext)_localctx).temp_expression.expressionRet); 
			setState(563);
			match(SEMICOLON);
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 432345567482880064L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
				{
				setState(564);
				((ForStatementContext)_localctx).first_temp_expression = expression(0);
				 _localctx.forStmtRet.setUpdate(((ForStatementContext)_localctx).first_temp_expression.expressionRet); 
				}
			}

			setState(569);
			match(RPAREN);
			setState(583);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				{
				setState(570);
				match(LBRACE);
				setState(576);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(571);
					((ForStatementContext)_localctx).statement = statement();
					 _localctx.forStmtRet.addBody(((ForStatementContext)_localctx).statement.statementRet); 
					}
					}
					setState(578);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(579);
				match(RBRACE);
				}
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
			case DOUBLE:
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
				setState(580);
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
		public Token temp_try;
		public StatementContext statement;
		public IdentifierContext temp_identifier;
		public TerminalNode TRY() { return getToken(UTLParser.TRY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode CATCH() { return getToken(UTLParser.CATCH, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public List<TerminalNode> LBRACE() { return getTokens(UTLParser.LBRACE); }
		public TerminalNode LBRACE(int i) {
			return getToken(UTLParser.LBRACE, i);
		}
		public List<TerminalNode> RBRACE() { return getTokens(UTLParser.RBRACE); }
		public TerminalNode RBRACE(int i) {
			return getToken(UTLParser.RBRACE, i);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
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
		enterRule(_localctx, 44, RULE_tryCatchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((TryCatchStatementContext)_localctx).tryCatchStmtRet =  new TryCatchStmt(); 
			setState(586);
			((TryCatchStatementContext)_localctx).temp_try = match(TRY);
			 _localctx.tryCatchStmtRet.setLine(((TryCatchStatementContext)_localctx).temp_try.getLine()); 
			setState(601);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LBRACE:
				{
				{
				setState(588);
				match(LBRACE);
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
					{
					{
					setState(589);
					((TryCatchStatementContext)_localctx).statement = statement();
					 _localctx.tryCatchStmtRet.addTryStatement(((TryCatchStatementContext)_localctx).statement.statementRet); 
					}
					}
					setState(596);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(597);
				match(RBRACE);
				}
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
			case DOUBLE:
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
				setState(598);
				((TryCatchStatementContext)_localctx).statement = statement();
				 _localctx.tryCatchStmtRet.addTryStatement(((TryCatchStatementContext)_localctx).statement.statementRet); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(622);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(603);
				match(CATCH);
				setState(604);
				match(EXCEPTION);
				setState(605);
				((TryCatchStatementContext)_localctx).temp_identifier = identifier();
				 _localctx.tryCatchStmtRet.setIdentifier(((TryCatchStatementContext)_localctx).temp_identifier.identifierRet); 
				setState(620);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LBRACE:
					{
					{
					setState(607);
					match(LBRACE);
					setState(613);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 574484658285715520L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
						{
						{
						setState(608);
						((TryCatchStatementContext)_localctx).statement = statement();
						 _localctx.tryCatchStmtRet.addCatchStatement(((TryCatchStatementContext)_localctx).statement.statementRet); 
						}
						}
						setState(615);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(616);
					match(RBRACE);
					}
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
				case DOUBLE:
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
					setState(617);
					((TryCatchStatementContext)_localctx).statement = statement();
					 _localctx.tryCatchStmtRet.addCatchStatement(((TryCatchStatementContext)_localctx).statement.statementRet); 
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
		public ContinueBreakStmt continueBreakStmtRet;
		public Token temp_identifier;
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public TerminalNode CONTINUE() { return getToken(UTLParser.CONTINUE, 0); }
		public TerminalNode BREAK() { return getToken(UTLParser.BREAK, 0); }
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
		enterRule(_localctx, 46, RULE_continueBreakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ContinueBreakStatementContext)_localctx).continueBreakStmtRet =  new ContinueBreakStmt(); 
			setState(625);
			((ContinueBreakStatementContext)_localctx).temp_identifier = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==BREAK || _la==CONTINUE) ) {
				((ContinueBreakStatementContext)_localctx).temp_identifier = (Token)_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			 _localctx.continueBreakStmtRet.setLine(((ContinueBreakStatementContext)_localctx).temp_identifier.getLine()); _localctx.continueBreakStmtRet.setToken((((ContinueBreakStatementContext)_localctx).temp_identifier!=null?((ContinueBreakStatementContext)_localctx).temp_identifier.getText():null)); 
			setState(627);
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
		public ReturnStmt returnStmtRet;
		public Token temp_return;
		public ExpressionContext temp_expression;
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public TerminalNode RETURN() { return getToken(UTLParser.RETURN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 48, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ReturnStatementContext)_localctx).returnStmtRet =  new ReturnStmt(); 
			setState(630);
			((ReturnStatementContext)_localctx).temp_return = match(RETURN);
			 _localctx.returnStmtRet.setLine(((ReturnStatementContext)_localctx).temp_return.getLine()); 
			setState(632);
			((ReturnStatementContext)_localctx).temp_expression = expression(0);
			 _localctx.returnStmtRet.setReturnedExpr(((ReturnStatementContext)_localctx).temp_expression.expressionRet); 
			setState(634);
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
		public Token temp_throw;
		public ExpressionContext temp_expression;
		public TerminalNode SEMICOLON() { return getToken(UTLParser.SEMICOLON, 0); }
		public TerminalNode THROW() { return getToken(UTLParser.THROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
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
		enterRule(_localctx, 50, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((ThrowStatementContext)_localctx).throwStmtRet =  new ThrowStmt(); 
			setState(637);
			((ThrowStatementContext)_localctx).temp_throw = match(THROW);
			 _localctx.throwStmtRet.setLine(((ThrowStatementContext)_localctx).temp_throw.getLine()); 
			setState(639);
			((ThrowStatementContext)_localctx).temp_expression = expression(0);
			 _localctx.throwStmtRet.setReturnedExpr(((ThrowStatementContext)_localctx).temp_expression.expressionRet); 
			setState(641);
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
		public FunctionCall functionCallRet;
		public Identifier complexId;
		public EspetialFunctionContext espetialFunction;
		public Token temp_id;
		public IdentifierContext identifier;
		public ExpressionContext expression;
		public TerminalNode LPAREN() { return getToken(UTLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(UTLParser.RPAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public EspetialFunctionContext espetialFunction() {
			return getRuleContext(EspetialFunctionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode TRADE() { return getToken(UTLParser.TRADE, 0); }
		public TerminalNode EXCEPTION() { return getToken(UTLParser.EXCEPTION, 0); }
		public TerminalNode ORDER() { return getToken(UTLParser.ORDER, 0); }
		public TerminalNode CANDLE() { return getToken(UTLParser.CANDLE, 0); }
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
		enterRule(_localctx, 52, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((FunctionCallContext)_localctx).functionCallRet =  new FunctionCall(); 
			{
			setState(652);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case REFRESH_RATE:
			case GET_CANDLE:
			case TERMINATE:
			case CONNECT:
			case OBSERVE:
			case PRINT:
				{
				setState(644);
				((FunctionCallContext)_localctx).espetialFunction = espetialFunction();
				 _localctx.functionCallRet.setFunctionName(((FunctionCallContext)_localctx).espetialFunction.espetialFunctionRet); 
				}
				break;
			case TRADE:
			case ORDER:
			case CANDLE:
			case EXCEPTION:
				{
				setState(647);
				((FunctionCallContext)_localctx).temp_id = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 15L) != 0)) ) {
					((FunctionCallContext)_localctx).temp_id = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				 ((FunctionCallContext)_localctx).complexId =  new Identifier((((FunctionCallContext)_localctx).temp_id!=null?((FunctionCallContext)_localctx).temp_id.getText():null)); _localctx.complexId.setLine(((FunctionCallContext)_localctx).temp_id.getLine()); _localctx.functionCallRet.setFunctionName(_localctx.complexId); _localctx.functionCallRet.setLine(_localctx.complexId.getLine()); 
				}
				break;
			case ID:
				{
				setState(649);
				((FunctionCallContext)_localctx).identifier = identifier();
				 _localctx.functionCallRet.setFunctionName(((FunctionCallContext)_localctx).identifier.identifierRet); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 _localctx.functionCallRet.setLine(_localctx.functionCallRet.getFunctionName().getLine()); 
			}
			setState(656);
			match(LPAREN);
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 432345567482880064L) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & 16383L) != 0)) {
				{
				setState(657);
				((FunctionCallContext)_localctx).expression = expression(0);
				 _localctx.functionCallRet.addArg(((FunctionCallContext)_localctx).expression.expressionRet); 
				setState(665);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(659);
					match(COMMA);
					setState(660);
					((FunctionCallContext)_localctx).expression = expression(0);
					 _localctx.functionCallRet.addArg(((FunctionCallContext)_localctx).expression.expressionRet); 
					}
					}
					setState(667);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(670);
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
	public static class GlobVariableDeclarationContext extends ParserRuleContext {
		public GlobVariableDeclaration globalVarDecRet;
		public AllTypeContext allType;
		public Token temp_int_literal;
		public IdentifierContext identifier;
		public EspetialVariableContext espetialVariable;
		public ExpressionContext expression;
		public AllTypeContext allType() {
			return getRuleContext(AllTypeContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(UTLParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(UTLParser.RBRACK, 0); }
		public TerminalNode ASSIGN() { return getToken(UTLParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode INT_LITERAL() { return getToken(UTLParser.INT_LITERAL, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EspetialVariableContext espetialVariable() {
			return getRuleContext(EspetialVariableContext.class,0);
		}
		public GlobVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_globVariableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).enterGlobVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof UTLListener ) ((UTLListener)listener).exitGlobVariableDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof UTLVisitor ) return ((UTLVisitor<? extends T>)visitor).visitGlobVariableDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GlobVariableDeclarationContext globVariableDeclaration() throws RecognitionException {
		GlobVariableDeclarationContext _localctx = new GlobVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_globVariableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			 ((GlobVariableDeclarationContext)_localctx).globalVarDecRet =  new GlobVariableDeclaration(); 
			setState(673);
			((GlobVariableDeclarationContext)_localctx).allType = allType();
			 _localctx.globalVarDecRet.setType(((GlobVariableDeclarationContext)_localctx).allType.allTypeRet); 
			setState(679);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(675);
				match(LBRACK);
				setState(676);
				((GlobVariableDeclarationContext)_localctx).temp_int_literal = match(INT_LITERAL);
				setState(677);
				match(RBRACK);
				 _localctx.globalVarDecRet.setLength(Integer.parseInt((((GlobVariableDeclarationContext)_localctx).temp_int_literal!=null?((GlobVariableDeclarationContext)_localctx).temp_int_literal.getText():null))); 
				}
			}

			{
			setState(687);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(681);
				((GlobVariableDeclarationContext)_localctx).identifier = identifier();
				 _localctx.globalVarDecRet.setIdentifier(((GlobVariableDeclarationContext)_localctx).identifier.identifierRet); 
				}
				break;
			case ASK:
			case BID:
			case TIME:
			case HIGH:
			case LOW:
			case DIGITS:
			case VOLUME:
			case TYPE:
			case TEXT:
			case OPEN:
			case CLOSE:
				{
				setState(684);
				((GlobVariableDeclarationContext)_localctx).espetialVariable = espetialVariable();
				 _localctx.globalVarDecRet.setIdentifier(((GlobVariableDeclarationContext)_localctx).espetialVariable.espetialVariableRet); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			 _localctx.globalVarDecRet.setLine(_localctx.globalVarDecRet.getIdentifier().getLine()); 
			}
			setState(695);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(691);
				match(ASSIGN);
				setState(692);
				((GlobVariableDeclarationContext)_localctx).expression = expression(0);
				 _localctx.globalVarDecRet.setExpression(((GlobVariableDeclarationContext)_localctx).expression.expressionRet); 
				}
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
		case 16:
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
		"\u0004\u0001T\u02ba\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0005\u0000G\b\u0000\n\u0000\f\u0000J\t\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001r\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002}\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0085\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"\u008d\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u0003\u009b\b\u0003\n\u0003\f\u0003\u009e\t\u0003\u0003"+
		"\u0003\u00a0\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003\u00a5"+
		"\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003\u00ab"+
		"\b\u0003\n\u0003\f\u0003\u00ae\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003\u00b4\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0005\u0004\u00c0\b\u0004\n\u0004\f\u0004\u00c3\t\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00c9\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00d5\b\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005\u00db\b\u0005\n"+
		"\u0005\f\u0005\u00de\t\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u00e4\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0003\u0006\u00f0\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0005\u0006\u00f6\b\u0006\n\u0006\f\u0006\u00f9\t\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00ff\b\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007"+
		"\u010d\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0003\b\u0117\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u011f\b\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u0137\b\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0143\b\u000f\n\u000f"+
		"\f\u000f\u0146\t\u000f\u0003\u000f\u0148\b\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u015b\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0175\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u017f\b\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u018a\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u0195\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u01a0\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u01ab\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u01b8\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u01d2\b\u0010\u0001\u0010\u0005\u0010"+
		"\u01d5\b\u0010\n\u0010\f\u0010\u01d8\t\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u01e4\b\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0005"+
		"\u0013\u01fa\b\u0013\n\u0013\f\u0013\u01fd\t\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u0203\b\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u020a\b\u0013\n\u0013"+
		"\f\u0013\u020d\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0213\b\u0013\u0003\u0013\u0215\b\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0221\b\u0014\n\u0014\f\u0014"+
		"\u0224\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u022a\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0003\u0015\u0238\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u023f\b\u0015\n\u0015\f\u0015\u0242"+
		"\t\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0248"+
		"\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u0251\b\u0016\n\u0016\f\u0016\u0254\t\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u025a\b\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0005\u0016\u0264\b\u0016\n\u0016\f\u0016\u0267"+
		"\t\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u026d"+
		"\b\u0016\u0003\u0016\u026f\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0003\u001a\u028d\b\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0005\u001a\u0298\b\u001a\n\u001a\f\u001a\u029b\t\u001a\u0003\u001a\u029d"+
		"\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u02a8\b\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0003"+
		"\u001b\u02b0\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0003\u001b\u02b8\b\u001b\u0001\u001b\u0000\u0001 "+
		"\u001c\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.0246\u0000\u0006\u0001\u0000JO\u0001\u0000"+
		";E\u0001\u0000DE\u0001\u0000 %\u0001\u0000-.\u0001\u0000FI\u02fe\u0000"+
		"8\u0001\u0000\u0000\u0000\u0002q\u0001\u0000\u0000\u0000\u0004u\u0001"+
		"\u0000\u0000\u0000\u0006\u008e\u0001\u0000\u0000\u0000\b\u00b5\u0001\u0000"+
		"\u0000\u0000\n\u00ca\u0001\u0000\u0000\u0000\f\u00e5\u0001\u0000\u0000"+
		"\u0000\u000e\u010c\u0001\u0000\u0000\u0000\u0010\u0116\u0001\u0000\u0000"+
		"\u0000\u0012\u011e\u0001\u0000\u0000\u0000\u0014\u0120\u0001\u0000\u0000"+
		"\u0000\u0016\u0123\u0001\u0000\u0000\u0000\u0018\u0126\u0001\u0000\u0000"+
		"\u0000\u001a\u0129\u0001\u0000\u0000\u0000\u001c\u012b\u0001\u0000\u0000"+
		"\u0000\u001e\u012e\u0001\u0000\u0000\u0000 \u0174\u0001\u0000\u0000\u0000"+
		"\"\u01e3\u0001\u0000\u0000\u0000$\u01e7\u0001\u0000\u0000\u0000&\u01ef"+
		"\u0001\u0000\u0000\u0000(\u0216\u0001\u0000\u0000\u0000*\u022b\u0001\u0000"+
		"\u0000\u0000,\u0249\u0001\u0000\u0000\u0000.\u0270\u0001\u0000\u0000\u0000"+
		"0\u0275\u0001\u0000\u0000\u00002\u027c\u0001\u0000\u0000\u00004\u0283"+
		"\u0001\u0000\u0000\u00006\u02a0\u0001\u0000\u0000\u00008H\u0006\u0000"+
		"\uffff\uffff\u00009:\u0003\u0006\u0003\u0000:;\u0006\u0000\uffff\uffff"+
		"\u0000;G\u0001\u0000\u0000\u0000<=\u0003\n\u0005\u0000=>\u0006\u0000\uffff"+
		"\uffff\u0000>G\u0001\u0000\u0000\u0000?@\u0003\f\u0006\u0000@A\u0006\u0000"+
		"\uffff\uffff\u0000AG\u0001\u0000\u0000\u0000BC\u00036\u001b\u0000CD\u0005"+
		"\u0002\u0000\u0000DE\u0006\u0000\uffff\uffff\u0000EG\u0001\u0000\u0000"+
		"\u0000F9\u0001\u0000\u0000\u0000F<\u0001\u0000\u0000\u0000F?\u0001\u0000"+
		"\u0000\u0000FB\u0001\u0000\u0000\u0000GJ\u0001\u0000\u0000\u0000HF\u0001"+
		"\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IK\u0001\u0000\u0000\u0000"+
		"JH\u0001\u0000\u0000\u0000KL\u0003\b\u0004\u0000LM\u0006\u0000\uffff\uffff"+
		"\u0000M\u0001\u0001\u0000\u0000\u0000NO\u0003\u0004\u0002\u0000OP\u0005"+
		"\u0002\u0000\u0000PQ\u0006\u0001\uffff\uffff\u0000Qr\u0001\u0000\u0000"+
		"\u0000RS\u0003&\u0013\u0000ST\u0006\u0001\uffff\uffff\u0000Tr\u0001\u0000"+
		"\u0000\u0000UV\u0003\u0006\u0003\u0000VW\u0006\u0001\uffff\uffff\u0000"+
		"Wr\u0001\u0000\u0000\u0000XY\u00032\u0019\u0000YZ\u0006\u0001\uffff\uffff"+
		"\u0000Zr\u0001\u0000\u0000\u0000[\\\u0003.\u0017\u0000\\]\u0006\u0001"+
		"\uffff\uffff\u0000]r\u0001\u0000\u0000\u0000^_\u0003$\u0012\u0000_`\u0006"+
		"\u0001\uffff\uffff\u0000`r\u0001\u0000\u0000\u0000ab\u00030\u0018\u0000"+
		"bc\u0006\u0001\uffff\uffff\u0000cr\u0001\u0000\u0000\u0000de\u0003(\u0014"+
		"\u0000ef\u0006\u0001\uffff\uffff\u0000fr\u0001\u0000\u0000\u0000gh\u0003"+
		"*\u0015\u0000hi\u0006\u0001\uffff\uffff\u0000ir\u0001\u0000\u0000\u0000"+
		"jk\u0003,\u0016\u0000kl\u0006\u0001\uffff\uffff\u0000lr\u0001\u0000\u0000"+
		"\u0000mn\u0003 \u0010\u0000no\u0005\u0002\u0000\u0000op\u0006\u0001\uffff"+
		"\uffff\u0000pr\u0001\u0000\u0000\u0000qN\u0001\u0000\u0000\u0000qR\u0001"+
		"\u0000\u0000\u0000qU\u0001\u0000\u0000\u0000qX\u0001\u0000\u0000\u0000"+
		"q[\u0001\u0000\u0000\u0000q^\u0001\u0000\u0000\u0000qa\u0001\u0000\u0000"+
		"\u0000qd\u0001\u0000\u0000\u0000qg\u0001\u0000\u0000\u0000qj\u0001\u0000"+
		"\u0000\u0000qm\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0006"+
		"\u0001\uffff\uffff\u0000t\u0003\u0001\u0000\u0000\u0000uv\u0006\u0002"+
		"\uffff\uffff\u0000vw\u0003\u0012\t\u0000w|\u0006\u0002\uffff\uffff\u0000"+
		"xy\u0005\n\u0000\u0000yz\u0005Q\u0000\u0000z{\u0005\u000b\u0000\u0000"+
		"{}\u0006\u0002\uffff\uffff\u0000|x\u0001\u0000\u0000\u0000|}\u0001\u0000"+
		"\u0000\u0000}\u0084\u0001\u0000\u0000\u0000~\u007f\u0003\u001c\u000e\u0000"+
		"\u007f\u0080\u0006\u0002\uffff\uffff\u0000\u0080\u0085\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0003\u0016\u000b\u0000\u0082\u0083\u0006\u0002\uffff"+
		"\uffff\u0000\u0083\u0085\u0001\u0000\u0000\u0000\u0084~\u0001\u0000\u0000"+
		"\u0000\u0084\u0081\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000"+
		"\u0000\u0086\u0087\u0006\u0002\uffff\uffff\u0000\u0087\u008c\u0001\u0000"+
		"\u0000\u0000\u0088\u0089\u0005 \u0000\u0000\u0089\u008a\u0003 \u0010\u0000"+
		"\u008a\u008b\u0006\u0002\uffff\uffff\u0000\u008b\u008d\u0001\u0000\u0000"+
		"\u0000\u008c\u0088\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u0005\u0001\u0000\u0000\u0000\u008e\u008f\u0006\u0003\uffff"+
		"\uffff\u0000\u008f\u0090\u0003\u000e\u0007\u0000\u0090\u0091\u0006\u0003"+
		"\uffff\uffff\u0000\u0091\u0092\u0003\u001c\u000e\u0000\u0092\u0093\u0006"+
		"\u0003\uffff\uffff\u0000\u0093\u009f\u0005\u0006\u0000\u0000\u0094\u0095"+
		"\u0003\u0004\u0002\u0000\u0095\u009c\u0006\u0003\uffff\uffff\u0000\u0096"+
		"\u0097\u0005\u0003\u0000\u0000\u0097\u0098\u0003\u0004\u0002\u0000\u0098"+
		"\u0099\u0006\u0003\uffff\uffff\u0000\u0099\u009b\u0001\u0000\u0000\u0000"+
		"\u009a\u0096\u0001\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000"+
		"\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000"+
		"\u009d\u00a0\u0001\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000"+
		"\u009f\u0094\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u00a4\u0005\u0007\u0000\u0000"+
		"\u00a2\u00a3\u0005\'\u0000\u0000\u00a3\u00a5\u0005I\u0000\u0000\u00a4"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5"+
		"\u00b3\u0001\u0000\u0000\u0000\u00a6\u00ac\u0005\b\u0000\u0000\u00a7\u00a8"+
		"\u0003\u0002\u0001\u0000\u00a8\u00a9\u0006\u0003\uffff\uffff\u0000\u00a9"+
		"\u00ab\u0001\u0000\u0000\u0000\u00aa\u00a7\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ae\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000\u00ac"+
		"\u00ad\u0001\u0000\u0000\u0000\u00ad\u00af\u0001\u0000\u0000\u0000\u00ae"+
		"\u00ac\u0001\u0000\u0000\u0000\u00af\u00b4\u0005\t\u0000\u0000\u00b0\u00b1"+
		"\u0003\u0002\u0001\u0000\u00b1\u00b2\u0006\u0003\uffff\uffff\u0000\u00b2"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b3\u00a6\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b0\u0001\u0000\u0000\u0000\u00b4\u0007\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0006\u0004\uffff\uffff\u0000\u00b6\u00b7\u00057\u0000\u0000\u00b7"+
		"\u00b8\u00050\u0000\u0000\u00b8\u00b9\u0005\u0006\u0000\u0000\u00b9\u00ba"+
		"\u0005\u0007\u0000\u0000\u00ba\u00c8\u0006\u0004\uffff\uffff\u0000\u00bb"+
		"\u00c1\u0005\b\u0000\u0000\u00bc\u00bd\u0003\u0002\u0001\u0000\u00bd\u00be"+
		"\u0006\u0004\uffff\uffff\u0000\u00be\u00c0\u0001\u0000\u0000\u0000\u00bf"+
		"\u00bc\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2"+
		"\u00c4\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c9\u0005\t\u0000\u0000\u00c5\u00c6\u0003\u0002\u0001\u0000\u00c6\u00c7"+
		"\u0006\u0004\uffff\uffff\u0000\u00c7\u00c9\u0001\u0000\u0000\u0000\u00c8"+
		"\u00bb\u0001\u0000\u0000\u0000\u00c8\u00c5\u0001\u0000\u0000\u0000\u00c9"+
		"\t\u0001\u0000\u0000\u0000\u00ca\u00cb\u0006\u0005\uffff\uffff\u0000\u00cb"+
		"\u00cc\u00057\u0000\u0000\u00cc\u00cd\u00051\u0000\u0000\u00cd\u00ce\u0005"+
		"\u0006\u0000\u0000\u00ce\u00cf\u0005F\u0000\u0000\u00cf\u00d0\u0003\u001c"+
		"\u000e\u0000\u00d0\u00d1\u0006\u0005\uffff\uffff\u0000\u00d1\u00d4\u0005"+
		"\u0007\u0000\u0000\u00d2\u00d3\u0005\'\u0000\u0000\u00d3\u00d5\u0005I"+
		"\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d5\u00e3\u0001\u0000\u0000\u0000\u00d6\u00dc\u0005\b\u0000"+
		"\u0000\u00d7\u00d8\u0003\u0002\u0001\u0000\u00d8\u00d9\u0006\u0005\uffff"+
		"\uffff\u0000\u00d9\u00db\u0001\u0000\u0000\u0000\u00da\u00d7\u0001\u0000"+
		"\u0000\u0000\u00db\u00de\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000"+
		"\u0000\u0000\u00dc\u00dd\u0001\u0000\u0000\u0000\u00dd\u00df\u0001\u0000"+
		"\u0000\u0000\u00de\u00dc\u0001\u0000\u0000\u0000\u00df\u00e4\u0005\t\u0000"+
		"\u0000\u00e0\u00e1\u0003\u0002\u0001\u0000\u00e1\u00e2\u0006\u0005\uffff"+
		"\uffff\u0000\u00e2\u00e4\u0001\u0000\u0000\u0000\u00e3\u00d6\u0001\u0000"+
		"\u0000\u0000\u00e3\u00e0\u0001\u0000\u0000\u0000\u00e4\u000b\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0006\u0006\uffff\uffff\u0000\u00e6\u00e7\u0005"+
		"7\u0000\u0000\u00e7\u00e8\u00052\u0000\u0000\u00e8\u00e9\u0005\u0006\u0000"+
		"\u0000\u00e9\u00ea\u0005F\u0000\u0000\u00ea\u00eb\u0003\u001c\u000e\u0000"+
		"\u00eb\u00ec\u0006\u0006\uffff\uffff\u0000\u00ec\u00ef\u0005\u0007\u0000"+
		"\u0000\u00ed\u00ee\u0005\'\u0000\u0000\u00ee\u00f0\u0005I\u0000\u0000"+
		"\u00ef\u00ed\u0001\u0000\u0000\u0000\u00ef\u00f0\u0001\u0000\u0000\u0000"+
		"\u00f0\u00fe\u0001\u0000\u0000\u0000\u00f1\u00f7\u0005\b\u0000\u0000\u00f2"+
		"\u00f3\u0003\u0002\u0001\u0000\u00f3\u00f4\u0006\u0006\uffff\uffff\u0000"+
		"\u00f4\u00f6\u0001\u0000\u0000\u0000\u00f5\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f6\u00f9\u0001\u0000\u0000\u0000\u00f7\u00f5\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00fa\u0001\u0000\u0000\u0000"+
		"\u00f9\u00f7\u0001\u0000\u0000\u0000\u00fa\u00ff\u0005\t\u0000\u0000\u00fb"+
		"\u00fc\u0003\u0002\u0001\u0000\u00fc\u00fd\u0006\u0006\uffff\uffff\u0000"+
		"\u00fd\u00ff\u0001\u0000\u0000\u0000\u00fe\u00f1\u0001\u0000\u0000\u0000"+
		"\u00fe\u00fb\u0001\u0000\u0000\u0000\u00ff\r\u0001\u0000\u0000\u0000\u0100"+
		"\u0101\u00055\u0000\u0000\u0101\u010d\u0006\u0007\uffff\uffff\u0000\u0102"+
		"\u0103\u00053\u0000\u0000\u0103\u010d\u0006\u0007\uffff\uffff\u0000\u0104"+
		"\u0105\u00054\u0000\u0000\u0105\u010d\u0006\u0007\uffff\uffff\u0000\u0106"+
		"\u0107\u00058\u0000\u0000\u0107\u010d\u0006\u0007\uffff\uffff\u0000\u0108"+
		"\u0109\u00057\u0000\u0000\u0109\u010d\u0006\u0007\uffff\uffff\u0000\u010a"+
		"\u010b\u00056\u0000\u0000\u010b\u010d\u0006\u0007\uffff\uffff\u0000\u010c"+
		"\u0100\u0001\u0000\u0000\u0000\u010c\u0102\u0001\u0000\u0000\u0000\u010c"+
		"\u0104\u0001\u0000\u0000\u0000\u010c\u0106\u0001\u0000\u0000\u0000\u010c"+
		"\u0108\u0001\u0000\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d"+
		"\u000f\u0001\u0000\u0000\u0000\u010e\u010f\u0005F\u0000\u0000\u010f\u0117"+
		"\u0006\b\uffff\uffff\u0000\u0110\u0111\u0005G\u0000\u0000\u0111\u0117"+
		"\u0006\b\uffff\uffff\u0000\u0112\u0113\u0005I\u0000\u0000\u0113\u0117"+
		"\u0006\b\uffff\uffff\u0000\u0114\u0115\u0005H\u0000\u0000\u0115\u0117"+
		"\u0006\b\uffff\uffff\u0000\u0116\u010e\u0001\u0000\u0000\u0000\u0116\u0110"+
		"\u0001\u0000\u0000\u0000\u0116\u0112\u0001\u0000\u0000\u0000\u0116\u0114"+
		"\u0001\u0000\u0000\u0000\u0117\u0011\u0001\u0000\u0000\u0000\u0118\u0119"+
		"\u0003\u000e\u0007\u0000\u0119\u011a\u0006\t\uffff\uffff\u0000\u011a\u011f"+
		"\u0001\u0000\u0000\u0000\u011b\u011c\u0003\u0010\b\u0000\u011c\u011d\u0006"+
		"\t\uffff\uffff\u0000\u011d\u011f\u0001\u0000\u0000\u0000\u011e\u0118\u0001"+
		"\u0000\u0000\u0000\u011e\u011b\u0001\u0000\u0000\u0000\u011f\u0013\u0001"+
		"\u0000\u0000\u0000\u0120\u0121\u0007\u0000\u0000\u0000\u0121\u0122\u0006"+
		"\n\uffff\uffff\u0000\u0122\u0015\u0001\u0000\u0000\u0000\u0123\u0124\u0007"+
		"\u0001\u0000\u0000\u0124\u0125\u0006\u000b\uffff\uffff\u0000\u0125\u0017"+
		"\u0001\u0000\u0000\u0000\u0126\u0127\u0007\u0002\u0000\u0000\u0127\u0128"+
		"\u0006\f\uffff\uffff\u0000\u0128\u0019\u0001\u0000\u0000\u0000\u0129\u012a"+
		"\u0007\u0003\u0000\u0000\u012a\u001b\u0001\u0000\u0000\u0000\u012b\u012c"+
		"\u0005P\u0000\u0000\u012c\u012d\u0006\u000e\uffff\uffff\u0000\u012d\u001d"+
		"\u0001\u0000\u0000\u0000\u012e\u012f\u0006\u000f\uffff\uffff\u0000\u012f"+
		"\u0130\u0003\u001c\u000e\u0000\u0130\u0136\u0006\u000f\uffff\uffff\u0000"+
		"\u0131\u0132\u0005\n\u0000\u0000\u0132\u0133\u0003 \u0010\u0000\u0133"+
		"\u0134\u0006\u000f\uffff\uffff\u0000\u0134\u0135\u0005\u000b\u0000\u0000"+
		"\u0135\u0137\u0001\u0000\u0000\u0000\u0136\u0131\u0001\u0000\u0000\u0000"+
		"\u0136\u0137\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000"+
		"\u0138\u0139\u0005\u0005\u0000\u0000\u0139\u013a\u0003\u0018\f\u0000\u013a"+
		"\u013b\u0006\u000f\uffff\uffff\u0000\u013b\u0147\u0005\u0006\u0000\u0000"+
		"\u013c\u013d\u0003 \u0010\u0000\u013d\u0144\u0006\u000f\uffff\uffff\u0000"+
		"\u013e\u013f\u0005\u0003\u0000\u0000\u013f\u0140\u0003 \u0010\u0000\u0140"+
		"\u0141\u0006\u000f\uffff\uffff\u0000\u0141\u0143\u0001\u0000\u0000\u0000"+
		"\u0142\u013e\u0001\u0000\u0000\u0000\u0143\u0146\u0001\u0000\u0000\u0000"+
		"\u0144\u0142\u0001\u0000\u0000\u0000\u0144\u0145\u0001\u0000\u0000\u0000"+
		"\u0145\u0148\u0001\u0000\u0000\u0000\u0146\u0144\u0001\u0000\u0000\u0000"+
		"\u0147\u013c\u0001\u0000\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000"+
		"\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014a\u0005\u0007\u0000\u0000"+
		"\u014a\u001f\u0001\u0000\u0000\u0000\u014b\u014c\u0006\u0010\uffff\uffff"+
		"\u0000\u014c\u014d\u0003\"\u0011\u0000\u014d\u014e\u0006\u0010\uffff\uffff"+
		"\u0000\u014e\u0175\u0001\u0000\u0000\u0000\u014f\u015a\u0006\u0010\uffff"+
		"\uffff\u0000\u0150\u0151\u0005\u0013\u0000\u0000\u0151\u015b\u0006\u0010"+
		"\uffff\uffff\u0000\u0152\u0153\u0005\r\u0000\u0000\u0153\u015b\u0006\u0010"+
		"\uffff\uffff\u0000\u0154\u0155\u0005\u0019\u0000\u0000\u0155\u015b\u0006"+
		"\u0010\uffff\uffff\u0000\u0156\u0157\u0005\u001f\u0000\u0000\u0157\u015b"+
		"\u0006\u0010\uffff\uffff\u0000\u0158\u0159\u0005\u001e\u0000\u0000\u0159"+
		"\u015b\u0006\u0010\uffff\uffff\u0000\u015a\u0150\u0001\u0000\u0000\u0000"+
		"\u015a\u0152\u0001\u0000\u0000\u0000\u015a\u0154\u0001\u0000\u0000\u0000"+
		"\u015a\u0156\u0001\u0000\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000"+
		"\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u015d\u0003 \u0010\u000e\u015d"+
		"\u015e\u0006\u0010\uffff\uffff\u0000\u015e\u0175\u0001\u0000\u0000\u0000"+
		"\u015f\u0160\u0005P\u0000\u0000\u0160\u0161\u0005\n\u0000\u0000\u0161"+
		"\u0162\u0003 \u0010\u0000\u0162\u0163\u0005\u000b\u0000\u0000\u0163\u0164"+
		"\u0001\u0000\u0000\u0000\u0164\u0165\u0006\u0010\uffff\uffff\u0000\u0165"+
		"\u0166\u0006\u0010\uffff\uffff\u0000\u0166\u0175\u0001\u0000\u0000\u0000"+
		"\u0167\u0168\u0005P\u0000\u0000\u0168\u0175\u0006\u0010\uffff\uffff\u0000"+
		"\u0169\u016a\u0005\u0006\u0000\u0000\u016a\u016b\u0003 \u0010\u0000\u016b"+
		"\u016c\u0005\u0007\u0000\u0000\u016c\u016d\u0006\u0010\uffff\uffff\u0000"+
		"\u016d\u0175\u0001\u0000\u0000\u0000\u016e\u016f\u00034\u001a\u0000\u016f"+
		"\u0170\u0006\u0010\uffff\uffff\u0000\u0170\u0175\u0001\u0000\u0000\u0000"+
		"\u0171\u0172\u0003\u001e\u000f\u0000\u0172\u0173\u0006\u0010\uffff\uffff"+
		"\u0000\u0173\u0175\u0001\u0000\u0000\u0000\u0174\u014b\u0001\u0000\u0000"+
		"\u0000\u0174\u014f\u0001\u0000\u0000\u0000\u0174\u015f\u0001\u0000\u0000"+
		"\u0000\u0174\u0167\u0001\u0000\u0000\u0000\u0174\u0169\u0001\u0000\u0000"+
		"\u0000\u0174\u016e\u0001\u0000\u0000\u0000\u0174\u0171\u0001\u0000\u0000"+
		"\u0000\u0175\u01d6\u0001\u0000\u0000\u0000\u0176\u0177\n\r\u0000\u0000"+
		"\u0177\u017e\u0006\u0010\uffff\uffff\u0000\u0178\u0179\u0005\u000e\u0000"+
		"\u0000\u0179\u017f\u0006\u0010\uffff\uffff\u0000\u017a\u017b\u0005\u000f"+
		"\u0000\u0000\u017b\u017f\u0006\u0010\uffff\uffff\u0000\u017c\u017d\u0005"+
		"\u0010\u0000\u0000\u017d\u017f\u0006\u0010\uffff\uffff\u0000\u017e\u0178"+
		"\u0001\u0000\u0000\u0000\u017e\u017a\u0001\u0000\u0000\u0000\u017e\u017c"+
		"\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u0181"+
		"\u0003 \u0010\u000e\u0181\u0182\u0006\u0010\uffff\uffff\u0000\u0182\u01d5"+
		"\u0001\u0000\u0000\u0000\u0183\u0184\n\f\u0000\u0000\u0184\u0189\u0006"+
		"\u0010\uffff\uffff\u0000\u0185\u0186\u0005\f\u0000\u0000\u0186\u018a\u0006"+
		"\u0010\uffff\uffff\u0000\u0187\u0188\u0005\r\u0000\u0000\u0188\u018a\u0006"+
		"\u0010\uffff\uffff\u0000\u0189\u0185\u0001\u0000\u0000\u0000\u0189\u0187"+
		"\u0001\u0000\u0000\u0000\u018a\u018b\u0001\u0000\u0000\u0000\u018b\u018c"+
		"\u0003 \u0010\r\u018c\u018d\u0006\u0010\uffff\uffff\u0000\u018d\u01d5"+
		"\u0001\u0000\u0000\u0000\u018e\u018f\n\u000b\u0000\u0000\u018f\u0194\u0006"+
		"\u0010\uffff\uffff\u0000\u0190\u0191\u0005\u0017\u0000\u0000\u0191\u0195"+
		"\u0006\u0010\uffff\uffff\u0000\u0192\u0193\u0005\u0018\u0000\u0000\u0193"+
		"\u0195\u0006\u0010\uffff\uffff\u0000\u0194\u0190\u0001\u0000\u0000\u0000"+
		"\u0194\u0192\u0001\u0000\u0000\u0000\u0195\u0196\u0001\u0000\u0000\u0000"+
		"\u0196\u0197\u0003 \u0010\f\u0197\u0198\u0006\u0010\uffff\uffff\u0000"+
		"\u0198\u01d5\u0001\u0000\u0000\u0000\u0199\u019a\n\n\u0000\u0000\u019a"+
		"\u019f\u0006\u0010\uffff\uffff\u0000\u019b\u019c\u0005\u001a\u0000\u0000"+
		"\u019c\u01a0\u0006\u0010\uffff\uffff\u0000\u019d\u019e\u0005\u001b\u0000"+
		"\u0000\u019e\u01a0\u0006\u0010\uffff\uffff\u0000\u019f\u019b\u0001\u0000"+
		"\u0000\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u01a0\u01a1\u0001\u0000"+
		"\u0000\u0000\u01a1\u01a2\u0003 \u0010\u000b\u01a2\u01a3\u0006\u0010\uffff"+
		"\uffff\u0000\u01a3\u01d5\u0001\u0000\u0000\u0000\u01a4\u01a5\n\t\u0000"+
		"\u0000\u01a5\u01aa\u0006\u0010\uffff\uffff\u0000\u01a6\u01a7\u0005\u001c"+
		"\u0000\u0000\u01a7\u01ab\u0006\u0010\uffff\uffff\u0000\u01a8\u01a9\u0005"+
		"\u001d\u0000\u0000\u01a9\u01ab\u0006\u0010\uffff\uffff\u0000\u01aa\u01a6"+
		"\u0001\u0000\u0000\u0000\u01aa\u01a8\u0001\u0000\u0000\u0000\u01ab\u01ac"+
		"\u0001\u0000\u0000\u0000\u01ac\u01ad\u0003 \u0010\n\u01ad\u01ae\u0006"+
		"\u0010\uffff\uffff\u0000\u01ae\u01d5\u0001\u0000\u0000\u0000\u01af\u01b0"+
		"\n\b\u0000\u0000\u01b0\u01b7\u0006\u0010\uffff\uffff\u0000\u01b1\u01b2"+
		"\u0005\u0014\u0000\u0000\u01b2\u01b8\u0006\u0010\uffff\uffff\u0000\u01b3"+
		"\u01b4\u0005\u0015\u0000\u0000\u01b4\u01b8\u0006\u0010\uffff\uffff\u0000"+
		"\u01b5\u01b6\u0005\u0016\u0000\u0000\u01b6\u01b8\u0006\u0010\uffff\uffff"+
		"\u0000\u01b7\u01b1\u0001\u0000\u0000\u0000\u01b7\u01b3\u0001\u0000\u0000"+
		"\u0000\u01b7\u01b5\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001\u0000\u0000"+
		"\u0000\u01b9\u01ba\u0003 \u0010\t\u01ba\u01bb\u0006\u0010\uffff\uffff"+
		"\u0000\u01bb\u01d5\u0001\u0000\u0000\u0000\u01bc\u01bd\n\u0007\u0000\u0000"+
		"\u01bd\u01be\u0005\u0011\u0000\u0000\u01be\u01bf\u0003 \u0010\b\u01bf"+
		"\u01c0\u0006\u0010\uffff\uffff\u0000\u01c0\u01d5\u0001\u0000\u0000\u0000"+
		"\u01c1\u01c2\n\u0006\u0000\u0000\u01c2\u01c3\u0005\u0012\u0000\u0000\u01c3"+
		"\u01c4\u0003 \u0010\u0007\u01c4\u01c5\u0006\u0010\uffff\uffff\u0000\u01c5"+
		"\u01d5\u0001\u0000\u0000\u0000\u01c6\u01c7\n\u0010\u0000\u0000\u01c7\u01c8"+
		"\u0005\u0005\u0000\u0000\u01c8\u01c9\u0003\u0016\u000b\u0000\u01c9\u01ca"+
		"\u0006\u0010\uffff\uffff\u0000\u01ca\u01d5\u0001\u0000\u0000\u0000\u01cb"+
		"\u01cc\n\u000f\u0000\u0000\u01cc\u01d1\u0006\u0010\uffff\uffff\u0000\u01cd"+
		"\u01ce\u0005\u001f\u0000\u0000\u01ce\u01d2\u0006\u0010\uffff\uffff\u0000"+
		"\u01cf\u01d0\u0005\u001e\u0000\u0000\u01d0\u01d2\u0006\u0010\uffff\uffff"+
		"\u0000\u01d1\u01cd\u0001\u0000\u0000\u0000\u01d1\u01cf\u0001\u0000\u0000"+
		"\u0000\u01d2\u01d3\u0001\u0000\u0000\u0000\u01d3\u01d5\u0006\u0010\uffff"+
		"\uffff\u0000\u01d4\u0176\u0001\u0000\u0000\u0000\u01d4\u0183\u0001\u0000"+
		"\u0000\u0000\u01d4\u018e\u0001\u0000\u0000\u0000\u01d4\u0199\u0001\u0000"+
		"\u0000\u0000\u01d4\u01a4\u0001\u0000\u0000\u0000\u01d4\u01af\u0001\u0000"+
		"\u0000\u0000\u01d4\u01bc\u0001\u0000\u0000\u0000\u01d4\u01c1\u0001\u0000"+
		"\u0000\u0000\u01d4\u01c6\u0001\u0000\u0000\u0000\u01d4\u01cb\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d8\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000"+
		"\u0000\u0000\u01d6\u01d7\u0001\u0000\u0000\u0000\u01d7!\u0001\u0000\u0000"+
		"\u0000\u01d8\u01d6\u0001\u0000\u0000\u0000\u01d9\u01da\u0005Q\u0000\u0000"+
		"\u01da\u01e4\u0006\u0011\uffff\uffff\u0000\u01db\u01dc\u0005S\u0000\u0000"+
		"\u01dc\u01e4\u0006\u0011\uffff\uffff\u0000\u01dd\u01de\u0005R\u0000\u0000"+
		"\u01de\u01e4\u0006\u0011\uffff\uffff\u0000\u01df\u01e0\u00059\u0000\u0000"+
		"\u01e0\u01e4\u0006\u0011\uffff\uffff\u0000\u01e1\u01e2\u0005:\u0000\u0000"+
		"\u01e2\u01e4\u0006\u0011\uffff\uffff\u0000\u01e3\u01d9\u0001\u0000\u0000"+
		"\u0000\u01e3\u01db\u0001\u0000\u0000\u0000\u01e3\u01dd\u0001\u0000\u0000"+
		"\u0000\u01e3\u01df\u0001\u0000\u0000\u0000\u01e3\u01e1\u0001\u0000\u0000"+
		"\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e6\u0006\u0011\uffff"+
		"\uffff\u0000\u01e6#\u0001\u0000\u0000\u0000\u01e7\u01e8\u0006\u0012\uffff"+
		"\uffff\u0000\u01e8\u01e9\u0003 \u0010\u0000\u01e9\u01ea\u0006\u0012\uffff"+
		"\uffff\u0000\u01ea\u01eb\u0003\u001a\r\u0000\u01eb\u01ec\u0003 \u0010"+
		"\u0000\u01ec\u01ed\u0006\u0012\uffff\uffff\u0000\u01ed\u01ee\u0005\u0002"+
		"\u0000\u0000\u01ee%\u0001\u0000\u0000\u0000\u01ef\u01f0\u0006\u0013\uffff"+
		"\uffff\u0000\u01f0\u01f1\u0005)\u0000\u0000\u01f1\u01f2\u0005\u0006\u0000"+
		"\u0000\u01f2\u01f3\u0003 \u0010\u0000\u01f3\u01f4\u0006\u0013\uffff\uffff"+
		"\u0000\u01f4\u0202\u0005\u0007\u0000\u0000\u01f5\u01fb\u0005\b\u0000\u0000"+
		"\u01f6\u01f7\u0003\u0002\u0001\u0000\u01f7\u01f8\u0006\u0013\uffff\uffff"+
		"\u0000\u01f8\u01fa\u0001\u0000\u0000\u0000\u01f9\u01f6\u0001\u0000\u0000"+
		"\u0000\u01fa\u01fd\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000"+
		"\u0000\u01fb\u01fc\u0001\u0000\u0000\u0000\u01fc\u01fe\u0001\u0000\u0000"+
		"\u0000\u01fd\u01fb\u0001\u0000\u0000\u0000\u01fe\u0203\u0005\t\u0000\u0000"+
		"\u01ff\u0200\u0003\u0002\u0001\u0000\u0200\u0201\u0006\u0013\uffff\uffff"+
		"\u0000\u0201\u0203\u0001\u0000\u0000\u0000\u0202\u01f5\u0001\u0000\u0000"+
		"\u0000\u0202\u01ff\u0001\u0000\u0000\u0000\u0203\u0214\u0001\u0000\u0000"+
		"\u0000\u0204\u0212\u0005*\u0000\u0000\u0205\u020b\u0005\b\u0000\u0000"+
		"\u0206\u0207\u0003\u0002\u0001\u0000\u0207\u0208\u0006\u0013\uffff\uffff"+
		"\u0000\u0208\u020a\u0001\u0000\u0000\u0000\u0209\u0206\u0001\u0000\u0000"+
		"\u0000\u020a\u020d\u0001\u0000\u0000\u0000\u020b\u0209\u0001\u0000\u0000"+
		"\u0000\u020b\u020c\u0001\u0000\u0000\u0000\u020c\u020e\u0001\u0000\u0000"+
		"\u0000\u020d\u020b\u0001\u0000\u0000\u0000\u020e\u0213\u0005\t\u0000\u0000"+
		"\u020f\u0210\u0003\u0002\u0001\u0000\u0210\u0211\u0006\u0013\uffff\uffff"+
		"\u0000\u0211\u0213\u0001\u0000\u0000\u0000\u0212\u0205\u0001\u0000\u0000"+
		"\u0000\u0212\u020f\u0001\u0000\u0000\u0000\u0213\u0215\u0001\u0000\u0000"+
		"\u0000\u0214\u0204\u0001\u0000\u0000\u0000\u0214\u0215\u0001\u0000\u0000"+
		"\u0000\u0215\'\u0001\u0000\u0000\u0000\u0216\u0217\u0006\u0014\uffff\uffff"+
		"\u0000\u0217\u0218\u0005,\u0000\u0000\u0218\u0219\u0005\u0006\u0000\u0000"+
		"\u0219\u021a\u0003 \u0010\u0000\u021a\u021b\u0006\u0014\uffff\uffff\u0000"+
		"\u021b\u0229\u0005\u0007\u0000\u0000\u021c\u0222\u0005\b\u0000\u0000\u021d"+
		"\u021e\u0003\u0002\u0001\u0000\u021e\u021f\u0006\u0014\uffff\uffff\u0000"+
		"\u021f\u0221\u0001\u0000\u0000\u0000\u0220\u021d\u0001\u0000\u0000\u0000"+
		"\u0221\u0224\u0001\u0000\u0000\u0000\u0222\u0220\u0001\u0000\u0000\u0000"+
		"\u0222\u0223\u0001\u0000\u0000\u0000\u0223\u0225\u0001\u0000\u0000\u0000"+
		"\u0224\u0222\u0001\u0000\u0000\u0000\u0225\u022a\u0005\t\u0000\u0000\u0226"+
		"\u0227\u0003\u0002\u0001\u0000\u0227\u0228\u0006\u0014\uffff\uffff\u0000"+
		"\u0228\u022a\u0001\u0000\u0000\u0000\u0229\u021c\u0001\u0000\u0000\u0000"+
		"\u0229\u0226\u0001\u0000\u0000\u0000\u022a)\u0001\u0000\u0000\u0000\u022b"+
		"\u022c\u0006\u0015\uffff\uffff\u0000\u022c\u022d\u0005+\u0000\u0000\u022d"+
		"\u022e\u0005\u0006\u0000\u0000\u022e\u022f\u0006\u0015\uffff\uffff\u0000"+
		"\u022f\u0230\u0003\u0002\u0001\u0000\u0230\u0231\u0006\u0015\uffff\uffff"+
		"\u0000\u0231\u0232\u0003 \u0010\u0000\u0232\u0233\u0006\u0015\uffff\uffff"+
		"\u0000\u0233\u0237\u0005\u0002\u0000\u0000\u0234\u0235\u0003 \u0010\u0000"+
		"\u0235\u0236\u0006\u0015\uffff\uffff\u0000\u0236\u0238\u0001\u0000\u0000"+
		"\u0000\u0237\u0234\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000\u0000"+
		"\u0000\u0238\u0239\u0001\u0000\u0000\u0000\u0239\u0247\u0005\u0007\u0000"+
		"\u0000\u023a\u0240\u0005\b\u0000\u0000\u023b\u023c\u0003\u0002\u0001\u0000"+
		"\u023c\u023d\u0006\u0015\uffff\uffff\u0000\u023d\u023f\u0001\u0000\u0000"+
		"\u0000\u023e\u023b\u0001\u0000\u0000\u0000\u023f\u0242\u0001\u0000\u0000"+
		"\u0000\u0240\u023e\u0001\u0000\u0000\u0000\u0240\u0241\u0001\u0000\u0000"+
		"\u0000\u0241\u0243\u0001\u0000\u0000\u0000\u0242\u0240\u0001\u0000\u0000"+
		"\u0000\u0243\u0248\u0005\t\u0000\u0000\u0244\u0245\u0003\u0002\u0001\u0000"+
		"\u0245\u0246\u0006\u0015\uffff\uffff\u0000\u0246\u0248\u0001\u0000\u0000"+
		"\u0000\u0247\u023a\u0001\u0000\u0000\u0000\u0247\u0244\u0001\u0000\u0000"+
		"\u0000\u0248+\u0001\u0000\u0000\u0000\u0249\u024a\u0006\u0016\uffff\uffff"+
		"\u0000\u024a\u024b\u0005&\u0000\u0000\u024b\u0259\u0006\u0016\uffff\uffff"+
		"\u0000\u024c\u0252\u0005\b\u0000\u0000\u024d\u024e\u0003\u0002\u0001\u0000"+
		"\u024e\u024f\u0006\u0016\uffff\uffff\u0000\u024f\u0251\u0001\u0000\u0000"+
		"\u0000\u0250\u024d\u0001\u0000\u0000\u0000\u0251\u0254\u0001\u0000\u0000"+
		"\u0000\u0252\u0250\u0001\u0000\u0000\u0000\u0252\u0253\u0001\u0000\u0000"+
		"\u0000\u0253\u0255\u0001\u0000\u0000\u0000\u0254\u0252\u0001\u0000\u0000"+
		"\u0000\u0255\u025a\u0005\t\u0000\u0000\u0256\u0257\u0003\u0002\u0001\u0000"+
		"\u0257\u0258\u0006\u0016\uffff\uffff\u0000\u0258\u025a\u0001\u0000\u0000"+
		"\u0000\u0259\u024c\u0001\u0000\u0000\u0000\u0259\u0256\u0001\u0000\u0000"+
		"\u0000\u025a\u026e\u0001\u0000\u0000\u0000\u025b\u025c\u0005(\u0000\u0000"+
		"\u025c\u025d\u0005I\u0000\u0000\u025d\u025e\u0003\u001c\u000e\u0000\u025e"+
		"\u026c\u0006\u0016\uffff\uffff\u0000\u025f\u0265\u0005\b\u0000\u0000\u0260"+
		"\u0261\u0003\u0002\u0001\u0000\u0261\u0262\u0006\u0016\uffff\uffff\u0000"+
		"\u0262\u0264\u0001\u0000\u0000\u0000\u0263\u0260\u0001\u0000\u0000\u0000"+
		"\u0264\u0267\u0001\u0000\u0000\u0000\u0265\u0263\u0001\u0000\u0000\u0000"+
		"\u0265\u0266\u0001\u0000\u0000\u0000\u0266\u0268\u0001\u0000\u0000\u0000"+
		"\u0267\u0265\u0001\u0000\u0000\u0000\u0268\u026d\u0005\t\u0000\u0000\u0269"+
		"\u026a\u0003\u0002\u0001\u0000\u026a\u026b\u0006\u0016\uffff\uffff\u0000"+
		"\u026b\u026d\u0001\u0000\u0000\u0000\u026c\u025f\u0001\u0000\u0000\u0000"+
		"\u026c\u0269\u0001\u0000\u0000\u0000\u026d\u026f\u0001\u0000\u0000\u0000"+
		"\u026e\u025b\u0001\u0000\u0000\u0000\u026e\u026f\u0001\u0000\u0000\u0000"+
		"\u026f-\u0001\u0000\u0000\u0000\u0270\u0271\u0006\u0017\uffff\uffff\u0000"+
		"\u0271\u0272\u0007\u0004\u0000\u0000\u0272\u0273\u0006\u0017\uffff\uffff"+
		"\u0000\u0273\u0274\u0005\u0002\u0000\u0000\u0274/\u0001\u0000\u0000\u0000"+
		"\u0275\u0276\u0006\u0018\uffff\uffff\u0000\u0276\u0277\u0005/\u0000\u0000"+
		"\u0277\u0278\u0006\u0018\uffff\uffff\u0000\u0278\u0279\u0003 \u0010\u0000"+
		"\u0279\u027a\u0006\u0018\uffff\uffff\u0000\u027a\u027b\u0005\u0002\u0000"+
		"\u0000\u027b1\u0001\u0000\u0000\u0000\u027c\u027d\u0006\u0019\uffff\uffff"+
		"\u0000\u027d\u027e\u0005\'\u0000\u0000\u027e\u027f\u0006\u0019\uffff\uffff"+
		"\u0000\u027f\u0280\u0003 \u0010\u0000\u0280\u0281\u0006\u0019\uffff\uffff"+
		"\u0000\u0281\u0282\u0005\u0002\u0000\u0000\u02823\u0001\u0000\u0000\u0000"+
		"\u0283\u028c\u0006\u001a\uffff\uffff\u0000\u0284\u0285\u0003\u0014\n\u0000"+
		"\u0285\u0286\u0006\u001a\uffff\uffff\u0000\u0286\u028d\u0001\u0000\u0000"+
		"\u0000\u0287\u0288\u0007\u0005\u0000\u0000\u0288\u028d\u0006\u001a\uffff"+
		"\uffff\u0000\u0289\u028a\u0003\u001c\u000e\u0000\u028a\u028b\u0006\u001a"+
		"\uffff\uffff\u0000\u028b\u028d\u0001\u0000\u0000\u0000\u028c\u0284\u0001"+
		"\u0000\u0000\u0000\u028c\u0287\u0001\u0000\u0000\u0000\u028c\u0289\u0001"+
		"\u0000\u0000\u0000\u028d\u028e\u0001\u0000\u0000\u0000\u028e\u028f\u0006"+
		"\u001a\uffff\uffff\u0000\u028f\u0290\u0001\u0000\u0000\u0000\u0290\u029c"+
		"\u0005\u0006\u0000\u0000\u0291\u0292\u0003 \u0010\u0000\u0292\u0299\u0006"+
		"\u001a\uffff\uffff\u0000\u0293\u0294\u0005\u0003\u0000\u0000\u0294\u0295"+
		"\u0003 \u0010\u0000\u0295\u0296\u0006\u001a\uffff\uffff\u0000\u0296\u0298"+
		"\u0001\u0000\u0000\u0000\u0297\u0293\u0001\u0000\u0000\u0000\u0298\u029b"+
		"\u0001\u0000\u0000\u0000\u0299\u0297\u0001\u0000\u0000\u0000\u0299\u029a"+
		"\u0001\u0000\u0000\u0000\u029a\u029d\u0001\u0000\u0000\u0000\u029b\u0299"+
		"\u0001\u0000\u0000\u0000\u029c\u0291\u0001\u0000\u0000\u0000\u029c\u029d"+
		"\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000\u0000\u029e\u029f"+
		"\u0005\u0007\u0000\u0000\u029f5\u0001\u0000\u0000\u0000\u02a0\u02a1\u0006"+
		"\u001b\uffff\uffff\u0000\u02a1\u02a2\u0003\u0012\t\u0000\u02a2\u02a7\u0006"+
		"\u001b\uffff\uffff\u0000\u02a3\u02a4\u0005\n\u0000\u0000\u02a4\u02a5\u0005"+
		"Q\u0000\u0000\u02a5\u02a6\u0005\u000b\u0000\u0000\u02a6\u02a8\u0006\u001b"+
		"\uffff\uffff\u0000\u02a7\u02a3\u0001\u0000\u0000\u0000\u02a7\u02a8\u0001"+
		"\u0000\u0000\u0000\u02a8\u02af\u0001\u0000\u0000\u0000\u02a9\u02aa\u0003"+
		"\u001c\u000e\u0000\u02aa\u02ab\u0006\u001b\uffff\uffff\u0000\u02ab\u02b0"+
		"\u0001\u0000\u0000\u0000\u02ac\u02ad\u0003\u0016\u000b\u0000\u02ad\u02ae"+
		"\u0006\u001b\uffff\uffff\u0000\u02ae\u02b0\u0001\u0000\u0000\u0000\u02af"+
		"\u02a9\u0001\u0000\u0000\u0000\u02af\u02ac\u0001\u0000\u0000\u0000\u02b0"+
		"\u02b1\u0001\u0000\u0000\u0000\u02b1\u02b2\u0006\u001b\uffff\uffff\u0000"+
		"\u02b2\u02b7\u0001\u0000\u0000\u0000\u02b3\u02b4\u0005 \u0000\u0000\u02b4"+
		"\u02b5\u0003 \u0010\u0000\u02b5\u02b6\u0006\u001b\uffff\uffff\u0000\u02b6"+
		"\u02b8\u0001\u0000\u0000\u0000\u02b7\u02b3\u0001\u0000\u0000\u0000\u02b7"+
		"\u02b8\u0001\u0000\u0000\u0000\u02b87\u0001\u0000\u0000\u0000:FHq|\u0084"+
		"\u008c\u009c\u009f\u00a4\u00ac\u00b3\u00c1\u00c8\u00d4\u00dc\u00e3\u00ef"+
		"\u00f7\u00fe\u010c\u0116\u011e\u0136\u0144\u0147\u015a\u0174\u017e\u0189"+
		"\u0194\u019f\u01aa\u01b7\u01d1\u01d4\u01d6\u01e3\u01fb\u0202\u020b\u0212"+
		"\u0214\u0222\u0229\u0237\u0240\u0247\u0252\u0259\u0265\u026c\u026e\u028c"+
		"\u0299\u029c\u02a7\u02af\u02b7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}