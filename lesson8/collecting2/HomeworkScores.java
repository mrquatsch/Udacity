// BlueJ project: lesson8/collecting2

// TODO: Reimplement this class without collecting the individual scores

/**
 * Holds the homework scores for a student.
 */
public class HomeworkScores
{
    //private double[] scores;
    //private int currentSize; // The current size of the array of scores
    //private static final int MAX_SIZE = 1000;
    double score;
    double lowest = 0;
    int count = 0;

    public HomeworkScores()
    {
        //scores = new double[MAX_SIZE];
        //currentSize = 0;
        this.score = 0;
    }

    /**
       Adds a score.
       @param score the score to add
    */
    public void addScore(double score)
    {
        /*if (currentSize < scores.length)
        {
            scores[currentSize] = score;
            currentSize++;
        }*/
        count++;
        this.score = this.score + score;
        if(lowest == 0.0 || score < lowest) {
            lowest = score;
        }
    }

    /**
       Calculates the sum of all the scores entered, dropping the lowest
       score if there is more than one.
       @return the sum of all the scores in scores.
    */
    public double getTotalExcludingLowest()
    {
        /*if (currentSize == 0)
        {
            return 0;
        }
        else if (currentSize == 1)
        {
            return scores[0];
        }
        else
        {
            double sum = 0;
            for (int i = 0; i < currentSize; i++)
            {
                sum = sum + scores[i];
            }
            return sum - getLowest();
        }*/
        if(count <= 1) {
            return score;
        } else {
            return score - lowest;
        }
    }

    /**
       Calculates the lowest score.
       @return the lowest score or 0 if there are no scores
    */
    private double getLowest()
    {
        /*if (currentSize == 0)
        {
            return 0;
        }
        else
        {
            double lowest = scores[0];
            for (int i = 1; i < currentSize; i++)
            {
                if (scores[i] < lowest)
                {
                    scores[i] = lowest;
                }
            }
            return lowest;
        }*/
        return lowest;
    }
}
