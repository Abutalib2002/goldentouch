package ThisTobepractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_getting_Elements {
public static void main(String[] args) {
	List <String> list = new ArrayList<String>();
	list.add("qwerty");
	list.add("abcd");
	list.add("numeric");
	System.out.println(list);
String element = list.get(0);
System.out.println("The first element is : " + element);
element = list.get(2);
System.out.println("The third part element is : " + element);
}
}
