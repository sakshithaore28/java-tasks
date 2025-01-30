package collections;
import java.util.*;
public class SyncHashmap {
	public static void main(String[] args) {
        
        Map<Integer, String> map = new HashMap<>();

       
        Map<Integer, String> synchronizedMap = Collections.synchronizedMap(map);

       
        synchronizedMap.put(1, "Apple");
        synchronizedMap.put(2, "Banana");
        synchronizedMap.put(3, "Cherry");

        
        synchronized (synchronizedMap) {
            for (Map.Entry<Integer, String> entry : synchronizedMap.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
