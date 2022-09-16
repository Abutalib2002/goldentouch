package oops;
import java.util.Scanner;
public class Atm {

	public static void main(String[] args) {
		int i;
		int useropt;
		Scanner scan1 = new Scanner (System.in);
		Transection transect = new Transection();
	System.out.println("Welcome to the HELLO JAVA ATM");
	transect.GetAccountDetails();
	
   System.out.println("Enter 1 to transection and 2 to exit");
    useropt = scan1.nextInt();
    if (useropt == 1) {
    while(useropt == 1) {
	System.out.println("1.Depsoite");
	
	System.out.println("2.Widthdraw");
	
	System.out.println("3.Balance Enquirey");
	
	
	System.out.println("Enter the option (1-4) to Begin Transection");
	i = scan1.nextInt();
	
			switch(i) {
			case 1:transect.DepositMoney();
			System.out.println("\n");break;
			case 2:transect.WidthDrawl();
			System.out.println("\n");break;
			case 3:transect.BalnceEnquirey();
			System.out.println("\n");break;
			default:System.out.println("You enter option is Invalid");
			}}}
    else {
    	System.out.println("Thank you");
    }
			scan1.close();
}

}

class   Transection{
	int accno;
	double Amount;
	int pino;
	double balance;
	double WidthdrawAmount;
	
	Scanner scan = new Scanner (System.in);
	public void GetAccountDetails() {
		System.out.println("Enter the Account Number:");
		 accno = scan.nextInt();
		 System.out.println("Enter the Pin Number:");
		pino = scan.nextInt();
		
		
	}
	public void DepositMoney(){
		
		System.out.println("Enter Amount that  you  would like  to Deposite:");
		Amount = scan.nextDouble();
		balance+=Amount;
		System.out.println("Your deposited Amount is: "+ Amount);
		
		
		System.out.println("Your current balance is : " + balance);
	}
	
	public void WidthDrawl() {
		System.out.println("Enter amount That would you like you Widthdraw:");
		WidthdrawAmount = scan.nextDouble();
		balance-=WidthdrawAmount;
		System.out.println("Your Widthdrawl Amount is: "+ WidthdrawAmount);

		System.out.println("Your current balance is : " + balance);
	}
	public void BalnceEnquirey() {
		System.out.println("Your balance left in Account is:" + balance);
		
	}
}