grammar Newton;
// chybi negace

program
    : programHeading functionStatement* mainStatement;

programHeading // done
    : constantDefinitionPart variableDefinitionPart;

constantDefinitionPart // done
    : DefConstant constantDefinition*;

constantDefinition // done
    : Const IntType Identifier Assign Int Semi
    | Const BoolType Identifier Assign Boolean Semi;

variableDefinitionPart // done
    : DefVariable variableDefinition*;

variableDefinition // done
    : baseType Identifier Semi;

mainStatement // done
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

assignmentStatement // done
    : Identifier Assign multipleAssignmentStatement* (expression | ternaryStatement) Semi;

multipleAssignmentStatement // done
    : Identifier Assign;

parallelAssignmentStatement // done
    : CurlyBracketLeft Identifier (',' Identifier)* CurlyBracketRight Assign CurlyBracketLeft simpleFactor (',' simpleFactor)* CurlyBracketRight Semi;

callFunctionStatement
    : (Identifier Assign)? Identifier RoundBracketLeft parameterList? RoundBracketRight Semi;

parameterList
    : expression (Comma expression)?;

loopStatement
    : whileStatement
    | forStatement
    | doWhileStatement;

whileStatement // done
    : BeginWhile expression Do statement* EndWhile;

forStatement
    : BeginFor (Identifier Assign)? factor Colon factor (Colon Int)? Do statement* EndFor;   // for a = 1:10:2 (1 az 10 po 2)

doWhileStatement // done
    : Repeat statement* Until expression;

conditionalStatement
    : ifStatement
    | caseStatement;

caseStatement
    : BeginSwitch simpleExpression Of (Int Colon statement)+ DefaultSwitch Colon statement EndSwitch;   // vice statements v default ??

ifStatement // done
    : BeginIf expression Then statement* elseStatement? EndIf;

elseStatement // done
    : Else statement*;

ternaryStatement
    : expression Ques expression Colon expression;

expression // done
    : simpleExpression (RelationOp simpleExpression)* (LogicalOp expression)*;

simpleExpression // done
    : term ((Add | Sub) term)*;

term // done
    : factor ((Mul | Div) factor)*
    | RoundBracketLeft simpleExpression RoundBracketRight ((Add | Sub | Mul | Div) simpleExpression)?;

factor // done
    : simpleFactor
    | Identifier;

simpleFactor // done
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
Lt : '<';
Gt : '>';
Lte: '<=';
Gte: '>=';
Eq: '==';
LogicalOp : '&&' | '||';
Identifier: [a-zA-Z]+[a-zA-Z0-9]*;
WS :  [ \t\r\n]+ -> skip;

