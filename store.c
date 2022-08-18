#include <stdio.h>
int welcome()
{
    printf("\n\n\t\t\t....WELCOME TO THE SHOP🙏😊....\n\n\t\t\t....HOW DO I HELP YOU SIR...\n\n");
    printf("\t\t\tCAN I SHOW CATALOGUE:\n\n ");
    printf("\t\t\t1)Yes.\t2)No:\t");
    int show;
    scanf("%d", &show);
    switch (show)
    {
    case 1:
        clothings();
        break;

    case 2:
        printf("\n\t..........THANK YOU FOR SHOWING INTREST🙏..........");
        break;
    }
}

int clothings()
{
    printf("\n\n\t...........WELCOME TO CLOTHING STORE..........\n\n");
    printf("\t\t............🙏............\n\n");
    printf("\t\tHERE WE HAVE CLOTHINGS FOR\n\n");
    printf("\t\t1)Mens👨\n\n\t\t2)Womens👩\n\n\t\t3)Kids👶\n\n");

    printf("\t\tWhich one you want sir:");
    int l;
    scanf("\t%d", &l);

    if (l == 1)
    {
        mens();
    }
    else if (l == 2)
    {
        womens();
    }
    else if (l == 3)
    {
        kids();
    }
}

int mens()
{
    int m;
    for (m = 1; m < 9; m++)
    {
        switch (m)
        {
        case 1:
            printf("\n\n\t\t1)Shirts");
            break;
        case 2:
            printf("\t2)Pants\n\n");
            break;
        case 3:
            printf("\t\t3)Shorts");
            break;
        case 4:
            printf("\t4)T-shirts\n\n");
            break;
        case 5:
            printf("\t\t5)Track pants");
            break;
        case 6:
            printf("\t6)Jeans\n\n");
            break;
        case 7:
            printf("\t\t7)Pijamas");
            break;
        case 8:
            printf("\t8)Boxers & Tank tops\n\n");
            break;
        }
    }
    int c;
    printf("\t\tEnter the option:\t");
    scanf("%d", &c);

    switch (c)
    {
    case 1:
        printf("\n\n\t1)Checked Shirts");
        printf("\t2)Plain shirt\n\n");
        printf("\t3)Print shirt");
        printf("\t4)Lycra shirt\n\n");
        printf("\t5)Letter slogan prited shirte\n\n");
        printf("\t6)Jeans shirt\t");
        printf("7)jippas\n\n");
        printf("\t8)Hawaei shirt\n\n");
        printBil();
        break;
    case 2:
        printf("\t1)Narrow fit pant Pants\t");
        printf("2)Formal Pants\n\n");
        printf("\t\t3)Pencil Pants\t");
        printf("4)Lycra Pants\n\n");
        printf("\t\t5)Casual Pants\t");
        printf("6)Carrot  fitPants\n");
        printBil();
        break;
    case 3:
        printf("\t\t1)Half shots\t");
        printf("2)Jean shorts\n\n");
        printf("\t\t3)Belt shorts\t");
        printf("4)3/4 shorts\n\n");
        printf("\t\t5)Jersy shorts\t");
        printf("6)Cycler shorts\n");
        printBil();
        break;
    case 4:
        printf("\t1)V Neck Full sleeve\t");
        printf("2)Round neck full sleeve\n\n");
        printf("\t3)V neck half sleeve\t");
        printf("4)Round neck half sleeve\n\n");
        printf("\t\t5)Jersy half sleeve\t");
        printf("6)Jersy full sleeve\n");
        printBil();
        break;
    case 5:
        printf("\t1)Narrow fit track Pants\t");
        printf("2)Jersy Pants\n\n");
        printf("\t\t3)Griped Pants\t");
        printf("4)ZipPants\n\n");
        printf("\t\t5)Popcorn Pants\t");
        printf("6)Dry fit Pants\n");
        printBil();
        break;
        printBil();
    case 6:
        printf("\t\t1)Narrow fit Jeans\t");
        printf("2)Formal jeanss\n\n");
        printf("\t\t3)Pencil jeans\t");
        printf("4)Ankle jeans\n\n");
        printf("\t\t5)Tone Jeans\t");
        printf("6)Carrot  fit jeans\n");
        printBil();
        break;
    case 7:
        printf("\t\t1)white pijamas\t");
        printf("\t2)Formal Pijamas\n\n");
        printf("\t\t3)Lined Paijamas\t");
        printf("4)Lycra Paijamas\n\n");
        printf("\t\t5)Casual Paijamas\t");
        printf("6) printed paijamas\n");
        printBil();
        break;
    case 8:
        printf("\t1)Printed boxers\t");
        printf("2)Lined boxers\n\n");
        printf("\t3)plain boxers\t");
        printf("\t4)Printed tanktops\n\n");
        printf("\t5)Plain tank tops\t");
        printf("6)Sleeveles tank tops\n");
        printBil();
        break;
    }
}

