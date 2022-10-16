package JavaExercise;

public class PossibleDecalaration {
public static void main(String[] args) {
	System.out.println("Integer:");
	System.out.println();
	int one = 10;
	int One = 100;
	int ONE = 1000;
	int _one = 10000;
	int $one = 100000;
// printing int typea
	System.out.println("The value Stored in varaible name one:  "+ one);
	System.out.println("The value Stored in varaible name One:  "+ One);
	System.out.println("The value Stored in varaible name ONE:  "+ ONE);
	System.out.println("The value Stored in varaible name _one:  "+ _one);
	System.out.println("The value Stored in varaible name $one:  "+ $one);
System.out.println();

System.out.println("Byte:");
System.out.println();
// byte
	byte second = 01;
	byte Second = 001;
	byte SECOND = 0001;
	byte _second = 00001;
	byte $second = 000001;
	
	// printing byte 
	
	System.out.println("The value Stored in varaible name second:  "+ second);
	System.out.println("The value Stored in varaible name Second:  "+ Second);
	System.out.println("The value Stored in varaible name SECOND:  "+SECOND );
	System.out.println("The value Stored in varaible name _second:  "+ _second);
	System.out.println("The value Stored in varaible name $second:  "+ $second);
	System.out.println();
	
	System.out.println("Short:");
	System.out.println();
	// short
	
	short third = 300,Third = 301,THIRD = 302,_third = 303,$third = 304;
	System.out.println("The value Stored in varaible name third:  "+ third);
	System.out.println("The value Stored in varaible name Third:  "+ Third);
	System.out.println("The value Stored in varaible name THIRD:  "+ THIRD);
	System.out.println("The value Stored in varaible name _third:  "+ _third);
	System.out.println("The value Stored in varaible name $thrd:  "+ $third);
	
	System.out.println();
	
	System.out.println("Long:");
	System.out.println();
	// long 
	long long1 = 321,lonG = 325,LONG = 4556,_long = 444894,$long = 4564;
	System.out.println("The value Stored in varaible name long1:  "+ long1);
	System.out.println("The value Stored in varaible name lonG :  "+ lonG);
	System.out.println("The value Stored in varaible name LONG:  "+ LONG);
	System.out.println("The value Stored in varaible name _long:  "+ _long);
	System.out.println("The value Stored in varaible name $long:  "+ $long);	
	System.out.println();
	System.out.println("Float:");
	System.out.println();
	// float double
	float Float = 12.5f,FLOAT = 13.5f,float1 = 15.6f,_float = 16.25f,$float = 45.58f;
	
	
	System.out.println("The value Stored in varaible name float1:  "+ float1);
	System.out.println("The value Stored in varaible name Flaot:  "+ Float);
	System.out.println("The value Stored in varaible name FLOAT:  "+ FLOAT);
	System.out.println("The value Stored in varaible name _flaot:  "+ _float);
	System.out.println("The value Stored in varaible name $float:  "+ $float);
	
	System.out.println();
	
	System.out.println("double:");
	System.out.println();
	// double
	
	double Double = 32.55676,DOUBLE = 45.544,double1 = 58.154,_double = 487.4874,$double = 124.359;
	System.out.println("The value Stored in varaible name double1:  "+ double1);
	System.out.println("The value Stored in varaible name Double:  "+ Double);
	System.out.println("The value Stored in varaible name DOUBLE:  "+ 	DOUBLE);
	System.out.println("The value Stored in varaible name _double:  "+ _double);
	System.out.println("The value Stored in varaible name $double:  "+ $double);
	
	
	
	//Type casting
	
	// implicit casting
	System.out.println();
	System.out.print("\t\t\t");
	System.out.print("Implicit type Casting:");
	System.out.println();
	int Integer;
	short Short = 120;
	Integer = Short;
	
	System.out.println();
	System.out.println("Integer type casting short value give into int:  "  + Integer);
	System.out.println();
	
	short sHort;
	byte Byte = 125;
	sHort = Byte;
	System.out.println();
	System.out.println("Integer type casting byte value give into short:  "  + sHort);
	System.out.println();
	
	long LONg;
	int intge = 235;
	LONg = intge;
	System.out.println();
	System.out.println("Integer type casting int value give into long:  "  + LONg);
	System.out.println();
	
	
	System.out.println();
	System.out.print("\t\t\t");
	System.out.print("Explicit type Casting:");
	System.out.println();
	
	double doubleval = 1.25;
	int intval = (int)doubleval;
	System.out.println();
	System.out.println("Integer type casting double value give into int:  "  + intval);
	System.out.println();
	
	int i = 546;
	double d = (double)i;
	System.out.println();
	System.out.println("Integer type casting int value give into double:  "  + d);
	System.out.println();
	
}
}
