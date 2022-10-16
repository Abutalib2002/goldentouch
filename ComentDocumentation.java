package JavaExercise;
import java.util.Scanner;
public class ComentDocumentation {
public static void main(String[] args) {
	/**
	 * this program to allow user to check given details is right or wrong
	 * get input from user
	 * ask user to  check once or not
	 * if user choose check 
	 * it print details entered by user
	 * if user chose no means it prints error Message And  thank you
	 */
		
		
		String name;
		String Age;
		String Profession;
		String User_name;
		String Ph_No;
		String Email;
		
		
		Scanner Scan = new Scanner (System.in);
		System.out.print("enter the name: ");
name = Scan.nextLine();
System.out.println();
		System.out.print("Enter the age: ");
		Age = Scan.nextLine();
		System.out.println();
		System.out.print("enter the Profession:");
		Profession = Scan.nextLine();
		System.out.println();
		System.out.print("Enter the user name: ");
		User_name = Scan.nextLine();
		System.out.println();
		System.out.print("Enter the Phone Number: ");
		Ph_No = Scan.nextLine();
		System.out.println();
		System.out.println("enter the Email: ");
		Email = Scan.nextLine();
		
		
		
		// printing all values
		System.out.println();
		System.out.println();
		System.out.println("Name: "+name);
		System.out.println("Age: "+ Age);
		System.out.println("Profession: "+ Profession);
		System.out.println("User Name: "+User_name);
		System.out.println("Phone Number: "+Ph_No);
		System.out.println("E-Mail: "+Email);
		
		
		
		
		
		
		
		
		
		
		// checking user details is correct or not
		
		
		
		System.out.println("Entered details is correct ?");
		System.out.println("1.Yes"+ "\t"+"2.No");
		int userConfirm = Scan.nextInt();
		switch(userConfirm)
		{
		case 1:{System.out.println("Register Succesfully!.....");
		System.out.println();
		System.out.print("\t\t\t\t" + "Thank you!.....");
		break;}
		case 2:{
			System.err.println("1.Refresh Program");
			System.err.println("2.Enter Details again");
			System.err.println("3.Repeat task untill Enterd Correctly");
			System.out.println();
			System.out.print("\t\t\t\t" + "Thank you!.....");
			
			
			break;
		}
		}
		
		
		Scan.close();
		
}
	
}
