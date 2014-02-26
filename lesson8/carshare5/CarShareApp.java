// To-do:
// Run the main method to find out the order
// in which passengers get dropped off.
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class CarShareApp
{
    public static void main(String[] args) throws IOException
    {
        Simulation sim = new Simulation();
        sim.read(new Scanner(new File("/Users/msterry/Dropbox/Udacity/lesson8/carshare5/input.txt")));
        sim.loadPassengers();
        sim.driveCars();
    }
}
