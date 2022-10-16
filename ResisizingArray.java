package JavaExercise;

import java.util.Arrays;

public class ResisizingArray {
public static void main(String[] args) {
	int array [] = {1,3,2,4,5,6,7,8,9,10};
	System.out.println("The array is  : " + Arrays.toString(array));
	System.out.println("We cant resize array but we can copy the elements in array in new array with reuired lenght" );

int resize[] = Arrays.copyOf(array, 5);
System.out.println(Arrays.toString(resize));
}
}
