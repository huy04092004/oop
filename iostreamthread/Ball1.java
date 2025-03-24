public class Ball1 {
    private double x, y, z;  // Vị trí của bóng trong không gian 3D

    // Constructor
    public Ball1(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Getters
    public double getX() { return x; }
    public double getY() { return y; }
    public double getZ() { return z; }

    // Setters
    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public void setZ(double z) { this.z = z; }

    @Override
    public String toString() {
        return "Ball1 tại (" + x + ", " + y + ", " + z + ")";
    }
}
