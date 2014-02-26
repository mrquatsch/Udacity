// Do you need a Portfolio object to simulate
// the photography shop?
// Write a class Portfolio if you need a portfolio
// to implement your design.
import java.util.ArrayList;

public class Portfolio
{
    ArrayList<FinishedPhoto> finishedWorks;

    public Portfolio()
    {
        finishedWorks = new ArrayList();
    }

    public void addFinishedWork(String photoFileName, String photographer)
    {
        finishedWorks.add(new FinishedPhoto(photoFileName, photographer));
    }

    public void displayFinishedWork()
    {
        double nextEmptyPosition = 0;
        for (FinishedPhoto work : finishedWorks)
        {
            Picture photo = new Picture(work.getPhoto());
            photo.translate(nextEmptyPosition, 0);
            Text signature = new Text(nextEmptyPosition, photo.getHeight(), work.getSignature());
            photo.draw();
            signature.draw();
            nextEmptyPosition += photo.getWidth();
        }
    }
}
