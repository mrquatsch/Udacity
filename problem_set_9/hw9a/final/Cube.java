// formulas for surface area and volume
// http://math2.org/math/geometry/areasvols.htm
//
// TODO: complete the code so that Cube implements the GeometricSolid interface
//
public class Cube implements GeometricSolid
{
    private double side;

    public Cube(double s)
    {
        side = s;
    }

    // other methods


    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public double getSurfaceArea() {
        return 6 * (Math.pow(side, 2));
    }
}
