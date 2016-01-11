all:
	./antlr3 Lex.g
	./antlr3 Syn.g
	javac TokenConv.java
	java TokenConv Syn.tokens Irt.java 
	./antlr3 *.java
	./antlr3 camle test7.w
	./antlr3 camle -syn test7.w | ./disptree
	./assmule test7.ass

clean:
	rm -f *.class
	rm -f *.txt
	rm -f *.tokens
	rm -f *.ass
	rm -f Lex.java
	rm -f Syn.java
