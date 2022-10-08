package Assignment1;
import java.util.Scanner;

public class IncomeTaxCalculatorWithSentine1 {
public static void main(String[] args) {
final int SENTINEL = -1;


final double TAX_RATE_ABOVE_20K = 0.1;
final double TAX_RATE_ABOVE_40K = 0.2;
final double TAX_RATE_ABOVE_60K = 0.3;
int taxableIncome;
double TaxPayable;
Scanner scan = new Scanner (System.in);
System.out.println("Enter the TAXABLE INCOME : ");
taxableIncome = scan.nextInt();
while(taxableIncome!=SENTINEL) {
if (taxableIncome<=20000) {
	TaxPayable =(double) taxableIncome*0.0;
	
}else if(taxableIncome <= 40000) {
	TaxPayable = (double) taxableIncome * TAX_RATE_ABOVE_20K;
	
}
else if (taxableIncome <= 60000) {
	TaxPayable = (double) taxableIncome * TAX_RATE_ABOVE_40K;
}
else {
TaxPayable =  (double) taxableIncome * TAX_RATE_ABOVE_60K;
}

System.out.printf("YOUR TAX PAAYBLE AMOUNT IS : %.2f%n" ,TaxPayable);

}
System.out.println("ITS NOT A VALUABLE AMOUNT........");
scan.close();		
		







scan.close();
}
}
