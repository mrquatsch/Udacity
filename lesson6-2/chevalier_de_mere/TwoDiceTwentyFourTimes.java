// Simulates 24 random dice rolls.
// Each roll has two dice. 
// Prints "He won" if any roll contained double sixes.
// Prints "He lost" otherwise.

import java.util.Random;

public class TwoDiceTwentyFourTimes
{
    public static void main(String[] args)
    {
	final int SEED = 45;
        Random generator = new Random(SEED);
        boolean heWins = false;
	int rolls = 24;
	int hits = 0;
        
        // YOUR CODE HERE
        // Write a loop to simulate 24 dice rolls. 
        // Track whether the Chevalier de Meré wins or not
	for (int i = 1; i <= rolls; i++) {
		int face = generator.nextInt(6) + 1;
		if (face == 6) {
			heWins = true;
		}
	}
        if(heWins)
        {
            System.out.println("He won!");
        }
        else
        {
            System.out.println("He lost");
        }
    }
}
