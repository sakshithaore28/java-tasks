package collections;
import java.io.*;
import java.util.*;

public class SerializeHashMap {
public static void main(String[] args) {
	HashMap<Integer, String> hashMap = new HashMap<>();
    hashMap.put(1, "Apple");
    hashMap.put(2, "Banana");
    hashMap.put(3, "Orange");
    hashMap.put(4, "Grapes");
    hashMap.put(5, "Pineapple");

    
    System.out.println("Original HashMap: " + hashMap);

    
    try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("hashmap.ser"));) {
        
        
        
        
        
        
        
        out.writeObject(hashMap);
        
       
       
        
        System.out.println("HashMap has been serialized to 'hashMap.ser'");
    } catch (IOException e) {
        e.printStackTrace();
    }
    finally {
		
	}
	
}
}
