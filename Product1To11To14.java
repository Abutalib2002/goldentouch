package Assignment1;

public class Product1To11To14 {
public static void main(String[] args) {
	long product1 = 1;
	
	int LOWERBOUND = 1;
	int UPPERBOUND = 11;
	
	
	// creating the varaibles abouve
	for(int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
	product1 *= number;	
	}
		System.out.println("the product of number 1 to 11 is:  "  + product1);
	// creatin another  loop to extend upper to 12

// changing upper bound value to 12
UPPERBOUND = 12;
		for(int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
			product1 *= number;	
			}

		System.out.println("the product of number 1 to 12 is:  "  + product1);
// changing upper bound value to 13

		UPPERBOUND = 13;
		for(int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
			product1 *= number;	
			}

		System.out.println("the product of number 1 to 13 is:  "  + product1);
		
		
		// changing upperbound value to 14
		
		
		UPPERBOUND = 14;
		for(int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
			product1 *= number;	
			}

		System.out.println("the product of number 1 to 14 is:  "  + product1);
		
}


}
