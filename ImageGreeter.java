/**
 * Programming Exercise P1.11
 * Java Concepts, 6th Edition, by Cay Horstmann
 *
 * NOTE: This exercise introduces a Java GUI framework called 'Swing' and then
 *       goes further and uses the Java networking package too. We're certainly
 *       getting ahead of ourselves here, but continuing the trend of giving you
 *       a taste of what's possible.
 *
 * NOTE2: To make it easier to read, the parameters passed to
 *        JOptionPain.showMessageDialog are listed each on their own line. This
 *        is a good 'real world' habit to follow.
 **/

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ImageGreeter {
    public static void main(String[] args) throws Exception {
        URL imageLocation = new URL("http://findicons.com/files/icons/1207/skelanimals/128/bunny.png");
        JOptionPane.showMessageDialog(
                    null,
                    "Kuhnigits Rule!",
                    "Barstow Kuhnigits 1939",
                    JOptionPane.PLAIN_MESSAGE,
                    new ImageIcon(imageLocation)
                );
        System.exit(0);
    }
}
