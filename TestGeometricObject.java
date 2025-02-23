public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObject circle1 = new Circle1(5.0);
        System.out.println("    ");
        System.out.println(circle1);

        GeometricObject rectangle = new Rectangle(4.0, 6.0);
        System.out.println(rectangle);
    }
}
