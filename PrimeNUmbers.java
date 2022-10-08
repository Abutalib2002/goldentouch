package Assignment1;
import java.util.Scanner;
public class PrimeNUmbers {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter the limit to print prime numbers");
	int UPPERLIMIT = 	scan.nextInt();
	int i, number, count; 
	
	System.out.println(" Prime Numbers from 1 to "+   UPPERLIMIT+" are : ");	
	for(number = 1; number <= UPPERLIMIT; number++)
	{
		count = 0;
	    for (i = 2; i <= number/2; i++)
	    {
	    	if(number % i == 0)
	    	{
	    		count++;
	    		break;
	    	}
	    }
	    if(count == 0 && number != 1 )
	    {
	    	System.out.println(number + " ");
	    }  
	}
}
}

