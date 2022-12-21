package Labcard;

import java.util.Scanner;

public class numberheck {
public static void CheckingPrime(int num)
{
	int flag = 0;
	
	for(int i = 2 ; i < num ; i++)
{
		
if (num % i  == 0)
{
	System.out.println("The entered number is not Prime");
	flag ++;
	break;
}

}
	if (flag == 0)
	{
		System.out.println("The entered number is Prime");
	}

}


public static void CheckingAmstrong(int num) {
	int temp  = num;
	int res = 0 ,reminder;
	
	while(num > 0) {
		reminder = num%10;
		res = res + (reminder * reminder * reminder);
		num = num / 10;
	}
	if (res == temp)
	{
		System.out.println("The entered number is Amstrong");
	}
	else
	{
		System.out.println("The entered number is not Amstrong");
	}
}



public static void CheckingPalindrome(int num)
{
	int temp = num;
	int reverse = 10,rem;
	while( num  > 0)
	{
		rem = num % 10 ;
		
		reverse = reverse * 10 + rem;
	    num = num / 10;
	}
	
	if (reverse == temp)
	{
		System.out.println("Entered number is palindrome : ");
	}
	else
	{
		System.out.println("Entered number si not Palindrome : ");
	}
}


public static void CheckingPerfect(int num) 
{
  int p = 0;
  System.out.println("The factors are: ");
  
for (int i = 1; i < num ; i++){if (num % i == 0){p += i;System.out.println(i);}}
  if (p == num ) {System.out.println("The number is perfect");}
  else {System.out.println("The number is not perfect"); }
}
public numberheck(int num,int opt) {
	switch(opt)
	{
	case 1: CheckingPrime(num); break;
	case 2: CheckingAmstrong(num);break;
	case 3: CheckingPalindrome(num);break;
	case 4: CheckingPerfect(num);break;
	}
	}
public static void main(String[] args) {
	Scanner inn = new Scanner (System.in);
	int num;
	do {
	System.out.println("The options Are : ");
	System.out.println("1. Prime");
	System.out.println("2.Amstrong");
	System.out.println("3.Palindrome");
	System.out.println("4.perfect");
	
	System.out.println("Enter the option");
	int opt = inn.nextInt();
	System.out.println("Enter the number to check");
	num = inn.nextInt();
	
	new numberheck(num,opt);
	}while( num != 0);
}
}
