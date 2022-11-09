package Classpractice;

public class Methoddemo1 {
public static void main(String[] args) {
	B b = new B(20);
	b.met();
}
}
class B{
	int age = 19;
	public B(int age) {
		this.age = age;
	}
	public void met() {
		System.out.println(age);
		
		met2(this);
	}
	public void met2( B obj) {
		System.out.println("hi");
	}
}