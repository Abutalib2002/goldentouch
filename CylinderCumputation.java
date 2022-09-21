package JavaSession;

public class CylinderCumputation {
public static void main(String[] args) {
	double SurfaceArea;
	double BaseArea;
	double Volume;
	double radius = 23.6;
	double hieght = 15.25;
	final double PI = 3.14159265;
	
	SurfaceArea = 2*PI*radius*hieght+2*PI*radius*radius;
	BaseArea = PI*radius*radius;
	Volume = PI*radius*radius*hieght;
	System.out.println("The Surface Area of the Cylinder:  " + SurfaceArea);
	System.out.println("The Base Area oF the Cylinder:  " + BaseArea);
	System.out.println("The Volume of the Cylinder1:  " + Volume);
}
}
