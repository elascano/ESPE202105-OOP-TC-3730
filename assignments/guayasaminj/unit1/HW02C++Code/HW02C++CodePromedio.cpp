#include<stdio.h>
#include<stdlib.h>
main()
{
	float note1, note2, note3, average;
	
	printf("Enter notes\n\n");
	printf("1ra note: ");
	scanf("%f", &note1);
	printf("2ra note: ");
	scanf("%f", &note2);
	printf("3ra note: ");
	scanf("%f", &note3);
	
	average =(note1+note2+note3)/3;
	
	printf("\n The average is: %.2f \n",average);
	
	system("PAUSE");
}
