package JavaExercise;
import java.util.Scanner;
public class printingdayasinmonth {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the month to check days:  ");
	int month = scan.nextInt();
	
	switch(month)
	{
	case 1: {
		System.out.println("jan - 31 days");
	}break;
	case 2: {
		System.out.println("for feb month check leap year:   ");
System.out.println();
		System.out.println("Enter the current year: ");
		int year = scan.nextInt();
		if(year %4 == 0 && year%400 == 0 && year!= 0)
		{
			System.out.println("feb - 29 days in this year");
		}
		else
		{
			System.out.println("feb - 28 days in this year");
		}
		
	}break;
	case 3: {
		System.out.println("march - 31 days");
	}break;
	case 4: {
		System.out.println("Apr - 30 days");
	}break;
	case 5: {
		System.out.println("may - 31 days");
	}break;
	case 6: {
		System.out.println("jun - 30 days");
	}break;
	case 7: {
		System.out.println("jul - 31 days");
	}break;
	case 8: {
		System.out.println("aug - 31 days");
	}break;
	case 9: {
		System.out.println("sep - 30 days");
	}break;
	case 10: {
		System.out.println("oct - 31 days");
	}break;
	case 11: {
		System.out.println("nov - 30 days");
	}break;
	case 12: {
		System.out.println("dec - 31 days");
	}break;
	
	
	
	
	
	
	
	
	}
	
	
	
	
	scan.close();
}
}
