
/**
 * Circle Class
 */

public class Circle extends TwoDimensions {
  /** radius of a circle*/
  //OBJ10-J: do not use public static nonfinal fields
  private final double radius; //OBJ01 - limit accessibility of fields
  private static final double circumference = Math.PI;
  
  // OBJ07-J: Sensitive classes must not let themselves be copied.

  /**
   * Constructor
   * 
   * @param radius radius of a circle
   */
  public Circle(double radius) {
    // OBJ11-J: Constructor does not throw any exceptions, ensuring full initialization of the object
    this.radius = radius;
  }

  /**
   * Method to get area
   * 
   * @return area of a circle
   */
  //MET05-J ensure constructors don't call overridable methods
  // OBJ05-J If mutable fields were to be added in the future, we can not return them directly
  // Instead, return copies or immutable versions.
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
    // OBJ13-J: Returns a string representation of the object; Not a mutable field
    return "radius: " + radius + "\narea: " + getArea();
  }
}
