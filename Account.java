public class Account {
    private String id;
    private String name;
    private double balance;

    // Constructor với tham số balance
    public Account(String id, String name, double balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Constructor với balance mặc định là 0
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0.0;
    }

    // Getters
    public String getID() {  // Theo yêu cầu của TestMain
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    // Phương thức thêm tiền vào tài khoản
    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Credited " + amount + " to account " + id);
        } else {
            System.out.println("Invalid credit amount.");
        }
    }

    // Phương thức rút tiền từ tài khoản
    public void debit(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Debited " + amount + " from account " + id);
        } else if (amount > balance) {
            System.out.println("Insufficient balance to debit " + amount);
        } else {
            System.out.println("Invalid debit amount.");
        }
    }

    // Phương thức chuyển khoản
    public void transferTo(Account anotherAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            this.debit(amount);
            anotherAccount.credit(amount);
            System.out.println("Transferred " + amount + " from account " + this.id + " to account " + anotherAccount.getID());
        } else if (amount > balance) {
            System.out.println("Insufficient balance to transfer " + amount);
        } else {
            System.out.println("Invalid transfer amount.");
        }
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Account{" +
               "id='" + id + '\'' +
               ", name='" + name + '\'' +
               ", balance=" + balance +
               '}';
    }
}