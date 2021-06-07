#include<stdio.h>
#include<conio.h>
#include<iostream>
main()
{  
  
    int opcion;
  	int Number1,Number2,Number3,Number4,Number5,Suma;
  	float N1,N2,N3,N4,N5,Promedio;
  	int a[]={12,23,34,98,87,65,0};
  	int i,fact;
  	char band='F';
  	
   
  for(;;)
 {system("ClS");
  printf("\nMENU");
  printf("\n NOMBRE: JOSSELYN SUSANA SIGCHA MANOSALVAS");
  printf("\n 1. Suma de elementos de un arreglo de 5 enteros");
  printf("\n 2. Calculo del promedio de 3 elementos de un arreglo de flotantes");
  printf("\n 3. Averigue si un entero especifico es parte ");
  printf("\n 4. Exit");
  printf("\n\n Ingrese una opcion(1,2,3,4): ");
  opcion=getchar(); 
  switch(opcion)
   { case '1':
    printf("Enter Number1:  ");
   	scanf("%d",&Number1);
 
   
    printf("Enter Number2:  ");
	scanf("%d",&Number2);
   

    printf("Enter Number3:  ");
   	scanf("%d",&Number3);
   
    printf("Enter Number4:  ");
   	scanf("%d",&Number4);
    printf("Enter Number5:  ");
    scanf("%d",&Number5);
    
    
    Suma=Number1+Number2+Number3+Number4+Number5;
	
	printf("Suma Total=%d",Suma);
                 getch();
                 break;
    case '2':
	  printf("Enter Number1:");
   	scanf("%f",&N1);
 
   
    printf("Enter Number2:");
	scanf("%f",&N2);
   

    printf("Enter Number3:");
   	scanf("%f",&N3);
	   
	   Promedio=(N1+N2+N3)/3;
	printf("Promedio es=%f",Promedio);       
	
	
                 getch();
                 break;
    case '3':
	
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
	       
                 getch();
                 break;
                 
    case '4':exit(1);
             break;         
    default:printf("\n Error Enter an option from the list");
	        getch();
			break;		          
   } 
  }
}
