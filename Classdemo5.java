package EarnLearn;
import java.util.Scanner;
public class Classdemo5 {
public static void main(String[] args) {
	Programmer prog = new Abutalib();
	Atm atm = new SBIAtm();
	SBIAtm sbi = new SBIAtm();
	sbi.AccetCash();
	sbi.despenseCash();
	sbi.GetBalance();
}
}
interface Programmer{
	public void programming();}
interface Hacker{
	public void hacking();
}

interface Worker{
	public void Clean();
	public void Work();
		
}

abstract class Human {
	
}

class Abutalib extends Human implements Programmer,Hacker{
	@Override
	public void programming() {
	
		
	}
	
	public void hacking() {
	
		
	}
}


interface CashManager{
	public void AccetCash();
	public void despenseCash();
	public int GetBalance();
}
abstract class Atm{
	
}

class SBIAtm extends Atm implements CashManager{
	@Override
	public void AccetCash() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void despenseCash() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public int GetBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}







































