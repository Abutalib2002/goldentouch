package Assignment1;
import java.util.Scanner;
public class Contains {
public static void main(String[] args) {
	int aray[];
	
	Scanner scan = new Scanner(System.in);
	aray = new int[10];
	for (int i = 0 ; i<aray.length;i++) {
		System.out.print("ENTER THE ARRAY VALUE : " + i + " = ");
		aray[i] = scan.nextInt();
	}
	conatain(aray);
}
public static boolean conatain(int array[]) {

	int key;
	boolean milgaya = false;
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Enter the number that want to check whther present in array or not: ");
	key = scan.nextInt();
	for(int yes:array) {
		if(yes == key) {
			milgaya = true;
			break;
		}
	}
	if(milgaya) {
		System.out.println("ITS CONTAIN: " + key);
	}
	else {
		System.out.println("ITS NOT FOUND:  " + key);
	}scan.close();
	return milgaya;
}
}
