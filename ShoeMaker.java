package EarnLearn;

public class ShoeMaker {
public static void main(String[] args) {
	ShoeManufacturer shm = new BataShoeFactory();
	
shm.produce();

}
}
interface Manufacturer{
	public void produce();
}


interface ShoeManufacturer extends Manufacturer{
	public Sshoe makeShoe();
}
class Sshoe{
	public Sshoe() {
		// TODO Auto-generated constructor stub
	}
	
}
abstract class  ShoeFactory implements ShoeManufacturer{
public abstract void PurchaseRawMaterial();
final public void makingProcess() {
	System.out.println("Following the age old process of making shoe....");
	
}
}
class BataShoeFactory extends ShoeFactory{
	@Override
	public Sshoe makeShoe() {
		// TODO Auto-generated method stub
		return new Sshoe();
	}
	 @Override
	public void produce() {
		// TODO Auto-generated method stub
	PurchaseRawMaterial();	
	System.out.println(makeShoe());
	 }
	  @Override
	public void PurchaseRawMaterial() {
		// TODO Auto-generated method stub
	System.out.println("purchased raw material..");	
	}
}