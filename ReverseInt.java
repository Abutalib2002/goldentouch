package Assignment1;
import java.util.Scanner;
public class ReverseInt {
public static void main(String[] args) {
	int number1;
	int Digits = 0;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the that you want to reverse:  ");
number1 = scan.nextInt();
System.out.println("THE NUMBER IS : "  + number1);
while(number1 > 0) {
	Digits = number1%10;
	System.out.println("THE DIGITS ARE : " + Digits);
	
	number1/= 10;
	
}

System.out.println("THANK YOU!...");
scan.close();
}
}
