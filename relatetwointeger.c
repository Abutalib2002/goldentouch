#include<stdio.h>
int main(){


int number ,number1;
printf("enter the number:");
scanf("%d%d",&number,&number1)
if(number == number1){
    printf("%d = %d",number,number1);

}else if(number>number1){
printf("%d > %d");
}
else{
    printf("%d < %d");
}
return 0;

}
