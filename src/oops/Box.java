package oops;

public class Box {
	protected double length;
	protected double breadth;
	
	public Box(double length,double breadth)
	{
		this.length=length;
		this.breadth=breadth;
		
	}
	
	 public double area() {
	        return length * breadth;
	    }
	 public void display() {
	        System.out.println("Length: " + length);
	        System.out.println("Breadth: " + breadth);
	    }

}
