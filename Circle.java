

// public class Circle {
//     private double radius ;
//     private String color ;

//     public Circle() {
//         radius = 1.0;
//         color = "red";
//     }
//     public Circle(double r ) {
//         radius = r ;
//         color = "red";
//     }
//     public String getColor() {
//         return color;
//     }
//     public void setColor(String color) {
//         this.color = color;
//     }
//     public double getradius() {
//         return radius ;
//     }
//     public double setradius() {
//         return radius ;
//     }
//     public double getarea () {
//         return radius*radius*Math.PI;
//     }
//     public double getCircumference() {
//         return radius*2*Math.PI;
//     }
// }
public class Circle {
    private double radius;
    private String color;

    // Constructor mặc định
    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    // Constructor có tham số
    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";  // Mặc định màu đỏ
    }

    // Constructor có cả bán kính và màu
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter & Setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Tính diện tích hình tròn
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // toString
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }
}
