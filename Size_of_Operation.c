#include<stdio.h>

int line(){
for(int i = 1;i <20; i ++)
{

    printf(">>>>>");
}

}

void main(){
    line();
int integer ;
printf("\n\n  \t\t\tThe size of integer variable is : %d\n\n" ,sizeof(integer));
line();
long large;
printf("\n\n\t\t\tThe size of long variable is : %zu \n\n",sizeof(large));
line();
short shortvr;
printf("\n\n\t\t\tThe size of short is : %lu\n\n",sizeof(shortvr));
line();
float fraction;
printf("\n\n\t\t\tThe size of Float is : %lu\n\n",sizeof(fraction));
line();

double doubleFraction;

printf("\n\n\t\t\tThe size of Double is : %lu\n\n",sizeof(doubleFraction));
line();

char b;
printf("\n\n\t\t\tThe size of byte is : %zu\n\n",sizeof(b));
line();






}




