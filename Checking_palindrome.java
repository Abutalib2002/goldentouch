package MathSolution;

import java.util.Scanner;

public class Checking_palindrome {
public Checking_palindrome(String check_value) {
	int length;
	String Reverse;
	String value;
	Scanner sc = new Scanner(System.in);
	value = check_value;
	Reverse = "";
	length = value.length();
	
	for(int i = length - 1;i >= 0 ; i--) {
		Reverse += value.charAt(i);
	}
	if(Reverse.equals(value)) {
		System.out.print( "\n\n\t\t\t\t\t\t\t\t\t"+ "   Given value   "+ value +" is Palindrome ");
	}
	else {
		System.out.print( "\n\n\t\t\t\t\t\t\t\t\t"+ "    Given value   "+ value + "   is not a Palindrome ");
	}

}
}
