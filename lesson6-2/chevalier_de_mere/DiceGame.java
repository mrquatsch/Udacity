// lesson6/chevalier_de_mere

import java.util.Random;

public class DiceGame
{
    Random generator;
    private final int SEED = 45;
    
    public DiceGame()
    {   
        generator = new Random(SEED);
    }
    /** 
     * Throw a die four times and bet on at least one 6. 
     * @return true if the chevalier wins. 
     */
    public boolean game1()
    {
        // YOUR CODE HERE
        // Use the instance variable generator to simulate 
        // 4 die rolls. 
        // Return true if the chevalier wins (at least one is a 6).
	int rolls = 4;
	int hits = 0;
	boolean heWins = false;
	for (int i = 1; i <= rolls; i++) {
                int face = generator.nextInt(6) + 1;
	        if (face == 6) {
			hits++;
        	}
        }
	if (hits > 1) {
		heWins = true;
	}
	return heWins;
    }
    
    /**
     * Throw two dice 24 times and bet on at least one double-six.
     * @return true if the chevalier wins. 
     */
    public boolean game2()
    {   
        // YOUR CODE HERE 
        // Use the instance variable generator to simulate 
        // 24 rolls of a pair of dice.
        // Return true if at least one pair is both 6s.
        int rolls = 24;
	int hits = 0;
        boolean heWins = false;
        for (int i = 1; i <= rolls; i++) {
                int face1 = generator.nextInt(6) + 1;
		int face2 = generator.nextInt(6) + 1;
                if (face1 == 6 && face2 == 6) {
                        hits++;
                }
        }
	if (hits > 1) {
		heWins = true;
	}
        return heWins;
    }
}

