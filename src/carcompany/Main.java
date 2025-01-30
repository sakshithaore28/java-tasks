package carcompany;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CarCompany {
    private String companyName;
    private Map<String, Map<String, Integer>> carTypes;

    public CarCompany(String companyName) {
        this.companyName = companyName;
        this.carTypes = new HashMap<>();
    }

    
    public void addCar(String carType, String model, int quantity) {
        carTypes.putIfAbsent(carType, new HashMap<>());
        Map<String, Integer> models = carTypes.get(carType);
        models.put(model, models.getOrDefault(model, 0) + quantity);
    }

  
    public void displayInventory() {
        System.out.println("Inventory for " + companyName + ":");
        for (Map.Entry<String, Map<String, Integer>> entry : carTypes.entrySet()) {
            System.out.println("  " + entry.getKey() + ":");
            for (Map.Entry<String, Integer> model : entry.getValue().entrySet()) {
                System.out.println("    " + model.getKey() + " - Quantity: " + model.getValue());
            }
        }
    }

    
    public boolean buyCar(String carType, String model, int quantity) {
        Map<String, Integer> models = carTypes.get(carType);
        if (models != null && models.containsKey(model) && models.get(model) >= quantity) {
            models.put(model, models.get(model) - quantity);
            return true;
        }
        return false;
    }

    public String getCompanyName() {
        return companyName;
    }

    public Map<String, Map<String, Integer>> getCarTypes() {
        return carTypes;
    }
}

class User {
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    // Method to buy a car
    public void buyCar(CarCompany carCompany, String carType, String model, int quantity) {
        if (carCompany.buyCar(carType, model, quantity)) {
            System.out.println("Purchase successful! " + userName + " bought " + quantity + " of " + model + " " + carType + ".");
            carCompany.displayInventory();
            generateReceipt(carCompany, carType, model, quantity);
        } else {
            System.out.println("Sorry, insufficient stock for " + model + " " + carType + ".");
        }
    }

   
    private void generateReceipt(CarCompany carCompany, String carType, String model, int quantity) {
        String receiptText = "Receipt for " + userName + "\n";
        receiptText += "Car Company: " + carCompany.getCompanyName() + "\n";
        receiptText += "Car Type: " + carType + "\n";
        receiptText += "Car Model: " + model + "\n";
        receiptText += "Quantity Bought: " + quantity + "\n";

        
        File receiptsFolder = new File("receipts");
        if (!receiptsFolder.exists()) {
            receiptsFolder.mkdir();
        }

        try (FileWriter writer = new FileWriter("receipts/" + userName + "_receipt.txt")) {
            writer.write(receiptText);
            System.out.println("Receipt has been saved to 'receipts/" + userName + "_receipt.txt'.");
        } catch (IOException e) {
            System.out.println("An error occurred while generating the receipt.");
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
   
        CarCompany company = new CarCompany("Mercedes");

        // Add car models to the company
        company.addCar("SUV", "GLC 330D", 10);
        company.addCar("SUV", "GLE 220D", 8);
        company.addCar("SUV", "GLD 450", 5);
        company.addCar("Sedan", "E Class", 12);
        company.addCar("Sedan", "C Class", 7);
        company.addCar("Coupe", "530D", 4);
        company.addCar("Hatchback", "GLC 200", 6);

        
        company.displayInventory();

       
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user name: ");
        String userName = scanner.nextLine();
        User user = new User(userName);

        
        System.out.print("Enter car type (SUV, Sedan, Coupe, Hatchback): ");
        String carType = scanner.nextLine();
        System.out.print("Enter car model: ");
        String model = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        
        user.buyCar(company, carType, model, quantity);

        scanner.close();
    }
}

