package Assignment1;

public class CozaLozaWoza {
public static void main(String[] args) {
	final int LOWERBOUND = 1,UPPERBUND = 110;
	for (int number = LOWERBOUND;number<=UPPERBUND;++number) {
	if(number%3 == 0) {
		System.out.print("COZA.....");
	}	
	if(number %5 == 0) {
		System.out.print("LOZA.....");
	}
	if(number %7 == 0) {
		System.out.print("WOZA.....");
	}
	
	if (number %11 == 0) {
		System.out.println();
	}
	else {
		System.out.print("  ");
	}
	}
}
}
