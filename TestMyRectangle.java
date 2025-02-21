public class TestMyRectangle {
    public static void main(String[] args) {
        // Tạo một hình chữ nhật từ hai MyPoint
        MyPoint p1 = new MyPoint(1, 4);
        MyPoint p2 = new MyPoint(5, 1);
        MyRectangle rect1 = new MyRectangle(p1, p2);

        // Hiển thị thông tin hình chữ nhật
        System.out.println(rect1);

        // Tính toán diện tích và chu vi
        System.out.println("Area: " + rect1.getArea());
        System.out.println("Perimeter: " + rect1.getPerimeter());

        // Tạo một hình chữ nhật từ tọa độ
        MyRectangle rect2 = new MyRectangle(2, 6, 8, 2);
        System.out.println(rect2);
        System.out.println("Area: " + rect2.getArea());
        System.out.println("Perimeter: " + rect2.getPerimeter());
    }
}
