// Generated from C:/Users/Barat/Documents/fjp/Newton/src\Newton.g4 by ANTLR 4.7
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
		T__0=1, BeginProgram=2, BeginBlock=3, EndBlock=4, MainFnc=5, Add=6, Sub=7, 
		Mul=8, Div=9, Const=10, IntType=11, Boolean=12, VoidType=13, Int=14, Double=15, 
		DoubleType=16, BoolType=17, BeginFunction=18, If=19, While=20, BracketLeft=21, 
		BracketRight=22, Assign=23, Semi=24, RelationOp=25, LogicalOp=26, Identifier=27, 
		WS=28;
	public static final int
		RULE_program_begin = 0, RULE_cond_variables_dcl = 1, RULE_variables_dcl = 2, 
		RULE_constants_dcl = 3, RULE_functions_dcl = 4, RULE_function_dcl_single = 5, 
		RULE_function_return_type = 6, RULE_function_block = 7, RULE_variables_dcl_function = 8, 
		RULE_block = 9, RULE_function_call = 10, RULE_function_call_params = 11, 
		RULE_parameters = 12, RULE_assignment = 13, RULE_expression = 14, RULE_expression_priority = 15, 
		RULE_expression_item = 16, RULE_if_cond = 17, RULE_while_cond = 18, RULE_condition = 19, 
		RULE_expression_cond = 20, RULE_condition_item = 21, RULE_data_type = 22, 
		RULE_main = 23;
	public static final String[] ruleNames = {
		"program_begin", "cond_variables_dcl", "variables_dcl", "constants_dcl", 
		"functions_dcl", "function_dcl_single", "function_return_type", "function_block", 
		"variables_dcl_function", "block", "function_call", "function_call_params", 
		"parameters", "assignment", "expression", "expression_priority", "expression_item", 
		"if_cond", "while_cond", "condition", "expression_cond", "condition_item", 
		"data_type", "main"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "','", "'start_program'", "'begin'", "'end'", "'main'", "'+'", "'-'", 
		"'*'", "'/'", "'const'", "'int'", null, "'void'", null, null, "'double'", 
		"'bool'", "'fnc'", "'if'", "'while'", "'('", "')'", "'='", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "BeginProgram", "BeginBlock", "EndBlock", "MainFnc", "Add", 
		"Sub", "Mul", "Div", "Const", "IntType", "Boolean", "VoidType", "Int", 
		"Double", "DoubleType", "BoolType", "BeginFunction", "If", "While", "BracketLeft", 
		"BracketRight", "Assign", "Semi", "RelationOp", "LogicalOp", "Identifier", 
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
		public TerminalNode EOF() { return getToken(NewtonParser.EOF, 0); }
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
			setState(48);
			match(BeginProgram);
			setState(49);
			match(BeginBlock);
			setState(50);
			cond_variables_dcl();
			setState(51);
			functions_dcl();
			setState(52);
			main();
			setState(53);
			match(EndBlock);
			setState(54);
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
			setState(63);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntType:
			case DoubleType:
			case BoolType:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				variables_dcl();
				setState(57);
				cond_variables_dcl();
				}
				break;
			case Const:
				enterOuterAlt(_localctx, 2);
				{
				setState(59);
				constants_dcl();
				setState(60);
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
			setState(83);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BoolType:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				match(BoolType);
				setState(66);
				match(Identifier);
				setState(67);
				match(Assign);
				setState(68);
				expression_cond();
				setState(69);
				match(Semi);
				}
				break;
			case IntType:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(IntType);
				setState(72);
				match(Identifier);
				setState(73);
				match(Assign);
				setState(74);
				expression(0);
				setState(75);
				match(Semi);
				}
				break;
			case DoubleType:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				match(DoubleType);
				setState(78);
				match(Identifier);
				setState(79);
				match(Assign);
				setState(80);
				expression(0);
				setState(81);
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
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(Const);
				setState(86);
				match(BoolType);
				setState(87);
				match(Identifier);
				setState(88);
				match(Assign);
				setState(89);
				expression_cond();
				setState(90);
				match(Semi);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(Const);
				setState(93);
				match(Identifier);
				setState(94);
				match(Assign);
				setState(95);
				function_call();
				setState(96);
				match(Semi);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(98);
				match(Const);
				setState(99);
				match(IntType);
				setState(100);
				match(Identifier);
				setState(101);
				match(Assign);
				setState(102);
				expression(0);
				setState(103);
				match(Semi);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(105);
				match(Const);
				setState(106);
				match(DoubleType);
				setState(107);
				match(Identifier);
				setState(108);
				match(Assign);
				setState(109);
				expression(0);
				setState(110);
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
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BeginFunction:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				function_dcl_single();
				setState(115);
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
			setState(120);
			match(BeginFunction);
			setState(121);
			function_return_type();
			setState(122);
			match(Identifier);
			setState(123);
			match(BracketLeft);
			setState(124);
			parameters();
			setState(125);
			match(BracketRight);
			setState(126);
			match(BeginBlock);
			setState(127);
			function_block();
			setState(128);
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
			setState(132);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntType:
			case DoubleType:
			case BoolType:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				data_type();
				}
				break;
			case VoidType:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
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
			setState(134);
			variables_dcl_function();
			setState(135);
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
			setState(141);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IntType:
			case DoubleType:
			case BoolType:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				variables_dcl();
				setState(138);
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
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(143);
				function_call();
				setState(144);
				match(Semi);
				setState(145);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				assignment();
				setState(148);
				match(Semi);
				setState(149);
				block();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				if_cond();
				setState(152);
				block();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(154);
				while_cond();
				setState(155);
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
			setState(160);
			match(Identifier);
			setState(161);
			match(BracketLeft);
			setState(162);
			function_call_params();
			setState(163);
			match(BracketRight);
			setState(164);
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
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				expression(0);
				setState(168);
				match(T__0);
				setState(169);
				function_call_params();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(171);
				expression_cond();
				setState(172);
				match(T__0);
				setState(173);
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
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				data_type();
				setState(179);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				data_type();
				setState(182);
				match(Identifier);
				setState(183);
				match(T__0);
				setState(184);
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
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(Identifier);
				setState(190);
				match(Assign);
				setState(191);
				expression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(Identifier);
				setState(193);
				match(Assign);
				setState(194);
				expression_cond();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				match(Identifier);
				setState(196);
				match(Assign);
				setState(197);
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
			setState(201);
			expression_priority(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(209);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(203);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(204);
						match(Add);
						setState(205);
						expression_priority(0);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(206);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(207);
						match(Sub);
						setState(208);
						expression_priority(0);
						}
						break;
					}
					} 
				}
				setState(213);
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
			setState(215);
			expression_item();
			}
			_ctx.stop = _input.LT(-1);
			setState(225);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(223);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						_localctx = new Expression_priorityContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression_priority);
						setState(217);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(218);
						match(Mul);
						setState(219);
						expression_item();
						}
						break;
					case 2:
						{
						_localctx = new Expression_priorityContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression_priority);
						setState(220);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(221);
						match(Div);
						setState(222);
						expression_item();
						}
						break;
					}
					} 
				}
				setState(227);
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
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(Identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(Int);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(Double);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(231);
				match(Boolean);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(232);
				match(Add);
				setState(233);
				match(Int);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(234);
				match(Sub);
				setState(235);
				match(Int);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(236);
				match(Add);
				setState(237);
				match(Double);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(238);
				match(Sub);
				setState(239);
				match(Double);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(240);
				match(BracketLeft);
				setState(241);
				expression(0);
				setState(242);
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
			setState(246);
			match(If);
			setState(247);
			match(BracketLeft);
			setState(248);
			condition();
			setState(249);
			match(BracketRight);
			setState(250);
			match(BeginBlock);
			setState(251);
			block();
			setState(252);
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
			setState(254);
			match(While);
			setState(255);
			match(BracketLeft);
			setState(256);
			condition();
			setState(257);
			match(BracketRight);
			setState(258);
			match(BeginBlock);
			setState(259);
			block();
			setState(260);
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
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				expression_cond();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				expression(0);
				setState(264);
				match(LogicalOp);
				setState(265);
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
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(Boolean);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(270);
				condition_item();
				setState(271);
				match(RelationOp);
				setState(272);
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
			setState(281);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				match(Boolean);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(277);
				expression(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
				match(BracketLeft);
				setState(279);
				match(Boolean);
				setState(280);
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
			setState(283);
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
			setState(285);
			match(MainFnc);
			setState(286);
			match(BracketLeft);
			setState(287);
			match(BracketRight);
			setState(288);
			match(BeginBlock);
			setState(289);
			function_block();
			setState(290);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u0127\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3B\n\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\5\4V\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5s\n\5\3\6\3\6\3"+
		"\6\3\6\5\6y\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\5\b\u0087"+
		"\n\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\5\n\u0090\n\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a1\n\13\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00b3"+
		"\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00be\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00c9\n\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u00d4\n\20\f\20\16\20\u00d7\13\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\7\21\u00e2\n\21\f\21\16"+
		"\21\u00e5\13\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\5\22\u00f7\n\22\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\5\25\u010e\n\25\3\26\3\26\3\26\3\26\3\26\5\26\u0115\n\26\3\27\3"+
		"\27\3\27\3\27\3\27\5\27\u011c\n\27\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\2\4\36 \32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\60\2\3\4\2\r\r\22\23\2\u0133\2\62\3\2\2\2\4A\3\2\2\2\6U\3\2\2\2"+
		"\br\3\2\2\2\nx\3\2\2\2\fz\3\2\2\2\16\u0086\3\2\2\2\20\u0088\3\2\2\2\22"+
		"\u008f\3\2\2\2\24\u00a0\3\2\2\2\26\u00a2\3\2\2\2\30\u00b2\3\2\2\2\32\u00bd"+
		"\3\2\2\2\34\u00c8\3\2\2\2\36\u00ca\3\2\2\2 \u00d8\3\2\2\2\"\u00f6\3\2"+
		"\2\2$\u00f8\3\2\2\2&\u0100\3\2\2\2(\u010d\3\2\2\2*\u0114\3\2\2\2,\u011b"+
		"\3\2\2\2.\u011d\3\2\2\2\60\u011f\3\2\2\2\62\63\7\4\2\2\63\64\7\5\2\2\64"+
		"\65\5\4\3\2\65\66\5\n\6\2\66\67\5\60\31\2\678\7\6\2\289\7\2\2\39\3\3\2"+
		"\2\2:;\5\6\4\2;<\5\4\3\2<B\3\2\2\2=>\5\b\5\2>?\5\4\3\2?B\3\2\2\2@B\3\2"+
		"\2\2A:\3\2\2\2A=\3\2\2\2A@\3\2\2\2B\5\3\2\2\2CD\7\23\2\2DE\7\35\2\2EF"+
		"\7\31\2\2FG\5*\26\2GH\7\32\2\2HV\3\2\2\2IJ\7\r\2\2JK\7\35\2\2KL\7\31\2"+
		"\2LM\5\36\20\2MN\7\32\2\2NV\3\2\2\2OP\7\22\2\2PQ\7\35\2\2QR\7\31\2\2R"+
		"S\5\36\20\2ST\7\32\2\2TV\3\2\2\2UC\3\2\2\2UI\3\2\2\2UO\3\2\2\2V\7\3\2"+
		"\2\2WX\7\f\2\2XY\7\23\2\2YZ\7\35\2\2Z[\7\31\2\2[\\\5*\26\2\\]\7\32\2\2"+
		"]s\3\2\2\2^_\7\f\2\2_`\7\35\2\2`a\7\31\2\2ab\5\26\f\2bc\7\32\2\2cs\3\2"+
		"\2\2de\7\f\2\2ef\7\r\2\2fg\7\35\2\2gh\7\31\2\2hi\5\36\20\2ij\7\32\2\2"+
		"js\3\2\2\2kl\7\f\2\2lm\7\22\2\2mn\7\35\2\2no\7\31\2\2op\5\36\20\2pq\7"+
		"\32\2\2qs\3\2\2\2rW\3\2\2\2r^\3\2\2\2rd\3\2\2\2rk\3\2\2\2s\t\3\2\2\2t"+
		"u\5\f\7\2uv\5\n\6\2vy\3\2\2\2wy\3\2\2\2xt\3\2\2\2xw\3\2\2\2y\13\3\2\2"+
		"\2z{\7\24\2\2{|\5\16\b\2|}\7\35\2\2}~\7\27\2\2~\177\5\32\16\2\177\u0080"+
		"\7\30\2\2\u0080\u0081\7\5\2\2\u0081\u0082\5\20\t\2\u0082\u0083\7\6\2\2"+
		"\u0083\r\3\2\2\2\u0084\u0087\5.\30\2\u0085\u0087\7\17\2\2\u0086\u0084"+
		"\3\2\2\2\u0086\u0085\3\2\2\2\u0087\17\3\2\2\2\u0088\u0089\5\22\n\2\u0089"+
		"\u008a\5\24\13\2\u008a\21\3\2\2\2\u008b\u008c\5\6\4\2\u008c\u008d\5\22"+
		"\n\2\u008d\u0090\3\2\2\2\u008e\u0090\3\2\2\2\u008f\u008b\3\2\2\2\u008f"+
		"\u008e\3\2\2\2\u0090\23\3\2\2\2\u0091\u0092\5\26\f\2\u0092\u0093\7\32"+
		"\2\2\u0093\u0094\5\24\13\2\u0094\u00a1\3\2\2\2\u0095\u0096\5\34\17\2\u0096"+
		"\u0097\7\32\2\2\u0097\u0098\5\24\13\2\u0098\u00a1\3\2\2\2\u0099\u009a"+
		"\5$\23\2\u009a\u009b\5\24\13\2\u009b\u00a1\3\2\2\2\u009c\u009d\5&\24\2"+
		"\u009d\u009e\5\24\13\2\u009e\u00a1\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u0091"+
		"\3\2\2\2\u00a0\u0095\3\2\2\2\u00a0\u0099\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0"+
		"\u009f\3\2\2\2\u00a1\25\3\2\2\2\u00a2\u00a3\7\35\2\2\u00a3\u00a4\7\27"+
		"\2\2\u00a4\u00a5\5\30\r\2\u00a5\u00a6\7\30\2\2\u00a6\u00a7\7\32\2\2\u00a7"+
		"\27\3\2\2\2\u00a8\u00b3\5\36\20\2\u00a9\u00aa\5\36\20\2\u00aa\u00ab\7"+
		"\3\2\2\u00ab\u00ac\5\30\r\2\u00ac\u00b3\3\2\2\2\u00ad\u00ae\5*\26\2\u00ae"+
		"\u00af\7\3\2\2\u00af\u00b0\5\30\r\2\u00b0\u00b3\3\2\2\2\u00b1\u00b3\3"+
		"\2\2\2\u00b2\u00a8\3\2\2\2\u00b2\u00a9\3\2\2\2\u00b2\u00ad\3\2\2\2\u00b2"+
		"\u00b1\3\2\2\2\u00b3\31\3\2\2\2\u00b4\u00b5\5.\30\2\u00b5\u00b6\7\35\2"+
		"\2\u00b6\u00be\3\2\2\2\u00b7\u00b8\5.\30\2\u00b8\u00b9\7\35\2\2\u00b9"+
		"\u00ba\7\3\2\2\u00ba\u00bb\5\32\16\2\u00bb\u00be\3\2\2\2\u00bc\u00be\3"+
		"\2\2\2\u00bd\u00b4\3\2\2\2\u00bd\u00b7\3\2\2\2\u00bd\u00bc\3\2\2\2\u00be"+
		"\33\3\2\2\2\u00bf\u00c0\7\35\2\2\u00c0\u00c1\7\31\2\2\u00c1\u00c9\5\36"+
		"\20\2\u00c2\u00c3\7\35\2\2\u00c3\u00c4\7\31\2\2\u00c4\u00c9\5*\26\2\u00c5"+
		"\u00c6\7\35\2\2\u00c6\u00c7\7\31\2\2\u00c7\u00c9\5(\25\2\u00c8\u00bf\3"+
		"\2\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c9\35\3\2\2\2\u00ca"+
		"\u00cb\b\20\1\2\u00cb\u00cc\5 \21\2\u00cc\u00d5\3\2\2\2\u00cd\u00ce\f"+
		"\5\2\2\u00ce\u00cf\7\b\2\2\u00cf\u00d4\5 \21\2\u00d0\u00d1\f\4\2\2\u00d1"+
		"\u00d2\7\t\2\2\u00d2\u00d4\5 \21\2\u00d3\u00cd\3\2\2\2\u00d3\u00d0\3\2"+
		"\2\2\u00d4\u00d7\3\2\2\2\u00d5\u00d3\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6"+
		"\37\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d8\u00d9\b\21\1\2\u00d9\u00da\5\"\22"+
		"\2\u00da\u00e3\3\2\2\2\u00db\u00dc\f\5\2\2\u00dc\u00dd\7\n\2\2\u00dd\u00e2"+
		"\5\"\22\2\u00de\u00df\f\4\2\2\u00df\u00e0\7\13\2\2\u00e0\u00e2\5\"\22"+
		"\2\u00e1\u00db\3\2\2\2\u00e1\u00de\3\2\2\2\u00e2\u00e5\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4!\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00f7\7\35\2\2\u00e7\u00f7\7\20\2\2\u00e8\u00f7\7\21\2\2\u00e9\u00f7"+
		"\7\16\2\2\u00ea\u00eb\7\b\2\2\u00eb\u00f7\7\20\2\2\u00ec\u00ed\7\t\2\2"+
		"\u00ed\u00f7\7\20\2\2\u00ee\u00ef\7\b\2\2\u00ef\u00f7\7\21\2\2\u00f0\u00f1"+
		"\7\t\2\2\u00f1\u00f7\7\21\2\2\u00f2\u00f3\7\27\2\2\u00f3\u00f4\5\36\20"+
		"\2\u00f4\u00f5\7\30\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00e6\3\2\2\2\u00f6"+
		"\u00e7\3\2\2\2\u00f6\u00e8\3\2\2\2\u00f6\u00e9\3\2\2\2\u00f6\u00ea\3\2"+
		"\2\2\u00f6\u00ec\3\2\2\2\u00f6\u00ee\3\2\2\2\u00f6\u00f0\3\2\2\2\u00f6"+
		"\u00f2\3\2\2\2\u00f7#\3\2\2\2\u00f8\u00f9\7\25\2\2\u00f9\u00fa\7\27\2"+
		"\2\u00fa\u00fb\5(\25\2\u00fb\u00fc\7\30\2\2\u00fc\u00fd\7\5\2\2\u00fd"+
		"\u00fe\5\24\13\2\u00fe\u00ff\7\6\2\2\u00ff%\3\2\2\2\u0100\u0101\7\26\2"+
		"\2\u0101\u0102\7\27\2\2\u0102\u0103\5(\25\2\u0103\u0104\7\30\2\2\u0104"+
		"\u0105\7\5\2\2\u0105\u0106\5\24\13\2\u0106\u0107\7\6\2\2\u0107\'\3\2\2"+
		"\2\u0108\u010e\5*\26\2\u0109\u010a\5\36\20\2\u010a\u010b\7\34\2\2\u010b"+
		"\u010c\5*\26\2\u010c\u010e\3\2\2\2\u010d\u0108\3\2\2\2\u010d\u0109\3\2"+
		"\2\2\u010e)\3\2\2\2\u010f\u0115\7\16\2\2\u0110\u0111\5,\27\2\u0111\u0112"+
		"\7\33\2\2\u0112\u0113\5,\27\2\u0113\u0115\3\2\2\2\u0114\u010f\3\2\2\2"+
		"\u0114\u0110\3\2\2\2\u0115+\3\2\2\2\u0116\u011c\7\16\2\2\u0117\u011c\5"+
		"\36\20\2\u0118\u0119\7\27\2\2\u0119\u011a\7\16\2\2\u011a\u011c\7\30\2"+
		"\2\u011b\u0116\3\2\2\2\u011b\u0117\3\2\2\2\u011b\u0118\3\2\2\2\u011c-"+
		"\3\2\2\2\u011d\u011e\t\2\2\2\u011e/\3\2\2\2\u011f\u0120\7\7\2\2\u0120"+
		"\u0121\7\27\2\2\u0121\u0122\7\30\2\2\u0122\u0123\7\5\2\2\u0123\u0124\5"+
		"\20\t\2\u0124\u0125\7\6\2\2\u0125\61\3\2\2\2\24AUrx\u0086\u008f\u00a0"+
		"\u00b2\u00bd\u00c8\u00d3\u00d5\u00e1\u00e3\u00f6\u010d\u0114\u011b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}