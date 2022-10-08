package Assignment1;

import java.util.Arrays;

public class Quicksort {
public static void main(String[] args) {
	int array [] = {125,456,54,6868,54559,5548,6885,1,2,3,4,5,6,7,8,9,10,1,2,58555,54,547,787,95574,487};
	System.out.println("before sorting");
	System.out.println("Given array is :" + Arrays.toString(array));
	partition(array, 0, array.length-1);
	System.out.println("sorted array is :" + Arrays.toString(array));


}
public static int  partition(int array[],int low ,int high) {
	
	
	
	int pivot = high;
	int i = low;
	int j = high -1;
	while (i<j) {
		if(array[i]<=array[pivot])
		{
				i++;
		}
		if(array[i]>array[pivot])
		{
			
			if(array[i]>array[pivot] && array[j]<=array[pivot])
			{
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
			}
			if(array[j]>array[pivot])
			{
				j--;
				
			}
			
		}
		
		
	
	}
	
	int temp = array[i];
	
	array[i] = array[pivot];
	array[pivot] = temp;
			
	
	return i;
}


public static void quickSort(int array[],int low,int hi) {
	if(low>=hi)
    {
        return;
    }
    int split = partition(array, low, hi);
    quickSort(array, low, split-1);
    quickSort(array, split+1, hi);
}
}
