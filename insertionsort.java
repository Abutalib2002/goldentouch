package Assignment1;

import java.util.Arrays;

public class insertionsort {
public static void main(String[] args) {
	int array [] = {30,42,51,6,5,54,54,98,78,85,84,8,56};
	
System.out.println("You enter arary is : " +Arrays.toString(array));
InsertionSort(array);
System.out.println("After sorting....");
System.out.println("You entered array is " + Arrays.toString(array));

}
public static void InsertionSort(int array[]) {
	int length = array.length;
	for(int i =0;i<length;i++) {
		int key = array[i];
		int j= i-1;
		while(j>-1 &&  array[j]>key) {
			array[j +1] = array[j];
			j--;
			
		}
		array[j + 1] = key;
		
	}
	
	
	
	
}
}
