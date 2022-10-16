package JavaExercise;
import java.util.Scanner;
public class CalculatingAgeDays {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Enter the current year: ");
	int Current_year = scan.nextInt();
	
	System.out.println("Enter the Birth year:  ");
int Birth_year = scan.nextInt();

System.out.println("Your Age is: " + Age( Birth_year,Current_year));
System.out.println("your Age in Month is : " + AgeInMonths(Birth_year, Current_year));
	System.out.println("Your Age in Days is : " + AgeIndays(Birth_year, Current_year));
	System.out.println("We won......Abu.....");
	
	
	scan.close();
}



public static int  Age(int current_year,int born_year) {
	
 int age =  born_year - current_year;
return age;
}



public static int  AgeInMonths(int currentYear,int birthYear) {
	int MonthsInAge;
	int Age = birthYear -currentYear;
	int Totalmonths = 12;
	MonthsInAge = Age * Totalmonths;
	return MonthsInAge;
	
}


public static int  AgeIndays(int CurrenYear,int BirthYear) {
	int monthDays;
	int Age = BirthYear-CurrenYear;
	int AgeinMonth = Age*12;
	monthDays = AgeinMonth * 30;
	monthDays += 8;
	for(int i = BirthYear;i<=CurrenYear;i++)
	{
		if(IsLeapYear(i))
		{
			monthDays -= 3;
		}
		else
		{
			monthDays -= 2;
		}
	}
	
	return monthDays;
}
public static boolean  IsLeapYear(int year) {
	boolean isit = false;
	if(year%4 == 0 || year%100 != 0 || year%400 == 0 )
	{
		isit =true;
	}
	else 
	{
	  isit =  false;
	}
	
	return isit;
}
}
