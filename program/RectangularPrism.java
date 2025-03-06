
/**
 * Rectangular Prism Class
 */

public class RectangularPrism{
    private double height;
    private double width;
    private double length;

    /**
     * Constructor
     * 
     * @param height height of a rectangular prisim
     * @param width width of a rectangular prisim
     * @param length lenght of a rectangular prisim
     */
    public RectangularPrism(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }

    /**
     * Method to return volume
     * 
     * @return the volume of a rectangular prism
     */
    public double getVolume(){
        return height * width * length;
    }

    /**
     * 
     * @return a string containing the dimensions of a rectangular prisim and it's volume
     */
    public String getHistory(){
        return "Volume of Rectangular Prisim: \nLength: " + this.length + 
                " \nWidth: " + this.width + " \nHeight: " + this.height + 
                " \nVolume: " + getVolume();
    }
    
}