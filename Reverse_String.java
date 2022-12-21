package CodeDays;

public class Reverse_String {
String main_String = "We are Batch of Full_Stack_Development Course Jully 2022";


public void Reverse_by_Logic() {
	char CharArray []  = main_String.toCharArray();
	
	
	for(int i = CharArray.length - 1; i >= 0;i--) {
		System.out.print(CharArray[i]);
	}
}
public void Reverse_by_String_Method() {
	for(int i = main_String.length() - 1;i >= 0 ;i--) {
		System.out.print(main_String.substring(i, i+1));
	}
}
public String Reverse_String_By_Rcursion(String Reverse) {
	
	if(Reverse.isEmpty()) {
		return Reverse;
	}
	String Re =  Reverse_String_By_Rcursion(Reverse.substring(1) )+ Reverse.charAt(0);
	return Re;
	
}

public void Reverse_String_by_StringBuffer() {
	StringBuffer String_Buffer = new StringBuffer(main_String);
	
	System.out.println(String_Buffer.reverse());
}


public static void main(String[] args) {
	Reverse_String reverse_String = new Reverse_String();
	System.out.println("String from Reverse logic: \n");
	
	reverse_String.Reverse_by_Logic();
	
	System.out.println("\n\nStrign from Reverse by String Method\n");
	
	reverse_String.Reverse_by_String_Method();
	
	System.out.println("\n\nString From Reverse by Recursion Method\n");

	System.out.println(reverse_String.Reverse_String_By_Rcursion(reverse_String.main_String));
System.out.println("\n\nString From String Buffer Method\n\n");


}


}
