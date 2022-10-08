#include<stdio.h>
int main(){
int number1,number2;
printf("Enter the number 1 & 2:");
scanf("%d%d",&number1,&number2)
if(number1 >= number2){
    if(number1 == number2){
        printf("result: %d = %d",number1,number2);
    }
    else{

        printf("Result: %d >%d",number1,number2);
    }
}
else{
    printf("Result: %d<%d",number1,number2);
}
return 0;

}
