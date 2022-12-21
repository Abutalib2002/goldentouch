#include<stdio.h>
void main()
{
    double Area;
    double Circumfrence;
    double Radius;
    double pi = 3.14;
    printf("Enter the Value of Radius : \t");
    scanf("%lf",&Radius);
    Area = pi * (Radius * Radius);
    printf("\nArea of the Circle : %lf \t\n ",Area);
    Circumfrence = 2 * pi * Radius;
    printf("\nCircumFrence of the circle : %lf \t\n " ,Circumfrence);
}
