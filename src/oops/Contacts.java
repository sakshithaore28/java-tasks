package oops;

import java.util.*;


public class Contacts {
	private String name;
	
	private List<String> phoneNumbers;

	
	public Contacts(String name)
	{
		this.name=name;
		this.phoneNumbers=new ArrayList<>();
	}
	public void addPhoneNumber(String phoneNumber) {
        phoneNumbers.add(phoneNumber);
    }
	
	 public void displayContactInfo() {
	        System.out.println("Contact Name: " + name);
	        System.out.println("Phone Numbers: ");
	        for (String number : phoneNumbers) {
	            System.out.println(number);
	        }
	    }
}
  