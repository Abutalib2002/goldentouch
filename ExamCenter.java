package EarnLearn;

public class ExamCenter {

}

interface Test{
	public void test(); 
}
interface JavaTest extends Test{
	public void javaTest();
}
	
interface MatsTest extends Test{
	public void mathsTest();
}
abstract class Exam implements JavaTest,MatsTest{
	public abstract void conductExam();
}

abstract class OnlineExam extends Exam{
public abstract void conductlineExam();	
}

class HITOnline extends OnlineExam{
	@Override
	public void conductExam() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void conductlineExam() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void javaTest() {
		// TODO Auto-generated method stub
	System.out.println("Java test....");	
	}
	@Override
	public void mathsTest() {
		// TODO Auto-generated method stub
		System.out.println("Maths Test.....");
	}
	@Override
	public void test() {
	javaTest();	// TODO Auto-generated method stub
		mathsTest();
	}
}

