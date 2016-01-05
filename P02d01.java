/**
 * Programming Exercise P2.01
 * Java Concepts, 6th Edition, by Cay Horstmann
 **/

// Import our classes (c.f. 2.8)
//
// Docs for Rectangle: http://docs.oracle.com/javase/7/docs/api/java/awt/Rectangle.html

import java.awt.Rectangle;

public class P02d01 {
    public static void main(String[] args) {

        // Declare and initialize our variables (c.f. 2.1, 2.2, 2.3)
        //
        // Note:  'long' is also an integer but can hold larger numbers.
        //         See: http://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html
        //         We use it because Math.round (see below) returns a long and we must match types
        //         because Java is a strongly typed language

        int xpos        =  5;  // In a 'real life' program, these values would probably
        int ypos        = 10;  // all come from some input from the user or elsewhere
        int width       = 15;  // in the program.
        int height      = 20;

        long calcedArea =  0;

        // Declare and construct our objects (c.f. 2.4, 2.5, 2.6)

        Rectangle box = new Rectangle(xpos, ypos, (xpos + width), (ypos + height));

        // Calculate the area using the object's accessor methods
        //
        // Note:  Rectangle stores its x, y, width, and height values using the type 'double'. So,
        //        we need to use the round() function from the Math library (which is automatically
        //        imported) to convert to a long.
        //
        //        Docs for Math.round:  http://docs.oracle.com/javase/7/docs/api/java/lang/Math.html

        calcedArea = Math.round((box.getWidth() - box.getX()) * (box.getHeight() - box.getY()));

        // Print out what we calculated

        System.out.print("Area: ");
        System.out.print(calcedArea);
        System.out.println();

        // Print out the expected result

        System.out.println("Expected: 300");  // A 15x20 box has an area of 300

        // Exit

        System.exit(0);
    }
}
