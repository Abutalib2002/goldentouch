package EarnLearn;

public class superMethodDemo {
public static void main(String[] args) {
	Mysuper  ms = new Mysub();
	ms.met();
	System.out.println(ms.i);
}
}

class Mysuper{
	public Mysuper(int i) {
		System.out.println("..........Super constructor is called..........");
	}
	int i = 10;
	public void met() {
		System.out.println("..........Super Method is called..............");
	}
	
	
}
class Mysub extends Mysuper{
	public Mysub() {
		super(90900);

	}
	int i =200;
	public void met() {
		super.met();
		System.out.println("Sub Met is called.............");
	
       System.out.println(i);	
	System.out.println(super.i);
	
	}
}
