grammar UTL;

// Lexer rules
SPACES : [ \t\r\n]+ -> skip;
SEMICOLON : ';';
COMMA : ',';
COLON : ':';
DOT: '.';
LPAREN : '(';
RPAREN : ')';
LBRACE : '{';
RBRACE : '}';
LBRACK : '[';
RBRACK : ']';

PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';

AND : '&&';
OR: '||';
NOT: '!';

BIT_AND : '&';
BIT_OR : '|';
BIT_XOR : '^';
L_SHIFT : '<<';
R_SHIFT : '>>';
BIT_NOT : '~';

LT : '<';
GT : '>';
EQ : '==';
NEQ : '!=';

INC : '++';
DEC : '--';

ASSIGN : '=';
ADD_ASSIGN: '+=';
SUB_ASSIGN: '-=';
MUL_ASSIGN: '*=';
DIV_ASSIGN: '/=';
MOD_ASSIGN: '%=';

TRY : 'try';
THROW : 'throw';
CATCH : 'catch';
IF : 'if';
ELSE : 'else';
FOR: 'for';
WHILE : 'while';
BREAK : 'break';
CONTINUE : 'continue';
RETURN : 'return';

MAIN : 'Main';
ONINIT : 'OnInit';
ONSTART : 'OnStart';

STATIC : 'static';
SHARED : 'shared';

FLOAT : 'float';
DOUBLE : 'double';
STRING: 'string';
BOOL: 'bool';
VOID: 'void';
INT : 'int';

BUY : 'BUY';
SELL : 'SELL';

ASK : 'Ask';
BID : 'Bid';
TIME : 'Time';
HIGH : 'High';
LOW : 'Low';
DIGITS : 'Digits';
VOLUME : 'Volume';
TYPE: 'Type';
TEXT: 'Text';
OPEN : 'Open';
CLOSE : 'Close';

TRADE: 'Trade';
ORDER: 'Order';
CANDLE: 'Candle';
EXCEPTION: 'Exception';

REFRESH_RATE : 'RefreshRate';
GET_CANDLE : 'GetCandle';
TERMINATE : 'Terminate';
CONNECT : 'Connect';
OBSERVE : 'Observe';
PRINT : 'Print';

PREORDER : 'preorder';
PARALLEL : 'parallel';

SCHEDULE : '@schedule';

ID : [a-zA-Z_][a-zA-Z_0-9]*;

