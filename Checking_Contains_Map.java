package MapColletions;
import java.util.Map;
import java.util.HashMap;
public class Checking_Contains_Map {
public static void main(String[] args) {
	HashMap <Integer,String> map = new HashMap<Integer,String>();
	
	map.put(1211, "vijay");
	map.put(1212, "vijay Prakash");
	map.put(1213, "vijay kumar");
	map.put(1214, "Arun vijay");
	map.put(1215, "vijay Moorthy");
	map.put(1216, "vijay Laxmi");
	System.out.println(map);
if (map.containsKey(1216))
{
	System.out.println("yes!..");
}
else
{
	System.out.println("No!...");
}
if (map.containsValue("vijay Prakash"))
{
	System.out.println("yes!..");
}
else
{
	System.out.println("No!...");
}


}
}
