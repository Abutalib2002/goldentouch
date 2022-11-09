package ThisTobepractice;
import java.util.List;
import java.util.ArrayList;
public class PrintingElements_with_Index_ArrayList {
public static void main(String[] args) {
	List <String> list = new ArrayList<String>();
	list.add("poomex");
	list.add("poomer");
	list.add("Ramraj");
	System.out.println(list);
	
	for(int index = 0;index < list.size();index++)
	{
		System.out.println(list.get(index));
	}
}
}
