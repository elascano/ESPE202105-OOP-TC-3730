#include <iostream>
#include <stdlib.h>
using namespace std;

struct deber{
	char a[25];
	float nota1, nota2, nota3, promedio;
	int n, i, A[25], num, primero, ultimo, medio;
	
};

int main(){
	deber registro;
	cout << "Primer punto del deber " << endl;
	cout << "Ingrese los valores: ";
	cin.getline(registro.a,25);
	cout << "Los valores son: " << registro.a << endl;
	
	cout << "Segundo punto del deber " << endl;
	cout << "Ingrese la primera nota: ";
	cin >> registro.nota1;
	cout << "Ingrese la segunda nota: ";
	cin >> registro.nota2;
	cout << "Ingrese la tercera nota: ";
	cin >> registro.nota3;
	cout << "El promedio es: "<< (registro.nota1+registro.nota2+registro.nota3)/3<< endl;

	cout << "Tercer punto del deber " << endl;
	cout << "Cuantos elementos te gustaria ingresar?: ";
	cin >> registro.n;
	
	for(registro.i=0; registro.i<registro.n; registro.i++)
	{
		cout << "Ingrese el elemnto [" << registro.i <<" ] ";
		cin >> registro.A[registro.i];
	}
	cout << "Ingrese el numero que desea buscar: ";
	cin >> registro.num;
	registro.primero = 0;
	registro.ultimo = registro.n-1;
	registro.medio = (registro.primero + registro.ultimo)/2;
	while(registro.primero <= registro.ultimo)
	{
		if(registro.A[registro.medio] < registro.num)
		{
			registro.primero=registro.medio+1;
		}
		else if (registro.A[registro.medio] == registro.num)
		{
			cout << "Se introdujo en la posicion "<< registro.medio+1 << endl;
			cout << "En el indice ["<< registro.medio<< "]" << endl;
			break;
		}
		else
		{
			registro.ultimo = registro.medio - 1;
		}
		registro.medio=(registro.primero+registro.ultimo)/2;
	}
	if (registro.primero > registro.ultimo);
	{
		cout << registro.num << " No se encontro ";
	}
	return 0;
}
