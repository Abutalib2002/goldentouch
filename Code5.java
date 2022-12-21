package CodeDays;

public class Code5 {
public static void main(String[] args) {
	DuplicateCharCount();
}

static void DuplicateCharCount() {
	String str = "IM A FULL STACK DEFVELOPER I CAN DEVLOPE ANYTHING DIGITALLY";
	char [] charArray = str.toCharArray();
	char duplicateAlpha [] = new char [str.length()];
	int DuplicateCount[] = new int [str.length()];
	int row = 0;
	for(char c: charArray) {
		char temp = c;
		int tempCount = 0;
		for(char cc : charArray) {
			if (temp == cc)
			{
				tempCount++;
			}
			
		}
		duplicateAlpha[row] = c	;
		DuplicateCount[row] = tempCount;
		row++;
	}
	char temp [] =  new char[str.length()];
	boolean print = true;
	for(int i = 0 ; i < str.length(); i++) {
		for(char t: temp) {
			if ( t== duplicateAlpha[i]) {
				print = false;
			}
		}
		if (print) {
			System.out.print("Character  : " + duplicateAlpha[i] + " ... ");
			System.out.println("No of times : " + DuplicateCount[i] +  "... ");
		}
		temp [i] = duplicateAlpha [i] ;
		print = true;
	}
	
	
	
	
}


}
