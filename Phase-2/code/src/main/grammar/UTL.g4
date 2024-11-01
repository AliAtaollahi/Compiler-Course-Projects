grammar UTL;

@header{
    import main.ast.node.*;
    import main.ast.node.declaration.*;
    import main.ast.node.statement.*;
    import main.ast.node.expression.*;
    import main.ast.node.expression.operators.*;
    import main.ast.node.expression.values.*;
    import main.ast.type.primitiveType.*;
    import main.ast.type.complexType.*;
    import main.ast.type.*;
}
// Parser rules
// do not change first rule (program) temp_identifier
program returns [Program pro] : {$pro = new Program(); $pro.setLine(0);}
    ( 
        functionDeclaration { $pro.addFunction($functionDeclaration.funcDecRet); }
        | initDeclaration { $pro.addInit($initDeclaration.onInitDecRet); }
        | startDeclaration { $pro.addStart($startDeclaration.onStartDecRet); }
        | (
            globVariableDeclaration 
            SEMICOLON { $pro.addVar($globVariableDeclaration.globalVarDecRet); }
        )
    )* 
    mainDeclaration { $pro.setMain($mainDeclaration.mainDecRet); }
    ;

statement returns [Statement statementRet] :
        (
            (
                varDeclaration 
                SEMICOLON { $statementRet = $varDeclaration.varDecRet; }
            )
            | ifStatement { $statementRet = $ifStatement.ifStmtRet; }
            | functionDeclaration { $statementRet = $functionDeclaration.funcDecRet; }
            | throwStatement { $statementRet = $throwStatement.throwStmtRet; }
            | continueBreakStatement { $statementRet = $continueBreakStatement.continueBreakStmtRet; }
            | assignStatement { $statementRet = $assignStatement.assignStmtRet; }
            | returnStatement { $statementRet = $returnStatement.returnStmtRet; }
            | whileStatement { $statementRet = $whileStatement.whileStmtRet; }
            | forStatement { $statementRet = $forStatement.forStmtRet; }
            | tryCatchStatement { $statementRet = $tryCatchStatement.tryCatchStmtRet; }
            | (
                expression 
                SEMICOLON { $statementRet = new ExpressionStmt($expression.expressionRet); }
            )
        ) { $statementRet.setLine($statementRet.getLine()); }
        ;

varDeclaration returns [VarDeclaration varDecRet] : { $varDecRet = new VarDeclaration(); }
    allType { $varDecRet.setType($allType.allTypeRet); }
    (
        LBRACK 
        temp_int_literal = INT_LITERAL RBRACK { $varDecRet.setLength(Integer.parseInt($temp_int_literal.text)); }
    )?
    (
        (
            identifier { $varDecRet.setIdentifier($identifier.identifierRet); }
            | espetialVariable { $varDecRet.setIdentifier($espetialVariable.espetialVariableRet); }
        ) { $varDecRet.setLine($varDecRet.getIdentifier().getLine()); }
    )
    (
        ASSIGN 
        expression { $varDecRet.setExpression($expression.expressionRet); } 
    )? 
    ;

functionDeclaration returns [FunctionDeclaration funcDecRet] : { $funcDecRet = new FunctionDeclaration(); }
    primitiveType { $funcDecRet.setReturnType($primitiveType.primitiveTypeRet); }
    temp_identifier = identifier { $funcDecRet.setName($temp_identifier.identifierRet); $funcDecRet.setLine($temp_identifier.identifierRet.getLine()); }
    LPAREN 
    (
        varDeclaration { $funcDecRet.addArg($varDeclaration.varDecRet); }
        (
            COMMA varDeclaration { $funcDecRet.addArg($varDeclaration.varDecRet); }
        )*
    )?
    RPAREN 
    (
        THROW EXCEPTION
    )? 
    (
        LBRACE ( statement { $funcDecRet.addStatement($statement.statementRet); })* RBRACE
        | statement { $funcDecRet.addStatement($statement.statementRet); }
    )
    ;

mainDeclaration returns [MainDeclaration mainDecRet] : { $mainDecRet = new MainDeclaration(); }
    VOID 
    temp_main = MAIN 
    LPAREN 
    RPAREN { $mainDecRet.setLine($temp_main.getLine()); }
    (
        LBRACE (statement 
        { 
            if ($statement.statementRet instanceof VarDeclaration varDeclaration) 
                {
                    if (varDeclaration.getType().equals("Trade")) { $mainDecRet.addActorInstantiation(varDeclaration); }
                    else { $mainDecRet.addStatement(varDeclaration); }
                }
            else { $mainDecRet.addStatement($statement.statementRet); } 
        }
        )* 
        RBRACE
        | statement 
        { 
            if ($statement.statementRet instanceof VarDeclaration varDeclaration) 
            {
                if (varDeclaration.getType().equals("Trade")) { $mainDecRet.addActorInstantiation(varDeclaration); }
                else { $mainDecRet.addStatement(varDeclaration); }
            }
            else { $mainDecRet.addStatement($statement.statementRet); } 
        }
    )
    ;

