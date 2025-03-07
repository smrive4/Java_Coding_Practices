
/**
 * Rectangular Prism Class
 */

public class RectangularPrism extends ThreeDimensions{
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

    @Override
    String getHistory() {
        return "h" + height + "w" + width + "l" +length + "s" + getVolume();
    }
    
}