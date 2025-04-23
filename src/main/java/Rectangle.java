/**
 * Rectangle class creates a rectangle based on its length and width
 * @author Hailey Tam
 */

public class Rectangle{
    private double length;
    private double width;

    /**
     * Constructor 1: creates a rectangle that has a specific length and width
     * @param l a double that represents the length of a rectangle
     * @param w a double that represents the width of a rectangle
     */

    public Rectangle(double l, double w){
    this.length = l;
    this.width = w;
    }

    /**
     * Constructor 2: creates a rectangle that has a specific length
     * @param l a double that represents length of the rectangle
     * Width is set to 8 by default
     */

    public Rectangle(double l){
        this(l, 8);
    }

    /**
     * Constructor 3: does not specific a length and width for the rectangle
     * Length is set to 4 by default
     * Width is set to 8 by default
     */

    public Rectangle(){
        this(4, 8);
    }

    /**
     * Gets the length of the rectangle 
     * @return returns the length of the rectangle as a double
     */

    public double getLength(){
        return this.length;
    }

    /**
     * Gets the width of the rectangle
     * @return returns the width of the rectangle as a double
     */

    public double getWidth(){
        return this.width;
    }
}