package Labcard;

import java.util.Scanner;

public class JAVA_LabCard_1_Week_PRIME_NUMBERS {

	public static  void
	CheckingPrime(int number  ) {
		boolean bool = true;
		int temp = number;
		for(int i = 2;i <= temp / 2;i++)
		{
			int dump = temp % i;
			
		if (dump == temp) {
			bool = false;
		break;
		}
		}
		
		if (bool)
		{
			System.out.println("The given number " + number + " is prime");
		}
		else
		{
			System.out.println("The given number " + number + " is not prime");
		}
	
	
	}
	
	public static void main(String[] args) {
		System.out.println("enter the number to find prime or not : ");
		Scanner scan = new Scanner (System.in);
		int num = scan.nextInt();
		
		CheckingPrime(num);
	}
}
