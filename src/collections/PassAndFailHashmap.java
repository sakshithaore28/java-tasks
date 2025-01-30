package collections;
import java.util.*;

public class PassAndFailHashmap {
public static void main(String[] args) {
	 HashMap<String, Float> inputMap = new HashMap<>();
     inputMap.put("selva", 75.6f);
     inputMap.put("abi", 89.5f);
     inputMap.put("ram", 40f);

     
     HashMap<String, String> outputMap = new HashMap<>();

     
     for (Map.Entry<String, Float> entry : inputMap.entrySet()) {
         String name = entry.getKey();
         Float marks = entry.getValue();

         if (marks > 60) {
             outputMap.put(name, "pass");
         } else {
             outputMap.put(name, "fail");
         }
     }

    
     System.out.println("Output HashMap: " + outputMap);
}
}
