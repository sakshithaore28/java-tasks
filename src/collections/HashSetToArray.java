package collections;
import java.util.*;
public class HashSetToArray {
public static void main(String[] args) {
	HashSet<String> hashSet = new HashSet<>();
    hashSet.add("Sakshi");
    hashSet.add("pruthvi");
    hashSet.add("krishna");
    hashSet.add("apoorva");
    hashSet.add("yegna");

    
    System.out.println("HashSet: " + hashSet);

 
    String[] array = new String[hashSet.size()];  
    array = hashSet.toArray(array);  

   
    System.out.println("Array after conversion from HashSet: " + Arrays.toString(array));
}
}
