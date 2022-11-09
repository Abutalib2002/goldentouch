package ThisTobepractice;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Copying_ArrayList {
public static void main(String[] args) {
	List <String > list = new ArrayList<String>();
	
	
	list.add("1");
	list.add("2");
	list.add("3");
	System.out.println("list 1");
	System.out.println(list);
	List <String > list1 = new ArrayList<String>();
	
	list1.add("a");
	list1.add("b");
	list1.add("c");
	System.out.println("list 2");
	System.out.println(list1);
	Collections.copy(list, list1);
	System.out.println("list 1");
System.out.println(list);
System.out.println("list 2");
System.out.println(list1);

}
}
