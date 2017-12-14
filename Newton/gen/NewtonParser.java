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
		Div=8, Const=9, IntType=10, Boolean=11, VoidType=12, Int=13, BoolType=14, 
		BeginFunction=15, ReturnFunctin=16, BeginIf=17, EndIf=18, Then=19, Do=20, 
		Of=21, Else=22, BeginWhile=23, EndWhile=24, BeginSwitch=25, EndSwitch=26, 
		DefaultSwitch=27, BeginFor=28, EndFor=29, Repeat=30, Until=31, RoundBracketLeft=32, 
		RoundBracketRight=33, CurlyBracketLeft=34, CurlyBracketRight=35, Assign=36, 
		Comma=37, Colon=38, Semi=39, Ques=40, RelationOp=41, LogicalOp=42, Identifier=43, 
		WS=44;
	public static final int
		RULE_program = 0, RULE_programHeading = 1, RULE_constantDefinitionPart = 2, 
		RULE_constantDefinition = 3, RULE_variableDefinitionPart = 4, RULE_variableDefinition = 5, 
		RULE_mainStatement = 6, RULE_functionStatement = 7, RULE_tag = 8, RULE_baseType = 9, 
		RULE_statement = 10, RULE_assignmentStatement = 11, RULE_multipleAssigmentStatement = 12, 
		RULE_parallelAssigmentStatement = 13, RULE_callFunctionStatement = 14, 
		RULE_parameterList = 15, RULE_loopStatement = 16, RULE_whileStatement = 17, 
		RULE_forStatement = 18, RULE_doWhileStatement = 19, RULE_conditionalStatement = 20, 
		RULE_caseStatement = 21, RULE_ifStatement = 22, RULE_ternaryStatement = 23, 
		RULE_expression = 24, RULE_simpleExpression = 25, RULE_term = 26, RULE_factor = 27, 
		RULE_simpleFactor = 28;
	public static final String[] ruleNames = {
		"program", "programHeading", "constantDefinitionPart", "constantDefinition", 
		"variableDefinitionPart", "variableDefinition", "mainStatement", "functionStatement", 
		"tag", "baseType", "statement", "assignmentStatement", "multipleAssigmentStatement", 
		"parallelAssigmentStatement", "callFunctionStatement", "parameterList", 
		"loopStatement", "whileStatement", "forStatement", "doWhileStatement", 
		"conditionalStatement", "caseStatement", "ifStatement", "ternaryStatement", 
		"expression", "simpleExpression", "term", "factor", "simpleFactor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'end'", "'main'", "'constant:'", "'variable:'", "'+'", "'-'", "'*'", 
		"'/'", "'const'", "'int'", null, "'void'", null, "'bool'", "'fnc'", "'return'", 
		"'if'", "'endif'", "'then'", "'do'", "'of'", "'else'", "'while'", "'endwhile'", 
		"'switch'", "'endswitch'", "'default'", "'for'", "'endfor'", "'repeat'", 
		"'until'", "'('", "')'", "'{'", "'}'", "'='", "','", "':'", "';'", "'?'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EndBlock", "MainFnc", "DefConstant", "DefVariable", "Add", "Sub", 
		"Mul", "Div", "Const", "IntType", "Boolean", "VoidType", "Int", "BoolType", 
		"BeginFunction", "ReturnFunctin", "BeginIf", "EndIf", "Then", "Do", "Of", 
		"Else", "BeginWhile", "EndWhile", "BeginSwitch", "EndSwitch", "DefaultSwitch", 
		"BeginFor", "EndFor", "Repeat", "Until", "RoundBracketLeft", "RoundBracketRight", 
		"CurlyBracketLeft", "CurlyBracketRight", "Assign", "Comma", "Colon", "Semi", 
		"Ques", "RelationOp", "LogicalOp", "Identifier", "WS"
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
			setState(58);
			programHeading();
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BeginFunction) {
				{
				{
				setState(59);
				functionStatement();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
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
			setState(67);
			constantDefinitionPart();
			setState(68);
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
			setState(70);
			match(DefConstant);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Const) {
				{
				{
				setState(71);
				constantDefinition();
				}
				}
				setState(76);
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
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				match(Const);
				setState(78);
				match(IntType);
				setState(79);
				match(Identifier);
				setState(80);
				match(Assign);
				setState(81);
				match(Int);
				setState(82);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(83);
				match(Const);
				setState(84);
				match(BoolType);
				setState(85);
				match(Identifier);
				setState(86);
				match(Assign);
				setState(87);
				match(Boolean);
				setState(88);
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
			setState(91);
			match(DefVariable);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IntType || _la==BoolType) {
				{
				{
				setState(92);
				variableDefinition();
				}
				}
				setState(97);
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
			setState(98);
			baseType();
			setState(99);
			match(Identifier);
			setState(100);
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
			setState(102);
			match(MainFnc);
			setState(103);
			match(RoundBracketLeft);
			setState(104);
			match(RoundBracketRight);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BeginIf) | (1L << BeginWhile) | (1L << BeginSwitch) | (1L << BeginFor) | (1L << Repeat) | (1L << CurlyBracketLeft) | (1L << Identifier))) != 0)) {
				{
				{
				setState(105);
				statement();
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
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
			setState(147);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(BeginFunction);
				setState(114);
				match(VoidType);
				setState(115);
				match(Identifier);
				setState(116);
				match(RoundBracketLeft);
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IntType || _la==BoolType) {
					{
					setState(117);
					tag();
					}
				}

				setState(120);
				match(RoundBracketRight);
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BeginIf) | (1L << BeginWhile) | (1L << BeginSwitch) | (1L << BeginFor) | (1L << Repeat) | (1L << CurlyBracketLeft) | (1L << Identifier))) != 0)) {
					{
					{
					setState(121);
					statement();
					}
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(127);
				match(EndBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				match(BeginFunction);
				setState(129);
				baseType();
				setState(130);
				match(Identifier);
				setState(131);
				match(RoundBracketLeft);
				setState(133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IntType || _la==BoolType) {
					{
					setState(132);
					tag();
					}
				}

				setState(135);
				match(RoundBracketRight);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BeginIf) | (1L << BeginWhile) | (1L << BeginSwitch) | (1L << BeginFor) | (1L << Repeat) | (1L << CurlyBracketLeft) | (1L << Identifier))) != 0)) {
					{
					{
					setState(136);
					statement();
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(142);
				match(ReturnFunctin);
				setState(143);
				expression();
				setState(144);
				match(Semi);
				setState(145);
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
			setState(149);
			baseType();
			setState(150);
			match(Identifier);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(151);
				match(Comma);
				setState(152);
				baseType();
				setState(153);
				match(Identifier);
				}
				}
				setState(159);
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
			setState(160);
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
		public ParallelAssigmentStatementContext parallelAssigmentStatement() {
			return getRuleContext(ParallelAssigmentStatementContext.class,0);
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
			setState(167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				conditionalStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				loopStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				assignmentStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				parallelAssigmentStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
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
		public List<MultipleAssigmentStatementContext> multipleAssigmentStatement() {
			return getRuleContexts(MultipleAssigmentStatementContext.class);
		}
		public MultipleAssigmentStatementContext multipleAssigmentStatement(int i) {
			return getRuleContext(MultipleAssigmentStatementContext.class,i);
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
			setState(169);
			match(Identifier);
			setState(170);
			match(Assign);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(171);
					multipleAssigmentStatement();
					}
					} 
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(177);
				expression();
				}
				break;
			case 2:
				{
				setState(178);
				ternaryStatement();
				}
				break;
			}
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

	public static class MultipleAssigmentStatementContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(NewtonParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(NewtonParser.Assign, 0); }
		public MultipleAssigmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipleAssigmentStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitMultipleAssigmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipleAssigmentStatementContext multipleAssigmentStatement() throws RecognitionException {
		MultipleAssigmentStatementContext _localctx = new MultipleAssigmentStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_multipleAssigmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			match(Identifier);
			setState(184);
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

	public static class ParallelAssigmentStatementContext extends ParserRuleContext {
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
		public ParallelAssigmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parallelAssigmentStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitParallelAssigmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParallelAssigmentStatementContext parallelAssigmentStatement() throws RecognitionException {
		ParallelAssigmentStatementContext _localctx = new ParallelAssigmentStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parallelAssigmentStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(CurlyBracketLeft);
			setState(187);
			match(Identifier);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(188);
				match(Comma);
				setState(189);
				match(Identifier);
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			match(CurlyBracketRight);
			setState(196);
			match(Assign);
			setState(197);
			match(CurlyBracketLeft);
			setState(198);
			simpleFactor();
			setState(203);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(199);
				match(Comma);
				setState(200);
				simpleFactor();
				}
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(206);
			match(CurlyBracketRight);
			setState(207);
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
			setState(211);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(209);
				match(Identifier);
				setState(210);
				match(Assign);
				}
				break;
			}
			setState(213);
			match(Identifier);
			setState(214);
			match(RoundBracketLeft);
			setState(216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << Int) | (1L << RoundBracketLeft) | (1L << Identifier))) != 0)) {
				{
				setState(215);
				parameterList();
				}
			}

			setState(218);
			match(RoundBracketRight);
			setState(219);
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
			setState(221);
			expression();
			setState(224);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Comma) {
				{
				setState(222);
				match(Comma);
				setState(223);
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
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BeginWhile:
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				whileStatement();
				}
				break;
			case BeginFor:
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				forStatement();
				}
				break;
			case Repeat:
				enterOuterAlt(_localctx, 3);
				{
				setState(228);
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
			setState(231);
			match(BeginWhile);
			setState(232);
			expression();
			setState(233);
			match(Do);
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BeginIf) | (1L << BeginWhile) | (1L << BeginSwitch) | (1L << BeginFor) | (1L << Repeat) | (1L << CurlyBracketLeft) | (1L << Identifier))) != 0)) {
				{
				{
				setState(234);
				statement();
				}
				}
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(240);
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
			setState(242);
			match(BeginFor);
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(243);
				match(Identifier);
				setState(244);
				match(Assign);
				}
				break;
			}
			setState(247);
			factor();
			setState(248);
			match(Colon);
			setState(249);
			factor();
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Colon) {
				{
				setState(250);
				match(Colon);
				setState(251);
				match(Int);
				}
			}

			setState(254);
			match(Do);
			setState(258);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BeginIf) | (1L << BeginWhile) | (1L << BeginSwitch) | (1L << BeginFor) | (1L << Repeat) | (1L << CurlyBracketLeft) | (1L << Identifier))) != 0)) {
				{
				{
				setState(255);
				statement();
				}
				}
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(261);
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
			setState(263);
			match(Repeat);
			setState(267);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BeginIf) | (1L << BeginWhile) | (1L << BeginSwitch) | (1L << BeginFor) | (1L << Repeat) | (1L << CurlyBracketLeft) | (1L << Identifier))) != 0)) {
				{
				{
				setState(264);
				statement();
				}
				}
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(270);
			match(Until);
			setState(271);
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
		enterRule(_localctx, 40, RULE_conditionalStatement);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BeginIf:
				enterOuterAlt(_localctx, 1);
				{
				setState(273);
				ifStatement();
				}
				break;
			case BeginSwitch:
				enterOuterAlt(_localctx, 2);
				{
				setState(274);
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
		enterRule(_localctx, 42, RULE_caseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(BeginSwitch);
			setState(278);
			simpleExpression();
			setState(279);
			match(Of);
			setState(283); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(280);
				match(Int);
				setState(281);
				match(Colon);
				setState(282);
				statement();
				}
				}
				setState(285); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Int );
			setState(287);
			match(DefaultSwitch);
			setState(289); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(288);
				match(Colon);
				}
				}
				setState(291); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Colon );
			setState(293);
			statement();
			setState(294);
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
		enterRule(_localctx, 44, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			match(BeginIf);
			setState(297);
			expression();
			setState(298);
			match(Then);
			setState(299);
			statement();
			setState(307);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(300);
				match(Else);
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
				}
			}

			setState(309);
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
		enterRule(_localctx, 46, RULE_ternaryStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			expression();
			setState(312);
			match(Ques);
			setState(313);
			expression();
			setState(314);
			match(Colon);
			setState(315);
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
		enterRule(_localctx, 48, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			simpleExpression();
			setState(322);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RelationOp) {
				{
				{
				setState(318);
				match(RelationOp);
				setState(319);
				simpleExpression();
				}
				}
				setState(324);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(329);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(325);
					match(LogicalOp);
					setState(326);
					expression();
					}
					} 
				}
				setState(331);
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
		enterRule(_localctx, 50, RULE_simpleExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			term();
			setState(337);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(333);
					_la = _input.LA(1);
					if ( !(_la==Add || _la==Sub) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(334);
					term();
					}
					} 
				}
				setState(339);
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
		enterRule(_localctx, 52, RULE_term);
		int _la;
		try {
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Boolean:
			case Int:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(340);
				factor();
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Mul || _la==Div) {
					{
					{
					setState(341);
					_la = _input.LA(1);
					if ( !(_la==Mul || _la==Div) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(342);
					factor();
					}
					}
					setState(347);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case RoundBracketLeft:
				enterOuterAlt(_localctx, 2);
				{
				setState(348);
				match(RoundBracketLeft);
				setState(349);
				simpleExpression();
				setState(350);
				match(RoundBracketRight);
				setState(353);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(351);
					_la = _input.LA(1);
					if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Add) | (1L << Sub) | (1L << Mul) | (1L << Div))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(352);
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
		enterRule(_localctx, 54, RULE_factor);
		try {
			setState(359);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Boolean:
			case Int:
				enterOuterAlt(_localctx, 1);
				{
				setState(357);
				simpleFactor();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(358);
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
		enterRule(_localctx, 56, RULE_simpleFactor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3.\u016e\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\7\2?\n\2\f"+
		"\2\16\2B\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\7\4K\n\4\f\4\16\4N\13\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\\\n\5\3\6\3\6\7\6`\n"+
		"\6\f\6\16\6c\13\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bm\n\b\f\b\16\bp\13"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\5\ty\n\t\3\t\3\t\7\t}\n\t\f\t\16\t\u0080"+
		"\13\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0088\n\t\3\t\3\t\7\t\u008c\n\t\f\t"+
		"\16\t\u008f\13\t\3\t\3\t\3\t\3\t\3\t\5\t\u0096\n\t\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\7\n\u009e\n\n\f\n\16\n\u00a1\13\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\5"+
		"\f\u00aa\n\f\3\r\3\r\3\r\7\r\u00af\n\r\f\r\16\r\u00b2\13\r\3\r\3\r\5\r"+
		"\u00b6\n\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00c1\n\17"+
		"\f\17\16\17\u00c4\13\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00cc\n\17"+
		"\f\17\16\17\u00cf\13\17\3\17\3\17\3\17\3\20\3\20\5\20\u00d6\n\20\3\20"+
		"\3\20\3\20\5\20\u00db\n\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u00e3\n"+
		"\21\3\22\3\22\3\22\5\22\u00e8\n\22\3\23\3\23\3\23\3\23\7\23\u00ee\n\23"+
		"\f\23\16\23\u00f1\13\23\3\23\3\23\3\24\3\24\3\24\5\24\u00f8\n\24\3\24"+
		"\3\24\3\24\3\24\3\24\5\24\u00ff\n\24\3\24\3\24\7\24\u0103\n\24\f\24\16"+
		"\24\u0106\13\24\3\24\3\24\3\25\3\25\7\25\u010c\n\25\f\25\16\25\u010f\13"+
		"\25\3\25\3\25\3\25\3\26\3\26\5\26\u0116\n\26\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\6\27\u011e\n\27\r\27\16\27\u011f\3\27\3\27\6\27\u0124\n\27\r\27"+
		"\16\27\u0125\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\7\30\u0131\n"+
		"\30\f\30\16\30\u0134\13\30\5\30\u0136\n\30\3\30\3\30\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\7\32\u0143\n\32\f\32\16\32\u0146\13\32\3"+
		"\32\3\32\7\32\u014a\n\32\f\32\16\32\u014d\13\32\3\33\3\33\3\33\7\33\u0152"+
		"\n\33\f\33\16\33\u0155\13\33\3\34\3\34\3\34\7\34\u015a\n\34\f\34\16\34"+
		"\u015d\13\34\3\34\3\34\3\34\3\34\3\34\5\34\u0164\n\34\5\34\u0166\n\34"+
		"\3\35\3\35\5\35\u016a\n\35\3\36\3\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\7\4\2\f\f\20\20\3\2\7\b\3"+
		"\2\t\n\3\2\7\n\4\2\r\r\17\17\2\u0179\2<\3\2\2\2\4E\3\2\2\2\6H\3\2\2\2"+
		"\b[\3\2\2\2\n]\3\2\2\2\fd\3\2\2\2\16h\3\2\2\2\20\u0095\3\2\2\2\22\u0097"+
		"\3\2\2\2\24\u00a2\3\2\2\2\26\u00a9\3\2\2\2\30\u00ab\3\2\2\2\32\u00b9\3"+
		"\2\2\2\34\u00bc\3\2\2\2\36\u00d5\3\2\2\2 \u00df\3\2\2\2\"\u00e7\3\2\2"+
		"\2$\u00e9\3\2\2\2&\u00f4\3\2\2\2(\u0109\3\2\2\2*\u0115\3\2\2\2,\u0117"+
		"\3\2\2\2.\u012a\3\2\2\2\60\u0139\3\2\2\2\62\u013f\3\2\2\2\64\u014e\3\2"+
		"\2\2\66\u0165\3\2\2\28\u0169\3\2\2\2:\u016b\3\2\2\2<@\5\4\3\2=?\5\20\t"+
		"\2>=\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CD\5\16"+
		"\b\2D\3\3\2\2\2EF\5\6\4\2FG\5\n\6\2G\5\3\2\2\2HL\7\5\2\2IK\5\b\5\2JI\3"+
		"\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\7\3\2\2\2NL\3\2\2\2OP\7\13\2\2P"+
		"Q\7\f\2\2QR\7-\2\2RS\7&\2\2ST\7\17\2\2T\\\7)\2\2UV\7\13\2\2VW\7\20\2\2"+
		"WX\7-\2\2XY\7&\2\2YZ\7\r\2\2Z\\\7)\2\2[O\3\2\2\2[U\3\2\2\2\\\t\3\2\2\2"+
		"]a\7\6\2\2^`\5\f\7\2_^\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2b\13\3\2\2"+
		"\2ca\3\2\2\2de\5\24\13\2ef\7-\2\2fg\7)\2\2g\r\3\2\2\2hi\7\4\2\2ij\7\""+
		"\2\2jn\7#\2\2km\5\26\f\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2oq\3\2"+
		"\2\2pn\3\2\2\2qr\7\3\2\2r\17\3\2\2\2st\7\21\2\2tu\7\16\2\2uv\7-\2\2vx"+
		"\7\"\2\2wy\5\22\n\2xw\3\2\2\2xy\3\2\2\2yz\3\2\2\2z~\7#\2\2{}\5\26\f\2"+
		"|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\u0081\3\2\2\2\u0080"+
		"~\3\2\2\2\u0081\u0096\7\3\2\2\u0082\u0083\7\21\2\2\u0083\u0084\5\24\13"+
		"\2\u0084\u0085\7-\2\2\u0085\u0087\7\"\2\2\u0086\u0088\5\22\n\2\u0087\u0086"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008d\7#\2\2\u008a"+
		"\u008c\5\26\f\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3"+
		"\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0091\7\22\2\2\u0091\u0092\5\62\32\2\u0092\u0093\7)\2\2\u0093\u0094\7"+
		"\3\2\2\u0094\u0096\3\2\2\2\u0095s\3\2\2\2\u0095\u0082\3\2\2\2\u0096\21"+
		"\3\2\2\2\u0097\u0098\5\24\13\2\u0098\u009f\7-\2\2\u0099\u009a\7\'\2\2"+
		"\u009a\u009b\5\24\13\2\u009b\u009c\7-\2\2\u009c\u009e\3\2\2\2\u009d\u0099"+
		"\3\2\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\23\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\t\2\2\2\u00a3\25\3\2\2\2\u00a4"+
		"\u00aa\5*\26\2\u00a5\u00aa\5\"\22\2\u00a6\u00aa\5\30\r\2\u00a7\u00aa\5"+
		"\34\17\2\u00a8\u00aa\5\36\20\2\u00a9\u00a4\3\2\2\2\u00a9\u00a5\3\2\2\2"+
		"\u00a9\u00a6\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa\27"+
		"\3\2\2\2\u00ab\u00ac\7-\2\2\u00ac\u00b0\7&\2\2\u00ad\u00af\5\32\16\2\u00ae"+
		"\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b5\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\5\62\32\2\u00b4"+
		"\u00b6\5\60\31\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b7\3"+
		"\2\2\2\u00b7\u00b8\7)\2\2\u00b8\31\3\2\2\2\u00b9\u00ba\7-\2\2\u00ba\u00bb"+
		"\7&\2\2\u00bb\33\3\2\2\2\u00bc\u00bd\7$\2\2\u00bd\u00c2\7-\2\2\u00be\u00bf"+
		"\7\'\2\2\u00bf\u00c1\7-\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c5\u00c6\7%\2\2\u00c6\u00c7\7&\2\2\u00c7\u00c8\7$\2\2\u00c8\u00cd"+
		"\5:\36\2\u00c9\u00ca\7\'\2\2\u00ca\u00cc\5:\36\2\u00cb\u00c9\3\2\2\2\u00cc"+
		"\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00d0\3\2"+
		"\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7%\2\2\u00d1\u00d2\7)\2\2\u00d2\35"+
		"\3\2\2\2\u00d3\u00d4\7-\2\2\u00d4\u00d6\7&\2\2\u00d5\u00d3\3\2\2\2\u00d5"+
		"\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7-\2\2\u00d8\u00da\7\""+
		"\2\2\u00d9\u00db\5 \21\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db"+
		"\u00dc\3\2\2\2\u00dc\u00dd\7#\2\2\u00dd\u00de\7)\2\2\u00de\37\3\2\2\2"+
		"\u00df\u00e2\5\62\32\2\u00e0\u00e1\7\'\2\2\u00e1\u00e3\5\62\32\2\u00e2"+
		"\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3!\3\2\2\2\u00e4\u00e8\5$\23\2"+
		"\u00e5\u00e8\5&\24\2\u00e6\u00e8\5(\25\2\u00e7\u00e4\3\2\2\2\u00e7\u00e5"+
		"\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8#\3\2\2\2\u00e9\u00ea\7\31\2\2\u00ea"+
		"\u00eb\5\62\32\2\u00eb\u00ef\7\26\2\2\u00ec\u00ee\5\26\f\2\u00ed\u00ec"+
		"\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		"\u00f2\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f2\u00f3\7\32\2\2\u00f3%\3\2\2\2"+
		"\u00f4\u00f7\7\36\2\2\u00f5\u00f6\7-\2\2\u00f6\u00f8\7&\2\2\u00f7\u00f5"+
		"\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\58\35\2\u00fa"+
		"\u00fb\7(\2\2\u00fb\u00fe\58\35\2\u00fc\u00fd\7(\2\2\u00fd\u00ff\7\17"+
		"\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3\2\2\2\u0100"+
		"\u0104\7\26\2\2\u0101\u0103\5\26\f\2\u0102\u0101\3\2\2\2\u0103\u0106\3"+
		"\2\2\2\u0104\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0107\3\2\2\2\u0106"+
		"\u0104\3\2\2\2\u0107\u0108\7\37\2\2\u0108\'\3\2\2\2\u0109\u010d\7 \2\2"+
		"\u010a\u010c\5\26\f\2\u010b\u010a\3\2\2\2\u010c\u010f\3\2\2\2\u010d\u010b"+
		"\3\2\2\2\u010d\u010e\3\2\2\2\u010e\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110"+
		"\u0111\7!\2\2\u0111\u0112\5\62\32\2\u0112)\3\2\2\2\u0113\u0116\5.\30\2"+
		"\u0114\u0116\5,\27\2\u0115\u0113\3\2\2\2\u0115\u0114\3\2\2\2\u0116+\3"+
		"\2\2\2\u0117\u0118\7\33\2\2\u0118\u0119\5\64\33\2\u0119\u011d\7\27\2\2"+
		"\u011a\u011b\7\17\2\2\u011b\u011c\7(\2\2\u011c\u011e\5\26\f\2\u011d\u011a"+
		"\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u0123\7\35\2\2\u0122\u0124\7(\2\2\u0123\u0122\3\2"+
		"\2\2\u0124\u0125\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0128\5\26\f\2\u0128\u0129\7\34\2\2\u0129-\3\2\2"+
		"\2\u012a\u012b\7\23\2\2\u012b\u012c\5\62\32\2\u012c\u012d\7\25\2\2\u012d"+
		"\u0135\5\26\f\2\u012e\u0132\7\30\2\2\u012f\u0131\5\26\f\2\u0130\u012f"+
		"\3\2\2\2\u0131\u0134\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0135\u012e\3\2\2\2\u0135\u0136\3\2"+
		"\2\2\u0136\u0137\3\2\2\2\u0137\u0138\7\24\2\2\u0138/\3\2\2\2\u0139\u013a"+
		"\5\62\32\2\u013a\u013b\7*\2\2\u013b\u013c\5\62\32\2\u013c\u013d\7(\2\2"+
		"\u013d\u013e\5\62\32\2\u013e\61\3\2\2\2\u013f\u0144\5\64\33\2\u0140\u0141"+
		"\7+\2\2\u0141\u0143\5\64\33\2\u0142\u0140\3\2\2\2\u0143\u0146\3\2\2\2"+
		"\u0144\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u014b\3\2\2\2\u0146\u0144"+
		"\3\2\2\2\u0147\u0148\7,\2\2\u0148\u014a\5\62\32\2\u0149\u0147\3\2\2\2"+
		"\u014a\u014d\3\2\2\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\63"+
		"\3\2\2\2\u014d\u014b\3\2\2\2\u014e\u0153\5\66\34\2\u014f\u0150\t\3\2\2"+
		"\u0150\u0152\5\66\34\2\u0151\u014f\3\2\2\2\u0152\u0155\3\2\2\2\u0153\u0151"+
		"\3\2\2\2\u0153\u0154\3\2\2\2\u0154\65\3\2\2\2\u0155\u0153\3\2\2\2\u0156"+
		"\u015b\58\35\2\u0157\u0158\t\4\2\2\u0158\u015a\58\35\2\u0159\u0157\3\2"+
		"\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c"+
		"\u0166\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u015f\7\"\2\2\u015f\u0160\5\64"+
		"\33\2\u0160\u0163\7#\2\2\u0161\u0162\t\5\2\2\u0162\u0164\5\64\33\2\u0163"+
		"\u0161\3\2\2\2\u0163\u0164\3\2\2\2\u0164\u0166\3\2\2\2\u0165\u0156\3\2"+
		"\2\2\u0165\u015e\3\2\2\2\u0166\67\3\2\2\2\u0167\u016a\5:\36\2\u0168\u016a"+
		"\7-\2\2\u0169\u0167\3\2\2\2\u0169\u0168\3\2\2\2\u016a9\3\2\2\2\u016b\u016c"+
		"\t\6\2\2\u016c;\3\2\2\2\'@L[anx~\u0087\u008d\u0095\u009f\u00a9\u00b0\u00b5"+
		"\u00c2\u00cd\u00d5\u00da\u00e2\u00e7\u00ef\u00f7\u00fe\u0104\u010d\u0115"+
		"\u011f\u0125\u0132\u0135\u0144\u014b\u0153\u015b\u0163\u0165\u0169";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}