public class TestMovablePoint1 {
    public static void main(String[] args) {
        MovablePoint1 point = new MovablePoint1(0, 0, 2, 3);
        System.out.println("Vị trí ban đầu: " + point);

        point.moveUp();
        System.out.println("Sau khi moveUp: " + point);

        point.moveRight();
        System.out.println("Sau khi moveRight: " + point);

        point.moveDown();
        System.out.println("Sau khi moveDown: " + point);

        point.moveLeft();
        System.out.println("Sau khi moveLeft: " + point);
    }
}
