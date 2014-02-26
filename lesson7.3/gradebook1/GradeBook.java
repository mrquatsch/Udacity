// BlueJ project: lesson7/gradebook1

import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class GradeBook
{
    private ArrayList<String> students;
    private int numStudents;
    private ArrayList<String> topics;
    private int numTopics;
    private double[][] grades;

    public GradeBook(String file)
    {
        students = new ArrayList<String>();
        topics = new ArrayList<String>();
        readScoresFromFile(file);
    }

    /**
     * Adds up all the scores for one student and returns the result.
     * Only works for a valid student index.
     * @param studentIndex the row for the student whose total you want.
     * @return the sum of that student's scores, or -1 if the index is bad.
     */
    public double totalForStudent(int studentIndex)
    {
        // TODO: Return the total of all the scores for the student in row studentIndex
        double sum = 0;
        if (studentIndex >= 0 && studentIndex < numStudents) {
            for(int i = 0; i < numTopics; i++) {
                sum = sum + grades[studentIndex][i];
            }
        } else {
            sum = -1;
        }
        return sum;
    }

    /**
     * Calculates the totals for all the students and returns the results
     * in a completely filled array.
     * @return a filled array of the total for each student.
     */
    public double[] totalsForAllStudents()
    {
        // YOUR CODE HERE
        // Implement this method.
        double[] totals = new double[numTopics];
        for(int i = 0; i < numStudents; i++) {
            totals[i] = totalForStudent(i);
        }
        return totals;
    }

    /**
     * Adds up all the scores for one topic and returns the result.
     * Only works for a valid topic index.
     * @param topicIndex the row for the student whose total you want.
     * @return the sum of that student's scores, or -1 if the index is bad.
     */
    public double totalForTopic(int topicIndex)
    {
        // TODO: Return the total of all the scores for the student in row studentIndex
        double sum = 0;
        if (topicIndex >= 0 && topicIndex < numTopics) {
            for (int i = 0; i < numStudents; i++) {
                sum = sum + grades[i][topicIndex];
            }
        } else {
                sum = -1;
        }
        return sum;
    }

    /**
     * Calculates the column totals (the sum of of all students'
     * scores for one topic) for all topics in a completely filled array.
     * The order of the topcs matches the order of the topic names in
     * topicNames.
     * @return a filled array of the total for each topic.
     */
    public double[] totalsForAllTopics()
    {
        // TODO: Implement the totalsForAllTopics method.
        double[] topicTotals = new double[numTopics];
        for(int i = 0; i < numTopics; i++) {
            topicTotals[i] = totalForTopic(i);
        }
        return topicTotals;
    }

    // This method reads the scores from the file. Don't look inside.
    private void readScoresFromFile(String file)
    {
        try
        {
            Scanner in = new Scanner(new FileReader(file));
            Scanner firstLineScanner = new Scanner(in.nextLine());
            while (firstLineScanner.hasNext())
            {
                students.add(firstLineScanner.next());
            }
            Scanner secondLineScanner = new Scanner(in.nextLine());
            while (secondLineScanner.hasNext())
            {
                topics.add(secondLineScanner.next());
            }

            numStudents = students.size();
            numTopics = topics.size();
            grades = new double[numStudents][numTopics];
            for (int i = 0; i < numStudents; i++)
            {
                for (int j = 0; j < numTopics; j++)
                {
                    grades[i][j] = in.nextDouble();
                }
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found: " + file);
        }
    }
}
