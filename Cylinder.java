public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        super();  // Gọi constructor của Circle
        this.height = 1.0;
    }

    public Cylinder(double radius) {
        super(radius);  // Gọi constructor của Circle
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    // Getter & Setter
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Tính thể tích hình trụ
    public double getVolume() {
        return getArea() * height;  // Kế thừa getArea() từ Circle
    }

    // Ghi đè toString
    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + ", height=" + height + "]";
    }
}
