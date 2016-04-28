parser grammar Syn;

options {
  tokenVocab = Lex;
  output = AST;
backtrack = true;
}

@members
{
  private String cleanString(String s){
    String tmp;
    tmp = s.replaceAll("^'", "");
    s = tmp.replaceAll("'$", "");
    tmp = s.replaceAll("''", "'");
    return tmp;
  }
}

program :
    statements
  ;

statements :
    statement ( SEMICOLON^ statement )*
  ;

statement :
    WRITE^ OPENPAREN! (  string | exp | boolexp ) CLOSEPAREN!
  | READ^ OPENPAREN!(VARIABLE) CLOSEPAREN!
  | IF^ boolexp THEN statement ELSE statement
  | WHILE^ boolexp DO statement
  | WRITELN
  | VARIABLE 
  | SKIP
  | OPENPAREN! statements CLOSEPAREN!
  | VARIABLE ASSIGN^ exp
 
  ;

boolexp :
  boolterm  ( AND^  boolterm)*
  ;
boolterm:
  NOT^ bool 
  | bool
  ;
bool:
  TRUE
  |FALSE
  |exp EQUALS^ exp
  |exp LEQUALS^ exp
  |OPENPAREN! boolexp CLOSEPAREN!
  ;
exp:
  term ((PLUS^|MINUS^)term)*
  ;
term:
  factor(TIMES^ factor)*
  
  ;
factor:
  VARIABLE
  |INTNUM
  |OPENPAREN! exp CLOSEPAREN!
  ;
string
    scope { String tmp; }
    :
    s=STRING { $string::tmp = cleanString($s.text); }-> STRING[$string::tmp]
;