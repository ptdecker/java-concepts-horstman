/**
 * Programming Exercise P2.09
 * Java Concepts, 6th Edition, by Cay Horstmann
 **/

// Import our classes (c.f. 2.8)
//
// Docs:
//      - https://docs.oracle.com/javase/7/docs/api/java/awt/Color.html
//      - http://docs.oracle.com/javase/7/docs/api/javax/swing/JFrame.html

import java.awt.Color;
import javax.swing.JFrame;

public class BrighterDemo3 {

    public static void main(String[] args) {

        // Create an object of color 'RED' (which is defined in java.awt.Color as HTML/CSS hex triplet: #FF0000)

        Color myColor = Color.RED;

        System.out.print("Original color: ");
        System.out.println(myColor);

        Color myDarkerColor = myColor.darker().darker();  // Create a new, brighter, color

        System.out.print("Darker color  : ");
        System.out.println(myDarkerColor);

        // Note, the above lines can (and would in professional code) be written as
        //
        // Color myDarkerColor = Color.RED.darker().darker();
        //
        // Since the myColor object is redundant and never used.

        // Create a 200x200 frame with default exit behavior

        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // And, render it with the brightened color as the background

        frame.getContentPane().setBackground(myDarkerColor);
        frame.setVisible(true);

    }
}
