package Assignment1;

public class RecursivemethodToComputeFibonacciNumber {
public static void main(String[] args) {
	System.out.println("The fibonaci number of 6 is "+fibonacci(8)
			);
}
public static int fibonacci(int n) { 
	 if (n == 0) { 
	 return 0; 
	 } else if (n == 1) { 
	 return 1; 
	 } else { 
	 return fibonacci(n-1) + fibonacci(n-2); 
	 } 
	} 
}