int womens()
{
    int w;
    for (w = 1; w < 9; w++)
    {
        switch (w)
        {
        case 1:
            printf("\n\n\t\t1)Sarees");
            break;
        case 2:
            printf("\t2)Kurtis\n\n");
            break;
        case 3:
            printf("\t\t3)Night wears");
            break;
        case 4:
            printf("\t4)T-shirts\n\n");
            break;
        case 5:
            printf("\t\t5)Track pants");
            break;
        case 6:
            printf("\t6)Jeans\n\n");
            break;
        case 7:
            printf("\t\t7)Chudithars");
            break;
        case 8:
            printf("\t8)Tops\n\n");
            break;
        }
    }
    int d;
    printf("\t\tEnter the option:\t");
    scanf("%d", &d);

    switch (d)
    {
    case 1:
        printf("\n\n\t\t1)Silk sarees");
        printf("\t2)Cotton saree\n\n");
        printf("\t\t3)Poonam saree");
        printf("\t4)Shining saree\n\n");
        printf("\t\t5)voyal saree");
        printf("\t6)Embraid saree\n\n");
        printf("\t\t7)Bordered cotton saree");
        printf("\t8)Singudi saree\n\n");
        printBil();
        break;
    case 2:
        printf("\n\n\t\t1)Kurti plain");
        printf("\t2)Kurti print\n\n");
        printf("\t\t3)Kurti umberala");
        printf("\t4)Kurti open\n\n");
        printf("\t\t5)Kurti Long");
        printf("\t6)Kurti anarkali\n\n");
        printf("\t\t7)Embraid kurti");
        printf("\t8)Shiffon kurti\n\n");

        printBil();
        break;
    case 3:
        printf("\n\n\t\t1)T-shirts");
        printf("\t2)Full track pant\n\n");
        printf("\t\t3)Half shots");
        printf("\t4)scurts\n\n");
        printBil();

        break;
    case 4:
        printf("\n\n\t\t1)Half sleaves\t");
        printf("2)Full sleaves\n");
        printf("\t\t3)Sleave less");
        printf("\t4)Grip sleave");
           printBil();
        break;
    case 5:
        printf("\n\n\t\t1)Zip Pants\t");
        printf("\t2)Grip pants\n");
        printf("\t\t3)Jersy pants");
        printf("\t4)Cotton pants\n");
        printf("\t\t5)Angle fit pants");
        printBil();
        break;
    case 6:
        printf("\n\n\t\t1)Angle fit pants\t");
        printf("2)Light jeans\n\n");
        printf("\t\t3)Tone jeans");
        printf("\t4)Plain jeans");
        printBil();
        break;
    case 7:
        printf("\n\n\t\t1)Worked chudithar\t");
        printf("2)Embraid chudithar\t\n");
        printf("\t\t3)Rayon cloth cgudithar\t");
        printf("4)Cotton chudithar\n");
        printf("\t\t5)Full Chudithar");
        printf("\t6)Patiala set\n");
        printBil();
        break;
    case 8:
        printf("\n\n\t\t1)Jean top\t");
        printf("2)Legings top\n\n");
        printf("\t\t3)Patiala top\t");
        printf("4)Jegings top");
        printBil();
        break;
    }
}

