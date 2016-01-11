// COMS22201: Code generation

import java.util.*;
import java.io.*;
import java.lang.reflect.Array;
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

public class Cg
{
  static int register = 1;
  public static void program(IRTree irt, PrintStream o)
  {
    emit(o, "XOR R0,R0,R0");   // Initialize R0 to 0
    statement(irt, o);
    emit(o, "HALT");           // Program must end with HALT
    Memory.dumpData(o);        // Dump DATA lines: initial memory contents
  }

  private static void statement(IRTree irt, PrintStream o)
  {

    if (irt.getOp().equals("SEQ")) {
      statement(irt.getSub(0), o);
      statement(irt.getSub(1), o);
    }
    else if (irt.getOp().equals("WRS") && irt.getSub(0).getOp().equals("MEM") && irt.getSub(0).getSub(0).getOp().equals("CONST")) {
      String a = irt.getSub(0).getSub(0).getSub(0).getOp();
      emit(o, "WRS "+a);
    }
    else if (irt.getOp().equals("WR")) {
      String e = expression(irt.getSub(0), o);
      emit(o, "WR "+e);
    }
    else if (irt.getOp().equals("READ")) {
      String a = irt.getSub(0).getSub(0).getSub(0).getOp();  
      emit(o, "RD R"+register);
      emit(o, "STORE R"+register+",R0," + a);
      
    } 
    else if (irt.getOp().equals("BOOLEXP")){
      String a = irt.getSub(0).getSub(0).getSub(0).getOp();
      String a2 = irt.getSub(1).getSub(0).getSub(0).getOp();
      String a3 = irt.getSub(2).getSub(0).getSub(0).getOp();

      String e = expression(irt.getSub(3),o);
      if (e.equals("TRUE")){
        emit(o,("WRS " +a));
        emit(o,("WRS " +a3));
      }
      else{
        emit(o,("WRS " +a2));
        emit(o,("WRS " +a3));
      }
      

    }
    // else if (irt.getSub(0).getOp().equals("ADD")||irt.getSub(0).getOp().equals("SUB")) {
      
    //   String a = irt.getSub(0).getOp();
    //   result = "R" + register++;
    //   emit(o, a + " " + result + "," + expression(irt.getSub(0).getSub(0), o) + "," + expression(irt.getSub(0).getSub(1), o));

    // }
    // check here
    else if (irt.getOp().equals("MOVE")) {
      //variable
      String a = irt.getSub(0).getSub(0).getSub(0).getOp(); 
      // expression
      String resultReg = expression(irt.getSub(1), o);
      emit(o, "STORE " + resultReg + ",R0," + a);
    }
    else if (irt.getOp().equals("CJUMP")) {
      String op = irt.getSub(0).getOp();
      String label1 = irt.getSub(3).getOp();
      String label2 = irt.getSub(4).getOp();  
      String exp1 = expression(irt.getSub(1),o);
      String exp2 = expression(irt.getSub(2),o);
      // test for a<=b and a = b 
      emit(o,"SUB "+exp1+","+exp1+","+exp2); // a = a-b 
      if (op.equals("<=")){
        emit(o,"BLTZ"+" "+exp1+","+label1);
        emit(o,"BEQZ"+" "+exp1+","+label1);
        emit(o,"BGEZ"+" "+exp1+","+label2);
      }
      else if (op.equals("=")){
        emit(o,"BEQZ"+" "+exp1+","+label1);
        emit(o,"BNEZ"+" "+exp1+","+label2);
      }
    }
    else if (irt.getOp().equals("NOP")){
      emit(o,"NOP");
    }
    else if (irt.getOp().equals("LABEL")){
      emit(o,irt.getSub(0).getOp()+":");
    }
    else if (irt.getOp().equals("JUMP")){
      emit(o,"JMP "+irt.getSub(0));
    }
    else {
      error(irt.getOp());
    }
  }

  private static String expression(IRTree irt, PrintStream o)
  {
    String result = "";
    if (irt.getOp().equals("CONST")) {
      String t = irt.getSub(0).getOp();
      result = "R"+ register++;
      emit(o, "ADDI "+result+",R0,"+t);
    }
    else if (irt.getOp().equals("MEM")) {
      String t = irt.getSub(0).getSub(0).getOp();
      result = "R" + register++;
      emit(o, "LOAD "+result+",R0,"+t);
    }
    else if  (irt.getOp().equals("MUL")||irt.getOp().equals("ADD") || (irt.getOp().equals("SUB"))) {
      String instruction = irt.getOp();
      result = "R" + register++;
      emit(o, instruction + " " + result + "," + expression(irt.getSub(0), o) + "," + expression(irt.getSub(1), o));
    }
    else if (irt.getOp().equals("TRUE") ){
      result = irt.getOp();
      // emit(o,"JMP "+irt.getSub(0));
    }
    else if (irt.getOp().equals("FALSE") ){
      result = irt.getOp();
      // emit(o,"JMP "+irt.getSub(1));
    }
    else if (irt.getOp().equals("NOT")){
      String bool = expression(irt.getSub(0),o);
      result = bool.equals("TRUE")? "FALSE" :"TRUE";
    }
    else if (irt.getOp().equals("AND")){
      boolean b1,b2,boolResult;
      b1 = expression(irt.getSub(0),o).equals("TRUE")? true : false;
      b2 = expression(irt.getSub(1),o).equals("TRUE")? true : false;
      boolResult = b1&b2;
      result = boolResult? "TRUE":"FALSE";
    }
    // else if (irt.getSub(0).getOp().equals("MUL"))
    // {
    //   String instruction = irt.getSub(0).getOp();
    //   result = "R" + register++;
    //   emit(o, instruction + " " + result + "," + expression(irt.getSub(0), o) + "," + expression(irt.getSub(1), o));
    // }

    else {
      error(irt.getOp());
    }
    return result;
    // String result = "";
    // if () {
      
    // }
    // else if (irt.getOp().equals("MUL") || (irt.getOp().equals("ADD")) || (irt.getOp().equals("SUB"))) {
    //   String instruction = irt.getOp();
    //   result = "R" + register++;
    //   emit(o, instruction + " " + result + "," + expression(irt.getSub(0), o) + "," + expression(irt.getSub(1), o));
    // }
    // else {
    //   constant(irt,o);
    // }
  }
  // public static String factor(IRTree irt, PrintStream o){
  //   String result = "";
  //   if (irt.getOp().equals("MEM")) {
  //     String t = irt.getSub(0).getSub(0).getOp();
  //     result = "R"+ register++;
  //     emit(o, "LOAD "+result+",R0,"+t);
  //   }
   
  //   else {
  //     constant(irt,o);
  //   }
  // }
  // private static String constant(IRTree irt, PrintStream o){
  //     String result = "";
  //       if (irt.getOp().equals("CONST")) {
  //         String t = irt.getSub(0).getOp();
  //         result = "R"+ register++;
  //         emit(o, "ADDI "+result+",R0,"+t);
  //       }
  //        else {
  //         error(irt.getOp());
  //       }
  //       return result;
  // }
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
