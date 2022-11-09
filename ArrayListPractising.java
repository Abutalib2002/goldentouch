package Mypractice_Myself;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrayListPractising {
public static void main(String[] args) {
	
	new string();
}
}
class string{
	int choice;
	List <Integer> list1 = new ArrayList<Integer>();
	List <String> list = new ArrayList<String>();
	Scanner scan = new Scanner(System.in);
	public string() {
		
		do {
			System.out.println("1.Insert");
			System.out.println("2.Display");
			System.out.println("3.Search");
			System.out.println("4.Delete");
			System.out.println("5.Update");
			System.out.println("6.Clear");
			System.out.println("Enter the Choice: ");
			choice = scan.nextInt();
			switch(choice) {
			case 1:
				int opt;
				boolean trueOrfalse = true;
				do {
					System.out.println("Do you want Really continue press 1 for multiole entry  or 2 for Single entry"
							+ "");
	System.out.println("1)Yes"+" \t" + "2)No");
	opt = scan.nextInt();
	if(opt ==1) {
		trueOrfalse  = true;
	}
	else {
		trueOrfalse = false;
		break;
	}
					System.out.println("Enter the id:");
	int id = scan.nextInt();
	System.out.println("Enter the Employee name; ");
	String empname = scan.next();
	System.out.println("Enter the salary: ");
	int salary = scan.nextInt();
	
			list1.add(id);
	String result = ToString(id, empname, salary);
	list.add(result);
	
				

				}while(trueOrfalse);
				break;
			
			case 2:
	Iterator<String> iter  = list.iterator();
	while(iter .hasNext())
		{
		System.out.println(iter.next());
		}
		break;
			case 3: 
				
				System.out.println("Enter the ID  for search:");
				int serachId = scan.nextInt();
				int index = list1.indexOf(serachId);
				if(list1.contains(serachId)) {
					System.out.println("RECORD FOUND....");
					System.out.println(list.get(index));
				}
				else {
					System.out.println("RECORD NOT FOUND");
				}
				break;
			case 4:
				System.out.println("Enter the ID to delete:");
				int dlID = scan.nextInt();
	             int delind =			list1.indexOf(dlID); 
				if(list1.contains(dlID))
				{
					list.remove(delind);
				}
				else {
					System.out.println("RECORD NOT FOUND!......PLEASE ENTER THE VALID ID..........");
				}
				break;
			case 5:
				
			System.out.println("Enter the id:");
	int id = scan.nextInt();
	System.out.println("Enter the Employee name; ");
	String empname = scan.next();
	System.out.println("Enter the salary: ");
	int salary = scan.nextInt();
	
			list1.add(id);
	String result = ToString(id, empname, salary);
	
	if(list1.contains(id)) {
		int newInd = list1.indexOf(id);
		list.set(newInd, result);
	}else {
		System.out.println("RECORD IS NOT FOUND ..");
		System.out.println("Note: if you want to add this please go with insert option");
	}
	
				

				
				break;
			
			case 6:
				System.out.println("Do you want Erase all in list");
				System.out.println("1)Yes  or  2)No");
					
				int opt1 = scan.nextInt();
				
				if(opt1 == 1) {
			list.clear();
			System.out.println("RECORD IS DELEED SUCCESSFULLY!.........");
				}
				else {
					System.out.println("DELETE REQUEST IS CANCELED........");
				}
			break;
			}
	}while(choice != 0);
	}
	
	public String ToString(int id ,String EmpName,int salary) {
		return "Employee ID: "+ id+"  "+"Name: "+EmpName+"  " +"Salary: "+ salary;
		
	}
	
}
