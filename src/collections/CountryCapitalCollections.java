package collections;
import java.util.*;

public class CountryCapitalCollections {
public static void main(String[] args) {
	Map<String, String> countriesCapitals = new HashMap<>();
    
    countriesCapitals.put("India", "New Delhi");
    countriesCapitals.put("France", "Paris");
    countriesCapitals.put("Italy", "Rome");
    countriesCapitals.put("Japan", "Tokyo");
    
    System.out.println("Using forEach loop:");
    for (Map.Entry<String, String> entry : countriesCapitals.entrySet()) {
       
        System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
    }   
    
    
    System.out.println("\nUsing keySet() iterator:");
    Set<String> keys = countriesCapitals.keySet();
    Iterator<String> keyIterator = keys.iterator();
    while (keyIterator.hasNext()) {
        String country = keyIterator.next();
        String capital = countriesCapitals.get(country);
        System.out.println(country + " -> " + capital);
    }
    
    
    
    System.out.println("\nUsing entrySet() with Java Iterator:");
    Iterator<Map.Entry<String, String>> entryIterator = countriesCapitals.entrySet().iterator();
    while (entryIterator.hasNext()) {
        Map.Entry<String, String> entry = entryIterator.next();
        System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
}
}
