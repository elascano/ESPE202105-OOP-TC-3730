/*                                         UNIVERSIDAD DE LAS FUERZAS ARMADAS-ESPE
                                              PROGRAMACIÓN ORIENTADA A OBJETOS
Nombre: Victor Steve Coba Flores
NRC: 3730
Carrera: Ingeniería en Telecomunicaciones
Write a program that do the following:
1.- Add the elements of an array of 5 integers, where the integers must be entered with the keyboard.
2.- Compute the average of three elements of an array of floats, also the numbers must be entered with the keyboards.
3.- Find out if a specific integer is part of an array, the array will have the following elements {12,23,34,98,87,65,0},
the user must enter the number to search for and the program tells whether the number is in the list or not.  */

#include<iostream>
#include<stdio.h>
using namespace std;

int main(){
	int opcion, i, resultado, busqueda, bandera;
	int matriz[7] = {12, 23, 34, 98, 87, 65, 0};
	float promedio;

	for(;;){
		system("cls");


		cout << "        Options      " << endl;

		cout << " 1. Sum of elements        " << endl;
		cout << " 2. Average of elements    " << endl;
		cout << " 3. search for number       " << endl;
		cout << " 4. to go out                    " << endl;

		cout << "your choice: "; cin >> opcion;

		switch(opcion){
			case 1:
				cout << "\nThe elements of the arrangement:\n" << endl;
				int arreglo[5];
				for(i=0; i<5; i++){
					cout << "Arreglo[" << i << "]: "; cin >> arreglo[i];
				}

				cout << "\nThe sum of the elements is: ";
				resultado = 0;
				for(i=0; i<5; i++)
					resultado += arreglo[i];
				cout << resultado << endl;

				system("pause");
				break;
			case 2:
				cout << "\nEntry of elements of the arrangement:\n" << endl;
				float vector[3];
				for(i=0; i<3; i++){
					cout << "Arreglo[" << i << "]: "; cin >> vector[i];
				}

				cout << "\nThe average of the elements is: ";
				promedio = 0;
				for(i=0; i<5; i++)
					promedio += vector[i];
				promedio /= 3;
				cout << promedio << endl;

				system("pause");
				break;
			case 3:
				cout << "\nBe an integer: "; cin >> busqueda;
				cout << endl;

				bandera = 0;
				for(i=0; i<7; i++){
					if(busqueda == matriz[i]){
						cout << "Number " << busqueda << " found in position " << i << "!" << endl;
						bandera = 1;
					}
				}

				if(bandera == 0)
					cout << "the number " << busqueda << " there is no matrix!" << endl;

				system("pause");
				break;
			case 4:
				cout << "\nExiting the program..." << endl;
				exit(0);
			default:
				cout << "\nIs a correct choice!" << endl;
				system("pause");
				break;
		}
	}

	return 0;
}
