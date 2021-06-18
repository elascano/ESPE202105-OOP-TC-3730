//Calcule el promedio de tres elementos de un arreglo de flotadores
#include<iostream>
main()
{
	system("puntaje");
	float pntj1, pntj2, pntj3, promedio;
	printf("Introduzca los puntajes\n\n");
	printf("1er puntaje: ");
	scanf("%f", &pntj1);
	printf("n2do puntaje: ");
	scanf("%f", &pntj2);
	printf("n3er puntaje: ");
	scanf("%f", &pntj3);
	promedio = (pntj1 + pntj2 + pntj3) / 3;
	printf("\nEl promedio es: %.2f \n\n", promedio);

	system("pause");
}
