#include <iostream>
using namespace std;
void programa1(int[5]);
void programa2(float[3]);
void programa3();
int main ()
{
int z;
int p1[5];
float p2[3];
cout << "\t###PROGRAMAS###" << endl;
cout << "1. Promedio de cinco numeros enteros" << endl;
cout << "2. Promedio de tres numeros" << endl;
cout << "3. Busqueda del numero en una matriz" << endl;
cout << "Seleccione el programa a ejecutar: ";
cin >> z;
switch(z)
	{
		case 1: programa1(p1);
				break;
		case 2: programa2(p2);
				break;
		case 3: programa3();
				break;
		default: cout << "Error";
	}
	return 0;	
}

void programa1(int ent[5])
{
	int i;
	int suma = 0;
	for (i=0; i<5 ; i++)
	{
		cout << "Ingrese Numero " << i+1 << ":";
		cin >> ent[i];
		suma = suma + ent[i];
	}
		cout << "El promedio es:" << suma/5; 
}

void programa2(float ent[3])
{
	int i;
	float suma = 0;
	for (i=0; i<3 ; i++)
	{
		cout << "Ingrese Numero: " << i+1 << ":";
		cin >> ent[i];
		suma = suma + ent[i];
	}
		cout << "El promedio es: " << (1.0*suma)/3; 
}

void programa3()
{
	int array[7]={12,23,34,98,87,65,0};
	int i, num, ban=0;
	
	cout << "Numero que quieres buscar: ";
	cin >> num;
	for(i=0; i<7; i++)
	{
		if(num==array[i])
	{
		ban=1;
		cout << "El numero " << num << " se encuentra en la lista "<< endl;
		break;
	}
	else
	{
		ban=0;
	}
}
	if(ban==0)
	{
		cout << "El numero " << num << " no se encuentra en la lista" << endl;
	}
}
