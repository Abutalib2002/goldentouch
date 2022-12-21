#include<stdio.h>

int line(){

for (int i = 0;i<25; i++){
    printf(">>>");
}


}
void main (){

int i = 10;


// using increament operator
printf("\n\n\n\t\t\tThe value of i is : %d\n\n",i);
line();
// post increament
printf("\n\n\n\t\t\tThe value of post increament operation is : %d\n\n",i++);

printf("\t\t\tThe value of i after increament is : %d \n\n",i );
// pre- increament
line();
i =10;
printf("\n\n\n\t\t\tThe value of pre-increament is : %d\n\n ",++i);
printf("\t\t\tThe value of i after pre-increament : %d\n\n\n",i);
line();
i = 10;
printf("\n\n\n\t\t\tThe value of i : %d",i);
printf("\n\n\t\t\tThe value of post decreament is : %d\n\n\n",i--);
line();
i = 10;
printf("\n\n\n\t\t\tThe value of i : %d",i);
printf("\n\n\t\t\tThe value of after pre-decreament i : %d\n\n\n",--i);
line();
}
