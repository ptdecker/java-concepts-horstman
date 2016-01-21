/**
 * Programming Exercise P2.08
 * Java Concepts, 6th Edition, by Cay Horstmann
 **/

// Import our classes (c.f. 2.8)
//
// Docs:
//      - https://docs.oracle.com/javase/7/docs/api/java/awt/Color.html
//      - http://docs.oracle.com/javase/7/docs/api/javax/swing/JFrame.html

import java.awt.Color;
import javax.swing.JFrame;

public class BrighterDemo2 {

    public static void main(String[] args) {

        // Create RBG color of 50, 100, and 150 (HTML/CSS hex triplet: #326496)

        Color myColor = new Color(50, 100, 150);

        System.out.print("Original color: ");
        System.out.println(myColor);                 // Print it out on the console

        Color myBrighterColor = myColor.brighter();  // Create a new, brighter, color

        System.out.print("Brighter color: ");
        System.out.println(myBrighterColor);         // And, print it out too

        // Note, the above lines can (and would in professional code) be written as
        //
        // Color myBrighterColor = new Color(50, 100, 150).brighter();
        //
        // Since the myColor object is redundant and never used.

        // Create a 200x200 frame with default exit behavior

        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // And, render it with the brightened color as the background

        frame.getContentPane().setBackground(myBrighterColor);
        frame.setVisible(true);

    }
}
