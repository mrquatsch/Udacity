// My favorite letters are x and z.
//
// Complete the isXOrZ method to determine
// if a word contains either x or z. 
//
// Ignore case, So if the word contains:
// X, x, Z, or z
// return true.
//
// Otherwise return false

public class WordUtil
{
   /**
    * Determines if the string contains either x or z
    * @param text the string to test for x or z
    * @return true if the string contains x or y ignoring case.
    *  Otherwise false
    */
   public  boolean isXOrZ(String text)
   {
       String lower = text.toLowerCase();
       boolean found = false;
       int i = 0;

       // TODO: complete the loop header
       while (... )
       {
           String letter = lower.substring(i, i +1);
           // TODO: complete the loop to determine if 
           // the lower contains x or z

       }
       return found;
   }
}

