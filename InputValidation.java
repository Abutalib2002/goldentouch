package Assignment1;
import java.util.Scanner;
public class InputValidation {
public static void main(String[] args) {
	int number1;
	boolean isValid;
	isValid = false;
	Scanner scan = new Scanner (System.in);
	do {
		System.out.println("Enter the number : ");
		number1 = scan.nextInt();
		
		if (number1>0&&number1<10 || number1>90&&number1<100) {
			isValid = true;
			
		}
		else {
			System.out.println(" INVALID INPUT, TRY AGAIN");
		}
	}while (!isValid);
	System.out.println("YOU ENTERED NUMBER IS : " + number1);
	
	
	
	
	
	
	
	
}
}
