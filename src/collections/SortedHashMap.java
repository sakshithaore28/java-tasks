package collections;
import java.util.*;
import java.util.stream.Collectors;
public class SortedHashMap {
	public static void main(String[] args) {
		HashMap<Integer,String>hashmap=new HashMap<>();
		 
	        hashmap.put(1, "Amy");
	        hashmap.put(2, "ella");
	        hashmap.put(4, "Bunny");
	        hashmap.put(3, "Druv");
	       
	        
	        
	        List<Map.Entry<Integer, String>> list = new ArrayList<>(hashmap.entrySet());

	    list=    list.stream().sorted((o1,o2)->o1.getValue().compareTo(o2.getValue())).collect(Collectors.toList());

	        
	        LinkedHashMap<Integer, String> sortedMap = new LinkedHashMap<>();

	        
	        for (Map.Entry<Integer, String> entry : list) {
	            sortedMap.put(entry.getKey(), entry.getValue());
	        }

	        
	        System.out.println("HashMap sorted by value: " + sortedMap);
	        
	       
	}

}
