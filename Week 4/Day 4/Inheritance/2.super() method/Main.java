
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
	public static void main(String args[]) throws Exception{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your choice:\n" + 
				"1.Exhibition event\n" + 
				"2.Stage event");
		
		int choice=sc.nextInt();
		sc.nextLine();
		
		if(choice==1) {
		System.out.println("Enter the details of exhibition:");
		String in=sc.nextLine();
		String[] dts=in.split(",");

		System.out.println("Enter the starting date of the event:");
		String sdate=sc.nextLine();
		System.out.println("Enter the ending date of the event:");
		String edate=sc.nextLine();
		
		String name= dts[0];
		String detail= dts[1];
		String type= dts[2];
		String ownerName=dts[3];
		double costPerDay=Double.parseDouble(dts[4]);
		int noOfStall=Integer.parseInt(dts[5]);
		
		Event e=new Event(name, detail, type, ownerName, costPerDay);
		
		double gst=(e.getCostPerDay())*(0.05);

	    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
	    java.util.Date firstDate = sdf.parse(sdate);
	    java.util.Date secondDate = sdf.parse(edate);

	    long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
	    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
		
		gst *= diff;
		System.out.println("The GST to be paid is Rs."+gst);
		}
		
		else if(choice==2) {
			System.out.println("Enter the details of stage event:");
			String in=sc.nextLine();
			String[] dts=in.split(",");

			System.out.println("Enter the starting date of the event:");
			String sdate=sc.nextLine();
			System.out.println("Enter the ending date of the event:");
			String edate=sc.nextLine();
			
			String name= dts[0];
			String detail= dts[1];
			String type= dts[2];
			String ownerName=dts[3];
			double costPerDay=Double.parseDouble(dts[4]);
			int noOfSeats=Integer.parseInt(dts[5]);
			
			Event e=new Event(name, detail, type, ownerName, costPerDay);
					
			double gst=(e.getCostPerDay())*(0.15);
			
			    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
			    java.util.Date firstDate = sdf.parse(sdate);
			    java.util.Date secondDate = sdf.parse(edate);

			    long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
			    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
				
				gst *= diff;
			System.out.println("The GST to be paid is Rs."+gst);
		}	
	}
}
