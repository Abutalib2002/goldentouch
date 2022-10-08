#include<stdio.h>
int main(){
int number;
printf("enter the number:\t");
scanf("5d",&number);
// true if the number is true
if(number%2 == 0){
    printf("%d is an even integer.",number);
}
else{
    printf("%d is an odd integer.",number);

}
return 0;

}
