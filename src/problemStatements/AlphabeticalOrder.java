package problemStatements;
import java.util.*;
public class AlphabeticalOrder {
public static void main(String[] args) {
	 String[] input = {"banana", "Apple", "grape", "Orange", "kiwi"};
     
     
     String[] result = sortArrayWithCase(input);
     System.out.println(Arrays.toString(result));
 }

 public static String[] sortArrayWithCase(String[] array) {
     
     Arrays.sort(array);
     
     
     int n = array.length;
     int half = (n / 2) + (n % 2);
     
     for (int i = 0; i < half; i++) {
         array[i] = array[i].toUpperCase();
     }
     
    
     for (int i = half; i < n; i++) {
         array[i] = array[i].toLowerCase();
     }
     
     return array;
}
}