int kids()
{
    int k;

    for (k = 1; k < 9; k++)
    {
        switch (k)
        {
        case 1:
            printf("\n\n\t\t1)Shirts");
            break;
        case 2:
            printf("\t2)Pants\n\n");
            break;
        case 3:
            printf("\t\t3)Shorts");
            break;
        case 4:
            printf("\t4)T-shirts\n\n");
            break;
        case 5:
            printf("\t\t5)Track pants");
            break;
        case 6:
            printf("\t6)Jeans\n\n");
            break;
        case 7:
            printf("\t\t7)Pijamas");
            break;
        case 8:
            printf("\t8)Boxers & Tank tops\n\n");
            break;
        }
    }
    int kc;
    printf("\t\tEnter the option:\t");
    scanf("%d", &kc);

    switch (kc)
    {
    case 1:
        printf("\n\n\t1)Checked Shirts");
        printf("\t2)Plain shirt\n\n");
        printf("\t3)Print shirt");
        printf("\t4)Lycra shirt\n");
        printf("\t5)Letter slogan prited shirt\e\n");
        printf("\t6)Jeans shirt\t");
        printf("7)jippas\n");
        printf("\t8)Hawaei shirt\n\n");
        printBil();
        break;
    case 2:
        printf("\t1)Narrow fit pant Pants\t");
        printf("2)Formal Pants\n\n");
        printf("\t\t3)Pencil Pants\t");
        printf("4)Lycra Pants\n\n");
        printf("\t\t5)Casual Pants\t");
        printf("6)Carrot  fitPants\n");
         printBil();
        break;
       
    case 3:
        printf("\t\t1)Half shots\t");
        printf("2)Jean shorts\n\n");
        printf("\t\t3)Belt shorts\t");
        printf("4)3/4 shorts\n\n");
        printf("\t\t5)Jersy shorts\t");
        printf("6)Cycler shorts\n");
        printBil();
        break;
    case 4:
        printf("\t1)V Neck Full sleeve\t");
        printf("2)Round neck full sleeve\n\n");
        printf("\t3)V neck half sleeve\t");
        printf("4)Round neck half sleeve\n\n");
        printf("\t\t5)Jersy half sleeve\t");
        printf("6)Jersy full sleeve\n");
        printBil();

        break;
    case 5:
        printf("\t1)Narrow fit track Pants\t");
        printf("2)Jersy Pants\n\n");
        printf("\t\t3)Griped Pants\t");
        printf("4)ZipPants\n\n");
        printf("\t\t5)Popcorn Pants\t");
        printf("6)Dry fit Pants\n");
        printBil();
        break;
    case 6:
        printf("\t\t1)Narrow fit Jeans\t");
        printf("2)Formal jeanss\n\n");
        printf("\t\t3)Pencil jeans\t");
        printf("4)Ankle jeans\n\n");
        printf("\t\t5)Tone Jeans\t");
        printf("6)Carrot  fit jeans\n");
        printBil();
        break;
    case 7:
        printf("\t\t1)white pijamas\t");
        printf("\t2)Formal Pijamas\n\n");
        printf("\t\t3)Lined Paijamas\t");
        printf("4)Lycra Paijamas\n\n");
        printf("\t\t5)Casual Paijamas\t");
        printf("6) printed paijamas\n");
        printBil();
        break;
    case 8:
        printf("\t1)Printed boxers\t");
        printf("2)Lined boxers\n\n");
        printf("\t3)plain boxers\t");
        printf("\t4)Printed tanktops\n\n");
        printf("\t5)Plain tank tops\t");
        printf("6)Sleeveles tank tops\n");
        printBil();
        break;
    }
}

int line()
{
    int dot;
    for (dot = 0; dot < 15; dot++)
    {
        printf("....");
    }
}

int printBil()
{
    line();
    printf("\n\tCan we print bill for you sir\n ");
    printf("\t\t\t1.Yes\t2.No\t");
    int g;
    scanf("%d", &g);
    line();
    int pn;
    int qt;
    switch (g)
    {
    case 1:
        printf("\n\t\tEnter your option:\t");

        scanf("%d", &pn);
       printf("\n\t\tEnter how much quantity you want:\t");
       scanf("%d",&qt);
        line();
        printf("\n\t\tWorldFasion center\n\n");
        printf("\t\tNo:5/7,18N street,Texas\tUSA-19.\n");
        line();
        printf("\n\tDate:12/3/29\t\tD.No:624628625632\n\n\tIfs code:151415154754\tM.i.No:421528315246\n");
        line();
        printf("\n\tS.no\tProduct id\tprice\tquantity\n");
        line();
        int pr[9] = {0, 1552, 755, 422, 1266, 955, 412, 465, 1425};
        printf("\n\t1\t0000%d\t\t%d\t%d\n\t\t\tgst\t45\n", pn, pr[pn],qt);
        line();
        printf("\n\n\t\tTotal(include gst)\t%d\n", qt*pr[pn]+ 45);
        line();
        break;
    case 2:
        printf("\t\tThank you sir");
        break;
    }
}

int main()
{
    welcome();
}
