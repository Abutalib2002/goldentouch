package ThisTobepractice;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Shuflle_Arraylist {
public static void main(String[] args) {
	List <String> list  = new ArrayList<String> ();
	list.add("hello");
	list.add("greetings");
	list.add("chineese");
	list.add("key board");
	System.out.println("Before shuffle");
	System.out.println(list);
	Collections.shuffle(list);
	System.out.println("After shuffle");
	System.out.println(list);
}
}
