package collections;
import java.util.*;
public class SynchronizeArraylist {
public static void main(String[] args) {
	List<String> list = new ArrayList<>();


	List<String> synchronizedList = Collections.synchronizedList(list);

	synchronizedList.add("Apple");
	synchronizedList.add("Banana");
	synchronizedList.add("Cherry");
	
	synchronized (synchronizedList) {
        for (String item : synchronizedList) {
            System.out.println(item);
        }
    }
	
}  
}
