public class TestPoint2D3D {
    public static void main(String[] args) {
        // Kiểm tra Point2D
        Point2D p2d = new Point2D(3.5f, 7.2f);
        System.out.println("  ");
        System.out.println("Point2D: " + p2d);
        System.out.println("X: " + p2d.getX() + ", Y: " + p2d.getY());

        // Kiểm tra Point3D
        Point3D p3d = new Point3D(1.2f, 4.5f, 9.3f);
        System.out.println("Point3D: " + p3d);
        System.out.println("X: " + p3d.getX() + ", Y: " + p3d.getY() + ", Z: " + p3d.getZ());

        // Thay đổi tọa độ
        p3d.setXYZ(5.5f, 6.6f, 7.7f);
        System.out.println("After setXYZ: " + p3d);
    }
}
