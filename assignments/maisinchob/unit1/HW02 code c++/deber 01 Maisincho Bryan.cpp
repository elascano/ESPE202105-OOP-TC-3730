#include<stdio.h>
#include<conio.h>
int i;
int main(){

    void primerafuncion();
    void segundafuncion();
    void tercerafuncion();
	int op,i;

    printf("\t *********Homework 02 programs with functions******** Bryan Steven Maisincho \n");
	printf("\n1.-sum of 5 whole numbers of an array\n");
	printf("\n2.-average of 3 floating array elements\n");
	printf("\n3.-Find out if a specific integer is part of an array its elements are {12,23,34,98,87,65,0}\n\n");
	scanf("%d",&op);
	switch(op){
		case 1:
             primerafuncion();
	break;
        case 2:
        segundafuncion();
    break;
	 case 3:
        tercerafuncion();    
	}
	getch();
	return 0;

}
	void primerafuncion(){
	    int suma=0;
	    int enteros[5];
	     for( i=0;i<5;i++){
		printf("enter the numbers ");
		scanf("%d",&enteros[i]);
        suma =suma + enteros[i];
        }
        printf("The sum of the integer elements is: %d ",suma);

	}
	void segundafuncion(){
	    float mul;
	    float ent[3];
	   for(i=0;i<3;i++){
		printf("enter the numbers: ");
		scanf("%f",&ent[i]);
        mul =mul + ent[i];
        }
        printf("the average of three elements of an array of floats is: %f ",mul/3);
    
	}
	 void tercerafuncion(){
	 	int numero,ban;
	 	int matriz[1][7]={12,23,34,98,87,65,0};
	     printf("enter a number to search in the matrix:\n");
	     scanf("%d",&numero);
	 	for(i=0;i<1;i++){
	 	for(int j=0;j<7;j++){
	 	if(numero==matriz[i][j]){
	 	 ban=1;
		 printf("the number is in the matrix"); 	
		 } 	
	 	}
    }
    if(ban==0){
    printf("the number is not in the matrix");	
	} 
}

	 	
