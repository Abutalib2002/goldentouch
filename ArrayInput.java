package SecondLabbook;
import java.util.Scanner;
public class ArrayInput {
public static void main(String[] args) {
	int [] array = new int [10];
	int sum =0;
	Scanner scan = new Scanner (System.in);
	for ( int i = 0; i<10; i++) {
		System.out.println("Enter input here  " + i);

		array[i] =scan.nextInt();
		
	}
	for(int num : array) {
		sum =  sum + num;
		
	}
	System.out.println("Elements of array is : " + sum);
	scan.close();
}
}
