
/**
 * Circle Class
 */

public class Circle extends TwoDimensions {
  /** radius of a circle*/
  //OBJ10-J: do not use public static nonfinal fields
  private final double radius;
  private static final double circumference = Math.PI;
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
  //MET05-J ensure constructors don't call overridable methods
  @Override
  public double getArea() {
    return circumference * (Math.pow(radius, 2));
  }

  /**
   * Method to return information of a Circle object
   * 
   * @return a string containing the radius and area of a circle
   */
  @Override
  public String getHistory() {
    return "radius: " + radius + "\narea: " + getArea();
  }
}
