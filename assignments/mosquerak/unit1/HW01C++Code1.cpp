#include<stdio.h>
#include<conio.h>
#include<windows.h>
#include<stdlib.h>
#include <iostream>
main()
{ float digit[3],promedio,suma;
  int i,j,opcion,adicion,intentos;
  int vec[]={12,23,34,98,87,6,0},dato;
  char band = 'F';
  int number[5];
  suma=0;
  adicion=0;
  promedio=0;
  intentos=0;
  do
 {
   intentos++;
    system("CLS");  
    printf(" \t  WELCOME");
	printf("\n Select an option : ");
	printf("\n 1. Add elements ton an array. ");
	printf("\n 2. Compute the average of three elements of an array.");
	printf("\n 3. Find out if a specific integer is part of an array { 12,23,34,98,87,65,0}.\n");
	 printf ("\t  ------------- ---------------------------------------------------------------\n");
	scanf("%d",&opcion);
	switch(opcion)
	
	{
		case 1:
             printf("Enter the numbers: \n");
             for(i=0;i<5;i++)
             { scanf("%d",&number[i]);
               adicion= adicion+number[i];
             }
              printf("\n The sum is: %d \n ",adicion);
             break;
        case 2:  
             printf("Enter the numbers:",i+1);
			 for(i=0;i<3;i++)
             { scanf("%f",&digit[i]);
               suma= suma+digit[i];
             }
                promedio=suma/3;
             printf("\n El promedio es : %f  \n ", promedio);
             break;
		case 3:  
              printf("Enter the numbers: \n");
              scanf("%d",&dato);
              i=0;
              while((band=='F')&& (i<7))
              { if((vec[i]==dato))
               { band= 'V';
               }
			  i++;	
              }
              if(band='F')
              {
			   printf(" This number was not found \n");
              }
              else if(band=='V')
              { printf("\n This number was found \n",i-1);
              }
             break;
    } 

  }
  while(intentos<0);
  system("PAUSE"); 
 }
