package collections;
import java.util.*;

public class IterateTreeMap {
public static void main(String[] args) {
	 TreeMap<Integer, String> treeMap = new TreeMap<>();
     treeMap.put(1, "Apple");
     treeMap.put(2, "Banana");
     treeMap.put(3, "Orange");
     treeMap.put(4, "Grapes");
     treeMap.put(5, "Pineapple");

     System.out.println("TreeMap: " + treeMap);

    
    
     for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
         System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
     }
}
}