initDeclaration returns [OnInitDeclaration onInitDecRet] : { $onInitDecRet = new OnInitDeclaration(); }
    VOID 
    temp_oninit = ONINIT 
    LPAREN 
    TRADE 
    temp_identifier = identifier { $onInitDecRet.setTradeName($temp_identifier.identifierRet); $onInitDecRet.setLine($temp_oninit.getLine()); } 
    RPAREN 
    (
        THROW 
        EXCEPTION
    )?
    (
        (
            LBRACE 
            (
                statement { $onInitDecRet.addStatement($statement.statementRet); }
            )*
            RBRACE
        )
        | statement { $onInitDecRet.addStatement($statement.statementRet); }
    )
    ;

startDeclaration returns [OnStartDeclaration onStartDecRet] : { $onStartDecRet = new OnStartDeclaration(); }
    VOID 
    temp_onstart = ONSTART 
    LPAREN 
    TRADE 
    temp_identifier = identifier { $onStartDecRet.setTradeName($temp_identifier.identifierRet); $onStartDecRet.setLine($temp_onstart.getLine()); } 
    RPAREN 
    (
        THROW 
        EXCEPTION
    )?
    (
        (
            LBRACE 
            (
                statement { $onStartDecRet.addStatement($statement.statementRet); }
            )* 
            RBRACE
        )
        | statement { $onStartDecRet.addStatement($statement.statementRet); }
    )
    ;


primitiveType returns [Type primitiveTypeRet] :
    STRING { $primitiveTypeRet = new StringType(); }
    | FLOAT { $primitiveTypeRet = new FloatType(); }
    | DOUBLE { $primitiveTypeRet = new DoubleType(); }
    | INT { $primitiveTypeRet = new IntType(); }
    | VOID { $primitiveTypeRet = new VoidType(); }
    | BOOL { $primitiveTypeRet = new BoolType(); }
    ;

complexType returns [Type complexTypeRet] :
    TRADE { $complexTypeRet = new TradeType(); }
    | ORDER { $complexTypeRet = new OrderType(); }
    | EXCEPTION { $complexTypeRet = new ExceptionType(); }
    | CANDLE { $complexTypeRet = new CandleType(); }
    ;

allType returns [Type allTypeRet] :
    primitiveType { $allTypeRet = $primitiveType.primitiveTypeRet; }
    | complexType { $allTypeRet = $complexType.complexTypeRet; }
    ;

espetialFunction returns [Identifier espetialFunctionRet] :
    temp_id = (
        GET_CANDLE 
        | CONNECT 
        | REFRESH_RATE 
        | OBSERVE 
        | PRINT
        | TERMINATE 
        ) { $espetialFunctionRet = new Identifier($temp_id.text); $espetialFunctionRet.setLine($temp_id.getLine()); }
    ;

espetialVariable returns [Identifier espetialVariableRet] :
    temp_id = (
        BID 
        | ASK 
        | HIGH 
        | TIME 
        | VOLUME 
        | LOW 
        | OPEN 
        | TYPE 
        | CLOSE
        | DIGITS 
        | TEXT 
        ) { $espetialVariableRet = new Identifier($temp_id.text); $espetialVariableRet.setLine($temp_id.getLine()); }
    ;

espetialMethod returns [Identifier espetialMethodRet] :
    temp_id = (
        OPEN 
        | CLOSE
        ) { $espetialMethodRet = new Identifier($temp_id.text); $espetialMethodRet.setLine($temp_id.getLine()); }
    ;

assign: 
    ASSIGN
    | SUB_ASSIGN
    | ADD_ASSIGN
    | MUL_ASSIGN
    | DIV_ASSIGN
    | MOD_ASSIGN
    ;

identifier returns [Identifier identifierRet]: 
    temp_id = ID { $identifierRet = new Identifier($temp_id.text); $identifierRet.setLine($temp_id.getLine()); }
    ;

