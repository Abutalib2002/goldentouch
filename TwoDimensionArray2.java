package JavaExercise;

import java.util.Arrays;

public class TwoDimensionArray2 {
public static void main(String[] args) {
	int array[][] = {{1},{2,3},{4,5,6},{7,8,9,10}};
	for(int i =0;i<array.length;i++){
		for (int j = 0;j<array.length;j++)
		{
			if(i<j)
			{
				System.out.println("");
			}else {
				System.out.print(array[i][j] + " " );
				
			}
		}
	}
}
}
