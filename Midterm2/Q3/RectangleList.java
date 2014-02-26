//
// RectangleList class manages a list of Rectangles
// It has a constructor that takes an array list of Rectangles as a parameter.
// It has a method to return the Rectangle with the smallest area
// (or null if the list is empty)
//
// The class is started for you. You are to complete the class.
//
// This class uses the Rectangle class from the graphics package.
// It has the getWidth() and getHeight() methods
//
// There is a tester included to help you test your code.
//
//
import java.util.ArrayList;

public class RectangleList
{
    // private instance variables                                                                                                                    *
    ArrayList<Rectangle> list = new ArrayList<Rectangle>();

    /**
     * Constructs a Rectangle list to manage this list of Rectangles
     * @param theList the lest of Rectangles to manage
     */
    public RectangleList(ArrayList<Rectangle> theList)
    {
        list = theList;
    }

    /**
     * Gets the Rectangle with the smallest area
     * @return the rectangle with the smallest area or null if
     * there are no rectangles
     *
     */
    public Rectangle smallestArea()
    {
        int temp = 0;
        int index = 0;
        if(list.size() > 0) {
            int area = (list.get(0).getHeight() * 2) + (list.get(0).getWidth() * 2);
            for(int i = 0; i < list.size(); i++) {
                temp = (list.get(i).getHeight() * 2) + (list.get(i).getWidth() * 2);
                if(temp <= area) {
                    area = temp;
                    index = i;
                }
            }
            return list.get(index);
        } else {
            return null;
        }
    }

}
