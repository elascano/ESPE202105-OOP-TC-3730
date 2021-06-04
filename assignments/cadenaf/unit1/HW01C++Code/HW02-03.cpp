//Find out if a specific integer is part of an array, the array will have the following elements { 12,23,34,98,87,65,0},
// the user must enter the number to search for and the program tells whether the number is in the list or not.

#include<iostream>
#include<conio.h>

using namespace std;

int main()
{
    int arreglo[7], num, dat;
    //llenamos el arrelo
    cout<<"Ingrese 7 numeros enteros: "<<endl;
    for(int i=0;i<7;i++)
    {
        cout<<"Numero "<<i<<": ";
        cin>>arreglo[i];
    }
    //imprimimos posiciones del arreglo
    cout<<endl<<"POSICIONES DEL ARREGLO"<<endl;
    for(int i=0; i<7; i++)
    {
        cout<<"Arreglo["<<i<<"]="<<arreglo[i]<<endl;
    }
    //Imprimir arreglo
    cout<<endl<<"ARREGLO;"<<endl<<"[";
    for(int i=0;i<7;i++)
    {
        cout<<arreglo[i]<<" ";
    }
    cout<<"]"<<endl;
    //Busacar un numero en el arreglo
    cout<<"Digite el numero a buscar: ";
    cin>>num;
    for(int i=0;i<7;i++)

        if(num==arreglo[i])
        {
            dat=1;
            cout<<"El numero "<<num<<" si es parte del arreglo y se encuentra en la posicion:  "<<"["<<i<<"]"<<endl;
            break;
        }

    return 0;
}

