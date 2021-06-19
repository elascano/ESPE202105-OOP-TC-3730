#include <iostream>
#include <stdio.h>
#include <cstdlib>
int main()
{
	//-----------------Arreglo de 5 enteros --------------------
	
	int NumeroA;
	int NumeroB;
	int NumeroC;
	int NumeroD;
	int NumeroE;
	int Suma;
	std::cout<<"Digite el primer entero:-------\n"; std::cin>>NumeroA;
	std::cout<<"Digite el segundo entero:-------\n"; std::cin>>NumeroB;
	std::cout<<"Digite el tercer entero:-------\n"; std::cin>>NumeroC;
	std::cout<<"Digite el cuarto entero:-------\n"; std::cin>>NumeroD;
	std::cout<<"Digite el quinto entero:-------\n"; std::cin>>NumeroE;
	Suma=NumeroA+NumeroB+NumeroC+NumeroD+NumeroE;
	std::cout<<"Su resultado es este--------:"<<Suma<<::std::endl;
	return 0;
}
