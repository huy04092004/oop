public class TestMyLine {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(3, 4);

        MyLine line1 = new MyLine(p1, p2);
        System.out.println(line1);  // Kiểm tra toString()

        // Kiểm tra độ dài đoạn thẳng
        System.out.println("Length of line1: " + line1.getLength());

        // Kiểm tra góc nghiêng đoạn thẳng
        System.out.println("Gradient of line1: " + Math.toDegrees(line1.getGradient()) + " degrees");

        // Tạo một đoạn thẳng khác bằng tọa độ
        MyLine line2 = new MyLine(1, 2, 5, 6);
        System.out.println(line2);

        // Kiểm tra độ dài đoạn thẳng
        System.out.println("Length of line2: " + line2.getLength());

        // Thay đổi điểm bắt đầu và kết thúc
        line2.setBeginXY(2, 3);
        line2.setEndXY(6, 7);
        System.out.println("Updated line2: " + line2);
        System.out.println("New length of line2: " + line2.getLength());
    }
}
