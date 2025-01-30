package collections;
import java.util.*;
import java.io.*;
public class SerializedArrayList {
public static void main(String[] args) {
	 ArrayList<String> list = new ArrayList<>();
     list.add("Apple");
     list.add("Banana");
     list.add("Cherry");

   
     try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("arraylist.ser"))) {
         out.writeObject(list);
         System.out.println("ArrayList has been serialized to arraylist.ser");
     } catch (IOException e) {
         e.printStackTrace();
     }
}
}
