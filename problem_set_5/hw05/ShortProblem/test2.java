/**
 * Created with IntelliJ IDEA.
 * User: mike
 * Date: 9/2/13
 * Time: 7:10 PM
 * To change this template use File | Settings | File Templates.
 */
import java.util.Random;
public class test2 {
    public static void main(String[] args) {
        /*int n = 1;
        int sum = 1;
        do {
            sum = sum + n;
            n++;
        }
        while(sum > 10 * n);
        System.out.println(sum);
        */
        Random generator = new Random();
        int count = 0;
        do {
            double x = (generator.nextDouble() * 100);
            System.out.println(x);
            count++;
        } while(count < 100);
    }
}
