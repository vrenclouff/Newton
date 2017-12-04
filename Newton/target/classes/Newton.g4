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
    | Const DoubleType Identifier Assign Double Semi
    | Const BoolType Identifier Assign Boolean Semi;

variableDefinitionPart
    : DefVariable variableDefinition*;

variableDefinition
    : baseType Identifier Semi;

mainStatement
    : MainFnc BracketLeft BracketRight statement* EndBlock;

functionStatement
    : BeginFunction VoidType Identifier BracketLeft tag? BracketRight statement* EndBlock
    | BeginFunction baseType Identifier BracketLeft tag? BracketRight statement* ReturnFunctin expression Semi EndBlock;

tag
    : baseType Identifier (Comma baseType Identifier)*;

baseType
    : IntType
    | DoubleType
    | BoolType;

statement
    : conditionalStatement
    | loopStatement
    | assignmentStatement
    | callFunctionStatement;

assignmentStatement
    : Identifier Assign expression Semi;

callFunctionStatement
    : (Identifier Assign)? Identifier BracketLeft parameterList? BracketRight Semi;

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

expression
    : simpleExpression (RelationOp simpleExpression)* (LogicalOp expression)*;


simpleExpression
    : term ((Add | Sub) term)*;

term
    : factor ((Mul | Div) factor)*
    | BracketLeft simpleExpression BracketRight ((Add | Sub | Mul | Div) simpleExpression)?;

factor
    : Int
    | Boolean
    | Double
    | Identifier;


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
Double: [0-9]+('.'[0-9]+);
DoubleType : 'double';
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
BracketLeft : '(';
BracketRight : ')';
Assign : '=';
Comma : ',';
Colon : ':';
Semi : ';';
RelationOp : '<' | '>' | '<=' | '>=' | '==';
LogicalOp : '&&' | '||';
Identifier: [a-zA-Z]+[a-zA-Z0-9]*;
WS :  [ \t\r\n]+ -> skip;

