public class printNumbers
{
    /**
     * Gets the sum of all the odd digits in the parameter
     * @param n the number to use
     * @return the sum of the odd digits.
     */

    public static void main(String[] args )
    {
        //TODO calculate and return the sum of the odd digits
        int number = 32677;
	String string = "";
        while (number != 0) {
	    int digit = (number % 10);
	    string = digit + " " + string;
            number = number / 10;
        }
        System.out.println(string + "0");
    }
}
