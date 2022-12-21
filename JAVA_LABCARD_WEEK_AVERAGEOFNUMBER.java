package Labcard;

import java.util.Scanner;

public class JAVA_LABCARD_WEEK_AVERAGEOFNUMBER {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int number ;
	System.out.println("Enter the number to find average : ");
	number = scan.nextInt();
	System.out.println("The average of the given number "+number+" is : " + average(number));
}

public static double average(int number) {
	int limit = number;
	int sum = 0;
	for (int i = 0; i < limit ;i++) {
		sum += i;
	}
	double average = (double)sum / number;
	return average;
}


}
