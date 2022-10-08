package Assignment1;
import java.util.Scanner;

public class TrignometricSeries {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	int NumberTerms ,series;
	System.out.println("Enter the number terms to series:");
	NumberTerms = scan.nextInt();
	System.out.println("Enter the x value : ");
	series = scan.nextInt();
	
	System.out.println("THE VALUE OF X IS:  " + sin(series, NumberTerms));
	
	System.out.println("THE VALUE OF X IS:  " + cos(series, NumberTerms));
	
	
	scan.close();
}

public static double sin(double x,double nTerms) {
	int factorial;
	double sum =0;
	double s = 1;
	x = (double)(x*Math.PI/180);
	
	
	// finding sum of series
	
	for (int i = 1;i<nTerms;i++){
		factorial = 1;
		
		// finding the factorial
		
		
		for (int j = 1;j<=i;j++) {
			
			if(j%2 != 0) {
			factorial *=j;
			}
			
			// finding the sum of the  series
			
			sum = (sum+s*(Math.pow(x,i)/factorial));
			s = s*-1;
			
		}
				
		
		
	}
	
	
	
	
	return x;
}


public static double cos(double x,double Nterms) {
	
	
	double val = Math.PI/180;
	double ret = Math.cos(x*val);
	return x;
}
}
