#include<stdio.h>
#include<conio.h>
main(){
    int arrangement[]={12,23,34,98,87,65,0};
    int bandera=0;
    int search;
    int x;
    printf("Enter the number you want to search for");
    scanf("%d" ,&search);
    
    for (x=0;x<=6;x++)
        {
        	if(arrangement[x]==search)
        	   bandera=1;
		}
    if(bandera==1)
        printf("NUMBER FOUND");
    else
        printf("NUMBER NOT FOUND");

}
 
