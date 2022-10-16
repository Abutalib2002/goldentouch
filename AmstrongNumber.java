package JavaExercise;
import java.util.Scanner;
public class AmstrongNumber {
	
	
	
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
System.out.println("Enter the number: ");
int number = scan.nextInt();
Checking(number);


scan.close();
}


public static void Checking(int num) {

	if(IsAmstrong(num)) {
	System.out.println("Amstrong Number....");	
	}
	
	
	else if(IperfectNumber(num))
	{
		System.out.println("Its a perfect number..");
	}
	
	else if (PalindromeNumber(num))
    {
    	System.out.println("its a  palindrome........");
    }
	else
	{
		System.out.println("Entered number is Not a Amstrong Not a perfect Number Not palindrome");
	}
 
}
public static boolean IsAmstrong(int checknumber)
{
	int temp ,sum = 0,digit =0,last = 0;
	temp = checknumber;
	
	while(temp > 0)
	{
		temp = temp /10;
		digit++;
	}
	
	temp = checknumber;
	
	while(temp > 0)
	{
		
		last = temp%10;
		sum += Math.pow(last, digit);
		
		temp = temp / 10;
		
	}
	if (checknumber == sum)
	{
		return true;
	}else {

return false;}
}



public static boolean IperfectNumber(int checknumber)
{
	int sum =0;
	boolean TrueOrFalse = false;
	int limit = checknumber/2;
	for(int i =1;i<limit;i++)
	{
		if(checknumber % i == 0)
		{
			sum+=i;
			TrueOrFalse = true;
		}
	}
	
	return TrueOrFalse;
}


public static boolean PalindromeNumber(int checknumber)
{


	int temp,reminder = 0,reverse = 0;
	temp = checknumber;
	while(temp > 0)
	{
		reminder = temp %10;
		reverse = (reverse*10) + reminder;
		temp = temp/10;
	}
	if(temp == checknumber)
	{
		return true;
	}
	else
	{
		return false;
	}
	
	
	
	
}
}