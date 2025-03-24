public class MyTriangle {
    private MyPoint v1; // Đỉnh thứ nhất
    private MyPoint v2; // Đỉnh thứ hai
    private MyPoint v3; // Đỉnh thứ ba

    // Constructor nhận ba đối tượng MyPoint
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    // Constructor nhận tọa độ của ba đỉnh
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    // Getter cho đỉnh v1
    public MyPoint getV1() {
        return v1;
    }

    // Getter cho đỉnh v2
    public MyPoint getV2() {
        return v2;
    }

    // Getter cho đỉnh v3
    public MyPoint getV3() {
        return v3;
    }

    // Phương thức toString()
    @Override
    public String toString() {
        return "MyTriangle[v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + "]";
    }

    // Tính chu vi của tam giác
    public double getPerimeter() {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    // Xác định loại tam giác
    public String getType() {
        double d1 = v1.distance(v2);
        double d2 = v2.distance(v3);
        double d3 = v3.distance(v1);

        if (d1 == d2 && d2 == d3) {
            return "Equilateral"; // Tam giác đều
        } else if (d1 == d2 || d2 == d3 || d3 == d1) {
            return "Isosceles"; // Tam giác cân
        } else {
            return "Scalene"; // Tam giác thường
        }
    }
}
