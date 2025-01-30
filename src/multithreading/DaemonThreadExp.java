package multithreading;

public class DaemonThreadExp {
public static void main(String[] args) {
	 Thread thread1 = new Thread(() -> {
         try {
             Thread.sleep(2000);  
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     });

     Thread thread2 = new Thread(() -> {
         try {
             Thread.sleep(3000);  
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     });

     Thread thread3 = new Thread(() -> {
         try {
             Thread.sleep(4000);  
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     });

    
     System.out.println("Before changes:");
     printThreadDetails(thread1);
     printThreadDetails(thread2);
     printThreadDetails(thread3);

     
     thread1.setName("yourName");

     
     thread1.setDaemon(true);

     
     thread1.start();
     thread2.start();
     thread3.start();

     
     System.out.println("\nAfter changes:");
     printThreadDetails(thread1);
     printThreadDetails(thread2);
     printThreadDetails(thread3);
 }


 private static void printThreadDetails(Thread thread) {
     System.out.println("Thread name: " + thread.getName());
     System.out.println("Thread ID: " + thread.getId());
     System.out.println("Is daemon: " + thread.isDaemon());
     System.out.println("Thread state: " + thread.getState());
     System.out.println("Thread priority: " + thread.getPriority());
     System.out.println("Is alive: " + thread.isAlive());
     System.out.println();
 }
}

