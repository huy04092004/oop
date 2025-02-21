public class TestMyTriangle {
    public static void main(String[] args) {
        // Tạo ba đỉnh của tam giác
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(4, 0);
        MyPoint p3 = new MyPoint(2, 3);

        // Tạo một tam giác từ ba đỉnh
        MyTriangle triangle1 = new MyTriangle(p1, p2, p3);
        System.out.println(triangle1); // In thông tin tam giác

        // Tính chu vi tam giác
        System.out.println("Perimeter: " + triangle1.getPerimeter());

        // Kiểm tra loại tam giác
        System.out.println("Type: " + triangle1.getType());

        // Tạo một tam giác đều để kiểm tra
        MyTriangle equilateralTriangle = new MyTriangle(0, 0, 3, 0, 1, (int)Math.sqrt(3));
        System.out.println("Equilateral Triangle: " + equilateralTriangle);
        System.out.println("Type: " + equilateralTriangle.getType());
    }
}
