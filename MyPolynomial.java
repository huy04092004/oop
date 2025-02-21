import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs; // Mảng chứa các hệ số của đa thức

    // Constructor nhận một số lượng hệ số không xác định (varargs)
    public MyPolynomial(double... coeffs) {
        this.coeffs = Arrays.copyOf(coeffs, coeffs.length);
    }

    // Lấy bậc của đa thức (số phần tử - 1)
    public int getDegree() {
        return coeffs.length - 1;
    }

    // Trả về dạng chuỗi của đa thức
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = getDegree(); i >= 0; i--) {
            if (i == 0) {
                sb.append(coeffs[i]); // Hệ số tự do
            } else {
                sb.append(coeffs[i]).append("x^").append(i).append(" + ");
            }
        }
        return sb.toString();
    }

    // Tính giá trị của đa thức tại x
    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i <= getDegree(); i++) {
            result += coeffs[i] * Math.pow(x, i);
        }
        return result;
    }

    // Cộng hai đa thức
    public MyPolynomial add(MyPolynomial other) {
        int maxDegree = Math.max(this.getDegree(), other.getDegree());
        double[] newCoeffs = new double[maxDegree + 1];

        // Cộng các hệ số của cả hai đa thức
        for (int i = 0; i <= maxDegree; i++) {
            double c1 = (i <= this.getDegree()) ? this.coeffs[i] : 0;
            double c2 = (i <= other.getDegree()) ? other.coeffs[i] : 0;
            newCoeffs[i] = c1 + c2;
        }

        return new MyPolynomial(newCoeffs);
    }

    // Nhân hai đa thức
    public MyPolynomial multiply(MyPolynomial other) {
        int newDegree = this.getDegree() + other.getDegree();
        double[] newCoeffs = new double[newDegree + 1];

        // Nhân từng hệ số của hai đa thức
        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= other.getDegree(); j++) {
                newCoeffs[i + j] += this.coeffs[i] * other.coeffs[j];
            }
        }

        return new MyPolynomial(newCoeffs);
    }
}
