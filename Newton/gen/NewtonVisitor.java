// Generated from /Users/macbook/Developer/fjp/Newton/src/Newton.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link NewtonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface NewtonVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link NewtonParser#program_begin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_begin(NewtonParser.Program_beginContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#cond_variables_dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_variables_dcl(NewtonParser.Cond_variables_dclContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#variables_dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables_dcl(NewtonParser.Variables_dclContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#constants_dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstants_dcl(NewtonParser.Constants_dclContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#functions_dcl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctions_dcl(NewtonParser.Functions_dclContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#function_dcl_single}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_dcl_single(NewtonParser.Function_dcl_singleContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#function_return_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_return_type(NewtonParser.Function_return_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#function_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_block(NewtonParser.Function_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#variables_dcl_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables_dcl_function(NewtonParser.Variables_dcl_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(NewtonParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(NewtonParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#function_call_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call_params(NewtonParser.Function_call_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(NewtonParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(NewtonParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(NewtonParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#expression_priority}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_priority(NewtonParser.Expression_priorityContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#expression_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_item(NewtonParser.Expression_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#if_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_cond(NewtonParser.If_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#while_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_cond(NewtonParser.While_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(NewtonParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#expression_cond}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_cond(NewtonParser.Expression_condContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#condition_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_item(NewtonParser.Condition_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(NewtonParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(NewtonParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(NewtonParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#programHeading}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramHeading(NewtonParser.ProgramHeadingContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefinitionPart(NewtonParser.ConstantDefinitionPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#constantDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefinition(NewtonParser.ConstantDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#variableDefinitionPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefinitionPart(NewtonParser.VariableDefinitionPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#variableDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDefinition(NewtonParser.VariableDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#mainStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainStatement(NewtonParser.MainStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#functionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionStatement(NewtonParser.FunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#tag}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTag(NewtonParser.TagContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#baseType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseType(NewtonParser.BaseTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(NewtonParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#assignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentStatement(NewtonParser.AssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#callFunctionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallFunctionStatement(NewtonParser.CallFunctionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(NewtonParser.ParameterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(NewtonParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(NewtonParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#forStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(NewtonParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#doWhileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileStatement(NewtonParser.DoWhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(NewtonParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(NewtonParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(NewtonParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#tExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTExpression(NewtonParser.TExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#simpleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpression(NewtonParser.SimpleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(NewtonParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(NewtonParser.FactorContext ctx);
}