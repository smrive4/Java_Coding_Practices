public class Rectangle extends TwoDimensions {

  double length, width;
  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  @Override
  double getArea() {
    return length * width;
  }

  @Override
  String getHistory() {
    return "Area of circle calculated:\nradius: " + length + "\nresult: " + getArea();
  }
}