JDK 8 or higher is required to run this program.
 
How to compile and run the Program through command prompt -
1) Open cmd.
2) Go to  parking_lot  directory (where all src,readme and input file is present).
3) to compile :      javac -d bin -sourcepath src -cp lib/lib1.jar;lib/lib2.jar src/com/Tester/Main.java
4) to run        :     java -cp bin;lib/lib1.jar;lib/lib2.jar com.Tester.Main "input_file.txt"