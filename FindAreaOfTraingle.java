package SecondLabbook;
import java.util.Scanner;

public class FindAreaOfTraingle {
public static void main(String[] args) {
	
	
	// creating input field
	Scanner scan = new Scanner(System.in);
	// asking user to enter value of radius 
	System.out.println("Enter the valuew of width");
	double base = scan.nextDouble();
	System.out.println("Enter the value of length");
	double hieght = scan.nextDouble();
	double area = base*hieght;
	System.out.println("area of Traingle:  " + area);
	scan.close();
	
	
	
	
	
	
}
}
