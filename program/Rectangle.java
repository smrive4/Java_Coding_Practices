
/**
 * Rectangle Class
 */

public class Rectangle extends TwoDimensions {
  /** length of a rectangle */
  private final double length;
  /** width of a rectangle */ 
  private final double width;

  /**
   * Constructor 
   * 
   * @param length length of a rectangle
   * @param width width of a rectangle
  */
  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }


  /**
   * Method to area
   * 
   * @return area of a rectangle
   */
  @Override
  double getArea() {
    return length * width;
  }

  /**
   * Method to return information of a Rectangle object
   * 
   * @return a string containing the legnth, width, and area of a rectangle
   */
  @Override
  String getHistory() {
    return "Area of circle calculated:\nradius: " + length + "\nresult: " + getArea();
  }
}
