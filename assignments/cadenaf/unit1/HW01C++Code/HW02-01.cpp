//Add the elements of an array of 5 integers, where the integers must be entered with the keyboard.

#include<iostream>
#include<conio.h>

using namespace std;

int main()
{
    int arreglo[5], posicion, suma=0;
    //Ingresar los valores del arreglo
    cout<<"Ingrese 5 numeros enteros: "<<endl;
    for(int i=0;i<5;i++)
    {
        cout<<"Numero "<<i<<": ";
        cin>>arreglo[i];
    }

    //Impresion del arreglo
    cout<<endl<<"ARREGLO;"<<endl<<"[";
    for(int i=0;i<5;i++)
    {
        cout<<arreglo[i]<<" ";
    }
    cout<<"]"<<endl;

    //Suma de los valores del arreglo
    for(int i=0; i<5; i++)
    {
        suma=suma+arreglo[i];
    }
    cout<<"La suma de los valores del arreglo es: "<<suma<<endl<<endl;


    return 0;
}
