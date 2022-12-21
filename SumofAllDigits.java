package CodeDays;

public class SumofAllDigits {
static void SumOfDigits(int Number) {
	
	// Lets copy the number from parameter into local Variable
	int CopyOfNumber = Number;
	// intializing Another Local Variable
	int Sum = 0;
	
	// Using while looping to sum of diogits
	while(CopyOfNumber != 0) {
		
		// Geting LastDigit of Number
		
		int LastDigit = CopyOfNumber % 10;
		
		// Adding Last Digits to sum 
		
		Sum += LastDigit;
		// Removing Last Digits From number
		
		CopyOfNumber /= 10;
	}
	// printing Sum 
	
	System.out.println("The entered Number is : " + Number + " And The number of Digits are : " + Sum);
}

public static void main(String[] args) {
	SumOfDigits(159);
	System.out.println();
	SumOfDigits(659);
	System.out.println();
	SumOfDigits(1458);
}
}
