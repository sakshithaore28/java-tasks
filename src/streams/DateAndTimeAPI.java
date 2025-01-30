package streams;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;



public class DateAndTimeAPI {
	private static DateTimeFormatter current;
	public static void DnT() {
		LocalDate d=LocalDate.now();
		
		System.out.println("current date is "+d);
		
		LocalTime t=LocalTime.now();
		System.out.println("current date is "+t);
		
		LocalDateTime dt=LocalDateTime.now();
		
		System.out.println("current date and time is "+dt);
		DateTimeFormatter f= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String format = d.format(f);
		System.out.println(format+"    ed");
		 String formatedDateTime = current.format(dt); 
		
	}
	public static void main (String[] arg)
	{

		DateAndTimeAPI D= new DateAndTimeAPI();
		D.DnT();
		
	}


}
