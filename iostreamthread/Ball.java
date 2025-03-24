public class Ball {
    private float x, y;
    private int radius;
    private float xDelta, yDelta;

    public Ball(float x, float y, int radius, int speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;

        // Chuyển đổi speed và direction thành Δx, Δy
        double radians = Math.toRadians(direction);
        this.xDelta = (float) (speed * Math.cos(radians));
        this.yDelta = (float) (-speed * Math.sin(radians)); // Hệ tọa độ đồ họa Java đảo ngược y
    }

    // Getter và Setter cho x, y, radius, xDelta, yDelta
    public float getX() { return x; }
    public void setX(float x) { this.x = x; }
    
    public float getY() { return y; }
    public void setY(float y) { this.y = y; }
    
    public int getRadius() { return radius; }
    public void setRadius(int radius) { this.radius = radius; }
    
    public float getXDelta() { return xDelta; }
    public void setXDelta(float xDelta) { this.xDelta = xDelta; }
    
    public float getYDelta() { return yDelta; }
    public void setYDelta(float yDelta) { this.yDelta = yDelta; }

    // Phương thức di chuyển
    public void move() {
        x += xDelta;
        y += yDelta;
    }

    // Phản xạ khi chạm tường dọc (trái/phải)
    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    // Phản xạ khi chạm tường ngang (trên/dưới)
    public void reflectVertical() {
        yDelta = -yDelta;
    }

    @Override
    public String toString() {
        return "Ball at (" + x + ", " + y + ") of velocity (" + xDelta + ", " + yDelta + ")";
    }
}
