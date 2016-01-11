  // COMS22201: IR tree construction

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class Irt
{
// The code below is generated automatically from the ".tokens" file of the 
// ANTLR syntax analysis, using the TokenConv program.
//
// CAMLE TOKENS BEGIN
  public static final String[] tokenNames = new String[] {
"NONE", "NONE", "NONE", "NONE", "AND", "ASSIGN", "CLOSEPAREN", "COMMENT", "DIVIDE", "DO", "ELSE", "EQUALS", "FALSE", "IF", "INTNUM", "LEQUALS", "MINUS", "NOT", "OPENPAREN", "PLUS", "READ", "SEMICOLON", "SKIP", "STRING", "THEN", "TIMES", "TRUE", "VARIABLE", "WHILE", "WRITE", "WRITELN", "WS"};
  public static final int AND=4;
  public static final int ASSIGN=5;
  public static final int CLOSEPAREN=6;
  public static final int COMMENT=7;
  public static final int DIVIDE=8;
  public static final int DO=9;
  public static final int ELSE=10;
  public static final int EQUALS=11;
  public static final int FALSE=12;
  public static final int IF=13;
  public static final int INTNUM=14;
  public static final int LEQUALS=15;
  public static final int MINUS=16;
  public static final int NOT=17;
  public static final int OPENPAREN=18;
  public static final int PLUS=19;
  public static final int READ=20;
  public static final int SEMICOLON=21;
  public static final int SKIP=22;
  public static final int STRING=23;
  public static final int THEN=24;
  public static final int TIMES=25;
  public static final int TRUE=26;
  public static final int VARIABLE=27;
  public static final int WHILE=28;
  public static final int WRITE=29;
  public static final int WRITELN=30;
  public static final int WS=31;
// CAMLE TOKENS END

  static int LABEL = 0;
  public static IRTree convert(CommonTree ast)
  {
    IRTree irt = new IRTree();
    program(ast, irt);
    return irt;
  }

  public static void program(CommonTree ast, IRTree irt)
  {
    statements(ast, irt);
  }

  public static void statements(CommonTree ast, IRTree irt)
  {
    int i;
    Token t = ast.getToken();
    int tt = t.getType();
    if (tt == SEMICOLON) {
      IRTree irt1 = new IRTree();
      IRTree irt2 = new IRTree();
      CommonTree ast1 = (CommonTree)ast.getChild(0);
      CommonTree ast2 = (CommonTree)ast.getChild(1);
      statements(ast1, irt1);
      statements(ast2, irt2);
      irt.setOp("SEQ");
      irt.addSub(irt1);
      irt.addSub(irt2);
    }
    else {
      statement(ast, irt);
    }
  }

  public static void statement(CommonTree ast, IRTree irt)
  {
    CommonTree ast1, ast2, ast3;
    IRTree irt1 = new IRTree(), irt2 = new IRTree(), irt3 = new IRTree();
    Token t = ast.getToken();

    int tt = t.getType();

    if (tt == WRITE) {
      ast1 = (CommonTree)ast.getChild(0);
      String type = arg(ast1, irt1);
      if (type.equals("int")) {
        irt.setOp("WR");
        irt.addSub(irt1);
      }
      else if (type.equals("bool")){
        irt.setOp("BOOLEXP");
        String a = String.valueOf(Memory.allocateString("true"));
        String a2 = String.valueOf(Memory.allocateString("false"));
        String a3 = String.valueOf(Memory.allocateString("\n"));

        irt.addSub(new IRTree("MEM", new IRTree("CONST", new IRTree(a))));
        irt.addSub(new IRTree("MEM", new IRTree("CONST", new IRTree(a2))));
        irt.addSub(new IRTree("MEM", new IRTree("CONST", new IRTree(a3))));

        irt.addSub(irt1);
      }
      else {
        irt.setOp("WRS");
        irt.addSub(irt1);
      }
    }
    
      // CommonTree b,s1,s2;
      // IRTree irt4 = new IRTree(), irt5 = new IRTree(), irtS1 = new IRTree(), irtS2 = new IRTree();
      // b = (CommonTree)ast.getChild(0);
      // String labelTrue = generateLabel();
      // String labelFalse = generateLabel();
      // String label = generateLabel();

      // String a = String.valueOf(Memory.allocateString("true"));
      // String a2 = String.valueOf(Memory.allocateString("false"));
      // irtS1.setOp("WRS");
      // irt.addSub(new IRTree("MEM", new IRTree("CONST", new IRTree(a))));
      // irtS2.setOp("WRS");
      // irt.addSub(new IRTree("MEM", new IRTree("CONST", new IRTree(a2))));
      
      // irt5.setOp("SEQ");
      // irt5.addSub(irtS2);
      // irt5.addSub(new IRTree("LABEL",new IRTree(label)));
      // irt4.setOp("SEQ");
      // irt4.addSub(new IRTree("LABELFALSE",new IRTree(labelFalse)));
      // irt4.addSub(irt5);
      // irt3.setOp("SEQ");
      // irt3.addSub(new IRTree("JUMP",new IRTree(label)));
      // irt3.addSub(irt4);
      // irt2.setOp("SEQ");
      // irt2.addSub(irtS1);
      // irt2.addSub(irt3);
      // irt1.setOp("SEQ");
      // irt1.addSub(new IRTree("LABELTRUE",new IRTree(labelTrue)));
      // irt1.addSub(irt2);
      // irt.setOp("SEQ");
      // irt.addSub(translate(b,labelTrue,labelFalse));
      // irt.addSub(irt1);
      
    
    else if (tt == WRITELN) {
      String a = String.valueOf(Memory.allocateString("\n"));
       irt.setOp("WRS");
      irt.addSub(new IRTree("MEM", new IRTree("CONST", new IRTree(a))));
    }
    else if (tt == ASSIGN){
      irt.setOp("MOVE");
      ast1 = (CommonTree)ast.getChild(0);
      ast2 = (CommonTree)ast.getChild(1);
      arg(ast1,irt1);
      arg(ast2,irt2);
      irt.addSub(irt1);
      irt.addSub(irt2);
    }
    else if (tt == READ){
      irt.setOp("READ");
      ast1 = (CommonTree)ast.getChild(0);
      String text = ast1.getText();
      irt.addSub(new IRTree("MEM",new IRTree("CONST",new IRTree(Memory.allocate(text)+""))));
                
    }
    else if (tt == IF){
      // irt.setOp("SEQ");
      // translate(as)
      String label1 = generateLabel();
      String label2 = generateLabel();
      String label = generateLabel();

      IRTree irt4 = new IRTree(), irt5 = new IRTree(), irtS1 = new IRTree(), irtS2 = new IRTree();
      CommonTree b,s1,s2;
      b = (CommonTree)ast.getChild(0);
      s1 = (CommonTree)ast.getChild(2);
      s2 = (CommonTree)ast.getChild(4);
      statements(s1,irtS1);
      statements(s2,irtS2);
      irt5.setOp("SEQ");
      irt5.addSub(irtS2);
      irt5.addSub(new IRTree("LABEL",new IRTree(label)));
      irt4.setOp("SEQ");
      irt4.addSub(new IRTree("LABEL",new IRTree(label2)));
      irt4.addSub(irt5);
      irt3.setOp("SEQ");
      irt3.addSub(new IRTree("JUMP",new IRTree(label)));
      irt3.addSub(irt4);
      irt2.setOp("SEQ");
      irt2.addSub(irtS1);
      irt2.addSub(irt3);
      irt1.setOp("SEQ");
      irt1.addSub(new IRTree("LABEL",new IRTree(label1)));
      irt1.addSub(irt2);
      irt.setOp("SEQ");
      irt.addSub(translate(b,label1,label2));
      irt.addSub(irt1);

    }else if (tt == SKIP){
      irt.setOp("NOP");
    }
    else if (tt == WHILE){
      String label1 = generateLabel();
      String label2 = generateLabel();
      String label = generateLabel();
      CommonTree b,s1,s2;
      IRTree irt4 = new IRTree(), irtS1 = new IRTree(), irtS2 = new IRTree();;
      b = (CommonTree)ast.getChild(0);
      s1 = (CommonTree)ast.getChild(2);
      statements(s1,irtS1);
   
      irt4.setOp("SEQ");
      irt4.addSub(new IRTree("JUMP",new IRTree(label1)));
      irt4.addSub(new IRTree("LABEL",new IRTree(label)));
      irt3.setOp("SEQ");
      irt3.addSub(irtS1);
      irt3.addSub(irt4);
      irt2.setOp("SEQ");
      irt2.addSub(new IRTree("LABEL",new IRTree(label2)));
      irt2.addSub(irt3);
      irt1.setOp("SEQ");
      irt1.addSub(translate(b,label2,label));
      irt1.addSub(irt2);
      irt.setOp("SEQ");
      // irt.addSub(translate(b,label1,label2));
      irt.addSub(new IRTree("LABEL",new IRTree(label1)));
      irt.addSub(irt1);
    }
    // else if 
    // else if (tt == TIMES || tt == DIV || tt == PLUS || MINUS) {
    //   irt.setOp("")
    // }

    else {
      error(tt);
    }
  }

  // public static String label(CommonTree ast, IRTree irt){
  //   Token t = ast.getToken();
  //   int tt = t.getType();
  //   if (tt == STRING) {
  //     String tx = t.getText();
  //     int a = Memory.allocateString(tx); 
  //     String st = String.valueOf(a);
  //     irt.setOp("MEM");
  //     irt.addSub(new IRTree("CONST", new IRTree(st)));
  //     System.out.println("string is" +a); 
  //     return "string";
  //   }
  // }
  
  public static String arg(CommonTree ast, IRTree irt)
  {
    Token t = ast.getToken();
    int tt = t.getType();
    if (tt == STRING) {
      String tx = t.getText();
      int a = Memory.allocateString(tx); 
      String st = String.valueOf(a);
      irt.setOp("MEM");
      irt.addSub(new IRTree("CONST", new IRTree(st)));
      return "string";
    }
    else if (tt == AND || tt == NOT || tt == TRUE || tt ==FALSE){
      booleanExpression(ast,irt);
      return "bool";
    }
    
    else {
      expression(ast, irt);
      return "int";
    }
  }
  public static IRTree translate(CommonTree ast,String n1,String n2){
    IRTree irt = new IRTree(), irt1 = new IRTree(), irt2 = new IRTree(), irt3 = new IRTree();
    CommonTree b1,b2;
    b1 = (CommonTree)ast.getChild(0);

    // check the ast1
    Token t = ast.getToken();
    int tt = t.getType();
    if (tt == AND){
    b2 = (CommonTree)ast.getChild(1);
      String next = generateLabel();
      irt1.setOp("SEQ");
      irt1.addSub(new IRTree("LABEL",new IRTree(next)));
      irt1.addSub(translate(b2, n1,n2));
      irt.setOp("SEQ");
      irt.addSub(translate(b1,next,n2));
      irt.addSub(irt1);
      
    }
    else if (tt == TRUE){
      irt.setOp("TRUE");
      irt.addSub(new IRTree(n1));
      irt.addSub(new IRTree(n2));
    }
    else if (tt == FALSE){
      irt.setOp("FALSE");
      irt.addSub(new IRTree(n1));
      irt.addSub(new IRTree(n2));
    }
    else if (tt == NOT) {
      irt = (IRTree)translate(b1,n2,n1);
    }
    else if (tt == EQUALS) {
      b2 = (CommonTree)ast.getChild(1);
      irt = (IRTree)cJump("=",b1,b2,n1,n2);
    }
    else if (tt == LEQUALS){
      b2 = (CommonTree)ast.getChild(1);
      irt = (IRTree)cJump("<=",b1,b2,n1,n2);
    }
    return irt;
  }

  public static IRTree cJump (String op, CommonTree ast1,CommonTree ast2,String n1,String n2){
    IRTree irt1 = new IRTree(), irt2 = new IRTree(), irt3 = new IRTree();
    irt1.setOp("CJUMP");
    arg(ast1,irt2);
    arg(ast2,irt3);
    irt1.addSub(new IRTree(op));
    irt1.addSub(irt2);
    irt1.addSub(irt3);
    irt1.addSub(new IRTree(n1));
    irt1.addSub(new IRTree(n2));
    return irt1;
    
  }
  public static void booleanExpression(CommonTree ast, IRTree irt){
    CommonTree bool,bool2;
    IRTree irt1 = new IRTree(),irt2 = new IRTree();
    Token t = ast.getToken();
    int tt = t.getType();
    if (tt ==AND) {
    irt.setOp("AND");
    bool = (CommonTree)ast.getChild(0);
    bool2 = (CommonTree)ast.getChild(1);

    boolTerm(bool,irt1);
    boolTerm(bool2,irt2);
    irt.addSub(irt1);
    irt.addSub(irt2);
      return; 
    }
    else{
      boolTerm(ast,irt);
    }
  }
  public static void boolTerm(CommonTree ast, IRTree irt){
    CommonTree ast1;
    IRTree irt1 = new IRTree();
    Token t = ast.getToken();
    int tt = t.getType();
    int a;
    if (tt == NOT) {
      irt.setOp("NOT");
      ast1 = (CommonTree)ast.getChild(0);
      bool(ast1,irt1);

      irt.addSub(irt1);
      return;
    }
    else{
      bool(ast,irt);
    }
  }
  public static void bool(CommonTree ast, IRTree irt){
    Token t = ast.getToken();
    int tt = t.getType();
    if (tt == TRUE) {
    irt.setOp("TRUE");
    }
    else if (tt == FALSE) {
    irt.setOp("FALSE");
    }
    // else if (tt == EQUALS){
      
    // }
    else{
      booleanExpression(ast,irt);
    }
  }
  public static void expression(CommonTree ast, IRTree irt)
  {
    CommonTree ast1,ast2;
    IRTree irt1 = new IRTree();
    IRTree irt2 = new IRTree();
    Token t = ast.getToken();
    int tt = t.getType();
    if (tt == PLUS){
      irt.setOp("ADD");
      ast1 = (CommonTree)ast.getChild(0);
      ast2 = (CommonTree)ast.getChild(1);
      term(ast1,irt1);
      term(ast2,irt2);
      irt.addSub(irt1);
      irt.addSub(irt2);
    }
    else if (tt == MINUS){
      irt.setOp("SUB");
      ast1 = (CommonTree)ast.getChild(0);
      ast2 = (CommonTree)ast.getChild(1);
      term(ast1,irt1);
      term(ast2,irt2);
      irt.addSub(irt1);
      irt.addSub(irt2);
    }
    else {
      term(ast,irt);
    }
    // if (tt == INTNUM) {
    //   constant(ast, irt1);
    //   irt.setOp("CONST");
    //   // System.out.println("constant is"); 
    //   irt.addSub(irt1);
    // }
    // else if (tt == VARIABLE){
    //   irt.setOp("MEM");

    //   String a = String.valueOf(Memory.allocate(t.getText()));
    //   System.out.println("VARIABLE is" +a); 
    //   irt.addSub(new IRTree("CONST", new IRTree(a)));
      
    // }
  }

  public static void term(CommonTree ast, IRTree irt)
  {
    CommonTree ast1,ast2;
    IRTree irt1 = new IRTree();
    IRTree irt2 = new IRTree();
     Token t = ast.getToken();
    int tt = t.getType();
    if (tt == TIMES){
      irt.setOp("MUL");
      ast1 = (CommonTree)ast.getChild(0);
      ast2 = (CommonTree)ast.getChild(1);
      factor(ast1,irt1);
      factor(ast2,irt2);
      irt.addSub(irt1);
      irt.addSub(irt2);
    }
    else {
      factor(ast,irt);
    }
  }
  public static void factor (CommonTree ast, IRTree irt)
  {
    CommonTree ast1,ast2;
    IRTree irt1 = new IRTree();
    IRTree irt2 = new IRTree();
     Token t = ast.getToken();
    int tt = t.getType();
    if (tt == INTNUM) {
      constant(ast, irt1);
      irt.setOp("CONST");
      irt.addSub(irt1);
    }
    else if (tt == VARIABLE){
      irt.setOp("MEM");
      String a = String.valueOf(Memory.allocate(t.getText()));
      irt.addSub(new IRTree("CONST", new IRTree(a)));
      
    }
    else {
      expression(ast,irt);
    }

  }
  public static String generateLabel(){
    return "n"+LABEL++;
  }
  public static void constant(CommonTree ast, IRTree irt)
  {
    Token t = ast.getToken();
    int tt = t.getType();
    if (tt == INTNUM) {

      String tx = t.getText();
      irt.setOp(tx);
    }

    else {
      error(tt);
    }
  }

  private static void error(int tt)
  {
    System.out.println("IRT error: "+tokenNames[tt]);
    System.exit(1);
  }
}
