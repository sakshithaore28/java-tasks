package oops;

public class HomeContact extends Contacts {
	
	public HomeContact(String name) {
        super(name);
    }
	
	  public void addPhoneNumber(String phoneNumber) {
	        super.addPhoneNumber("Home: " + phoneNumber);
	    }
}
