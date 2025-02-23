public class Container {
    private int x1, y1, x2, y2;

    // Hàm tạo nhận tọa độ góc trên bên trái, width, height
    public Container(int x, int y, int width, int height) {
        this.x1 = x;
        this.y1 = y;
        this.x2 = x + width - 1;
        this.y2 = y + height - 1;
    }

    // Phương thức kiểm tra va chạm với Ball và thay đổi hướng nếu cần
    public boolean collidesWith(Ball ball) {
        boolean collided = false;
        
        // Kiểm tra va chạm với tường dọc (trái/phải)
        if (ball.getX() - ball.getRadius() <= this.x1 || 
            ball.getX() + ball.getRadius() >= this.x2) {
            ball.reflectHorizontal();
            collided = true;
        }

        // Kiểm tra va chạm với tường ngang (trên/dưới)
        if (ball.getY() - ball.getRadius() <= this.y1 || 
            ball.getY() + ball.getRadius() >= this.y2) {
            ball.reflectVertical();
            collided = true;
        }

        return collided;
    }

    @Override
    public String toString() {
        return "Container at (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ")";
    }
}
