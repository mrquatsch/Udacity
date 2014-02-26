public class PrintOutNumbers
{
	public static void main(String[] args)
	{
		long number = 879192493987L;
		int digit = 0;
		System.out.println("NUMBER: " + number);
		while (number > 0) {
			digit = (int)(number % 10);
		        System.out.println("DIGIT: " +digit);
			number = number/10;
		}
	}
}
