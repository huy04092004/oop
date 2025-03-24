public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint mp = new MovablePoint(2.0f, 3.0f, 1.0f, 1.5f);
        System.out.println("  ");
        System.out.println("Trước khi di chuyển: " + mp);
        mp.move();
        System.out.println("Sau khi di chuyển: " + mp);
        mp.move();
        System.out.println("Di chuyển lần 2: " + mp);
    }
}
