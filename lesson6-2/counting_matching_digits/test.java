public class PrintOutNumbers
{
	public static void main(String[] args)
	{
		long number = 879192493987L;
		int digit = 0;
		while (number > 0) {
			digit = (int)(number % 10);
			System.out.println(number);
		        System.out.println(digit);
			number = number/10;
		}
	}
}
