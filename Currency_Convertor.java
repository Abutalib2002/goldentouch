
package Mypractice_Myself;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Currency_Convertor {

public static void main(String[] args) {
	Convertor con = new Convertor(); 
con.Convert();
}
}

class Convertor{
	double inr;
	double Currency_rate;
	double inr_To_Currency;
	public void Convert() {
		
		Map <String,Double> map = new HashMap<String,Double>();
		map.put("1.Dollar",82.74);
		map.put("2.Euro",80.70 );
		map.put( "3.Kuwait Dinar",266.20);
		map.put( "4.Emirat Dhiram(Dubai)",22.52);
		map.put( "5.Canadian Dollar",60.26);
		
		Set set = map.entrySet();
		Iterator iter = set.iterator();
		while(iter .hasNext()) {
			Map.Entry me = (Map.Entry) iter.next();
			System.out.println(me.getKey());
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount conver it to all:");
		double inr = scan.nextDouble();
	
		do {
			Map.Entry me = (Map.Entry) iter.next();	
		Currency_rate =(double) me.getValue();
		inr_To_Currency = inr * Currency_rate;
		
		
		
		}while(iter.hasNext());
	}
}