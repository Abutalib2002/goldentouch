
package MathSolution;







public class Amstrong_Number {
public Amstrong_Number( int num) {
	boolean bol ;
	int temp = num;
	int digit = 0;
	int last;
	double sum = 0.0;
	temp = num;
	while(temp > 0) {
	
	temp = temp /10;
		digit++;
		
	}
	 temp = num;
	 while(temp != 0) {
		 last = temp %10;
		 sum += Math.pow(last, digit);
	 }
	 if (num == sum ) {
		 System.out.println("\t\t\t\t\t\t\t" + "This is ArmaStrong"); }
	 else {
		 System.out.println("\t\t\t\t\t\t\t" + "This is  not a  ArmaStrong");
	 }
	




}


public static void main(String[] args) {
	 new Amstrong_Number(101);
}
}