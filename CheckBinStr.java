package Assignment1;
import java.util.Scanner;
public class CheckBinStr {
public static void main(String[] args) {
	String inStr;
	int inStrLen;
	char inChar;
	boolean isValid;
	isValid = true;
	System.out.println("ENTER THE BINARY: ");
	Scanner scan = new Scanner (System.in);
	inStr = scan.next();
	inStrLen =inStr.length();
	for (int i = 0;i<inStrLen;i++) {
		inChar = inStr.charAt(i);
		if(!(inChar == '0' || inChar == '1')) {
			isValid = false;
			break;
		}
	}

	
	System.out.println(isValid?" THIS IS VALID BINARY STRING: "  + inStr:"THIS IS NOT VALID BINARY STRING: " + inStr);


}
}
