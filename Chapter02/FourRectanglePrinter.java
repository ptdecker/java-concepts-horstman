/**
 * Programming Exercise P2.03
 * Java Concepts, 6th Edition, by Cay Horstmann
 **/

// Import our classes (c.f. 2.8)
//
// Docs for Rectangle: http://docs.oracle.com/javase/7/docs/api/java/awt/Rectangle.html

import java.awt.Rectangle;

public class FourRectanglePrinter {
    public static void main(String[] args) {

        // Declare and initialize our variables (c.f. 2.1, 2.2, 2.3)

        int xpos        =  5;  // In a 'real life' program, these values would probably
        int ypos        = 10;  // all come from some input from the user or elsewhere
        int width       = 15;  // in the program.
        int height      = 20;

        // Declare and construct our objects (c.f. 2.4, 2.5, 2.6)

        Rectangle box = new Rectangle(xpos, ypos, width, height);

        // Print locaiton of the first box location

        System.out.println(box); // Upper left box

        // Translate and print three more times

        box.translate(width, 0); // Upper right
        System.out.println(box);

        box.translate(0, height); // Lower left
        System.out.println(box);

        box.translate(-width, 0);  // Lower right
        System.out.println(box);

        // Exit

        System.exit(0);
    }
}
