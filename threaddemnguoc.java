package thread;
class demnguoc implements Runnable{
    public void run(){
     for(int i = 10; i >= 0; i--){
         System.out.println( i);
         try{
             Thread.sleep(1000);
         } catch (InterruptedException e){
             e.printStackTrace();
         }
     }
    }
     
 }
  
 public class threaddemnguoc {
   public static void main(String[] args) {
    System.out.println("  ");
    Thread demnguoc = new Thread(new demnguoc());
    demnguoc.start();
   }
    
 }