package ThisTobepractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorting_ArrayList {
public static void main(String[] args) {
	System.out.println("Sorting Array list..");
	List <String> list = new ArrayList<String>();
	
	list.add("b");
	list.add("g");
	list.add("d");
	list.add("a");
	list.add("f");
	System.out.println("Before sort");
	System.out.println(list);
System.out.println("After sort");
	Collections.sort(list);
	System.out.println(list);
}
}
