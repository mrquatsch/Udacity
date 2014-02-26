// BlueJ project: lesson6/darts

// Generate a random floating-point number and transform it so
// that it is between -1 and 1. Store in x. Repeat for y.
// Check that (x, y) is in the unit circle, that is, the distance
// between (0, 0) and (x, y) is <= 1.

// Hint: The distance between two points (x1, y1) and (x2, y2) is
// Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2))

import java.util.Random;
import java.util.Scanner;

/**
   This program computes an estimate of pi by simulating dart throws onto a square.
*/
public class MonteCarlo
{
    public static void main(String[] args)
    {
        System.out.println("Number of tries");
        Random generator = new Random(42);
        Scanner in = new Scanner(System.in);
        int tries = in.nextInt();

        int hits = 0;
        for (int i = 1; i <= tries; i++)
        {
            // Generate two random numbers between -1 and 1
	    // nextDouble() gives a value between 0 -> 1.
	    // Multiplying by 2 gives you a range between 0 -> 2.
	    // Subracting 1 from that range gives you a range between -1 -> 1
            double x = generator.nextDouble() * 2 - 1;

            double y = generator.nextDouble() * 2 - 1;
	    //System.out.println(x + " " + y);
            // Check whether the point lies in the unit circle
	    double distance = Math.sqrt((x - 0) * (x - 0) + (y - 0) * (y - 0));
            if (distance <= 1)
            {
                hits++;
            }
        }

        /*
           The ratio hits / tries is approximately the same as the ratio
           circle area / square area = pi / 4
        */

        double piEstimate = 4.0 * hits / tries;
        System.out.println("Estimate for pi: " + piEstimate);
    }
}
