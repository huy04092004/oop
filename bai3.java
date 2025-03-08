// package thread;

class ban {
    private final int sc = 5;
    private final String[] table = new String[sc];
    private int count = 0;
    private int mon = 1;

    public synchronized void cook() throws InterruptedException {
        while (count == sc) {
            wait(); 
        }
        table[count] = " " + (mon++);
        System.out.println(System.currentTimeMillis() +"dau bep da nau mon" + table[count]);
        count++;
        notify();
        Thread.sleep(2000); 
    }

    public synchronized void eat() throws InterruptedException {
        while (count == 0) {
            wait(); 
        }
        String eaten = table[count - 1];
        System.out.println("khach hang da an mon " + eaten);
        count--;
        notify(); 
        Thread.sleep(3000);
    }
}

public class bai3 {
    public static void main(String[] args) {
        ban table = new ban();

        Thread chef = new Thread(() -> {
            try {
                while (true) {
                    table.cook();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread customer = new Thread(() -> {
            try {
                while (true) {
                    table.eat();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        chef.start();
        customer.start();
    }
}
