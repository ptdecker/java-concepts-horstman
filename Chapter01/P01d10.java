/**
 * Programming Exercise P1.10
 * Java Concepts, 6th Edition, by Cay Horstmann
 *
 * NOTE: This exercise introduces a Java GUI framework called 'Swing'. There
 *       is much to it and Chapter 1 doesn't touch on any of it. But, the book
 *       is just trying to give you a taste of what is possible with Java. 
 **/

import javax.swing.JOptionPane;

public class P01d10 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("What is your name?");
        JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
        System.exit(0);
    }
}
