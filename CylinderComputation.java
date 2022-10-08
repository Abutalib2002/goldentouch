package Assignment1;
import java.util.Scanner;
public class CylinderComputation {
public static void main(String[] args) {
	double radius;
	double hieght;
	double baseArea;
	double surfaceArea;
	double volume;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius of the cylinder : ");
	 radius = scan.nextDouble();
	 System.out.println("Enter the hieght of the cylinder: 0");
		hieght = scan.nextDouble();
		baseArea = Math.PI*radius*radius;
		surfaceArea  = 2.0*Math.PI*radius + 2.0*baseArea;
		volume =  baseArea * hieght;
		System.out.printf("The Base Area of the cylinder: %.2f%n ",baseArea);
		System.out.printf("The surafce area of the cylinder : %.2f%n",surfaceArea);
		System.out.printf("The volume of the of the cylinder: %.2f%n", volume);
		
		scan.close();
}
}
