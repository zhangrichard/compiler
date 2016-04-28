// COMS22201: Lexical analyser

lexer grammar Lex;

//---------------------------------------------------------------------------
// KEYWORDS
//---------------------------------------------------------------------------
WRITE      : 'write' ;
WRITELN    : 'writeln' ;
READ       : 'read' ;
THEN       : 'then';
WHILE	   : 'while' ; 
DO         : 'do';
ELSE       : 'else' ;
IF         : 'if' ;
SKIP       : 'skip';
FALSE      :  'false';
TRUE	   :  'true';

//---------------------------------------------------------------------------
// OPERATORS
//---------------------------------------------------------------------------
SEMICOLON    : ';' ;
OPENPAREN    : '(' ;
CLOSEPAREN   : ')' ;
EQUALS       : '='  ;
LEQUALS      : '<=' ;
PLUS         : '+'  ;
MINUS        : '-'  ;
TIMES        : '*'  ;
DIVIDE       : '/'  ;
ASSIGN       : ':=' ;
AND       : '&' ;
NOT 		 : '!';

INTNUM       : ('0'..'9')+ ;

STRING       : '\'' ('\'' '\'' | ~'\'')* '\'';

COMMENT      : '{' (~'}')* '}' {skip();} ;

WS           : (' ' | '\t' | '\r' | '\n' )+ {skip();} ;

VARIABLE   : ('A'..'Z' | 'a'..'z') (('0'..'9') | ('A'..'Z' | 'a'..'z') )*;