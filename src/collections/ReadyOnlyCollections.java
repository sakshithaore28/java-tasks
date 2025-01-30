package collections;
import java.util.*;


public class ReadyOnlyCollections {
public static void main(String[] args) {
	 List<String> list = new ArrayList<>();
     list.add("A");
     list.add("B");
     list.add("C");
     
    
     List<String> unmodifiableList = Collections.unmodifiableList(list);
     
    
     Set<String> set = new HashSet<>();
     set.add("John");
     set.add("Jane");
     set.add("Daisy");
     
    
     Set<String> unmodifiableSet = Collections.unmodifiableSet(set);
     
     
     Map<Integer, String> map = new HashMap<>();
     map.put(1, "One");
     map.put(2, "Two");
     map.put(3, "Three");
     
     
     Map<Integer, String> unmodifiableMap = Collections.unmodifiableMap(map);

     
     System.out.println("Unmodifiable List: " + unmodifiableList);
     System.out.println("Unmodifiable Set: " + unmodifiableSet);
     System.out.println("Unmodifiable Map: " + unmodifiableMap);
}
	
	
}
