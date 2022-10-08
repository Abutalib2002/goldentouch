package Assignment1;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;
import java.util.Scanner;
public class Dateutil {
	public static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 

	public static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}; 
public static void main(String[] args) {
	System.out.println(isLeapYeaer(2002));
	System.out.println(isValid(2012, 2, 29));
	System.out.println(getdayOfTheWeek(1982, 4, 24));
	System.out.println(print(4,2 , 1882));
	System.out.println("done");
}
public static String print(int date,int month,int year) {
	System.out.println();
	System.out.print(getdayOfTheWeek(year, month, date));
	System.out.print(" ");
	System.out.print(date);
	System.out.print(" ");
	System.out.print(strMonths[month]);
	System.out.println("\n");
	return "done";
}

	public static boolean isLeapYeaer(int year)
	{
		boolean leapYear;
		
		if(year %4 == 0) {
			leapYear = true;

		System.out.println(year + "   This year   is leap year");
		}else if( year %100 != 0) {
			
			leapYear = true;
			
			System.out.println(year + "  This year is leap year");
		}
		
		else if ( year %400 == 0)
		{
			
			leapYear = true;
			
			System.out.println(year +"  This year is leap year");
			
		}
		else {
			
			leapYear = false;
		
		System.out.println(year + "  This year is leap year");
		}
		
		return leapYear;
	}
	
	
	public static boolean  isValid(int date,int month ,int year) {
		
		 int MAX_YEAR = 9999;
		int MIN_YEAR = 1800;
		if (year > MAX_YEAR || year < MIN_YEAR ) {
			return false;
		}
		if(month < 1 || month > 12) {
			return false;
		}
		if (date < 1 ||  date > 31) {
			return false;
		}
		// handle february month
		
		
		if(month == 2) {
			if (isLeapYeaer(year)) {
				return (date <= 29 );
			}
		
			else {
				return ( date <= 28);
			}
		}
		
		
		
		return true;
	}
	
	
	
public static String getdayOfTheWeek (int year,int month,int day) {
	Calendar cal = Calendar.getInstance();
	
	int dayNumber = cal.get(Calendar.DAY_OF_WEEK); 
	String[] calendarDays = { "Sunday", "Monday", "Tuesday", 
	"Wednesday", "Thursday", "Friday", "Saturday" }; 
	
	String dayName = calendarDays[dayNumber - 1];
	System.out.println( calendarDays[dayNumber - 1]);	
	
	return  dayName ;
}
}
