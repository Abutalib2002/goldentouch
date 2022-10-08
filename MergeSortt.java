package Assignment1;

import java.util.Arrays;

public class MergeSortt {
public static void main(String[] args) {
	int arrayay[] = {12, 11, 13, 5, 6, 7};
	 System.out.println("the given unsorted array is :" +  Arrays.toString(arrayay));
	sort(arrayay, 0, arrayay.length-1);
    System.out.println("The sorted arrays is :" + Arrays.toString(arrayay));
}

public static void mergesort(int array[],int l,int m,int r) {
int n1 = m-l +1;
int n2 = r-m;
// create temp array


int L []= new int [n1];
int R[] = new int [n2];



// Assigning data to temp arrays


for (int i = 0;i<n1;i++) {
	L[i] = array[l +i];
	
}
for(int j =0;j<n2;j++) {
	R[j]  = array[l + j];
}



// Initial indexes of first and second subarrays
int i = 0, j = 0;

// Initial index of merged subarray array
int k = l;
while (i < n1 && j < n2)
{
    if (L[i] <= R[j])
    {
        array[k] = L[i];
        i++;
    }
    else
    {
        array[k] = R[j];
        j++;
    }
    k++;
}
/* Copy remaining elements of L[] if any */
while (i < n1)
{
    array[k] = L[i];
    i++;
    k++;
}

/* Copy remaining elements of R[] if any */
while (j < n2)
{
    array[k] = R[j];
    j++;
    k++;

}
}
public static void sort(int array[], int l, int r) {
	 if (l < r)
     {
         // Find the middle point
         int m = (l+r)/2;

         // Sort first and second halves
         sort(array, l, m);
         sort(array , m+1, r);

         // Merge the sorted halves
         mergesort (array, l, m, r);
     }
}
}
