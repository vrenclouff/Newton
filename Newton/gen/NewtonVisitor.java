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
	 * Visit a parse tree produced by {@link NewtonParser#multipleAssignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleAssignmentStatement(NewtonParser.MultipleAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#parallelAssignmentStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParallelAssignmentStatement(NewtonParser.ParallelAssignmentStatementContext ctx);
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
	 * Visit a parse tree produced by {@link NewtonParser#repeatUntilStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatUntilStatement(NewtonParser.RepeatUntilStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#conditionalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionalStatement(NewtonParser.ConditionalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#switchStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitchStatement(NewtonParser.SwitchStatementContext ctx);
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
	 * Visit a parse tree produced by {@link NewtonParser#elseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStatement(NewtonParser.ElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#ternaryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTernaryStatement(NewtonParser.TernaryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(NewtonParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link NewtonParser#relationExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationExpression(NewtonParser.RelationExpressionContext ctx);
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
	/**
	 * Visit a parse tree produced by {@link NewtonParser#simpleFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleFactor(NewtonParser.SimpleFactorContext ctx);
}