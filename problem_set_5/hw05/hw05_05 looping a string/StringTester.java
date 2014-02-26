//
// Complete the code below to print each letter in the string name followed by a space.
//
public class StringTester
{
   public static void main(String[] args)
   {
       String name = "Udacity";

       //TODO Complete the code below to print each letter in the string name followed by a space.
       for (int x = 0; x < name.length(); x++) {
           System.out.print(name.substring(x, x + 1) + " ");
       }

   }
}
