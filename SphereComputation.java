package Assignment1;
import java.util.Scanner;
public class SphereComputation {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double radius;
	double volume;
	double SurfaceArea;
	System.out.println("Enter radius of the Sphere: ");
radius = scan.nextDouble();
SurfaceArea = 4*Math.PI*radius*radius;
double qrt = 4/3;
double r3 = radius*radius*radius;
volume = qrt*Math.PI*r3;
System.out.printf("The Surface Area of Sphere : %.2f%n",SurfaceArea);
System.out.printf("The volume of sphere : %.2f%n",volume);
	scan.close();
}
}
