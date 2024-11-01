grammar UTL;

// Lexer rules

// 2- General structure
FLOAT_VAL :         INT_VAL '.' [0-9]+;
INT_VAL :           ZERO | NON_ZERO_INT_VAL;
BOOLEAN_VAL :       TRUE | FALSE;
NON_ZERO_INT_VAL :  [1-9][0-9]*;
STRING_VAL:         '"' ~["]* '"';
ZERO :              '0';

// 2-1- General syntax structure

// 2-2- Comments
NEW_LINE:       ('\r' '\n'? | '\n') -> skip;
LINE_COMMENT:   '//' ~ [\r\n]* -> skip;
BLOCK_COMMENT:  '/*' .*? '*/' -> skip;

// 2-3- Naming rules for classes, functions and variables
MAIN :          'Main';
PRINT :         'Print';
RETURN :        'return';
ELSE :          'else';
IF :            'if';
PRE_ORDER :     'preorder';
PARALLEL :      'parallel';
BUY :           'BUY';
SELL :          'SELL';
EXCEPTION :     'Exception';
TYPE :          'Type';
TEXT :          'Text';

// 4- Variables

// 4-1- Predefined variables
BID :       'Bid';
ASK :       'Ask';
CANDLES:    'Candles';
DIGITS :    'Digits';
VOLUME :    'Volume';
LOW :       'Low';
HIGH :      'High';
CLOSE :     'Close';
OPEN :      'Open';
TIME :      'Time';

// 4-2- Static variables
STATIC : 'static';

// 4-3- External variables
SHARED : 'shared';

// 5- Data types

// 5-1- Basic data types
INT :       'int';
STRING :    'string';
FLOAT :     'float';
BOOLEAN :   'bool';
VOID :      'void';
DOUBLE :    'double';

// 5-2- List

// 5-3- Trade
TRADE : 'Trade';

// 5-4- Order
ORDER : 'Order';

// 5-5- Error

// 5-6- Candle
CANDLE: 'Candle';

// 6- Operators

// 6-1- Arithmetic operators
INC :   '++';
DEC :   '--';
PLUS :  '+';
MINUS : '-';
MULT :  '*';
DIV :   '/';
MOD :   '%';

// 6-2- Comparative operators
EQ :    '==';
NEQ :   '!=';
LT :    '<';
GT :    '>';

// 6-3- Logical operators
AND :           '&&';
OR :            '||';
NOT :           '!';
B_NOT :         '~';
B_RIGHT_SHIFT : '>>';
B_LEFT_SHIFT :  '<<';
B_AND :         '&';
B_OR :          '|';
B_XOR :         '^';
FALSE :         'false';
TRUE :          'true';
NLLL :          'null';

// 6-4- Assigning operators
ASSIGN :            '=';
ASSIGN_PLUS :       '+=';
ASSIGN_SUB :        '-=';
ASSIGN_MULT :       '*=';
ASSIGN_DIV :        '/=';
ASSIGN_MOD :        '%=';

// 6-5- Precedence of operators
LPAR :           '(';
RPAR :           ')';
LBRACK :         '[';
RBRACK :         ']';
LBRACE :         '{';
RBRACE :         '}';
COMMA :          ',';
DOT :            '.';
SEMI :           ';';

// 7- Decision structure

// 8- Error structure
TRY :   'try';
THROW : 'throw';
CATCH : 'catch';

// 9- Repeat structure
FOR :       'for';
WHILE :     'while';
BREAK :     'break';
CONTINUE :  'continue';

// 10- Range rules

// 11- Default functions
ON_INIT :           'OnInit';
ON_START :          'OnStart';
SCHEDULE :          '@schedule';
REFRESH_RATE :      'RefreshRate';
GET_CANDLE :        'GetCandle';
TERMINATE :         'Terminate';
CONNECT :           'Connect';
OBSERVE :           'Observe';


// Other
IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;
WHITE_SPACE: [ \t]+ -> skip;

// Parser rules
program:    (
              initialization 
            | function 
            | external_variable 
            | static_variable
            )* 
            main_function;

initialization:   VOID 
        (
              ON_INIT 
            | ON_START
        ) 
        LPAR 
        TRADE 
        IDENTIFIER 
        RPAR 
        (THROW EXCEPTION)? 
        LBRACE 
        (structure)* 
        RBRACE;

function:       (
                  primitives 
                | VOID
            ) 
            name 
            = 
            IDENTIFIER                      {System.out.println("MethodDec:" + $name.text);}
            LPAR 
            args? 
            RPAR 
            (THROW EXCEPTION)? 
            LBRACE 
            (structure)*
            RBRACE;

external_variable: (SHARED)? 
              (
                  init_var 
                | init_arr
              );

static_variable: STATIC  
            (
                init_var 
              | init_arr
            );

main_function:  (
                    primitives 
                    | VOID
                ) 
                MAIN 
                LPAR 
                RPAR 
                LBRACE 
                (structure)*
                RBRACE;

args:    (primitives IDENTIFIER)
                  (COMMA primitives IDENTIFIER)* 
                | VOID;

structure:   structure_general_blocks 
           | structure_general_calls
           | structure_general_instructions
           | structure_general_ends
           | structure_return;

structure_general_ends: (  
                          BREAK        {System.out.println("Control:break");}
                        | CONTINUE     {System.out.println("Control:continue");}
                   ) 
                   SEMI;

structure_return: RETURN (expression)? 
                  SEMI;

structure_general_blocks:      if_else_block 
                        | try_catch_block 
                        | for_loop 
                        | while_loop;

structure_general_instructions:    init_var
                            | init_arr
                            | static_variable
                            | schedule_initialization;

structure_general_calls:   print_call 
                    | function_call 
                    | structure_expression 
                    | throw_exception;



if_else_block: if_statement (else_clause)?;

if_statement: IF                                  {System.out.println("Conditional:if");}
    LPAR 
    expression 
    RPAR 
    struct_scope;

else_clause:  ELSE                             {System.out.println("Conditional:else");}
       struct_scope ;

while_loop: WHILE                            {System.out.println("Loop:while");} 
       LPAR 
       expression 
       RPAR 
       struct_scope;

for_loop:  FOR                               {System.out.println("Loop:for");} 
      LPAR 
      (
          init_var 
        | (expression SEMI)
      ) 
      expression 
      SEMI 
      expression 
      RPAR 
      struct_scope;

try_catch_block: try_block 
                 (try_catch)?;

try_block: TRY 
     struct_scope;

try_catch: CATCH 
           EXCEPTION 
           IDENTIFIER 
           struct_scope;

struct_scope: LBRACE
              (structure)* 
              RBRACE 
            | structure;

print_call: PRINT                       {System.out.println("Built-in:print");}
            LPAR 
            expression 
            RPAR
            SEMI;

function_call: function_names           {System.out.println("FunctionCall");} 
               LPAR 
               (expression)? 
               RPAR 
               SEMI;

schedule_initialization:  SCHEDULE                {System.out.println("ConcurrencyControl:Schedule");} 
                trade_expression 
                SEMI;

trade_expression: trade_id 
           schedule_rule 
           trade_id;

schedule_rule:    PARALLEL 
                | PRE_ORDER;

trade_id :    LPAR 
              trade_expression 
              RPAR 
            | IDENTIFIER;

expression:   type1_expression 
            | type1_expression 
              COMMA 
              expression;

type1_expression: type2_expression 
           type1_expression_prim;

type1_expression_prim: (
            assign_types 
            type2_expression                        {System.out.println("Operator:" + $assign_types.text);} 
            type1_expression_prim
          )?;

type2_expression:     type3_expression 
             | type3_expression OR type2_expression                  {System.out.println("Operator:||");};

type3_expression:     type4_expression 
             | type4_expression AND type3_expression                 {System.out.println("Operator:&&");};

type4_expression: type5_expression type4_expression_prim;

type4_expression_prim: (B_name = (
                          B_AND 
                        | B_OR 
                        | B_XOR
                    ) 
                    type5_expression                {System.out.println("Operator:" + $B_name.text);} 
                    type4_expression_prim)?;

type5_expression: type6_expression 
      type5_expression_prim;

type5_expression_prim: (equals_name = (
                              NEQ 
                            | EQ
                         ) type6_expression         {System.out.println("Operator:" + $equals_name.text);} type5_expression_prim
          )?;

type6_expression: type7_expression 
           type6_expression_prim;

type6_expression_prim: (than_name = (
                          LT 
                        | GT
                       ) 
                       type7_expression             {System.out.println("Operator:" + $than_name.text);} type6_expression_prim
          )?;

type7_expression: type8_expression 
           type7_expression_prim;

type7_expression_prim: (shift_name = (
                              B_RIGHT_SHIFT 
                            | B_LEFT_SHIFT
                        ) 
                        type8_expression            {System.out.println("Operator:" + $shift_name.text);} type7_expression_prim
          )?;

type8_expression: type9_expression 
                  type8_expression_prim;

type8_expression_prim: (pm_name = (
                        PLUS 
                      | MINUS
                     ) 
                     type9_expression               {System.out.println("Operator:" + $pm_name.text);} type8_expression_prim
                       )?;

type9_expression: type10_expression 
                  type9_expression_prim;

type9_expression_prim: (dmd_name = (   
                          DIV 
                        | MULT 
                        | MOD
                        )             
                       type10_expression                    {System.out.println("Operator:" + $dmd_name.text);} type9_expression_prim
                       )?;

type10_expression:        type11_expression 
                        | bmndi = (   B_NOT 
                                    | MINUS 
                                    | NOT 
                                    | DEC 
                                    | INC
                                ) 
                          type10_expression                         {System.out.println("Operator:" + $bmndi.text);};

type11_expression: type12_expression 
                   type11_expression_prim;

type11_expression_prim: (id_name = 
                            (
                                    INC 
                                    | DEC
                            ) 
                         type11_expression_prim              {System.out.println("Operator:" + $id_name.text);}
                        )?;

type12_expression:    type13_expression 
                    | LBRACK 
                      expression 
                      RBRACK;

type13_expression:    type14_expression 
                    | type14_expression 
                      DOT 
                      type13_expression;

type14_expression:    type15_expression 
                    | LPAR 
                      expression 
                      RPAR;

type15_expression:    primitives_vals 
                    | order_type 
                    | class_attributes 
                    | execption_constructor 
                    | assign_function 
                    | IDENTIFIER 
                    | (IDENTIFIER 
                    | CANDLE) arr_index;

structure_expression:     assign_variable 
                        | assign_array 
                        | execption_constructor 
                        SEMI 
                        | class_member 
                        | unary;

class_member: (
                  IDENTIFIER 
                | execption_constructor
              ) 
              (arr_index)? 
              DOT 
              expression 
              SEMI;

assign_variable:    IDENTIFIER 
                    (assign_expression)? 
                    SEMI;

assign_array:   IDENTIFIER 
                arr_index 
                (assign_expression)? 
                SEMI;

assign_expression: assign_types 
                   expression                       {System.out.println("Operator:" + $assign_types.text);};

unary: inc_dec_p 
       IDENTIFIER 
       (arr_index)? 
       (inc_dec_a)*  
       SEMI;

inc_dec_a: inc_dec_name = (
                              INC 
                            | DEC
                          )                         {System.out.println("Operator:" + $inc_dec_name.text);};

inc_dec_p : (ip = (
                      INC 
                    | DEC
                  ) 
             inc_dec_p                         {System.out.println("Operator:" + $ip.text);}
            )?;

init_var: types var_name 
          = 
          IDENTIFIER                                {System.out.println("VarDec:" + $var_name.text);} 
          (assign_init_expression)? 
          SEMI;

init_arr: types 
          LBRACK 
          expression 
          RBRACK 
          arr_name 
          = 
          IDENTIFIER                                {System.out.println("ArrayDec:" + $arr_name.text + ":" + $expression.text);} 
          (assign_init_expression)? 
          SEMI;

assign_init_expression: ASSIGN 
                        expression                  {System.out.println("Operator:=");};

arr_index: LBRACK 
           expression 
           RBRACK;

assign_types:     ASSIGN 
                | ASSIGN_PLUS 
                | ASSIGN_SUB 
                | ASSIGN_MOD 
                | ASSIGN_MULT 
                | ASSIGN_DIV;

throw_exception: THROW (
                              execption_constructor 
                            | IDENTIFIER
                       ) 
                       SEMI;

execption_constructor: EXCEPTION 
                       LPAR 
                       error_type 
                       = 
                       INT_VAL                      {System.out.println("ErrorControl:" + $error_type.text);} 
                       COMMA 
                       STRING_VAL 
                       RPAR;

assign_function: function_names 
                 LPAR 
                 (expression)? 
                 RPAR;

function_names:   IDENTIFIER 
                | OBSERVE 
                | CONNECT 
                | TERMINATE 
                | GET_CANDLE 
                | ORDER 
                | REFRESH_RATE;

types:    primitives 
        | utility_types;

primitives:   array_primitives 
            | STRING;

utility_types:    TRADE 
                | ORDER 
                | CANDLE 
                | EXCEPTION;

array_primitives:     INT 
                    | FLOAT 
                    | BOOLEAN 
                    | DOUBLE;

primitives_vals:      INT_VAL 
                    | FLOAT_VAL 
                    | BOOLEAN_VAL 
                    | STRING_VAL;

order_type:   BUY 
            | SELL;

class_attributes: (
                      trade_attributes 
                    | candle_attributes 
                    | exception_attributes
                  ) 
                  (LPAR RPAR)?;

trade_attributes:     ASK 
                    | BID 
                    | DIGITS;

candle_attributes:    TIME 
                    | OPEN 
                    | CLOSE 
                    | HIGH 
                    | LOW 
                    | VOLUME;

exception_attributes:     TYPE 
                        | TEXT;
