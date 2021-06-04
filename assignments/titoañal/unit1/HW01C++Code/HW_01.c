#include<stdio.h>

int main()
{
    int x,y,z;
    sum(x);
    average(y);
    search(z);
}

int sum(int a)
{
    int numbers[5], suma = 0;
    printf("HW02 Programming Leslie Titoaña");
    printf("\n\t\t***FIND A SPECIFIC NUMBER WITHIN AN ARRAY***");
    printf("\nEnter 5 whole numbers for the array\n");
    for( int i =0; i<5; i++)
    {
        printf("Number %d: ", i+1);
        scanf("%d",&numbers[i]);
        suma = suma + numbers[i];

    }
    printf("\nThe sum of the entered array is: %d \n\n", suma);
}

int average(int b)
{
    float numbers[3], suma = 0;
    printf("\n\t\t***CALCULATE THE AVERAGE OF 3 NUMBERS OF AN ARRAY***");
    printf("\nEnter 3 numbers\n");
    for( int i =0; i<3; i++)
    {
        printf("Number %d: ", i+1);
        scanf("%f",&numbers[i]);
        suma = suma + numbers[i];

    }
    printf("\nThe average of the numbers entered is: %.2f \n\n", suma/3);

}

int search(int t)
 {
    int array[]= {12,23,34,98,87,65,0}, num, cont=0;
    printf("\n\t\t***FIND A SPECIFIC NUMBER WITHIN AN ARRAY***");
     printf("\nEnter the number you want to search: ");
     scanf("%d",&num);
     for  (int i=0; i<7;i++)
     {
        printf("\t%d", array[i]);
     }
     printf("\n");
    for(int i = 0; i<=7; i++)
    {
        if(array[i]==num)
            cont=1;
    }
    printf("\n");
    if(cont==0)
        printf("The number %d is not in the arrayn", num);
    else
        printf("The number %d if it is in the array \n", num);
        printf("\n");
 }
