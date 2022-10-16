package JavaExercise;

public class AverageNumber {
public static void main(String[] args) {
	System.out.println("The given intger is : 15");
	System.out.println("The average of given number is  "+average(15));
}
public static double average(int n) {
	double average = 0.0;
	int sum = 0;
	for(int i = 0;i<= n;i++)
	{
		sum += i;
	}
	average = (double) sum/n;
	return average;
}
}
