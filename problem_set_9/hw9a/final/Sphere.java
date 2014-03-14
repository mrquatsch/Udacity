// formulas for surface area and volume
// http://math.about.com/od/formulas/ss/surfaceareavol.htm
//
// TODO: complete the code so that Shpere implements the GeometricSolid interface
//
public class Sphere implements GeometricSolid
{
    private double radius;

    /**
     * Constructor for objects of class Sphere
     */
    public Sphere()
    {
        radius = 0;
    }

    /**
     * Constructs a Sphere with the given radius
     * @param r the radius
     */
    public Sphere( double r)
    {
        radius = r;
    }

    public void setRadius(double r)
    {
        radius = r;
    }

    public double getRadius()
    {
        return radius;
    }

    //other methods


    @Override
    public double getSurfaceArea() {
        return 4 * (Math.PI * (Math.pow(radius, 2.0)));
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * (Math.pow(radius, 3));
    }
}
