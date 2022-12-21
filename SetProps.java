package MapColletions;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetProps {
public static void main(String[] args) {
	Set myset = new HashSet();
	myset.add("a");
	myset.add("hello");
	myset.add("akler");
	System.out.println(myset);
	Iterator iter = myset.iterator();
	
while(iter.hasNext()) {
	System.out.println(iter.next());
}
}
}
