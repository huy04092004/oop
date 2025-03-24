public class InvoiceItem {
    private String id;
    private String desc;  
    private int qty;     
    private double unitPrice;

    // Constructor
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    // Setters
    public void setQty(int qty) {
        if (qty >= 0) {
            this.qty = qty;
        } else {
            System.out.println("Quantity must be non-negative.");
        }
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice >= 0) {
            this.unitPrice = unitPrice;
        } else {
            System.out.println("Unit price must be non-negative.");
        }
    }

    // Method to calculate the total price (qty * unit price)
    public double getTotal() {
        return qty * unitPrice;
    }

    // toString method for displaying invoice item details
    @Override
    public String toString() {
        return "InvoiceItem{" +
               "id='" + id + '\'' +
               ", desc='" + desc + '\'' +
               ", qty=" + qty +
               ", unitPrice=" + unitPrice +
               ", total=" + getTotal() +
               '}';
    }
}