package Assignment1;
import java.util.Scanner;
public class Exponent {
public static void main(String[] args) {
	int exp;
	int base;
	System.out.println("Enter the base value:");
	Scanner scan = new Scanner(System.in);
	base = scan.nextInt();
	System.out.println("ENTER THE EXP VALUE: ");
	exp = scan.nextInt();
	
	System.out.println(base + " raises to the power of " + exp + "is: " + exponent(base, exp)); 
	
	
	scan.close();
}

public static int exponent(int base,int exp) {
	int product = 1;
	for(int i = 1;i<=exp;++i) {
		product *= base; 
	}
	
	
	return product;
}
}
