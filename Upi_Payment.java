package Mypractice_Myself;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.Set;


public class Upi_Payment {
public static void main(String[] args) throws InterruptedException {
	 new Transection();
}

}

class Transection {
	private double Amount;
	private double Balance;
	String dep = "Deposited";
	String with = "WidhtDrawled";
	Map <String,Double> map = new HashMap<String,Double>();
	Scanner scan = new Scanner(System.in);
public Transection() {
	
	option();
		
	
}
	public void option(){
		
		int opt;
		do {
		System.out.println("1.Deposite");
		System.out.println("2.Withdrawl");
		System.out.println("3.Checking Balance");
		System.out.println("4.Mini Statement");
		System.out.println();
		System.out.print("Enter your Choice;  "); 
		 opt = scan.nextInt();
		switch(opt) {
		case 1: 
			System.out.println();
			System.out.print("Enter Amount wish to deposite: ");
		double amount = scan.nextDouble();
		System.out.println();
		System.out.println("Amount Deposited SucessFully...");
			Deposite(amount);
			System.out.println();
			System.out.println("Your Balance is " + this.Balance);
			map.put(getTrans(dep),getTransAmount(amount));
			break;
		case 2:
			System.out.println();
			System.out.print("Enter Amount wish to WidthDrawl: ");
			 double amount1 = scan.nextDouble();
			 System.out.println();
			System.out.println("Amount WidthDrawed SucessFully...");
		Withdrawl(amount1);
		
		System.out.println();
				System.out.println("Your Balance is " + this.Balance);
				map.put(getTrans(with),getTransAmount(amount1));
				break;
		case 3:
			
			System.out.println("Your Balance is " + this.Balance);
		
		break;
		
		case 4:
			for(Map.Entry <String,Double> set: map.entrySet()) {
				System.out.println(set.getKey() + " " + set.getValue());
			}
break;
   }
		
		
		}while(opt != 0);
	}
	public Double getTransAmount(Double amt) {
		return amt; 
	}
	public String getTrans(String trans) {
		return "\t" + trans;
	}
	public double Deposite(double amt) {
		
		return this.Balance += amt;
		
	}
	public double Withdrawl(double wmt) {
		
		return this.Balance -= wmt;
	}
	public double CheckBalance() {
		return this.Balance;
	}
	
	
	
	}
