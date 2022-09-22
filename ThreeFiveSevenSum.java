package JavaSession;

public class ThreeFiveSevenSum {
public static void main(String[] args) {
 int number = 0;
 int count = 0;
 for (number = 0;number<1000;++number) {
	 count = number;
	 if (count%3 == 0) {
		 System.out.println("This number is divided by 3: " + count);
	 }
	 else if(count %5 == 0){
		 System.out.println("This number is divided by 5: " + count);
	 }else if(count %7 == 0) {
		 System.out.println("This number is divided by 7: " + count);
	 }
	  }
}
}
