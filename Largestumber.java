package SecondLabbook;

public class Largestumber {
public static void main(String[] args) {
	double n1 = 3.5;
	double n2 = 4.5;
	double n3 = 1.3;
	if(n1>= n2 && n1>= n3)
		System.out.println(n1 + "  this is largest  number");

	else if(n2>= n1 && n2 >= n3)
		System.out.println(n2 + "  this is largest number ");
	else 
		System.out.println( n3+ "  this is largest number");
}
}
