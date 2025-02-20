public class TestAccount25 {
    public static void main(String[] args) {
        Customer customer = new Customer(101, "John Doe", 15);

        Account1 account1 = new Account1(1, customer, 1000.0);

        System.out.println("Testing toString():");
        System.out.println(account1);  

        System.out.println("\nTesting getters:");
        System.out.println("Account ID: " + account1.getId());                  
        System.out.println("Customer Name: " + account1.getCustomerName());   
        System.out.println("Balance: " + account1.getBalance());               

        System.out.println("\nTesting deposit():");
        account1.deposit(500.0);
        System.out.println("Balance after deposit: " + account1.getBalance()); // Should print 1500.0

        System.out.println("\nTesting withdraw():");
        account1.withdraw(200.0);  // Withdraw 200.0
        System.out.println("Balance after withdrawal: " + account1.getBalance()); // Should print 1300.0

        System.out.println("\nTesting withdraw() with insufficient balance:");
        account1.withdraw(2000.0);  // Attempt to withdraw more than the current balance
        System.out.println("Balance after attempting to overdraw: " + account1.getBalance()); // Should still print 1300.0
    }
}
