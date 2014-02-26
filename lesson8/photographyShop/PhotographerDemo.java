/**
 * Created by mike on 2/23/14.
 */
public class PhotographerDemo {
    public static void main(String[] args)
    {
        Portfolio portfolio = new Portfolio();
        Photographer photographer = new Photographer("Mike", portfolio);
        photographer.acceptAssignment(new Assignment("the forest", 1));
        photographer.acceptAssignment(new Assignment("the forest", 2));
        portfolio.displayFinishedWork();
    }
}
