public class TestLineSub {
    public static void main(String[] args) {
        LineSub line = new LineSub(1, 2, 5, 6);
        
        System.out.println(line);  // Kiểm tra toString()
        System.out.println("Start Point: " + line.getStart());
        System.out.println("End Point: " + line.getEnd());
        System.out.println("Line Length: " + line.getLength());

        // Thay đổi điểm đầu và điểm cuối
        line.setStart(2, 3);
        line.setEnd(6, 7);

        System.out.println("\nAfter Modifications:");
        System.out.println(line);
        System.out.println("Line Length: " + line.getLength());
    }
}
