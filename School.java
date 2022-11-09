package Mypractice_Myself;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class School {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String Cyan = "\u001B[36m",WhiteAgent = "\u001B[37m",line = "\n", space  = "  ",tabcenter = "\t\t\t\t\t\t",dot = ".............",tab = "\t",greenAgent = "\u001B[32m",BlueAgent = "\u001B[34m",RedAgent = "\u001B[31m",Yellowgent = "\u001B[33m";
	// Print the name of the School
	System.out.println(tabcenter + dot+"Welcome to ShineBrain School"+dot + line);
	System.out.println(tabcenter + dot + "Train Your Brain with us to Shine your Life "+dot);
	
	// Printing Line 
	System.out.println();
	
	List <String>Students = new ArrayList<String>();
	List <Integer>Students_ID = new ArrayList<Integer>();
	int Student_Count;
	String arr [];
	int Class;
	int age;
	int choice;	
	int rollno;
	System.out.println();
System.out.println(tabcenter+"Here our Actions are: "+line);do {
System.out.println(tabcenter+ greenAgent + "1)Register The Student id"+line);
System.out.println(tabcenter + RedAgent+"2)Display Register Students"+ line);
System.out.println(tabcenter  + "\u001B[34m" + "3)Number of Students Registered"+line);
System.out.println(tabcenter + "\u001B[32m" + "4)Removing Students "+ line);

System.out.println(Yellowgent);
System.out.print(tabcenter+"Enter your choice: ");
choice = scan.nextInt();
System.out.println(Cyan);
switch(choice) {


case 1:
	System.out.println(line);
	System.out.print(tabcenter+"Enter the Total Number Students:  " );
	 Student_Count  = scan.nextInt();
	
		arr  = new String [Student_Count];
	int StudentNumber = 1;
	for (int i =0 ;i<Student_Count;i++)
	{
		System.out.println();
		System.out.print(Cyan+tabcenter + "Enter the Student  RollNo "+StudentNumber+": " );
arr[i] = scan.next();
System.out.println();
System.out.print(Cyan+tabcenter + "Enter the " + arr[i] + space +"Class: ");
Class = scan.nextInt();
System.out.println();
System.out.print(Cyan+tabcenter+"Enter the Age of the  " + arr[i] +  " :"+ space);
age = scan.nextInt();
System.out.println();
System.out.print(Cyan+tabcenter+"Enter the Id of The "+arr[i]+" :" + space);
rollno = scan.nextInt();
if((Class > 12 || Class < 1) && (age >19 || age < 5 ) ) {
	System.out.println();
	System.out.println(Cyan +tabcenter+ dot+dot+dot+dot+dot);
	System.out.println(tabcenter+ "NOTE: ");
	System.out.println(line+tabcenter+"Enter the valid class or Age of the Student " + arr[i]);
System.out.println();
System.out.println(Cyan + tabcenter+dot+dot+dot+dot+dot);
System.out.println();
	break;
}
else {
	
Students_ID.add(rollno);
Students.add(Students(rollno, arr[i], age, Class));


StudentNumber++;

}
System.out.println(WhiteAgent);
	}
	break;
case 2:
	
	System.out.println(Cyan+tabcenter+dot+dot+dot+dot+WhiteAgent);
	
	System.out.println();
	Iterator iter = Students.iterator();
	while(iter.hasNext()) {
		System.out.println(tabcenter + iter.next());
	}
	System.out.println(Cyan+tabcenter + dot+dot+dot+dot+ WhiteAgent);

	break;
case 3:
	System.out.println();
	long Studentcount  = Students.stream().count();
	System.out.println(tabcenter+"Number of Students Register is: " + Studentcount);
	System.out.println();
	break;
case 4:
	System.out.println();
	System.out.print(tabcenter+"Enter the Student id :" );
	int stdid = scan.nextInt();
	
	if(Students_ID.contains(stdid)) {
		
		int index = Students_ID.indexOf(stdid);
	Students.remove(index);
	System.out.println();
	System.out.println(tabcenter+"Record Deleted SuccesFully!............"+line);
	}
	else {
		System.out.println(line + tabcenter+ "Record is not Found ........." + line);
	}
	break;
	
default:System.out.println(line + tabcenter + "Enter the valid option"+ line);	
}
	
	
	
}while(choice != 0);	
	
}
public static String Students(int Rollno,String name,int age,int Class) {
	String Space = "  ",line = "\n", line2 = "\n\n",tabcenter ="\t\t\t\t\t\t\t";;
	
	String greenAgent = "\u001B[32m",BlueAgent = "\u001B[34m",RedAgent = "\u001B[31m",YellowAgent = "\u001B[33m",WhiteAgent = "\u001B[37m";
String	ReturnString  = "\t"+"Roll No: " +RedAgent+ Rollno + Space +WhiteAgent+line+tabcenter+ "Name: " + YellowAgent+name +Space +line+tabcenter+WhiteAgent+ "Age: " + greenAgent+age + Space +line+tabcenter+WhiteAgent+ "Class: " +BlueAgent+ Class + WhiteAgent + line2 + tabcenter; 
return ReturnString;
}
}