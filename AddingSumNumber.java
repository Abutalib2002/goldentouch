package JavaSession;
import java.util.Scanner;

public class AddingSumNumber {
	
public static void main(String[] args) {
	
	int num1,num2,num3,num4,num5,total;
	Scanner scan =  new Scanner (System.in);
	System.out.println("Enter the Number 1:");
	num1 = scan.nextInt();
	System.out.println("Enter the Number 2:");
	num2 = scan.nextInt();
	System.out.println("Enter the Number 3:");
	num3 = scan.nextInt();
	System.out.println("Enter the Number 4:");
	num4 = scan.nextInt();
	System.out.println("Enter the Number 5:");
	num5 = scan.nextInt();
	total = num1+num2+num3+num4+num5;
	System.out.println("The total number is:" + total);
	scan.close();
}
}
