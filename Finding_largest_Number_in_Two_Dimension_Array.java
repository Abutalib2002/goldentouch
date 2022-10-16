package JavaExercise;

public class Finding_largest_Number_in_Two_Dimension_Array {
public static void main(String[] args) {
	int [][] array = 
		{
				{1,65,456,78,87,56,45},
				{15,65,48,625,788,45,46},
		};
int max = 0 ;

for(int i =0;i<array.length;i++) {
	for(int j= 0;j<array.length;j++) {
		max = array [i][0];
		if(max<array[i][j])
		{
			max = array[i][j];
			
		}
	}
	System.out.println( max +" is greatest number ");
}
}
}
