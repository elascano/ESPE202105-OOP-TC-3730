#include<stdio.h>
#include<conio.h>
#include<windows.h>


int greeting(void);
int option_menu(void);
void fill(int[5]);
void sum(int[5]);

void fill2(float[3]);
void average(float[3]);

int search(int[],int);

main()
{
	int option;
	int A3[7]={12,23,34,98,87,65,0};
	greeting();
	for(;;)//bucle infinito
	{
		system("CLS");
		option=option_menu();
		switch(option)
		{
			case 1:printf("\n Add the elements of an array of 5 integers, where the integers must be entered with the keyboard");
	               int A1[5];
	               fill(A1);
	               sum(A1);
	               getch();
			break;
			case 2:printf("\n Compute the average of three elements of an array of floats, also the numbers must be entered with the keyboards. ");
	               float A2[3];
	               fill2(A2);
	               average(A2);
	               getch();
			break;
			case 3:int num,found;
			       found=0;
			       printf("Enther the number: ");
				   scanf("%d",&num);
	               found=search(A3,num);
	               if(found==1)
	                 printf("\n The number is on the list");
	                else
	                 printf("\n The number is unlisted");
	               getch();
			break;
			case 4:exit(1);
			break;
			default:printf("\n Enter a valid option...");
			        Beep(700,300);
			        getch();
			break;		
		}
		}	            
}
int greeting(void)
{
	printf("**********UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE**********");
	printf("\n               OBJECT ORIENTED PROGRAMMING");
	printf("\n                        NAME:");
	printf("\n                  QUILUMBAQUIN KAREN");
	printf("\n                      NRC: 3730");
	printf("\n");
	system("PAUSE");
}
int option_menu(void)
{
	int option;
	printf("\n OPTION MENU");
	printf("\n__________________________________________________________________________");
	printf("\n");
	printf("\n1. Add the elements of an array of 5 integers, where the integers must be entered with the keyboard. ");
	printf("\n2. Compute the average of three elements of an array of floats, also the numbers must be entered with the keyboards. ");
	printf("\n3. Find out if a specific integer is part of an array, the array will have the following elements { 12,23,34,98,87,65,0}, the user must enter the number to search for and the program tells whether the number is in the list or not. ");
	printf("\n4. Leave");
	printf("\n\n ENTER THE OPTION: ");
	scanf("%d",&option);
	return(option);
}
void fill(int A1[5])
{
	int i;
	for(i=0;i<5;i++)
	{
		printf("\n Enter the value of A1[%d]: ",i);
	    scanf("%d",&A1[i]);
	}
}
void sum(int A1[5])
{
	int i,addition=0;
	for(i=0;i<5;i++)
	{
		addition=addition+A1[i];
	}
	printf("\n The sum total is: %d",addition);
}
void fill2(float A2[3])
{
	int i;
	for(i=0;i<3;i++)
	{
		printf("\n Enter the value of A2[%d]: ",i);
	    scanf("%f",&A2[i]);
	}
}
void average(float A2[3])
{
	int i;
	float average1,addition=0;
	for(i=0;i<3;i++)
	{
		addition=addition+A2[i];
	}
	average1=addition/3;
	printf("\n The average is: %f",average1);
}
int search(int A3[],int num)
{
	int i=0,found=0;
	do
	{
		if(A3[i]==num)
		  found=1;
		else
		  i++;
		  
	}while((found==0)&&(i<7));
	return found;	
}
