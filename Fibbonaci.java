package MathSolution;

public class Fibbonaci {
public Fibbonaci(int no_of_Terms) {
	int count = no_of_Terms;
	int t1 = 0;
	int t2 = 1;
	int sum;
	System.out.println();
	for (int i = 0 ; i<= count; i++) {
		System.out.println();
		System.out.println (" \t\t\t\t\t\t\t\t\t"+ t1 + " ");
		sum = t1 + t2 ;
		t1 = t2 ;
		 t2 = sum ;
	}
	
	
}
}
