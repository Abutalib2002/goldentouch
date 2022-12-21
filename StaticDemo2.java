package EarnLearn;

public class StaticDemo2 {
public static void main(String[] args) {
	for (int o = 0 ;o <10;o++) {
		new Theater();
	}
	System.out.println(Theater.toilet);
}
}

class Theater{
	static Toilet toilet = new Toilet();
	seats sa = new seats();
	public void Met() {
		System.out.println(toilet);
		Theater t = new Theater();
	System.out.println(t.sa);
	
	}
}
class Toilet{
	public Toilet() {
		// TODO Auto-generated constructor stub
	// printing the text
		System.out.println("Toilet objext is created");
	}
}
class seats{
	public seats() {
		// TODO Auto-generated constructor stub
	// printing the seats
		
		System.out.println("Seat objects is created");
	
	}
}

