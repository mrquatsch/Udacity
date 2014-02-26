// Bluej project: lesson6/billionaire2
// TODO: Change the Program so that it will calculate the number of years
// to reach 1 million dollars when the interest rate is 10%
public class InterestCalculator
{
    public static void main(String[] args)
    {
        double balance = 100;
        int year = 0;
	int value = 1000000;
	double rate = .1;

        while (balance < value)
        {
            double interest = balance * rate;
            balance = balance + interest;
            year++;
        }
        System.out.println("It will take " + year + " years.");
    }
}
