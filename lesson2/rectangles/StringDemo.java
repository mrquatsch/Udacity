
/**
 * Write a description of class StringDemo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringDemo
{
    public static void main(String[] args)
    {
        String river = "Mississippi";
        int numberofLetters = river.length();
        System.out.println(numberofLetters);
        
        String newRiver = river.replace("i", "x");
        System.out.println(newRiver);
        
        System.out.println(river.toUpperCase());
        System.out.println(river.toLowerCase());
        System.out.println(river.toUpperCase().toLowerCase());
        System.out.println(river);
        
        String messyString = " Hello Space! ";
        System.out.println(messyString);
        
        String greeting = "Hello";
        System.out.println(greeting.replace("H","J"));
        System.out.println(greeting);
    }
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class StringDemo
     */
    public StringDemo()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
