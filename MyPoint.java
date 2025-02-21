public class MyPoint {
    private int x;  // X-coordinate
    private int y;  // Y-coordinate

    // Default constructor (0, 0)
    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor with specified coordinates
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter for x
    public int getX() {
        return x;
    }

    // Setter for x
    public void setX(int x) {
        this.x = x;
    }

    // Getter for y
    public int getY() {
        return y;
    }

    // Setter for y
    public void setY(int y) {
        this.y = y;
    }

    // Method to set both x and y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Method to return coordinates as an array
    public int[] getXY() {
        return new int[]{x, y};
    }

    // toString method to represent the point as "(x, y)"
    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    // Method to calculate the distance to another MyPoint
    public double distance(MyPoint another) {
        int xDiff = this.x - another.x;
        int yDiff = this.y - another.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Method to calculate the distance to a specified (x, y) point
    public double distance(int x, int y) {
        int xDiff = this.x - x;
        int yDiff = this.y - y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Method to calculate the distance from this point to the origin (0, 0)
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }
}
