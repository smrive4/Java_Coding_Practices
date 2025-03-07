public class Cylinder extends ThreeDimensions {
    double radius;
    double height;

    public Cylinder(double radius, double height) {
      this.radius = radius;
      this.height = height;
    }
  
    @Override
    double getVolume() {
      return Math.PI * (Math.pow(radius, 2)) * height;
    }
  
    @Override
    String getHistory() {
      return "Area of circle calculated:\nradius: " + radius + "\nresult: " + getVolume();
    }
}