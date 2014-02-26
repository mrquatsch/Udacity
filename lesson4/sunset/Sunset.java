import java.util.Scanner;

public class Sunset
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Picture pic = new Picture();
        pic.load("queen-mary.png");
        pic.draw();
        System.out.print("How much red to add?: ");
        int added_red = in.nextInt();
        for (int i = 0; i < pic.pixels(); i++)
        {
            Color c = pic.getColorAt(i);
            c.redden(added_red);
            pic.setColorAt(i, c);
        }
    }
}
