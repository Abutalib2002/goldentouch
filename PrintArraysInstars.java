package Assignment1;
import java.util.Scanner;
public class PrintArraysInstars {
public static void main(String[] args) {
	final int NUM_ITEMS;
	int []items;
	//decalring variabes
	
	 Scanner scan = new Scanner (System.in);
	 
	 System.out.println("Enter the number: ");
	 NUM_ITEMS = scan.nextInt();
	 
	 items = new int [NUM_ITEMS];
	 System.out.println("Enter the values of array: ");
	 for (int i = 0; i<items.length;++i) {
		 
		 items[i] = scan.nextInt(); 
		 System.out.print
		 (i  + ": ");
		 for (int j = 1; j<= items[i];++j) {
			 System.out.print("*");
		 }
	 }
	 
	 scan.close();
}
}
