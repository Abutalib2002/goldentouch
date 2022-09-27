package SecondLabbook;
// Importing scanner collection from java utility Scanner parts
import java.util.Scanner;
public class PrintingNumbers {
public static void main(String[] args) {
	// Create new reader instance which take  input from user
	Scanner reader = new Scanner (System.in);
	
	System.out.println("Enter the number:  ");
	
	// nextInt() reads the integer value from user
	
	int number = reader.nextInt();
	// println () prints following line to outputscreen
	System.out.println("You entere number is :  "+ number);
	// when ever you use the scanner you have to close that scanner by giving following method
	reader.close();
	
}
}
