
public class practice3{

    public static void main(String args[]){
      //Using conditional statements
      int a =11;
      // using if else to find odd or even
      if(a%2==0){
          
          System.out.println("Even ");
          
      }else{
          System.out.println("odd ");}
 //using if-else-if
 
 int b =80;
 if(b>90){
     System.out.println("pass ");
 
     
 }else if(b>95){
     System.out.println("Excellent ");
 
 }else if(b==80){
     
     System.out.println("Distinction");}
 else{System.out.println("fail ");}
 
 
      //nested if
      int c=96;
    int  d=86;
    if(c==96){
        if(d!=86){
            System.out.println("ok");
 
        }
    
    else{
         System.out.println("oops"); }}

    }
}
