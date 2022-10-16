package JavaExercise;

public class ProgramtogenarateprimeNumbers {
public static void main(String[] args) {
	int limit = 100;

	int temp ;
	for(int i =1;i<=limit;i++)
	{
		temp =0;
		for(int j = 2;j<=limit/2;j++)
		{
			if(i%j == 0)
			{
				temp++;
				break;
			}
		}
		
		if(temp == 0 && i != 1)
		{
			System.out.println(i+" is prime number");
		}
	}
}
}
