package EarnLearn;

public class Method_Demo_1 {

	public static void main(String[] args) throws InterruptedException 
	{
		Example ex = new Example();
		new Example();
		new Example("S");
		new Example("S", 1);
		ex.met();
		ex.met("s");
		ex.met1();
	}
	
}


class Example{
	
	public Example() throws InterruptedException {
		System.out.println();
	System.out.println("\t\t\t\t\t"+"  _________________________________________________");
	System.out.println("\t\t\t\t\t"+" +                                                 +");
	System.out.println("\t\t\t\t\t"+" +     This is Constructor with no parameter       +");
	System.out.println("\t\t\t\t\t"+" +_________________________________________________+");
    System.out.println();
    Thread.sleep(1500);
	}
	public Example(String s) throws InterruptedException {
		System.out.println();
		System.out.println("\t\t\t\t\t"+"  _________________________________________________");
		System.out.println("\t\t\t\t\t"+" +                                                 +");
		System.out.println("\t\t\t\t\t"+" +     This is Constructor with String parameter   +");
		System.out.println("\t\t\t\t\t"+" +_________________________________________________+");
System.out.println();	    	
Thread.sleep(1500);
	}
	public Example (String s,int i) throws InterruptedException {
		System.out.println();
		System.out.println("\t\t\t\t\t"+"  _______________________________________________________");
		System.out.println("\t\t\t\t\t"+" +                                                        +");
		System.out.println("\t\t\t\t\t"+" +  This is Constructor with integer & String parameter   +");
		System.out.println("\t\t\t\t\t"+" +________________________________________________________+");
	    System.out.println();
	System.out.println();
	Thread.sleep(1500);
	}
	
	public void met() throws InterruptedException
	{
		System.out.println();
		System.out.println("\t\t\t\t\t"+"  _________________________________________________");
		System.out.println("\t\t\t\t\t"+" +                                                 +");
		System.out.println("\t\t\t\t\t"+" +          This is non Returnable Method          +");
		System.out.println("\t\t\t\t\t"+" +_________________________________________________+");
	    System.out.println();
	    Thread.sleep(1500);
	}
	
	public int met1() throws InterruptedException {
		System.out.println();
		System.out.println("\t\t\t\t\t"+"  _________________________________________________");
		System.out.println("\t\t\t\t\t"+" +                                                 +");
		System.out.println("\t\t\t\t\t"+" +      This is Returable Method Returns : 1       +");
		System.out.println("\t\t\t\t\t"+" +_________________________________________________+");
	    System.out.println();
	    Thread.sleep(1500);
	    return 1;
		
	}
	
	public String met(String s) throws InterruptedException {
		System.out.println();
		System.out.println("\t\t\t\t\t"+"  _________________________________________________");
		System.out.println("\t\t\t\t\t"+" +                                                 +");
		System.out.println("\t\t\t\t\t"+" +     This is String return Method Return : S     +");
		System.out.println("\t\t\t\t\t"+" +_________________________________________________+");
	    System.out.println();
		Thread.sleep(1500);
	    return "s";
	}
}
