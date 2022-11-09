package ThisTobepractice;
import java.util.List;
import java.util.ArrayList;

public class Spliting_ArrayList {
public static void main(String[] args) {
	List <String> list  = new ArrayList<String> ();
	list.add("hello");
	list.add("greetings");
	list.add("chineese");
	list.add("key board");
	list.add("Skeleton");
	System.out.println("Full list: " + list);
	System.out.println("part of list  " + list.subList(2, 5));
}
}
