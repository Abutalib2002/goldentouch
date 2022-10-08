package Assignment1;

public class Product1ToInt {
public static void main(String[] args) {
	int product =1,LOWERBOUND =1,UPPERBOUND = 10;
for (int number = LOWERBOUND; number <= UPPERBOUND;number ++) {
	
	product *= number; 
}
System.out.println("the factorial of number is :  " + product);


}
}
