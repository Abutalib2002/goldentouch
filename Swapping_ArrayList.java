package ThisTobepractice;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Swapping_ArrayList {
public static void main(String[] args) {
	List <String> list = new ArrayList<String>();
	list.add("a");
	list.add("b");
	list.add("c");
	list.add("d");
	list.add("ae");
	list.add("f");
	list.add("g");
	list.add("h");
	list.add("i");
	System.out.println("before swaping");
	System.out.println(list);
	Collections.swap(list, 5, 7);
	System.out.println("After swap");
System.out.println(list);

}
}
