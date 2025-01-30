package collections;
import java.util.*;

public class MedalOffering {
public static void main(String[] args) {
	  HashMap<String, Integer> studentMarks = new HashMap<>();
      studentMarks.put("S123", 95);
      studentMarks.put("S124", 85);
      studentMarks.put("S125", 72);
      studentMarks.put("S126", 60);
      studentMarks.put("S127", 89);
      HashMap<String, String> medalDetails = assignMedals(studentMarks);
      
    
      System.out.println("Student Medal Details: " + medalDetails);
  }
      
      public static HashMap<String, String> assignMedals(HashMap<String, Integer> studentMarks) {
        
          HashMap<String, String> medalDetails = new HashMap<>();
          
         
          for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
              String registrationNumber = entry.getKey();
              int marks = entry.getValue();
              String medal = "";
              
              if (marks >= 90) {
                  medal = "Gold";
              } else if (marks >= 80) {
                  medal = "Silver";
              } else if (marks >= 70) {
                  medal = "Bronze";
              }

              
              if (!medal.isEmpty()) {
                  medalDetails.put(registrationNumber, medal);
              }
          }

          return medalDetails;
          
              
	
}

}
