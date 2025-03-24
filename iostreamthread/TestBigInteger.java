import java.math.BigInteger;

public class TestBigInteger {
    public static void main(String[] args) {
        // Khởi tạo hai số lớn dưới dạng chuỗi
        String num1 = "11111111111111111111111111111111111111111111111111111111111111";
        String num2 = "22222222222222222222222222222222222222222222222222";

        // Chuyển đổi chuỗi thành BigInteger
        BigInteger bigInt1 = new BigInteger(num1);
        BigInteger bigInt2 = new BigInteger(num2);

        // Thực hiện phép cộng
        System.out.println(" ");
        BigInteger sum = bigInt1.add(bigInt2);
        System.out.println("Tổng: " + sum);

        // Thực hiện phép nhân
        BigInteger product = bigInt1.multiply(bigInt2);
        System.out.println("Tích: " + product);
    }
}
