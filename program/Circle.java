public class Circle extends TwoDimensions {

  double radius;
  public Circle(double radius) {
    this.radius = radius;
  }

  @Override
  double getArea() {
    return Math.PI * (Math.pow(radius, 2));
  }

  @Override
  String getHistory() {
    return "Area of circle calculated:\nradius: " + radius + "\nresult: " + getArea();
  }
}