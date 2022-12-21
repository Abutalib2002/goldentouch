package Classpractice;

public class ClassDemo2 {
public static void main(String[] args) {
BreakFast nasta = new BreakFast();
nasta.eat();
}}

class BreakFast{
	String Sugar;
	public BreakFast() {
	System.out.println();
	
	}
	
	public void eat() {
		if(this.Sugar != null) {
			System.out.println("food is Taste");
		}
		else {
			System.out.println("food is worst");
		}
	}
}