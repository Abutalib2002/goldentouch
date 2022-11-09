package Classpractice;

public class MethodDemo3 {
public static void main(String[] args) {
MethodDemo3 obj = new MethodDemo3();

Laddu laddu = new Laddu();


System.out.println("origianl Size of the laddu is" + laddu.Size);
obj.passByValue(laddu.Size);
System.out.println("After passing laddu"  + laddu.Size);


System.out.println("original size beffore passsing by reference  " + laddu.Size);
obj.passByReference(laddu);
System.out.println("after passing "  + laddu.Size);

}
public void passByValue(int size) {
	size=5;
}

public void passByReference(Laddu laddu) {
	laddu.Size=5;
}
}
class Laddu{
	int Size = 10;
	
}