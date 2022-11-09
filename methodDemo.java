package Classpractice;

public class methodDemo {
public static void main(String[] args) {
	Method obj = new Method();
	obj.met("Abutalib");
}
}

class Method {
	public Method() {
	System.out.println("Costructor is called.....");
	}
public Method(String s) {
	System.out.println("Constructor with String parameter is Called.......");
}
public Method(String s,int i) {
	System.out.println("Constructor wih String prameter and int is called");
}
	public void met() {
		System.out.println("without parameter method is called..");
	}
	public int  met1() {
	System.out.print("returable method");
		return 1;
	}
	public void met(String s) {
		System.out.println("Method with parameter is called...........");
	}
	
	
}
