package ThisTobepractice;
import java.util.List;
import java.util.ArrayList;
public class Replacing_Arraylist {
public static void main(String[] args) {
	List <String > list = new ArrayList<String>();
	list.add("yellow");
	list.add("White");
	
	System.out.println(list);
	list.set(1, "Green");
System.out.println(list);
}
}
