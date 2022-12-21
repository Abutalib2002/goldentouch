package MapColletions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
public class prope4rties_Collections {
public static void main(String[] args) throws FileNotFoundException, IOException {
Properties prop = new Properties();	
/*
 * prop.put(1001, "Arun"); prop.put(1002,"Hameed"); //System.out.println(prop);
 *///System.out.println(prop.get("1002"));

prop.load(new FileInputStream("java programs.properties"));
Set myset = prop.entrySet();
Iterator iter = myset.iterator(); 
while(iter.hasNext()) {
	Map.Entry me = (Map.Entry) iter.next();
	System.out.println(me.getKey());
	System.out.println(me.getValue());
}
String s1 = "\u001B[33m",s2 = "\u001B[37m", s= "< Peacky Coder >";
System.out.println("\t\t\t\t\t\t\t"+s1+s +s2);
}
}
