grammar UTL;

// Lexer rules

FLOAT_VAL : INT_VAL '.' [0-9]+;
INT_VAL : ZERO | NON_ZERO_INT_VAL;
BOOLEAN_VAL : TRUE | FALSE;
NON_ZERO_INT_VAL : [1-9][0-9]*;
ZERO : '0';

INT : 'int';
STRING : 'string';
FOR : 'for';
WHILE : 'while';
ELSE : 'else';
IF : 'if';
CONTINUE : 'continue';
TRY : 'try';
FALSE : 'false';
TRUE : 'true';
FLOAT : 'float';
BOOL : 'bool';
ON_INIT : 'OnInit';
ON_START : 'OnStart';
THROW : 'throw';
RETURN : 'return';
CATCH : 'catch';
BREAK : 'break';
STATIC : 'static';
SHARED : 'shared';
VOID : 'void';
SCHEDULE : '@schedule';
DOUBLE : 'double';
MAIN : 'Main';
DIGITS : 'Digits';
BUY : 'BUY';
SELL : 'SELL';
BID : 'Bid';
ASK : 'Ask';
TYPE : 'Type';
VOLUME : 'Volume';
LOW : 'Low';
HIGH : 'High';
CLOSE : 'Close';
OPEN : 'Open';
TIME : 'Time';
TEXT : 'Text';
TRADE : 'Trade';
ORDER : 'Order';
CANDLE : 'Candle';
EXCEPTION : 'Exception';
REFRESH_RATE : 'RefreshRate';
GET_CANDLE : 'GetCandle';
TERMINATE : 'Terminate';
CONNECT : 'Connect';
OBSERVE : 'Observe';
PRINT : 'Print';
PRE_ORDER : 'preorder';
PARALLEL : 'parallel';


EQUALS : '==';
NOT_EQUALS : '!=';
LESS_THAN : '<';
GREATER_THAN : '>';
AND : '&&';
OR : '||';
NOT : '!';

BITWISE_NOT : '~';
BITWISE_RIGHT_SHIFT : '>>';
BITWISE_LEFT_SHIFT : '<<';
BITWISE_AND : '&';
BITWISE_OR : '|';
BITWISE_XOR : '^';


ASSIGN : '=';
ADD_ASSIGN : '+=';
SUBTRACT_ASSIGN : '-=';
MULTIPLY_ASSIGN : '*=';
DIVIDE_ASSIGN : '/=';
MODULO_ASSIGN : '%=';

INCREMENT : '++';
DECREMENT : '--';
PLUS : '+';
MINUS : '-';
MULTIPLY : '*';
DIVIDE : '/';
MODULO : '%';


LPAR: '(';
RPAR: ')';


LBRACKET: '[';
RBRACKET: ']';


LBRACE : '{';
RBRACE : '}';
COMMA : ',';
DOT : '.';
SEMICOLON : ';';

IDENTIFIER: [a-zA-Z_][a-zA-Z0-9_]*;

STRING_VAL: '"' ~["]* '"';

WHITE_SPACE: [ \t]+ -> skip;

NEW_LINE: ('\r' '\n'? | '\n') -> skip;

LINE_COMMENT: '//' ~ [\r\n]* -> skip;

BLOCK_COMMENT: '/*' .*? '*/' -> skip;

// Parser rules
