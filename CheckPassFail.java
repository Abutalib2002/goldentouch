package JavaSession;
import java.util.Scanner;
public class CheckPassFail {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int mark;
	System.out.println("Enter the mark here to check the result: ");
	mark = scan.nextInt();
	if(mark >= 50) {
		System.out.println("Your passed");
	}
	else {
		System.out.println("Your fail");
	}
	System.out.println("Done");
	scan.close();
}
}
