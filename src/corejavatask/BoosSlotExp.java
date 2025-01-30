package corejavatask;
import java.util.*;

public class BoosSlotExp {

	    
	   
	    static Map<String, List<String>> availableSlots = new HashMap<>();
	    
	    public static void main(String[] args) {
	      
	        initializeSlots();

	  
	        Scanner scanner = new Scanner(System.in);

	        
	        while (true) {
	           
	            System.out.print("Enter your name: ");
	            String name = scanner.nextLine();

	            
	            System.out.println("Available Sports:");
	            System.out.println("1. Badminton");
	            System.out.println("2. Football");
	            System.out.println("3. Box Cricket");

	           
	            System.out.print("Choose a sport (1-3): ");
	            int sportChoice = scanner.nextInt();
	            scanner.nextLine();  

	            String chosenSport = "";
	            List<String> availableSportSlots = new ArrayList<>();
	            
	            
	            switch (sportChoice) {
	                case 1:
	                    chosenSport = "Badminton";
	                    availableSportSlots = availableSlots.get(chosenSport);
	                    break;
	                case 2:
	                    chosenSport = "Football";
	                    availableSportSlots = availableSlots.get(chosenSport);
	                    break;
	                case 3:
	                    chosenSport = "Box Cricket";
	                    availableSportSlots = availableSlots.get(chosenSport);
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please choose a valid sport.");
	                    continue;
	            }

	           
	            System.out.println("Available slots for " + chosenSport + ":");
	            if (availableSportSlots.isEmpty()) {
	                System.out.println("Sorry, no slots available.");
	                continue;
	            }

	            for (int i = 0; i < availableSportSlots.size(); i++) {
	                System.out.println((i + 1) + ". " + availableSportSlots.get(i));
	            }

	            
	            System.out.print("Select a slot (1-" + availableSportSlots.size() + "): ");
	            int slotChoice = scanner.nextInt();
	            scanner.nextLine();  

	            if (slotChoice < 1 || slotChoice > availableSportSlots.size()) {
	                System.out.println("Invalid slot choice.");
	                continue;
	            }

	            
	            String bookedSlot = availableSportSlots.remove(slotChoice - 1);  // Remove the booked slot

	         
	            System.out.println("Success! " + name + ", your booking for " + chosenSport + " at " + bookedSlot + " is confirmed.");

	            
	            if (allSlotsBooked()) {
	                System.out.println("All slots have been booked. Exiting the program.");
	                break;
	            }

	           
	            System.out.print("Press Enter to book for another user or type 'exit' to terminate: ");
	            String userInput = scanner.nextLine();
	            if (userInput.equalsIgnoreCase("exit")) {
	                break;
	            }
	        }

	        scanner.close();
	    }

	    
	    private static void initializeSlots() {
	        availableSlots.put("Badminton", new ArrayList<>(Arrays.asList(
	            "9:00 AM - 10:00 AM", "10:00 AM - 11:00 AM", "11:00 AM - 12:00 PM", 
	            "12:00 PM - 1:00 PM", "1:00 PM - 2:00 PM", "2:00 PM - 3:00 PM", 
	            "3:00 PM - 4:00 PM", "4:00 PM - 5:00 PM", "5:00 PM - 6:00 PM", 
	            "6:00 PM - 7:00 PM"
	        )));
	        
	        availableSlots.put("Football", new ArrayList<>(Arrays.asList(
	            "9:00 AM - 9:30 AM", "9:30 AM - 10:00 AM", "10:00 AM - 10:30 AM", 
	            "10:30 AM - 11:00 AM", "11:00 AM - 11:30 AM", "11:30 AM - 12:00 PM", 
	            "12:00 PM - 12:30 PM", "12:30 PM - 1:00 PM", "1:00 PM - 1:30 PM", 
	            "1:30 PM - 2:00 PM", "2:00 PM - 2:30 PM", "2:30 PM - 3:00 PM", 
	            "3:00 PM - 3:30 PM", "3:30 PM - 4:00 PM", "4:00 PM - 4:30 PM", 
	            "4:30 PM - 5:00 PM", "5:00 PM - 5:30 PM", "5:30 PM - 6:00 PM", 
	            "6:00 PM - 6:30 PM", "6:30 PM - 7:00 PM"
	        )));
	        
	        availableSlots.put("Box Cricket", new ArrayList<>(Arrays.asList(
	            "9:00 AM - 11:00 AM", "11:00 AM - 1:00 PM", "1:00 PM - 3:00 PM", 
	            "3:00 PM - 5:00 PM", "5:00 PM - 7:00 PM"
	        )));
	    }

	   
	    private static boolean allSlotsBooked() {
	        for (List<String> slots : availableSlots.values()) {
	            if (!slots.isEmpty()) {
	                return false;  
	            }
	        }
	        return true;  
	    }
	}



