package CodeDays;

public class EQUALITYOFARRAY {
public static void main(String[] args) {
	int [] array1 = {1,2,3,4,5,6,7,8,9};
	int [] array2 = {1,2,3,4,5,6,7,8,9};	
	boolean yrn = true;
	if (array1.length == array2.length) {
		for(int i = 0; i<array1.length;i++) {
			if(array1[i] != array2[i]) {
				yrn = false;
			}
			
		}
	}
	else {
		yrn = false;
	}
	
	if (yrn) {
		System.out.println("Two arrays are equal : ");
	}
	else {
		System.out.println("Two Arrays or not Equal: ");
	}
}
}
