package Assignment1;

public class SumOfRunningIntegerUsingWhileLoop {
public static void main(String[] args) {
	int sum = 0;
	int LOWERBOUND = 0,UPPERBOUND = 100,number = LOWERBOUND;
	// THE ABOUVE CODE DEFINING THE VARIABLES 
	
	
	
	// USING WHILE LOOP TO FINDING THE SUM
	
	
	while (number <= UPPERBOUND) {

		// giving number value to add with sum value
		sum = sum + number ;
		
		// Increment the number
		++ number;
		
	}
	
	// the following code defines average of sum number 
	double average = (double) sum / 100;
	
	
	// printing sum value
	System.out.println("The sum of running integer is :  " + sum);
	
	
	// printing average
	
	System.out.println("The average of given sum is : " + average);
	
	
	}
}

