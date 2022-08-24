
public class practice5{

    public static void main(String args[]){



//  to find qouttined and reminder;

int a=5;
int b=9;
int q = a/b;
int r = a%b;
System.out.print("The Quotient value a" + "\t"  + a + "\t" +  " and b" + "\t" + b + "is:" + q +"\n");
System.out.print("The  value remainder a"+"\t"+ a  + "\t"+  " and b" + "\t" + b +"is:" +"\t"+ r +"\n");


// using for loop to add numbers
int c,d,f;
f=0;
c=10;
for(d=1;d<=c;++d){
    
    f+=d;
    System.out.println(f);
}
System.out.println(f);

//using do while loop to add numbers
int e=10,g=0;
do{
   System.out.println("Entered number is :" + e);
   g+=e;
    --e;    
}while(e!=0);
    }
}
