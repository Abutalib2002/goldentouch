package Assignment1;
import java.util.Scanner;
public class PrintArray {
public static void main(String[] args) {
	final int NUM_ITEMS;
	int[] items;
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter the items:  ");
	NUM_ITEMS =  scan.nextInt();
	
	items = new int[NUM_ITEMS];
	if (items.length>0) {
		System.out.println("Enter the value sseparated by spaces");
		for (int i = 0 ; i<items.length;++i) {
		items [i] = scan.nextInt();
		
		}
	}
	 
	for(int i = 0;i<items.length;++i) {
		if (i == 0) {
			
			System.out.print("["+items[i]);
		}
		else {
			System.out.print(","+items[i]);
		}
	}
	
	System.out.print("]");
	
	
	
	
	scan.close();
}
}
