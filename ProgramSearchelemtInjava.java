package JavaExercise;
import java.util.Arrays;
import java.util.Scanner;
public class ProgramSearchelemtInjava {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int[] array;
	System.out.println("Welcome buddy............");
	System.out.println();
	System.out.println("Enter the size of the array......");
	int limit = scan.nextInt();
	array = new int[limit];
	System.out.println();
	
	for(int i =0;i<array.length;i++)
	{
		System.out.println("Enter the elements of the array at the index of "+i+" :");
		array[i] = scan.nextInt();
		}
	System.out.println();
	System.out.println("You entered array is: ");
	System.out.println(Arrays.toString(array));
	System.out.println();
	System.out.println("Enter the number you want to find .............?");
	int PresentOrNumber = scan.nextInt();
	
	int count =0;
	for (int i = 0;i<array.length;i++)
	{
		if (array[i] == PresentOrNumber)
		{
			System.out.println("Thre number is found at the index of "+ i);
		count++;
		}
	}
	System.out.println("The given nuber number of times present in array is :  " + count);
	scan.close();
}
}
