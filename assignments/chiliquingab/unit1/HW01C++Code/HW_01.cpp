
#include <iostream>
#include <fstream>

using namespace std;

int menu(){
	
	int x = 0;
	cout << "\nMenu: " << endl;
	cout << "1. Calculate the sum of 5 elements in an array: " << endl;
	cout << "2. Calculate the average of 3 elements in an array of floats: " << endl;
	cout << "3. Search for a number in an array: " << endl;
	cout << "4. Exit" << endl;
	cout << "Option: " ;
	cin >> x;
	
	cout << endl;
	
	return x;
	
}

void suma(){
	
	int num[100];
	int suma;
	int sum;
	
    for (int i=0; i<5; i++)
    {
        cout << "Enter a number: " ;
        cin >> num[i];
    }
    
    cout << endl;
    
    for (int i=0; i<5; i++)
    {
        suma = suma + num[i];
    }
    
    sum = suma - 1;
    
    cout << "The result of the sum of the elements of the array is: " << sum;
    
    cout << endl;
    
}

void promedio(){
	
	float num[100];
	float suma;
	float prom;

    for (int i=0; i<3; i++)
    {
        cout << "Enter a number: " ;
        cin >> num[i];
    }
    
    cout << endl;
    
    for (int i=0; i<3; i++)
    {
        suma = suma + num[i];
    }
    
    prom = suma/3;
    
    cout << "The average of the 3 elements of the array is: " << prom;
    
    cout << endl;
	
}

void buscar(){
	
	int a[] = {12, 23, 34, 98, 87, 65, 0};
	int i, dato;
	char band = 'F';
	
	cout << "Enter the number you want to search: " ;
	cin >> dato;

	i=0;
	
	while((band == 'F') && (i<7)){
		if (a[i] == dato){
			band = 'V';
		}
		i++;
	}
	
	if (band == 'F'){
		
		cout << "\nThe number does not exist in the array.";
		
	}
	else if(band == 'V'){
		cout << "\nThe number if found in the array.";
	}
	
	cout << endl;
	
}

int main(){
	
	cout << "Homework 02 -> Programing Fundamentals" << endl;
	cout << "Telecomunications Engineering" << endl;
	cout << "My name is Bryan Chiliquinga" << endl;
	cout << "NRC: 3730 "<<endl;
	
	int x = 0;
	
	do{
		x = menu();
		switch(x){
			case 1:
				suma();
			break;
			case 2:
				promedio();
			break;
			case 3:
				buscar();
			break;
		}
	}
	
	while(x != 4);
	
	return 0;
}
