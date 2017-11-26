// Generated from /Users/macbook/Developer/fjp/Newton/src/Newton.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class NewtonParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EndBlock=1, MainFnc=2, DefConstant=3, DefVariable=4, Add=5, Sub=6, Mul=7, 
		Div=8, Const=9, IntType=10, Boolean=11, VoidType=12, Int=13, Double=14, 
		DoubleType=15, BoolType=16, BeginFunction=17, ReturnFunctin=18, BeginIf=19, 
		EndIf=20, Then=21, Do=22, Of=23, Else=24, BeginWhile=25, EndWhile=26, 
		BeginSwitch=27, EndSwitch=28, DefaultSwitch=29, BeginFor=30, EndFor=31, 
		Repeat=32, Until=33, BracketLeft=34, BracketRight=35, Assign=36, Comma=37, 
		Colon=38, Semi=39, RelationOp=40, LogicalOp=41, Identifier=42, WS=43;
	public static final int
		RULE_program = 0, RULE_programHeading = 1, RULE_constantDefinitionPart = 2, 
		RULE_constantDefinition = 3, RULE_variableDefinitionPart = 4, RULE_variableDefinition = 5, 
		RULE_mainStatement = 6, RULE_functionStatement = 7, RULE_tag = 8, RULE_baseType = 9, 
		RULE_statement = 10, RULE_assignmentStatement = 11, RULE_callFunctionStatement = 12, 
		RULE_parameterList = 13, RULE_loopStatement = 14, RULE_whileStatement = 15, 
		RULE_forStatement = 16, RULE_doWhileStatement = 17, RULE_conditionalStatement = 18, 
		RULE_caseStatement = 19, RULE_ifStatement = 20, RULE_expression = 21, 
		RULE_simpleExpression = 22, RULE_term = 23, RULE_factor = 24;
	public static final String[] ruleNames = {
		"program", "programHeading", "constantDefinitionPart", "constantDefinition", 
		"variableDefinitionPart", "variableDefinition", "mainStatement", "functionStatement", 
		"tag", "baseType", "statement", "assignmentStatement", "callFunctionStatement", 
		"parameterList", "loopStatement", "whileStatement", "forStatement", "doWhileStatement", 
		"conditionalStatement", "caseStatement", "ifStatement", "expression", 
		"simpleExpression", "term", "factor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'end'", "'main'", "'constant:'", "'variable:'", "'+'", "'-'", "'*'", 
		"'/'", "'const'", "'int'", null, "'void'", null, null, "'double'", "'bool'", 
		"'fnc'", "'return'", "'if'", "'endif'", "'then'", "'do'", "'of'", "'else'", 
		"'while'", "'endwhile'", "'switch'", "'endswitch'", "'default'", "'for'", 
		"'endfor'", "'repeat'", "'until'", "'('", "')'", "'='", "','", "':'", 
		"';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EndBlock", "MainFnc", "DefConstant", "DefVariable", "Add", "Sub", 
		"Mul", "Div", "Const", "IntType", "Boolean", "VoidType", "Int", "Double", 
		"DoubleType", "BoolType", "BeginFunction", "ReturnFunctin", "BeginIf", 
		"EndIf", "Then", "Do", "Of", "Else", "BeginWhile", "EndWhile", "BeginSwitch", 
		"EndSwitch", "DefaultSwitch", "BeginFor", "EndFor", "Repeat", "Until", 
		"BracketLeft", "BracketRight", "Assign", "Comma", "Colon", "Semi", "RelationOp", 
		"LogicalOp", "Identifier", "WS"
	};
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
	public String getGrammarFileName() { return "Newton.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NewtonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public ProgramHeadingContext programHeading() {
			return getRuleContext(ProgramHeadingContext.class,0);
		}
		public MainStatementContext mainStatement() {
			return getRuleContext(MainStatementContext.class,0);
		}
		public List<FunctionStatementContext> functionStatement() {
			return getRuleContexts(FunctionStatementContext.class);
		}
		public FunctionStatementContext functionStatement(int i) {
			return getRuleContext(FunctionStatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			programHeading();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BeginFunction) {
				{
				{
				setState(51);
				functionStatement();
				}
				}
				setState(56);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(57);
			mainStatement();
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

	public static class ProgramHeadingContext extends ParserRuleContext {
		public ConstantDefinitionPartContext constantDefinitionPart() {
			return getRuleContext(ConstantDefinitionPartContext.class,0);
		}
		public VariableDefinitionPartContext variableDefinitionPart() {
			return getRuleContext(VariableDefinitionPartContext.class,0);
		}
		public ProgramHeadingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programHeading; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitProgramHeading(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramHeadingContext programHeading() throws RecognitionException {
		ProgramHeadingContext _localctx = new ProgramHeadingContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programHeading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			constantDefinitionPart();
			setState(60);
			variableDefinitionPart();
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

	public static class ConstantDefinitionPartContext extends ParserRuleContext {
		public TerminalNode DefConstant() { return getToken(NewtonParser.DefConstant, 0); }
		public List<ConstantDefinitionContext> constantDefinition() {
			return getRuleContexts(ConstantDefinitionContext.class);
		}
		public ConstantDefinitionContext constantDefinition(int i) {
			return getRuleContext(ConstantDefinitionContext.class,i);
		}
		public ConstantDefinitionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinitionPart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitConstantDefinitionPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDefinitionPartContext constantDefinitionPart() throws RecognitionException {
		ConstantDefinitionPartContext _localctx = new ConstantDefinitionPartContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_constantDefinitionPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(DefConstant);
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Const) {
				{
				{
				setState(63);
				constantDefinition();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ConstantDefinitionContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(NewtonParser.Const, 0); }
		public TerminalNode IntType() { return getToken(NewtonParser.IntType, 0); }
		public TerminalNode Identifier() { return getToken(NewtonParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(NewtonParser.Assign, 0); }
		public TerminalNode Int() { return getToken(NewtonParser.Int, 0); }
		public TerminalNode Semi() { return getToken(NewtonParser.Semi, 0); }
		public TerminalNode DoubleType() { return getToken(NewtonParser.DoubleType, 0); }
		public TerminalNode Double() { return getToken(NewtonParser.Double, 0); }
		public TerminalNode BoolType() { return getToken(NewtonParser.BoolType, 0); }
		public TerminalNode Boolean() { return getToken(NewtonParser.Boolean, 0); }
		public ConstantDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitConstantDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantDefinitionContext constantDefinition() throws RecognitionException {
		ConstantDefinitionContext _localctx = new ConstantDefinitionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constantDefinition);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(Const);
				setState(70);
				match(IntType);
				setState(71);
				match(Identifier);
				setState(72);
				match(Assign);
				setState(73);
				match(Int);
				setState(74);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(Const);
				setState(76);
				match(DoubleType);
				setState(77);
				match(Identifier);
				setState(78);
				match(Assign);
				setState(79);
				match(Double);
				setState(80);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				match(Const);
				setState(82);
				match(BoolType);
				setState(83);
				match(Identifier);
				setState(84);
				match(Assign);
				setState(85);
				match(Boolean);
				setState(86);
				match(Semi);
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

	public static class VariableDefinitionPartContext extends ParserRuleContext {
		public TerminalNode DefVariable() { return getToken(NewtonParser.DefVariable, 0); }
		public List<VariableDefinitionContext> variableDefinition() {
			return getRuleContexts(VariableDefinitionContext.class);
		}
		public VariableDefinitionContext variableDefinition(int i) {
			return getRuleContext(VariableDefinitionContext.class,i);
		}
		public VariableDefinitionPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinitionPart; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitVariableDefinitionPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDefinitionPartContext variableDefinitionPart() throws RecognitionException {
		VariableDefinitionPartContext _localctx = new VariableDefinitionPartContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variableDefinitionPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(DefVariable);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntType) | (1L << DoubleType) | (1L << BoolType))) != 0)) {
				{
				{
				setState(90);
				variableDefinition();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class VariableDefinitionContext extends ParserRuleContext {
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(NewtonParser.Identifier, 0); }
		public TerminalNode Semi() { return getToken(NewtonParser.Semi, 0); }
		public VariableDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitVariableDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableDefinitionContext variableDefinition() throws RecognitionException {
		VariableDefinitionContext _localctx = new VariableDefinitionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_variableDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			baseType();
			setState(97);
			match(Identifier);
			setState(98);
			match(Semi);
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

	public static class MainStatementContext extends ParserRuleContext {
		public TerminalNode MainFnc() { return getToken(NewtonParser.MainFnc, 0); }
		public TerminalNode BracketLeft() { return getToken(NewtonParser.BracketLeft, 0); }
		public TerminalNode BracketRight() { return getToken(NewtonParser.BracketRight, 0); }
		public TerminalNode EndBlock() { return getToken(NewtonParser.EndBlock, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public MainStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitMainStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainStatementContext mainStatement() throws RecognitionException {
		MainStatementContext _localctx = new MainStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mainStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(MainFnc);
			setState(101);
			match(BracketLeft);
			setState(102);
			match(BracketRight);
			setState(106);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BeginIf) | (1L << BeginWhile) | (1L << BeginSwitch) | (1L << BeginFor) | (1L << Repeat) | (1L << Identifier))) != 0)) {
				{
				{
				setState(103);
				statement();
				}
				}
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(109);
			match(EndBlock);
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

	public static class FunctionStatementContext extends ParserRuleContext {
		public TerminalNode BeginFunction() { return getToken(NewtonParser.BeginFunction, 0); }
		public TerminalNode VoidType() { return getToken(NewtonParser.VoidType, 0); }
		public TerminalNode Identifier() { return getToken(NewtonParser.Identifier, 0); }
		public TerminalNode BracketLeft() { return getToken(NewtonParser.BracketLeft, 0); }
		public TerminalNode BracketRight() { return getToken(NewtonParser.BracketRight, 0); }
		public TerminalNode EndBlock() { return getToken(NewtonParser.EndBlock, 0); }
		public TagContext tag() {
			return getRuleContext(TagContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public TerminalNode ReturnFunctin() { return getToken(NewtonParser.ReturnFunctin, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(NewtonParser.Semi, 0); }
		public FunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionStatementContext functionStatement() throws RecognitionException {
		FunctionStatementContext _localctx = new FunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionStatement);
		int _la;
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				match(BeginFunction);
				setState(112);
				match(VoidType);
				setState(113);
				match(Identifier);
				setState(114);
				match(BracketLeft);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntType) | (1L << DoubleType) | (1L << BoolType))) != 0)) {
					{
					setState(115);
					tag();
					}
				}

				setState(118);
				match(BracketRight);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BeginIf) | (1L << BeginWhile) | (1L << BeginSwitch) | (1L << BeginFor) | (1L << Repeat) | (1L << Identifier))) != 0)) {
					{
					{
					setState(119);
					statement();
					}
					}
					setState(124);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(125);
				match(EndBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(BeginFunction);
				setState(127);
				baseType();
				setState(128);
				match(Identifier);
				setState(129);
				match(BracketLeft);
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntType) | (1L << DoubleType) | (1L << BoolType))) != 0)) {
					{
					setState(130);
					tag();
					}
				}

				setState(133);
				match(BracketRight);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BeginIf) | (1L << BeginWhile) | (1L << BeginSwitch) | (1L << BeginFor) | (1L << Repeat) | (1L << Identifier))) != 0)) {
					{
					{
					setState(134);
					statement();
					}
					}
					setState(139);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(140);
				match(ReturnFunctin);
				setState(141);
				expression();
				setState(142);
				match(Semi);
				setState(143);
				match(EndBlock);
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

	public static class TagContext extends ParserRuleContext {
		public List<BaseTypeContext> baseType() {
			return getRuleContexts(BaseTypeContext.class);
		}
		public BaseTypeContext baseType(int i) {
			return getRuleContext(BaseTypeContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(NewtonParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(NewtonParser.Identifier, i);
		}
		public List<TerminalNode> Comma() { return getTokens(NewtonParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(NewtonParser.Comma, i);
		}
		public TagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tag; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitTag(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TagContext tag() throws RecognitionException {
		TagContext _localctx = new TagContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			baseType();
			setState(148);
			match(Identifier);
			setState(155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(149);
				match(Comma);
				setState(150);
				baseType();
				setState(151);
				match(Identifier);
				}
				}
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class BaseTypeContext extends ParserRuleContext {
		public TerminalNode IntType() { return getToken(NewtonParser.IntType, 0); }
		public TerminalNode DoubleType() { return getToken(NewtonParser.DoubleType, 0); }
		public TerminalNode BoolType() { return getToken(NewtonParser.BoolType, 0); }
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitBaseType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_baseType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntType) | (1L << DoubleType) | (1L << BoolType))) != 0)) ) {
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

	public static class StatementContext extends ParserRuleContext {
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public CallFunctionStatementContext callFunctionStatement() {
			return getRuleContext(CallFunctionStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_statement);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				conditionalStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				loopStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				assignmentStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				callFunctionStatement();
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

	public static class AssignmentStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(NewtonParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(NewtonParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Semi() { return getToken(NewtonParser.Semi, 0); }
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(Identifier);
			setState(167);
			match(Assign);
			setState(168);
			expression();
			setState(169);
			match(Semi);
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

	public static class CallFunctionStatementContext extends ParserRuleContext {
		public List<TerminalNode> Identifier() { return getTokens(NewtonParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(NewtonParser.Identifier, i);
		}
		public TerminalNode BracketLeft() { return getToken(NewtonParser.BracketLeft, 0); }
		public TerminalNode BracketRight() { return getToken(NewtonParser.BracketRight, 0); }
		public TerminalNode Semi() { return getToken(NewtonParser.Semi, 0); }
		public TerminalNode Assign() { return getToken(NewtonParser.Assign, 0); }
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public CallFunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callFunctionStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitCallFunctionStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallFunctionStatementContext callFunctionStatement() throws RecognitionException {
		CallFunctionStatementContext _localctx = new CallFunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_callFunctionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(171);
				match(Identifier);
				setState(172);
				match(Assign);
				}
				break;
			}
			setState(175);
			match(Identifier);
			setState(176);
			match(BracketLeft);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << Int) | (1L << Double) | (1L << BracketLeft) | (1L << Identifier))) != 0)) {
				{
				setState(177);
				parameterList();
				}
			}

			setState(180);
			match(BracketRight);
			setState(181);
			match(Semi);
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

	public static class ParameterListContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Comma() { return getToken(NewtonParser.Comma, 0); }
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitParameterList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			expression();
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(184);
				match(Comma);
				setState(185);
				expression();
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

	public static class LoopStatementContext extends ParserRuleContext {
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public ForStatementContext forStatement() {
			return getRuleContext(ForStatementContext.class,0);
		}
		public DoWhileStatementContext doWhileStatement() {
			return getRuleContext(DoWhileStatementContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_loopStatement);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BeginWhile:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				whileStatement();
				}
				break;
			case BeginFor:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				forStatement();
				}
				break;
			case Repeat:
				enterOuterAlt(_localctx, 3);
				{
				setState(190);
				doWhileStatement();
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

	public static class WhileStatementContext extends ParserRuleContext {
		public TerminalNode BeginWhile() { return getToken(NewtonParser.BeginWhile, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Do() { return getToken(NewtonParser.Do, 0); }
		public TerminalNode EndWhile() { return getToken(NewtonParser.EndWhile, 0); }
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
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			match(BeginWhile);
			setState(194);
			expression();
			setState(195);
			match(Do);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BeginIf) | (1L << BeginWhile) | (1L << BeginSwitch) | (1L << BeginFor) | (1L << Repeat) | (1L << Identifier))) != 0)) {
				{
				{
				setState(196);
				statement();
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(EndWhile);
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

	public static class ForStatementContext extends ParserRuleContext {
		public TerminalNode BeginFor() { return getToken(NewtonParser.BeginFor, 0); }
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> Colon() { return getTokens(NewtonParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(NewtonParser.Colon, i);
		}
		public TerminalNode Do() { return getToken(NewtonParser.Do, 0); }
		public TerminalNode EndFor() { return getToken(NewtonParser.EndFor, 0); }
		public TerminalNode Identifier() { return getToken(NewtonParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(NewtonParser.Assign, 0); }
		public TerminalNode Int() { return getToken(NewtonParser.Int, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ForStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStatementContext forStatement() throws RecognitionException {
		ForStatementContext _localctx = new ForStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(BeginFor);
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(205);
				match(Identifier);
				setState(206);
				match(Assign);
				}
				break;
			}
			setState(209);
			factor();
			setState(210);
			match(Colon);
			setState(211);
			factor();
			setState(214);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(212);
				match(Colon);
				setState(213);
				match(Int);
				}
			}

			setState(216);
			match(Do);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BeginIf) | (1L << BeginWhile) | (1L << BeginSwitch) | (1L << BeginFor) | (1L << Repeat) | (1L << Identifier))) != 0)) {
				{
				{
				setState(217);
				statement();
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
			match(EndFor);
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

	public static class DoWhileStatementContext extends ParserRuleContext {
		public TerminalNode Repeat() { return getToken(NewtonParser.Repeat, 0); }
		public TerminalNode Until() { return getToken(NewtonParser.Until, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public DoWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doWhileStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitDoWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DoWhileStatementContext doWhileStatement() throws RecognitionException {
		DoWhileStatementContext _localctx = new DoWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_doWhileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(Repeat);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BeginIf) | (1L << BeginWhile) | (1L << BeginSwitch) | (1L << BeginFor) | (1L << Repeat) | (1L << Identifier))) != 0)) {
				{
				{
				setState(226);
				statement();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			match(Until);
			setState(233);
			expression();
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

	public static class ConditionalStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public CaseStatementContext caseStatement() {
			return getRuleContext(CaseStatementContext.class,0);
		}
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitConditionalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_conditionalStatement);
		try {
			setState(237);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BeginIf:
				enterOuterAlt(_localctx, 1);
				{
				setState(235);
				ifStatement();
				}
				break;
			case BeginSwitch:
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				caseStatement();
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

	public static class CaseStatementContext extends ParserRuleContext {
		public TerminalNode BeginSwitch() { return getToken(NewtonParser.BeginSwitch, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public TerminalNode Of() { return getToken(NewtonParser.Of, 0); }
		public TerminalNode DefaultSwitch() { return getToken(NewtonParser.DefaultSwitch, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode EndSwitch() { return getToken(NewtonParser.EndSwitch, 0); }
		public List<TerminalNode> Int() { return getTokens(NewtonParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(NewtonParser.Int, i);
		}
		public List<TerminalNode> Colon() { return getTokens(NewtonParser.Colon); }
		public TerminalNode Colon(int i) {
			return getToken(NewtonParser.Colon, i);
		}
		public CaseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitCaseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseStatementContext caseStatement() throws RecognitionException {
		CaseStatementContext _localctx = new CaseStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_caseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(BeginSwitch);
			setState(240);
			simpleExpression();
			setState(241);
			match(Of);
			setState(245); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(242);
				match(Int);
				setState(243);
				match(Colon);
				setState(244);
				statement();
				}
				}
				setState(247); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Int );
			setState(249);
			match(DefaultSwitch);
			setState(251); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(250);
				match(Colon);
				}
				}
				setState(253); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Colon );
			setState(255);
			statement();
			setState(256);
			match(EndSwitch);
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode BeginIf() { return getToken(NewtonParser.BeginIf, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Then() { return getToken(NewtonParser.Then, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode EndIf() { return getToken(NewtonParser.EndIf, 0); }
		public TerminalNode Else() { return getToken(NewtonParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(BeginIf);
			setState(259);
			expression();
			setState(260);
			match(Then);
			setState(261);
			statement();
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(262);
				match(Else);
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BeginIf) | (1L << BeginWhile) | (1L << BeginSwitch) | (1L << BeginFor) | (1L << Repeat) | (1L << Identifier))) != 0)) {
					{
					{
					setState(263);
					statement();
					}
					}
					setState(268);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(271);
			match(EndIf);
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
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public List<TerminalNode> RelationOp() { return getTokens(NewtonParser.RelationOp); }
		public TerminalNode RelationOp(int i) {
			return getToken(NewtonParser.RelationOp, i);
		}
		public List<TerminalNode> LogicalOp() { return getTokens(NewtonParser.LogicalOp); }
		public TerminalNode LogicalOp(int i) {
			return getToken(NewtonParser.LogicalOp, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			simpleExpression();
			setState(278);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RelationOp) {
				{
				{
				setState(274);
				match(RelationOp);
				setState(275);
				simpleExpression();
				}
				}
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(285);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(281);
					match(LogicalOp);
					setState(282);
					expression();
					}
					} 
				}
				setState(287);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
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

	public static class SimpleExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public List<TerminalNode> Add() { return getTokens(NewtonParser.Add); }
		public TerminalNode Add(int i) {
			return getToken(NewtonParser.Add, i);
		}
		public List<TerminalNode> Sub() { return getTokens(NewtonParser.Sub); }
		public TerminalNode Sub(int i) {
			return getToken(NewtonParser.Sub, i);
		}
		public SimpleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitSimpleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExpressionContext simpleExpression() throws RecognitionException {
		SimpleExpressionContext _localctx = new SimpleExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_simpleExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			term();
			setState(293);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(289);
					_la = _input.LA(1);
					if ( !(_la==Add || _la==Sub) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(290);
					term();
					}
					} 
				}
				setState(295);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public List<TerminalNode> Mul() { return getTokens(NewtonParser.Mul); }
		public TerminalNode Mul(int i) {
			return getToken(NewtonParser.Mul, i);
		}
		public List<TerminalNode> Div() { return getTokens(NewtonParser.Div); }
		public TerminalNode Div(int i) {
			return getToken(NewtonParser.Div, i);
		}
		public TerminalNode BracketLeft() { return getToken(NewtonParser.BracketLeft, 0); }
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public TerminalNode BracketRight() { return getToken(NewtonParser.BracketRight, 0); }
		public TerminalNode Add() { return getToken(NewtonParser.Add, 0); }
		public TerminalNode Sub() { return getToken(NewtonParser.Sub, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_term);
		int _la;
		try {
			setState(311);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Boolean:
			case Int:
			case Double:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				factor();
				setState(301);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Mul || _la==Div) {
					{
					{
					setState(297);
					_la = _input.LA(1);
					if ( !(_la==Mul || _la==Div) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(298);
					factor();
					}
					}
					setState(303);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BracketLeft:
				enterOuterAlt(_localctx, 2);
				{
				setState(304);
				match(BracketLeft);
				setState(305);
				simpleExpression();
				setState(306);
				match(BracketRight);
				setState(309);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(307);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Add) | (1L << Sub) | (1L << Mul) | (1L << Div))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(308);
					simpleExpression();
					}
					break;
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(NewtonParser.Int, 0); }
		public TerminalNode Boolean() { return getToken(NewtonParser.Boolean, 0); }
		public TerminalNode Double() { return getToken(NewtonParser.Double, 0); }
		public TerminalNode Identifier() { return getToken(NewtonParser.Identifier, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << Int) | (1L << Double) | (1L << Identifier))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3-\u013e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\7\2\67\n\2\f\2\16\2:\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3"+
		"\4\7\4C\n\4\f\4\16\4F\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Z\n\5\3\6\3\6\7\6^\n\6\f\6\16\6a\13\6"+
		"\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bk\n\b\f\b\16\bn\13\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\5\tw\n\t\3\t\3\t\7\t{\n\t\f\t\16\t~\13\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u0086\n\t\3\t\3\t\7\t\u008a\n\t\f\t\16\t\u008d\13\t\3\t"+
		"\3\t\3\t\3\t\3\t\5\t\u0094\n\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u009c\n\n\f"+
		"\n\16\n\u009f\13\n\3\13\3\13\3\f\3\f\3\f\3\f\5\f\u00a7\n\f\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\5\16\u00b0\n\16\3\16\3\16\3\16\5\16\u00b5\n\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\5\17\u00bd\n\17\3\20\3\20\3\20\5\20\u00c2\n"+
		"\20\3\21\3\21\3\21\3\21\7\21\u00c8\n\21\f\21\16\21\u00cb\13\21\3\21\3"+
		"\21\3\22\3\22\3\22\5\22\u00d2\n\22\3\22\3\22\3\22\3\22\3\22\5\22\u00d9"+
		"\n\22\3\22\3\22\7\22\u00dd\n\22\f\22\16\22\u00e0\13\22\3\22\3\22\3\23"+
		"\3\23\7\23\u00e6\n\23\f\23\16\23\u00e9\13\23\3\23\3\23\3\23\3\24\3\24"+
		"\5\24\u00f0\n\24\3\25\3\25\3\25\3\25\3\25\3\25\6\25\u00f8\n\25\r\25\16"+
		"\25\u00f9\3\25\3\25\6\25\u00fe\n\25\r\25\16\25\u00ff\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\7\26\u010b\n\26\f\26\16\26\u010e\13\26\5"+
		"\26\u0110\n\26\3\26\3\26\3\27\3\27\3\27\7\27\u0117\n\27\f\27\16\27\u011a"+
		"\13\27\3\27\3\27\7\27\u011e\n\27\f\27\16\27\u0121\13\27\3\30\3\30\3\30"+
		"\7\30\u0126\n\30\f\30\16\30\u0129\13\30\3\31\3\31\3\31\7\31\u012e\n\31"+
		"\f\31\16\31\u0131\13\31\3\31\3\31\3\31\3\31\3\31\5\31\u0138\n\31\5\31"+
		"\u013a\n\31\3\32\3\32\3\32\2\2\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\2\7\4\2\f\f\21\22\3\2\7\b\3\2\t\n\3\2\7\n\5\2\r\r\17"+
		"\20,,\2\u0148\2\64\3\2\2\2\4=\3\2\2\2\6@\3\2\2\2\bY\3\2\2\2\n[\3\2\2\2"+
		"\fb\3\2\2\2\16f\3\2\2\2\20\u0093\3\2\2\2\22\u0095\3\2\2\2\24\u00a0\3\2"+
		"\2\2\26\u00a6\3\2\2\2\30\u00a8\3\2\2\2\32\u00af\3\2\2\2\34\u00b9\3\2\2"+
		"\2\36\u00c1\3\2\2\2 \u00c3\3\2\2\2\"\u00ce\3\2\2\2$\u00e3\3\2\2\2&\u00ef"+
		"\3\2\2\2(\u00f1\3\2\2\2*\u0104\3\2\2\2,\u0113\3\2\2\2.\u0122\3\2\2\2\60"+
		"\u0139\3\2\2\2\62\u013b\3\2\2\2\648\5\4\3\2\65\67\5\20\t\2\66\65\3\2\2"+
		"\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3\2\2\2:8\3\2\2\2;<\5\16\b\2<\3"+
		"\3\2\2\2=>\5\6\4\2>?\5\n\6\2?\5\3\2\2\2@D\7\5\2\2AC\5\b\5\2BA\3\2\2\2"+
		"CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2E\7\3\2\2\2FD\3\2\2\2GH\7\13\2\2HI\7\f\2"+
		"\2IJ\7,\2\2JK\7&\2\2KL\7\17\2\2LZ\7)\2\2MN\7\13\2\2NO\7\21\2\2OP\7,\2"+
		"\2PQ\7&\2\2QR\7\20\2\2RZ\7)\2\2ST\7\13\2\2TU\7\22\2\2UV\7,\2\2VW\7&\2"+
		"\2WX\7\r\2\2XZ\7)\2\2YG\3\2\2\2YM\3\2\2\2YS\3\2\2\2Z\t\3\2\2\2[_\7\6\2"+
		"\2\\^\5\f\7\2]\\\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\13\3\2\2\2a_\3"+
		"\2\2\2bc\5\24\13\2cd\7,\2\2de\7)\2\2e\r\3\2\2\2fg\7\4\2\2gh\7$\2\2hl\7"+
		"%\2\2ik\5\26\f\2ji\3\2\2\2kn\3\2\2\2lj\3\2\2\2lm\3\2\2\2mo\3\2\2\2nl\3"+
		"\2\2\2op\7\3\2\2p\17\3\2\2\2qr\7\23\2\2rs\7\16\2\2st\7,\2\2tv\7$\2\2u"+
		"w\5\22\n\2vu\3\2\2\2vw\3\2\2\2wx\3\2\2\2x|\7%\2\2y{\5\26\f\2zy\3\2\2\2"+
		"{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~|\3\2\2\2\177\u0094\7\3\2"+
		"\2\u0080\u0081\7\23\2\2\u0081\u0082\5\24\13\2\u0082\u0083\7,\2\2\u0083"+
		"\u0085\7$\2\2\u0084\u0086\5\22\n\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2"+
		"\2\2\u0086\u0087\3\2\2\2\u0087\u008b\7%\2\2\u0088\u008a\5\26\f\2\u0089"+
		"\u0088\3\2\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2"+
		"\2\2\u008c\u008e\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\24\2\2\u008f"+
		"\u0090\5,\27\2\u0090\u0091\7)\2\2\u0091\u0092\7\3\2\2\u0092\u0094\3\2"+
		"\2\2\u0093q\3\2\2\2\u0093\u0080\3\2\2\2\u0094\21\3\2\2\2\u0095\u0096\5"+
		"\24\13\2\u0096\u009d\7,\2\2\u0097\u0098\7\'\2\2\u0098\u0099\5\24\13\2"+
		"\u0099\u009a\7,\2\2\u009a\u009c\3\2\2\2\u009b\u0097\3\2\2\2\u009c\u009f"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\23\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a1\t\2\2\2\u00a1\25\3\2\2\2\u00a2\u00a7\5&\24"+
		"\2\u00a3\u00a7\5\36\20\2\u00a4\u00a7\5\30\r\2\u00a5\u00a7\5\32\16\2\u00a6"+
		"\u00a2\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a5\3\2"+
		"\2\2\u00a7\27\3\2\2\2\u00a8\u00a9\7,\2\2\u00a9\u00aa\7&\2\2\u00aa\u00ab"+
		"\5,\27\2\u00ab\u00ac\7)\2\2\u00ac\31\3\2\2\2\u00ad\u00ae\7,\2\2\u00ae"+
		"\u00b0\7&\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b2\7,\2\2\u00b2\u00b4\7$\2\2\u00b3\u00b5\5\34\17\2\u00b4"+
		"\u00b3\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7%"+
		"\2\2\u00b7\u00b8\7)\2\2\u00b8\33\3\2\2\2\u00b9\u00bc\5,\27\2\u00ba\u00bb"+
		"\7\'\2\2\u00bb\u00bd\5,\27\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\35\3\2\2\2\u00be\u00c2\5 \21\2\u00bf\u00c2\5\"\22\2\u00c0\u00c2\5$\23"+
		"\2\u00c1\u00be\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2\37"+
		"\3\2\2\2\u00c3\u00c4\7\33\2\2\u00c4\u00c5\5,\27\2\u00c5\u00c9\7\30\2\2"+
		"\u00c6\u00c8\5\26\f\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9\u00c7"+
		"\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cc\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00cd\7\34\2\2\u00cd!\3\2\2\2\u00ce\u00d1\7 \2\2\u00cf\u00d0\7,\2\2\u00d0"+
		"\u00d2\7&\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d4\5\62\32\2\u00d4\u00d5\7(\2\2\u00d5\u00d8\5\62\32\2\u00d6"+
		"\u00d7\7(\2\2\u00d7\u00d9\7\17\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2"+
		"\2\2\u00d9\u00da\3\2\2\2\u00da\u00de\7\30\2\2\u00db\u00dd\5\26\f\2\u00dc"+
		"\u00db\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2"+
		"\2\2\u00df\u00e1\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2\7!\2\2\u00e2"+
		"#\3\2\2\2\u00e3\u00e7\7\"\2\2\u00e4\u00e6\5\26\f\2\u00e5\u00e4\3\2\2\2"+
		"\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea"+
		"\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7#\2\2\u00eb\u00ec\5,\27\2\u00ec"+
		"%\3\2\2\2\u00ed\u00f0\5*\26\2\u00ee\u00f0\5(\25\2\u00ef\u00ed\3\2\2\2"+
		"\u00ef\u00ee\3\2\2\2\u00f0\'\3\2\2\2\u00f1\u00f2\7\35\2\2\u00f2\u00f3"+
		"\5.\30\2\u00f3\u00f7\7\31\2\2\u00f4\u00f5\7\17\2\2\u00f5\u00f6\7(\2\2"+
		"\u00f6\u00f8\5\26\f\2\u00f7\u00f4\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00f7"+
		"\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\7\37\2\2"+
		"\u00fc\u00fe\7(\2\2\u00fd\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u00fd"+
		"\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\5\26\f\2"+
		"\u0102\u0103\7\36\2\2\u0103)\3\2\2\2\u0104\u0105\7\25\2\2\u0105\u0106"+
		"\5,\27\2\u0106\u0107\7\27\2\2\u0107\u010f\5\26\f\2\u0108\u010c\7\32\2"+
		"\2\u0109\u010b\5\26\f\2\u010a\u0109\3\2\2\2\u010b\u010e\3\2\2\2\u010c"+
		"\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c\3\2"+
		"\2\2\u010f\u0108\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u0112\7\26\2\2\u0112+\3\2\2\2\u0113\u0118\5.\30\2\u0114\u0115\7*\2\2"+
		"\u0115\u0117\5.\30\2\u0116\u0114\3\2\2\2\u0117\u011a\3\2\2\2\u0118\u0116"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0119\u011f\3\2\2\2\u011a\u0118\3\2\2\2\u011b"+
		"\u011c\7+\2\2\u011c\u011e\5,\27\2\u011d\u011b\3\2\2\2\u011e\u0121\3\2"+
		"\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120-\3\2\2\2\u0121\u011f"+
		"\3\2\2\2\u0122\u0127\5\60\31\2\u0123\u0124\t\3\2\2\u0124\u0126\5\60\31"+
		"\2\u0125\u0123\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127\u0128"+
		"\3\2\2\2\u0128/\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012f\5\62\32\2\u012b"+
		"\u012c\t\4\2\2\u012c\u012e\5\62\32\2\u012d\u012b\3\2\2\2\u012e\u0131\3"+
		"\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u013a\3\2\2\2\u0131"+
		"\u012f\3\2\2\2\u0132\u0133\7$\2\2\u0133\u0134\5.\30\2\u0134\u0137\7%\2"+
		"\2\u0135\u0136\t\5\2\2\u0136\u0138\5.\30\2\u0137\u0135\3\2\2\2\u0137\u0138"+
		"\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u012a\3\2\2\2\u0139\u0132\3\2\2\2\u013a"+
		"\61\3\2\2\2\u013b\u013c\t\6\2\2\u013c\63\3\2\2\2\"8DY_lv|\u0085\u008b"+
		"\u0093\u009d\u00a6\u00af\u00b4\u00bc\u00c1\u00c9\u00d1\u00d8\u00de\u00e7"+
		"\u00ef\u00f9\u00ff\u010c\u010f\u0118\u011f\u0127\u012f\u0137\u0139";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}