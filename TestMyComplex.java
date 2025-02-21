public class TestMyComplex {
    public static void main(String[] args) {
        // Tạo hai số phức
        MyComplex c1 = new MyComplex(3, 4);
        MyComplex c2 = new MyComplex(1, -2);

        // Kiểm tra phương thức toString()
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);

        // Kiểm tra phương thức isReal() và isImaginary()
        System.out.println("c1 là số thực? " + c1.isReal());
        System.out.println("c2 là số ảo? " + c2.isImaginary());

        // Kiểm tra phương thức equals()
        System.out.println("c1 có bằng (3,4)? " + c1.equals(3, 4));
        System.out.println("c1 có bằng c2 không? " + c1.equals(c2));

        // Kiểm tra magnitude()
        System.out.println("Độ lớn của c1: " + c1.magnitude());

        // Cộng hai số phức bằng addInto()
        c1.addInto(c2);
        System.out.println("Sau khi cộng c1 += c2, c1 = " + c1);

        // Cộng hai số phức bằng addNew()
        MyComplex c3 = new MyComplex(2, 3);
        MyComplex c4 = c3.addNew(new MyComplex(5, -1));
        System.out.println("Sau khi cộng new c3 + (5, -1), kết quả: " + c4);
    }
}
