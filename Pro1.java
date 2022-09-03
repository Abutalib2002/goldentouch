/**
 * 
 */
package oops;
import java.util.Scanner;
public class Pro1 {

	public static void main(String[] args) {
		
	new Whale();
		new Cdbms();
	}

}
class Whale{
	public Whale() {
	Scanner input = new Scanner(System.in);
	
	int x = input.nextInt();
	if (x%2 == 0) {
		System.out.println("hi this is even");
	}
	else {
		System.out.println("no... this is odd");
	}
	}
}

class Cdbms{
	public Cdbms() {
		Scanner obj = new Scanner(System.in);
		System.out.print("Name:");
		String student1 = obj.next();
		System.out.println("Enter your id:");
		int id = obj.nextInt();
		System.out.println("Name:" + student1 + "\n" + "id:" + id + "\n" + "thank you");
		
	}
}