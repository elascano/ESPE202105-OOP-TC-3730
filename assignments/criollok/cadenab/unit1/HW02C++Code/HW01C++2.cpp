#include<conio.h>
#include<stdio.h>


main()

{
	float P1,P2,P3,Cali;
	
	printf("Enter the first item: ");
	scanf("%f",&P1);
	
	printf("Enter the second item:");
	scanf("%f",&P2);
	
	printf("Enter the third item:");  
	scanf("%f",&P3);
 
	Cali=(P1+P2+P3)/3;
	
	printf("\nThe average of the elements is: %.2f",Cali);
	
	getch();
	
}
