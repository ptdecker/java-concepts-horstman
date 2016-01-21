/**
 * Programming Exercise P2.11
 * Java Concepts, 6th Edition, by Cay Horstmann
 **/

// Import our classes (c.f. 2.8)
//
// Docs:
//      - http://docs.oracle.com/javase/7/docs/api/java/util/Random.html

import java.util.Random;

public class LotteryPrinter {

    public static void main(String[] args) {

        Random generator = new Random();

        System.out.println("Play this combination -- it'll make you rich!");

        System.out.print(generator.nextInt(49) + 1);
        System.out.print(" ");
        System.out.print(generator.nextInt(49) + 1);
        System.out.print(" ");
        System.out.print(generator.nextInt(49) + 1);
        System.out.print(" ");
        System.out.print(generator.nextInt(49) + 1);
        System.out.print(" ");
        System.out.print(generator.nextInt(49) + 1);
        System.out.print(" ");
        System.out.print(generator.nextInt(49) + 1);
        System.out.println();

    }
}

/*
// One solution for this problem with the duplicates eliminated
// and the numbers in the proper order would be the following. There
// are many other possible solutions that leverage other standard
// Java library classes.  The solution below uses just basic utility
// library classes.
//
// See: http://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
//      http://docs.oracle.com/javase/7/docs/api/java/lang/String.html

import java.util.Random;
import java.util.Arrays;

public class LotteryPrinter {

    public static void main(String[] args) {

        Random  generator   = new Random();
        int     onePic      = 0;
        int     lottoPics[] = new int[6];
        boolean dup         = false;

        System.out.println("Play this combination -- it'll make you rich!");

        // Pick six numbers

        for (int i = 0; i < 6; i++) {

            // Pick a random number and add it to the list if it does not duplicate
            // a number already in the list

            do {
                onePic = generator.nextInt(49) + 1;
                dup = false;
                for (int j = 0; (j < i && !dup); j++) {
                    dup = (lottoPics[j] == onePic);
                }
            } while (dup);

            lottoPics[i] = onePic;
        }

        // Sort the result

        Arrays.sort(lottoPics);

        // And print with a single space between each pick

        String lottoPicsString = new String(Arrays.toString(lottoPics));
        System.out.println(lottoPicsString.substring(1, lottoPicsString.length() - 1).replaceAll(", ", " "));
    }
}
*/
