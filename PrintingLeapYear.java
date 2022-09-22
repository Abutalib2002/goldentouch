package JavaSession;

public class PrintingLeapYear {
public static void main(String[] args) {
	int count =0;
	int LowerBound = 0;
	int UpperBound = 1000;
	int number = LowerBound;
	for( number = 0;number<UpperBound;++number) {
		count=number;
		if ( (count %4 == 0) && (count %100 != 0) || (count %400 == 0) ) {
			System.out.println("This year is leap year: " + count);
		}
		
	}
	
}
}
