#include<stdio.h>
void suma(int numeros[5]);
void average(float decimals[3]);
int i;
int f;
int c;
int n;
int resp;
float total;
float prom;
void Pertenecia(int matriz[1][7]);
main()
{ printf("                  **********HOMEWORK#1***********");
  printf("\nName: Marlon Ortiz");
int numeros[5];
  suma(numeros);
  float decimals[3];
  average(decimals);
  total= prom/3;
  printf("\n The average of the decimals is: %f ",total);
  int matriz[1][7];
  Pertenecia(matriz);
}
void suma(int numeros[5])
{printf("\n\n **********Enter 5 whole numbers*********** ");
 for(i=0;i<5;i++)
 {printf("\n\n Give me numbers: ");
  scanf("%d",&numeros[i]);
 }
 for(i=0;i<5;i++)
 { resp=resp+numeros[i];
}
printf("\n The answer is: %d",resp);
}
void average(float decimals[3])
{ prom=0;
  total=0;
  printf("\n\n **********Enter 3 decimal numbers*********** ");
 for(n=0;n<3;n++)
 {printf("\n Give me numbers: ");
  scanf("%f",&decimals[n]);
  prom=prom+decimals[n];
 }
}
void Pertenecia(int matriz[1][7])
{
   matriz[0][0]=12;
   matriz[0][1]=23;
   matriz[0][2]=34;
   matriz[0][3]=98;
   matriz[0][4]=87;
   matriz[0][5]=65;
   matriz[0][6]=0;
for(f=0;f<1;f++)
  for (c=0;c<7;c++)
    {
	}
         int p;
         printf("\n\n ***********Give me a number: ************ ");
         scanf("%d",&p);
		 if(p==12||p==23||p==34||p==98||p==87||p==65||p==0)
		 printf("\n The number entered if it is in the arrangement");
         else
		 printf("\n The number entered is not in the arrangement");
}
