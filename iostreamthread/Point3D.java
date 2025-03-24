public class Point3D extends Point2D {
    private float z;

    // Constructor mặc định
    public Point3D() {
        super(); // Gọi constructor của Point2D
        this.z = 0.0f;
    }

    // Constructor với tham số
    public Point3D(float x, float y, float z) {
        super(x, y); // Gọi constructor của Point2D
        this.z = z;
    }

    // Getter & Setter
    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setX(x); // Gọi setter của lớp cha
        setY(y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), z};
    }

    // Ghi đè phương thức toString
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ", " + z + ")";
    }
}
