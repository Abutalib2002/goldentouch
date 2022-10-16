package JavaExercise;
import java.util.Scanner;
public class StudentMarkCalculation {
public static void main(String[] args) {
	int sum =0;
	int Students[][] = {
			
			{45,55,76},
			{65,76,87},
			{23,98,76}
	};
	for(int i =0;i<Students.length;i++)
	{
		for(int j = 0;j<Students.length;++j)
		{
			sum += Students[i][j];
		}
	}
	
	System.out.println("The sum of the student is : " + sum);
}
}
