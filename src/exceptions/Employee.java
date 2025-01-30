package exceptions;

public class Employee {
	
	    private String name;
	    private int id;
	    private String address;

	    public Employee(String name, int id, String address) {
	        this.name = name;
	        this.id = id;
	        this.address = address;
	    }

	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getAddress() {
	        return address;
	    }
	
	}