methodCall returns [MethodCall methodCallRet] : { $methodCallRet = new MethodCall(); }
    identifier { $methodCallRet.setIdentifierName($identifier.identifierRet); $methodCallRet.setLine($identifier.identifierRet.getLine()); }
    (
        LBRACK 
        expression { $methodCallRet.setInstance($expression.expressionRet); } 
        RBRACK
    )?
    DOT 
    espetialMethod { $methodCallRet.setFunctionName($espetialMethod.espetialMethodRet); }
    LPAREN 
    (
        expression { $methodCallRet.addArg($expression.expressionRet); } 
        (
            COMMA 
            expression { $methodCallRet.addArg($expression.expressionRet); } 
        )*
    )? 
    RPAREN
    ;

expression returns [Expression expressionRet] :
   value { $expressionRet = $value.valueRet; $expressionRet.setLine($value.valueRet.getLine()); }
   |    first_temp_expression = expression 
        DOT espetialVariable { $expressionRet = new VarAccess($first_temp_expression.expressionRet, $espetialVariable.espetialVariableRet); $expressionRet.setLine($first_temp_expression.expressionRet.getLine()); }
   |    first_temp_expression = expression {UnaryOperator op;} 
        (
            DEC {op=UnaryOperator.DEC;}
            | INC {op=UnaryOperator.INC;} 
        ) { $expressionRet=new UnaryExpression(op, $first_temp_expression.expressionRet); $expressionRet.setLine($first_temp_expression.expressionRet.getLine()); }
   | {UnaryOperator op;} 
        (
            NOT {op=UnaryOperator.NOT;} 
            | MINUS {op=UnaryOperator.MINUS;} 
            | BIT_NOT {op=UnaryOperator.BIT_NOT;} 
            | DEC {op=UnaryOperator.DEC;}
            | INC {op=UnaryOperator.INC;} 
        ) 
        first_temp_expression = expression { $expressionRet=new UnaryExpression(op, $first_temp_expression.expressionRet); $expressionRet.setLine($first_temp_expression.expressionRet.getLine()); }
   |    first_temp_expression = expression {BinaryOperator op;} 
        (
            MULT {op=BinaryOperator.MULT;}
            | DIV {op=BinaryOperator.DIV;}
            | MOD {op=BinaryOperator.MOD;}
        ) 
        second_temp_expression = expression { $expressionRet=new BinaryExpression($first_temp_expression.expressionRet, $second_temp_expression.expressionRet, op); $expressionRet.setLine($first_temp_expression.expressionRet.getLine()); }
   |    first_temp_expression = expression {BinaryOperator op;} 
        (
            PLUS {op=BinaryOperator.PLUS;} 
            | MINUS {op=BinaryOperator.MINUS;}
        ) 
        second_temp_expression = expression { $expressionRet=new BinaryExpression($first_temp_expression.expressionRet, $second_temp_expression.expressionRet, op); $expressionRet.setLine($first_temp_expression.expressionRet.getLine()); }
   |    first_temp_expression = expression {BinaryOperator op;} 
        (
            L_SHIFT {op=BinaryOperator.L_SHIFT;} 
            | R_SHIFT {op=BinaryOperator.R_SHIFT;}
        ) 
        second_temp_expression = expression { $expressionRet=new BinaryExpression($first_temp_expression.expressionRet, $second_temp_expression.expressionRet, op); $expressionRet.setLine($first_temp_expression.expressionRet.getLine()); }
   |    first_temp_expression = expression {BinaryOperator op;} 
        (
            LT {op=BinaryOperator.LT;} 
            | GT {op=BinaryOperator.GT;}
        ) 
        second_temp_expression = expression { $expressionRet=new BinaryExpression($first_temp_expression.expressionRet, $second_temp_expression.expressionRet, op); $expressionRet.setLine($first_temp_expression.expressionRet.getLine()); }
   |    first_temp_expression = expression {BinaryOperator op;} 
        (
            EQ {op=BinaryOperator.EQ;} 
            | NEQ {op=BinaryOperator.NEQ;}
        ) 
        second_temp_expression = expression { $expressionRet=new BinaryExpression($first_temp_expression.expressionRet, $second_temp_expression.expressionRet, op); $expressionRet.setLine($first_temp_expression.expressionRet.getLine()); }
   |    first_temp_expression = expression {BinaryOperator op;} 
        (
            BIT_AND {op=BinaryOperator.BIT_AND;} 
            | BIT_OR {op=BinaryOperator.BIT_OR;} 
            | BIT_XOR {op=BinaryOperator.BIT_XOR;}
        ) 
        second_temp_expression = expression { $expressionRet=new BinaryExpression($first_temp_expression.expressionRet, $second_temp_expression.expressionRet, op); $expressionRet.setLine($first_temp_expression.expressionRet.getLine()); }
   |    first_temp_expression = expression 
        AND 
        second_temp_expression = expression { $expressionRet=new BinaryExpression($first_temp_expression.expressionRet, $second_temp_expression.expressionRet, BinaryOperator.AND); $expressionRet.setLine($first_temp_expression.expressionRet.getLine()); }
   |    first_temp_expression = expression 
        OR 
        second_temp_expression = expression { $expressionRet=new BinaryExpression($first_temp_expression.expressionRet, $second_temp_expression.expressionRet, BinaryOperator.OR); $expressionRet.setLine($first_temp_expression.expressionRet.getLine()); }
   |    temp_id = ID 
        (
            LBRACK 
            expression 
            RBRACK
        ) { $expressionRet = new ArrayIdentifier($temp_id.text, $expression.expressionRet); } { $expressionRet.setLine($temp_id.getLine()); }
   |    temp_id = ID { $expressionRet = new Identifier($temp_id.text); $expressionRet.setLine($temp_id.getLine()); }
   |    LPAREN 
        expression 
        RPAREN { $expressionRet = $expression.expressionRet; $expressionRet.setLine($expression.expressionRet.getLine()); }
   | functionCall { $expressionRet = $functionCall.functionCallRet; $expressionRet.setLine($functionCall.functionCallRet.getLine()); }
   | methodCall { $expressionRet = $methodCall.methodCallRet; $expressionRet.setLine($methodCall.methodCallRet.getLine()); };


