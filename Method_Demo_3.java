package EarnLearn;

public class Method_Demo_3 {
public static void main(String[] args) {
	Method_Demo_3 md = new Method_Demo_3();
	
	// printing original size of laddu.

Ladsu laddu = new Ladsu();
System.out.println(laddu.size);

// printing size of the laddu after the pass by value

md.passByvalue(laddu.size);
System.out.println(laddu.size);
// printing the laddu after passsby reference

md.PassByReference(laddu);
System.out.println(laddu.size);

}

public void passByvalue(int size) {
	size = 5;
}
public void PassByReference(Ladsu laddu) {
	laddu.size = 5;
}
}
class Ladsu{
	int size = 8;
}
