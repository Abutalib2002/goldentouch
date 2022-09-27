package SecondLabbook;
import java.util.Scanner;
public class Areaoftraingle {
public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the value for length:  ");
	    double length = scan.nextDouble();
	    System.out.println("Enter the value for width:  ");
	    double width = scan.nextDouble();
	    // Area of triangle
	    double area = length*width;
	    System.out.println("Area of traingle :  " + area);
	    
	    scan.close();
}
}
