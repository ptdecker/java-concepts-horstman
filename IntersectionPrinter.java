/**
 * Programming Exercise P2.05
 * Java Concepts, 6th Edition, by Cay Horstmann
 **/

// Import our classes (c.f. 2.8)
//
// Docs for Rectangle: http://docs.oracle.com/javase/7/docs/api/java/awt/Rectangle.html

import java.awt.Rectangle;

public class IntersectionPrinter {
    public static void main(String[] args) {

        // box1 and box2 intersect

        Rectangle box1 = new Rectangle(10, 10, 10, 10);
        Rectangle box2 = new Rectangle(15, 15, 10, 10);

        // box3 does not intersect with neither box1 nor box2

        Rectangle box3 = new Rectangle(30, 30, 10, 10);

        // box4 represents the intersection of box1 and box2

        Rectangle box4 = box1.intersection(box2);

        // box5 represents the intersection of box1 and box3 (which is empty)

        Rectangle box5 = box1.intersection(box3);

        // Print locations of the intersection rectangles

        System.out.println(box1);
        System.out.println(box2);
        System.out.println(box3);

        // Print locations of the intersection rectangles

        System.out.println(box4);
        System.out.print(box5);

        // We can test if a rectangle is an empty rectangle using the isEmpty() method

        if (box5.isEmpty()) {
            System.out.print(" is empty");
        }
        System.out.println();

        // Exit

        System.exit(0);
    }
}
