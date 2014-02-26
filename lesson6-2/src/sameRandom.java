import java.util.Random;

public class sameRandom {
	public static void main(String[] args) {
		int SEED = 42;
		Random generator1 = new Random(SEED);
		Random generator2 = new Random(SEED);

		int one = generator1.nextInt(6);
		int two = generator2.nextInt(6);
		int three = generator1.nextInt(6);
		int four = generator2.nextInt(6);
		System.out.println(one + " "  + two + " " + three + " " + four);
	}
}
