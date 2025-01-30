package collections;
import java.util.*;
public class LinkedListToArrayListConversion {
public static void main(String[] args) {
	
	
	
	 LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Sakshi","umar","yash","tanishka","sonali","sippi"));
	ArrayList<String> arraylist=new ArrayList<>(linkedList);
	
	System.out.println("Linked listvto ArrayList Conversion" +arraylist);
}
}
