package multithreading;
import java.io.IOException;

public class ExcecutionExamineExp {
public static void main(String[] args) {
	try {
		System.out.println("Returned Value: " + scenario1());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
    System.out.println("Returned Value: " + scenario2());
}
	public static String scenario1() throws IOException {
		try {
           
            int result = 10 / 0;  
            return "Return from Try Block";  // This will not be executed
        } catch (ArithmeticException e) {
            return "Return from Catch Block (ArithmeticException)";
        } catch (Exception e) {
            return "Return from Catch Block (General Exception)";
        } finally {
            
            return "Return from Finally Block (Overrides all)";
        }
        
    }
	public static String scenario2() {
        try {
            
            throw new IOException("File not found!"); 
           
        } catch (IOException e) {
            return "Return from Catch Block (IOException)";
        } catch (ArithmeticException e) {
            return "Return from Catch Block (ArithmeticException)";
        } catch (Exception e) {
            return "Return from Catch Block (General Exception)";
        } finally {
          
            return "Return from Finally Block (Overrides all)";
        }
    }
}


