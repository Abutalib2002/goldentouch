package Assignment1;
import java.util.Scanner;
public class ArrayTostring {
public static void main(String[] args) {
	int arraynum[];
	int val;
	Scanner scan = new Scanner (System.in);
	System.out.println("ENTER THE ARRAY LENGHT VALUE");
	val  =  scan.nextInt();
	arraynum = new int[val];
	
	for(int i = 0;i<arraynum.length;i++) {
		System.out.print("ENTER ARRAY INDEX  "+i+"  ELEMENT:  ");
		arraynum[i] = scan.nextInt();
	}
	
	arrayToString(arraynum);
	scan.close();
}
public static String[] arrayToString (int[] array) {
int val2 = array.length;
Scanner scan = new Scanner (System.in);
String[]	arrayToString = new String[val2];
for(int i = 0;i<val2;i++) {
	System.out.println("ENTER THE STRING VALUE : ");
	arrayToString[i] = scan.next();
}
System.out.print("[");
	for(int i = 0;i<val2;i++) {
		System.out.print(arrayToString[i] + array[i] + ",");
	}
	System.out.print("");
	System.out.print("]");
	return arrayToString;	
}
}