value returns [Value valueRet] :
    (
        res = INT_LITERAL { $valueRet = new IntValue(Integer.parseInt($res.text)); }
        | res = STRING_LITERAL { $valueRet = new StringValue($res.text); }
        | res = FLOAT_LITERAL { $valueRet = new FloatValue(Float.parseFloat($res.text)); }
        | res = BUY { $valueRet = new TradeValue($res.text); }
        | res = SELL { $valueRet = new TradeValue($res.text); }
    ) { $valueRet.setLine($res.getLine()); }
    ;

assignStatement returns [AssignStmt assignStmtRet] : { $assignStmtRet = new AssignStmt(); }
    first_temp_expression = expression { $assignStmtRet.setLValue($first_temp_expression.expressionRet); $assignStmtRet.setLine($first_temp_expression.expressionRet.getLine()); }
    assign second_temp_expression = expression { $assignStmtRet.setRValue($second_temp_expression.expressionRet); } 
    SEMICOLON
    ;

ifStatement returns [IfElseStmt ifStmtRet] : { $ifStmtRet = new IfElseStmt(); }
    temp_if = IF 
    LPAREN 
    temp_expression = expression { $ifStmtRet.setCondition($temp_expression.expressionRet); $ifStmtRet.setLine($temp_if.getLine()); } RPAREN
    (
        (
            LBRACE 
            (
                statement { $ifStmtRet.addThenStatement($statement.statementRet); }
            )* 
            RBRACE
        )
        | statement { $ifStmtRet.addThenStatement($statement.statementRet); }
    )
    (
        ELSE 
        (
            (
                LBRACE 
                (
                    statement { $ifStmtRet.addElseStatement($statement.statementRet); }
                )* 
                RBRACE
            ) 
            | statement { $ifStmtRet.addElseStatement($statement.statementRet); }
        )
    )?
    ;

whileStatement returns [WhileStmt whileStmtRet] : { $whileStmtRet = new WhileStmt(); }
    temp_while = WHILE 
    LPAREN 
    temp_expression = expression { $whileStmtRet.setCondition($temp_expression.expressionRet); $whileStmtRet.setLine($temp_while.getLine()); } 
    RPAREN
    (
        (
            LBRACE 
            (
                statement { $whileStmtRet.addBody($statement.statementRet); }
            )*
            RBRACE
        )
        | statement { $whileStmtRet.addBody($statement.statementRet); }
    )
    ;

forStatement returns [ForStmt forStmtRet] : { $forStmtRet = new ForStmt(); }
    temp_for = FOR 
    LPAREN { $forStmtRet.setLine($temp_for.getLine()); }
    statement { $forStmtRet.addInit($statement.statementRet); }
    temp_expression = expression { $forStmtRet.setCondition($temp_expression.expressionRet); } 
    SEMICOLON
    (
        first_temp_expression = expression { $forStmtRet.setUpdate($first_temp_expression.expressionRet); }
    )? 
    RPAREN
    (
        (
            LBRACE 
            (
                statement { $forStmtRet.addBody($statement.statementRet); }
            )* 
            RBRACE
        )
        | statement { $forStmtRet.addBody($statement.statementRet); }
    )
    ;

