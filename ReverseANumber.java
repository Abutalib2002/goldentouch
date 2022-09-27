package SecondLabbook;
import java.util.Scanner;

public class ReverseANumber {
public static void main(String[] args) {
	int num = 0;
	int reversenum =0;
	// this statement will capture the input from user
	
	Scanner scan = new Scanner (System.in);
	 System.out.println("Enter your input here....");
	 //Storing value in num variable
	 num = scan.nextInt();
	 // giving input to the while loop
while(num!=0) {
	reversenum*=10;
	reversenum += num%10;
	num /= 10;
	
}

System.out.println("Reverse of input is :  " + reversenum);

	 scan.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
