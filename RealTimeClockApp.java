import java.text.SimpleDateFormat;
import java.util.Date;

class RealTimeClock extends Thread {
    public void run() {
        System.out.println("   "); 
        SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        while (true) {
            Date now = new Date();
            System.out.println(" Gio hien tai: " + formatter.format(now));
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("dong ho bi gian doan!");
            }
        }
    }
}

public class RealTimeClockApp {
    public static void main(String[] args) {
        RealTimeClock clock = new RealTimeClock();
        clock.start();
    }
}
