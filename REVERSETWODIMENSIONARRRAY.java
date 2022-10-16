package JavaExercise;

public class REVERSETWODIMENSIONARRRAY {
public static void main(String[] args) {
	int [][] array = {{1,2,3,4},{5,6,7,8,9},{10,12,13,14,15}};
	// printing current array...
	
	
	System.out.println("Entered array is :");
	
	for(int i =0;i<array.length;i++)
	{
		for(int j = 0;j<array.length;j++)
		{
			System.out.println(array[i][j]);
		}
	}

	
	
	System.out.println("reverse array is: ");
	int row = array.length;
	int col = array[0].length;
	int[][] array1;
	array1 = new int[row][col];
	
	for(int i = row -1;i>=0;i--)
	{
		for(int j = col-1;j>=0;j--)
		{
		array1[row -1 -i][col - 1 - j] = array[i][j];
		}
	}
	
	
	for(int i =0;i<row;i++)
	{
		for(int j = 0;j<col;j++)
		{
			System.out.println(array1[i][j]);
		}
	}

}
}
