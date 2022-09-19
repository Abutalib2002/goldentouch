package JavaSession;
import java.util.Scanner;
public class Ecommerse {
public static void main(String[] args) {
	Scanner scanner1 = new Scanner(System.in);
	int i;
	System.out.println("\n");
	System.out.print("\t\t\t\t");
	System.out.println("Welcome to MensFashion India");
	System.out.println("\n");
	System.out.print("\t\t\t\t");
	System.out.println("India's most Famouse and trustable brand");
	System.out.println("\n");
	System.out.print("\t\t\t\t");
	System.out.println("Have nice journey in our site");
	System.out.print("\t\t\t\t");
	System.out.println("\n");
	do {
	System.out.println("Enter 1 to Shopping or 2 to exit");
	i = scanner1.nextInt();
	
	if (i == 1) {
		
		
	new MensFashion();
	System.out.println("\n");
	}
	else {
		System.out.print("\t");
		System.out.println("Thank you");
	}
	}while(i == 1);
	scanner1.close();
}
}
abstract class Clothing{
	abstract public void  MensWear();
	
	
}
class MensFashion{
	public MensFashion() {
		Menswear mensFashion = new Menswear();
		mensFashion.MensWear();
	}
}


class Menswear extends Clothing{
	byte useropt1;
	byte useropt;
	byte size;
	Scanner scanner = new Scanner(System.in);
	
