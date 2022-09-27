package SecondLabbook;
import java.util.Scanner; 
public class areaOfCircle {
public static void main(String[] args) {
System.out.println("Enter of the value of radius");
Scanner scan =new Scanner (System.in);
double radius = scan.nextDouble();
double area = Math.PI*(radius*radius);
double CircumFrence = Math.PI*2*radius;
System.out.println("Area of the Circle: " +area);
System.out.println("Circumfrence of the circle : " + CircumFrence);
}
}
