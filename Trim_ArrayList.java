package ThisTobepractice;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class Trim_ArrayList {
public static void main(String[] args) {
	List <String> list = new ArrayList();
	list.add("hi");
	list.add("hekk");
	list.add("main");
	System.out.println("Before trim "+list);
	((ArrayList) list).trimToSize();
	System.out.println("After trim " + list);
}
}