tryCatchStatement returns [TryCatchStmt tryCatchStmtRet] : { $tryCatchStmtRet = new TryCatchStmt(); }
    temp_try = TRY { $tryCatchStmtRet.setLine($temp_try.getLine()); }
    (
        (
            LBRACE 
            (
                statement { $tryCatchStmtRet.addTryStatement($statement.statementRet); }
            )* 
            RBRACE
        ) 
        | statement { $tryCatchStmtRet.addTryStatement($statement.statementRet); }
    )
    (
        CATCH
        EXCEPTION 
        temp_identifier = identifier { $tryCatchStmtRet.setIdentifier($temp_identifier.identifierRet); }
        (
            (
                LBRACE 
                (
                    statement { $tryCatchStmtRet.addCatchStatement($statement.statementRet); }
                )* 
                RBRACE
            )
            | statement { $tryCatchStmtRet.addCatchStatement($statement.statementRet); }
        )
    )?
    ;

continueBreakStatement returns [ContinueBreakStmt continueBreakStmtRet] : { $continueBreakStmtRet = new ContinueBreakStmt(); }
    temp_identifier = (
        CONTINUE
        | BREAK 
        ) { $continueBreakStmtRet.setLine($temp_identifier.getLine()); $continueBreakStmtRet.setToken($temp_identifier.text); }
    SEMICOLON
    ;

returnStatement returns [ReturnStmt returnStmtRet] : { $returnStmtRet = new ReturnStmt(); }
    temp_return = RETURN { $returnStmtRet.setLine($temp_return.getLine()); }
    temp_expression = expression { $returnStmtRet.setReturnedExpr($temp_expression.expressionRet); } 
    SEMICOLON
    ;

throwStatement returns [ThrowStmt throwStmtRet] : { $throwStmtRet = new ThrowStmt(); }
    temp_throw = THROW { $throwStmtRet.setLine($temp_throw.getLine()); }
    temp_expression = expression { $throwStmtRet.setReturnedExpr($temp_expression.expressionRet); } 
    SEMICOLON
    ;

functionCall returns [FunctionCall functionCallRet, Identifier complexId] : { $functionCallRet = new FunctionCall(); }
    (
        (
            espetialFunction { $functionCallRet.setFunctionName($espetialFunction.espetialFunctionRet); }
            | temp_id = (
                TRADE 
                | EXCEPTION
                | ORDER 
                | CANDLE 
                ) { $complexId = new Identifier($temp_id.text); $complexId.setLine($temp_id.getLine()); $functionCallRet.setFunctionName($complexId); $functionCallRet.setLine($complexId.getLine()); }
            | identifier { $functionCallRet.setFunctionName($identifier.identifierRet); }
        ) { $functionCallRet.setLine($functionCallRet.getFunctionName().getLine()); }
    )
    LPAREN 
    (
        expression { $functionCallRet.addArg($expression.expressionRet); } 
        (
            COMMA 
            expression { $functionCallRet.addArg($expression.expressionRet); }
        )*
    )? 
    RPAREN
    ;

globVariableDeclaration returns [GlobVariableDeclaration globalVarDecRet] : { $globalVarDecRet = new GlobVariableDeclaration(); }
    allType { $globalVarDecRet.setType($allType.allTypeRet); }
    (
        LBRACK 
        temp_int_literal = INT_LITERAL 
        RBRACK { $globalVarDecRet.setLength(Integer.parseInt($temp_int_literal.text)); }
    )?
    (
        (
            identifier { $globalVarDecRet.setIdentifier($identifier.identifierRet); }
            | espetialVariable { $globalVarDecRet.setIdentifier($espetialVariable.espetialVariableRet); }
        ) { $globalVarDecRet.setLine($globalVarDecRet.getIdentifier().getLine()); }
    )
    (
        ASSIGN 
        expression { $globalVarDecRet.setExpression($expression.expressionRet); } 
    )?
    ;

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

ID : [a-zA-Z_][a-zA-Z_0-9]*;

INT_LITERAL : [1-9][0-9]* | '0';
FLOAT_LITERAL : [0-9]* '.' [0-9]+;
STRING_LITERAL : '"' (~["])* '"';

COMMENT: (('//' ~('\r'|'\n')*) | ('/*' .*? '*/')) -> skip;