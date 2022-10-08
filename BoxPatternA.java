package Assignment1;
import java.util.Scanner;
public class BoxPatternA {
public static void main(String[] args) {
	int size;
	Scanner scan = new Scanner (System.in);
	System.out.println("ENTER THE SIZE: ");
	size = scan.nextInt();
	for (int row = 1; row <= size; row++) {
		for (int col = 1 ; col <= size; col++) {
			if(row == 1 || row == size || row == col || col == size)
				System.out.print("# ");
			else
				System.out.print(" ");
		}
		System.out.println();
	}
	
	scan.close();

}
}
