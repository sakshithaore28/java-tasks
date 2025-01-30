package problemStatements;
import java.util.*;
public class RemoveDuplicate {
public static void main(String[] args) {
	 int[] inputArray = {10, 20, 10, 30, 40, 20, 50};

     
     int[] resultArray = removeDuplicatesAndSort(inputArray);
     
     System.out.println("Array after removing duplicates and sorting in descending order:");
     System.out.println(Arrays.toString(resultArray));
 }

 public static int[] removeDuplicatesAndSort(int[] array) {
     
     Set<Integer> uniqueNumbers = new HashSet<>();
     
    
     for (int num : array) {
         uniqueNumbers.add(num);
     }

     
     Integer[] uniqueArray = uniqueNumbers.toArray(new Integer[0]);

     
     Arrays.sort(uniqueArray, Collections.reverseOrder());

     
     int[] resultArray = new int[uniqueArray.length];
     for (int i = 0; i < uniqueArray.length; i++) {
         resultArray[i] = uniqueArray[i];
     }

     return resultArray;
}
}
