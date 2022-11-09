package ThisTobepractice;
import java.util.List;
import java.util.ArrayList;
public class Joining_Two_ArraysList {
public static void main(String[] args) {
	List <String> list = new ArrayList<String>();
	List <String> list1 = new ArrayList<String>();
	list.add("a");
	list.add("b");
	list.add("c");
	list.add("d");
	list.add("e");
	list.add("f");
	list.add("g");
	list.add("h");
	list.add("i");
	
	list1.add("j");
	list1.add("k");
	list1.add("l");
	list1.add("m");
	list1.add("n");
	list1.add("o");
	list1.add("p");
	list1.add("q");
	list1.add("r");
	list1.add("t");
	list1.add("u");
	list1.add("v");
	list1.add("w");
	list1.add("x");
	list1.add("y");
	list1.add("z");
	
	List <String> list2 = new ArrayList<String>();
	list2.addAll(list);
	list2.addAll(list1);
	System.out.println("list 1:" + list);
	System.out.println("list 2:" + list1);
	System.out.println("list 3:");
	System.out.println(list2);
}
}
