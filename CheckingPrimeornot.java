package JavaExercise;
import java.util.Scanner;
public class CheckingPrimeornot {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number to check prime or not: ");
	int num = scan.nextInt();
	int dump;
	boolean ama = true;
	for(int i = 2;i<= num/2;i++)
	{
		dump = num%i;
		if(dump == num) 
		{
			ama = false;
			break;
		}
	}
	if(ama)
	{
		System.out.println("The "+num+" is Prime" );
	}
	else
	{
		System.out.println("The "+num+" is Not Prime" );
	}
	scan.close();
}
}
