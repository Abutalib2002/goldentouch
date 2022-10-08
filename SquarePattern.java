package Assignment1;
import java.util.Scanner;
public class SquarePattern {
public static void main(String[] args) {
	int size ;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the size: " );
	size = scan.nextInt();
	for (int row =1;row<=size;row++) {
		for(int col = 1 ;col <= size;col++) {
		System.out.print("# ");	
		}
		System.out.println();
	}
	
	
	
	scan.close();
}
}
