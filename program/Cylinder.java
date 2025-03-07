
/**
 * Cylinder Class
 */

public class Cylinder extends ThreeDimensions {
    /** radius of a cylinder */
    private final double radius;
    /** height of a cylinder */
    private final double height;

    /**
     * Constructor
     * 
     * @param radius radius of the cylinder
     * @param height height of the cylinder
     */
    public Cylinder(double radius, double height) {
      this.radius = radius;
      this.height = height;
    }
  
    /**
     * Method to return volume of the cylinder
     * 
     * @return the volume of a cylinder
     */
    @Override
    public double getVolume() {
      return Math.PI * (Math.pow(radius, 2)) * height;
    }

    /**
     * Method to return information about a Cylinder object
     * 
     * @return a string containing the radius of the cylinder and its volume
     */
    @Override
    public String getHistory(){
        return "Volume of Cylinder: \nRadius: " + radius + 
                " \nHeight: : " + height +  
                " \nVolume: " + getVolume();
    }
}