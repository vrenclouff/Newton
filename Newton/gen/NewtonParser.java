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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		BeginProgram=18, BeginBlock=19, EndBlock=20, MainFnc=21, Add=22, Sub=23, 
		Mul=24, Div=25, Const=26, IntType=27, Boolean=28, VoidType=29, Int=30, 
		Double=31, DoubleType=32, BoolType=33, BeginFunction=34, If=35, Else=36, 
		While=37, BracketLeft=38, BracketRight=39, Assign=40, Semi=41, RelationOp=42, 
		LogicalOp=43, Identifier=44, WS=45;
	public static final int
		RULE_program_begin = 0, RULE_cond_variables_dcl = 1, RULE_variables_dcl = 2, 
		RULE_constants_dcl = 3, RULE_functions_dcl = 4, RULE_function_dcl_single = 5, 
		RULE_function_return_type = 6, RULE_function_block = 7, RULE_variables_dcl_function = 8, 
		RULE_block = 9, RULE_function_call = 10, RULE_function_call_params = 11, 
		RULE_parameters = 12, RULE_assignment = 13, RULE_expression = 14, RULE_expression_priority = 15, 
		RULE_expression_item = 16, RULE_if_cond = 17, RULE_while_cond = 18, RULE_condition = 19, 
		RULE_expression_cond = 20, RULE_condition_item = 21, RULE_data_type = 22, 
		RULE_main = 23, RULE_program = 24, RULE_programHeading = 25, RULE_constantDefinitionPart = 26, 
		RULE_constantDefinition = 27, RULE_variableDefinitionPart = 28, RULE_variableDefinition = 29, 
		RULE_mainStatement = 30, RULE_functionStatement = 31, RULE_tag = 32, RULE_baseType = 33, 
		RULE_statement = 34, RULE_assignmentStatement = 35, RULE_callFunctionStatement = 36, 
		RULE_parameterList = 37, RULE_loopStatement = 38, RULE_whileStatement = 39, 
		RULE_forStatement = 40, RULE_doWhileStatement = 41, RULE_conditionalStatement = 42, 
		RULE_caseStatement = 43, RULE_ifStatement = 44, RULE_tExpression = 45, 
		RULE_simpleExpression = 46, RULE_term = 47, RULE_factor = 48;
	public static final String[] ruleNames = {
		"program_begin", "cond_variables_dcl", "variables_dcl", "constants_dcl", 
		"functions_dcl", "function_dcl_single", "function_return_type", "function_block", 
		"variables_dcl_function", "block", "function_call", "function_call_params", 
		"parameters", "assignment", "expression", "expression_priority", "expression_item", 
		"if_cond", "while_cond", "condition", "expression_cond", "condition_item", 
		"data_type", "main", "program", "programHeading", "constantDefinitionPart", 
		"constantDefinition", "variableDefinitionPart", "variableDefinition", 
		"mainStatement", "functionStatement", "tag", "baseType", "statement", 
		"assignmentStatement", "callFunctionStatement", "parameterList", "loopStatement", 
		"whileStatement", "forStatement", "doWhileStatement", "conditionalStatement", 
		"caseStatement", "ifStatement", "tExpression", "simpleExpression", "term", 
		"factor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'constant:'", "'variable:'", "'return'", "'do'", "'endwhile'", 
		"'for'", "':'", "'endfor'", "'repeat'", "'until'", "'switch'", "'of'", 
		"'default'", "'endswitch'", "'then'", "'endif'", "'start_program'", "'begin'", 
		"'end'", "'main'", "'+'", "'-'", "'*'", "'/'", "'const'", "'int'", null, 
		"'void'", null, null, "'double'", "'bool'", "'fnc'", "'if'", "'else'", 
		"'while'", "'('", "')'", "'='", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "BeginProgram", "BeginBlock", "EndBlock", 
		"MainFnc", "Add", "Sub", "Mul", "Div", "Const", "IntType", "Boolean", 
		"VoidType", "Int", "Double", "DoubleType", "BoolType", "BeginFunction", 
		"If", "Else", "While", "BracketLeft", "BracketRight", "Assign", "Semi", 
		"RelationOp", "LogicalOp", "Identifier", "WS"
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
	public static class Program_beginContext extends ParserRuleContext {
		public TerminalNode BeginProgram() { return getToken(NewtonParser.BeginProgram, 0); }
		public TerminalNode BeginBlock() { return getToken(NewtonParser.BeginBlock, 0); }
		public Cond_variables_dclContext cond_variables_dcl() {
			return getRuleContext(Cond_variables_dclContext.class,0);
		}
		public Functions_dclContext functions_dcl() {
			return getRuleContext(Functions_dclContext.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public TerminalNode EndBlock() { return getToken(NewtonParser.EndBlock, 0); }
		public Program_beginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_begin; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitProgram_begin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Program_beginContext program_begin() throws RecognitionException {
		Program_beginContext _localctx = new Program_beginContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program_begin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			match(BeginProgram);
			setState(99);
			match(BeginBlock);
			setState(100);
			cond_variables_dcl();
			setState(101);
			functions_dcl();
			setState(102);
			main();
			setState(103);
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

	public static class Cond_variables_dclContext extends ParserRuleContext {
		public Variables_dclContext variables_dcl() {
			return getRuleContext(Variables_dclContext.class,0);
		}
		public Cond_variables_dclContext cond_variables_dcl() {
			return getRuleContext(Cond_variables_dclContext.class,0);
		}
		public Constants_dclContext constants_dcl() {
			return getRuleContext(Constants_dclContext.class,0);
		}
		public Cond_variables_dclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cond_variables_dcl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitCond_variables_dcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Cond_variables_dclContext cond_variables_dcl() throws RecognitionException {
		Cond_variables_dclContext _localctx = new Cond_variables_dclContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cond_variables_dcl);
		try {
			setState(112);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntType:
			case DoubleType:
			case BoolType:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				variables_dcl();
				setState(106);
				cond_variables_dcl();
				}
				break;
			case Const:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				constants_dcl();
				setState(109);
				cond_variables_dcl();
				}
				break;
			case MainFnc:
			case BeginFunction:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Variables_dclContext extends ParserRuleContext {
		public TerminalNode BoolType() { return getToken(NewtonParser.BoolType, 0); }
		public TerminalNode Identifier() { return getToken(NewtonParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(NewtonParser.Assign, 0); }
		public Expression_condContext expression_cond() {
			return getRuleContext(Expression_condContext.class,0);
		}
		public TerminalNode Semi() { return getToken(NewtonParser.Semi, 0); }
		public TerminalNode IntType() { return getToken(NewtonParser.IntType, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DoubleType() { return getToken(NewtonParser.DoubleType, 0); }
		public Variables_dclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables_dcl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitVariables_dcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variables_dclContext variables_dcl() throws RecognitionException {
		Variables_dclContext _localctx = new Variables_dclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variables_dcl);
		try {
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BoolType:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(BoolType);
				setState(115);
				match(Identifier);
				setState(116);
				match(Assign);
				setState(117);
				expression_cond();
				setState(118);
				match(Semi);
				}
				break;
			case IntType:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(IntType);
				setState(121);
				match(Identifier);
				setState(122);
				match(Assign);
				setState(123);
				expression(0);
				setState(124);
				match(Semi);
				}
				break;
			case DoubleType:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				match(DoubleType);
				setState(127);
				match(Identifier);
				setState(128);
				match(Assign);
				setState(129);
				expression(0);
				setState(130);
				match(Semi);
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

	public static class Constants_dclContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(NewtonParser.Const, 0); }
		public TerminalNode BoolType() { return getToken(NewtonParser.BoolType, 0); }
		public TerminalNode Identifier() { return getToken(NewtonParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(NewtonParser.Assign, 0); }
		public Expression_condContext expression_cond() {
			return getRuleContext(Expression_condContext.class,0);
		}
		public TerminalNode Semi() { return getToken(NewtonParser.Semi, 0); }
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode IntType() { return getToken(NewtonParser.IntType, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode DoubleType() { return getToken(NewtonParser.DoubleType, 0); }
		public Constants_dclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constants_dcl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitConstants_dcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constants_dclContext constants_dcl() throws RecognitionException {
		Constants_dclContext _localctx = new Constants_dclContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_constants_dcl);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(Const);
				setState(135);
				match(BoolType);
				setState(136);
				match(Identifier);
				setState(137);
				match(Assign);
				setState(138);
				expression_cond();
				setState(139);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				match(Const);
				setState(142);
				match(Identifier);
				setState(143);
				match(Assign);
				setState(144);
				function_call();
				setState(145);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(147);
				match(Const);
				setState(148);
				match(IntType);
				setState(149);
				match(Identifier);
				setState(150);
				match(Assign);
				setState(151);
				expression(0);
				setState(152);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				match(Const);
				setState(155);
				match(DoubleType);
				setState(156);
				match(Identifier);
				setState(157);
				match(Assign);
				setState(158);
				expression(0);
				setState(159);
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

	public static class Functions_dclContext extends ParserRuleContext {
		public Function_dcl_singleContext function_dcl_single() {
			return getRuleContext(Function_dcl_singleContext.class,0);
		}
		public Functions_dclContext functions_dcl() {
			return getRuleContext(Functions_dclContext.class,0);
		}
		public Functions_dclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functions_dcl; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitFunctions_dcl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Functions_dclContext functions_dcl() throws RecognitionException {
		Functions_dclContext _localctx = new Functions_dclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functions_dcl);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BeginFunction:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				function_dcl_single();
				setState(164);
				functions_dcl();
				}
				break;
			case MainFnc:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Function_dcl_singleContext extends ParserRuleContext {
		public TerminalNode BeginFunction() { return getToken(NewtonParser.BeginFunction, 0); }
		public Function_return_typeContext function_return_type() {
			return getRuleContext(Function_return_typeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(NewtonParser.Identifier, 0); }
		public TerminalNode BracketLeft() { return getToken(NewtonParser.BracketLeft, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode BracketRight() { return getToken(NewtonParser.BracketRight, 0); }
		public TerminalNode BeginBlock() { return getToken(NewtonParser.BeginBlock, 0); }
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public TerminalNode EndBlock() { return getToken(NewtonParser.EndBlock, 0); }
		public Function_dcl_singleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_dcl_single; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitFunction_dcl_single(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_dcl_singleContext function_dcl_single() throws RecognitionException {
		Function_dcl_singleContext _localctx = new Function_dcl_singleContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_function_dcl_single);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(BeginFunction);
			setState(170);
			function_return_type();
			setState(171);
			match(Identifier);
			setState(172);
			match(BracketLeft);
			setState(173);
			parameters();
			setState(174);
			match(BracketRight);
			setState(175);
			match(BeginBlock);
			setState(176);
			function_block();
			setState(177);
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

	public static class Function_return_typeContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode VoidType() { return getToken(NewtonParser.VoidType, 0); }
		public Function_return_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_return_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitFunction_return_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_return_typeContext function_return_type() throws RecognitionException {
		Function_return_typeContext _localctx = new Function_return_typeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_function_return_type);
		try {
			setState(181);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntType:
			case DoubleType:
			case BoolType:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				data_type();
				}
				break;
			case VoidType:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(VoidType);
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

	public static class Function_blockContext extends ParserRuleContext {
		public Variables_dcl_functionContext variables_dcl_function() {
			return getRuleContext(Variables_dcl_functionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public Function_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitFunction_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_blockContext function_block() throws RecognitionException {
		Function_blockContext _localctx = new Function_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			variables_dcl_function();
			setState(184);
			block();
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

	public static class Variables_dcl_functionContext extends ParserRuleContext {
		public Variables_dclContext variables_dcl() {
			return getRuleContext(Variables_dclContext.class,0);
		}
		public Variables_dcl_functionContext variables_dcl_function() {
			return getRuleContext(Variables_dcl_functionContext.class,0);
		}
		public Variables_dcl_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables_dcl_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitVariables_dcl_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variables_dcl_functionContext variables_dcl_function() throws RecognitionException {
		Variables_dcl_functionContext _localctx = new Variables_dcl_functionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variables_dcl_function);
		try {
			setState(190);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntType:
			case DoubleType:
			case BoolType:
				enterOuterAlt(_localctx, 1);
				{
				setState(186);
				variables_dcl();
				setState(187);
				variables_dcl_function();
				}
				break;
			case EndBlock:
			case If:
			case While:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class BlockContext extends ParserRuleContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public TerminalNode Semi() { return getToken(NewtonParser.Semi, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public If_condContext if_cond() {
			return getRuleContext(If_condContext.class,0);
		}
		public While_condContext while_cond() {
			return getRuleContext(While_condContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_block);
		try {
			setState(207);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				function_call();
				setState(193);
				match(Semi);
				setState(194);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				assignment();
				setState(197);
				match(Semi);
				setState(198);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				if_cond();
				setState(201);
				block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(203);
				while_cond();
				setState(204);
				block();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
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

	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(NewtonParser.Identifier, 0); }
		public TerminalNode BracketLeft() { return getToken(NewtonParser.BracketLeft, 0); }
		public Function_call_paramsContext function_call_params() {
			return getRuleContext(Function_call_paramsContext.class,0);
		}
		public TerminalNode BracketRight() { return getToken(NewtonParser.BracketRight, 0); }
		public TerminalNode Semi() { return getToken(NewtonParser.Semi, 0); }
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(Identifier);
			setState(210);
			match(BracketLeft);
			setState(211);
			function_call_params();
			setState(212);
			match(BracketRight);
			setState(213);
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

	public static class Function_call_paramsContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Function_call_paramsContext function_call_params() {
			return getRuleContext(Function_call_paramsContext.class,0);
		}
		public Expression_condContext expression_cond() {
			return getRuleContext(Expression_condContext.class,0);
		}
		public Function_call_paramsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call_params; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitFunction_call_params(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_call_paramsContext function_call_params() throws RecognitionException {
		Function_call_paramsContext _localctx = new Function_call_paramsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_function_call_params);
		try {
			setState(225);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				expression(0);
				setState(217);
				match(T__0);
				setState(218);
				function_call_params();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				expression_cond();
				setState(221);
				match(T__0);
				setState(222);
				function_call_params();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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

	public static class ParametersContext extends ParserRuleContext {
		public Data_typeContext data_type() {
			return getRuleContext(Data_typeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(NewtonParser.Identifier, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_parameters);
		try {
			setState(236);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227);
				data_type();
				setState(228);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(230);
				data_type();
				setState(231);
				match(Identifier);
				setState(232);
				match(T__0);
				setState(233);
				parameters();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(NewtonParser.Identifier, 0); }
		public TerminalNode Assign() { return getToken(NewtonParser.Assign, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_condContext expression_cond() {
			return getRuleContext(Expression_condContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_assignment);
		try {
			setState(247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(238);
				match(Identifier);
				setState(239);
				match(Assign);
				setState(240);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(241);
				match(Identifier);
				setState(242);
				match(Assign);
				setState(243);
				expression_cond();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				match(Identifier);
				setState(245);
				match(Assign);
				setState(246);
				condition();
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

	public static class ExpressionContext extends ParserRuleContext {
		public Expression_priorityContext expression_priority() {
			return getRuleContext(Expression_priorityContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode Add() { return getToken(NewtonParser.Add, 0); }
		public TerminalNode Sub() { return getToken(NewtonParser.Sub, 0); }
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
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(250);
			expression_priority(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(260);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(258);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(252);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(253);
						match(Add);
						setState(254);
						expression_priority(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(255);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(256);
						match(Sub);
						setState(257);
						expression_priority(0);
						}
						break;
					}
					} 
				}
				setState(262);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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

	public static class Expression_priorityContext extends ParserRuleContext {
		public Expression_itemContext expression_item() {
			return getRuleContext(Expression_itemContext.class,0);
		}
		public Expression_priorityContext expression_priority() {
			return getRuleContext(Expression_priorityContext.class,0);
		}
		public TerminalNode Mul() { return getToken(NewtonParser.Mul, 0); }
		public TerminalNode Div() { return getToken(NewtonParser.Div, 0); }
		public Expression_priorityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_priority; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitExpression_priority(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_priorityContext expression_priority() throws RecognitionException {
		return expression_priority(0);
	}

	private Expression_priorityContext expression_priority(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expression_priorityContext _localctx = new Expression_priorityContext(_ctx, _parentState);
		Expression_priorityContext _prevctx = _localctx;
		int _startState = 30;
		enterRecursionRule(_localctx, 30, RULE_expression_priority, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(264);
			expression_item();
			}
			_ctx.stop = _input.LT(-1);
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(272);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new Expression_priorityContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression_priority);
						setState(266);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(267);
						match(Mul);
						setState(268);
						expression_item();
						}
						break;
					case 2:
						{
						_localctx = new Expression_priorityContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression_priority);
						setState(269);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(270);
						match(Div);
						setState(271);
						expression_item();
						}
						break;
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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

	public static class Expression_itemContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(NewtonParser.Identifier, 0); }
		public TerminalNode Int() { return getToken(NewtonParser.Int, 0); }
		public TerminalNode Double() { return getToken(NewtonParser.Double, 0); }
		public TerminalNode Boolean() { return getToken(NewtonParser.Boolean, 0); }
		public TerminalNode Add() { return getToken(NewtonParser.Add, 0); }
		public TerminalNode Sub() { return getToken(NewtonParser.Sub, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Expression_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitExpression_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_itemContext expression_item() throws RecognitionException {
		Expression_itemContext _localctx = new Expression_itemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expression_item);
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				match(Int);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(279);
				match(Double);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(280);
				match(Boolean);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(281);
				match(Add);
				setState(282);
				match(Int);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(283);
				match(Sub);
				setState(284);
				match(Int);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(285);
				match(Add);
				setState(286);
				match(Double);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(287);
				match(Sub);
				setState(288);
				match(Double);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(289);
				match(BracketLeft);
				setState(290);
				expression(0);
				setState(291);
				match(BracketRight);
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

	public static class If_condContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(NewtonParser.If, 0); }
		public TerminalNode BracketLeft() { return getToken(NewtonParser.BracketLeft, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode BracketRight() { return getToken(NewtonParser.BracketRight, 0); }
		public TerminalNode BeginBlock() { return getToken(NewtonParser.BeginBlock, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EndBlock() { return getToken(NewtonParser.EndBlock, 0); }
		public If_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_cond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitIf_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_condContext if_cond() throws RecognitionException {
		If_condContext _localctx = new If_condContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_if_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(If);
			setState(296);
			match(BracketLeft);
			setState(297);
			condition();
			setState(298);
			match(BracketRight);
			setState(299);
			match(BeginBlock);
			setState(300);
			block();
			setState(301);
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

	public static class While_condContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(NewtonParser.While, 0); }
		public TerminalNode BracketLeft() { return getToken(NewtonParser.BracketLeft, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode BracketRight() { return getToken(NewtonParser.BracketRight, 0); }
		public TerminalNode BeginBlock() { return getToken(NewtonParser.BeginBlock, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EndBlock() { return getToken(NewtonParser.EndBlock, 0); }
		public While_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_cond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitWhile_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_condContext while_cond() throws RecognitionException {
		While_condContext _localctx = new While_condContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_while_cond);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			match(While);
			setState(304);
			match(BracketLeft);
			setState(305);
			condition();
			setState(306);
			match(BracketRight);
			setState(307);
			match(BeginBlock);
			setState(308);
			block();
			setState(309);
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

	public static class ConditionContext extends ParserRuleContext {
		public Expression_condContext expression_cond() {
			return getRuleContext(Expression_condContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LogicalOp() { return getToken(NewtonParser.LogicalOp, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_condition);
		try {
			setState(316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(311);
				expression_cond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(312);
				expression(0);
				setState(313);
				match(LogicalOp);
				setState(314);
				expression_cond();
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

	public static class Expression_condContext extends ParserRuleContext {
		public TerminalNode Boolean() { return getToken(NewtonParser.Boolean, 0); }
		public List<Condition_itemContext> condition_item() {
			return getRuleContexts(Condition_itemContext.class);
		}
		public Condition_itemContext condition_item(int i) {
			return getRuleContext(Condition_itemContext.class,i);
		}
		public TerminalNode RelationOp() { return getToken(NewtonParser.RelationOp, 0); }
		public Expression_condContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression_cond; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitExpression_cond(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expression_condContext expression_cond() throws RecognitionException {
		Expression_condContext _localctx = new Expression_condContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expression_cond);
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(318);
				match(Boolean);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(319);
				condition_item();
				setState(320);
				match(RelationOp);
				setState(321);
				condition_item();
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

	public static class Condition_itemContext extends ParserRuleContext {
		public TerminalNode Boolean() { return getToken(NewtonParser.Boolean, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Condition_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_item; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitCondition_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_itemContext condition_item() throws RecognitionException {
		Condition_itemContext _localctx = new Condition_itemContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_condition_item);
		try {
			setState(330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(325);
				match(Boolean);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(326);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(327);
				match(BracketLeft);
				setState(328);
				match(Boolean);
				setState(329);
				match(BracketRight);
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

	public static class Data_typeContext extends ParserRuleContext {
		public TerminalNode IntType() { return getToken(NewtonParser.IntType, 0); }
		public TerminalNode DoubleType() { return getToken(NewtonParser.DoubleType, 0); }
		public TerminalNode BoolType() { return getToken(NewtonParser.BoolType, 0); }
		public Data_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_data_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitData_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Data_typeContext data_type() throws RecognitionException {
		Data_typeContext _localctx = new Data_typeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_data_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode MainFnc() { return getToken(NewtonParser.MainFnc, 0); }
		public TerminalNode BracketLeft() { return getToken(NewtonParser.BracketLeft, 0); }
		public TerminalNode BracketRight() { return getToken(NewtonParser.BracketRight, 0); }
		public TerminalNode BeginBlock() { return getToken(NewtonParser.BeginBlock, 0); }
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public TerminalNode EndBlock() { return getToken(NewtonParser.EndBlock, 0); }
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			match(MainFnc);
			setState(335);
			match(BracketLeft);
			setState(336);
			match(BracketRight);
			setState(337);
			match(BeginBlock);
			setState(338);
			function_block();
			setState(339);
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
		enterRule(_localctx, 48, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			programHeading();
			setState(345);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==BeginFunction) {
				{
				{
				setState(342);
				functionStatement();
				}
				}
				setState(347);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(348);
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
		enterRule(_localctx, 50, RULE_programHeading);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			constantDefinitionPart();
			setState(351);
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
		enterRule(_localctx, 52, RULE_constantDefinitionPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(T__1);
			setState(355); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(354);
				constantDefinition();
				}
				}
				setState(357); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Const );
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
		enterRule(_localctx, 54, RULE_constantDefinition);
		try {
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(359);
				match(Const);
				setState(360);
				match(IntType);
				setState(361);
				match(Identifier);
				setState(362);
				match(Assign);
				setState(363);
				match(Int);
				setState(364);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(365);
				match(Const);
				setState(366);
				match(DoubleType);
				setState(367);
				match(Identifier);
				setState(368);
				match(Assign);
				setState(369);
				match(Double);
				setState(370);
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
		enterRule(_localctx, 56, RULE_variableDefinitionPart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(T__2);
			setState(375); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(374);
				variableDefinition();
				}
				}
				setState(377); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntType) | (1L << DoubleType) | (1L << BoolType))) != 0) );
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
		public TerminalNode IntType() { return getToken(NewtonParser.IntType, 0); }
		public TerminalNode Identifier() { return getToken(NewtonParser.Identifier, 0); }
		public TerminalNode Semi() { return getToken(NewtonParser.Semi, 0); }
		public TerminalNode DoubleType() { return getToken(NewtonParser.DoubleType, 0); }
		public TerminalNode BoolType() { return getToken(NewtonParser.BoolType, 0); }
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
		enterRule(_localctx, 58, RULE_variableDefinition);
		try {
			setState(388);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntType:
				enterOuterAlt(_localctx, 1);
				{
				setState(379);
				match(IntType);
				setState(380);
				match(Identifier);
				setState(381);
				match(Semi);
				}
				break;
			case DoubleType:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				match(DoubleType);
				setState(383);
				match(Identifier);
				setState(384);
				match(Semi);
				}
				break;
			case BoolType:
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				match(BoolType);
				setState(386);
				match(Identifier);
				setState(387);
				match(Semi);
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

	public static class MainStatementContext extends ParserRuleContext {
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
		enterRule(_localctx, 60, RULE_mainStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(MainFnc);
			setState(391);
			match(BracketLeft);
			setState(392);
			match(BracketRight);
			setState(396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__11) | (1L << If) | (1L << While) | (1L << Identifier))) != 0)) {
				{
				{
				setState(393);
				statement();
				}
				}
				setState(398);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(399);
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
		public TExpressionContext tExpression() {
			return getRuleContext(TExpressionContext.class,0);
		}
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
		enterRule(_localctx, 62, RULE_functionStatement);
		int _la;
		try {
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				match(BeginFunction);
				setState(402);
				match(VoidType);
				setState(403);
				match(Identifier);
				setState(404);
				match(BracketLeft);
				setState(406);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntType) | (1L << DoubleType) | (1L << BoolType))) != 0)) {
					{
					setState(405);
					tag();
					}
				}

				setState(408);
				match(BracketRight);
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__11) | (1L << If) | (1L << While) | (1L << Identifier))) != 0)) {
					{
					{
					setState(409);
					statement();
					}
					}
					setState(414);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(415);
				match(EndBlock);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(416);
				match(BeginFunction);
				setState(417);
				baseType();
				setState(418);
				match(Identifier);
				setState(419);
				match(BracketLeft);
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntType) | (1L << DoubleType) | (1L << BoolType))) != 0)) {
					{
					setState(420);
					tag();
					}
				}

				setState(423);
				match(BracketRight);
				setState(427);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__11) | (1L << If) | (1L << While) | (1L << Identifier))) != 0)) {
					{
					{
					setState(424);
					statement();
					}
					}
					setState(429);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(430);
				match(T__3);
				setState(431);
				tExpression();
				setState(432);
				match(Semi);
				setState(433);
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
		enterRule(_localctx, 64, RULE_tag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			baseType();
			setState(438);
			match(Identifier);
			setState(445);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(439);
				match(T__0);
				setState(440);
				baseType();
				setState(441);
				match(Identifier);
				}
				}
				setState(447);
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
		enterRule(_localctx, 66, RULE_baseType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
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
		enterRule(_localctx, 68, RULE_statement);
		try {
			setState(454);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(450);
				conditionalStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				loopStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(452);
				assignmentStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(453);
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
		public TExpressionContext tExpression() {
			return getRuleContext(TExpressionContext.class,0);
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
		enterRule(_localctx, 70, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(456);
			match(Identifier);
			setState(457);
			match(Assign);
			setState(458);
			tExpression();
			setState(459);
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
		enterRule(_localctx, 72, RULE_callFunctionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(461);
				match(Identifier);
				setState(462);
				match(Assign);
				}
				break;
			}
			setState(465);
			match(Identifier);
			setState(466);
			match(BracketLeft);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Boolean) | (1L << Int) | (1L << Double) | (1L << BracketLeft) | (1L << Identifier))) != 0)) {
				{
				setState(467);
				parameterList();
				}
			}

			setState(470);
			match(BracketRight);
			setState(471);
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
		public List<TExpressionContext> tExpression() {
			return getRuleContexts(TExpressionContext.class);
		}
		public TExpressionContext tExpression(int i) {
			return getRuleContext(TExpressionContext.class,i);
		}
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
		enterRule(_localctx, 74, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(473);
			tExpression();
			setState(476);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(474);
				match(T__0);
				setState(475);
				tExpression();
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
		enterRule(_localctx, 76, RULE_loopStatement);
		try {
			setState(481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(478);
				whileStatement();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 2);
				{
				setState(479);
				forStatement();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(480);
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
		public TerminalNode While() { return getToken(NewtonParser.While, 0); }
		public TExpressionContext tExpression() {
			return getRuleContext(TExpressionContext.class,0);
		}
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
		enterRule(_localctx, 78, RULE_whileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(While);
			setState(484);
			tExpression();
			setState(485);
			match(T__4);
			setState(489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__11) | (1L << If) | (1L << While) | (1L << Identifier))) != 0)) {
				{
				{
				setState(486);
				statement();
				}
				}
				setState(491);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(492);
			match(T__5);
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
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(NewtonParser.Identifier, 0); }
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
		enterRule(_localctx, 80, RULE_forStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(494);
			match(T__6);
			setState(497);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(495);
				match(Identifier);
				setState(496);
				match(Assign);
				}
				break;
			}
			setState(499);
			factor();
			setState(500);
			match(T__7);
			setState(501);
			factor();
			setState(504);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__7) {
				{
				setState(502);
				match(T__7);
				setState(503);
				match(Int);
				}
			}

			setState(506);
			match(T__4);
			setState(510);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__11) | (1L << If) | (1L << While) | (1L << Identifier))) != 0)) {
				{
				{
				setState(507);
				statement();
				}
				}
				setState(512);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(513);
			match(T__8);
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
		public TExpressionContext tExpression() {
			return getRuleContext(TExpressionContext.class,0);
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
		enterRule(_localctx, 82, RULE_doWhileStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(T__9);
			setState(519);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__11) | (1L << If) | (1L << While) | (1L << Identifier))) != 0)) {
				{
				{
				setState(516);
				statement();
				}
				}
				setState(521);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(522);
			match(T__10);
			setState(523);
			tExpression();
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
		enterRule(_localctx, 84, RULE_conditionalStatement);
		try {
			setState(527);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case If:
				enterOuterAlt(_localctx, 1);
				{
				setState(525);
				ifStatement();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(526);
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
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> Int() { return getTokens(NewtonParser.Int); }
		public TerminalNode Int(int i) {
			return getToken(NewtonParser.Int, i);
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
		enterRule(_localctx, 86, RULE_caseStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			match(T__11);
			setState(530);
			simpleExpression();
			setState(531);
			match(T__12);
			setState(535); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(532);
				match(Int);
				setState(533);
				match(T__7);
				setState(534);
				statement();
				}
				}
				setState(537); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Int );
			setState(539);
			match(T__13);
			setState(541); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(540);
				match(T__7);
				}
				}
				setState(543); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__7 );
			setState(545);
			statement();
			setState(546);
			match(T__14);
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
		public TerminalNode If() { return getToken(NewtonParser.If, 0); }
		public TExpressionContext tExpression() {
			return getRuleContext(TExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
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
		enterRule(_localctx, 88, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			match(If);
			setState(549);
			tExpression();
			setState(550);
			match(T__15);
			setState(551);
			statement();
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Else) {
				{
				setState(552);
				match(Else);
				setState(556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__9) | (1L << T__11) | (1L << If) | (1L << While) | (1L << Identifier))) != 0)) {
					{
					{
					setState(553);
					statement();
					}
					}
					setState(558);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(561);
			match(T__16);
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

	public static class TExpressionContext extends ParserRuleContext {
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
		public List<TExpressionContext> tExpression() {
			return getRuleContexts(TExpressionContext.class);
		}
		public TExpressionContext tExpression(int i) {
			return getRuleContext(TExpressionContext.class,i);
		}
		public TExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tExpression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewtonVisitor ) return ((NewtonVisitor<? extends T>)visitor).visitTExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TExpressionContext tExpression() throws RecognitionException {
		TExpressionContext _localctx = new TExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_tExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			simpleExpression();
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==RelationOp) {
				{
				{
				setState(564);
				match(RelationOp);
				setState(565);
				simpleExpression();
				}
				}
				setState(570);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(575);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(571);
					match(LogicalOp);
					setState(572);
					tExpression();
					}
					} 
				}
				setState(577);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
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
		enterRule(_localctx, 92, RULE_simpleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			term();
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Add || _la==Sub) {
				{
				{
				setState(579);
				_la = _input.LA(1);
				if ( !(_la==Add || _la==Sub) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(580);
				term();
				}
				}
				setState(585);
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
		public SimpleExpressionContext simpleExpression() {
			return getRuleContext(SimpleExpressionContext.class,0);
		}
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
		enterRule(_localctx, 94, RULE_term);
		int _la;
		try {
			setState(598);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Boolean:
			case Int:
			case Double:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(586);
				factor();
				setState(591);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Mul || _la==Div) {
					{
					{
					setState(587);
					_la = _input.LA(1);
					if ( !(_la==Mul || _la==Div) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(588);
					factor();
					}
					}
					setState(593);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case BracketLeft:
				enterOuterAlt(_localctx, 2);
				{
				setState(594);
				match(BracketLeft);
				setState(595);
				simpleExpression();
				setState(596);
				match(BracketRight);
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
		enterRule(_localctx, 96, RULE_factor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 14:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 15:
			return expression_priority_sempred((Expression_priorityContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_priority_sempred(Expression_priorityContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u025d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3s\n\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0087\n\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u00a4\n\5\3\6\3\6\3\6\3\6\5\6\u00aa"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\5\b\u00b8\n\b\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u00c1\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00d2\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00e4\n\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ef\n\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00fa\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\7\20\u0105\n\20\f\20\16\20\u0108\13\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u0113\n\21\f\21\16\21\u0116"+
		"\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u0128\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u013f\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u0146\n\26\3\27\3\27\3\27\3"+
		"\27\3\27\5\27\u014d\n\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\32\3\32\7\32\u015a\n\32\f\32\16\32\u015d\13\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\34\3\34\6\34\u0166\n\34\r\34\16\34\u0167\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0176\n\35\3\36\3\36\6\36"+
		"\u017a\n\36\r\36\16\36\u017b\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\5\37\u0187\n\37\3 \3 \3 \3 \7 \u018d\n \f \16 \u0190\13 \3 \3 \3!"+
		"\3!\3!\3!\3!\5!\u0199\n!\3!\3!\7!\u019d\n!\f!\16!\u01a0\13!\3!\3!\3!\3"+
		"!\3!\3!\5!\u01a8\n!\3!\3!\7!\u01ac\n!\f!\16!\u01af\13!\3!\3!\3!\3!\3!"+
		"\5!\u01b6\n!\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u01be\n\"\f\"\16\"\u01c1\13\""+
		"\3#\3#\3$\3$\3$\3$\5$\u01c9\n$\3%\3%\3%\3%\3%\3&\3&\5&\u01d2\n&\3&\3&"+
		"\3&\5&\u01d7\n&\3&\3&\3&\3\'\3\'\3\'\5\'\u01df\n\'\3(\3(\3(\5(\u01e4\n"+
		"(\3)\3)\3)\3)\7)\u01ea\n)\f)\16)\u01ed\13)\3)\3)\3*\3*\3*\5*\u01f4\n*"+
		"\3*\3*\3*\3*\3*\5*\u01fb\n*\3*\3*\7*\u01ff\n*\f*\16*\u0202\13*\3*\3*\3"+
		"+\3+\7+\u0208\n+\f+\16+\u020b\13+\3+\3+\3+\3,\3,\5,\u0212\n,\3-\3-\3-"+
		"\3-\3-\3-\6-\u021a\n-\r-\16-\u021b\3-\3-\6-\u0220\n-\r-\16-\u0221\3-\3"+
		"-\3-\3.\3.\3.\3.\3.\3.\7.\u022d\n.\f.\16.\u0230\13.\5.\u0232\n.\3.\3."+
		"\3/\3/\3/\7/\u0239\n/\f/\16/\u023c\13/\3/\3/\7/\u0240\n/\f/\16/\u0243"+
		"\13/\3\60\3\60\3\60\7\60\u0248\n\60\f\60\16\60\u024b\13\60\3\61\3\61\3"+
		"\61\7\61\u0250\n\61\f\61\16\61\u0253\13\61\3\61\3\61\3\61\3\61\5\61\u0259"+
		"\n\61\3\62\3\62\3\62\2\4\36 \63\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`b\2\6\4\2\35\35\"#\3\2\30\31"+
		"\3\2\32\33\5\2\36\36 !..\2\u0274\2d\3\2\2\2\4r\3\2\2\2\6\u0086\3\2\2\2"+
		"\b\u00a3\3\2\2\2\n\u00a9\3\2\2\2\f\u00ab\3\2\2\2\16\u00b7\3\2\2\2\20\u00b9"+
		"\3\2\2\2\22\u00c0\3\2\2\2\24\u00d1\3\2\2\2\26\u00d3\3\2\2\2\30\u00e3\3"+
		"\2\2\2\32\u00ee\3\2\2\2\34\u00f9\3\2\2\2\36\u00fb\3\2\2\2 \u0109\3\2\2"+
		"\2\"\u0127\3\2\2\2$\u0129\3\2\2\2&\u0131\3\2\2\2(\u013e\3\2\2\2*\u0145"+
		"\3\2\2\2,\u014c\3\2\2\2.\u014e\3\2\2\2\60\u0150\3\2\2\2\62\u0157\3\2\2"+
		"\2\64\u0160\3\2\2\2\66\u0163\3\2\2\28\u0175\3\2\2\2:\u0177\3\2\2\2<\u0186"+
		"\3\2\2\2>\u0188\3\2\2\2@\u01b5\3\2\2\2B\u01b7\3\2\2\2D\u01c2\3\2\2\2F"+
		"\u01c8\3\2\2\2H\u01ca\3\2\2\2J\u01d1\3\2\2\2L\u01db\3\2\2\2N\u01e3\3\2"+
		"\2\2P\u01e5\3\2\2\2R\u01f0\3\2\2\2T\u0205\3\2\2\2V\u0211\3\2\2\2X\u0213"+
		"\3\2\2\2Z\u0226\3\2\2\2\\\u0235\3\2\2\2^\u0244\3\2\2\2`\u0258\3\2\2\2"+
		"b\u025a\3\2\2\2de\7\24\2\2ef\7\25\2\2fg\5\4\3\2gh\5\n\6\2hi\5\60\31\2"+
		"ij\7\26\2\2j\3\3\2\2\2kl\5\6\4\2lm\5\4\3\2ms\3\2\2\2no\5\b\5\2op\5\4\3"+
		"\2ps\3\2\2\2qs\3\2\2\2rk\3\2\2\2rn\3\2\2\2rq\3\2\2\2s\5\3\2\2\2tu\7#\2"+
		"\2uv\7.\2\2vw\7*\2\2wx\5*\26\2xy\7+\2\2y\u0087\3\2\2\2z{\7\35\2\2{|\7"+
		".\2\2|}\7*\2\2}~\5\36\20\2~\177\7+\2\2\177\u0087\3\2\2\2\u0080\u0081\7"+
		"\"\2\2\u0081\u0082\7.\2\2\u0082\u0083\7*\2\2\u0083\u0084\5\36\20\2\u0084"+
		"\u0085\7+\2\2\u0085\u0087\3\2\2\2\u0086t\3\2\2\2\u0086z\3\2\2\2\u0086"+
		"\u0080\3\2\2\2\u0087\7\3\2\2\2\u0088\u0089\7\34\2\2\u0089\u008a\7#\2\2"+
		"\u008a\u008b\7.\2\2\u008b\u008c\7*\2\2\u008c\u008d\5*\26\2\u008d\u008e"+
		"\7+\2\2\u008e\u00a4\3\2\2\2\u008f\u0090\7\34\2\2\u0090\u0091\7.\2\2\u0091"+
		"\u0092\7*\2\2\u0092\u0093\5\26\f\2\u0093\u0094\7+\2\2\u0094\u00a4\3\2"+
		"\2\2\u0095\u0096\7\34\2\2\u0096\u0097\7\35\2\2\u0097\u0098\7.\2\2\u0098"+
		"\u0099\7*\2\2\u0099\u009a\5\36\20\2\u009a\u009b\7+\2\2\u009b\u00a4\3\2"+
		"\2\2\u009c\u009d\7\34\2\2\u009d\u009e\7\"\2\2\u009e\u009f\7.\2\2\u009f"+
		"\u00a0\7*\2\2\u00a0\u00a1\5\36\20\2\u00a1\u00a2\7+\2\2\u00a2\u00a4\3\2"+
		"\2\2\u00a3\u0088\3\2\2\2\u00a3\u008f\3\2\2\2\u00a3\u0095\3\2\2\2\u00a3"+
		"\u009c\3\2\2\2\u00a4\t\3\2\2\2\u00a5\u00a6\5\f\7\2\u00a6\u00a7\5\n\6\2"+
		"\u00a7\u00aa\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a5\3\2\2\2\u00a9\u00a8"+
		"\3\2\2\2\u00aa\13\3\2\2\2\u00ab\u00ac\7$\2\2\u00ac\u00ad\5\16\b\2\u00ad"+
		"\u00ae\7.\2\2\u00ae\u00af\7(\2\2\u00af\u00b0\5\32\16\2\u00b0\u00b1\7)"+
		"\2\2\u00b1\u00b2\7\25\2\2\u00b2\u00b3\5\20\t\2\u00b3\u00b4\7\26\2\2\u00b4"+
		"\r\3\2\2\2\u00b5\u00b8\5.\30\2\u00b6\u00b8\7\37\2\2\u00b7\u00b5\3\2\2"+
		"\2\u00b7\u00b6\3\2\2\2\u00b8\17\3\2\2\2\u00b9\u00ba\5\22\n\2\u00ba\u00bb"+
		"\5\24\13\2\u00bb\21\3\2\2\2\u00bc\u00bd\5\6\4\2\u00bd\u00be\5\22\n\2\u00be"+
		"\u00c1\3\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00bc\3\2\2\2\u00c0\u00bf\3\2"+
		"\2\2\u00c1\23\3\2\2\2\u00c2\u00c3\5\26\f\2\u00c3\u00c4\7+\2\2\u00c4\u00c5"+
		"\5\24\13\2\u00c5\u00d2\3\2\2\2\u00c6\u00c7\5\34\17\2\u00c7\u00c8\7+\2"+
		"\2\u00c8\u00c9\5\24\13\2\u00c9\u00d2\3\2\2\2\u00ca\u00cb\5$\23\2\u00cb"+
		"\u00cc\5\24\13\2\u00cc\u00d2\3\2\2\2\u00cd\u00ce\5&\24\2\u00ce\u00cf\5"+
		"\24\13\2\u00cf\u00d2\3\2\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00c2\3\2\2\2\u00d1"+
		"\u00c6\3\2\2\2\u00d1\u00ca\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d1\u00d0\3\2"+
		"\2\2\u00d2\25\3\2\2\2\u00d3\u00d4\7.\2\2\u00d4\u00d5\7(\2\2\u00d5\u00d6"+
		"\5\30\r\2\u00d6\u00d7\7)\2\2\u00d7\u00d8\7+\2\2\u00d8\27\3\2\2\2\u00d9"+
		"\u00e4\5\36\20\2\u00da\u00db\5\36\20\2\u00db\u00dc\7\3\2\2\u00dc\u00dd"+
		"\5\30\r\2\u00dd\u00e4\3\2\2\2\u00de\u00df\5*\26\2\u00df\u00e0\7\3\2\2"+
		"\u00e0\u00e1\5\30\r\2\u00e1\u00e4\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00d9"+
		"\3\2\2\2\u00e3\u00da\3\2\2\2\u00e3\u00de\3\2\2\2\u00e3\u00e2\3\2\2\2\u00e4"+
		"\31\3\2\2\2\u00e5\u00e6\5.\30\2\u00e6\u00e7\7.\2\2\u00e7\u00ef\3\2\2\2"+
		"\u00e8\u00e9\5.\30\2\u00e9\u00ea\7.\2\2\u00ea\u00eb\7\3\2\2\u00eb\u00ec"+
		"\5\32\16\2\u00ec\u00ef\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00e5\3\2\2\2"+
		"\u00ee\u00e8\3\2\2\2\u00ee\u00ed\3\2\2\2\u00ef\33\3\2\2\2\u00f0\u00f1"+
		"\7.\2\2\u00f1\u00f2\7*\2\2\u00f2\u00fa\5\36\20\2\u00f3\u00f4\7.\2\2\u00f4"+
		"\u00f5\7*\2\2\u00f5\u00fa\5*\26\2\u00f6\u00f7\7.\2\2\u00f7\u00f8\7*\2"+
		"\2\u00f8\u00fa\5(\25\2\u00f9\u00f0\3\2\2\2\u00f9\u00f3\3\2\2\2\u00f9\u00f6"+
		"\3\2\2\2\u00fa\35\3\2\2\2\u00fb\u00fc\b\20\1\2\u00fc\u00fd\5 \21\2\u00fd"+
		"\u0106\3\2\2\2\u00fe\u00ff\f\5\2\2\u00ff\u0100\7\30\2\2\u0100\u0105\5"+
		" \21\2\u0101\u0102\f\4\2\2\u0102\u0103\7\31\2\2\u0103\u0105\5 \21\2\u0104"+
		"\u00fe\3\2\2\2\u0104\u0101\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2"+
		"\2\2\u0106\u0107\3\2\2\2\u0107\37\3\2\2\2\u0108\u0106\3\2\2\2\u0109\u010a"+
		"\b\21\1\2\u010a\u010b\5\"\22\2\u010b\u0114\3\2\2\2\u010c\u010d\f\5\2\2"+
		"\u010d\u010e\7\32\2\2\u010e\u0113\5\"\22\2\u010f\u0110\f\4\2\2\u0110\u0111"+
		"\7\33\2\2\u0111\u0113\5\"\22\2\u0112\u010c\3\2\2\2\u0112\u010f\3\2\2\2"+
		"\u0113\u0116\3\2\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115!\3"+
		"\2\2\2\u0116\u0114\3\2\2\2\u0117\u0128\7.\2\2\u0118\u0128\7 \2\2\u0119"+
		"\u0128\7!\2\2\u011a\u0128\7\36\2\2\u011b\u011c\7\30\2\2\u011c\u0128\7"+
		" \2\2\u011d\u011e\7\31\2\2\u011e\u0128\7 \2\2\u011f\u0120\7\30\2\2\u0120"+
		"\u0128\7!\2\2\u0121\u0122\7\31\2\2\u0122\u0128\7!\2\2\u0123\u0124\7(\2"+
		"\2\u0124\u0125\5\36\20\2\u0125\u0126\7)\2\2\u0126\u0128\3\2\2\2\u0127"+
		"\u0117\3\2\2\2\u0127\u0118\3\2\2\2\u0127\u0119\3\2\2\2\u0127\u011a\3\2"+
		"\2\2\u0127\u011b\3\2\2\2\u0127\u011d\3\2\2\2\u0127\u011f\3\2\2\2\u0127"+
		"\u0121\3\2\2\2\u0127\u0123\3\2\2\2\u0128#\3\2\2\2\u0129\u012a\7%\2\2\u012a"+
		"\u012b\7(\2\2\u012b\u012c\5(\25\2\u012c\u012d\7)\2\2\u012d\u012e\7\25"+
		"\2\2\u012e\u012f\5\24\13\2\u012f\u0130\7\26\2\2\u0130%\3\2\2\2\u0131\u0132"+
		"\7\'\2\2\u0132\u0133\7(\2\2\u0133\u0134\5(\25\2\u0134\u0135\7)\2\2\u0135"+
		"\u0136\7\25\2\2\u0136\u0137\5\24\13\2\u0137\u0138\7\26\2\2\u0138\'\3\2"+
		"\2\2\u0139\u013f\5*\26\2\u013a\u013b\5\36\20\2\u013b\u013c\7-\2\2\u013c"+
		"\u013d\5*\26\2\u013d\u013f\3\2\2\2\u013e\u0139\3\2\2\2\u013e\u013a\3\2"+
		"\2\2\u013f)\3\2\2\2\u0140\u0146\7\36\2\2\u0141\u0142\5,\27\2\u0142\u0143"+
		"\7,\2\2\u0143\u0144\5,\27\2\u0144\u0146\3\2\2\2\u0145\u0140\3\2\2\2\u0145"+
		"\u0141\3\2\2\2\u0146+\3\2\2\2\u0147\u014d\7\36\2\2\u0148\u014d\5\36\20"+
		"\2\u0149\u014a\7(\2\2\u014a\u014b\7\36\2\2\u014b\u014d\7)\2\2\u014c\u0147"+
		"\3\2\2\2\u014c\u0148\3\2\2\2\u014c\u0149\3\2\2\2\u014d-\3\2\2\2\u014e"+
		"\u014f\t\2\2\2\u014f/\3\2\2\2\u0150\u0151\7\27\2\2\u0151\u0152\7(\2\2"+
		"\u0152\u0153\7)\2\2\u0153\u0154\7\25\2\2\u0154\u0155\5\20\t\2\u0155\u0156"+
		"\7\26\2\2\u0156\61\3\2\2\2\u0157\u015b\5\64\33\2\u0158\u015a\5@!\2\u0159"+
		"\u0158\3\2\2\2\u015a\u015d\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2"+
		"\2\2\u015c\u015e\3\2\2\2\u015d\u015b\3\2\2\2\u015e\u015f\5> \2\u015f\63"+
		"\3\2\2\2\u0160\u0161\5\66\34\2\u0161\u0162\5:\36\2\u0162\65\3\2\2\2\u0163"+
		"\u0165\7\4\2\2\u0164\u0166\58\35\2\u0165\u0164\3\2\2\2\u0166\u0167\3\2"+
		"\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\67\3\2\2\2\u0169\u016a"+
		"\7\34\2\2\u016a\u016b\7\35\2\2\u016b\u016c\7.\2\2\u016c\u016d\7*\2\2\u016d"+
		"\u016e\7 \2\2\u016e\u0176\7+\2\2\u016f\u0170\7\34\2\2\u0170\u0171\7\""+
		"\2\2\u0171\u0172\7.\2\2\u0172\u0173\7*\2\2\u0173\u0174\7!\2\2\u0174\u0176"+
		"\7+\2\2\u0175\u0169\3\2\2\2\u0175\u016f\3\2\2\2\u01769\3\2\2\2\u0177\u0179"+
		"\7\5\2\2\u0178\u017a\5<\37\2\u0179\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c;\3\2\2\2\u017d\u017e\7\35\2\2"+
		"\u017e\u017f\7.\2\2\u017f\u0187\7+\2\2\u0180\u0181\7\"\2\2\u0181\u0182"+
		"\7.\2\2\u0182\u0187\7+\2\2\u0183\u0184\7#\2\2\u0184\u0185\7.\2\2\u0185"+
		"\u0187\7+\2\2\u0186\u017d\3\2\2\2\u0186\u0180\3\2\2\2\u0186\u0183\3\2"+
		"\2\2\u0187=\3\2\2\2\u0188\u0189\7\27\2\2\u0189\u018a\7(\2\2\u018a\u018e"+
		"\7)\2\2\u018b\u018d\5F$\2\u018c\u018b\3\2\2\2\u018d\u0190\3\2\2\2\u018e"+
		"\u018c\3\2\2\2\u018e\u018f\3\2\2\2\u018f\u0191\3\2\2\2\u0190\u018e\3\2"+
		"\2\2\u0191\u0192\7\26\2\2\u0192?\3\2\2\2\u0193\u0194\7$\2\2\u0194\u0195"+
		"\7\37\2\2\u0195\u0196\7.\2\2\u0196\u0198\7(\2\2\u0197\u0199\5B\"\2\u0198"+
		"\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019e\7)"+
		"\2\2\u019b\u019d\5F$\2\u019c\u019b\3\2\2\2\u019d\u01a0\3\2\2\2\u019e\u019c"+
		"\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u019e\3\2\2\2\u01a1"+
		"\u01b6\7\26\2\2\u01a2\u01a3\7$\2\2\u01a3\u01a4\5D#\2\u01a4\u01a5\7.\2"+
		"\2\u01a5\u01a7\7(\2\2\u01a6\u01a8\5B\"\2\u01a7\u01a6\3\2\2\2\u01a7\u01a8"+
		"\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ad\7)\2\2\u01aa\u01ac\5F$\2\u01ab"+
		"\u01aa\3\2\2\2\u01ac\u01af\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ad\u01ae\3\2"+
		"\2\2\u01ae\u01b0\3\2\2\2\u01af\u01ad\3\2\2\2\u01b0\u01b1\7\6\2\2\u01b1"+
		"\u01b2\5\\/\2\u01b2\u01b3\7+\2\2\u01b3\u01b4\7\26\2\2\u01b4\u01b6\3\2"+
		"\2\2\u01b5\u0193\3\2\2\2\u01b5\u01a2\3\2\2\2\u01b6A\3\2\2\2\u01b7\u01b8"+
		"\5D#\2\u01b8\u01bf\7.\2\2\u01b9\u01ba\7\3\2\2\u01ba\u01bb\5D#\2\u01bb"+
		"\u01bc\7.\2\2\u01bc\u01be\3\2\2\2\u01bd\u01b9\3\2\2\2\u01be\u01c1\3\2"+
		"\2\2\u01bf\u01bd\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0C\3\2\2\2\u01c1\u01bf"+
		"\3\2\2\2\u01c2\u01c3\t\2\2\2\u01c3E\3\2\2\2\u01c4\u01c9\5V,\2\u01c5\u01c9"+
		"\5N(\2\u01c6\u01c9\5H%\2\u01c7\u01c9\5J&\2\u01c8\u01c4\3\2\2\2\u01c8\u01c5"+
		"\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c8\u01c7\3\2\2\2\u01c9G\3\2\2\2\u01ca"+
		"\u01cb\7.\2\2\u01cb\u01cc\7*\2\2\u01cc\u01cd\5\\/\2\u01cd\u01ce\7+\2\2"+
		"\u01ceI\3\2\2\2\u01cf\u01d0\7.\2\2\u01d0\u01d2\7*\2\2\u01d1\u01cf\3\2"+
		"\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\7.\2\2\u01d4"+
		"\u01d6\7(\2\2\u01d5\u01d7\5L\'\2\u01d6\u01d5\3\2\2\2\u01d6\u01d7\3\2\2"+
		"\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\7)\2\2\u01d9\u01da\7+\2\2\u01daK\3"+
		"\2\2\2\u01db\u01de\5\\/\2\u01dc\u01dd\7\3\2\2\u01dd\u01df\5\\/\2\u01de"+
		"\u01dc\3\2\2\2\u01de\u01df\3\2\2\2\u01dfM\3\2\2\2\u01e0\u01e4\5P)\2\u01e1"+
		"\u01e4\5R*\2\u01e2\u01e4\5T+\2\u01e3\u01e0\3\2\2\2\u01e3\u01e1\3\2\2\2"+
		"\u01e3\u01e2\3\2\2\2\u01e4O\3\2\2\2\u01e5\u01e6\7\'\2\2\u01e6\u01e7\5"+
		"\\/\2\u01e7\u01eb\7\7\2\2\u01e8\u01ea\5F$\2\u01e9\u01e8\3\2\2\2\u01ea"+
		"\u01ed\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u01ee\3\2"+
		"\2\2\u01ed\u01eb\3\2\2\2\u01ee\u01ef\7\b\2\2\u01efQ\3\2\2\2\u01f0\u01f3"+
		"\7\t\2\2\u01f1\u01f2\7.\2\2\u01f2\u01f4\7*\2\2\u01f3\u01f1\3\2\2\2\u01f3"+
		"\u01f4\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\5b\62\2\u01f6\u01f7\7\n"+
		"\2\2\u01f7\u01fa\5b\62\2\u01f8\u01f9\7\n\2\2\u01f9\u01fb\7 \2\2\u01fa"+
		"\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb\u01fc\3\2\2\2\u01fc\u0200\7\7"+
		"\2\2\u01fd\u01ff\5F$\2\u01fe\u01fd\3\2\2\2\u01ff\u0202\3\2\2\2\u0200\u01fe"+
		"\3\2\2\2\u0200\u0201\3\2\2\2\u0201\u0203\3\2\2\2\u0202\u0200\3\2\2\2\u0203"+
		"\u0204\7\13\2\2\u0204S\3\2\2\2\u0205\u0209\7\f\2\2\u0206\u0208\5F$\2\u0207"+
		"\u0206\3\2\2\2\u0208\u020b\3\2\2\2\u0209\u0207\3\2\2\2\u0209\u020a\3\2"+
		"\2\2\u020a\u020c\3\2\2\2\u020b\u0209\3\2\2\2\u020c\u020d\7\r\2\2\u020d"+
		"\u020e\5\\/\2\u020eU\3\2\2\2\u020f\u0212\5Z.\2\u0210\u0212\5X-\2\u0211"+
		"\u020f\3\2\2\2\u0211\u0210\3\2\2\2\u0212W\3\2\2\2\u0213\u0214\7\16\2\2"+
		"\u0214\u0215\5^\60\2\u0215\u0219\7\17\2\2\u0216\u0217\7 \2\2\u0217\u0218"+
		"\7\n\2\2\u0218\u021a\5F$\2\u0219\u0216\3\2\2\2\u021a\u021b\3\2\2\2\u021b"+
		"\u0219\3\2\2\2\u021b\u021c\3\2\2\2\u021c\u021d\3\2\2\2\u021d\u021f\7\20"+
		"\2\2\u021e\u0220\7\n\2\2\u021f\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221"+
		"\u021f\3\2\2\2\u0221\u0222\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\5F"+
		"$\2\u0224\u0225\7\21\2\2\u0225Y\3\2\2\2\u0226\u0227\7%\2\2\u0227\u0228"+
		"\5\\/\2\u0228\u0229\7\22\2\2\u0229\u0231\5F$\2\u022a\u022e\7&\2\2\u022b"+
		"\u022d\5F$\2\u022c\u022b\3\2\2\2\u022d\u0230\3\2\2\2\u022e\u022c\3\2\2"+
		"\2\u022e\u022f\3\2\2\2\u022f\u0232\3\2\2\2\u0230\u022e\3\2\2\2\u0231\u022a"+
		"\3\2\2\2\u0231\u0232\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234\7\23\2\2"+
		"\u0234[\3\2\2\2\u0235\u023a\5^\60\2\u0236\u0237\7,\2\2\u0237\u0239\5^"+
		"\60\2\u0238\u0236\3\2\2\2\u0239\u023c\3\2\2\2\u023a\u0238\3\2\2\2\u023a"+
		"\u023b\3\2\2\2\u023b\u0241\3\2\2\2\u023c\u023a\3\2\2\2\u023d\u023e\7-"+
		"\2\2\u023e\u0240\5\\/\2\u023f\u023d\3\2\2\2\u0240\u0243\3\2\2\2\u0241"+
		"\u023f\3\2\2\2\u0241\u0242\3\2\2\2\u0242]\3\2\2\2\u0243\u0241\3\2\2\2"+
		"\u0244\u0249\5`\61\2\u0245\u0246\t\3\2\2\u0246\u0248\5`\61\2\u0247\u0245"+
		"\3\2\2\2\u0248\u024b\3\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a"+
		"_\3\2\2\2\u024b\u0249\3\2\2\2\u024c\u0251\5b\62\2\u024d\u024e\t\4\2\2"+
		"\u024e\u0250\5b\62\2\u024f\u024d\3\2\2\2\u0250\u0253\3\2\2\2\u0251\u024f"+
		"\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0259\3\2\2\2\u0253\u0251\3\2\2\2\u0254"+
		"\u0255\7(\2\2\u0255\u0256\5^\60\2\u0256\u0257\7)\2\2\u0257\u0259\3\2\2"+
		"\2\u0258\u024c\3\2\2\2\u0258\u0254\3\2\2\2\u0259a\3\2\2\2\u025a\u025b"+
		"\t\5\2\2\u025bc\3\2\2\2\64r\u0086\u00a3\u00a9\u00b7\u00c0\u00d1\u00e3"+
		"\u00ee\u00f9\u0104\u0106\u0112\u0114\u0127\u013e\u0145\u014c\u015b\u0167"+
		"\u0175\u017b\u0186\u018e\u0198\u019e\u01a7\u01ad\u01b5\u01bf\u01c8\u01d1"+
		"\u01d6\u01de\u01e3\u01eb\u01f3\u01fa\u0200\u0209\u0211\u021b\u0221\u022e"+
		"\u0231\u023a\u0241\u0249\u0251\u0258";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}