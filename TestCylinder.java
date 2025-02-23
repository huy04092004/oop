public class TestCylinder {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.5, "blue");
        System.out.println(c1);
        System.out.println("Diện tích: " + c1.getArea());

        // Kiểm thử lớp Cylinder
        Cylinder cy1 = new Cylinder();
        System.out.println(cy1);
        System.out.println("Thể tích: " + cy1.getVolume());

        Cylinder cy2 = new Cylinder(3.0);
        System.out.println(cy2);
        System.out.println("Thể tích: " + cy2.getVolume());

        Cylinder cy3 = new Cylinder(2.0, 5.0, "green");
        System.out.println(cy3);
        System.out.println("Thể tích: " + cy3.getVolume());
    }
}
