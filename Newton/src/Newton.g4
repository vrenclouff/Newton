grammar Newton;
// chybi negace

program
    : programHeading functionStatement* mainStatement;

programHeading
    : constantDefinitionPart variableDefinitionPart;

constantDefinitionPart
    : DefConstant constantDefinition*;

constantDefinition
    : Const IntType Identifier Assign Int Semi
    | Const BoolType Identifier Assign Boolean Semi;

variableDefinitionPart
    : DefVariable variableDefinition*;

variableDefinition
    : baseType Identifier Semi;

mainStatement
    : MainFnc RoundBracketLeft RoundBracketRight statement* EndBlock;

functionStatement
    : BeginFunction VoidType Identifier RoundBracketLeft tag? RoundBracketRight statement* EndBlock
    | BeginFunction baseType Identifier RoundBracketLeft tag? RoundBracketRight statement* ReturnFunctin expression Semi EndBlock;

tag
    : baseType Identifier (Comma baseType Identifier)*;

baseType
    : IntType
    | BoolType;

statement
    : conditionalStatement
    | loopStatement
    | assignmentStatement
    | parallelAssignmentStatement
    | callFunctionStatement;

assignmentStatement
    : Identifier Assign multipleAssignmentStatement* (expression | ternaryStatement) Semi;

multipleAssignmentStatement
    : Identifier Assign;

parallelAssignmentStatement
    : CurlyBracketLeft Identifier (',' Identifier)* CurlyBracketRight Assign CurlyBracketLeft simpleFactor (',' simpleFactor)* CurlyBracketRight Semi;

callFunctionStatement
    : (Identifier Assign)? Identifier RoundBracketLeft parameterList? RoundBracketRight Semi;

parameterList
    : expression (Comma expression)?;

loopStatement
    : whileStatement
    | forStatement
    | doWhileStatement;

whileStatement
    : BeginWhile expression Do statement* EndWhile;

forStatement
    : BeginFor (Identifier Assign)? factor Colon factor (Colon Int)? Do statement* EndFor;   // for a = 1:10:2 (1 az 10 po 2)

doWhileStatement
    : Repeat statement* Until expression;

conditionalStatement
    : ifStatement
    | caseStatement;

caseStatement
    : BeginSwitch simpleExpression Of (Int Colon statement)+ DefaultSwitch Colon + statement EndSwitch;

ifStatement
    : BeginIf expression Then statement (Else statement*)? EndIf;

ternaryStatement
    : expression Ques expression Colon expression;

expression
    : simpleExpression (RelationOp simpleExpression)* (LogicalOp expression)*;


simpleExpression
    : term ((Add | Sub) term)*;

term
    : factor ((Mul | Div) factor)*
    | RoundBracketLeft simpleExpression RoundBracketRight ((Add | Sub | Mul | Div) simpleExpression)?;

factor
    : simpleFactor
    | Identifier;

simpleFactor
    : Int
    | Boolean;


EndBlock : 'end';
MainFnc : 'main';
DefConstant : 'constant:';
DefVariable : 'variable:';
Add : '+';
Sub : '-';
Mul : '*';
Div : '/';
Const : 'const';
IntType : 'int';
Boolean : 'true' | 'false';
VoidType : 'void';
Int : [-+]?[0-9]+; // ([0-9]+)
BoolType : 'bool';
BeginFunction : 'fnc';
ReturnFunctin : 'return';
BeginIf : 'if';
EndIf : 'endif';
Then : 'then';
Do : 'do';
Of : 'of';
Else: 'else';
BeginWhile : 'while';
EndWhile : 'endwhile';
BeginSwitch : 'switch';
EndSwitch : 'endswitch';
DefaultSwitch : 'default';
BeginFor : 'for';
EndFor : 'endfor';
Repeat : 'repeat';
Until : 'until';
RoundBracketLeft : '(';
RoundBracketRight : ')';
CurlyBracketLeft : '{';
CurlyBracketRight : '}';
Assign : '=';
Comma : ',';
Colon : ':';
Semi : ';';
Ques : '?';
RelationOp : '<' | '>' | '<=' | '>=' | '==';
//Lt : '<';
//Gt : '>';
//Lte: '<=';
//Gte: '>=';
//Eq: '==';
LogicalOp : '&&' | '||';
Identifier: [a-zA-Z]+[a-zA-Z0-9]*;
WS :  [ \t\r\n]+ -> skip;

