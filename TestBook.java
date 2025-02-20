public class TestBook {
    public static void main(String[] args) {
        // Tạo một thể hiện của Author
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        System.out.println(ahTeck);  // Kiểm tra toString() của Author

        // Tạo một thể hiện của Book
        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);
        System.out.println(dummyBook);  // Kiểm tra toString() của Book

        // Kiểm tra Getter và Setter
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("tên là: " + dummyBook.getName());
        System.out.println("giá là: " + dummyBook.getPrice());
        System.out.println("số lượng là: " + dummyBook.getQty());
        System.out.println("Tác giả là: " + dummyBook.getAuthor());
        System.out.println("Tên tác giả là: " + dummyBook.getAuthor().getName());
        System.out.println("Email của tác giả là: " + dummyBook.getAuthor().getEmail());

        // Sử dụng thể hiện ẩn danh của Author
        Book anotherBook = new Book("More Java", new Author("Paul Tan", "paul@somewhere.com", 'm'), 29.95);
        System.out.println(anotherBook);  // Kiểm tra toString() của Book
    }
}
