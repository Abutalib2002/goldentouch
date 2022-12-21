#include<stdio.h>
int Add(int number,int number1)
{
    printf("The value of first is : %d \n The value of Second is : %d \n The addition value : %d \n" , number,number1,number  + number1);


}

int Multiply(int number,int number1)
{
    printf("The value of first is : %d \n The value of Second is : %d \n The multiplication value : %d \n" , number,number1,number  * number1);


}
int Divide(int number,int number1)

{

    printf("The value of first is : %d \n The value of Second is : %d \n The Division value : %d \n" , number,number1,number  / number1);


}
int subtract(int number,int number1)
{

int temp;
if (number1 > number){
    temp = number;
    number  = number1;
    number1 = temp;
}
    printf("The value of first is : %d \n The value of Second is : %d \n The subtract value : %d \n" , number,number1,number  - number1);


}
void main(){
int num,num11;
printf("Enter the Number 1 : ");
scanf("%d",&num);
printf("Enter the Number 2 : ");
scanf("%d",&num11);

Add(num,num11);
subtract(num,num11);
Multiply(num,num11);
Divide(num,num11);

getch();

}
