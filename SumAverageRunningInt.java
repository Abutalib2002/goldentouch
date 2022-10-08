package Assignment1;

public class SumAverageRunningInt {
public static void main(String[] args) {
	// Defining Variable
	int sum = 0;
	double average;
	final int LOWERBOUND =1;
	final int UPPERBOUND = 100;
	//USING FOR LOOP TO ADDING NUMBERS 
	for (int number = LOWERBOUND; number <= UPPERBOUND ;++number){
		// the loop indexing number = 1,2,3,4,5,6,7,8,9
		sum += number ;
		
	}
	
// finding average of the sum 
	average = (double)sum/100;
	
	
	// printing sum
	System.out.println("the value of sum " + sum);
// printing average
	
	System.out.println("the average of the given output is :  " + average);
	
	
	
	
	
	
} 
}
