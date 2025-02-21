public class TestMyPoint {
    // Chương trình thử nghiệm để kiểm tra tất cả các hàm tạo và phương thức công khai 
public static void main(String[] args) {
    // MyPoint p1 = new MyPoint();  // Test constructor
    // System.out.println(p1);      // Test toString()
    // p1.setX(8);   // Test setters
    // p1.setY(6);
    // System.out.println("x is: " + p1.getX());  // Test getters
    // System.out.println("y is: " + p1.getY());
    // p1.setXY(3, 0);   // Test setXY()
    // System.out.println(p1.getXY()[0]);  // Test getXY()
    // System.out.println(p1.getXY()[1]);
    // System.out.println(p1);
    
    // MyPoint p2 = new MyPoint(0, 4);  // Test another constructor
    // System.out.println(p2);
    // // Testing the overloaded methods distance()
    // System.out.println(p1.distance(p2));    // which version?
    // System.out.println(p2.distance(p1));    // which version?
    // System.out.println(p1.distance(5, 6));  // which version?
    // System.out.println(p1.distance());
    // MyPoint[] points = new MyPoint[10];

    // Bước 2: Khởi tạo từng phần tử trong mảng
    MyPoint[] points = new MyPoint[10];

    // Bước 2: Khởi tạo từng phần tử trong mảng
    for (int i = 0; i < points.length; i++) {
        points[i] = new MyPoint(i + 1, i + 1);  // Tọa độ lần lượt là (1,1), (2,2), ..., (10,10)
    }

    // Bước 3: In ra tất cả các điểm trong mảng
    for (int i = 0; i < points.length; i++) {
        System.out.println("diem " + (i + 1) + ": " + points[i]);
    }
}

}