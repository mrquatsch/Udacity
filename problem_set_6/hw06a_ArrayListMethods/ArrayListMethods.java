//
//Complete the class ArrayListMethods. It consists of four short methods to manipulate an array list of strings.
//The method header and javadoc are given to you.
//
//For the draft, provide the isSorted method.
//

import java.util.ArrayList;
public class ArrayListMethods
{
    ArrayList<String> list; //instance variable
    /**
     * Constructor for objects of class ArrayListMethods
     */
    public ArrayListMethods(ArrayList<String> arrayList)
    {
        // initialise instance variables
        list = arrayList;
    }

    /**
     * Determines if the array list is sorted (do not sort)
     * When Strings are sorted, they are in alphabetical order
     * Use the compareTo method to determine which string comes first
     * You can look at the String compareTo method in the Java API
     * @return true if the array list is sorted else false.
     */
    public boolean isSorted()
    {
        boolean sorted = true;

        // TODO: Determine if the array is sorted.
        int i = 0;
        while(sorted && i < list.size() - 1) {
            if(list.get(i).compareTo(list.get(i + 1)) >  0) {
                sorted = false;
            }
            i++;
        }

        return sorted;
    }

    /**
     * Replaces all but the first and last with the larger of its to neighbors
     * You can use compareT to determine which string is larger (later in alphabetical
     * order.
     * @return a string representation of the array list. (do this with list.toString()
     */
    public void replaceWithLargerNeighbor()
    {

        // TODO: Replace all but the first and last elements with the larger of its to neighbors
        for(int x = 1; x < list.size() - 1; x++) {
            if(list.get(x).compareTo(list.get(x + 1)) < 0) { //if current is not as large as next
                //replace with next
                list.add(x,list.get(x + 1));
                list.remove(x + 1);
            }
        }

    }

    /**
     * Gets the number of duplicates in the list.
     * (Be careful to only count each duplicate once. Start at index 0. Does it match any of the other element?
     * Get the next word. It is at index i. Does it match any of the words with index > i?)
     * @return the number of duplicate words in the list
     */
    public int countDuplicates()
    {
        int duplicates = 0;

        // TODO: Write the code to get the number of duplicates in the list
        for(int x = 0; x < list.size(); x++) {
            for(int i = x + 1; i < list.size(); i++) {
                if(list.get(x) == list.get(i)) {
                    duplicates++;
                }
            }
        }

        return duplicates;
    }

     /**
     * Moves any word that startw with x, y, or z to the front of the arraylist, but
     * otherwise prserves the order
     */
    public void xyzToFront()
    {
        int insertAt = 0;

        // TODO:  Move any word that starts with x, y, or z to the front of the arraylist, but otherwise preserves the order
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).startsWith("x")
            || list.get(i).startsWith("y")
            || list.get(i).startsWith("z")) {
                String nothing = list.get(i);
                list.add(insertAt, list.get(i));
                String nothing2 = list.get(i + 1);
                list.remove(i + 1);
                insertAt++;
            }
        }

    }

    /**
     * gets the string representation of this array list
     * @returns the string representation of this array list in
     * standard collectiuon format
     */
    public String toString()
    {
        return list.toString();
    }
}
