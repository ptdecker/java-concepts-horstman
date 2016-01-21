/**
 * Programming Exercise P2.06
 * Java Concepts, 6th Edition, by Cay Horstmann
 **/

// Import our classes
//
// Docs:
//      - http://docs.oracle.com/javase/7/docs/api/java/awt/Rectangle.html
//      - http://docs.oracle.com/javase/7/docs/api/javax/swing/JFrame.html
//      - http://docs.oracle.com/javase/7/docs/api/javax/swing/JOptionPane.html

import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TranslateDemo {

    public static void main(String[] args) {

        // Initialize our variables

        int xpos   = 100;  // In a 'real life' program, these values would probably
        int ypos   = 100;  // all come from some input from the user or elsewhere
        int width  = 500;  // in the program.  For this program, we're going to use
        int height = 300;  // values big enough for a laptop screen.
        int moveX  = 200;  // And, we will move the box by an amount that is
        int moveY  = 200;  // noticable.

        // Construct a frame and render it

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Construct a rectangle and set the frame bounds (c.f. 2.4, 2.5, 2.6)

        Rectangle box = new Rectangle(xpos, ypos, width, height);  // Create a rectangle

        frame.setBounds(box);  // And use it to set the boundary of our window

        JOptionPane.showMessageDialog(frame, "Click OK to continue");  // Pause a bit

        // Move the rectangle and set frame bounds again

        box.translate(moveX, moveY);  // Now move the rectangle

        frame.setBounds(box);  // And use it to reset the boundary of our window

    }

} // class TranslateDemo
