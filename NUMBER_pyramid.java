package CodeDays;

public class NUMBER_pyramid {
public static void SecondTraingle() {
	
	int row = 5;int rowcount = row;
	for (int i = 0;i <row; i++)
	{
		for (int j = 1; j< i*2; j++)
		{
			System.out.print(" ");
		}
		for(int j = 1; j < rowcount ; j++) {
			
			System.out.print(j + " ");
		}
		for (int j = rowcount -1; j>=1; j --) {
			System.out.print(j +" ");
		}
		System.out.println();
		rowcount--;
	}
	
}
public static void main(String[] args) {
	SecondTraingle();
}
}
