

public class Circle {
    private double radius ;
    private String color ;

    public Circle() {
        radius = 1.0;
        color = "red";
    }
    public Circle(double r ) {
        radius = r ;
        color = "red";
    }
    public double getradius() {
        return radius ;
    }
    public double setradius() {
        return radius ;
    }
    public double getarea () {
        return radius*radius*Math.PI;
    }
    public double getCircumference() {
        return radius*2*Math.PI;
    }
}
