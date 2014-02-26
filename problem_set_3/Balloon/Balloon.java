//Implement a class Balloon that models a spherical balloon that is being filled with air.  
//The constructor constructs an empty balloon (That is, the volume is 0).

// Supply these methods: 
//	void addAir(double amount) adds the given amount of air
//	double getVolume() gets the current volume
//	double getSurfaceArea() gets the current surface area
//	double getRadius() gets the current radius

//For the draft, supply the constructor and the getVolume method. Provide the instance variable.

//See this link for formulas for volume and surface area: http://math.about.com/od/formulas/ss/surfaceareavol.htm 

//Hints
//	you can find the nth root of a number by using the pow method from the Math class where the exponent is 1/n.
//	You will need to solve the volume formula for radius.

/**
 * This class models a spherical balloon that is being filled with air
 * 
 */
import java.lang.Math;

public class Balloon
{
    private double volume;

    /**
     * Constructor for objects of class Balloon
     */
    public Balloon()
    {
	this.volume = volume;
    }

    /**
     * Gets the volume of the Balloon
     * 
     * @return    the volume of this balloon
     */
    public double getVolume()
    {
        return volume;
    }

	public void addAir(double amount)
	{
		volume = volume + amount;
	}

	public double getSurfaceArea()
	{
		double r = getRadius();
		double a = (4 * Math.PI * Math.pow(r,2));
		return a;
	}

	public double getRadius()
	{
		double r = (3/(4 * Math.PI)) * volume;
		r = Math.cbrt(r);
		return r;
	}
}

