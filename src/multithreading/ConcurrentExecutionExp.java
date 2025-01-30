package multithreading;
class JavaThread extends Thread {
    
  
    public void run() {
        
        System.out.println("Java is hot, aromatic, and invigorating");
    }
}
public class ConcurrentExecutionExp {
public static void main(String[] args) {
	 JavaThread t1 = new JavaThread();
     JavaThread t2 = new JavaThread();
     
    
     t1.start();  
     t2.start();
}
}
