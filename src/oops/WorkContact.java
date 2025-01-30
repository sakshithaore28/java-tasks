package oops;

public class WorkContact extends Contacts {
	 public WorkContact(String name) {
	        super(name);
	    }

	 public void addPhoneNumber(String phoneNumber) {
	        super.addPhoneNumber("Work: " + phoneNumber);
	    }

}
