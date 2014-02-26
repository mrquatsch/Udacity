//hw05_11
//
// Complete this method to read integer scores from the user and find the average
 // Stop asking for input when the user enters zero or  a negative number
// keep a running total and keep track of the number of entries
// then find and return the average
// Be sure not to divide by 0. Return 0 if no scores are entered
//

import java.util.Scanner;
public class MathUtil
{
    public double averageScore()
    {
        Scanner in = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        int count = 1;
        boolean loop = true;
        //TODO Find and return the average of the numbers entered.
        do {
            System.out.print("Enter a score. -1 to quit: "); //use this for the prompt
            number = in.nextInt();
            if (number >= 0) {
                sum = sum + number;
                count++;
            } else {
                loop = false;
            }
        } while(loop);
        return (sum / count);
    }
}
