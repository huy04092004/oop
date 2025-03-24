public class TestSoccer {
    public static void main(String[] args) {
        Ball1 ball = new Ball1(50, 50, 0);
        Player player1 = new Player("Ronaldo", 45, 50, 0);
        Player player2 = new Player("Messi", 80, 50, 0);
       
        System.out.println(" ");
        System.out.println(ball);
        System.out.println(player1);
        System.out.println(player2);

        // Ronaldo kiểm tra khoảng cách với bóng
        System.out.println("Ronaldo gần bóng? " + player1.isNear(ball, 10));

        // Ronaldo sút bóng (thành công vì ở gần)
        player1.kick(ball, 70, 50, 5);

        // Messi cố gắng sút bóng nhưng ở xa
        player2.kick(ball, 90, 50, 3);

        // Messi di chuyển gần bóng rồi sút
        player2.move(71, 50, 0);
        player2.kick(ball, 90, 50, 3);

        // Ronaldo nhảy lên
        player1.jump(2);
        System.out.println(player1);
    }
}
