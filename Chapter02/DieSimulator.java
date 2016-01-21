/**
 * Programming Exercise P2.10
 * Java Concepts, 6th Edition, by Cay Horstmann
 **/

// Import our classes (c.f. 2.8)
//
// Docs:
//      - http://docs.oracle.com/javase/7/docs/api/java/util/Random.html

import java.util.Random;

public class DieSimulator {

    public static void main(String[] args) {

        Random generator = new Random();

        int d6DieRoll = (generator.nextInt(6) + 1);

        System.out.println(d6DieRoll);

        // Note:  The above could all be written as:
        //
        // System.out.println(new Random().nextInt(6) + 1);

    }
}
