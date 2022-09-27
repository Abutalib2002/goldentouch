package SecondLabbook;

public class SwapTwoNumbers {
public static void main(String[] args) {
	float first  =  2.50F;
	float second = 4.50F;
	System.out.println(".....Before swap.....");
	System.out.println("First number =  " + first);
	System.out.println("Second number =  " + second);
	// value of first assigned temporary 
	float temporary = first;
	// value of second is assigned to first
	first = second;
	// value of temporary (which contain the initial value of first assigned to second)

   second = temporary;
   
   System.out.println("---After swap---");
   System.out.println("First number = " + first);
   System.out.println("Second number = " + second);
   
   


}
}
