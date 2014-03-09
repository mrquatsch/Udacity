// Implement compareTo
/**
   A country with a name and area.
*/
public class Country implements Measurable, Comparable
{
    private String name;
    private double area;

    /**
       Constructs a country.
       @param aName the name of the country
       @param anArea the area of the country
    */
    public Country(String aName, double anArea)
    {
        name = aName;
        area = anArea;
    }

    // YOUR CODE HERE
    // Implement this method.
    // Countries should be ordered from smallest area to largest.
    // Return a negative number if this country is smaller than other.
    // Return a positive number if this country is larger than other.
    // Return 0 if the two countries are equal. Use .equals.
    // I implemented .equals for you.
    // If the countries are exactly the same size, break ties
    // using the name of the country.
    public int compareTo(Object otherObject)
    {
        Country country = (Country)otherObject;
        if(this.area < country.area) {
            return -1;
        } else if(this.area > country.area) {
            return 1;
        } else if (this.equals(country)) {
            return 0;
        } else {
            return this.name.compareTo(country.name);
        }
    }

    /**
       Gets the country name.
       @return the name
    */
    public String getName()
    {
        return name;
    }

    /**
       Gets the area of the country.
       @return the area
    */
    public double getArea()
    {
        return area;
    }

    /**
       Gets the area of the country.
       @return the area
    */
    public double getMeasure()
    {
        return area;
    }

    public boolean equals(Object other)
    {
        if (other instanceof Country)
        {
            Country country = (Country) other;
            return this.name.equals(country.name)
                   && this.area == country.area;
        }
        else
        {
            return false;
        }
    }

    public String toString()
    {
        return "Country[name=" + name + " area=" + area + "]\n";
    }
}
