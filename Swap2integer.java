package Assignment1;
import java.util.Scanner;

public class Swap2integer {
public static void main(String[] args) {
int FirstInteger;
int Secondinteger;
Scanner scan = new Scanner(System.in);
System.out.println("Enter the Ineger 1: ");
FirstInteger =scan.nextInt();
System.out.println("Enter the Integer 2:");
Secondinteger = scan.nextInt();

System.out.println("------before---------");
System.out.println("The first intger is : " + FirstInteger);
System.out.println("The second intger is : "+ Secondinteger);
int temp = FirstInteger;
FirstInteger = Secondinteger;
Secondinteger = temp;

System.out.println("------After Swap---------");
System.out.println("The first intger is : " + FirstInteger);
System.out.println("The second intger is : "+ Secondinteger);

scan.close();
}
}
