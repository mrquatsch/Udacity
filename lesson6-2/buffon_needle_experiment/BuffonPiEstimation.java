// Estimates pi using the Compte de Buffon's needle dropping method
// Take a 1 inch needle. Repeatedly drop it on a sheet of
// ruled paper whose lines are 2 inches apart 
// tries / hits = an approximation of pi

import java.util.Random;

public class BuffonPiEstimation
{
    public static void main(String[] args) 
    {
        int tries = 30000;
        Random generator = new Random();
        int hits = 0;
        
        for (int i = 0; i < tries; i++)
        {
            double yLow = generator.nextDouble() * 2; // between 0 and 2?
            double a = generator.nextDouble() * 180; // between 0 and 180
            double yHigh = yLow + Math.sin(Math.toRadians(a));

            if (yHigh >= 2)
            {
                hits++;
            }
        }
	System.out.println();
        System.out.println((double) tries / hits);
        
    }   
}
