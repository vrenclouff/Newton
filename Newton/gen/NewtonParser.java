// Generated from C:/Users/Barat/OneDrive/Dokumenty/_FAV/ING/FJP/Semestralka/projekt/Newton/src\Newton.g4 by ANTLR 4.7
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
		Div=8, Const=9, IntType=10, Boolean=11, VoidType=12, Int=13, BoolType=14, 
		BeginFunction=15, ReturnFunctin=16, BeginIf=17, EndIf=18, Then=19, Do=20, 
		Of=21, Else=22, BeginWhile=23, EndWhile=24, BeginSwitch=25, EndSwitch=26, 
		DefaultSwitch=27, BeginFor=28, EndFor=29, Repeat=30, Until=31, RoundBracketLeft=32, 
		RoundBracketRight=33, CurlyBracketLeft=34, CurlyBracketRight=35, Assign=36, 
		Comma=37, Colon=38, Semi=39, Ques=40, RelationOp=41, Lt=42, Gt=43, Lte=44, 
		Gte=45, Eq=46, LogicalOp=47, Identifier=48, WS=49;
	public static final int
		RULE_program = 0, RULE_programHeading = 1, RULE_constantDefinitionPart = 2, 
		RULE_constantDefinition = 3, RULE_variableDefinitionPart = 4, RULE_variableDefinition = 5, 
		RULE_mainStatement = 6, RULE_functionStatement = 7, RULE_tag = 8, RULE_baseType = 9, 
		RULE_statement = 10, RULE_assignmentStatement = 11, RULE_multipleAssignmentStatement = 12, 
		RULE_parallelAssignmentStatement = 13, RULE_callFunctionStatement = 14, 
		RULE_parameterList = 15, RULE_loopStatement = 16, RULE_whileStatement = 17, 
		RULE_forStatement = 18, RULE_doWhileStatement = 19, RULE_conditionalStatement = 20, 
		RULE_switchStatement = 21, RULE_caseStatement = 22, RULE_ifStatement = 23, 
		RULE_elseStatement = 24, RULE_ternaryStatement = 25, RULE_expression = 26, 
		RULE_simpleExpression = 27, RULE_term = 28, RULE_factor = 29, RULE_simpleFactor = 30;
	public static final String[] ruleNames = {
		"program", "programHeading", "constantDefinitionPart", "constantDefinition", 
		"variableDefinitionPart", "variableDefinition", "mainStatement", "functionStatement", 
		"tag", "baseType", "statement", "assignmentStatement", "multipleAssignmentStatement", 
		"parallelAssignmentStatement", "callFunctionStatement", "parameterList", 
		"loopStatement", "whileStatement", "forStatement", "doWhileStatement", 
		"conditionalStatement", "switchStatement", "caseStatement", "ifStatement", 
		"elseStatement", "ternaryStatement", "expression", "simpleExpression", 
		"term", "factor", "simpleFactor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'end'", "'main'", "'constant:'", "'variable:'", "'+'", "'-'", "'*'", 
		"'/'", "'const'", "'int'", null, "'void'", null, "'bool'", "'fnc'", "'return'", 
		"'if'", "'endif'", "'then'", "'do'", "'of'", "'else'", "'while'", "'endwhile'", 
		"'switch'", "'endswitch'", "'default'", "'for'", "'endfor'", "'repeat'", 
		"'until'", "'('", "')'", "'{'", "'}'", "'='", "','", "':'", "';'", "'?'", 
		null, "'<'", "'>'", "'<='", "'>='", "'=='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EndBlock", "MainFnc", "DefConstant", "DefVariable", "Add", "Sub", 
		"Mul", "Div", "Const", "IntType", "Boolean", "VoidType", "Int", "BoolType", 
		"BeginFunction", "ReturnFunctin", "BeginIf", "EndIf", "Then", "Do", "Of", 
		"Else", "BeginWhile", "EndWhile", "BeginSwitch", "EndSwitch", "DefaultSwitch", 
		"BeginFor", "EndFor", "Repeat", "Until", "RoundBracketLeft", "RoundBracketRight", 
		"CurlyBracketLeft", "CurlyBracketRight", "Assign", "Comma", "Colon", "Semi", 
		"Ques", "RelationOp", "Lt", "Gt", "Lte", "Gte", "Eq", "LogicalOp", "Identifier", 
		"WS"
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
			setState(62);
			programHeading();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BeginFunction) {
				{
				{
				setState(63);
				functionStatement();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
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
			setState(71);
			constantDefinitionPart();
			setState(72);
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
			setState(74);
			match(DefConstant);
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Const) {
				{
				{
				setState(75);
				constantDefinition();
				}
				}
				setState(80);
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
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(Const);
				setState(82);
				match(IntType);
				setState(83);
				match(Identifier);
				setState(84);
				match(Assign);
				setState(85);
				match(Int);
				setState(86);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87);
				match(Const);
				setState(88);
				match(BoolType);
				setState(89);
				match(Identifier);
				setState(90);
				match(Assign);
				setState(91);
				match(Boolean);
				setState(92);
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
			setState(95);
			match(DefVariable);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IntType || _la==BoolType) {
				{
				{
				setState(96);
				variableDefinition();
				}
				}
				setState(101);
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
			setState(102);
			baseType();
			setState(103);
			match(Identifier);
			setState(104);
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
		public TerminalNode RoundBracketLeft() { return getToken(NewtonParser.RoundBracketLeft, 0); }
		public TerminalNode RoundBracketRight() { return getToken(NewtonParser.RoundBracketRight, 0); }
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
			setState(106);
			match(MainFnc);
			setState(107);
			match(RoundBracketLeft);
			setState(108);
			match(RoundBracketRight);
			setState(112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BeginIf) | (1L << BeginWhile) | (1L << BeginSwitch) | (1L << BeginFor) | (1L << Repeat) | (1L << CurlyBracketLeft) | (1L << Identifier))) != 0)) {
				{
				{
				setState(109);
				statement();
				}
				}
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(115);
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
		public TerminalNode RoundBracketLeft() { return getToken(NewtonParser.RoundBracketLeft, 0); }
		public TerminalNode RoundBracketRight() { return getToken(NewtonParser.RoundBracketRight, 0); }
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
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(117);
				match(BeginFunction);
				setState(118);
				match(VoidType);
				setState(119);
				match(Identifier);
				setState(120);
				match(RoundBracketLeft);
				setState(122);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IntType || _la==BoolType) {
					{
					setState(121);
					tag();
					}
				}

				setState(124);
				match(RoundBracketRight);
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BeginIf) | (1L << BeginWhile) | (1L << BeginSwitch) | (1L << BeginFor) | (1L << Repeat) | (1L << CurlyBracketLeft) | (1L << Identifier))) != 0)) {
					{
					{
					setState(125);
					statement();
					}
					}
					setState(130);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(131);
				match(EndBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(BeginFunction);
				setState(133);
				baseType();
				setState(134);
				match(Identifier);
				setState(135);
				match(RoundBracketLeft);
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IntType || _la==BoolType) {
					{
					setState(136);
					tag();
					}
				}

				setState(139);
				match(RoundBracketRight);
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BeginIf) | (1L << BeginWhile) | (1L << BeginSwitch) | (1L << BeginFor) | (1L << Repeat) | (1L << CurlyBracketLeft) | (1L << Identifier))) != 0)) {
					{
					{
					setState(140);
					statement();
					}
					}
					setState(145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(146);
				match(ReturnFunctin);
				setState(147);
				expression();
				setState(148);
				match(Semi);
				setState(149);
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
			setState(153);
			baseType();
			setState(154);
			match(Identifier);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(155);
				match(Comma);
				setState(156);
				baseType();
				setState(157);
				match(Identifier);
				}
				}
				setState(163);
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
			setState(164);
			_la = _input.LA(1);
			if ( !(_la==IntType || _la==BoolType) ) {
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
		public ParallelAssignmentStatementContext parallelAssignmentStatement() {
			return getRuleContext(ParallelAssignmentStatementContext.class,0);
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
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				conditionalStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				loopStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				assignmentStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				parallelAssignmentStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
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
		public TerminalNode Semi() { return getToken(NewtonParser.Semi, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TernaryStatementContext ternaryStatement() {
			return getRuleContext(TernaryStatementContext.class,0);
		}
		public List<MultipleAssignmentStatementContext> multipleAssignmentStatement() {
			return getRuleContexts(MultipleAssignmentStatementContext.class);
		}
		public MultipleAssignmentStatementContext multipleAssignmentStatement(int i) {
			return getRuleContext(MultipleAssignmentStatementContext.class,i);
		}
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(Identifier);
			setState(174);
			match(Assign);
			setState(178);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(175);
					multipleAssignmentStatement();
					}
					} 
				}
				setState(180);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(181);
				expression();
				}
				break;
			case 2:
				{
				setState(182);
				ternaryStatement();
				}
				break;
			}
			setState(185);
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

	public static class MultipleAssignmentStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(NewtonParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(NewtonParser.Assign, 0); }
		public MultipleAssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleAssignmentStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitMultipleAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleAssignmentStatementContext multipleAssignmentStatement() throws RecognitionException {
		MultipleAssignmentStatementContext _localctx = new MultipleAssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_multipleAssignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(Identifier);
			setState(188);
			match(Assign);
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

	public static class ParallelAssignmentStatementContext extends ParserRuleContext {
		public List<TerminalNode> CurlyBracketLeft() { return getTokens(NewtonParser.CurlyBracketLeft); }
		public TerminalNode CurlyBracketLeft(int i) {
			return getToken(NewtonParser.CurlyBracketLeft, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(NewtonParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(NewtonParser.Identifier, i);
		}
		public List<TerminalNode> CurlyBracketRight() { return getTokens(NewtonParser.CurlyBracketRight); }
		public TerminalNode CurlyBracketRight(int i) {
			return getToken(NewtonParser.CurlyBracketRight, i);
		}
		public TerminalNode Assign() { return getToken(NewtonParser.Assign, 0); }
		public List<SimpleFactorContext> simpleFactor() {
			return getRuleContexts(SimpleFactorContext.class);
		}
		public SimpleFactorContext simpleFactor(int i) {
			return getRuleContext(SimpleFactorContext.class,i);
		}
		public TerminalNode Semi() { return getToken(NewtonParser.Semi, 0); }
		public ParallelAssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parallelAssignmentStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitParallelAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParallelAssignmentStatementContext parallelAssignmentStatement() throws RecognitionException {
		ParallelAssignmentStatementContext _localctx = new ParallelAssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parallelAssignmentStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(CurlyBracketLeft);
			setState(191);
			match(Identifier);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(192);
				match(Comma);
				setState(193);
				match(Identifier);
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			match(CurlyBracketRight);
			setState(200);
			match(Assign);
			setState(201);
			match(CurlyBracketLeft);
			setState(202);
			simpleFactor();
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(203);
				match(Comma);
				setState(204);
				simpleFactor();
				}
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(210);
			match(CurlyBracketRight);
			setState(211);
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
		public TerminalNode RoundBracketLeft() { return getToken(NewtonParser.RoundBracketLeft, 0); }
		public TerminalNode RoundBracketRight() { return getToken(NewtonParser.RoundBracketRight, 0); }
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
		enterRule(_localctx, 28, RULE_callFunctionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(213);
				match(Identifier);
				setState(214);
				match(Assign);
				}
				break;
			}
			setState(217);
			match(Identifier);
			setState(218);
			match(RoundBracketLeft);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << Int) | (1L << RoundBracketLeft) | (1L << Identifier))) != 0)) {
				{
				setState(219);
				parameterList();
				}
			}

			setState(222);
			match(RoundBracketRight);
			setState(223);
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
		enterRule(_localctx, 30, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			expression();
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(226);
				match(Comma);
				setState(227);
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
		enterRule(_localctx, 32, RULE_loopStatement);
		try {
			setState(233);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BeginWhile:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				whileStatement();
				}
				break;
			case BeginFor:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				forStatement();
				}
				break;
			case Repeat:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
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
		enterRule(_localctx, 34, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			match(BeginWhile);
			setState(236);
			expression();
			setState(237);
			match(Do);
			setState(241);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BeginIf) | (1L << BeginWhile) | (1L << BeginSwitch) | (1L << BeginFor) | (1L << Repeat) | (1L << CurlyBracketLeft) | (1L << Identifier))) != 0)) {
				{
				{
				setState(238);
				statement();
				}
				}
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(244);
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
		enterRule(_localctx, 36, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(BeginFor);
			setState(249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(247);
				match(Identifier);
				setState(248);
				match(Assign);
				}
				break;
			}
			setState(251);
			factor();
			setState(252);
			match(Colon);
			setState(253);
			factor();
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(254);
				match(Colon);
				setState(255);
				match(Int);
				}
			}

			setState(258);
			match(Do);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BeginIf) | (1L << BeginWhile) | (1L << BeginSwitch) | (1L << BeginFor) | (1L << Repeat) | (1L << CurlyBracketLeft) | (1L << Identifier))) != 0)) {
				{
				{
				setState(259);
				statement();
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(265);
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
		enterRule(_localctx, 38, RULE_doWhileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(Repeat);
			setState(271);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BeginIf) | (1L << BeginWhile) | (1L << BeginSwitch) | (1L << BeginFor) | (1L << Repeat) | (1L << CurlyBracketLeft) | (1L << Identifier))) != 0)) {
				{
				{
				setState(268);
				statement();
				}
				}
				setState(273);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(274);
			match(Until);
			setState(275);
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
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
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
		enterRule(_localctx, 40, RULE_conditionalStatement);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BeginIf:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				ifStatement();
				}
				break;
			case BeginSwitch:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				switchStatement();
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode BeginSwitch() { return getToken(NewtonParser.BeginSwitch, 0); }
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public TerminalNode Of() { return getToken(NewtonParser.Of, 0); }
		public TerminalNode DefaultSwitch() { return getToken(NewtonParser.DefaultSwitch, 0); }
		public TerminalNode Colon() { return getToken(NewtonParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EndSwitch() { return getToken(NewtonParser.EndSwitch, 0); }
		public List<CaseStatementContext> caseStatement() {
			return getRuleContexts(CaseStatementContext.class);
		}
		public CaseStatementContext caseStatement(int i) {
			return getRuleContext(CaseStatementContext.class,i);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitSwitchStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(BeginSwitch);
			setState(282);
			simpleExpression();
			setState(283);
			match(Of);
			setState(285); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(284);
				caseStatement();
				}
				}
				setState(287); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Int );
			setState(289);
			match(DefaultSwitch);
			setState(290);
			match(Colon);
			setState(291);
			statement();
			setState(292);
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

	public static class CaseStatementContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(NewtonParser.Int, 0); }
		public TerminalNode Colon() { return getToken(NewtonParser.Colon, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
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
		enterRule(_localctx, 44, RULE_caseStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(Int);
			setState(295);
			match(Colon);
			setState(296);
			statement();
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
		public TerminalNode EndIf() { return getToken(NewtonParser.EndIf, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseStatementContext elseStatement() {
			return getRuleContext(ElseStatementContext.class,0);
		}
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
		enterRule(_localctx, 46, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(BeginIf);
			setState(299);
			expression();
			setState(300);
			match(Then);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BeginIf) | (1L << BeginWhile) | (1L << BeginSwitch) | (1L << BeginFor) | (1L << Repeat) | (1L << CurlyBracketLeft) | (1L << Identifier))) != 0)) {
				{
				{
				setState(301);
				statement();
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(307);
				elseStatement();
				}
			}

			setState(310);
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

	public static class ElseStatementContext extends ParserRuleContext {
		public TerminalNode Else() { return getToken(NewtonParser.Else, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ElseStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitElseStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStatementContext elseStatement() throws RecognitionException {
		ElseStatementContext _localctx = new ElseStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_elseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(Else);
			setState(316);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BeginIf) | (1L << BeginWhile) | (1L << BeginSwitch) | (1L << BeginFor) | (1L << Repeat) | (1L << CurlyBracketLeft) | (1L << Identifier))) != 0)) {
				{
				{
				setState(313);
				statement();
				}
				}
				setState(318);
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

	public static class TernaryStatementContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Ques() { return getToken(NewtonParser.Ques, 0); }
		public TerminalNode Colon() { return getToken(NewtonParser.Colon, 0); }
		public TernaryStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ternaryStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitTernaryStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TernaryStatementContext ternaryStatement() throws RecognitionException {
		TernaryStatementContext _localctx = new TernaryStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ternaryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			expression();
			setState(320);
			match(Ques);
			setState(321);
			expression();
			setState(322);
			match(Colon);
			setState(323);
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
		enterRule(_localctx, 52, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			simpleExpression();
			setState(330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RelationOp) {
				{
				{
				setState(326);
				match(RelationOp);
				setState(327);
				simpleExpression();
				}
				}
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(337);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(333);
					match(LogicalOp);
					setState(334);
					expression();
					}
					} 
				}
				setState(339);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
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
		enterRule(_localctx, 54, RULE_simpleExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			term();
			setState(345);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(341);
					_la = _input.LA(1);
					if ( !(_la==Add || _la==Sub) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(342);
					term();
					}
					} 
				}
				setState(347);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
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
		public TerminalNode RoundBracketLeft() { return getToken(NewtonParser.RoundBracketLeft, 0); }
		public List<SimpleExpressionContext> simpleExpression() {
			return getRuleContexts(SimpleExpressionContext.class);
		}
		public SimpleExpressionContext simpleExpression(int i) {
			return getRuleContext(SimpleExpressionContext.class,i);
		}
		public TerminalNode RoundBracketRight() { return getToken(NewtonParser.RoundBracketRight, 0); }
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
		enterRule(_localctx, 56, RULE_term);
		int _la;
		try {
			setState(363);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Boolean:
			case Int:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(348);
				factor();
				setState(353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Mul || _la==Div) {
					{
					{
					setState(349);
					_la = _input.LA(1);
					if ( !(_la==Mul || _la==Div) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(350);
					factor();
					}
					}
					setState(355);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RoundBracketLeft:
				enterOuterAlt(_localctx, 2);
				{
				setState(356);
				match(RoundBracketLeft);
				setState(357);
				simpleExpression();
				setState(358);
				match(RoundBracketRight);
				setState(361);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(359);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Add) | (1L << Sub) | (1L << Mul) | (1L << Div))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(360);
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
		public SimpleFactorContext simpleFactor() {
			return getRuleContext(SimpleFactorContext.class,0);
		}
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
		enterRule(_localctx, 58, RULE_factor);
		try {
			setState(367);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Boolean:
			case Int:
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				simpleFactor();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(366);
				match(Identifier);
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

	public static class SimpleFactorContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(NewtonParser.Int, 0); }
		public TerminalNode Boolean() { return getToken(NewtonParser.Boolean, 0); }
		public SimpleFactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleFactor; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitSimpleFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleFactorContext simpleFactor() throws RecognitionException {
		SimpleFactorContext _localctx = new SimpleFactorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_simpleFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_la = _input.LA(1);
			if ( !(_la==Boolean || _la==Int) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0176\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\7\2C\n\2\f\2\16\2F\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\7\4O\n\4\f\4"+
		"\16\4R\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5`\n\5\3"+
		"\6\3\6\7\6d\n\6\f\6\16\6g\13\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bq\n"+
		"\b\f\b\16\bt\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\t}\n\t\3\t\3\t\7\t\u0081"+
		"\n\t\f\t\16\t\u0084\13\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u008c\n\t\3\t\3\t"+
		"\7\t\u0090\n\t\f\t\16\t\u0093\13\t\3\t\3\t\3\t\3\t\3\t\5\t\u009a\n\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\7\n\u00a2\n\n\f\n\16\n\u00a5\13\n\3\13\3\13\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u00ae\n\f\3\r\3\r\3\r\7\r\u00b3\n\r\f\r\16\r\u00b6"+
		"\13\r\3\r\3\r\5\r\u00ba\n\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\7\17\u00c5\n\17\f\17\16\17\u00c8\13\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\7\17\u00d0\n\17\f\17\16\17\u00d3\13\17\3\17\3\17\3\17\3\20\3\20\5\20"+
		"\u00da\n\20\3\20\3\20\3\20\5\20\u00df\n\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\5\21\u00e7\n\21\3\22\3\22\3\22\5\22\u00ec\n\22\3\23\3\23\3\23\3\23"+
		"\7\23\u00f2\n\23\f\23\16\23\u00f5\13\23\3\23\3\23\3\24\3\24\3\24\5\24"+
		"\u00fc\n\24\3\24\3\24\3\24\3\24\3\24\5\24\u0103\n\24\3\24\3\24\7\24\u0107"+
		"\n\24\f\24\16\24\u010a\13\24\3\24\3\24\3\25\3\25\7\25\u0110\n\25\f\25"+
		"\16\25\u0113\13\25\3\25\3\25\3\25\3\26\3\26\5\26\u011a\n\26\3\27\3\27"+
		"\3\27\3\27\6\27\u0120\n\27\r\27\16\27\u0121\3\27\3\27\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u0131\n\31\f\31\16\31\u0134"+
		"\13\31\3\31\5\31\u0137\n\31\3\31\3\31\3\32\3\32\7\32\u013d\n\32\f\32\16"+
		"\32\u0140\13\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\7\34\u014b"+
		"\n\34\f\34\16\34\u014e\13\34\3\34\3\34\7\34\u0152\n\34\f\34\16\34\u0155"+
		"\13\34\3\35\3\35\3\35\7\35\u015a\n\35\f\35\16\35\u015d\13\35\3\36\3\36"+
		"\3\36\7\36\u0162\n\36\f\36\16\36\u0165\13\36\3\36\3\36\3\36\3\36\3\36"+
		"\5\36\u016c\n\36\5\36\u016e\n\36\3\37\3\37\5\37\u0172\n\37\3 \3 \3 \2"+
		"\2!\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>\2"+
		"\7\4\2\f\f\20\20\3\2\7\b\3\2\t\n\3\2\7\n\4\2\r\r\17\17\2\u017f\2@\3\2"+
		"\2\2\4I\3\2\2\2\6L\3\2\2\2\b_\3\2\2\2\na\3\2\2\2\fh\3\2\2\2\16l\3\2\2"+
		"\2\20\u0099\3\2\2\2\22\u009b\3\2\2\2\24\u00a6\3\2\2\2\26\u00ad\3\2\2\2"+
		"\30\u00af\3\2\2\2\32\u00bd\3\2\2\2\34\u00c0\3\2\2\2\36\u00d9\3\2\2\2 "+
		"\u00e3\3\2\2\2\"\u00eb\3\2\2\2$\u00ed\3\2\2\2&\u00f8\3\2\2\2(\u010d\3"+
		"\2\2\2*\u0119\3\2\2\2,\u011b\3\2\2\2.\u0128\3\2\2\2\60\u012c\3\2\2\2\62"+
		"\u013a\3\2\2\2\64\u0141\3\2\2\2\66\u0147\3\2\2\28\u0156\3\2\2\2:\u016d"+
		"\3\2\2\2<\u0171\3\2\2\2>\u0173\3\2\2\2@D\5\4\3\2AC\5\20\t\2BA\3\2\2\2"+
		"CF\3\2\2\2DB\3\2\2\2DE\3\2\2\2EG\3\2\2\2FD\3\2\2\2GH\5\16\b\2H\3\3\2\2"+
		"\2IJ\5\6\4\2JK\5\n\6\2K\5\3\2\2\2LP\7\5\2\2MO\5\b\5\2NM\3\2\2\2OR\3\2"+
		"\2\2PN\3\2\2\2PQ\3\2\2\2Q\7\3\2\2\2RP\3\2\2\2ST\7\13\2\2TU\7\f\2\2UV\7"+
		"\62\2\2VW\7&\2\2WX\7\17\2\2X`\7)\2\2YZ\7\13\2\2Z[\7\20\2\2[\\\7\62\2\2"+
		"\\]\7&\2\2]^\7\r\2\2^`\7)\2\2_S\3\2\2\2_Y\3\2\2\2`\t\3\2\2\2ae\7\6\2\2"+
		"bd\5\f\7\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\13\3\2\2\2ge\3\2\2"+
		"\2hi\5\24\13\2ij\7\62\2\2jk\7)\2\2k\r\3\2\2\2lm\7\4\2\2mn\7\"\2\2nr\7"+
		"#\2\2oq\5\26\f\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3"+
		"\2\2\2uv\7\3\2\2v\17\3\2\2\2wx\7\21\2\2xy\7\16\2\2yz\7\62\2\2z|\7\"\2"+
		"\2{}\5\22\n\2|{\3\2\2\2|}\3\2\2\2}~\3\2\2\2~\u0082\7#\2\2\177\u0081\5"+
		"\26\f\2\u0080\177\3\2\2\2\u0081\u0084\3\2\2\2\u0082\u0080\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u009a\7\3"+
		"\2\2\u0086\u0087\7\21\2\2\u0087\u0088\5\24\13\2\u0088\u0089\7\62\2\2\u0089"+
		"\u008b\7\"\2\2\u008a\u008c\5\22\n\2\u008b\u008a\3\2\2\2\u008b\u008c\3"+
		"\2\2\2\u008c\u008d\3\2\2\2\u008d\u0091\7#\2\2\u008e\u0090\5\26\f\2\u008f"+
		"\u008e\3\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0094\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0095\7\22\2\2\u0095"+
		"\u0096\5\66\34\2\u0096\u0097\7)\2\2\u0097\u0098\7\3\2\2\u0098\u009a\3"+
		"\2\2\2\u0099w\3\2\2\2\u0099\u0086\3\2\2\2\u009a\21\3\2\2\2\u009b\u009c"+
		"\5\24\13\2\u009c\u00a3\7\62\2\2\u009d\u009e\7\'\2\2\u009e\u009f\5\24\13"+
		"\2\u009f\u00a0\7\62\2\2\u00a0\u00a2\3\2\2\2\u00a1\u009d\3\2\2\2\u00a2"+
		"\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\23\3\2\2"+
		"\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\t\2\2\2\u00a7\25\3\2\2\2\u00a8\u00ae"+
		"\5*\26\2\u00a9\u00ae\5\"\22\2\u00aa\u00ae\5\30\r\2\u00ab\u00ae\5\34\17"+
		"\2\u00ac\u00ae\5\36\20\2\u00ad\u00a8\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad"+
		"\u00aa\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\27\3\2\2"+
		"\2\u00af\u00b0\7\62\2\2\u00b0\u00b4\7&\2\2\u00b1\u00b3\5\32\16\2\u00b2"+
		"\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b9\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00ba\5\66\34\2\u00b8"+
		"\u00ba\5\64\33\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba\u00bb\3"+
		"\2\2\2\u00bb\u00bc\7)\2\2\u00bc\31\3\2\2\2\u00bd\u00be\7\62\2\2\u00be"+
		"\u00bf\7&\2\2\u00bf\33\3\2\2\2\u00c0\u00c1\7$\2\2\u00c1\u00c6\7\62\2\2"+
		"\u00c2\u00c3\7\'\2\2\u00c3\u00c5\7\62\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c8"+
		"\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c9\u00ca\7%\2\2\u00ca\u00cb\7&\2\2\u00cb\u00cc\7$\2"+
		"\2\u00cc\u00d1\5> \2\u00cd\u00ce\7\'\2\2\u00ce\u00d0\5> \2\u00cf\u00cd"+
		"\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\u00d4\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00d5\7%\2\2\u00d5\u00d6\7)\2"+
		"\2\u00d6\35\3\2\2\2\u00d7\u00d8\7\62\2\2\u00d8\u00da\7&\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc\7\62\2\2"+
		"\u00dc\u00de\7\"\2\2\u00dd\u00df\5 \21\2\u00de\u00dd\3\2\2\2\u00de\u00df"+
		"\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\7#\2\2\u00e1\u00e2\7)\2\2\u00e2"+
		"\37\3\2\2\2\u00e3\u00e6\5\66\34\2\u00e4\u00e5\7\'\2\2\u00e5\u00e7\5\66"+
		"\34\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7!\3\2\2\2\u00e8\u00ec"+
		"\5$\23\2\u00e9\u00ec\5&\24\2\u00ea\u00ec\5(\25\2\u00eb\u00e8\3\2\2\2\u00eb"+
		"\u00e9\3\2\2\2\u00eb\u00ea\3\2\2\2\u00ec#\3\2\2\2\u00ed\u00ee\7\31\2\2"+
		"\u00ee\u00ef\5\66\34\2\u00ef\u00f3\7\26\2\2\u00f0\u00f2\5\26\f\2\u00f1"+
		"\u00f0\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2"+
		"\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f7\7\32\2\2\u00f7"+
		"%\3\2\2\2\u00f8\u00fb\7\36\2\2\u00f9\u00fa\7\62\2\2\u00fa\u00fc\7&\2\2"+
		"\u00fb\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe"+
		"\5<\37\2\u00fe\u00ff\7(\2\2\u00ff\u0102\5<\37\2\u0100\u0101\7(\2\2\u0101"+
		"\u0103\7\17\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3"+
		"\2\2\2\u0104\u0108\7\26\2\2\u0105\u0107\5\26\f\2\u0106\u0105\3\2\2\2\u0107"+
		"\u010a\3\2\2\2\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2"+
		"\2\2\u010a\u0108\3\2\2\2\u010b\u010c\7\37\2\2\u010c\'\3\2\2\2\u010d\u0111"+
		"\7 \2\2\u010e\u0110\5\26\f\2\u010f\u010e\3\2\2\2\u0110\u0113\3\2\2\2\u0111"+
		"\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113\u0111\3\2"+
		"\2\2\u0114\u0115\7!\2\2\u0115\u0116\5\66\34\2\u0116)\3\2\2\2\u0117\u011a"+
		"\5\60\31\2\u0118\u011a\5,\27\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2"+
		"\u011a+\3\2\2\2\u011b\u011c\7\33\2\2\u011c\u011d\58\35\2\u011d\u011f\7"+
		"\27\2\2\u011e\u0120\5.\30\2\u011f\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0121\u0122\3\2\2\2\u0122\u0123\3\2\2\2\u0123\u0124\7\35"+
		"\2\2\u0124\u0125\7(\2\2\u0125\u0126\5\26\f\2\u0126\u0127\7\34\2\2\u0127"+
		"-\3\2\2\2\u0128\u0129\7\17\2\2\u0129\u012a\7(\2\2\u012a\u012b\5\26\f\2"+
		"\u012b/\3\2\2\2\u012c\u012d\7\23\2\2\u012d\u012e\5\66\34\2\u012e\u0132"+
		"\7\25\2\2\u012f\u0131\5\26\f\2\u0130\u012f\3\2\2\2\u0131\u0134\3\2\2\2"+
		"\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132"+
		"\3\2\2\2\u0135\u0137\5\62\32\2\u0136\u0135\3\2\2\2\u0136\u0137\3\2\2\2"+
		"\u0137\u0138\3\2\2\2\u0138\u0139\7\24\2\2\u0139\61\3\2\2\2\u013a\u013e"+
		"\7\30\2\2\u013b\u013d\5\26\f\2\u013c\u013b\3\2\2\2\u013d\u0140\3\2\2\2"+
		"\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\63\3\2\2\2\u0140\u013e"+
		"\3\2\2\2\u0141\u0142\5\66\34\2\u0142\u0143\7*\2\2\u0143\u0144\5\66\34"+
		"\2\u0144\u0145\7(\2\2\u0145\u0146\5\66\34\2\u0146\65\3\2\2\2\u0147\u014c"+
		"\58\35\2\u0148\u0149\7+\2\2\u0149\u014b\58\35\2\u014a\u0148\3\2\2\2\u014b"+
		"\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c\u014d\3\2\2\2\u014d\u0153\3\2"+
		"\2\2\u014e\u014c\3\2\2\2\u014f\u0150\7\61\2\2\u0150\u0152\5\66\34\2\u0151"+
		"\u014f\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2"+
		"\2\2\u0154\67\3\2\2\2\u0155\u0153\3\2\2\2\u0156\u015b\5:\36\2\u0157\u0158"+
		"\t\3\2\2\u0158\u015a\5:\36\2\u0159\u0157\3\2\2\2\u015a\u015d\3\2\2\2\u015b"+
		"\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c9\3\2\2\2\u015d\u015b\3\2\2\2"+
		"\u015e\u0163\5<\37\2\u015f\u0160\t\4\2\2\u0160\u0162\5<\37\2\u0161\u015f"+
		"\3\2\2\2\u0162\u0165\3\2\2\2\u0163\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164"+
		"\u016e\3\2\2\2\u0165\u0163\3\2\2\2\u0166\u0167\7\"\2\2\u0167\u0168\58"+
		"\35\2\u0168\u016b\7#\2\2\u0169\u016a\t\5\2\2\u016a\u016c\58\35\2\u016b"+
		"\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u016e\3\2\2\2\u016d\u015e\3\2"+
		"\2\2\u016d\u0166\3\2\2\2\u016e;\3\2\2\2\u016f\u0172\5> \2\u0170\u0172"+
		"\7\62\2\2\u0171\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172=\3\2\2\2\u0173"+
		"\u0174\t\6\2\2\u0174?\3\2\2\2\'DP_er|\u0082\u008b\u0091\u0099\u00a3\u00ad"+
		"\u00b4\u00b9\u00c6\u00d1\u00d9\u00de\u00e6\u00eb\u00f3\u00fb\u0102\u0108"+
		"\u0111\u0119\u0121\u0132\u0136\u013e\u014c\u0153\u015b\u0163\u016b\u016d"+
		"\u0171";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}