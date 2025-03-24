public class MyRectangle {
    private MyPoint topLeft;       // Góc trên bên trái
    private MyPoint bottomRight;   // Góc dưới bên phải

    // Constructor nhận hai MyPoint
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Constructor nhận tọa độ
    public MyRectangle(int x1, int y1, int x2, int y2) {
        this.topLeft = new MyPoint(x1, y1);
        this.bottomRight = new MyPoint(x2, y2);
    }

    // Getter cho topLeft
    public MyPoint getTopLeft() {
        return topLeft;
    }

    // Getter cho bottomRight
    public MyPoint getBottomRight() {
        return bottomRight;
    }

    // Tính chiều rộng của hình chữ nhật
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // Tính chiều cao của hình chữ nhật
    public int getHeight() {
        return Math.abs(topLeft.getY() - bottomRight.getY());
    }

    // Tính diện tích của hình chữ nhật
    public int getArea() {
        return getWidth() * getHeight();
    }

    // Tính chu vi của hình chữ nhật
    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    // Phương thức toString() để hiển thị thông tin hình chữ nhật
    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + 
               ", width=" + getWidth() + ", height=" + getHeight() + "]";
    }
}
                                            