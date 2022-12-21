package MapColletions;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
public class Hashmap {
public static void main(String[] args) {
	HashMap <Integer,String>map = new HashMap<Integer,String>();
map.put(1011, "Abutalib");
map.put(1012, "talib");
map.put(1013, "alib");
map.put(1014, "ali");
map.put(1015, "Abu");
map.put(1016, "Abab");
map.put(1017, "Abaib");
map.put(1018, "Abi");
map.put(1019, "butalib");
for(Map.Entry x: map.entrySet())
{
	System.out.println(x.getKey() +" "+ x.getValue());
}
}
}
