package Assignment1;

import java.util.Arrays;

public class Heapsort {
public static void main(String[] args) {
	 int arr[] = {12, 11, 13, 5, 6, 7};
     int n = arr.length;

    System.out.println("You entered array is: " + Arrays.toString(arr));
    sort(arr);
    System.out.println("Sorted "
    		+ " array is: " + Arrays.toString(arr));
}


public static void heapsort(int arr[],int n,int i) {
	 int largest = i;  // Initialize largest as root
     int l = 2*i + 1;  // left = 2*i + 1
     int r = 2*i + 2;  // right = 2*i + 2

     // If left child is larger than root
     if (l < n && arr[l] > arr[largest])
         largest = l;

     // If right child is larger than largest so far
     if (r < n && arr[r] > arr[largest])
         largest = r;

     // If largest is not root
     if (largest != i)
     {
         int swap = arr[i];
         arr[i] = arr[largest];
         arr[largest] = swap;

         // Recursively heapify the affected sub-tree
         heapsort(arr, n, largest);
}
     }


public static void sort(int arr[]) {
	  int n = arr.length;
	  
      // Build heap (rearrange array)
      for (int i = n / 2 - 1; i >= 0; i--)
          heapsort(arr, n, i);

      // One by one extract an element from heap
      for (int i=n-1; i>=0; i--)
      {
          // Move current root to end
          int temp = arr[0];
          arr[0] = arr[i];
          arr[i] = temp;

          // call max heapsort on the reduced heap
          heapsort(arr, i, 0);
}
}}
