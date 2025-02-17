package bai2_5;

public class bai2_5bai {

    public static void main(String[] args) {
        Account acc = new Account(6969, new Customer(9696, "MCS", 'm'), 100);
        System.out.println(acc);
        System.out.println(acc.deposit(200));
        System.out.println(acc.withdraw(22));
    }

}
