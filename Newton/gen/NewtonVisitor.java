// Generated from C:/Users/Barat/Documents/fjp/Newton/src\Newton.g4 by ANTLR 4.7
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
}