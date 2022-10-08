package Assignment1;
import java.util.Arrays;
import java.util.Scanner;
public class Gradestatistics {
	public static int[] grades;
public static void main(String[] args) {
readGrades();
System.out.println("The grades are: ");
print(grades);
System.out.println("The average is : " + average(grades));
System.out.println("The median is : " + median(grades));
System.out.println("The minimum is : " + min(grades));
System.out.println("The  maximum is: " + max(grades));
System.out.println("The standard Devaton is: " + StdDev(grades));
}
public static void readGrades() {
	System.out.println("ENETER THE NUMBER OF STUDENTS: ");
	Scanner scan = new Scanner (System.in);

	int stuno = scan.nextInt();
	grades =new int[stuno];
	for(int i = 0 ;i<grades.length;i++) {
	System.out.println("Enter the student " +i+": " );
	grades[i] = scan.nextInt();
}
	
	
	scan.close();
}
public static void print(int [] array) {
	for(int i =0;i<array.length;i++) {
		if(i == array[i]) {
			System.out.print("[" + array[i]);
		}
		else {
			System.out.print("," + array[i]);
		}
	}
	System.out.println("]");
	System.out.println();
}
public static double average(int[] array1) {
	int sum= 0;
	for(int i = 0;i<array1.length;i++) {
		sum+=array1[i];
	}
	double percent = sum/array1.length;
	return percent;
}
public static double median( int[] array2) {
	Arrays.sort(array2);
	int maxnum = array2.length;
	double medianvalue = 0.0;
	if(maxnum %2 == 1)
		medianvalue = array2[((maxnum+1)/2)-1];
	else
		medianvalue = (array2[maxnum/2-1]+array2[maxnum/2])/2;
	return medianvalue;
}

public static int  max(int[] array3){
	
	
int maximumValue = array3[0];
for(int i = 0;i<array3.length;i++) {
	if(array3[i]>maximumValue) {
		maximumValue = array3 [i];
	}
}

return maximumValue;
}

public static int min(int[] array4) {
	int minimumValue = array4 [0];
	for(int i = 0;i<array4.length;i++) {
		if(array4[i]<minimumValue) {
			minimumValue = array4 [i];
		}
	}	
	return minimumValue;
}


public static double StdDev(int[] array5) {
	
int meansum =0;
double deviationSum = 0;
for (int i =0;i<array5.length;i++) {
	meansum+=array5[i];
}
double mean = meansum/array5.length;


for(int i =0;i<array5.length;i++) {
	array5[i] = (int)(Math.pow((array5[i] - mean),2));
	
}

for( int i = 0;i<array5.length;i++) {
deviationSum+=array5[i];	
}
double variance =(double) deviationSum/array5.length;
double standardDevation = Math.sqrt(variance);
return standardDevation;

}
 }
