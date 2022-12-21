package EarnLearn;

public class Method_Demo_2 {
public static void main(String[] args) {
	Demo demo = new Demo(20);
	demo.Met();
}
}


class Demo{
	
	int age;
	public Demo (int age ) {
		this.age = age;
	}
	public void Met() {
		System.out.println("The value of age is : " + age);
	
	Met1(this);
	}
	public void Met1(Demo demo) {
		
	}
	
	
}
