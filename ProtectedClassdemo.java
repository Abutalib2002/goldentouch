package JavaExercise;

public class ProtectedClassdemo {
public static void main(String[] args) {
	prodemo1 pro1 = new prodemo1();
	pro1.print();
}


}
class prodemo{
	protected int i = 10;
}

class prodemo1{
	public void  print (){
		prodemo pro = new prodemo();
		
		System.out.println(pro.i);
	}
}