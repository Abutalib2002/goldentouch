#include<stdio.h>

int swap_with_third_variable(int a, int b){

int temp = a;
 a = b;
 b = temp;
 printf("The given swap with third variable value is %d and %d" ,a,b);


}
int Swap_without_third_variable(int a, int b){

a = a+b;
b = a-b;
a = a- b;
printf("The given swap with out third variable value is %d and %d ",a,b);
}
int main(){

    int a,b;
printf("Enter the value of a : ");
scanf("\t%d",&a);
printf("Enter the value of b :");
scanf("\t%d" , &b);
printf("\n\n");
swap_with_third_variable(a,b);
printf("\n\n");
Swap_without_third_variable(a,b);

getch();

}
