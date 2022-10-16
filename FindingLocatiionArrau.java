package JavaExercise;

public class FindingLocatiionArrau {
public static void main(String[] args) {
	int array[] = {1,12,256,65};
	int find = 256;
	for (int i = 0;i<array.length;i++)
	{
		if(array[i] == find)
		{
			System.out.println("The index of "+find+" is at "+i);
			break;
		}
		
	}
}
}
