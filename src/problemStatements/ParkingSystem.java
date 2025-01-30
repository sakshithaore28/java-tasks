package problemStatements;
import java.io.*;
import java.util.*;

class ParkingSystem {
    
    static Map<Integer, String> basementB1 = new HashMap<>();  
    static Map<Integer, String> basementB2 = new HashMap<>();  
    static final int MAX_SLOTS = 30;  
    
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        
        initializeParkingSlots();

        
        while (true) {
            System.out.println("Enter vehicle details:");
            System.out.print("Enter vehicle type (bike/car): ");
            String vehicleType = scanner.nextLine().toLowerCase();

            if (!vehicleType.equals("bike") && !vehicleType.equals("car")) {
                System.out.println("Invalid vehicle type. Please enter 'bike' or 'car'.");
                continue;
            }

            System.out.print("Enter vehicle number: ");
            String vehicleNumber = scanner.nextLine();

            
            if (vehicleType.equals("bike")) {
                bookSlot(vehicleType, vehicleNumber, basementB1);
            } else if (vehicleType.equals("car")) {
                bookSlot(vehicleType, vehicleNumber, basementB2);
            }

            System.out.print("Do you want to park another vehicle? (yes/no): ");
            String choice = scanner.nextLine();
            if (choice.equalsIgnoreCase("no")) {
                break;
            }
        }

        scanner.close();
    }

   
    private static void initializeParkingSlots() {
        for (int i = 1; i <= MAX_SLOTS; i++) {
            basementB1.put(i, "Available");  
            basementB2.put(i, "Available");  
        }
    }

    
    private static void bookSlot(String vehicleType, String vehicleNumber, Map<Integer, String> basement) throws IOException {
        Map<Integer, String> availableSlots = getAvailableSlots(basement);

        if (availableSlots.isEmpty()) {
            System.out.println("Sorry, no slots available in the " + (vehicleType.equals("bike") ? "Bike" : "Car") + " basement.");
            return;
        }

        
        System.out.println("Available slots for " + (vehicleType.equals("bike") ? "bike" : "car") + ":");
        for (Integer slot : availableSlots.keySet()) {
            System.out.println("Slot " + slot);
        }

        
        System.out.print("Choose a slot to park your vehicle: ");
        Scanner scanner = new Scanner(System.in);
        int slot = scanner.nextInt();

        if (!availableSlots.containsKey(slot)) {
            System.out.println("Invalid slot. Please try again.");
            return;
        }

        
        basement.put(slot, vehicleNumber);

        
        String receipt = "Vehicle Type: " + vehicleType + "\nVehicle Number: " + vehicleNumber + "\nSlot Number: " + slot;
        System.out.println("Booking successful!");
        System.out.println(receipt);

      
        storeReceipt(receipt);
    }

    
    private static Map<Integer, String> getAvailableSlots(Map<Integer, String> basement) {
        Map<Integer, String> availableSlots = new HashMap<>();
        for (Map.Entry<Integer, String> entry : basement.entrySet()) {
            if (entry.getValue().equals("Available")) {
                availableSlots.put(entry.getKey(), entry.getValue());
            }
        }
        return availableSlots;
    }

  
    private static void storeReceipt(String receipt) throws IOException {
        File file = new File("parking_receipts.txt");
        FileWriter fileWriter = new FileWriter(file, true);  
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        
        
        bufferedWriter.write(receipt);
        bufferedWriter.newLine();
        bufferedWriter.write("--------------------------------------------------");
        bufferedWriter.newLine();
        
        bufferedWriter.close();
    }
}

