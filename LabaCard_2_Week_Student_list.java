package Labcard;

import java.util.Scanner;

public class LabaCard_2_Week_Student_list {
public static void main(String[] args) {
	
	int Student[][] ;
int result = 0 ;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the Total .no . of  Students  : ");
	int limit = in.nextInt();
	
	Student = new int [limit][limit];
	int count = 1,m1 = 1;
for(int i = 0 ; i < limit ; i++)
{
	System.out.println("Enter the Marks of the student  " +  count + " : ");
	for (int j  = 0; j < limit ; j++) {
		
		System.out.print("Enter the mark : ");
		Student[i][j] = in.nextInt();
		result += Student[i][j];
	}
	count++;
}

count = 1;int m = 1;
for (int i = 0; i < limit; i++) {
	for (int j = 0 ; j < limit; j++) {
		System.out.print("Student "+count +" "+Student[i][j]+ "\t");
		m++;
	}
	System.out.println();
	count ++;
	
}


System.out.println("Total result is : " + result);

}
}
