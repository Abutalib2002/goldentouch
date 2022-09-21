package JavaSession;

public class RunningNumberMod7sum {
public static void main(String[] args) {
	final int LOWERBOUND = 7;
	final int UPPERBOUND = 1000;
	int sum =0;
	int number = LOWERBOUND;
	
	while(number<=UPPERBOUND) {
		sum+=number;
		number += 7;
	}
	
System.out.println("The sum from  " + LOWERBOUND +" to " + UPPERBOUND + "  is: " + sum);
}
}
