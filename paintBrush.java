package EarnLearn;

public class paintBrush {
public static void main(String[] args) {
	BadpaintBrush bpb = new BadpaintBrush();
	bpb.doPaint(1);
GoodBrush gbp = new GoodBrush();
Redpaint rp = new Redpaint();
gbp.Dopaint(rp);
Bluepaint bp = new Bluepaint() ;
gbp.Dopaint(bp);
Greenpaint gp = new Greenpaint();
gbp.Dopaint(gp);

BlackPaint blp = new BlackPaint();

gbp.Dopaint(blp);



}
}


class BadpaintBrush{
	
	public void doPaint(int i) {
		if (i == 1) {
			System.out.println("Red color .....");
		}
		else {
			System.out.println("blue color......");
		}
	}
	
	
}
class GoodBrush{
	public void Dopaint(Redpaint rp) {
		System.out.println("Red paint.......");
	}
	public void Dopaint(Bluepaint bp) {
		System.out.println("Blue paint............");
	}
	public void Dopaint(Greenpaint gp) {
		System.out.println("Green paint................");
	}
	public void Dopaint(BlackPaint blp) {
		System.out.println("Black paint.............");
	}
}
class Redpaint {
	
}
class Bluepaint{
	
}
class Greenpaint{
	
}
class BlackPaint{
	
}