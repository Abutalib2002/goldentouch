package MapColletions;
import java.util.List;
import java.util.ListIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;
public class Practice1 {
public static void main(String[] args) {
	List  list = new ArrayList();
	
	list.add("array");
	list.add("String");
	list.add("int");
	list.add("boolean");
	
	System.out.println(list.size());
	
	list.remove(2);
System.out.println(list);
System.out.println(list.get(0));
int i = 0;
while(i < list.size())
{
	System.out.println(list.get(i));
	i++;
	
	
}



System.out.println(list.contains("atta"));
System.out.println(list.isEmpty());
list.clear();
System.out.println(list.isEmpty());
for(int i1 = 0 ;i1 < 15;i1++) {
	list.add(i1);
}
System.out.println(list);


Iterator iter = list.iterator();

while(iter.hasNext())
{
	System.out.println(iter.next());
}
System.out.println();
System.out.println();
ListIterator liter = list.listIterator(i);

while(liter.hasNext())
{
	System.out.println(liter.next());
}
System.out.println();

while(liter.hasPrevious())
{
	System.out.println(liter.previous());
}




}
}
