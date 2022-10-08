package Assignment1;
import java.util.Scanner;
public class CheckHexStr {
public static void main(String[] args) {
	String inStr;
	int inStrLen;
	char inChar;
	boolean isValid;
	isValid = true;
	System.out.println("ENTER THE HEX: ");
	Scanner scan = new Scanner (System.in);
	inStr = scan.next();
	inStrLen =inStr.length();
	for (int i = 0;i<inStrLen;i++) {
		inChar = inStr.charAt(i);
		if(!(inChar >= '0' || inChar <= '9')|| (inChar >= 'A' && inChar <= 'F')|| (inChar >= 'a' && inChar <= 'f')) {
			isValid = false;
			break;
		}
	}
scan.close();
	
	System.out.println(isValid?" THIS IS VALID HEX STRING: "  + inStr:"THIS IS NOT VALID HEX STRING: " + inStr);


}
}
