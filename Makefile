all: projet.g PtGen.java
	java -cp antlr-3.5.2-complete.jar org.antlr.Tool projet.g
	javac -cp antlr-3.5.2-complete.jar:lib:. projet.java

run:
	java -cp antlr-3.5.2-complete.jar:lib:. projet

clean:
	rm -rf *.class
	rm -rf tests/*.obj
