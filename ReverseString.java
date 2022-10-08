package Assignment1;
import java.util.Scanner;
public class ReverseString {
public static void main(String[] args) {
	 	 String inStr;
	 	 	int inStrLen;
	 	 	String rstr;
	 	 	Scanner scan = new Scanner (System.in);
	 	 	System.out.println("Enter the String: ");
	 	 	inStr = scan.next();
	 	 	inStrLen = inStr.length();
	 	 	for (int  charIdx = inStrLen - 1;charIdx >= 0;--charIdx) {
	 	 	
	 	 		 System.out.print(inStr.charAt(charIdx));
	 	 	
	 	 	}
	 	 
}
}
