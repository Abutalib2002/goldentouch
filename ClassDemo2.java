package EarnLearn;

public class ClassDemo2 {
public static void main(String[] args) {
	BreakFast bf = new BreakFast();
	bf.Eat();
}
}
class BreakFast{
	String sugar;
	
	public BreakFast() {
		
	}
	public void Eat() {
		if(sugar != null) {
			System.out.println("Food is yummy ............");
		}
		else {
			System.out.println("Food is like dump...............");
		}
		
	}
}