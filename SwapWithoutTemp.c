#include<stdio.h>
int main(){

doube a,b;
printf("Enter value a:");
scanf("%d",&a);
printf("Enter value b:");
scanf("%d",&b);

a = a-b;
b = a + b;
a = b -a;
printf("after swap a: %d",a);
printf("After swap b: %d",b);
return 0;
}
