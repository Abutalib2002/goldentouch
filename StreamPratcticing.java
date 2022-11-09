package Mypractice_Myself;
import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
public class StreamPratcticing {
public static void main(String[] args) throws InterruptedException {
	
	
	System.out.println();
String s = "Welcome to Peaky Cure Center";
System.out.print("\t\t\t\t\t");
for(int i = 0;i<s.length();i++) {
	
	System.out.print(s.charAt(i));
	Thread.sleep(150);
}
int opt;
do {
	new Hospital();
System.out.println();
System.out.print("\t\t\t\t\t");
System.out.println("1.Doctor Register");
System.out.print("\t\t\t\t\t");
System.out.println("2.Patient Register");
System.out.print("\t\t\t\t\t");
System.out.println("3.Display");
System.out.print("\t\t\t\t\t");
System.out.println("4.Patient count");
System.out.print("\t\t\t\t\t");
System.out.println("5.Reject All Patients (This is for doctoers only)");
System.out.print("\t\t\t\t\t");

System.out.println();
Scanner scan11 = new Scanner (System.in);

System.out.print("\t\t\t\t\t");
System.out.println("Enter option: ");
opt = scan11.nextInt();
Hospital hospital = new Hospital();

switch(opt) {
case 1:
	System.out.println("\t\t\t\t\t\t");
	hospital.doctorRegister();
	break;
case 2:
	hospital.PatientRegister();
	break;
case 3:
	hospital.Display();
	break;
case 4:
System.out.println("Total Number of Patients are: " + hospital.patientCount());
break;
case 5:
	System.out.println("Do you really want to Reject all patients: " );
	System.out.println("1.Yes or 2. No");
int opt1 = scan11.nextInt();

if(opt1 == 1) {
	hospital.patientClear();
}
else {
	System.out.println("RECORD IS SAFE........");
}
break;

}
}while(opt != 0 );
}
}

class Hospital{
	private String Doctorspecification;
private	String Doctorname;
	private int Doctorexperince;

	
	private String patientname;
	private int patientage;
	private   long patientNumber;
	private String patientArea;
	private String patientDesease;
	private String Patientsattempt;
	List <String>Doctors = new ArrayList<String>();
	List <String>Patient_Booked = new ArrayList<String>();
	Scanner scan = new Scanner(System.in);
	public void doctorRegister() {
		System.out.println("Enter the Name: ");
		String dname = scan.nextLine();
		System.out.println("Enter the Specialisation: ");
		String dspecification = scan.nextLine();
		System.out.println("Eneter the Experience: ");
		int  dexp = scan.nextInt();
		Doctors.add(doctorRegisterAdd(dname, dspecification, dexp));
		
		 
	}
	
	
	
	
	public String doctorRegisterAdd(String name,String specifi,int exp)
	{
		this.Doctorname = name;
		this.Doctorexperince = exp;
		this.Doctorspecification = specifi;
		return "Name : " + Doctorname + "  " +"Specification : "+Doctorspecification+ "  " + "Experience: "+ Doctorexperince+ " ";
	}
	
	
	
	public void PatientRegister() {
		System.out.println("Enter the Name of Patient: ");
		String sname = scan.nextLine();
		System.out.println("Enter the Age of patient: ");
		int age = scan.nextInt();
		System.out.println("Enter the Phone Number: ");
		long phno = scan.nextLong();
		System.out.println("Enter the Cause for Consulation");
		String cause = scan.nextLine();
		System.out.println("Enter the Attenting times (like first time or second time): ");
	String atempt = scan.nextLine();
	System.out.println("Enter the Area: ");
	String area = scan.nextLine();
	
	
	this.Patient_Booked.add(patientRegisterAdd(sname, age, phno, cause, atempt, area));
	
	
	
	}
	
	public String patientRegisterAdd(String name,int age,long pno,String cse,String ate,String area)
	{
		
		this.patientname  = name;
		this.patientage = age;
		this.patientNumber = pno;
		this.patientDesease = cse;
		this.Patientsattempt = ate;
		this.patientArea = area;
		return "Patient Name: " + patientname + " "+ "Patient Age: "+ patientage+ " " + "Patient Contact: " + patientNumber+" "+ "Patient Problem: " +patientDesease + " " + "Patient Vist:  "+ Patientsattempt + " "+ "Patient Area: "+ patientArea+ " ";
	}
	
	
	public void   Display(){
	System.out.println("Do you want display list of : ");
	System.out.println("1.Doctors list");
	System.out.println("2.Patient list");
	int Choice = scan.nextInt();
	switch(Choice) {
	case 1:
		 Doctors.stream().forEach(System.out::println);
		
		break;
	case 2:
		Patient_Booked.stream().forEach(System.out::println);
		
		break;
	default: 
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("Enter valid option......");	
		System.out.println("-----------------------------------------------------------------------------------------------------");
	}
	
	
	
	
	}
	public long patientCount() {
	return Patient_Booked.stream().count(); 
	}
	
	
	public void patientClear() {
		Patient_Booked.clear();
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


