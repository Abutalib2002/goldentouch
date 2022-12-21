#include<stdio.h>
int Equation1(int u,int a,int t)
{

    int V;
    V = u + (a*t);

    printf("The value of V is : %d\n", V);

}
int Equation2(int u ,int t,int a){

int S = (u*t) + 1 / (2*a);
 printf("The value of S : %d\n", S);

}
int Equation3(int a, int b,int c){

int T = (2*a) + sqrt(b) + (9*c);
int f = sqrt(b);
printf(" The value of f : %d  ",f);

 printf("The value of T is : %d\n", T);
}



int main(){

int a,b,c,t;
printf("Enter the value of a : ");
scanf("%d",&a);
printf("Enter the value of b : ");
scanf("%d",&b);
printf("Enter the value of c : ");
scanf("%d",&c);
printf("Enter the value of t : ");
scanf("%d",&t);

Equation1(a,b,t);
Equation2(a,b,t);
Equation3(a,b,c);
}
