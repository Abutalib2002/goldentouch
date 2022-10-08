package Assignment1;
import java.util.Scanner;

public class SumProductMinMax3 {
public static void main(String[] args) {
	int number1;
	int number2;
	int number3;
	int sum;
	int product;
	
	Scanner scan = new Scanner (System.in);
	System.out.print("Enter the first integer: ");
	number1 = scan.nextInt();
	System.out.print("\n" + "Enter the Second Integer: ");
	number2 = scan.nextInt();
	System.out.print
	("\n" + "Enter the Third integer: ");
	number3 = scan.nextInt();
	sum = number1 + number2 + number3;
	product = number1*number2 * number3;
	System.out.println("The sum of the given integer: " + sum);
	System.out.println("The product  given integer : "+ product);
	int min;
	int max;
	min = number1;
	max = number1;
	if(number2<min) {
		min = number2;
		
	}
	if (number3< min) {
		min = number3;
	}
	if(number2 > max) {
		max = number2 ;
	}
	if(number3 > max) {
		 max = number3;;
		
	}
	System.out.println("The  minamal number given Intiger :  " + min);
	System.out.println("The maximum number of given intger : " + max);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	scan.close();
	
}
}
