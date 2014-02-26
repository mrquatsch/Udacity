/**
 * Created with IntelliJ IDEA.
 * User: mike
 * Date: 2/22/14
 * Time: 10:40 AM
 * To change this template use File | Settings | File Templates.
 */
public class PortfolioTester {
   public static void main(String[] args)
   {
       Portfolio portfolio = new Portfolio();
       portfolio.addFinishedWork("/Users/mike/Dropbox/Udacity/lesson8/photographyShop/icesmall28.jpg", "Justin Black");
       portfolio.addFinishedWork("/Users/mike/Dropbox/Udacity/lesson8/photographyShop/icesmall28.jpg", "Justin Green");
       portfolio.addFinishedWork("/Users/mike/Dropbox/Udacity/lesson8/photographyShop/icesmall28.jpg", "Justin Red");
       portfolio.displayFinishedWork();
   }
}
