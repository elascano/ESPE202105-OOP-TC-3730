//Suma de elementos de un arreglo de 5 enteros
#include<stdio.h>
#include <iostream>
#include<conio.h>
using namespace std;
int main()
{
	int numero[] = {6,12,7,18,10};
	int suma=0;

	for(int i=0;i<5;i++){
		suma += numero[i];
	}

	cout<<"La suma de los elementos de un arreglo es: "<<suma<<endl;
	getch();
	return 0;
}

