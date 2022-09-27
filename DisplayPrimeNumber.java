package SecondLabbook;
import java.util.Scanner;
public class DisplayPrimeNumber {
public static void main(String[] args) {
	// variables 
	int i =0;
	int num = 0;
	/// empty string
	String Primenumber = "  ";
	for (i = 1;i<=100;i++) {
		int counter = 0;
		for (num = i; num >= 1; num--) {
			if(i%num == 0) {
				counter = counter + 1;
				
					
			}
			
		}
		if(counter == 2) {
			// append prime number to string
			Primenumber = Primenumber + i + " " ;
		}
	}

System.out.println("prime nnumber from 1 to 100 are:");
System.out.println(Primenumber);

}



}
