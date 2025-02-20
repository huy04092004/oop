public class TestBook1 {
    public static void main(String[] args) {
        // Tạo một mảng các tác giả
        Author[] authors = new Author[2];
        authors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        authors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        // Tạo một đối tượng Book với nhiều tác giả
        Book1 javaDummy = new Book1("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy);  // Kiểm tra toString()

        // Kiểm tra các phương thức getter và setter
        javaDummy.setPrice(29.99);
        javaDummy.setQty(50);
        System.out.println("Name: " + javaDummy.getName());
        System.out.println("Price: " + javaDummy.getPrice());
        System.out.println("Quantity: " + javaDummy.getQty());

        // Lấy thông tin tác giả từ cuốn sách
        Author[] bookAuthors = javaDummy.getAuthors();
        for (Author author : bookAuthors) {
            System.out.println("Author: " + author.getName() + ", Email: " + author.getEmail());
        }
    }
}
