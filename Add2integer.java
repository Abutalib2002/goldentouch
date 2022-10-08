package Assignment1;
import java.util.Scanner;

public class Add2integer {
public static void main(String[] args) {
Scanner scan = new Scanner (System.in);

System.out.print("Enter the First Integer: ");
int number1 = scan.nextInt();
System.out.print("\n"+"Enter the Second Integer: ");
int number2 = scan.nextInt();
int sum = number1  + number2;
System.out.println( "\n"+"The sum of given integer is :  " + sum);

scan.close();
}
}
