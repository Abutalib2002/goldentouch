package ThisTobepractice;

import java.util.ArrayList;
import java.util.List;

public class Searching_Elements_ArrayList {
public static void main(String[] args) {
	List <String> list = new ArrayList<String> ();
 list.add("one");
 list.add("two");
 list.add("three");
 list.add("Four");
 System.out.println(list);
 System.out.println("searching one ");
 if(list.contains("one"))
 {
	 System.out.println("found");
 }
 else {
	 System.out.println("not found");
 }
 
 
}
}
