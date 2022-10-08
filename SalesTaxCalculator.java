package Assignment1;
import java.util.Scanner;
public class SalesTaxCalculator {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	final double SALES_TAX_RATE = 0.7;
	final int SENTINEL = -1;
	double salePrice ,actualPrice ,salesTax;
	double totalPrice =0.0;
	double totalActualPrice =0.0;
	double totalSaleTax =0.0;
	System.out.println("Enter the Tax inclusive price: ");
	salePrice = scan.nextDouble();
	while(salePrice  != SENTINEL) {
		 
		 salesTax =SALES_TAX_RATE;
		 actualPrice = salePrice - SALES_TAX_RATE;
		 totalActualPrice += actualPrice;
        totalSaleTax += salesTax;
totalPrice += salePrice;
System.out.println("The actual price is : " + actualPrice);
System.out.println("The sales tax is:  "+salesTax);

		 System.out.println("Enter the Tax inclusive price:");
		  salePrice = scan.nextDouble();
		 
	}
	
System.out.printf("THE TOTAL PRICE IS : %.2f%n" , totalPrice);


System.out.printf("THE TOTAL  ACTUAL PRICE IS : %.2f%n" ,totalActualPrice );


System.out.printf("THE TOTAL SALES TAX  IS : %.2f%n" , totalSaleTax);
	


scan.close();


}
}
