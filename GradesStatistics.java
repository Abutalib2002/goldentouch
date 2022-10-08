package Assignment1;
import java.util.Scanner;

public class GradesStatistics {
public static void main(String[] args) {
	int[] grades;
	int sum =0;
	int min = 0;
	int max = 0;
	int numStudents;
	Scanner scan = new Scanner (System.in);
	System.out.println("ENTER THE NUMBER OF STUDENTS: ");
	
numStudents = scan.nextInt();
grades = new int [numStudents];
for (int i = 0 ; i < grades.length;++i) {
	System.out.print("ENTER GRADES OF THE STUDENT " + i +  ": " );
	grades[i] = scan.nextInt();
	System.out.println();
	sum+=grades[i];
	
}
double average = sum/numStudents;
System.out.printf("THE AVERAGE OF STUDENTS :  %.2f%n" , average);

	
	
	for(int i =0 ; i<grades.length;++i)
	{
		
		
		if(grades[i] < min) {
			min = grades[i];
		}
		if(grades[i]>max) {
			max = grades[i];
		}
	}
	
	
	System.out.println("THE MAXIMUM IS : " + max);
	System.out.println("THT MINIMUM IS : " + min);
	
	scan.close();
}
}
