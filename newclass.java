package EarnLearn;

import java.util.Scanner;

public class newclass {
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException  {
	Scanner scan = new Scanner(System.in);
	System.out.println("entr the class name to create obj of that class");
	String str = scan.next();
	System.out.println(str);
	Class.forName(str).newInstance();
}
}
class class1{
	public class1() {
		
	System.out.println("hi da failure...");
	
	}
}

class class2{
	public class2() {
		// TODO Auto-generated constructor stub
System.out.println("hello da sucess");
	}
}