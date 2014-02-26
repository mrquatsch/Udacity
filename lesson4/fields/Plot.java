// BlueJ Project: lesson4/fields
import java.lang.Math;

public class Plot
{
    private int width;
    private int length;

    /**
        Constructs a plot of a given size.
        @param width the width of the plot
        @param length the length of the plot
    */
    public Plot(int width, int length)
    {
        this.width = width;
        this.length = length;
    }

    /**
     * Calculates the number of circular fields that can fit on this plot.
     */
    public int getNumberOfFields(int radius)
    {
        // TODO: Using the formulas that Sara developed, compute
        // the total number of rows, then
        // the number of even and odd rows,
        // the number of columns in each even and odd row,
        // and finally the total number of fields
	int diameter = radius * 2;
	int totalRows = (int)(((length - diameter) / (radius * Math.sqrt(3))) + 1);
	int oddRows = ((totalRows + 1) / 2);
	int evenRows = (totalRows / 2);
	int oddColsPerRow = width / diameter;
	int evenColsPerRow = (width - radius) / diameter;
	int totalCircles = (oddRows * oddColsPerRow) + (evenRows * evenColsPerRow);
	return totalCircles;
    }
}
