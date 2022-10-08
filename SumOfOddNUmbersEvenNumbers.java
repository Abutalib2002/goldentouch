package Assignment1;

public class SumOfOddNUmbersEvenNumbers {
public static void main(String[] args) {
	int sumOdd = 0,sumEven = 0,absDiff;
	for (int number = 0 ;number <= 10;++number)
	{
		if(number %2!=0 ) {
			sumOdd += number;
			
		}else {
			sumEven += number;
		}
		
	}	
	
	
	 absDiff = (sumOdd < sumEven)?  sumOdd:  sumEven;

System.out.println("The number is :  " + absDiff);
}


}
