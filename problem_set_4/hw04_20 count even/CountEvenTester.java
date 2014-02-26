//hw04_20
/**
 * Complete the class. Using a Scanner, ask the user to enter a series of integers
 * and count the number of even numbers
 * Use a loop. Do not let bad input (a non-integer) terminate your program with an error.
 * When the user enters any non-integer, print the number of even integers entered and quit.
 * Hint: remember hasNextInt()
 * Hint: use the % operator to determine if a number is even
 */
import java.util.Scanner;
public class CountEvenTester
{
   public static void main(String[] args)
   {
       Scanner in = new Scanner(System.in);
       boolean isInt = true;
       int count = 0;
       
       while (isInt) {
           System.out.print("Enter an integer: ");
           if (in.hasNextInt()) {
               int num = in.nextInt();
               if (num % 2 == 0) {
                   count++;
               }
           } else {
               isInt = false;
           }
       }
       System.out.println(count);
   }
}
