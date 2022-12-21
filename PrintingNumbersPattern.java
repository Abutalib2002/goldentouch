package CodeDays;

public class PrintingNumbersPattern {
public static void main(String[] args) {
	Loop loop = new Loop();
	loop.printNumbers();
}
}
class Loop{
	public void printNumbers() {
		int rowcount = 1;
		for (int i = 10 ; i>0; i--)
		{
			for (int j = 1; j <= i ;j++) 
			{
				
				System.out.print(" ");
			}
			for (int j = 1; j <= rowcount; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
			System.out.println();
		rowcount++;
		}
	}
}
