#include <conio.h>
#include <stdio.h>
int main ()

{
	//-----------------Programa de promedio -----------
  int x,y,z,promedio;

  printf("Primer elemento:\n");
  scanf("%d",&x);
  printf("Segundo elemento\n");
  scanf("%d",&y);
  printf("Tercer elemento\n");
  scanf("%d",&z);
  promedio=(x+y+z)/3;   
  printf("El promedio sera este %d",promedio);
  getch();
  return 0;
}
