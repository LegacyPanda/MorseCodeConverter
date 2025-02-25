@echo off 
rem This batch file compiles and runs the Java source code
rem MASUNDA_TJ_223003954_CSC02A2_2025_P01

cls

set "JAVA_HOME=C:\Program Files\Java\jdk-23
set "PATH=%JAVA_HOME%\bin;%PATH%"

javac --version

set bin=..\bin
set docs=.
set src=..\src
set data=..\data
set lib=..\lib

if exist %bin%\*.class del /Q %bin%\*.class
rem above I am deleting any .class files in the bin directory

rem deleting any existing files in the src directory
if exist %src%\*.class del /Q %src%\*.class
if exist %src%\acsse\csc2a\*.class del /Q %src%\acsse\csc2a\*.class

echo Compiling the java code
javac -sourcepath %src% -cp %bin% -d %bin% %src%\acsse\csc2a\*.java %src%\Main.java

echo Running the Java code
java -classpath %bin% Main

echo Dissasembling code
javap -c -classpath %bin% Main > %docs%\ByteCode.txt
rem javap decompiles the compiled .class files to show the bytecode

pause

