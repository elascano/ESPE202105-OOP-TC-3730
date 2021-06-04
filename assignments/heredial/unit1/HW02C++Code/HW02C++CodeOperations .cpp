#include<stdio.h>
#include<conio.h>
#include<iostream>
using namespace std;
main()
{  
  
    int opcion;

  	
   
  for(;;)
 {system("ClS");
  printf("UNIVERSITY OF THE ARMED FORCES 'ESPE'");
  printf("\nAuthor's name: Luis Alberto Heredia Iza");
  printf("\nNRC:3730");
  printf("\nMAIN");
  printf("\n");
  printf("\n 1.Addition of 5 whole numbers");
  printf("\n 2.Calculation of the average of 3 floating numbers ");
  printf("\n 3.Check if the number is part of the matrix ");
  printf("\n 4. Exit");
  printf("\n\n Enter an option(1,2,3,4): ");
  opcion=getchar(); 
  switch(opcion)
   { case '1':
    {
    	int numbers[5],suma=0;
    	printf("Enter Numbers:");
    	for(int i=0;i<5;i++)
    	{
    	scanf("%d",&numbers[i]);
    	suma=suma+numbers[i];
		}
		printf("\n");
		printf("The result is=%d",suma);
		
	
	}
                 getch();
                 break;
    case '2':
	 {
	 	float numbers[3],promedio=0;
	 	printf("Enter Number:");
	 	for(int i=0;i<3;i++)
	 	{
	 	scanf("%f",&numbers[i]);
		promedio=promedio+numbers[i]/3; 	
		 }
		printf("\n");
		printf("The result is=%f",promedio);
			}       
	
	
                 getch();
                 break;
    case '3':
    	{
    			int a[]={12,23,34,98,87,65,0};
  	int i,fact;
  	char band='F';
		
	printf("Enter number to search:");
	scanf("%d",&fact);
	        
	        
	i=0;
	while((band=='F')&&(i<5)){
		if(a[i]==fact){
			band='V';
		}
		i++;
	}
	
	if(band=='F'){
		printf("Number not found");
	}       
	else if(band=='V'){
		printf("[12],[23],[34],[98],[87],[65],[0]");
		printf("\n");
		printf("Number found ");
	} 
}
	       
                 getch();
                 break;
                 
    case '4':exit(0);
             break;         
    default:printf("\n Error Enter an option from the list");
	        getch();
			break;		          
   } 
  }
}

