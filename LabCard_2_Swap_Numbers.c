#include<stdio.h>
int line (){

for (int i = 1 ; i <25; i++){
    printf("---");
}
}
void main()
{
    int firstVariable = 100;
    int SecondVariable = 150;
    int tempraryVariable;
    printf("The first variable : %d \n \n The second Variable : %d \n\n ",firstVariable,SecondVariable);
    tempraryVariable = firstVariable;
    firstVariable = SecondVariable;
    SecondVariable = tempraryVariable;
    printf("The Swaped first variable is : %d \n\n The swaped second Variable is : %d \n\n" ,firstVariable,SecondVariable);
 line();


 int wfv = 456;
 int wsv = 156;
 printf("\nThe first value : %d \n The second value : %d \n",wfv,wsv);
 wfv -=  300;
 wsv += 300;
 printf("The swaped first value : %d  \n The swaped second value : %d \n",wfv,wsv);

}
