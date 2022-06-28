package Tuan2.Bai1;

public class Circle implements Shape {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
      return Math.PI * Math.pow(radius,2);
    }
    public double getPerimeter(){
        return Math.PI * 2 * radius;
    }
}
