package oops;

public class Class1 {
public static void main(String[] args) {
	new print();
}
}
class print{
	public print() {
		new meta(10,50);
		
	}
}
class meta{
	public meta(int a,int b) {
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
	}
}