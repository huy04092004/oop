

class EvenRunnable implements Runnable{
   public void run(){
    for(int i = 0; i <= 10; i+=2){
        System.out.println("chan :"+ i);
        try{
            Thread.sleep(500);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
   }
    
}
class OddRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i += 2) {
            System.out.println("Le: " + i);
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class EvenOddRunnable{
    public static void main(String[] args){
        System.out.println("  ");
        Thread evenThread = new Thread(new EvenRunnable());
        Thread oddThread = new Thread(new OddRunnable());

        evenThread.start();
        oddThread.start();



    }
}