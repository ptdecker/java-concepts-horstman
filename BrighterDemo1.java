/**
 * Programming Exercise P2.07
 * Java Concepts, 6th Edition, by Cay Horstmann
 **/

// Import our classes (c.f. 2.8)
//
// Docs:
//      - https://docs.oracle.com/javase/7/docs/api/java/awt/Color.html

import java.awt.Color;

public class BrighterDemo1 {

    public static void main(String[] args) {

        // Create RBG color of 50, 100, and 150 (HTML/CSS hex triplet: #326496)

        Color myColor = new Color(50, 100, 150);

        System.out.print("Original color: ");
        System.out.println(myColor);                 // Print it out on the console

        Color myBrighterColor = myColor.brighter();  // Create a new, brighter, color

        System.out.print("Brighter color: ");
        System.out.println(myBrighterColor);         // And, print it out too

        System.exit(0);

    }
}
