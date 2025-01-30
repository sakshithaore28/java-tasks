package collections;
import java.util.*;

public class ArrayListOperations {
	
	public static void main(String[] args) {
		ArrayList list=new ArrayList<>(Arrays.asList("sakshi","krishna","pruthvi","apoorva"));
		
		
		///////
		 System.out.println("a) Iterate ArrayList using ListIterator:");
	        ListIterator<String> listIterator = list.listIterator();
	        while (listIterator.hasNext()) {
	            System.out.println(listIterator.next());
	        }
	        
	        ////////
	        list.add(2, "Nikhil"); 
	        System.out.println("\nb) Add element at specific index:");
	        System.out.println(list);
	        
	      Collections.sort(list, Collections.reverseOrder());
	       // Collections.sort(list);
	        System.out.println("\nc) Sort ArrayList in descending order:");
	        System.out.println(list);
	        
	        
	        listIterator = list.listIterator();
	        while (listIterator.hasNext()) {
	            String name = listIterator.next();
	            if (name.equals("sakshi")) {
	                listIterator.add("Priya");  
	            }
	        }
	        System.out.println("\nd) Insert an element to ArrayList using ListIterator:");
	        System.out.println(list);
	        
	        Collections.sort(list);
	        System.out.println("\ne) Sort ArrayList of Strings alphabetically:");
	        System.out.println(list);

	        System.out.println("\nf) Sort elements of Java ArrayList (again):");
	        System.out.println(list);

	        
	        list.set(2, "parth");  
	        System.out.println("\ng) Replace an element at specified index ArrayList:");
	        System.out.println(list);
	        
	        String searchElement = "pruthvi";
	        boolean containsElement = list.contains(searchElement);
	        System.out.println("\nh) Search for element in Java ArrayList:");
	        System.out.println("Contains " + searchElement + ": " + containsElement);

	       
	        list.remove(3);  
	        System.out.println("\ni) Remove element from specified index ArrayList:");
	        System.out.println(list);



	        Set<String> set = new HashSet<>(list);  
	        ArrayList<String> noDuplicatesList = new ArrayList<>(set);
	        System.out.println("\nj) Remove duplicates from ArrayList without using Collections:");
	        System.out.println(noDuplicatesList);
	        
		
	}

}
