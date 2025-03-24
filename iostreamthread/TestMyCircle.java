public class TestMyCircle {
    public static void main(String[] args) {
        // Tạo hai hình tròn
        MyCircle circle1 = new MyCircle(0, 0, 5);
        MyCircle circle2 = new MyCircle(3, 4, 10);

        // In thông tin hai hình tròn
        System.out.println("Circle 1: " + circle1);
        System.out.println("Circle 2: " + circle2);

        // Tính khoảng cách giữa hai tâm hình tròn
        double distance = circle1.distance(circle2);
        System.out.println("Distance between the centers of circle1 and circle2: " + distance);
    }
}
