package Labcard;
import java.util.Scanner;
public class LAb_Card_2_Two_Dimension_Array {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);

System.out.println("Enter the Row and Coloumn : ");
int n = scan.nextInt();
int i,j,k=1;

int [][] array  = new int [n][n];


for(j = 0; j < n; j++) {
	if (j%2 == 0)
	{
		for (i = j;i < n; i++) {
			array[i][j] = k;
			k++;
		}
	}
	else {
		for( i = n-1 ; i >= j; i--) {
			array[i][j] = k;
			k++;
		}
	}
	
	
	
}

for(i = 0 ; i< n; i++) {
	for(j = 0 ; j<=i; j++) {
		System.out.print(array[i][j] + "\t");
		
	}
	System.out.println();
}
	
}




}
