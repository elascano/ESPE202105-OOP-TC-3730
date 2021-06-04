#include<stdio.h>
#include<windows.h>
#include<stdlib.h>
#include<conio.h>
void calcularsuma(int numeros[5]);
void promedios(float valores[3]);
void arreglo(int rest);
main(){
	
	char opcion;
	for(;;)
	
 {
  system("CLS");
  printf("MENU");
  printf("\n*****" );
  printf("\n a. Sum of elements");
  printf("\n b. Average calculation ");
  printf("\n c.Average calculation  ");
  printf("\n d. Exit");
  printf("\n\n options(a,b,c,d): ");
  
  opcion=getchar();
  switch(opcion) 
     {
     	case 'a': int numeros[5];
     	calcularsuma(numeros);
		getch();
		
		break;
	   
	
	case 'b': 
	float valores[3];
	promedios(valores);
	getch();
	 break;
	 
	 case 'c':  
	 int rest;
	 arreglo(rest);
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
void calcularsuma(int numeros[5]){
		int suma;

	for(int i=0;i<5;i++) 
	{
		printf("Enter the numbers:");
		scanf("%d",&numeros[i]);
	
		suma = suma + numeros[i];
	}
	printf("  The sum of the array is:%d \n",suma);
}
void promedios(float valores[3]){
float promedio=0;
	printf("Average calculation..\n");
	for(int i=0;i<3;i++){
		printf("Give me a number %d:",i+1);
		scanf("%f",&valores[i]);
		promedio+= valores[i];
		printf("\n");
		
	}
	printf("The average of the numbers are: %.2f\n\n",promedio/ 3);

	
}
void arreglo(int rest){
		int entero[]={12,23,34,98,87,6,0};
	int i,dato;
	char band = 'F';
	printf("Give me a number: ");
    scanf("%d",&dato);
	
	
	i=0;
	while((band=='F')&& (i<7)){
		if(entero[i]==dato){
			band = 'V';
		}
		i++;
	}
	if(band=='F'){
		printf("The number to search does not exist  \n");
	}
	else if(band=='V'){
		printf("The number if it exists in the list \n",i);
	}
}
