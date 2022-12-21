package MapColletions;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class setprops2 {
public static void main(String[] args) {
	print();
	creator crt = new creator();
	crt.setTree();
	
    new SUrname();
}
public static void print() {
	
	String s = "I'm a Peacky Coder";
	System.out.println();
	System.out.print("\t\t\t\t");
	
	
		System.out.print( "\u001B[33m" + s+ "\u001B[37m");
	System.out.println();
}
}

class creator{
	void setTree() {
	Set<String> set = new TreeSet<String>(new MyComparable());
	set.add("miskin");
	set.add("Lokesh kangaraj0");
	set.add("atlee0");
	set.add("shankar");
	set.add("kamal hasan");
	set.add("KS ravi kumar");
	System.out.println(set);
	
	
	}
}
class MyComparable implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}
	
}





class SUrname{
	public SUrname() {

		System.out.println();
		System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t");
	System.out.print("\u001B[33m" + " - Peacky Coder."+ "\u001B[37m");
	}
}