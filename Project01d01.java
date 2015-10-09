/**
 * Programming Project 1.1
 * Java Concepts, 6th Edition, by Cay Horstmann
 *
 **/

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Project01d01 {
    public static void main(String[] args) throws Exception {
        String name = JOptionPane.showInputDialog("What is your name?");
        String action = JOptionPane.showInputDialog("What would you like me to do?");
        URL imageLocation = new URL("http://findicons.com/files/icons/1207/skelanimals/128/bunny.png");
        JOptionPane.showMessageDialog(
                    null,
                    "I'm sorry, " + name + ". I'm afraid I can't do that.",
                    "Barstow Kuhnigits",
                    JOptionPane.PLAIN_MESSAGE,
                    new ImageIcon(imageLocation)
                );
        System.exit(0);
    }
}
