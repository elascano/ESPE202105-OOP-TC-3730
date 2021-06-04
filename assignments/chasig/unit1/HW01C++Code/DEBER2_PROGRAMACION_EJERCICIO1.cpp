//Add the elements of an array of 5 integers, where the integers must be entered with the keyboard.
#include<iostream>
#include<conio.h>

using namespace std;

int main()
{
	int NumeroA,NumeroB,NumeroC,NumeroD,NumeroE,Suma;
	cout<<"Introduzca el primer numero entero:\n";
	cin>>NumeroA;
	cout<<"Introduzca el segundo numero entero:\n";
	cin>>NumeroB;
	cout<<"Introduzca el tercer numero entero:\n";
	cin>>NumeroC;
	cout<<"Introduzca el cuarto numero entero:\n";
	cin>>NumeroD;
	cout<<"Introduzca el quinto numero entero:\n";
	cin>>NumeroE;
	Suma=NumeroA+NumeroB+NumeroC+NumeroD+NumeroE;
	cout<<"El resultado de la suma es:"<<Suma<<endl;

	return 0;
}
