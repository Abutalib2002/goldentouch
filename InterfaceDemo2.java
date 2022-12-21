package EarnLearn;

public class InterfaceDemo2 {

}
interface Educator {
	public void educate();
}
interface CareerBuilding{
	public void buildCareer();
}
abstract class college{
	public abstract void Courses();
}
abstract class ArtsAndScienceCollege extends college{
	public abstract void artsandScienceCollege();
}
class NewCollege extends ArtsAndScienceCollege implements Educator,CareerBuilding{
	@Override
	public void artsandScienceCollege() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void buildCareer() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void Courses() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void educate() {
		// TODO Auto-generated method stub
		
	}
}


















