
/**
 * Circle Class
 */

public class Circle extends TwoDimensions {
  /** radius of a circle*/
  private double radius;

  /**
   * Constructor
   * 
   * @param radius radius of a circle
   */
  public Circle(double radius) {
    this.radius = radius;
  }

  /**
   * Method to get area
   * 
   * @return area of a circle
   */
  @Override
  public double getArea() {
    return Math.PI * (Math.pow(radius, 2));
  }

  /**
   * Method to return information of a Circle object
   * 
   * @return a string containing the radius and area of a circle
   */
  @Override
  public String getHistory() {
    return "Area of circle calculated:\nradius: " + radius + "\nresult: " + getArea();
  }
}