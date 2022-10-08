// working with logical operator
#include<stdio.h>
int main(){
int a,b,c,result;
 a = 10;
 b = 10;
 c = 65;
 result = (a  == b)&&(c  > b);
 printf("(a == b)&& (c>b) is %d\n",result);

 result = (a  == b)&&(c  < b);
 printf("(a == b)&& (c<b) is %d\n",result);
 result = (a  == b)&&(c  < b);
 printf("(a == b)|| (c<b) is %d\n",result);
 result = (a  == b)||(c  > b);
 printf("(a == b)|| (c>b) is %d\n",result);
 result = !(a  != b);
 printf("!(a  != b) is %d\n",result);
 result = !(a  == b);
 printf("!(a  == b) is %d\n",result);


}
