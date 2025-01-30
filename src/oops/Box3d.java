package oops;

public class Box3d extends Box {
private double height;
public Box3d(double length,double height,double breadth)
{
	this.height=height;
	super(length,breadth);
}
public double volume() {
    return length * breadth * height;
}
public void display() {
    super.display();
    System.out.println("Height: " + height);
}
}
