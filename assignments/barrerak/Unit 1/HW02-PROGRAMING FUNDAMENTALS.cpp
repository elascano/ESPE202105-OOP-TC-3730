#include <iostream>
using namespace std;

void enterNumber(int vE[5]);
void enterNumberfloat(float vF[3]);
void searchNumber(int vL[7]);

void enterNumber()
int main ()
{
 float a;
 float b;
 float c;
 float d;
 float e;
 float r;
 int opcion;
 
    cout << "Ingrese un numero "<< endl;
	cin>> a;
	cout << "Ingrese otro numero " << endl;
	cin >> b;
	cout << "Ingrese un numero "<< endl;
	cin>> c;
	cout << "Ingrese otro numero " << endl;
	cin >> d;
	cout << "Ingrese un numero "<< endl;
	cin>> e;
	
	
	cout << "OPCIONES " << endl;
	cout << "1) Promedio " << endl;
	cout << "Escoja su opcion ";
	cin >> opcion;
	
	switch (opcion)
	{
		case 1 : cout<< "El promedio es : " << (a+b+c+d+e)/5;
		    //cout << "El resultado es " << r << endl;
		    break;
	
		default: cout << "ERROR! Esta opcion no existe " <<endl;	        
	 } 
}
