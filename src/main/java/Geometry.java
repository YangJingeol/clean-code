public class Geometry {
    public double area(Shape shape) throws Exception {
        return shape.area();
    }

    public static void main(String[] args) {
        Geometry geometry = new Geometry();
        Circle circle = new Circle(4);
        try {
            System.out.println( geometry.area(circle));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
