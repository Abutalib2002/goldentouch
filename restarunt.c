#include<stdio.h>
    int line(){
       int i;
       for (i=0;i<10;i++){
        printf("------");
       }
        
    }
    int catlog(){
        printf("\n\t1|\t\t\tchicken rice|\t100|");
        
        printf("\n\t2|\t\tchicken noodles|\t150|");
        printf("\n\t3|\t\t\tchicken 65|\t200|");
        printf("\n\t4|\t\t\tchicken tica|\t250|");
        printf("\n\t5|\t\t\tFish soup|\t300|");
        printf("\n\t6|\t\tPrawn honey fry|\t300|");
        printf("\n\t7\t\t\tparota|\t\t010|");
        printf("\n\t8\t\t\tEgg rice|\t070|");
        printf("\n\t9\t\tchicken borbeque|\t700|");
        printf("\n\t10\t\t\tMeals|\t\t100|");
        printf("\n\t11\t\t\tveg soup|\t100|");
        printf("\n\t12\t\tmutton chop soup| \t300|");
        printf("\n\t13\t\t\tfresh juice|\t060|");
        printf("\n\t14\t\tchicken biriyani|\t100|");
        
    }
    int serve(){
        printf("\n\n\t\t\t\t☺☺☺☺");
        printf("\n\t\t\t\t☺☺☺☺☺");
        printf("\n\n\t\tWhat would like have sir?");
        printf("\n\n\tEnter your option in numbers between 1-14 in menu:");
        int order;
        printf("\n\n\t\tGive your order please sir☺☺:\t");
        scanf("%d",&order);
        switch(order){
            case 1:printf("\n\t\tHERE YOUR ORDER SIR☺:\tChicken rice\n");
            printf("\n\t\t\t☺☺☺ENJOY YOUR FOOD SIR☺☺☺");break;
             case 2:printf("\n\t\tHERE YOUR ORDER SIR☺:\tChicken noodles\n");
              printf("\n\t\t☺☺☺ENJOY YOUR FOOD SIR☺☺☺");break;
              case 3:printf("\n\t\tHERE YOUR ORDER SIR☺:\tChicken 65\n");
       printf("\n\t\t\t☺☺☺ENJOY YOUR FOOD SIR☺☺☺");        break;
               case 4:printf("\n\t\tHERE YOUR ORDER SIR☺:\tChicken tica\n");
                printf("\n\t\t\t☺☺☺ENJOY YOUR FOOD SIR☺☺☺");break;
                case 5:printf("\n\t\tHERE YOUR ORDER SIR☺:\tFish soup \n");
                 printf("\n\t\t\t☺☺☺ENJOY YOUR FOOD SIR☺☺☺");break;
                 case 6: printf("\n\t\tHERE YOUR ORDER SIR☺:\tPrawn honey fry \n");
         printf("\n\t\t\t☺☺☺ENJOY YOUR FOOD SIR☺☺☺");         break;
                  case 7:printf("\n\t\\tHERE YOUR ORDER SIR☺:\tParota\n");
                   printf("\n\t\t\t☺☺☺ENJOY YOUR FOOD SIR☺☺☺");break;
                   case 8:printf("\n\t\tHERE YOUR ORDER SIR☺:\tEgg rice\n");
                    printf("\n\t\t\t☺☺☺ENJOY YOUR FOOD SIR☺☺☺");break;
                    case 9:printf("\n\t\tHERE YOUR ORDER SIR☺:\tChicken borbeque\n");
                     printf("\n\t\t\t☺☺☺ENJOY YOUR FOOD SIR☺☺☺");break;
                     case 10:printf("\n\t\tHERE YOUR ORDER SIR☺:\tMeals\n"); printf("\n\t\t\t☺☺☺ENJOY YOUR FOOD SIR☺☺☺");break;
                      case 11:printf("\n\t\tHERE YOUR ORDER SIR☺:\tveg soup\n"); printf("\n\t\t\t☺☺☺ENJOY YOUR FOOD SIR☺☺☺");break;
                       case 12:printf("\n\t\tHERE YOUR ORDER SIR☺:\tMutton chop soup\n"); printf("\n\t\t\t☺☺☺ENJOY YOUR FOOD SIR☺☺☺");break;
                       case 13:printf("\n\t\tHERE YOUR ORDER SIR☺:\tFresh juice\n"); printf("\n\t\t\t☺☺☺ENJOY YOUR FOOD SIR☺☺☺");break;
                           case 14:printf("\n\t\tHERE YOUR ORDER SIR☺:\tChicken biryani\n");
                            printf("\n\t\t☺☺☺ENJOY YOUR FOOD SIR☺☺☺");break;
        }
    }
    
    
    int biling(){
        int option;
        printf("\n\t\tWould you finish your food sir:\t\n");
        printf("\t\t1.Yes\t2.No\t");
        scanf("%d",&option);
       (option == 1)?printf("\n\t\t\tCan we print a bill sir\n\n") :serve();
        
    }
    int print()
    {
     int food;
     int amount;
      
       printf("\n\t\tEnter the food number from (1-14):\t");
       scanf("%d",&food);
       printf("\n\t\tEnter the amount:\t");
       scanf("%d",&amount);
   
        switch(food){
            case 1:    line();
        printf("\n\t\t\tWorld class cusine\n");
        printf("\t\tNo:123,east coast road,besant nagar beach,\n\t\t\tchennai-600123.\n");
        line();    printf("\n\t%d\tchicken rice\t%d\n",food,amount);
        printf("\n\t\tgst\t\t%d\n",18);
        line();
        printf("\n\t\tTotal\t\t%d\n",amount+18);
        line();
        break;
        case 2:line();
        printf("\n\t\t\tWorld class cusine\n");
        printf("\t\tNo:123,east coast road,besant nagar beach,\n\t\t\tchennai-600123.\n");
        line();    printf("\n\t%d\tchicken noodles\t%d\n",food,amount);
        printf("\n\t\tgst\t\t%d\n",18);
        line();
        printf("\n\t\tTotal\t\t%d\n",amount+18);
        line();
        break;
        case 3:line();
        printf("\n\t\t\tWorld class cusine\n");
        printf("\t\tNo:123,east coast road,besant nagar beach,\n\t\t\tchennai-600123.\n");
        line();    printf("\n\t%d\tchicken 65\t%d\n",food,amount);
        printf("\n\t\tgst\t\t%d\n",18);
        line();
        printf("\n\t\tTotal\t\t%d\n",amount+18);
        line();
        break;
        case 4:line();
        printf("\n\t\t\tWorld class cusine\n");
        printf("\t\tNo:123,east coast road,besant nagar beach,\n\t\t\tchennai-600123.\n");
        line();    printf("\n\t%d\tChicken tica\t%d\n",food,amount);
        printf("\n\t\tgst\t\t%d\n",18);
        line();
        printf("\n\t\tTotal\t\t%d\n",amount+18);
        line(); break;
        case 5:line();
        printf("\n\t\t\tWorld class cusine\n");
        printf("\t\tNo:123,east coast road,besant nagar beach,\n\t\t\tchennai-600123.\n");
        line();    printf("\n\t%d\tFish soup\t%d\n",food,amount);
        printf("\n\t\tgst\t\t%d\n",18);
        line();
        printf("\n\t\tTotal\t\t%d\n",amount+18);
        line(); break;
        
        case 6:line();
        printf("\n\t\t\tWorld class cusine\n");
        printf("\t\tNo:123,east coast road,besant nagar beach,\n\t\t\tchennai-600123.\n");
        line();    printf("\n\t%d\tPrawn honey fry\t%d\n",food,amount);
        printf("\n\t\tgst\t\t%d\n",18);
        line();
        printf("\n\t\tTotal\t\t%d\n",amount+18);
        line();
        break;
        
        case 7: line();
        printf("\n\t\t\tWorld class cusine\n");
        printf("\t\tNo:123,east coast road,besant nagar beach,\n\t\t\tchennai-600123.\n");
        line();    printf("\n\t%d\tParota\t%d\n",food,amount);
        printf("\n\t\tgst\t\t%d\n",18);
        line();
        printf("\n\t\tTotal\t\t%d\n",amount+18);
        line();
         break;
         
         case 8:line();
        printf("\n\t\t\tWorld class cusine\n");
        printf("\t\tNo:123,east coast road,besant nagar beach,\n\t\t\tchennai-600123.\n");
        line();    printf("\n\t%d\tEgg rice\t%d\n",food,amount);
        printf("\n\t\tgst\t\t%d\n",18);
        line();
        printf("\n\t\tTotal\t\t%d\n",amount+18);
        line();break;
        
        case 9:line();
        printf("\n\t\t\tWorld class cusine\n");
        printf("\t\tNo:123,east coast road,besant nagar beach,\n\t\t\tchennai-600123.\n");
        line();    printf("\n\t%d\tChicken barbeque\t%d\n",food,amount);
        printf("\n\t\tgst\t\t%d\n",18);
        line();
        printf("\n\t\tTotal\t\t%d\n",amount+18);
        line();break;
        
        case 10:line();
        printf("\n\t\t\tWorld class cusine\n");
        printf("\t\tNo:123,east coast road,besant nagar beach,\n\t\t\tchennai-600123.\n");
        line();    printf("\n\t%d\tMeals\t%d\n",food,amount);
        printf("\n\t\tgst\t\t%d\n",18);
        line();
        printf("\n\t\tTotal\t\t%d\n",amount+18);
        line();break;
        
        case 11:line();
        printf("\n\t\t\tWorld class cusine\n");
        printf("\t\tNo:123,east coast road,besant nagar beach,\n\t\t\tchennai-600123.\n");
        line();    printf("\n\t%d\tVeg soup\t%d\n",food,amount);
        printf("\n\t\tgst\t\t%d\n",18);
        line();
        printf("\n\t\tTotal\t\t%d\n",amount+18);
        line();break;
        case 12:line();
        printf("\n\t\t\tWorld class cusine\n");
        printf("\t\tNo:123,east coast road,besant nagar beach,\n\t\t\tchennai-600123.\n");
        line();    printf("\n\t%d\tMutton chop soup\t%d\n",food,amount);
        printf("\n\t\tgst\t\t%d\n",18);
        line();
        printf("\n\t\tTotal\t\t%d\n",amount+18);
        line();break;
        
        case 13:line();
        printf("\n\t\t\tWorld class cusine\n");
        printf("\t\tNo:123,east coast road,besant nagar beach,\n\t\t\tchennai-600123.\n");
        line();    printf("\n\t%d\tFresh juice\t%d\n",food,amount);
        printf("\n\t\tgst\t\t%d\n",18);
        line();
        printf("\n\t\tTotal\t\t%d\n",amount+18);
        line();break;
        
        case 14:line();
        printf("\n\t\t\tWorld class cusine\n");
        printf("\t\tNo:123,east coast road,besant nagar beach,\n\t\t\tchennai-600123.\n");
        line();    printf("\n\t%d\tchicken biriyani\t%d\n",food,amount);
        printf("\n\t\tgst\t\t%d\n",18);
        line();
        printf("\n\t\tTotal\t\t%d\n",amount+18);
        line();break;
        }
                  }
     
        
    
    int main(){
        line();
        printf("\n\t\tS.no\t\titems\t\tprice\n");
        line();
        catlog();
        serve();
        biling();
        print();
    }