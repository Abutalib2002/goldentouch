package MathSolution;

public class Prime_Number {
public Prime_Number(int limit) {
	int limitation = limit;
	System.out.println();
	for(int i = 1; i <= limitation;i++ ) {
		int count = 0;
		for(int j = 2 ; j<= i/2;j++) {
			if (i %j == 0) {
				count++;
				break;
			}
		}
		if (count ==0 && i != 1) {
			System.out.println( "\t\t\t\t\t\t\t\t"+ i + "  " + "is prime number ");
		}
	}
}
}
