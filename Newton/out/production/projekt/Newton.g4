// Define a grammar called Test
grammar Newton;

program_begin
    : BeginProgram BeginBlock cond_variables_dcl functions_dcl main EndBlock;

cond_variables_dcl
    : variables_dcl cond_variables_dcl
    | constants_dcl cond_variables_dcl
    | ;

variables_dcl
    : BoolType Identifier Assign expression_cond Semi
    | IntType Identifier Assign expression Semi
    | DoubleType Identifier Assign expression Semi;

constants_dcl
	: Const BoolType Identifier Assign expression_cond Semi
    | Const Identifier Assign function_call Semi
	| Const IntType Identifier Assign expression Semi
    | Const DoubleType Identifier Assign expression Semi;

functions_dcl
    : function_dcl_single functions_dcl
    | ;

function_dcl_single
    : BeginFunction function_return_type Identifier BracketLeft parameters BracketRight BeginBlock function_block EndBlock;

function_return_type
    : data_type
    | VoidType;

function_block
    : variables_dcl_function block;

variables_dcl_function
    : variables_dcl variables_dcl_function
    | ;

block // TODO: dalsi cykly
    : function_call Semi block
    | assignment Semi block
    | if_cond block
    | while_cond block
    | ;

function_call
    : Identifier BracketLeft function_call_params BracketRight Semi;

function_call_params // Nelze udelat pouze condition?
    : expression
    | expression ',' function_call_params
    | expression_cond ',' function_call_params
    | ;

parameters
    : data_type Identifier
    | data_type Identifier ',' parameters
    | ;

assignment // INFO: osetrit v kodu, ze neprirazujeme spatny typ (pr. boolean do int)
    : Identifier Assign expression
    | Identifier Assign expression_cond // Mozna zbytecne
    | Identifier Assign condition;

expression
    : expression Add expression_priority
    | expression Sub expression_priority
    | expression_priority;

expression_priority
    : expression_priority Mul expression_item
    | expression_priority Div expression_item
    | expression_item;

expression_item
    : Identifier
    | Int
    | Double
    | Boolean
    | Add Int
    | Sub Int
    | Add Double
    | Sub Double
    | '(' expression ')';

if_cond
    : If BracketLeft condition BracketRight BeginBlock block EndBlock;

while_cond
    : While BracketLeft condition BracketRight BeginBlock block EndBlock;

condition
    : expression_cond
    | expression LogicalOp expression_cond;

expression_cond
    : Boolean
    | condition_item RelationOp condition_item;

condition_item
    : Boolean
    | expression
    | '(' Boolean ')';

data_type
    : IntType
    | DoubleType
    | BoolType;

main
    : MainFnc BracketLeft BracketRight BeginBlock function_block EndBlock;

BeginProgram : 'start_program';
BeginBlock : 'begin';
EndBlock : 'end';
MainFnc : 'main';
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
Identifier: [a-zA-Z]+[a-zA-Z0-9]*;
BeginFunction : 'fnc';
If : 'if';
While : 'while';
BracketLeft : '(';
BracketRight : ')';
Assign : '=';
Semi : ';';
RelationOp : '<' | '>' | '<=' | '>=' '==';
LogicalOp : '&&' | '||';
WS :  [ \t\r\n]+ -> skip;
