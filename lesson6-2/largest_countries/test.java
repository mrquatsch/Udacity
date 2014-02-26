import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class test {
	public static void main(String[] args) throws FileNotFoundException {
		//String filename = "population.txt";
		//File inputFile = new File(filename);
		File inputfile = fileChooser.getSelectedFile();
		Scanner in = new Scanner(inputFile);

		String word = in.next();
		Double number = in.nextDouble();

		System.out.println("Word: " + word);
		System.out.println("Number: " + number);
	}
}