	 public void MensWear() {
		System.out.println("1.Shirts");
		System.out.println("2.Pants");
		System.out.println("3.T-shirts");
		System.out.println("4.Shorts");
		System.out.println("5.Joggers");
		System.out.println("6.POLO T-Shirts");
		System.out.println("7.Boxers");
		System.out.println("8.Dhoties");System.out.println("\n");
		System.out.println("Enter option from (1-8) to Select above products:");
		useropt = scanner.nextByte();
		switch(useropt) {
		case 1: 
			System.out.println("Here Avaliable colors are:");
			System.out.println("1.Red Shirt");
			System.out.println("Price:$299");
			System.out.println("\n");
			System.out.println("2.Yellow Shirts");
			System.out.println("Price:$399");
			System.out.println("\n");
			System.out.println("3.Green Shirts");
			System.out.println("Price:$489");
			System.out.println("\n");
			System.out.println("4.Pink Shirts");
			System.out.println("Price:$569");
			System.out.println("\n");
			System.out.println("5.Mustard Shirts");	
			System.out.println("Price:$699");
			System.out.println("\n");
			System.out.println("6.Cyan Shirts");	
			System.out.println("Price:$829");
			System.out.println("\n");
			System.out.println("Enter option from (1-6) to Select above products:");
			useropt1= scanner.nextByte();
			switch(useropt1) {
			case 1: 
				System.out.println("Product:Red Shirt");	
				System.out.println("Product id:0321");
				System.out.println("Price:$299");
				System.out.println("Gst:18%");
				System.out.println("Total price:352.82");
				System.out.println("Thank you for Booking.....");
				break;
			
			
		
		case 2:
			System.out.println("Product:Yellow Shirt");	
			System.out.println("Product id:0322");
			System.out.println("Price:$399");
			System.out.println("Gst:18%");
			System.out.println("Total price:452.82");
			System.out.println("Thank you for Booking.....");
		break;
		case 3:
			System.out.println("Product:Green Shirt");	
			System.out.println("Product id:0323");
			System.out.println("Price:$489");
			System.out.println("Gst:18%");
			System.out.println("Total price:577.02");
			System.out.println("Thank you for Booking.....");
		break;
		case 4: 
			System.out.println("Product:Pink Shirt");	
			System.out.println("Product id:0324");
			System.out.println("Price:$569");
			System.out.println("Gst:18%");
			System.out.println("Total price:671.42");
			System.out.println("Thank you for Booking.....");
		break;
		case 5:
			System.out.println("Product:Mustard Shirt");	
			System.out.println("Product id:0326");
			System.out.println("Price:$829");
			System.out.println("Gst:18%");
			System.out.println("Total price:978.22");
			System.out.println("Thank you for Booking.....");
		break;
		case 6:
			System.out.println("Product:Cyan Shirt");	
			System.out.println("Product id:0327");
			System.out.println("Price:$699");
			System.out.println("Gst:18%");
			System.out.println("Total price:824.82");
			System.out.println("Thank you for Booking.....");
		break;
		
		}
			break;
		case 2:
			System.out.println("Here Avaliable colors are:");
			System.out.println("1. Black Pants");
			System.out.println("Price:$299");
			System.out.println("\n");
			System.out.println("2.White Pant");
			System.out.println("Price:$399");
			System.out.println("\n");
			System.out.println("3.Grey Pant");
			System.out.println("Price:$489");
			System.out.println("\n");
			System.out.println("4.Half White pant");
			System.out.println("Price:$569");
			System.out.println("\n");
			System.out.println("5.Green Pant");	
			System.out.println("Price:$699");
			System.out.println("\n");
			System.out.println("6.Navy Blue Pants");	
			System.out.println("Price:$829");
			System.out.println("\n");
			System.out.println("Enter option from (1-6) to Select above products:");
			useropt1= scanner.nextByte();
			switch(useropt1) {
			case 1: 
				System.out.println("Product:Black Pants");	
				System.out.println("Product id:03210");
				System.out.println("Price:$299");
				System.out.println("Gst:18%");
				System.out.println("Total price:352.82");
				System.out.println("Thank you for Booking.....");
				break;
			
			
		
		case 2:
			System.out.println("Product:White Pant");	
			System.out.println("Product id:03221");
			System.out.println("Price:$399");
			System.out.println("Gst:18%");
			System.out.println("Total price:452.82");
			System.out.println("Thank you for Booking.....");
		break;
		case 3:
			System.out.println("Product:Grey Pant");	
			System.out.println("Product id:03232");
			System.out.println("Price:$489");
			System.out.println("Gst:18%");
			System.out.println("Total price:577.02");
			System.out.println("Thank you for Booking.....");
		break;
		case 4: 
			System.out.println("Product:Half White pant");	
			System.out.println("Product id:03243");
			System.out.println("Price:$569");
			System.out.println("Gst:18%");
			System.out.println("Total price:671.42");
			System.out.println("Thank you for Booking.....");
		break;
		case 5:
			System.out.println("Product:Green Pant");	
			System.out.println("Product id:03264");
			System.out.println("Price:$829");
			System.out.println("Gst:18%");
			System.out.println("Total price:978.22");
			System.out.println("Thank you for Booking.....");
		break;
		case 6:
			System.out.println("Product:Navy Blue Pants");	
			System.out.println("Product id:03275");
			System.out.println("Price:$699");
			System.out.println("Gst:18%");
			System.out.println("Total price:824.82");
			System.out.println("Thank you for Booking.....");
		break;
		
		}
			
			break;
		case 3: 
			System.out.println("Here Avaliable colors are:");
			System.out.println("1.Red T-Shirt");
			System.out.println("Price:$299");
			System.out.println("\n");
			System.out.println("2.Yellow  T-Shirt");
			System.out.println("Price:$399");
			System.out.println("\n");
			System.out.println("3.Green  T-Shirt");
			System.out.println("Price:$489");
			System.out.println("\n");
			System.out.println("4.Pink  T-Shirt");
			System.out.println("Price:$569");
			System.out.println("\n");
			System.out.println("5.Mustard  T-Shirt");	
			System.out.println("Price:$699");
			System.out.println("\n");
			System.out.println("6.Cyan  T-Shirt");	
			System.out.println("Price:$829");
			System.out.println("\n");
			System.out.println("Enter option from (1-6) to Select above products:");
			useropt1= scanner.nextByte();
			switch(useropt1) {
			case 1: 
				System.out.println("Product:Red  T-Shirt");	
				System.out.println("Product id:0321");
				System.out.println("Price:$299");
				System.out.println("Gst:18%");
				System.out.println("Total price:352.82");
				System.out.println("Thank you for Booking.....");
				break;
			
			
		
		case 2:
			System.out.println("Product:Yellow  T-Shirt");	
			System.out.println("Product id:0322");
			System.out.println("Price:$399");
			System.out.println("Gst:18%");
			System.out.println("Total price:452.82");
			System.out.println("Thank you for Booking.....");
		break;
		case 3:
			System.out.println("Product:Green  T-Shirt");	
			System.out.println("Product id:0323");
			System.out.println("Price:$489");
			System.out.println("Gst:18%");
			System.out.println("Total price:577.02");
			System.out.println("Thank you for Booking.....");
		break;
		case 4: 
			System.out.println("Product:Pink  T-Shirt");	
			System.out.println("Product id:0324");
			System.out.println("Price:$569");
			System.out.println("Gst:18%");
			System.out.println("Total price:671.42");
			System.out.println("Thank you for Booking.....");
		break;
		case 5:
			System.out.println("Product:Mustard  T-Shirt");	
			System.out.println("Product id:0326");
			System.out.println("Price:$829");
			System.out.println("Gst:18%");
			System.out.println("Total price:978.22");
			System.out.println("Thank you for Booking.....");
		break;
		case 6:
			System.out.println("Product:Cyan  T-Shirt");	
			System.out.println("Product id:0327");
			System.out.println("Price:$699");
			System.out.println("Gst:18%");
			System.out.println("Total price:824.82");
			System.out.println("Thank you for Booking.....");
		break;
		
		}
			
			
			break;
		case 4:
			
			System.out.println("Here Avaliable colors are:");
			System.out.println("1.Red Shirt");
			System.out.println("Price:$299");
			System.out.println("\n");
			System.out.println("2.Yellow Shirts");
			System.out.println("Price:$399");
			System.out.println("\n");
			System.out.println("3.Green Shirts");
			System.out.println("Price:$489");
			System.out.println("\n");
			System.out.println("4.Pink Shirts");
			System.out.println("Price:$569");
			System.out.println("\n");
			System.out.println("5.Mustard Shirts");	
			System.out.println("Price:$699");
			System.out.println("\n");
			System.out.println("6.Cyan Shirts");	
			System.out.println("Price:$829");
			System.out.println("\n");
			System.out.println("Enter option from (1-6) to Select above products:");
			useropt1= scanner.nextByte();
			switch(useropt1) {
			case 1: 
				System.out.println("Product:Red Shorts");	
				System.out.println("Product id:0321");
				System.out.println("Price:$299");
				System.out.println("Gst:18%");
				System.out.println("Total price:352.82");
				System.out.println("Thank you for Booking.....");
				break;
			
			
		
		case 2:
			System.out.println("Product:Yellow Shorts");	
			System.out.println("Product id:0322");
			System.out.println("Price:$399");
			System.out.println("Gst:18%");
			System.out.println("Total price:452.82");
			System.out.println("Thank you for Booking.....");
		break;
		case 3:
			System.out.println("Product:Green Shorts");	
			System.out.println("Product id:0323");
			System.out.println("Price:$489");
			System.out.println("Gst:18%");
			System.out.println("Total price:577.02");
			System.out.println("Thank you for Booking.....");
		break;
		case 4: 
			System.out.println("Product:Pink Shorts");	
			System.out.println("Product id:0324");
			System.out.println("Price:$569");
			System.out.println("Gst:18%");
			System.out.println("Total price:671.42");
			System.out.println("Thank you for Booking.....");
		break;
		case 5:
			System.out.println("Product:Mustard Shorts");	
			System.out.println("Product id:0326");
			System.out.println("Price:$829");
			System.out.println("Gst:18%");
			System.out.println("Total price:978.22");
			System.out.println("Thank you for Booking.....");
		break;
		case 6:
			System.out.println("Product:Cyan Shorts");	
			System.out.println("Product id:0327");
			System.out.println("Price:$699");
			System.out.println("Gst:18%");
			System.out.println("Total price:824.82");
			System.out.println("Thank you for Booking.....");
		break;
		
		}
			
			break;
		case 6:
			System.out.println("Here Avaliable colors are:");
			System.out.println("1.Red Joggers");
			System.out.println("Price:$299");
			System.out.println("\n");
			System.out.println("2.Yellow Joggers");
			System.out.println("Price:$399");
			System.out.println("\n");
			System.out.println("3.Green Joggers");
			System.out.println("Price:$489");
			System.out.println("\n");
			System.out.println("4.Pink Joggers");
			System.out.println("Price:$569");
			System.out.println("\n");
			System.out.println("5.Mustard Joggers");	
			System.out.println("Price:$699");
			System.out.println("\n");
			System.out.println("6.Cyan Joggers");	
			System.out.println("Price:$829");
			System.out.println("\n");
			System.out.println("Enter option from (1-6) to Select above products:");
			useropt1= scanner.nextByte();
			switch(useropt1) {
			case 1: 
				System.out.println("Product:Red Joggers");	
				System.out.println("Product id:0321");
				System.out.println("Price:$299");
				System.out.println("Gst:18%");
				System.out.println("Total price:352.82");
				System.out.println("Thank you for Booking.....");
				break;
			
			
		
		case 2:
			System.out.println("Product:Yellow Joggers");	
			System.out.println("Product id:0322");
			System.out.println("Price:$399");
			System.out.println("Gst:18%");
			System.out.println("Total price:452.82");
			System.out.println("Thank you for Booking.....");
		break;
		case 3:
			System.out.println("Product:Green Joggers");	
			System.out.println("Product id:0323");
			System.out.println("Price:$489");
			System.out.println("Gst:18%");
			System.out.println("Total price:577.02");
			System.out.println("Thank you for Booking.....");
		break;
		case 4: 
			System.out.println("Product:Pink Joggers");	
			System.out.println("Product id:0324");
			System.out.println("Price:$569");
			System.out.println("Gst:18%");
			System.out.println("Total price:671.42");
			System.out.println("Thank you for Booking.....");
		break;
		case 5:
			System.out.println("Product:Mustard Joggers");	
			System.out.println("Product id:0326");
			System.out.println("Price:$829");
			System.out.println("Gst:18%");
			System.out.println("Total price:978.22");
			System.out.println("Thank you for Booking.....");
		break;
		case 6:
			System.out.println("Product:Cyan Joggers");	
			System.out.println("Product id:0327");
			System.out.println("Price:$699");
			System.out.println("Gst:18%");
			System.out.println("Total price:824.82");
			System.out.println("Thank you for Booking.....");
		break;
		
		}
		break;
		case 7:
			System.out.println("Here Avaliable colors are:");
			System.out.println("1.Red POLO T-Shirts");
			System.out.println("Price:$299");
			System.out.println("\n");
			System.out.println("2.Yellow POLO T-Shirts");
			System.out.println("Price:$399");
			System.out.println("\n");
			System.out.println("3.Green POLO T-Shirts");
			System.out.println("Price:$489");
			System.out.println("\n");
			System.out.println("4.Pink POLO T-Shirts");
			System.out.println("Price:$569");
			System.out.println("\n");
			System.out.println("5.Mustard POLO T-Shirts");	
			System.out.println("Price:$699");
			System.out.println("\n");
			System.out.println("6.Cyan POLO T-Shirts");	
			System.out.println("Price:$829");
			System.out.println("\n");
			System.out.println("Enter option from (1-6) to Select above products:");
			useropt1= scanner.nextByte();
			switch(useropt1) {
			case 1: 
				System.out.println("Product:Red POLO T-Shirts");	
				System.out.println("Product id:0321");
				System.out.println("Price:$299");
				System.out.println("Gst:18%");
				System.out.println("Total price:352.82");
				System.out.println("Thank you for Booking.....");
				break;
			
			
		
		case 2:
			System.out.println("Product:Yellow POLO T-Shirts");	
			System.out.println("Product id:0322");
			System.out.println("Price:$399");
			System.out.println("Gst:18%");
			System.out.println("Total price:452.82");
			System.out.println("Thank you for Booking.....");
		break;
		case 3:
			System.out.println("Product:Green POLO T-Shirts");	
			System.out.println("Product id:0323");
			System.out.println("Price:$489");
			System.out.println("Gst:18%");
			System.out.println("Total price:577.02");
			System.out.println("Thank you for Booking.....");
		break;
		case 4: 
			System.out.println("Product:Pink POLO T-Shirts");	
			System.out.println("Product id:0324");
			System.out.println("Price:$569");
			System.out.println("Gst:18%");
			System.out.println("Total price:671.42");
			System.out.println("Thank you for Booking.....");
		break;
		case 5:
			System.out.println("Product:Mustard POLO T-Shirts");	
			System.out.println("Product id:0326");
			System.out.println("Price:$829");
			System.out.println("Gst:18%");
			System.out.println("Total price:978.22");
			System.out.println("Thank you for Booking.....");
		break;
		case 6:
			System.out.println("Product:Cyan POLO T-Shirts");	
			System.out.println("Product id:0327");
			System.out.println("Price:$699");
			System.out.println("Gst:18%");
			System.out.println("Total price:824.82");
			System.out.println("Thank you for Booking.....");
		break;
		
		}
		break;
		case 8:
			System.out.println("Here Avaliable colors are:");
			System.out.println("1.Red Dhoties");
			System.out.println("Price:$299");
			System.out.println("\n");
			System.out.println("2.Yellow Dhoties");
			System.out.println("Price:$399");
			System.out.println("\n");
			System.out.println("3.Green Dhoties");
			System.out.println("Price:$489");
			System.out.println("\n");
			System.out.println("4.Pink Dhoties");
			System.out.println("Price:$569");
			System.out.println("\n");
			System.out.println("5.Mustard Dhoties");	
			System.out.println("Price:$699");
			System.out.println("\n");
			System.out.println("6.Cyan Dhoties");	
			System.out.println("Price:$829");
			System.out.println("\n");
			System.out.println("Enter option from (1-6) to Select above products:");
			useropt1= scanner.nextByte();
			switch(useropt1) {
			case 1: 
				System.out.println("Product:Red Dhoties");	
				System.out.println("Product id:0321");
				System.out.println("Price:$299");
				System.out.println("Gst:18%");
				System.out.println("Total price:352.82");
				System.out.println("Thank you for Booking.....");
				break;
			
			
		
		case 2:
			System.out.println("Product:Yellow Dhoties");	
			System.out.println("Product id:0322");
			System.out.println("Price:$399");
			System.out.println("Gst:18%");
			System.out.println("Total price:452.82");
			System.out.println("Thank you for Booking.....");
		break;
		case 3:
			System.out.println("Product:Green Dhoties");	
			System.out.println("Product id:0323");
			System.out.println("Price:$489");
			System.out.println("Gst:18%");
			System.out.println("Total price:577.02");
			System.out.println("Thank you for Booking.....");
		break;
		case 4: 
			System.out.println("Product:Pink Dhoties");	
			System.out.println("Product id:0324");
			System.out.println("Price:$569");
			System.out.println("Gst:18%");
			System.out.println("Total price:671.42");
			System.out.println("Thank you for Booking.....");
		break;
		case 5:
			System.out.println("Product:Mustard Dhoties");	
			System.out.println("Product id:0326");
			System.out.println("Price:$829");
			System.out.println("Gst:18%");
			System.out.println("Total price:978.22");
			System.out.println("Thank you for Booking.....");
		break;
		case 6:
			System.out.println("Product:Cyan Dhoties");	
			System.out.println("Product id:0327");
			System.out.println("Price:$699");
			System.out.println("Gst:18%");
			System.out.println("Total price:824.82");
			System.out.println("Thank you for Booking.....");
		break;
		
		}
		break;
	}
		
	 }
	public void LadiesWear() {
		
	}
	
	public void KidsWear() {
		
	}
}