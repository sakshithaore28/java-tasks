package collections;

import java.util.*;

public class ArrayListConversion {
	public static void main(String[] args) {
		String[] arr= {"alfie", "Bob", "john", "Connor"};
		
		 List<String> arrayList1 = Arrays.asList(arr);
		 
		 System.out.println("Array to ArrayList coversion value: " +arrayList1);
		 
		 
		 System.out.println("\n");
	 
		 
		 ArrayList<String> arrayList = new ArrayList<>(arrayList1);
	        String[] newArray1 = arrayList.toArray(new String[0]);
	        System.out.println("ArrayList to Array coversion value: " + Arrays.toString(newArray1));
	}
	
	

}
