#include<iostream>
#include<conio.h>
using namespace std;

void pedirDatos();
int calcularSuma(int vec[],int);                     

int vec[100],tam;

int main(){
	pedirDatos();
	
	cout<<"\nThe sum is: "<<calcularSuma(vec,tam)<<endl;
	
	getch();
	return 0;
}    

void pedirDatos(){
	cout<<"Enter the number of items in the array: ";
	cin>>tam;
	
	for(int i=0;i<tam;i++){
		cout<<i+1<<". Enter a number: ";
		cin>>vec[i];
	}
}  

int calcularSuma(int vec[],int tam){
	int suma=0;
	
	for(int i=0;i<tam;i++){
		suma += vec[i];
	}
	return suma;
}
