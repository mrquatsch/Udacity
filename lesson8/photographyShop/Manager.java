// TO-DO
// Fill in the methods in the manager class so
// that when the simulation runs, and simulates the
// story, the assignments are assigned to photographers
// in the correct order, and printed out with photographers
// signatures below them in the order in which they are completed.
import java.util.ArrayList;

public class Manager
{
    // YOUR CODE HERE
    // What does the manager need to remember to do his/her job?
    private ArrayList<Photographer> photographers;
    private ArrayList<Assignment> assignments;
    private Portfolio portfolio = new Portfolio();

    public Manager()
    {
        // YOUR CODE HERE
        // How do you need to initialize the instance variables?
        photographers = new ArrayList();
        assignments = new ArrayList();
    }

    /**
     * Called when it's time to hire a new photographer.
     */
    public void hire(String photographer)
    {
        // YOUR CODE HERE
        // How will you keep track of the photographers you have hired?
        //photographers.add(new Photographer());
        photographers.add(new Photographer(photographer, portfolio));
    }

    /**
     * Called when it's time for the daily meeting where
     * the highest priority assignments are given to photographers.
     * Each photographer can take one assignment. The highest priority
     * assignment should be given out first and the highest priority
     * assignment should go to the photographer who was hired first.
     */
    public void giveOutAssignments()
    {
        // YOUR CODE HERE
        // Where did you store the photographers and unfinished assignments?
        // Assign the highest priority assignment first to the
        // photographer who was hired first, then the next highest priority
        // assignment to the next photographer.
        for(Photographer photographer : photographers)
        {
            if (assignments.size() > 0) {
                Assignment highPriorityAssignment = getHighestPriorityAssignment();
                photographer.acceptAssignment(highPriorityAssignment);
                assignments.remove(highPriorityAssignment);
            }
        }
    }

    private Assignment getHighestPriorityAssignment()
    {
        Assignment highestPriorityAssignment = assignments.get(0);

        for(Assignment assignment : assignments)
        {
            if(assignment.getPriority() > highestPriorityAssignment.getPriority())
            {
                highestPriorityAssignment = assignment;
            }
        }

        return highestPriorityAssignment;
    }

    /**
     * A Customer came up with a new assignment. The manager should
     * add it to the to-do list so that next time it's time to give
     * out assignments, the new assignment will be a possibility.
     */
    public void newAssignment(int priority, String description)
    {
        // YOUR CODE HERE
        // How will you keep track of the unfinished assignments?
        //assignments.add(new Assignment(description, priority));
        assignments.add(new Assignment(description, priority));
    }

    /**
     * It's the end of the story for now. Time to look at all the
     * work the company has done.
     */
    public void checkPortfolio()
    {
        // YOUR CODE HERE
        // You may need to display all the finished work when
        // this method is called, or you may have been displaying
        // the photos as you went. If you have already displayed
        // the photos, there is no need to do anything here.
        portfolio.displayFinishedWork();
    }
}
