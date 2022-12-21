package Classpractice;

public class ClassDemo3 {
public static void main(String[] args) {
	Animal mankey = new Monkey();
	mankey.WalkWithFourlegs();
	System.out.println();
	Monkey manki = new Monkey();
	manki.WalkWithFourlegs();
	manki.climTree();
	System.out.println();
	Lion simba = new Lion();
	simba.WalkWithFourlegs();
	simba.HuntDeer();

}
}

abstract class Animal{
	public void WalkWithFourlegs() {
		System.out.println("....................Walking with your four legs..............");
	}
}

class Monkey extends Animal{
	public void climTree() {
		System.out.println("..........Climing Tree..........");
	}
}

class Lion extends Animal{
	public void HuntDeer() {
		System.out.println("...................Hunting Deer is in Process.................");
	}
}