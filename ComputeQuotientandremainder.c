#include<stdio.h>
int main(){
int divident,divisor,quotient,remainder;
printf("enter the divident:");
scanf("%d",&divident);
printf("Enter the divisor:");
scanf("%d",&divisor);
// compute quotient
quotient = divident/divisor;
// compute reminder
remainder = divident%divisor;

printf("Quotient : %d\n",quotient);
printf("remaider : %d",remainder);

}
