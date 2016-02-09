# compiler
compiler project at Bristol University 

A statement of which of the language features you have successfully implemented.
I have implement the language features as followed
# Variables and assignment
# Arithmetic expressions
# read statements and write statements
# if and skip statements
# while loops
# Boolean expressions (true, false, !, &)


Use make file to run the example test7
	./antlr3 Lex.g
	./antlr3 Syn.g
	javac TokenConv.java
	java TokenConv Syn.tokens Irt.java 
	./antlr3 *.java
	./antlr3 camle test7.w
	./antlr3 camle -syn test7.w | ./disptree
	./assmule test7.ass


For other file and test

./antlr3 camle ???.w
./assmule ???.ass

test1.ass
10023
10023
76
76

test2.ass
7
-5
28
-91
70

test3.ass
Enter a number: 3
Enter a number: 4
First is 3; second is 4

test4.ass
13
5

78bce

test5.ass
1
WARNING: Disabled backward jump in    9: JMP 1  
3
WARNING: Disabled backward jump in   25: JMP 18  
7
WARNING: Disabled backward jump in   45: JMP 37  
b
WARNING: Disabled backward jump in   69: JMP 63  
c
WARNING: Disabled backward jump in   83: JMP 76  
d
WARNING: Disabled backward jump in   91: JMP 84  
WARNING: Disabled backward jump in   92: JMP 70 

test6.ass
true
false
false
true
true
false
false
false
true
false
false
false
false

test7.ass
Factorial calculator
Enter number: 3
Factorial of 3 is 6

Exponential calculator
Enter base: 2
Enter exponent: 3
2 raised to the power of 3 is 8
