//Compute the average of three elements of an array of floats, also the numbers must be entered with the keyboards.
#include<iostream>
#include<conio.h>

using namespace std;

int main()
{
    float arreglo[3], suma=0, promedio;
    //Ingresar los valores del arreglo
    cout<<"Ingrese 3 numeros flotantes: "<<endl;
    for(int i=0;i<3;i++)
    {
        cout<<"Numero "<<i<<": ";
        cin>>arreglo[i];
    }

    //Impresion del arreglo
    cout<<endl<<"ARREGLO;"<<endl<<"[";
    for(int i=0;i<3;i++)
    {
        cout<<arreglo[i]<<" ";
    }
    cout<<"]"<<endl;

    //Suma de los valores del arreglo
    for(int i=0; i<3; i++)
    {
        suma=suma+arreglo[i];
    }

    //promedio del arreglo
    {
        promedio=suma/3;
    }
        cout<<"El promedio de los valores del arreglo es: "<<promedio<<endl<<endl;

    return 0;
}

