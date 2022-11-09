package ThisTobepractice;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Reverse_ArrayList {
public static void main(String[] args) {
	List <String> list  = new ArrayList<String> ();
	list.add("hello");
	list.add("greetings");
	list.add("chineese");
	list.add("key board");
	System.out.println("Before Reversing");
	System.out.println(list);
	Collections.reverse(list);
	System.out.println("After reversing");
	System.out.println(list);
}
}
