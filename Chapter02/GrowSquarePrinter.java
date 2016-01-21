/**
 * Programming Exercise P2.04
 * Java Concepts, 6th Edition, by Cay Horstmann
 **/

// Import our classes (c.f. 2.8)
//
// Docs for Rectangle: http://docs.oracle.com/javase/7/docs/api/java/awt/Rectangle.html

import java.awt.Rectangle;

public class GrowSquarePrinter {
    public static void main(String[] args) {

        // Declare and initialize our variables (c.f. 2.1, 2.2, 2.3)

        int xpos = 100;  // In a 'real life' program, these values would probably
        int ypos = 100;  // all come from some input from the user or elsewhere
        int size =  50;  // in the program.

        int growthFactor = (size / 2);

        // Declare and construct our objects (c.f. 2.4, 2.5, 2.6)

        Rectangle square = new Rectangle(xpos, ypos, size, size);

        // Print locaiton of the square

        System.out.println(square);

        // Translate, grow, then print the location again

        square.translate(growthFactor, growthFactor);
        square.grow(growthFactor, growthFactor);
        System.out.println(square);

        // Exit

        System.exit(0);
    }
}
