package EarnLearn;

public class Staticdemo {
public static void main(String[] args) {
	Summa c = new Summa();
	c.met();
	
	Summa.met();
	System.out.println(Summa.ii);
	Aprtments aprt = new Aprtments();
	Aprtments apart = new  Aprtments();
	
}
}

class Summa{
	int i;
	static int ii;
	public static void met() {
		
	}
	public void Mett()
{
		

}
}

class Aprtments{
static park parks = new park();
Carpark crpk = new Carpark();

}
class park{
	public park() {
	System.out.println("park objext is created");
	}
}
class Carpark{
	public Carpark() {
  System.out.println("Cark park is object is created");
	
	}
}
