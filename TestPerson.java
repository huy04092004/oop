public class TestPerson {
    public static void main(String[] args) {
        // Tạo đối tượng Person
        System.out.println("   ");
        Person p1 = new Person("John Doe", "123 Main St");
        System.out.println(p1);

        // Tạo đối tượng Student
        Student s1 = new Student("Alice", "456 School St", "Computer Science", 2, 5000.0);
        System.out.println(s1);

        // Tạo đối tượng Staff
        Staff staff1 = new Staff("Bob", "789 University Ave", "XYZ High School", 3000.0);
        System.out.println(staff1);
    }
}
