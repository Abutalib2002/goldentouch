package JavaExercise;

public class Classdemo {
public static void main(String[] args) {
	no1 n =new no1();
	n.no1();


pb1 p = new pb1();
p.pb();

prt1 p1 = new prt1();
//p1.prt();

System.out.println("cant print private class");

pro1 p2 = new pro1();
p2.pro();
}


}

class no1
{
	void no1(){
		System.out.println("This is default class");
	}
}


 class pb1{
	public void pb() {
		System.out.println("this is public Class");
	}
}
 
 class prt1{
	 private void prt() {
		 System.out.println("This is protected class");
	 }
 }

class pro1{
	protected void pro() {
		System.out.println("This is protected class");
	}
}
