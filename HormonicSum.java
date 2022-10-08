package Assignment1;

public class HormonicSum {
public static void main(String[] args) {
	//defining variables
	final int MAX_DENOMINATOR = 50000;
	// defining max denominator as constant
	
	double sumL2R = 0.0;
	double sumr2L = 0.0;
	double absDiff;
	 for (int denominator = 1; denominator <= MAX_DENOMINATOR;++denominator) {
		 sumL2R  = (double)1 + 1/denominator;
	 }
			System.out.println("The sum of left to right is : " + sumL2R);
			
			
			
	// for loop summing right to left 
			
			
			for (int denominator = MAX_DENOMINATOR; denominator >= 1;--denominator) {
				
			sumr2L = (double) 1 + 1/denominator;	
				
			}
			System.out.println("The sum from right to left is : " + sumr2L);
			
			
	// find abolute value {
			
absDiff = (sumL2R>sumr2L)?sumL2R:sumr2L;

System.out.println("The absolute diffrence is :  " + absDiff);
	
}
}
