public class TestBall {
    public static void main(String[] args) {
        // Tạo một quả bóng tại vị trí (50, 50) với bán kính 10, tốc độ 5 và hướng 45 độ
        Ball ball = new Ball(50, 50, 10, 5, 45);
        System.out.println(ball); // In trạng thái ban đầu

        // Di chuyển quả bóng 5 lần
        for (int i = 0; i < 5; i++) {
            ball.move();
            System.out.println(ball);
        }

        // Phản xạ ngang (chạm tường dọc)
        System.out.println("Reflecting horizontally...");
        ball.reflectHorizontal();
        ball.move();
        System.out.println(ball);

        // Phản xạ dọc (chạm tường ngang)
        System.out.println("Reflecting vertically...");
        ball.reflectVertical();
        ball.move();
        System.out.println(ball);
    }
}
