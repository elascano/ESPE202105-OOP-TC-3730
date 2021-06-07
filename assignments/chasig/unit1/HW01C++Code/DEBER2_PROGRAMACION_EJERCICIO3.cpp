//3.- Find out if a specific integer is part of an array, the array will have the following elements { 12,23,34,98,87,65,0}, the user must enter the number to search for and the program tells whether the number is in the list or not.
#include <stdio.h>
#include <iostream>
void buscarElemento(int a[], int size, int element_Busqueda);

int main()
{
    int array [7]={12,23,34,98,87,65,0};
    int i;
    int elemento;

    int n;

    printf("Ingrese el numero de elementos que desee que se realice en su arreglo: ");
    scanf("%d",&n);

    for(i=0; i<n; i++)
    {
        printf("Ingrese el    %d  numero de su arreglo: ", (i+1) );
        scanf("%d",&array[i]);
    }

    printf("\n\n");

    printf("Ingrese el numero a buscar en el arreglo: ");
    scanf("%d",&elemento);

    buscarElemento(array, n, elemento);

    system("pause");
    return 0;
}

void buscarElemento(int a[], int size, int element_Busqueda)
{
    int j;
    int b = 0;
    int hold1,hold2;

    while(b == 0)
    {
        for(j=0; j<size; j++)
        {
            if(element_Busqueda == a[j])
            {
                hold1 = a[j];
                hold2 = j;
                b=1;
            }
        }
    }

    if(b==1)
    {
    printf("El numero encontrado es %d y se encuentra en la posicion %d.",hold1,hold2);
    }
}