INT_LITERAL : [1-9][0-9]* | '0';
FLOAT_LITERAL : [0-9]* '.' [0-9]+;
STRING_LITERAL : '"' (~["])* '"';

COMMENT: (('//' ~('\r'|'\n')*) | ('/*' .*? '*/')) -> skip;

// Parser rules
program : statement+;

statement : declaration
          | assignment
          | functionDeclaration
          | expression SEMICOLON
          | controlBlock SEMICOLON {System.out.println("Control:"+$controlBlock.text);}
          | functionCall SEMICOLON {System.out.println("FunctionCall");}
          | printCall SEMICOLON {System.out.println("Built-in:print");}
          | methodCall SEMICOLON
          | returnStatement
          | ifStatement
          | whileStatement
          | forStatement
          | tryCatchStatement
          | scheduleStatement
          | throwExceptionStatement
          | mainBlock
          | initBlock
          | startBlock;

declaration : (STATIC | SHARED)? (primitiveType | complexType) (LBRACK INT_LITERAL RBRACK)? ID {if ($INT_LITERAL.text != null) System.out.println("ArrayDec:"+$ID.text+":"+$INT_LITERAL.text); else System.out.println("VarDec:"+$ID.text);} (ASSIGN expression)? SEMICOLON;

functionDeclaration : primitiveType ID LPAREN parameterList? RPAREN {System.out.println("MethodDec:"+$ID.text);} (THROW EXCEPTION)? body;

assignment : ID (LBRACK expression RBRACK)? assign expression SEMICOLON;

functionCall : (espetialFunction | complexType | ID) LPAREN argumentList? RPAREN {if ("Exception".equals($complexType.text)) System.out.println("ErrorControl:"+$argumentList.text.split(",", 2)[0]);};

printCall : PRINT LPAREN argumentList? RPAREN;

methodCall : ID (LBRACK expression RBRACK)? DOT (OPEN | CLOSE) LPAREN argumentList? RPAREN;

parameterList : (primitiveType | complexType) ID (COMMA (primitiveType | complexType) ID)*;

argumentList : expression (COMMA expression)*;

ifStatement : IF {System.out.println("Conditional:if");} LPAREN expression RPAREN body (ELSE {System.out.println("Conditional:else");} body)?;

whileStatement : WHILE {System.out.println("Loop:while");} LPAREN expression RPAREN body;

forStatement: FOR {System.out.println("Loop:for");} LPAREN statement expression SEMICOLON expression RPAREN body;

tryCatchStatement : TRY body (CATCH EXCEPTION ID body)?;

scheduleStatement : SCHEDULE tradeCombination SEMICOLON {System.out.println("ConcurrencyControl:Schedule");};

tradeCombination : (ID | LPAREN tradeCombination RPAREN) PREORDER (ID | LPAREN tradeCombination RPAREN)
                 | (ID | LPAREN tradeCombination RPAREN) PARALLEL (ID | LPAREN tradeCombination RPAREN)
                 | ID;

controlBlock : (BREAK | CONTINUE);

returnStatement : RETURN expression SEMICOLON;

throwExceptionStatement : THROW expression SEMICOLON;

mainBlock : VOID MAIN LPAREN RPAREN body;

initBlock : VOID ONINIT LPAREN TRADE ID RPAREN (THROW EXCEPTION)? body;

startBlock : VOID ONSTART LPAREN TRADE ID RPAREN (THROW EXCEPTION)? body;

body : block | statement;

block : LBRACE statement* RBRACE;

expression : atom
           | expression opr=(INC | DEC) {System.out.println("Operator:"+$opr.text);}
           | opr=(NOT | MINUS | BIT_NOT | INC | DEC) expression {System.out.println("Operator:"+$opr.text);}
           | expression opr=(MULT | DIV | MOD) expression {System.out.println("Operator:"+$opr.text);}
           | expression opr=(PLUS | MINUS) expression {System.out.println("Operator:"+$opr.text);}
           | expression opr=(L_SHIFT | R_SHIFT) expression {System.out.println("Operator:"+$opr.text);}
           | expression opr=(LT | GT) expression {System.out.println("Operator:"+$opr.text);}
           | expression opr=(EQ | NEQ) expression {System.out.println("Operator:"+$opr.text);}
           | expression opr=(BIT_AND | BIT_OR | BIT_XOR) expression {System.out.println("Operator:"+$opr.text);}
           | expression AND expression {System.out.println("Operator:"+$AND.text);}
           | expression OR expression {System.out.println("Operator:"+$OR.text);}
           | expression DOT espetialVariable
           | ID (LBRACK expression RBRACK)?
           | LPAREN expression RPAREN
           | functionCall
           | methodCall;

atom : INT_LITERAL
     | FLOAT_LITERAL
     | STRING_LITERAL
     | SELL
     | BUY;

primitiveType : FLOAT | DOUBLE | INT | BOOL | STRING;

complexType: ORDER | TRADE | CANDLE | EXCEPTION;

espetialFunction: REFRESH_RATE | CONNECT | OBSERVE | GET_CANDLE | TERMINATE;

espetialVariable: ASK | BID | TIME | OPEN | CLOSE | HIGH | LOW | DIGITS | VOLUME | TYPE | TEXT;

assign: ASSIGN | ADD_ASSIGN | SUB_ASSIGN | MUL_ASSIGN | DIV_ASSIGN | MOD_ASSIGN;
