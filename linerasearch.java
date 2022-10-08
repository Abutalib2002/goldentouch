package Assignment1;
import java.util.ArrayList;
import java.util.Scanner;
public class linerasearch {
public static void main(String[] args) {
	int aray[];
	Scanner scan = new Scanner(System.in);
	int val = 5;
	aray = new int [val];
	int get = 5;
	for(int i = 0;i < val;i++) {
	System.out.println("enter the araay elemts" + i);
		aray [i] = scan.nextInt();
	}
	scan.close();
	Linearsearcharray(aray, get);
	System.out.println("The index of the given key number  "+get+" is " + LinearSearchIndex(aray, get) );
}


public static int Linearsearcharray(int[] array,int key) {

	for(int  align:array) {
	if(align == key) {
		System.out.println(" the element "+key+"  is found!...");
		
	
	}
	



}

return 0;

}
public static int LinearSearchIndex(int array[],int key)
{
	int index = 0;
 for(int i = 0;i<array.length;i++) {
	 
	 if(array [i] == key)
	 {
		 index =i;
	 }
 }
 
 
 



return index;


}}
