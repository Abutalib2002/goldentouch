package JavaExercise;

public class SomethingJava {
public static void main(String[] args) {
	derived drv = new derived();
	drv.useD();
}}

class base{
	String method() {
		return "wow";
	}
}


class derived{
	public void useD()
	{
		base z = new base();
		System.out.println("base Ways: " + z.method());
	}
}