package oops;
import java.util.Scanner;
public class NewProject {
public static void main(String[] args) {
	new Footwear();
}
}
 class Footwear{
	public Footwear(){
		Shoes shoes = new Shoes();
		shoes.shoe();
	}
}
 abstract class product  {
abstract public void shoe();	

	}
 class Shoes extends product{
	 Scanner scan = new Scanner (System.in);
	 int opt1;
	 int i= 0;
	 public void shoe() {
		 System.out.println("1.Formal shoes");
		 System.out.println("2.Casual shoes");
		 System.out.println("3.Semi formal shoes");
		 System.out.println("4.Semi casual shoes");
		 opt1 = scan.nextInt();
		 switch(opt1) {
		 case 1:
		 System.out.println("YOUR PRODUCT:Formal shoe");
		 System.out.println("YOUR ORDER ID:0125448");
		 
		 System.out.println("YOUR BIL AMOUNT:699");
		 System.out.println("\t" +"\t"+"Thank you");
		 
		 ;break;
		 case 2:
			 System.out.println("YOUR PRODUCT:Casual shoe");
			 System.out.println("YOUR ORDER ID:0451258");
			 
			 System.out.println("YOUR BIL AMOUNT:549");
			 ; break;
		 case 3:System.out.println("YOUR PRODUCT:Semi formal shoe");
		 System.out.println("YOUR ORDER ID:0126648");
		 
		 System.out.println("YOUR BIL AMOUNT:799");;break;
		 
		 case 4:System.out.println("YOUR PRODUCT:Semi casual shoe");
		 System.out.println("YOUR ORDER ID:0655448");
		 
		 System.out.println("YOUR BIL AMOUNT:849");;break;}
	 }
	 
	 
 }