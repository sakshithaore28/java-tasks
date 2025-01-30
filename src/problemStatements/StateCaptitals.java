package problemStatements;

import java.util.*;

public class StateCaptitals {
	
	    public static void main(String[] args) {
	       
	        String input = "tamilnadu||chennai-karanataka||bengaluru";
	        
	     
	        Map<String, String> statesCapitalsMap = parseStatesAndCapitals(input, "\\|\\|", "-");
	        
	      
	        System.out.println("States and Capitals:"+statesCapitalsMap);
	        for (Map.Entry<String, String> entry : statesCapitalsMap.entrySet()) {
	            System.out.println("State: " + entry.getKey() + ", Capital: " + entry.getValue());
	        }
	    }

	    public static Map<String, String> parseStatesAndCapitals(String input, String del1, String del2) {
	        
	        Map<String, String> statesCapitals = new HashMap<>();
	        
	        
	        String[] stateCapitalPairs = input.split(del1);
	        
	        
	        for (String pair : stateCapitalPairs) {
	            
	            String[] stateAndCapital = pair.split(del2);
	            
	            
	            if (stateAndCapital.length == 2) {
	               
	                statesCapitals.put(stateAndCapital[0], stateAndCapital[1]);
	            }
	        }
	        
	   
	        return statesCapitals;
	    }
	}


