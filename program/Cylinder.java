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
    public String getHistory(){
        return "Volume of Cylinder: \nRadius: " + radius + 
                " \nHeight: : " + height +  
                " \nVolume: " + getVolume();
    }
}