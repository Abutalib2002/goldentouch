package SecondLabbook;
// import Scanner object
import java.util.Scanner;
public class Basic2 {
public static void main(String[] args) {
	// declaring scanner object
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the Value of i:  ");
	int i = scan.nextInt();
	System.out.println("Enter the Value of j:  ");
	int j = scan.nextInt();
	int mul = i*j;
	System.out.println("Multiplication of i and j is : " + mul);
	
	scan.close();
	
}
}
