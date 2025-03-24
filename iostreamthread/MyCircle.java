public class MyCircle {
    private MyPoint center;  // Tâm của hình tròn
    private int radius;      // Bán kính của hình tròn

    // Constructor mặc định (tâm tại (0,0), bán kính = 1)
    public MyCircle() {
        this.center = new MyPoint(0, 0);
        this.radius = 1;
    }

    // Constructor với một đối tượng MyPoint và bán kính
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    // Constructor với tọa độ của tâm và bán kính
    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    // Getter và Setter cho tâm
    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    // Getter và Setter cho bán kính
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // Tính chu vi hình tròn
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    // Tính diện tích hình tròn
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Phương thức tính khoảng cách giữa hai tâm hình tròn
    public double distance(MyCircle another) {
        return this.center.distance(another.getCenter());
    }

    @Override
    public String toString() {
        return "MyCircle[center=" + center + ", radius=" + radius + "]";
    }
}
