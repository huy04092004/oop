public class bai19 {
    private float x,y,xDelta,yDelta;
    int radius;

    public  bai19(){}

    public bai19(float x, float y, int radius, float xDelta, float yDelta){
        this.x =x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getXDelta() {
        return xDelta;
    }

    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public float getYDelta() {
        return yDelta;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public void move() {
        x += xDelta;
        y += yDelta;
    }

    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    public void reflecVertical() {
        yDelta = -yDelta;
    }
    //@Override
   public String toString() {
        return "Ball [(" + x + "," + y + "),speed=(" + xDelta + "," + yDelta + ")]";
    }
}
