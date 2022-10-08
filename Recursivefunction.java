package Assignment1;

public class Recursivefunction {
public static void main(String[] args) {
System.out.println("The factorial of 6 is " + factorial(6));	
}
public static int factorial(int n) { 
	 if (n == 0) { 
	 return 1; // base case
	 } else { 
	 return n * factorial(n-1); // call itself
	 } 
	 // or one liner 
	 // return (n == 0) ? 1 : n*factorial(n-1); 
	} 

}
