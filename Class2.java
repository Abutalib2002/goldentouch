package oops;
import java.util.Scanner;
public class Class2 {
public static void main(String[] args) {
	new Package();
}
}
abstract class Website {
	abstract public void SilverPackage();
	abstract public void GoldenPackage();
	abstract public void DimondPackage();
	abstract public void PlatinumPackage();
	abstract public void PearlPackage();
}
class Package{
	Service service = new Service ();
	Scanner scan = new Scanner(System.in);
	int opt1;
	public Package(){
		
		System.out.println("Enter the option number to select package ");
		System.out.println("1.Silver Package");
		System.out.println("2.Golden Package");
		System.out.println("3.Dimond package");
		System.out.println("4.Platinum package");
		System.out.println("5.Pearl Package");
		opt1 = scan.nextInt();
		switch(opt1) {
		case 1:
		service.SilverPackage();
		break;
		
		case 2: 
			service.GoldenPackage();
		break;
		
		case 3:
			service.DimondPackage();
			break;
		case 4:
			service.PlatinumPackage();
			break;
		case 5:
			service.PearlPackage();
			break;
			default:System.out.println("Enter valid option");}
	}
}
class Service extends Website{
	String packageName;
	int price;
	
	public void SilverPackage() {
		packageName = "Silver Package";
		price = 5999;
		System.out.println("Package name:" + packageName);
		System.out.println("Price:" + price );
	System.out.println("Duration:" + "6 months");
System.out.println("Website contains:" + "One page Access"+"\n" + "overal seo "+"\n"+" limited Hyper links");
	System.out.println("Documents:" + "All legal documents should be Provided to the Legal Authority");
System.out.println("Payment:"+"Gpay, Phonepe,Paytm,Online Transection");
System.out.println("Invoice:" + "Should be included GST + Company Name");
		
	}
	
	public void GoldenPackage() {
		packageName = "Golden Package";
		price = 7499;
		System.out.println("Package name:" + packageName);
		System.out.println("Price:" + price );
	System.out.println("Duration:" + "7 months");
	System.out.println("Website contains:" + "Two page Access"+"\n" + "overal seo "+"\n"+" limited Hyper links");

System.out.println("Documents:" + "All legal documents should be Provided to the Legal Authority");
System.out.println("Payment:"+"Gpay, Phonepe,Paytm,Online Transection");
System.out.println("Invoice:" + "Should be included GST + Company Name");
	}
	@Override
	public void DimondPackage() {
		packageName = "Dimond Package";
		price = 8799;
		System.out.println("Package name:" + packageName);
		System.out.println("Price:" + price );
	System.out.println("Duration:" + "7 months");
	System.out.println("Website contains:" + "Three page Access"+"\n" + "overal seo "+"\n"+" limited Hyper links");

System.out.println("Documents:" + "All legal documents should be Provided to the Legal Authority");
System.out.println("Payment:"+"Gpay, Phonepe,Paytm,Online Transection");
System.out.println("Invoice:" + "Should be included GST + Company Name");		
	}
	@Override
	public void PlatinumPackage() {
		packageName = "Platinum Package";
		price = 10499;
		System.out.println("Package name:" + packageName);
		System.out.println("Price:" + price );
	System.out.println("Duration:" + "7.5 months");
	System.out.println("Website contains:" + "Five page Access"+"\n" + "overal seo "+"\n"+" limited Hyper links");

System.out.println("Documents:" + "All legal documents should be Provided to the Legal Authority");
System.out.println("Payment:"+"Gpay, Phonepe,Paytm,Online Transection");
System.out.println("Invoice:" + "Should be included GST + Company Name");
	}
	@Override
	public void PearlPackage() {
		packageName = "Pearl Package";
		price = 17499;
		System.out.println("Package name:" + packageName);
		System.out.println("Price:" + price );
	System.out.println("Duration:" + "8.5 months");
	System.out.println("Website contains:" + "Multiple page Access"+"\n" + "overal seo "+"\n"+" limited Hyper links");

System.out.println("Documents:" + "All legal documents should be Provided to the Legal Authority");
System.out.println("Payment:"+"Gpay, Phonepe,Paytm,Online Transection");
System.out.println("Invoice:" + "Should be included GST + Company Name");
		
	}
}