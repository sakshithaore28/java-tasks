package oops;

public class Triangle extends Shape{

	private double a,b,c,base,height;
	
	public Triangle(double a,double b,double c,double base,double height ) {
		
		this.a=a;
		this.b=b;
		this.c=c;
		this.base=base;
		this.height=height;
		
		
	}
	
	public double area() {
	        return 0.5 * base * height;
	    }
	  public double perimeter() {
	        return a + b + c;
	    }
}
