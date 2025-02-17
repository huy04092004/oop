package bai2_5;

public class Account {
    private int id;
    private Customer customer;
    private double balance = 0;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    // getter
    public int getID() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    // setter
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return String.format("%s balance=$%.2f",
                customer.toString(), balance);
    }

    public Account deposit(double amount) {
        balance += amount;
        return this;
    }

    public Account withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return this;
        }
        System.out.println("amount withdraw exceeds the current balance");
        return this;
    }
}
