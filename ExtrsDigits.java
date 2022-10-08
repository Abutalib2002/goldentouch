package Assignment1;

public class ExtrsDigits {

	public static void main(String[] args) {
		int n = 1523;
		System.out.println("The given digits is:  " + n);
		System.out.println("The reverse  order of the given digits: "  );
		while(n>0) {
			int digit = n%10;
			System.out.print(digit + " "
					+ "");
			n = n/10;
			
		}
	}
}
