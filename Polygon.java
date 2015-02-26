
/**
 * Write a description of class Polygon here.
 * 
 * @author Roger Jaffe
 * @version 2014-10-17
 */
public class Polygon
{
    /**
     * Instance variables for the class.
     * We'll store the number of sides, and the 
     * length of each side here
     */
    private final int sides;
    private final double sideLength;
    
    /**
     * Constructor for this class
     * @param _sides Number of sides in the polygon
     * @param _sideLength Length of each side in the polygon
     */
    public Polygon(int _sides, double _sideLength) {
        sides = _sides;
        sideLength = _sideLength;
    }
    
    /**
     * Computes the area of the polygon based on the number of sides
     * and the length of each side
     * @return Area of the polygon
     */
    public double getArea() {
        return 0.0;     // Nothing to compute until we know what kind of polygon we have
    }
    
    /**
     * Computes the perimeter of the polygon based on the number of sides
     * and the length of each side.
     * @return Perimeter of the polygon
     */
    public double getPerimeter() {
        return 0.0;     // Nothing to compute until we know what kind of polygon we have
    }
}
