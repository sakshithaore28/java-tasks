package streams;
import java.util.*;
import java.util.stream.*;
public class IntermediateOperationExp {
public static void main(String[] args) {
	
	 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 9, 8, 7);
     
    
     System.out.println("Distinct elements:");
     numbers.stream()
            .distinct()
            .forEach(System.out::println);
     
     System.out.println("\nFirst 5 elements (limit):");
     numbers.stream()
            .limit(5)
            .forEach(System.out::println);
     
     System.out.println("\nSkipping first 5 elements:");
     numbers.stream()
            .skip(5)
            .forEach(System.out::println);
     
     System.out.println("\nPeek operation (showing elements as they are processed):");
     numbers.stream()
            .peek(n -> System.out.println("Processing: " + n))  
            .forEach(System.out::println); 
     
     
     System.out.println("\nFlattened stream using flatMap:");
     List<List<Integer>> listOfLists = Arrays.asList(
         Arrays.asList(1, 2, 3),
         Arrays.asList(4, 5),
         Arrays.asList(6, 7)
     );
     
     listOfLists.stream()
                .flatMap(List::stream) 
                .forEach(System.out::println);
     
     
     
     
     
}
}
