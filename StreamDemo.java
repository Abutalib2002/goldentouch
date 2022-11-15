package Mypractice_Myself;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo {
public static void main(String[] args) {
	List <String> list = new ArrayList<String>();
	
	
list.add("hello");
list.add("hi");
list.add("java");
list.add("hi");
System.out.println(list);
System.out.println("-------------------------------------------------------------------------");
	list.stream().forEach((s1)->{System.out.println(s1);});
	System.out.println("----------------------------------------------------------------------");
list.stream().forEach(StreamDemo::Print);
System.out.println("---------------------------------------------------------------------------");

list.stream().forEach(System.out::println);

System.out.println("----------------------------------------------------------------------------");
long elements = list.stream().count();
System.out.println("No of elements: "+ elements);
System.out.println("-----------------------------------------------------------------------------");
long dis = list.stream().distinct().count();
System.out.println("No of Distinct Elements: " + dis);


Object o[] = list.stream().toArray();
System.out.println("--------------------------------------------------------------------------------");
for(Object e : o) {
	System.out.println(e);
}
long filter = list.stream().filter((s2)->{return s2.equals("hi");}).count();

System.out.println("--------------------------------------------------------------------------------");
System.out.println("No fo Times comes: " + filter);

List list1 = list.stream().map((s3)->{return s3.substring(1,2);}).toList();

System.out.println("-----------------------------------------------------------------------------------");
System.out.println(list1);





}
public static void Print(String s) {
	System.out.println(s);
}
}
