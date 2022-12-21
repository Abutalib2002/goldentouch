package EarnLearn;

public class Classdemo4 {
private static Object shoeFactory;

public static void main(String[] args) {
	Shoe_Factory shoeShop = new Bata_Shoe_Factory();

Shoe_Seller shoe_seller = new AShop();
shoeShop.shoeFactory = shoeFactory;

System.out.println(shoe_seller.SellShoe());

}



}
abstract class Shoe{
	
}
class Leather_Shoe  extends Shoe{
	
}
class Sports_Shoe extends Shoe{
	
}
interface Shoe_Maker{
	public Shoe makeshoe();
}
abstract class Shoe_Factory implements Shoe_Maker{

	public Object shoeFactory;
}

 class Bata_Shoe_Factory extends Shoe_Factory{


@Override
public Shoe makeshoe() {
	// TODO Auto-generated method stub
	return new Leather_Shoe() ;
}
}
 class VKC extends Shoe_Factory{
	 @Override
	public Shoe makeshoe() {
		// TODO Auto-generated method stub
		return new Sports_Shoe();
	}
 }
interface Shoe_Seller{
	public Shoe SellShoe();
}
abstract class Shoe_Shop implements Shoe_Seller{

	Shoe_Factory shoeFactory;
}
class AShop extends Shoe_Shop{
	@Override
	public Shoe SellShoe() {
		// TODO Auto-generated method stub
		return shoeFactory.makeshoe();
	}
}
class Bshop extends Shoe_Shop{
	@Override
	public Shoe SellShoe() {
		// TODO Auto-generated method stub
		return shoeFactory.makeshoe();
	}
	

}