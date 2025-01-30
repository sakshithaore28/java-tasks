package oops;

public class AreaNPerimeterOfShapes {
public static void main(String[] args) {
	Shape circle = new Circle(5);
    Shape triangle = new Triangle(3, 4, 5, 4, 3);
     Shape square = new Square(4);
     
     System.out.println("Circle");
     System.out.println("Area: " + circle.area());
     System.out.println("Perimeter: " + circle.perimeter());
     
     
     System.out.println("\nTriangle:");
     System.out.println("Area: " + triangle.area());
     System.out.println("Perimeter: " + triangle.perimeter());

     System.out.println("\nSquare:");
     System.out.println("Area: " + square.area());
     System.out.println("Perimeter: " + square.perimeter());
     
	
} 
}
