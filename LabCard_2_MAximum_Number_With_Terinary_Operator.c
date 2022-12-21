#include<stdio.h>
#include<conio.h>
void  main(){

int  result, first_value,Second_value,Third_Value;
printf("\n\n\nEnter the First Value : ");
scanf("%d",&first_value);
printf("\n\n\nEnter the Second Value  : ");
scanf("%d",&Second_value);
printf("Enter the Third value : ");
scanf("%d",&Third_Value);
result = (first_value > Second_value ) ? ((first_value > Third_Value) ? first_value : Third_Value) : ((Second_value > Third_Value)  ? Second_value : Third_Value);
printf("The Greatest value is : %d ",result);




getch();



}
