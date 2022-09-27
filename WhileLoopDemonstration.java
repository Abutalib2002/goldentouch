package SecondLabbook;
import java.util.Scanner;

public class WhileLoopDemonstration {
public static void main(String[] args) {
	int number,sum = 0;
	Scanner scan = new Scanner(System.in);
	System.out.println("please enter the integer value below 10");
	number = scan.nextInt();
	while (number <= 10) {
		
		sum+=number;
		number++;
		
		
		
		
	}
	System.out.println("sum of the number from the while loop is :" + sum);
	
	scan.close();
	
	
	
	
}
}
