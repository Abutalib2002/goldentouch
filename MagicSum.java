package Assignment1;
import java.util.Scanner;
public class MagicSum {
public static void main(String[] args) {
	
	Scanner scan = new Scanner (System.in);
	final int SENTINEL = -1;
	int number;
	System.out.println("Enter the postive integer or (-1 to end)");
	number = scan.nextInt();
	while(number != SENTINEL) {
		System.out.println("Enter the postive integer or (-1 to end)");
	number = scan.nextInt();
	
	
	}
		
	hasEight(number);
}

public static boolean hasEight(int n)
{
	int isEight;
	while(n != -1) {
		
		isEight = n%10;
		
		isEight = n/10;
	}
	System.out.println(n);
	return true;
}
}
