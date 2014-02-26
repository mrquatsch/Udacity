public class compareTo {
	/**
 * Complete the method to return true if the parameter comes after "Udacity" in
 * lexicographic order
 */
    /**
     * Determine if the string comes after "Udacity" in lexicographic order
     * @param string1 the first string
     * @return true if string1 comes after "Udacity' in lexicographic order.
     * Otherwise return false
     */
    public boolean comesAfter(String string1)
    {
        if (string1.compareTo("Udacity") > 0) {
            return true;
        } else {
            return false;
        }
    }
}
