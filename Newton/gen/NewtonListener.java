// Generated from C:/Users/Barat/OneDrive/Dokumenty/_FAV/ING/FJP/Semestralka/projekt/Newton/src\Newton.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link NewtonParser}.
 */
public interface NewtonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link NewtonParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(NewtonParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(NewtonParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#programHeading}.
	 * @param ctx the parse tree
	 */
	void enterProgramHeading(NewtonParser.ProgramHeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#programHeading}.
	 * @param ctx the parse tree
	 */
	void exitProgramHeading(NewtonParser.ProgramHeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinitionPart(NewtonParser.ConstantDefinitionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinitionPart(NewtonParser.ConstantDefinitionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinition(NewtonParser.ConstantDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinition(NewtonParser.ConstantDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#variableDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefinitionPart(NewtonParser.VariableDefinitionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#variableDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefinitionPart(NewtonParser.VariableDefinitionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVariableDefinition(NewtonParser.VariableDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#variableDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVariableDefinition(NewtonParser.VariableDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#mainStatement}.
	 * @param ctx the parse tree
	 */
	void enterMainStatement(NewtonParser.MainStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#mainStatement}.
	 * @param ctx the parse tree
	 */
	void exitMainStatement(NewtonParser.MainStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStatement(NewtonParser.FunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#functionStatement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStatement(NewtonParser.FunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(NewtonParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(NewtonParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(NewtonParser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(NewtonParser.BaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(NewtonParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(NewtonParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(NewtonParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(NewtonParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#multipleAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterMultipleAssignmentStatement(NewtonParser.MultipleAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#multipleAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitMultipleAssignmentStatement(NewtonParser.MultipleAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#parallelAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterParallelAssignmentStatement(NewtonParser.ParallelAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#parallelAssignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitParallelAssignmentStatement(NewtonParser.ParallelAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#callFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void enterCallFunctionStatement(NewtonParser.CallFunctionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#callFunctionStatement}.
	 * @param ctx the parse tree
	 */
	void exitCallFunctionStatement(NewtonParser.CallFunctionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(NewtonParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(NewtonParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(NewtonParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(NewtonParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(NewtonParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(NewtonParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(NewtonParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(NewtonParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileStatement(NewtonParser.DoWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#doWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileStatement(NewtonParser.DoWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#repeatUntilStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatUntilStatement(NewtonParser.RepeatUntilStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#repeatUntilStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatUntilStatement(NewtonParser.RepeatUntilStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(NewtonParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(NewtonParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(NewtonParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(NewtonParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(NewtonParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(NewtonParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(NewtonParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(NewtonParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void enterElseStatement(NewtonParser.ElseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#elseStatement}.
	 * @param ctx the parse tree
	 */
	void exitElseStatement(NewtonParser.ElseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#ternaryStatement}.
	 * @param ctx the parse tree
	 */
	void enterTernaryStatement(NewtonParser.TernaryStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#ternaryStatement}.
	 * @param ctx the parse tree
	 */
	void exitTernaryStatement(NewtonParser.TernaryStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(NewtonParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(NewtonParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(NewtonParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(NewtonParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(NewtonParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(NewtonParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(NewtonParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(NewtonParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link NewtonParser#simpleFactor}.
	 * @param ctx the parse tree
	 */
	void enterSimpleFactor(NewtonParser.SimpleFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link NewtonParser#simpleFactor}.
	 * @param ctx the parse tree
	 */
	void exitSimpleFactor(NewtonParser.SimpleFactorContext ctx);
}