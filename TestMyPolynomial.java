public class TestMyPolynomial {
    public static void main(String[] args) {
        // Tạo hai đa thức
        MyPolynomial p1 = new MyPolynomial(2, 3, 4); // 2 + 3x + 4x^2
        MyPolynomial p2 = new MyPolynomial(1, -1, 2); // 1 - x + 2x^2

        // In ra các đa thức
        System.out.println("  ");
        System.out.println("p1(x) = " + p1);
        System.out.println("p2(x) = " + p2);

        // Đánh giá giá trị của đa thức tại x = 2
        System.out.println("p1(2) = " + p1.evaluate(2));

        // Cộng hai đa thức
        MyPolynomial sum = p1.add(p2);
        System.out.println("p1 + p2 = " + sum);

        // Nhân hai đa thức
        MyPolynomial product = p1.multiply(p2);
        System.out.println("p1 * p2 = " + product);
    }
}
