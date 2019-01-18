grammar OddlGrammar;

root
    : oddlStatements? EOF
    ;

oddlStatements
    : (oddlStatement SEMI | emptyStatement)+
    ;

oddlStatement
    : createSourceClass
    | createDeputyClass
    | dropClass
    | insertIntoClass
    | deleteFromClass
    | simpleQuery
    | crossClassQuery
    ;

createSourceClass
    : CREATE CLASS className createDefinitions
    ;

createDefinitions
    : '(' createDefinition (',' createDefinition)* ')'
    ;

createDefinition
    : ID dataType;

createDeputyClass
    : CREATE SELECTDEPUTY className
      SELECT sAttr AS dAttr (',' sAttr AS dAttr)* 
      FROM sClassName
      (WHERE expression)?
    ;

dropClass
    : DROP CLASS className;

insertIntoClass
    : INSERT INTO className VALUES valueList;

valueList
    : '(' value (',' value)* ')'
    ;

value
    : STRING
    | DECIMAL
    | REAL
    | (TRUE | FALSE)
    ;

deleteFromClass
    : DELETE FROM className (WHERE expression)?;

simpleQuery
    : SELECT attrList FROM className (WHERE expression)?;

crossClassQuery
    : SELECT className (CROSS className)* DOT attrName 
      FROM className
      (WHERE expression)?
    ;

expression
    : (STRING | DECIMAL | REAL | TRUE | FALSE)
    | attrName 
    | expression op=('<' | '<=' | '>' | '>=') expression
    | expression op=('=' | '==' | '!=' | '<>' ) expression
    | expression AND expression
    | expression OR  expression
    | '(' expression ')'
    ;

emptyStatement
    : SEMI
    ;

sClassName: className;
sAttr: attrName;
dAttr: attrName;
className: ID;
attrName:  ID;
attrList
    : attrName (',' attrName)
    ;
dataType
    : CHAR ('(' DECIMAL ')')?
    | typeName=(INT | LONG | FLOAT | BOOLEAN)
    ;

// Keywords
AS: 'AS';
CREATE: 'CREATE';
CLASS:  'CLASS';
CROSS:  'CROSS';
DELETE: 'DELETE';
DROP:   'DROP';
FROM:   'FROM';
INSERT:  'INSERT';
INTO:    'INTO';
SELECT:  'SELECT';
SELECTDEPUTY: 'SELECTDEPUTY';
VALUES:  'VALUES';
WHERE:   'WHERE';

BOOLEAN: 'BOOLEAN';
CHAR: 'CHAR';
INT:  'INT';
LONG: 'LONG';
FLOAT:'FLOAT';

TRUE: 'TRUE';
FALSE: 'FALSE';
AND: 'AND';
OR:  'OR';
NOT: 'NOT';

// Constructors symbols
DOT:                '.';
LR_BRACKET:         '(';
RR_BRACKET:         ')';
COMMA:              ',';
SEMI:               ';';
EQUAL_SYMBOL:       '=';
GREATER_SYMBOL:     '>';
LESS_SYMBOL:        '<';

SPACE: [ \t\r\n]+    -> channel(HIDDEN);

DECIMAL: DEC_DIGIT+;
REAL:    DEC_DIGIT+ '.' DEC_DIGIT+;
STRING:  '\'' STRING_LITERAL* '\'';

ID : [a-zA-Z_] [a-zA-Z0-9_]* ;

fragment STRING_LITERAL: [A-Z_$0-9]*?[A-Z_$]+?[A-Z_$0-9]*;
fragment DEC_DIGIT:  [0-9];
