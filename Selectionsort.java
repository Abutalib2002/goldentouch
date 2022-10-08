package Assignment1;
import java.util.Arrays;
import java.util.Scanner;
public class Selectionsort {
public static void main(String[] args) {
	int array[];
	int limit;
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter the limit to array");
	limit = scan.nextInt();
	array= new int [limit];
	for(int i =0;i<array.length;i++) {
		System.out.println("Enter the array element with the index of " +i+ " : ");
		array[i] = scan.nextInt();
		
	}
	
	
	System.out.println("You enteres array is before sorting : " + Arrays.toString(array));
	
	SelectionSort(array);
	System.out.println("You entered array is After sorting : " + Arrays.toString(array));
}
public static boolean SelectionSort(int array[]) {
	
	
	int length = array.length;
	for(int i =0;i<length;i++) {
		int index = i;
		for(int j = i +1;j<length;j++) {
			if(array[j]<array[index]) {
				index =j;
			}
			
		}
		int temper = array[index];
		array[index] = array[i];
		array[i] = temper;
	}
	
	
	return true;
}
}
