package JavaSession;
import java.util.Scanner;
public class UniversaHealthCare {
public static void main(String[] args) {
	new Hospital();
}
}
class Hospital{
	Doctors doctors = new Doctors();
	GetDetalis details = new GetDetalis();
	Byte useropt;
	Scanner scanner1 = new Scanner (System.in);
	public Hospital() {
		
		System.out.println("Welcome to Universal Health Care Center.....");
		System.out.println("Enter 1 to Check Avalible Doctors and 2 Booking Appoinments ");
		System.out.println("1.Avalaibility of Doctors");
		System.out.println("2.Booking Appoinments");
		useropt = scanner1.nextByte();
		switch(useropt){
		case 1:doctors.Speacialist(); break; 
		case 2:details.UserDetalis(); break; 
		}
	}
}
class Doctors{
	public void Speacialist() {
		System.out.println("NAME:"+"Mahalingam"+"\n"+"Age:"+ "56" + "Specialist:" + "Cardialogy");
		System.out.println("NAME:"+"Bagyalaxi"+"\n"+"Age:"+ "46" + "Specialist:" + "Dermotology");

		System.out.println("NAME:"+"Aarmugam"+"\n"+"Age:"+ "38" + "Specialist:" + "Ureology");

		System.out.println("NAME:"+"Arunachalam"+"\n"+"Age:"+ "49" + "Specialist:" + "Phsycology");

		System.out.println("NAME:"+"Sundharam"+"\n"+"Age:"+ "32" + "Specialist:" + "Nuerology");

	}
}
class GetDetalis{
	Scanner scanner = new Scanner(System.in);
	String Patient;
	String Problem;
	byte age;
	public void UserDetalis() {
	System.out.println("Enter patient Name:");
	Patient = scanner.next();
	System.out.println("Enter the age: ");
	age = scanner.nextByte();
	System.out.println("Enter the problem:");
	Problem = scanner.next();
	System.out.println("\n");
	System.out.println("your booking is confirmed....");
	}
}