package SecondLabbook;
import java.util.Scanner;
public class AreaOfSquare {
public static void main(String[] args) {
	Scanner scan  = new Scanner (System.in);
	System.out.println("Enter the side of Square");

// capture value in side variable
	
	
	double side = scan.nextDouble();
	double area = side * side ;
	System.out.println("Area of Square:  " + area);



scan.close();

}
}
