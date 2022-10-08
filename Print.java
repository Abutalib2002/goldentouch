package Assignment1;
import java.util.Scanner;

public class Print {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	int arr[];
	int value;
	System.out.println("Enter the index value:");
	value = scan.nextInt();
	arr = new int[value];
	System.out.println("enter the array value: ");
	for(int i = 0; i<arr.length; i++) {
		arr[i] = scan.nextInt();
	}
	prints(arr);
	
	scan.close();
	
}
public static void prints(int []array) {
	
	for (int i = 0;i<array.length;i++)
	{
if (i == 0) {
			
			System.out.print("["+array[i]);
		}
		else {
			System.out.print(","+array[i]);
		}
		
	}
	System.out.print("]");
}
}
