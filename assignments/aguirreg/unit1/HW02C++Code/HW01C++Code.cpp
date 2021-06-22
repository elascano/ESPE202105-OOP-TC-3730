#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<windows.h>
    int g,res,i,z,facts;
    float result;
    int n[]={12,23,34,98,87,65,0};
  	char group='G';
    void sumofarrays(int integers[5]);
    void averages (float floats[3]);
    

main()
{  
   char opcion;

  for(;;)
 {system("ClS");
  printf("\n STUDENT: Gabriel Sebastian Aguirre Almache");
  printf("\n NRC: 3730 \n");
  
  printf("\n  MAIN OF PROGRAM ");
  printf("\n**************************************");
  printf("\n a. Sum of elements of an array of 5 integers");
  printf("\n b. Calculate the average of 3 elements of an array of floats");
  printf("\n c. Find out if a specific integer is part ");
  printf("\n d. Exit");
  printf("\n\n Select a letter (a,b,c,d): ");
  opcion=getchar(); 
  switch(opcion)
   { case 'a':
                 int integers[5];
                 sumofarrays(integers);
                
                 getch();
                 break;
    case 'b':
	            float floats[3];
                averages(floats);
                
                 getch();
                 break;
    case 'c':
	             printf("Enter a number to search:");
	             scanf("%d",&facts);
	        
	      z=0;
    	  while((group=='G')&&(z<5))
	{
		if(n[z]==facts)
		  {
			group='S';
		  }
		    z++;
 	}
	     if(group=='G')
	       {
	      	printf("The number was not found");
	       }       
	    else if(group=='S')
	      {
		    printf("12,23,34,98,87,65,0");
		    printf("\n");
	   	    printf("The number was found !! ");
	      } 
                 getch();
                 break;
                 
    case 'd':exit(1);
             break;         
    default:printf("\n Enter a valid option ...");
	        getch();
			break;		          
   } 
  }
}
   
    void sumofarrays(int integers[5])
   {
	    int g;
	   printf("Enter 5 whole numbers ");
       for(g=0;g<5;g++)
     {   
	  printf("\n Number: ");
          scanf("%d",&integers[g]);
		  res=res+integers[g];
      }
       printf("\n The sum of the numbers : %d",res);
    }
    
    void averages (float floats[3])
  {     
        float finalnumber;
    	printf("\n Select 3 floating numbers"); 
  	
        for(i=0;i<3;i++)
       { 
	     printf("\n Number: ");
         scanf("%f",&floats[i]);
         
         result=result+floats[i];
       }
          finalnumber=result/3;
          printf("The average is: %f",finalnumber);
  }


