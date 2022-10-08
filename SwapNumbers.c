#include<stdio.h>
int main()
{

    double first ,second,temp;
    printf("Enter the first number : ");
    scanf("%lf",&first);
    printf("Enter the second number :");
    scanf("%lf",&second);
    // value of first assign to temp
    temp = first;

    // value second assign to first

    first = second;

    // value of temp assign to second
    second = temp;
    printf("After the swap first number %.2lf\n",first);
    printf("After swap second number %.2lf\n",second);
}
