package com.nanimono.simpleoddb.executor.antlr4;// Generated from OddlGrammar.g4 by ANTLR 4.7.2

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class OddlGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, AS=6, CREATE=7, CLASS=8, CROSS=9, 
		DELETE=10, DROP=11, FROM=12, INSERT=13, INTO=14, SELECT=15, SELECTDEPUTY=16, 
		VALUES=17, WHERE=18, BOOLEAN=19, CHAR=20, INT=21, LONG=22, FLOAT=23, TRUE=24, 
		FALSE=25, AND=26, OR=27, NOT=28, DOT=29, LR_BRACKET=30, RR_BRACKET=31, 
		COMMA=32, SEMI=33, EQUAL_SYMBOL=34, GREATER_SYMBOL=35, LESS_SYMBOL=36, 
		SPACE=37, DECIMAL=38, REAL=39, STRING=40, ID=41;
	public static final int
		RULE_root = 0, RULE_oddlStatements = 1, RULE_oddlStatement = 2, RULE_createSourceClass = 3, 
		RULE_createDefinitions = 4, RULE_createDefinition = 5, RULE_createDeputyClass = 6, 
		RULE_dropClass = 7, RULE_insertIntoClass = 8, RULE_valueList = 9, RULE_value = 10, 
		RULE_deleteFromClass = 11, RULE_simpleQuery = 12, RULE_crossClassQuery = 13, 
		RULE_expression = 14, RULE_emptyStatement = 15, RULE_sClassName = 16, 
		RULE_sAttr = 17, RULE_dAttr = 18, RULE_className = 19, RULE_attrName = 20, 
		RULE_attrList = 21, RULE_dataType = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "oddlStatements", "oddlStatement", "createSourceClass", "createDefinitions", 
			"createDefinition", "createDeputyClass", "dropClass", "insertIntoClass", 
			"valueList", "value", "deleteFromClass", "simpleQuery", "crossClassQuery", 
			"expression", "emptyStatement", "sClassName", "sAttr", "dAttr", "className", 
			"attrName", "attrList", "dataType"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'<='", "'>='", "'=='", "'!='", "'<>'", "'AS'", "'CREATE'", "'CLASS'", 
			"'CROSS'", "'DELETE'", "'DROP'", "'FROM'", "'INSERT'", "'INTO'", "'SELECT'", 
			"'SELECTDEPUTY'", "'VALUES'", "'WHERE'", "'BOOLEAN'", "'CHAR'", "'INT'", 
			"'LONG'", "'FLOAT'", "'TRUE'", "'FALSE'", "'AND'", "'OR'", "'NOT'", "'.'", 
			"'('", "')'", "','", "';'", "'='", "'>'", "'<'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "AS", "CREATE", "CLASS", "CROSS", 
			"DELETE", "DROP", "FROM", "INSERT", "INTO", "SELECT", "SELECTDEPUTY", 
			"VALUES", "WHERE", "BOOLEAN", "CHAR", "INT", "LONG", "FLOAT", "TRUE", 
			"FALSE", "AND", "OR", "NOT", "DOT", "LR_BRACKET", "RR_BRACKET", "COMMA", 
			"SEMI", "EQUAL_SYMBOL", "GREATER_SYMBOL", "LESS_SYMBOL", "SPACE", "DECIMAL", 
			"REAL", "STRING", "ID"
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
	public String getGrammarFileName() { return "OddlGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public OddlGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(OddlGrammarParser.EOF, 0); }
		public OddlStatementsContext oddlStatements() {
			return getRuleContext(OddlStatementsContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << DELETE) | (1L << DROP) | (1L << INSERT) | (1L << SELECT) | (1L << SEMI))) != 0)) {
				{
				setState(46);
				oddlStatements();
				}
			}

			setState(49);
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

	public static class OddlStatementsContext extends ParserRuleContext {
		public List<OddlStatementContext> oddlStatement() {
			return getRuleContexts(OddlStatementContext.class);
		}
		public OddlStatementContext oddlStatement(int i) {
			return getRuleContext(OddlStatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(OddlGrammarParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(OddlGrammarParser.SEMI, i);
		}
		public List<EmptyStatementContext> emptyStatement() {
			return getRuleContexts(EmptyStatementContext.class);
		}
		public EmptyStatementContext emptyStatement(int i) {
			return getRuleContext(EmptyStatementContext.class,i);
		}
		public OddlStatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oddlStatements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).enterOddlStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).exitOddlStatements(this);
		}
	}

	public final OddlStatementsContext oddlStatements() throws RecognitionException {
		OddlStatementsContext _localctx = new OddlStatementsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_oddlStatements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(55);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CREATE:
				case DELETE:
				case DROP:
				case INSERT:
				case SELECT:
					{
					setState(51);
					oddlStatement();
					setState(52);
					match(SEMI);
					}
					break;
				case SEMI:
					{
					setState(54);
					emptyStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CREATE) | (1L << DELETE) | (1L << DROP) | (1L << INSERT) | (1L << SELECT) | (1L << SEMI))) != 0) );
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

	public static class OddlStatementContext extends ParserRuleContext {
		public CreateSourceClassContext createSourceClass() {
			return getRuleContext(CreateSourceClassContext.class,0);
		}
		public CreateDeputyClassContext createDeputyClass() {
			return getRuleContext(CreateDeputyClassContext.class,0);
		}
		public DropClassContext dropClass() {
			return getRuleContext(DropClassContext.class,0);
		}
		public InsertIntoClassContext insertIntoClass() {
			return getRuleContext(InsertIntoClassContext.class,0);
		}
		public DeleteFromClassContext deleteFromClass() {
			return getRuleContext(DeleteFromClassContext.class,0);
		}
		public SimpleQueryContext simpleQuery() {
			return getRuleContext(SimpleQueryContext.class,0);
		}
		public CrossClassQueryContext crossClassQuery() {
			return getRuleContext(CrossClassQueryContext.class,0);
		}
		public OddlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oddlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).enterOddlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).exitOddlStatement(this);
		}
	}

	public final OddlStatementContext oddlStatement() throws RecognitionException {
		OddlStatementContext _localctx = new OddlStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_oddlStatement);
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				createSourceClass();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				createDeputyClass();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				dropClass();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				insertIntoClass();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				deleteFromClass();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				simpleQuery();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(65);
				crossClassQuery();
				}
				break;
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

	public static class CreateSourceClassContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(OddlGrammarParser.CREATE, 0); }
		public TerminalNode CLASS() { return getToken(OddlGrammarParser.CLASS, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public CreateDefinitionsContext createDefinitions() {
			return getRuleContext(CreateDefinitionsContext.class,0);
		}
		public CreateSourceClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createSourceClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).enterCreateSourceClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).exitCreateSourceClass(this);
		}
	}

	public final CreateSourceClassContext createSourceClass() throws RecognitionException {
		CreateSourceClassContext _localctx = new CreateSourceClassContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_createSourceClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(CREATE);
			setState(69);
			match(CLASS);
			setState(70);
			className();
			setState(71);
			createDefinitions();
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

	public static class CreateDefinitionsContext extends ParserRuleContext {
		public TerminalNode LR_BRACKET() { return getToken(OddlGrammarParser.LR_BRACKET, 0); }
		public List<CreateDefinitionContext> createDefinition() {
			return getRuleContexts(CreateDefinitionContext.class);
		}
		public CreateDefinitionContext createDefinition(int i) {
			return getRuleContext(CreateDefinitionContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(OddlGrammarParser.RR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(OddlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OddlGrammarParser.COMMA, i);
		}
		public CreateDefinitionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinitions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).enterCreateDefinitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).exitCreateDefinitions(this);
		}
	}

	public final CreateDefinitionsContext createDefinitions() throws RecognitionException {
		CreateDefinitionsContext _localctx = new CreateDefinitionsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_createDefinitions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(LR_BRACKET);
			setState(74);
			createDefinition();
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(75);
				match(COMMA);
				setState(76);
				createDefinition();
				}
				}
				setState(81);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(82);
			match(RR_BRACKET);
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

	public static class CreateDefinitionContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OddlGrammarParser.ID, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CreateDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).enterCreateDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).exitCreateDefinition(this);
		}
	}

	public final CreateDefinitionContext createDefinition() throws RecognitionException {
		CreateDefinitionContext _localctx = new CreateDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_createDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(ID);
			setState(85);
			dataType();
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

	public static class CreateDeputyClassContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(OddlGrammarParser.CREATE, 0); }
		public TerminalNode SELECTDEPUTY() { return getToken(OddlGrammarParser.SELECTDEPUTY, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode SELECT() { return getToken(OddlGrammarParser.SELECT, 0); }
		public List<SAttrContext> sAttr() {
			return getRuleContexts(SAttrContext.class);
		}
		public SAttrContext sAttr(int i) {
			return getRuleContext(SAttrContext.class,i);
		}
		public List<TerminalNode> AS() { return getTokens(OddlGrammarParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(OddlGrammarParser.AS, i);
		}
		public List<DAttrContext> dAttr() {
			return getRuleContexts(DAttrContext.class);
		}
		public DAttrContext dAttr(int i) {
			return getRuleContext(DAttrContext.class,i);
		}
		public TerminalNode FROM() { return getToken(OddlGrammarParser.FROM, 0); }
		public SClassNameContext sClassName() {
			return getRuleContext(SClassNameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(OddlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OddlGrammarParser.COMMA, i);
		}
		public TerminalNode WHERE() { return getToken(OddlGrammarParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CreateDeputyClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createDeputyClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).enterCreateDeputyClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).exitCreateDeputyClass(this);
		}
	}

	public final CreateDeputyClassContext createDeputyClass() throws RecognitionException {
		CreateDeputyClassContext _localctx = new CreateDeputyClassContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_createDeputyClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(CREATE);
			setState(88);
			match(SELECTDEPUTY);
			setState(89);
			className();
			setState(90);
			match(SELECT);
			setState(91);
			sAttr();
			setState(92);
			match(AS);
			setState(93);
			dAttr();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(94);
				match(COMMA);
				setState(95);
				sAttr();
				setState(96);
				match(AS);
				setState(97);
				dAttr();
				}
				}
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(104);
			match(FROM);
			setState(105);
			sClassName();
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(106);
				match(WHERE);
				setState(107);
				expression(0);
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

	public static class DropClassContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(OddlGrammarParser.DROP, 0); }
		public TerminalNode CLASS() { return getToken(OddlGrammarParser.CLASS, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public DropClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dropClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).enterDropClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).exitDropClass(this);
		}
	}

	public final DropClassContext dropClass() throws RecognitionException {
		DropClassContext _localctx = new DropClassContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dropClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(DROP);
			setState(111);
			match(CLASS);
			setState(112);
			className();
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

	public static class InsertIntoClassContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(OddlGrammarParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(OddlGrammarParser.INTO, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(OddlGrammarParser.VALUES, 0); }
		public ValueListContext valueList() {
			return getRuleContext(ValueListContext.class,0);
		}
		public InsertIntoClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertIntoClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).enterInsertIntoClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).exitInsertIntoClass(this);
		}
	}

	public final InsertIntoClassContext insertIntoClass() throws RecognitionException {
		InsertIntoClassContext _localctx = new InsertIntoClassContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_insertIntoClass);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(INSERT);
			setState(115);
			match(INTO);
			setState(116);
			className();
			setState(117);
			match(VALUES);
			setState(118);
			valueList();
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

	public static class ValueListContext extends ParserRuleContext {
		public TerminalNode LR_BRACKET() { return getToken(OddlGrammarParser.LR_BRACKET, 0); }
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(OddlGrammarParser.RR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(OddlGrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(OddlGrammarParser.COMMA, i);
		}
		public ValueListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).enterValueList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).exitValueList(this);
		}
	}

	public final ValueListContext valueList() throws RecognitionException {
		ValueListContext _localctx = new ValueListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_valueList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			match(LR_BRACKET);
			setState(121);
			value();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(122);
				match(COMMA);
				setState(123);
				value();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			match(RR_BRACKET);
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

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(OddlGrammarParser.STRING, 0); }
		public TerminalNode DECIMAL() { return getToken(OddlGrammarParser.DECIMAL, 0); }
		public TerminalNode REAL() { return getToken(OddlGrammarParser.REAL, 0); }
		public TerminalNode TRUE() { return getToken(OddlGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(OddlGrammarParser.FALSE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).exitValue(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_value);
		int _la;
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				match(STRING);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(DECIMAL);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				match(REAL);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public static class DeleteFromClassContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(OddlGrammarParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(OddlGrammarParser.FROM, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(OddlGrammarParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeleteFromClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleteFromClass; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).enterDeleteFromClass(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).exitDeleteFromClass(this);
		}
	}

	public final DeleteFromClassContext deleteFromClass() throws RecognitionException {
		DeleteFromClassContext _localctx = new DeleteFromClassContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_deleteFromClass);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(DELETE);
			setState(138);
			match(FROM);
			setState(139);
			className();
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(140);
				match(WHERE);
				setState(141);
				expression(0);
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

	public static class SimpleQueryContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(OddlGrammarParser.SELECT, 0); }
		public AttrListContext attrList() {
			return getRuleContext(AttrListContext.class,0);
		}
		public TerminalNode FROM() { return getToken(OddlGrammarParser.FROM, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(OddlGrammarParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).enterSimpleQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).exitSimpleQuery(this);
		}
	}

	public final SimpleQueryContext simpleQuery() throws RecognitionException {
		SimpleQueryContext _localctx = new SimpleQueryContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_simpleQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
			match(SELECT);
			setState(145);
			attrList();
			setState(146);
			match(FROM);
			setState(147);
			className();
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(148);
				match(WHERE);
				setState(149);
				expression(0);
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

	public static class CrossClassQueryContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(OddlGrammarParser.SELECT, 0); }
		public List<ClassNameContext> className() {
			return getRuleContexts(ClassNameContext.class);
		}
		public ClassNameContext className(int i) {
			return getRuleContext(ClassNameContext.class,i);
		}
		public TerminalNode DOT() { return getToken(OddlGrammarParser.DOT, 0); }
		public AttrNameContext attrName() {
			return getRuleContext(AttrNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(OddlGrammarParser.FROM, 0); }
		public List<TerminalNode> CROSS() { return getTokens(OddlGrammarParser.CROSS); }
		public TerminalNode CROSS(int i) {
			return getToken(OddlGrammarParser.CROSS, i);
		}
		public TerminalNode WHERE() { return getToken(OddlGrammarParser.WHERE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CrossClassQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crossClassQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).enterCrossClassQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).exitCrossClassQuery(this);
		}
	}

	public final CrossClassQueryContext crossClassQuery() throws RecognitionException {
		CrossClassQueryContext _localctx = new CrossClassQueryContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_crossClassQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(SELECT);
			setState(153);
			className();
			setState(158);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CROSS) {
				{
				{
				setState(154);
				match(CROSS);
				setState(155);
				className();
				}
				}
				setState(160);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(161);
			match(DOT);
			setState(162);
			attrName();
			setState(163);
			match(FROM);
			setState(164);
			className();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(165);
				match(WHERE);
				setState(166);
				expression(0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public Token op;
		public TerminalNode STRING() { return getToken(OddlGrammarParser.STRING, 0); }
		public TerminalNode DECIMAL() { return getToken(OddlGrammarParser.DECIMAL, 0); }
		public TerminalNode REAL() { return getToken(OddlGrammarParser.REAL, 0); }
		public TerminalNode TRUE() { return getToken(OddlGrammarParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(OddlGrammarParser.FALSE, 0); }
		public AttrNameContext attrName() {
			return getRuleContext(AttrNameContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(OddlGrammarParser.LR_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(OddlGrammarParser.RR_BRACKET, 0); }
		public TerminalNode LESS_SYMBOL() { return getToken(OddlGrammarParser.LESS_SYMBOL, 0); }
		public TerminalNode GREATER_SYMBOL() { return getToken(OddlGrammarParser.GREATER_SYMBOL, 0); }
		public TerminalNode EQUAL_SYMBOL() { return getToken(OddlGrammarParser.EQUAL_SYMBOL, 0); }
		public TerminalNode AND() { return getToken(OddlGrammarParser.AND, 0); }
		public TerminalNode OR() { return getToken(OddlGrammarParser.OR, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).exitExpression(this);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
			case DECIMAL:
			case REAL:
			case STRING:
				{
				setState(170);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << DECIMAL) | (1L << REAL) | (1L << STRING))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case ID:
				{
				setState(171);
				attrName();
				}
				break;
			case LR_BRACKET:
				{
				setState(172);
				match(LR_BRACKET);
				setState(173);
				expression(0);
				setState(174);
				match(RR_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(192);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(190);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(178);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(179);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << GREATER_SYMBOL) | (1L << LESS_SYMBOL))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(180);
						expression(6);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(181);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(182);
						((ExpressionContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << EQUAL_SYMBOL))) != 0)) ) {
							((ExpressionContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(183);
						expression(5);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(184);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(185);
						match(AND);
						setState(186);
						expression(4);
						}
						break;
					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(187);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(188);
						match(OR);
						setState(189);
						expression(3);
						}
						break;
					}
					}
				}
				setState(194);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(OddlGrammarParser.SEMI, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).enterEmptyStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).exitEmptyStatement(this);
		}
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(195);
			match(SEMI);
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

	public static class SClassNameContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public SClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sClassName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).enterSClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).exitSClassName(this);
		}
	}

	public final SClassNameContext sClassName() throws RecognitionException {
		SClassNameContext _localctx = new SClassNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sClassName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			className();
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

	public static class SAttrContext extends ParserRuleContext {
		public AttrNameContext attrName() {
			return getRuleContext(AttrNameContext.class,0);
		}
		public SAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).enterSAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).exitSAttr(this);
		}
	}

	public final SAttrContext sAttr() throws RecognitionException {
		SAttrContext _localctx = new SAttrContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			attrName();
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

	public static class DAttrContext extends ParserRuleContext {
		public AttrNameContext attrName() {
			return getRuleContext(AttrNameContext.class,0);
		}
		public DAttrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dAttr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).enterDAttr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).exitDAttr(this);
		}
	}

	public final DAttrContext dAttr() throws RecognitionException {
		DAttrContext _localctx = new DAttrContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dAttr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			attrName();
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

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OddlGrammarParser.ID, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).exitClassName(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(ID);
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

	public static class AttrNameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(OddlGrammarParser.ID, 0); }
		public AttrNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).enterAttrName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).exitAttrName(this);
		}
	}

	public final AttrNameContext attrName() throws RecognitionException {
		AttrNameContext _localctx = new AttrNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_attrName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(ID);
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

	public static class AttrListContext extends ParserRuleContext {
		public List<AttrNameContext> attrName() {
			return getRuleContexts(AttrNameContext.class);
		}
		public AttrNameContext attrName(int i) {
			return getRuleContext(AttrNameContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(OddlGrammarParser.COMMA, 0); }
		public AttrListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attrList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).enterAttrList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).exitAttrList(this);
		}
	}

	public final AttrListContext attrList() throws RecognitionException {
		AttrListContext _localctx = new AttrListContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_attrList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			attrName();
			{
			setState(208);
			match(COMMA);
			setState(209);
			attrName();
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

	public static class DataTypeContext extends ParserRuleContext {
		public Token typeName;
		public TerminalNode CHAR() { return getToken(OddlGrammarParser.CHAR, 0); }
		public TerminalNode LR_BRACKET() { return getToken(OddlGrammarParser.LR_BRACKET, 0); }
		public TerminalNode DECIMAL() { return getToken(OddlGrammarParser.DECIMAL, 0); }
		public TerminalNode RR_BRACKET() { return getToken(OddlGrammarParser.RR_BRACKET, 0); }
		public TerminalNode INT() { return getToken(OddlGrammarParser.INT, 0); }
		public TerminalNode LONG() { return getToken(OddlGrammarParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(OddlGrammarParser.FLOAT, 0); }
		public TerminalNode BOOLEAN() { return getToken(OddlGrammarParser.BOOLEAN, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof OddlGrammarListener) ((OddlGrammarListener)listener).exitDataType(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_dataType);
		int _la;
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(CHAR);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LR_BRACKET) {
					{
					setState(212);
					match(LR_BRACKET);
					setState(213);
					match(DECIMAL);
					setState(214);
					match(RR_BRACKET);
					}
				}

				}
				break;
			case BOOLEAN:
			case INT:
			case LONG:
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				((DataTypeContext)_localctx).typeName = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BOOLEAN) | (1L << INT) | (1L << LONG) | (1L << FLOAT))) != 0)) ) {
					((DataTypeContext)_localctx).typeName = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3+\u00df\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\5\2\62"+
		"\n\2\3\2\3\2\3\3\3\3\3\3\3\3\6\3:\n\3\r\3\16\3;\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4E\n\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6P\n\6\f\6\16\6"+
		"S\13\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\7\bf\n\b\f\b\16\bi\13\b\3\b\3\b\3\b\3\b\5\bo\n\b\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\7\13\177\n\13\f\13\16\13"+
		"\u0082\13\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u008a\n\f\3\r\3\r\3\r\3\r\3"+
		"\r\5\r\u0091\n\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0099\n\16\3\17\3"+
		"\17\3\17\3\17\7\17\u009f\n\17\f\17\16\17\u00a2\13\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\5\17\u00aa\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00b3\n\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\7\20\u00c1\n\20\f\20\16\20\u00c4\13\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\5\30\u00da\n\30\3\30\5\30\u00dd\n\30\3\30\2\3\36\31\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\2\7\3\2\32\33\4\2\32\33(*\4\2\3\4%&\4\2"+
		"\5\7$$\4\2\25\25\27\31\2\u00e3\2\61\3\2\2\2\49\3\2\2\2\6D\3\2\2\2\bF\3"+
		"\2\2\2\nK\3\2\2\2\fV\3\2\2\2\16Y\3\2\2\2\20p\3\2\2\2\22t\3\2\2\2\24z\3"+
		"\2\2\2\26\u0089\3\2\2\2\30\u008b\3\2\2\2\32\u0092\3\2\2\2\34\u009a\3\2"+
		"\2\2\36\u00b2\3\2\2\2 \u00c5\3\2\2\2\"\u00c7\3\2\2\2$\u00c9\3\2\2\2&\u00cb"+
		"\3\2\2\2(\u00cd\3\2\2\2*\u00cf\3\2\2\2,\u00d1\3\2\2\2.\u00dc\3\2\2\2\60"+
		"\62\5\4\3\2\61\60\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\64\7\2\2\3\64"+
		"\3\3\2\2\2\65\66\5\6\4\2\66\67\7#\2\2\67:\3\2\2\28:\5 \21\29\65\3\2\2"+
		"\298\3\2\2\2:;\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\5\3\2\2\2=E\5\b\5\2>E\5\16"+
		"\b\2?E\5\20\t\2@E\5\22\n\2AE\5\30\r\2BE\5\32\16\2CE\5\34\17\2D=\3\2\2"+
		"\2D>\3\2\2\2D?\3\2\2\2D@\3\2\2\2DA\3\2\2\2DB\3\2\2\2DC\3\2\2\2E\7\3\2"+
		"\2\2FG\7\t\2\2GH\7\n\2\2HI\5(\25\2IJ\5\n\6\2J\t\3\2\2\2KL\7 \2\2LQ\5\f"+
		"\7\2MN\7\"\2\2NP\5\f\7\2OM\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2"+
		"\2\2SQ\3\2\2\2TU\7!\2\2U\13\3\2\2\2VW\7+\2\2WX\5.\30\2X\r\3\2\2\2YZ\7"+
		"\t\2\2Z[\7\22\2\2[\\\5(\25\2\\]\7\21\2\2]^\5$\23\2^_\7\b\2\2_g\5&\24\2"+
		"`a\7\"\2\2ab\5$\23\2bc\7\b\2\2cd\5&\24\2df\3\2\2\2e`\3\2\2\2fi\3\2\2\2"+
		"ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7\16\2\2kn\5\"\22\2lm\7\24"+
		"\2\2mo\5\36\20\2nl\3\2\2\2no\3\2\2\2o\17\3\2\2\2pq\7\r\2\2qr\7\n\2\2r"+
		"s\5(\25\2s\21\3\2\2\2tu\7\17\2\2uv\7\20\2\2vw\5(\25\2wx\7\23\2\2xy\5\24"+
		"\13\2y\23\3\2\2\2z{\7 \2\2{\u0080\5\26\f\2|}\7\"\2\2}\177\5\26\f\2~|\3"+
		"\2\2\2\177\u0082\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0083\u0084\7!\2\2\u0084\25\3\2\2\2\u0085"+
		"\u008a\7*\2\2\u0086\u008a\7(\2\2\u0087\u008a\7)\2\2\u0088\u008a\t\2\2"+
		"\2\u0089\u0085\3\2\2\2\u0089\u0086\3\2\2\2\u0089\u0087\3\2\2\2\u0089\u0088"+
		"\3\2\2\2\u008a\27\3\2\2\2\u008b\u008c\7\f\2\2\u008c\u008d\7\16\2\2\u008d"+
		"\u0090\5(\25\2\u008e\u008f\7\24\2\2\u008f\u0091\5\36\20\2\u0090\u008e"+
		"\3\2\2\2\u0090\u0091\3\2\2\2\u0091\31\3\2\2\2\u0092\u0093\7\21\2\2\u0093"+
		"\u0094\5,\27\2\u0094\u0095\7\16\2\2\u0095\u0098\5(\25\2\u0096\u0097\7"+
		"\24\2\2\u0097\u0099\5\36\20\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2"+
		"\u0099\33\3\2\2\2\u009a\u009b\7\21\2\2\u009b\u00a0\5(\25\2\u009c\u009d"+
		"\7\13\2\2\u009d\u009f\5(\25\2\u009e\u009c\3\2\2\2\u009f\u00a2\3\2\2\2"+
		"\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a3\u00a4\7\37\2\2\u00a4\u00a5\5*\26\2\u00a5\u00a6\7\16\2\2"+
		"\u00a6\u00a9\5(\25\2\u00a7\u00a8\7\24\2\2\u00a8\u00aa\5\36\20\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\35\3\2\2\2\u00ab\u00ac\b\20\1"+
		"\2\u00ac\u00b3\t\3\2\2\u00ad\u00b3\5*\26\2\u00ae\u00af\7 \2\2\u00af\u00b0"+
		"\5\36\20\2\u00b0\u00b1\7!\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00ab\3\2\2\2"+
		"\u00b2\u00ad\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b3\u00c2\3\2\2\2\u00b4\u00b5"+
		"\f\7\2\2\u00b5\u00b6\t\4\2\2\u00b6\u00c1\5\36\20\b\u00b7\u00b8\f\6\2\2"+
		"\u00b8\u00b9\t\5\2\2\u00b9\u00c1\5\36\20\7\u00ba\u00bb\f\5\2\2\u00bb\u00bc"+
		"\7\34\2\2\u00bc\u00c1\5\36\20\6\u00bd\u00be\f\4\2\2\u00be\u00bf\7\35\2"+
		"\2\u00bf\u00c1\5\36\20\5\u00c0\u00b4\3\2\2\2\u00c0\u00b7\3\2\2\2\u00c0"+
		"\u00ba\3\2\2\2\u00c0\u00bd\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c3\37\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6"+
		"\7#\2\2\u00c6!\3\2\2\2\u00c7\u00c8\5(\25\2\u00c8#\3\2\2\2\u00c9\u00ca"+
		"\5*\26\2\u00ca%\3\2\2\2\u00cb\u00cc\5*\26\2\u00cc\'\3\2\2\2\u00cd\u00ce"+
		"\7+\2\2\u00ce)\3\2\2\2\u00cf\u00d0\7+\2\2\u00d0+\3\2\2\2\u00d1\u00d2\5"+
		"*\26\2\u00d2\u00d3\7\"\2\2\u00d3\u00d4\5*\26\2\u00d4-\3\2\2\2\u00d5\u00d9"+
		"\7\26\2\2\u00d6\u00d7\7 \2\2\u00d7\u00d8\7(\2\2\u00d8\u00da\7!\2\2\u00d9"+
		"\u00d6\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00dd\3\2\2\2\u00db\u00dd\t\6"+
		"\2\2\u00dc\u00d5\3\2\2\2\u00dc\u00db\3\2\2\2\u00dd/\3\2\2\2\24\619;DQ"+
		"gn\u0080\u0089\u0090\u0098\u00a0\u00a9\u00b2\u00c0\u00c2\u00d9\u00dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}