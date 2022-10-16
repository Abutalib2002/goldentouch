package JavaExercise;
import java.util.Scanner;
public class NumberToWords {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the number:  ");
	int number = scan.nextInt();
	
	if(number <0 || number>999)
	{
		System.out.println("Enterd number is invalid :");
	}
	else {
	numtowords(number);
	}
	scan.close();
}

public static void numtowords(int num) {
	// intializing the variable called  temp to store num valuw
	int temp = num;
//to get the last number;
 int unit = temp % 10;
 int tens = num/10;
 int tensoftens = tens%10;
 int hundreds = num /100;
 
 String  ones[] = {"","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","ELEVEN","TWELVE","THIRTEEN","FOURTEEN","FIFTEEN","SIXTEEN","SEVENTEEN","EIGHTEEN","NINETEEN"}; 
String ten[] = {"","","TWENTY","THIRTY","FORTY","FIFTY","SIXETY","SEVENTY","EIGHTY","NINETY"} ;
 	String hundred = "HUNDRED";
 	
if(temp <20)
{System.out.println();
	System.out.println(ones[temp]);
}
else if(temp <100)
{
	System.out.println(ten[tensoftens] +" "+ones[unit]);
}

else 
{
	System.out.println(ones[hundreds] + " " +hundred + " " + ten[tensoftens] + " " +ones[unit]);
}
}
}
