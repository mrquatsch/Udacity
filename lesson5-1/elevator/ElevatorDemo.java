import java.util.Scanner;

public class ElevatorDemo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Floor: ");
        int floor = in.nextInt();
        int actualFloor;
        if (floor > 14)
        {
		actualFloor = floor - 2;
        }
	else {
		actualFloor = floor;
	}
        System.out.println("Actual floor: " + actualFloor);
    }
}
