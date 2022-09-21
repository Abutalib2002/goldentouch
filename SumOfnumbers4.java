package JavaSession;

public class SumOfnumbers4 {
	public static void main(String[] args) {
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 1000;
		int sum =0;
		int number = LOWERBOUND;
		
		while(number<=UPPERBOUND) {
			sum+=number;
			number += 2;
		}
		
	System.out.println("The sum from  " + LOWERBOUND +" to " + UPPERBOUND + "  is: " + sum);
	}

}
