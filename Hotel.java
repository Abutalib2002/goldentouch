package EarnLearn;

public class Hotel {
public static void main(String[] args) {
	Samosa mysamosa=new HemanthSamosaKadai(); 
	 
	 MINILunch mylunch=(MINILunch)mysamosa; 
	 mylunch.afternoonLunchSnacks(); 

}
}
interface Snacks{
	public void eveningSnacks();
}
interface MINILunch{
	public void afternoonLunchSnacks();
}
interface FestivalFood{
	public void FestivalGift();

	void getMoney();

	void delivery();

	void happyTimes();

	void festivalGift();

	void afterNoonLunchSnacks();
}
interface MasoonTimePass {
	public void HappyTimes();
}
abstract class Samosa implements Snacks,MINILunch,MasoonTimePass,FestivalFood{
	public abstract void Delivery();
	public abstract void GetMoney();
	final public void DoSamosaBusiness() {
		Display();
		MakeSamosa();
		getMoney();
		Delivery();
	}
	final private void Display() {
		System.out.println("shop design as per specification");
	}
	final private void MakeSamosa() {
		getIngredients();
		makeDough();
		mixIngredients();
		makeAndFrySamosa();
	}
	final private void mixIngredients() { 
		 System.out.println("ingredients are mixed as per the samosa guidelines.."); 
		 } 
		final private void makeDough() { 
		 System.out.println("dough is made as per the Samosa guidelines..."); 
		 } 
		final private void getIngredients() { 
		 System.out.println("ingredients are ordered from head ");
		 } 
		final private void makeAndFrySamosa() { 
		 System.out.println("samosa made and fried in oil as per samosa guidelines..."); 
		 } 
}

class HemanthSamosaKadai extends Samosa{ 
@Override
public void eveningSnacks() { 
 System.out.println("sends with paper plate and tissue paper only in the evening..."); 
 DoSamosaBusiness(); 
 } 
@Override
public void afterNoonLunchSnacks() { 
 // TODO Auto-generated method stub
 DoSamosaBusiness(); 
 System.out.println("hemanth packs the samosa along with a bowl of rice and chutney as full lunch..."); 
 
 } 
@Override
public void festivalGift() { 
 DoSamosaBusiness(); 
 System.out.println("hemath sends samosas with bright wrappers along with special festival greetings..."); 
 
 } 
@Override
public void happyTimes() { 
 DoSamosaBusiness(); 
 System.out.println("hemath sends a dancing team along with samosa for happy times..."); 
 
 } 
@Override
public void delivery() { 
 System.out.println("hemanth buys rickshaw and train to deliver samosa in pulianthope"); 
 }


@Override
public void getMoney() { 
 System.out.println("hemath accepts in american dollors as payment in pulianthope.."); 
 }
@Override
public void afternoonLunchSnacks() {
	// TODO Auto-generated method stub
	
}
@Override
public void HappyTimes() {
	// TODO Auto-generated method stub
	
}
@Override
public void FestivalGift() {
	// TODO Auto-generated method stub
	
}
@Override
public void Delivery() {
	// TODO Auto-generated method stub
	
}
@Override
public void GetMoney() {
	// TODO Auto-generated method stub
	
} 
 
}


