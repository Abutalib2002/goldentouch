package JavaSession;

public class RunningByMOdProductSum {
public static void main(String[] args) {
	final int LOWERBOUND = 1;
	final int UPPERBOUND = 10;
	int sum =1;
	int number = LOWERBOUND;
	
	while(number<=UPPERBOUND) {
		sum*=number;
		++number;
	}
	
System.out.println("The sum from  " + LOWERBOUND +" to " + UPPERBOUND + "  is: " + sum);
}
}
