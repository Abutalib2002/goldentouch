package CodeDays;
import java.util.Scanner;
public class Code4 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the String that you want convert reverse:");
	String str = sc.nextLine();
	char[] charArray = str.toCharArray();
	String str1 = "";
	for(int i = 0;i < charArray.length;i++) {
		if (charArray[i] != ' ' && charArray[i]!= '\t' ) {
			
			str1 =  str1 + charArray[i];
		}
		
	}
		System.out.println("The first String with Spaces : " +  str);
		System.out.println("The string with out spaces : " + str1);
		sc.close();
}
}
