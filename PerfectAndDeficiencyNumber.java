package Assignment1;
import java.util.Scanner;
public class PerfectAndDeficiencyNumber {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	
	
	int num;
	System.out.println("Enter the number to check perfect: ");
	num = scan.nextInt();	
	boolean result =Isperfect(num);
	if(result) {
		System.out.println("The given number is perfect");
	}
	else {
		System.out.println("The given number is not perfect");
	}
	boolean result1 = IsDeficient(num);
	if(result1) {
		System.out.println("The given number is deficency");
	}
	else {
		System.out.println("The given number is not deficency");
	}
	
	scan.close();
	
}
public static boolean Isperfect(int aponum) {
	boolean TrueOrNot = false;
	int sum = 0;
	for(int i =1	;i<= aponum/2;i++) {
		if(aponum%i == 0)
		{
			sum +=1;
			TrueOrNot = true;
		}
		
	

}
	return TrueOrNot;
}



public static boolean IsDeficient(int aponum1) {
	boolean TrueOrFalse = false;
	
	int sum =0;
	for(int i =1;i<Math.sqrt(aponum1);i++) {
		if(aponum1%i ==0)
		{
			if(aponum1/i == i) {
				sum+=i;
				TrueOrFalse = true;
			}
			else
			{
				sum+=i;
				sum+=aponum1/i;
				TrueOrFalse = false;
			}
		}
	}
	
	return TrueOrFalse;
}
}
