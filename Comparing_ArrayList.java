package ThisTobepractice;
import java.util.List;
import java.util.ArrayList;
public class Comparing_ArrayList {
public static void main(String[] args) {
	List <String> list1 = new ArrayList<String> ();
	list1.add("red");
	list1.add("Green");
	list1.add("Yellow");
	list1.add("Blue");
	list1.add("Violet");
	list1.add("Purple");
	list1.add("White");
	list1.add("Black");
	
	System.out.println("The list 1 :");
	System.out.println(list1);
	
	List <String> list2 = new ArrayList<String> ();
	list2.add("red");
	list2.add("Green");
	list2.add("Yellow");
	list2.add("Blue");
	list2.add("Violet");
	list2.add("Purple");
	list2.add("White");
	list2.add("pink");
	System.out.println("The list 2 :");
	System.out.println(list2);
	
	
	List <String> list3 = new ArrayList<String>();
	for(String list : list1) {
		list3.add(list2.contains(list) ? "Yes" : "No");
		
	}
	System.out.println("list Answer : "  + 
			list3);
	
}
}
