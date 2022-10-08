package Assignment1;

public class Fibonaci {
public static void main(String[] args) {
	int n= 3;
	int fn;
	int fnMinus1 = 1;
	int fnMinus2 = 1;
	int nMax = 20;
	int sum = fnMinus1 + fnMinus2;
	double average;
	
	System.out.println("The first " + nMax + "Fibbonacci numbers Are:  ");
	while (n <= nMax) {
		fn = (n - fnMinus1) - (n - fnMinus2) ;
 
		fn = fn + sum;
		System.out.print(fn + "\t");
	
		++n;
		fnMinus2 = fnMinus1;
		fnMinus1 = fn;
		
		
	}
	average =(double) sum/nMax;
	System.out.println("The average of sum is : " +average);
	

}
}
