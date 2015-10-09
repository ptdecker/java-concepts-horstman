# java-concepts-horstman
Selected programming exercise solutions from Cay Horstmann's "Java Concepts", 6th Edition, for Intro to Java class for Barstow Knight's Robotics Team

## Compiling

To compile an exercise solution:

    $ javac &lt;exercise&gt;.java

Where "&lt;exercise&gt;" is replaced by the name of the exercise. Exercises are generally named along the lines of "P01d01" for exercise "P1-1". Note the leading zero for exercises and chapters 1 through 9. This is done so that the files sort nicely in your file list. The exception to this general rule is when the exercise gives you a specific name to use. For example, exercise P1.3 instructs you to call your program "FacePrinter".  Projects are named along the lines of "Project1d01"

Compiling will create the "&lt;exercise&gt;".class file that you will need to run your program.

## Running

Once compiled, to run your exercise use:

    $ java &lt;exercise&gt;

## Script

If you're using Linux or Mac OS X, there is a script you can run that will compile, run your program, then clean up the created class file:

    $ ./run.sh &lt;exercise&gt;

