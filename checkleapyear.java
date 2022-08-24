

public class checkleapyear{

    public static void main(String args[]){

 int year =2000;
 if(year%400==0){
 
 System.out.println("1)Leap year" + year);}
 else if(year%100==0){
 
 System.out.println("2)Leap year" + year);}
 else if(year%4==0){
 
 System.out.println("3)Leap year" + year);}
 else{
     System.out.println("Its not leap year");
 }
    }
}
