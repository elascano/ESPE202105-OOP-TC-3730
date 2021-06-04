#include<stdio.h>
#include<stdlib.h>
#include<windows.h>
#include<conio.h>
void arrangements(int Integers[5]);
void sumofthearrangement(int Integers[5]);
int i;
void orderitems(float elements[3]);
float average,sum;
void matrix(int arrangement);
main()
{ 
  char opcion;
  for(;;)
 {system("ClS");
  printf("Homework 2 Programming Fundamentals");
  printf("\nProgrammer name:Andres Maximiliano Galarza Tufiño");
  printf("\nCareer:Telecommunications Engineering");
  printf("\nNRC:3730");
  printf("\nMENU");
  printf("\n*****");
  printf("\n a. Add the elements of an array of 5 integers");
  printf("\n b. Calculate the average of three elements of a floating number array");
  printf("\n c. Find out if a specific integer is part of an array");
  printf("\n d. Exit");
  printf("\n\n Ingrese una opcion(a,b,c,d): ");
  opcion=getchar(); 
  switch(opcion)
  { case 'a':int Integers[5];
             arrangements(Integers);
             sumofthearrangement(Integers);
             getch();
             break;
    case 'b':printf("Enter 3 items\n");
             float elements[3];
             orderitems(elements);
             average=sum/3;
             printf("Average of the 3 elements is: %f",average);
             getch();
             break;
    case 'c':int arrangement;
            matrix(arrangement);
             getch();
             break;
    case 'd':exit(1);
             break;         
    default:printf("\n Digite una opcion valida...");
	        getch();
			break;		          
   } 
  }
}
void arrangements(int Integers[5])
{  printf("Enter 5 integers\n");
    for(i=0;i<5;i++)
  { printf("Give me whole: ");
     scanf("%d",&Integers[i]);
    } 
printf("The array numbers are:");
  for(i=0;i<5;i++)
  { printf("%d",Integers[i]);
    } 
}
void sumofthearrangement(int Integers[5])
{ int sum;
  for(i=0;i<5;i++)
  { sum=sum+Integers[i];
  }
  printf("\nThe sum of the elements is: %d",sum);
}
void orderitems(float elements[3])
{
  int i;
  average=0;
  sum=0;
  for(i=0;i<3;i++)
  { printf("Give me an item: ");
    scanf("%f",&elements[i]);
    sum=sum+elements[i];
  }	
}
void matrix(int arrangement)
{
    int matrix[]={12,23,34,98,87,6,0};;
    int p;
    printf("Ingrese un numero:");
    scanf("%d",&p);
	if(p==12||p==23||p==34||p==98||p==87||p==65||p==0)
	printf("\n El numero ingresado si esta en el arreglo");
    else
	printf("\n No esta ese numero");
}

