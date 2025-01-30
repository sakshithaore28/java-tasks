package oops;

public class PhoneBook {
	public static void main(String[] args) {
		Contacts piu=new Contacts("piu thaore");
		
		piu.addPhoneNumber("123576");
		piu.addPhoneNumber("098765");
		
		
		System.out.println("info of piu");
		
		piu.displayContactInfo();
		
		
		 HomeContact bob = new HomeContact("bob");
	       bob.addPhoneNumber("555456");

	        WorkContact bobWork = new WorkContact("bob");
	        bob.addPhoneNumber("654863");
		
	        bob.displayContactInfo();
	}

}

