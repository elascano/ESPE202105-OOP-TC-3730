//Suma de elementos de un arreglo de 6 enteros
#include<stdio.h>
#include <iostream>
#include<conio.h>

using namespace std;

int main()
{
	int numero[] = {23,16,9,20,6,7};
	int suma=0;
	
	for(int i=0;i<6;i++){
		suma += numero[i];
	}
	
	cout<<"La suma de los elementos de un arreglo es: "<<suma<<endl;
	
	getch();
	return 0;
}


//Calcule el promedio de tres elementos de un arreglo de flotadores
#include <iostream>
int main()

{
	
	system("calif");
	
	float calif1, calif2, calif3, promedio;
	
	printf("Introduzca las calificaciones\n\n");
	printf("1era calificacion: ");
	scanf("%f", &calif1);
	printf("n2da calificacion: ");
	scanf("%f", &calif2);
	printf("n3ra calificacion: ");
	scanf("%f", &calif3);
	
	promedio = (calif1 + calif2 + calif3) / 3;
	
	printf("\nEl promedio es: %.2f \n\n", promedio);
	
	system("pause");
}
