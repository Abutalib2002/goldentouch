package MapColletions;
import java.util.Map;
import java.util.HashMap;
public class Add_All_Elements_Hashmap {
public static void main(String[] args) {
	HashMap <Integer,String> map = new HashMap<Integer,String>();
	map.put(1211, "vijay");
	map.put(1212, "vijay Prakash");
	map.put(1213, "vijay kumar");
	map.put(1214, "Arun vijay");
	map.put(1215, "vijay Moorthy");
	map.put(1216, "vijay Laxmi");
	System.out.println(map);
	
	HashMap <Integer,String> map1 = new HashMap<Integer,String>();
	map1.put(1511, "Ajay");
	map1.put(1512, "Ajay Prakash");
	map1.put(1513, "Ajay kumar");
	map1.put(1514, "Arun ");
	map1.put(1515, " Moorthy");
	map1.put(1516, " Laxmi");
	System.out.println();
	System.out.println(map1);
	
	map1.putAll(map);
	System.out.println();
	System.out.println(map1);
	
}
}
