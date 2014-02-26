//A landscape designer needs a program to make calculations in meters about a front yard 
//given its width and length in feet.  Write a class YardCalculator with a constructor that takes 
//the width and length in feet as arguments
//public YardCalculator(double length, double width)

//Provide methods :

//public double perimeter() which returns the perimeter in meters
//public double area() which returns the area in square meters
//public double diagonal() which returns the diagonal in meters

//1 foot = 0.3048 meters.

//Define and use a constant for the conversion factor. Define it in the class itself, 
//outside any method, so all methods in any class can see it.

//      public static final double METERS_PER_FOOT = 0.3048;

//HINT: diagonal = square root of (width^2 plus height^2)

//For the draft, provide the instance variables and  the constructor
import java.lang.Math;

public class YardCalculator
{
   //instance variables here
        public static final double METERS_PER_FOOT = 0.3048;
        private double length;
        private double width;
   /**
    * Constructs a YardCalculator with the given parameters
    * @param theLength the length of the yard
    * @param theWidth the width of the yard
    */
        public YardCalculator(double theLength, double theWidth)
        {
                this.length = theLength;
                this.width = theWidth;
        }

        public double perimeter()
        {
                double x = (length * 2) + (width * 2);
                return x * METERS_PER_FOOT;
        }

        public double area()
        {
                double x = length * width;
                return x * METERS_PER_FOOT * METERS_PER_FOOT;
        }

        public double diagonal()
        {
                double x = (length * length) + (width * width);
                return Math.sqrt(x) * METERS_PER_FOOT;
        }
}
