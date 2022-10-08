package Assignment1;

import java.security.DomainCombiner;

public class GCDRECURSIVE {
public static void main(String[] args) {
	int a = 30;int b = 20;
System.out.println(gcd1(b, a));
}
public static int gcd1(int a,int b) {
	
	
	int i ;
	if(a<b)
		i = a;
	else
		i = b;
	for(i =1;i>1;i--){
		if(a%i == 0 && b%i == 0) {
			return i;
		}
		
	}
	return 1;
}}
