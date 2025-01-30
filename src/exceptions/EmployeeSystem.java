package exceptions;
import java.util.*;
public class EmployeeSystem {
	public static void main(String[] args) {
		
		
		List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("amy", 101, "Mumbai"));
        employees.add(new Employee("Bob", 102, "pune"));
        employees.add(new Employee("Jack", 103, "Hyderabad"));
        
        Scanner scanner = new Scanner(System.in);
        try {
            
            System.out.print("Enter Employee ID to Enter the Office: ");
            int enteredId = scanner.nextInt(); 

            boolean idFound = false;
            for (Employee employee : employees) {
                if (employee.getId() == enteredId) {
                    idFound = true;
                    System.out.println("Welcome to the office, " + employee.getName() + "!");
                    break;
                }
            }

            if (!idFound) {
                throw new InvalidEmployeeException("Given Employee ID is not found or mismatched, please enter a valid ID.");
            }
        } catch (InputMismatchException e) {
            
            System.out.println("Error: Invalid input. Please enter a valid integer ID.");
        } catch (InvalidEmployeeException e) {
           
            System.out.println(e.getMessage());
        } catch (Exception e) {
            
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
           
            scanner.close();
        }
    }
        
	}
	


