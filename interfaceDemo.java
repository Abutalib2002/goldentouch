package EarnLearn;

public class interfaceDemo {
public static void main(String[] args) {
	Dominos doms = new SukkuBhaipizza();
	doms.TemplateMethod();
}
}

interface Dominos{
	private void pizzabase() {
		System.out.println("Dominos pizza logic base...");
	}
	private void AddIncrideints() {
		System.out.println("Dominos incredients..");
	}
	private void bakePizza() {
		System.out.println("Dominos way of Bake pizza..");
	}
	private void pizzaBox() {
		System.out.println("Dominos way of packing...");
	}
	
	private void Decoration () {
		System.out.println("Dominos way of Decoration standard");
	}
	
	
	
	public default void TemplateMethod() {
		getmoney();
		pizzabase();
		AddIncrideints();
		bakePizza();
		pizzaBox();
		deliverBox();
		
	}
	public abstract void getmoney();
	public abstract void deliverBox();
}

class SukkuBhaipizza implements Dominos{
	@Override
	public void deliverBox() {
		// TODO Auto-generated method stub
	System.out.println("deleverd box");	
	}
	@Override
	public void getmoney() {
		// TODO Auto-generated method stub
		System.out.println("Get money from coustomer by Sukku Bhai Delivey boy");
	}
}
