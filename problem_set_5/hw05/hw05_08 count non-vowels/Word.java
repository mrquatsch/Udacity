//
// Complete the method to return the number of non-vowels in the parameter
// Assume the vowels are  a,e,i,o,u or A, E, I, O, U
//

public class Word
{
    /**
     * Gets the number of non-vowels in the parameter
     * @param word the string to count the non-vowels in
     * @return the number of non-vowels in the word
     */
    public int nonVowelCount(String word)
    {
        //TODO Write the code return the number of non-vowels
        String string = word;
        int count = 0;
        for (int x = 0; x < string.length(); x++) {
            if("AEIOUaeiou".contains(string.substring(x, x + 1))) {
                //do nothing
            } else {
                count++;
            }
        }
        return(count);
    }
}
