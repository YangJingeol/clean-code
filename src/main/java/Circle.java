import java.awt.*;


public class Circle implements Shape {
    private Point center;
    private double radius;
    public final double PI = 3.141592;

    public Circle(int radius) {
        this.radius = radius;
    }
    public double area() {
        return PI * radius * radius;
    }
}
