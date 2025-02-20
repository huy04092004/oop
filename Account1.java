public class Account1 {
    private int id;               
    private Customer customer;    
    private double balance;     

    public Account1(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.balance = 0.0;
    }

    public Account1(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account1 deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        return this; 
    }

    public Account1 withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Amount withdrawn exceeds the current balance!");
        } else {
            balance -= amount;
        }
        return this ;  // Returning the current instance to allow method chaining
    }

    // toString() method for formatted account details
    @Override
    public String toString() {
        return "Account[id=" + id + ",customer=" + customer + ",balance=" + balance + "]";
    }
}
