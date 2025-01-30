package oops;

public class BoxTask {
	public static void main(String[] args) {
		 Box box = new Box(5.0, 3.0);
	        System.out.println("2D Box:");
	        box.display();
	        System.out.println("Area: " + box.area());
	        
	        System.out.println("\n3D Box:");
	        
	        Box3d box3d = new Box3d(5.0, 3.0, 4.0);
	        box3d.display();
	        System.out.println("Area: " + box3d.area());
	        System.out.println("Volume: " + box3d.volume());
	        
	        
		
	}

}
