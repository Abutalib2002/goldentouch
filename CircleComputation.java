package Assignment1;

import java.util.Scanner;

public class CircleComputation {
public static void main(String[] args) {
	double radius;
	double diameter;
	double circumFrence;
	double area;
	Scanner scan = new Scanner (System.in);
	System.out.println("Enter the Radius of the Circle: " );
	radius = scan.nextDouble();
	diameter = 2.0*radius;
	area = Math.PI*radius*radius;
	circumFrence  = 2.0*Math.PI *radius;
	System.out.printf("The diameter of circle is : %.2f%n",diameter);
	System.out.printf("The area of circle is : %.2f%n",area);
	System.out.printf("The circumFrence o circle is : %.2f%n",circumFrence);
scan.close();	
}
}
