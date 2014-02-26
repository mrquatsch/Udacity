import java.util.Arrays;

public class GradeBookTester
{
    public static void main(String[] args)
    {
        GradeBook book = new GradeBook("/Users/mike/GoogleDrive/Udacity/Lesson7.3/gradebook1/grades.txt");
        System.out.println(book.totalForStudent(0));
        System.out.println("Expected: 37.0");
        System.out.println(book.totalForStudent(21));
        System.out.println("Expected: 32.0");
        System.out.println(book.totalForStudent(22));
        System.out.println("Expected: -1");
        System.out.println(book.totalForTopic(0));
        System.out.println("Expected: 158.0");
        System.out.println(book.totalForTopic(1));
        System.out.println("Expected: 144.0");
        System.out.println(book.totalForTopic(2));
        System.out.println("Expected: 166.0");
        System.out.println(book.totalForTopic(3));
        System.out.println("Expected: 121.0");
        System.out.println(book.totalForTopic(4));
        System.out.println("Expected: 154.0");
    }
}
