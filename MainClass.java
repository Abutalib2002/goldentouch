
package MathSolution;


import java.io.IOException;
import java.util.Scanner;

public class MainClass {
public static void main(String[] args) throws IOException {
	System.out.println();
System.out.println("\t\t\t\t\t\t\t\t"+" _________________________________________________________");
System.out.println("\t\t\t\t\t\t\t\t" + "|                                                         |");
System.out.println("\t\t\t\t\t\t\t\t" + "|          Welcome To Mathsimise Tutorial Center          |");
System.out.println("\t\t\t\t\t\t\t\t" + "|                                                         |");
System.out.println("\t\t\t\t\t\t\t\t"+"|_________________________________________________________|");


Scanner scan = new Scanner(System.in);
int choice;
System.out.println("\n\n\t\t\t\t" + "  1.Printing Prime Numbers" + " \t" + "  2. Printing Fibonacci" + "\t\t" + "   3.Checking Palindrome" + "\t" + "\t"+"  4.Amstrong Number"+"\n\n\t\t\t\t"+"  5.Exit");
System.out.print("\n\n\t\t\t\t\t\t\tEnter your choice here : " );
choice = scan.nextInt();
int mch;
switch(choice) {
case 1:
	int limit;
	System.out.print( "\n\n\t\t\t\t\t\t"+ "   Enter the Limt to Priting numbers : ");
	
	limit = scan.nextInt();
	System.out.print("\t\t\t\t\t\t\t----------------------------------------------------------------------------");
	new Prime_Number(limit);
	System.out.println("\t\t\t\t\t\t\t----------------------------------------------------------------------------");
	reuse();
	
	break;
case 2:
	mch =0;
	int not;
	System.out.print( "\n\n\t\t\t\t\t\t"+ "   Enter the No of Times  to Priting Series : ");
	not  = scan.nextInt();
	System.out.print("\t\t\t\t\t\t\t----------------------------------------------------------------------------");
	new Fibbonaci (not);
	System.out.print("\t\t\t\t\t\t\t----------------------------------------------------------------------------");
reuse();

break;
case 3:
	
	
	String Testing_value;
	System.out.print( "\n\n\t\t\t\t\t\t"+ "   Enter the  String or  numbers to check palindrome: ");
	Testing_value = scan.next();
	System.out.print("\t\t\t\t\t\t\t----------------------------------------------------------------------------");
	new Checking_palindrome(Testing_value);
	System.out.print("\n\t\t\t\t\t\t\t----------------------------------------------------------------------------");
	
	reuse();
	
	break;
case 4:
	
	int  Testing_Number;
	System.out.print( "\n\n\t\t\t\t\t\t"+ "   Enter the Numbers to check Amstrong: ");
	Testing_Number = scan.nextInt();
	System.out.print("\t\t\t\t\t\t\t----------------------------------------------------------------------------");
	new Amstrong_Number(Testing_Number);
	System.out.print("\n\t\t\t\t\t\t\t----------------------------------------------------------------------------");
	
	reuse();
	
	break;

case 5 : 
	System.exit(0);
	break;
	default:
		System.out.println("Enter valid options in the list");
}

}
public static void reuse () throws IOException {
	int opt;
	String args = "hi";
	Scanner scan = new Scanner (System.in);
	System.out.print( "\n\n\t\t\t\t\t\t"+ "  1.Main Page "+"\t\t"+"2.Exit ");
	opt = scan.nextInt();
	switch(opt) {
	case 1:
		main(null);
		break;
	case 2 :
	System.exit(0);
	break;
	default:System.out.print( "\n\n\t\t\t\t\t\t"+ "   Enter the Valid option: ");
	}
}
}

