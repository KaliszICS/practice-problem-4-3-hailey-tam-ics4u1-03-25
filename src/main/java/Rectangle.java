/**
 * Rectangle class creates the length and width of a rectangle
 * @author Hailey Tam
 */

class Rectangle{
    private double length;
    private double width;

    /**
     * Constructor 1: Handles all the parameters, length and width
     * @param l a double that is used to set the intital state of the length of a rectangle
     * @param w a double that is used to set the intital state of the width of a rectangle
     */

    public Rectangle(double l, double w){
    this.length = l;
    this.width = w;
    }

    /**
     * Constructor 2: Only handles length
     * @param l a double that is used to set the intital state of the length of the rectangle
     * Width is set to 8 by default
     */

    public Rectangle(double l){
        this(l, 8);
    }

    /**
     * Constructor 3: Does not handle any parameters
     * Length is set to 4 by default
     * Width is set to 8 by default
     */

    public Rectangle(){
        this(4, 8);
    }

    /**
     * 
     * @return returns the length of the rectangle
     */

    public double getLength(){
        return this.length;
    }

    /**
     * 
     * @return returns the width of the rectangle
     */

    public double getWidth(){
        return this.width;
    }
}