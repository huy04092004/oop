public class TestBallInContainer {
    public static void main(String[] args) {
        // Tạo quả bóng tại (50,50) với bán kính 5, tốc độ 10, góc 30 độ
        Ball ball = new Ball(50, 50, 5, 10, 30);
        // Tạo hộp chứa với góc trên trái (0,0), kích thước 100x100
        Container box = new Container(0, 0, 100, 100);

        System.out.println(box); // In thông tin container
        System.out.println(ball); // In trạng thái ban đầu của bóng

        // Di chuyển bóng trong 100 bước
        for (int step = 0; step < 100; ++step) {
            ball.move();
            box.collidesWith(ball);
            System.out.println(ball); // Kiểm tra thủ công vị trí của quả bóng
        }
    }
}
