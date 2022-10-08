package Assignment1;


import java.util.Scanner;
public class Binarysearch {
public static void main(String[] args) {
	int arra[] = {1,2,3,4,5,6};
	
	int fidx = arra[0];
	int tidx = arra[5];
	int key = 3;
	binSearch(arra, key, fidx, tidx);
}
public static boolean binSearch(int array[],int key,int fromidx,int toidx) {
int middleidx;

System.out.println("First index is" + fromidx);
System.out.println("Second index is" + toidx);
System.out.println("The key is " + key);
if (fromidx == toidx -1) {
		if (key == array[fromidx]) {
			return true;
		}
		else {
			return false;
		}
	}
	else {
		middleidx = fromidx +toidx /2;
		if(key == array[middleidx])
		{
			
			return true;
		}
		else if(key < array[middleidx]) {
			toidx = middleidx;
		}
		else {
			fromidx = middleidx  + 1;
		}
		}
	
	
binSearch(array, key, fromidx, toidx);
System.out.println("middle index is :" + middleidx );
	return true;
}
}
