public class MathUtil
{
    public int product(int n)
    {
        //TODO Write the code to return the product of all the numbers 1 to the parameter n (inclusive)
        int number = n;
        int sum = 1;
        for (int x = 1; x <= number; x++) {
            sum = sum * x;
        }
        return(sum);
    }
}