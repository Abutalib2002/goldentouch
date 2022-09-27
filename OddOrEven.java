package SecondLabbook;
import java.util.Scanner;

public class OddOrEven {
public static void main(String[] args) {
	int num1;
	System.out.println("Enter the number to check odd or event:  ");
	Scanner scan = new Scanner (System.in);
	num1 = scan.nextInt();
	/*
	 * get number from user;
	 * and give to condition checking
	 * check odd or even return as odd number and even number
	 */
if(num1 %2 == 0)
	
	System.out.println("Entered number is even");
else 
	System.out.println("Entered number is odd");
	scan.close();
}
}
