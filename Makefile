all: projet.g PtGen.java Edl.java
	java -cp antlr-3.5.2-complete.jar org.antlr.Tool projet.g
	javac -cp antlr-3.5.2-complete.jar:lib:. projet.java
	javac -cp antlr-3.5.2-complete.jar:lib:. Edl.java

run:
	java -cp antlr-3.5.2-complete.jar:lib:. projet

edl:
	java -cp antlr-3.5.2-complete.jar:lib:. Edl

test:
	java -cp lib:. Mapile

clean:
	rm -rf *.class
	rm -rf tests/*.obj
	rm -rf tests/*.gen
