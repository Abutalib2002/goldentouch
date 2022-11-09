package Classpractice;

public class ClassDemo {
public static void main(String[] args) {
	programminglanguage code = new java ();
	code = new JavaScript();
	code = new python();
	code = new kotlin();
	Hospital health_care = new doctor();
	health_care = new componder();
	health_care =  new Nurse();
	
	
	School_Subjects schoolsub = new social();
schoolsub = new Science();
 }
}


abstract class programminglanguage{
	
}
class java extends programminglanguage{
	public java() {
	System.out.println("Java is Programming language which is also represent as object oriented  language");
	
	System.out.println();}
}
class python extends programminglanguage {
	public python() {
	System.out.println("python is a machine learing Programming language");
	System.out.println();}
}
class JavaScript extends programminglanguage{
	public JavaScript() {
	System.out.println("javascript is Scripting  language which is used to giving Behaviour to web page ");
System.out.println();	}
}

class kotlin extends programminglanguage{
	public kotlin() {
	System.out.println("kotlin is the applicationdevelopement Language used to develope application");
	System.out.println();}
}





abstract class Hospital{
	String HospitalName ="KSI HOSPITAL";
}


class doctor extends Hospital{
public doctor() {
System.out.println("im a doctor " + super.HospitalName);
}}
class Nurse extends Hospital{
	public Nurse() {
	System.out.println("im a nurse "+ super.HospitalName);
	}
}
class componder extends Hospital{
	public componder() {
	System.out.println("Im a Componder "+ super.HospitalName);
	}
}




abstract class School_Subjects{
	String School_name = " Bright Shine";
}

 
  class social extends School_Subjects {
	  public social() {
		System.out.println("Social sience "  + super.School_name);
	}

  }
  class Science extends School_Subjects{
public Science() {
	
System.out.println("Science "+ School_name);
}		  
	  }
  