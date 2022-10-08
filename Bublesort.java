package Assignment1;

public class Bublesort {
public static void main(String[] args) {
	int array[] = {112,21,53,40,51,16,8,99,70};
	for(int i =0;i<array.length;i++) {
		System.out.println(array[i]);
	}
Bubblesort(array);	
	System.out.println("after sorting an array");
	for(int i = 0;i<array.length;i++) {
		System.out.println(array[i]);
	}
}
public static  boolean Bubblesort(int array[]) {
	int temperValue = 0;
	int length = array.length;
	for (int i =0;i<length;i++) {
		for(int j =1;j<(length-1);j++) {
			if(array[j-1]>array[j]) {
				
				temperValue = array[j-1];
				array[j-1] = array[j];
				array[j] = temperValue;
			}
		}
	}
	
	return true;
}
}
