import java.util.ArrayList;

public class test {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Bob");
		names.add(0, "Ann");
		names.remove(1);
		names.add("Cal");
		System.out.println(names);
	}
}
