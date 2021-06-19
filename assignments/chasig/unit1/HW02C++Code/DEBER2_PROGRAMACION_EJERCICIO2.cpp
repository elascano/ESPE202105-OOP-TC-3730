// Compute the average of three elements of an array of floats, also the numbers must be entered with the keyboards.

#include<iostream>
#include<conio.h>

using namespace std;

int main()
{
	int NumeroA,NumeroB,NumeroC,Promedio;
	cout<<"Introduzca el primer numero entero:\n";
	cin>>NumeroA;
	cout<<"Introduzca el segundo numero entero:\n";
	cin>>NumeroB;
	cout<<"Introduzca el tercer numero entero:\n";
	cin>>NumeroC;

	Promedio=(NumeroA+NumeroB+NumeroC)/3;
	cout<<"El promedio es:"<<Promedio<<endl;

	return 0;
}
