package Assignment1;
import java.util.Scanner;

public class AverageWithInputValidation {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	final int NUM_STUDENT = 3;
	int numberIn;
	boolean isValid;
	int sum = 0;
	double average;
	for (int studentno = 1 ; studentno <= NUM_STUDENT;++studentno) {
		System.out.println("Enter the mark (1-100): ");
		numberIn = scan.nextInt();
		isValid = false;
		do {
			
	if(numberIn>0&&numberIn<100) {
		isValid = true;
	}		
	
	else{
		System.out.println("Invalid input");
	}
	
			}while(!isValid);
		
		 
		 
		sum += numberIn;	 
	}
	
	 average = sum/100;
	System.out.println("THE AVERAGE IS : " + average);
	
	scan.close();
			
}
}
