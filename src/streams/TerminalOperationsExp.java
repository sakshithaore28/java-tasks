package streams;
import java.util.*;
import java.util.stream.*;

public class TerminalOperationsExp {
	public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(n -> n % 2 == 0)
                                           .collect(Collectors.toList());
        System.out.println("Collected even numbers: " + evenNumbers);

        
        int sum = numbers.stream()
                         .reduce(0, (a, b) -> a + b);
        System.out.println("Sum of numbers: " + sum);

        
        boolean anyGreaterThan5 = numbers.stream()
                                         .anyMatch(n -> n > 5);
        System.out.println("Any number greater than 5? " + anyGreaterThan5);

      
        boolean noneGreaterThan10 = numbers.stream()
                                           .noneMatch(n -> n > 10);
        System.out.println("No number greater than 10? " + noneGreaterThan10);

        
        boolean allGreaterThan0 = numbers.stream()
                                         .allMatch(n -> n > 0);
        System.out.println("All numbers greater than 0? " + allGreaterThan0);

        
        System.out.println("Using forEach to print numbers:");
        numbers.stream()
               .forEach(n -> System.out.println(n));

       
        System.out.println("Using forEachOrdered with parallel stream:");
        numbers.parallelStream()
               .forEachOrdered(n -> System.out.println(n));
    }
}
