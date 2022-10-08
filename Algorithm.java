package Assignment1;
import java.util.Scanner;
public class Algorithm {
public static void main(String[] args) {
	int arr[];
	int hai;
	Scanner scan = new Scanner (System.in);
	
	System.out.println("Enter the size: ");
	int size = scan.nextInt();
	arr = new int[size];
	
	for(int i = 0 ; i< arr.length;i++) {
		System.out.println("Enter the array elements: " + i + ": ");
		arr[i] =scan.nextInt();
	}
	System.out.println("Enter the that you want to found: ");
	int forSearch = scan.nextInt();
	LinearSearch(arr, forSearch);
	LinearSearching(arr, forSearch);
	
}


public static boolean LinearSearch(int array[],int key) {
	boolean yes = false;
	for(int found:array) {
		if(key == found) {
			yes = true;
		}
	}
	if(yes)
	{
		System.out.println("Found the key");
		return true;
	}
	else {
		System.out.println(" Not Found the key");
		return false;
	}
}
public static int LinearSearching(int array[],int key) {
	boolean yes = false;
	for(int found:array) {
		if(key == found) {
			yes = true;
		}
	}
	if(yes)
	{
		System.out.println("Found the key");
		return 1;
	}
	else {
		System.out.println(" Not Found the key");
		return 0;
	}
}
}
