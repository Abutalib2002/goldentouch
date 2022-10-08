package Assignment1;
import java.util.Scanner;
public class OddEvenTest {
public static void main(String[] args) {
	int CheckNumber;
	Scanner scan= new Scanner (System.in);
	System.out.println("ENTER THE NUMBER TO CHECK ODD OR EVEN: ");
CheckNumber = scan.nextInt();
scan.close();
isOdd(CheckNumber);



}
public static boolean isOdd(int number) {
boolean Returmvalue;
	if (number%2 == 0) {
		Returmvalue = true;
		System.out.println("ENTER NUMBER IS EVEN: " + number);
	}else {
		Returmvalue = false;
		System.out.println("ENTER NUMBER IS ODD: " +number);
	}
	
	
	
	return Returmvalue;
	
}
}
