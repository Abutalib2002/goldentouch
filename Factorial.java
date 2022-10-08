package Assignment1;

public class Factorial {
public static void main(String[] args) {
	int maxNumber = 20;
	
	// declaring factorial to get long value instead of integer
	long factorial = 1;
	for (int i = 1; i<= maxNumber;i++) {
		factorial*=i;
	}
	System.out.println("THE FACTORIAL OF " + maxNumber + "IS : " + factorial);
}
}
