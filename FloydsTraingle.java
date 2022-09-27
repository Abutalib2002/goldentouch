package SecondLabbook;
import java.util.Scanner;
public class FloydsTraingle {
public static void main(String[] args) {
	int number=1 ,counter,j,rows;
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter the number to rows in floyid Traingle:  ");
	rows = scan.nextInt();
	System.out.println("Flyoids Traingle");
	System.out.println("************");
	for(counter = 1; counter<=rows; counter++) {
		for(j= 1; j<=counter;j++) {
			System.out.print(number+" ");
			number++;
			
		}
		System.out.println();
	}
	
	
	
	
}
}
