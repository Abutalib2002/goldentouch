package ThisTobepractice;
import java.util.List;
import java.util.ArrayList;

public class clone_Arraylist {
public static void main(String[] args) {
	List <String> list = new ArrayList<String> ();
	
	list.add("abcd");
	list.add("hiujk");
	System.out.println("Oringinal:");
	System.out.println(list);
	List <String> list1 = (ArrayList<String> )list;

System.out.println("copy");
System.out.println(list1);

}
}
