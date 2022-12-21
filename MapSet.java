package MapColletions;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class MapSet {
public static void main(String[] args) {
	Map <String,String> map = new HashMap<String,String>();
	map.put("102123", "Harish");
 map.put("102124", "mahesh");
 map.put("101215", "Abutalib");
 System.out.println(map);
	String s=map.get("102124");
	System.out.println(s);
	Set set = map.entrySet();
Iterator iter = set.iterator();
while(iter.hasNext())
{
	
	Map.Entry me =(Map.Entry) iter.next();
	 System.out.println(me.getKey());
System.out.println(me.getValue());
}

}
}
