public class Book1 {
    private String name;
    private Author[] authors;  // Mảng Author để hỗ trợ nhiều tác giả
    private double price;
    private int qty;

    public Book1(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = 0;  // Mặc định số lượng là 0
    }

    public Book1(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        StringBuilder authorsStr = new StringBuilder();
        authorsStr.append("{");
        for (int i = 0; i < authors.length; i++) {
            authorsStr.append(authors[i].toString());
            if (i < authors.length - 1) {
                authorsStr.append(", ");
            }
        }
        authorsStr.append("}");
        return "Book[name=" + name + ",authors=" + authorsStr + ",price=" + price + ",qty=" + qty + "]";
    }
}
