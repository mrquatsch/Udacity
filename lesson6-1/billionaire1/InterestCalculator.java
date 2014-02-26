// Bluej project: lesson6/billionaire1
// TODO: Change the program so that it will calculate the number of years
// to reach 1 billion dollars instead of 1 million.
public class InterestCalculator
{
    public static void main(String[] args)
    {
        double balance = 100;
        int year = 0;
	int value = 1000000000;
	double rate = .01;

        while (balance < value)
        {
            double interest = balance * rate;
            balance = balance + interest;
            year++;
        }
        System.out.println("It will take " + year + " years.");
    }
}
