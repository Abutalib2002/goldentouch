package JavaExercise;


import java.util.Scanner;
public class QuadricFunction {
public static void main(String[] args) {
System.out.println("enter the x value for quadric functon: ");
Scanner scan =new Scanner(System.in);
int x = scan.nextInt();
	new quadric(x);
}

}
class quadric{
	
	public quadric (int x)
	{
		Scanner scan = new Scanner (System.in);
		
	int a;
	int b;
	int c;
	
	System.out.println("Enter the value of a: ");
	a = scan.nextInt();
	System.out.println("Enter the value of b: ");
	b= scan.nextInt();
	System.out.println("Enter the value of c: ");
	c= scan.nextInt();
	
	
	x = a*(x*x) + b*x  + c;
	
	
	System.out.println("The value of quaadric function is x :  "+ x);
	
	
	
	
	
	scan.close();
	
	
	
	}
	
}