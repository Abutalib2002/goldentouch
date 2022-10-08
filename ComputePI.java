package Assignment1;

public class ComputePI {
public static void main(String[] args) {
	double sum = 0.0;
	int MAX_DENOMINATOR = 1000;
	for (int denominator = 1; denominator <= MAX_DENOMINATOR;denominator += 2) {
		// checking condition
		if (denominator % 4 == 1) {
			sum += denominator;
		}else if (denominator %4 == 3) {
			sum -= denominator;
		}
		else {
			System.out.println("Impossible!!1");
		}
	}
	
	
	System.out.println("The sum is : "+ sum);
}
}
