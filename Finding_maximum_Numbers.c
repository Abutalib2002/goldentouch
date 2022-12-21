#include<stdio.h>

void main()
{
    int first_value;
    int second_value;

    printf("\n\n\n\t\t\tEnter the first value : ");
    scanf("%d",&first_value);

    printf("\n\n\t\t\tEnter the second value : ");
    scanf("%d",&second_value);

    if(first_value > second_value){

        printf("\t\t\t>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
        printf("\t\t\t^                                                                ^\n");
        printf("\t\t\t^                  The First value is Greater Value              ^\n");
        printf("\t\t\t^                                                                ^\n");
        printf("\t\t\t>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");






    }
    else{

        printf("\t\t\t>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");
        printf("\t\t\t^                                                                ^\n");
        printf("\t\t\t^                  The Second value is Greater Value             ^\n");
        printf("\t\t\t^                                                                ^\n");
        printf("\t\t\t>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");

    }



}
