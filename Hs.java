// COMS22201: Code generation

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class Hs
{
  static int register = 1;
  public static void program(IRTree irt, PrintStream o)
  {
    emit(o, "{ head(IN)=n }");   // Initialize R0 to 0
    statement(irt, o);
    emit(o, "{ OUT=append(_,[n!,_,_]) }");           // Program must end with HALT
  }

  private static void statement(IRTree irt, PrintStream o)
  {

    if (irt.getOp().equals("Comp")) {
    	emit(o,"(Comp");
      statement(irt.getSub(0), o);
      statement(irt.getSub(1), o);
      emit(o," )");
    }
    else if (irt.getOp().equals("WriteS") ){
      String a = irt.getSub(0).getSub(0).getSub(0).getOp();
      emit(o, "(WriteS "+a +")");
    }
    else if (irt.getOp().equals("WriteA")) {
      String e = expression(irt.getSub(0));
      System.out.println(irt.getSub(0).getOp());
      emit(o, "(WriteA "+e+")");
    }
    else if (irt.getOp().equals("WriteB")) {
      String e = booleanExpression(irt.getSub(0));
      emit(o, "(WriteB "+e+")");
    }
    else if (irt.getOp().equals("READ")) {
      String a = irt.getSub(0).getSub(0).getSub(0).getOp();  
      emit(o, "(READ(\"" + a+"\")");
      
    } 
    else if (irt.getOp().equals("ASSIGN")) {
    	// String var = irt.getSub(0).getOp();
    	// String a = irt.getSub(1).getOp();
    	emit(o,"(Ass "+expression(irt.getSub(0))+expression(irt.getSub(1))+")");
    }
    else if (irt.getOp().equals("IF")) {
    	
    	emit(o,"(If " + booleanExpression(irt.getSub(0))); 
    	statement(irt.getSub(1),o);
    	statement(irt.getSub(2),o);
    	emit(o,")");
    	
    }
    else if (irt.getOp().equals("WHILE")) {
    	emit(o,"(While "+booleanExpression(irt.getSub(0)));
		statement(irt.getSub(1),o);
		emit(o,")");
    	
    	
    }
     else if (irt.getOp().equals("WRITELN")){
     	emit(o," WRITELN ");
     }
   
    else if (irt.getOp().equals("SKIP")){
      emit(o," Skip ");
    }
    else {
      error(irt.getOp());
    }
  }

  private static String booleanExpression(IRTree irt){
 	String result = "";
 	String instruction = irt.getOp();
 	if (instruction.equals("Eq")||instruction.equals("Le")){
 		result = "("+instruction+ " "+expression(irt.getSub(0))+" "+expression(irt.getSub(1))+")";
 	}
 	else if (irt.getOp().equals("TRUE") ||irt.getOp().equals("FALSE")){
      result = instruction;
    }
    else if (irt.getOp().equals("NOT")){
    result = "(Neg " + booleanExpression(irt.getSub(0))+")";
    
    }
    else {
      error(irt.getOp());
    }
    return result;
  }
  private static String expression(IRTree irt)
  {
  	String result = "";
 	String instruction = irt.getOp();
  	if  (irt.getOp().equals("Mul")||irt.getOp().equals("Add") || (irt.getOp().equals("Sub"))) {
      result = "("+instruction  + expression(irt.getSub(0))+ " " + expression(irt.getSub(1))+")";
      
    }
    if( (irt.getOp().equals("EQUALS"))) {
    	result = "(Eq" +expression(irt.getSub(0))+ " " + expression(irt.getSub(1))+")";
    }    
    if(irt.getOp().equals("LEQUALS")){
    	result = "(Le"+expression(irt.getSub(0))+ " " + expression(irt.getSub(1))+")";
    }
    if (irt.getOp().equals("VAR")) {
      result = "(V "+irt.getSub(0)+")";
    }
    if (irt.getOp().equals("NUM")) {
      result = "(N "+irt.getSub(0)+")";
    }

    else {
      error(irt.getOp());
    }
    return result;
  }

  private static void emit(PrintStream o, String s)
  {
    o.println(s);
  }

  private static void error(String op)
  {
    System.out.println("CG error: "+op);
    System.exit(1);
  }
}
