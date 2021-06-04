#include<iostream>
using namespace std;

//part 1
void array1(int A[5], int x);
int x = 0;
int array[5];
//

//part 2
void average();
//

//part3
void list();
//

int main(){
	cout << "\tUNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE\n\t\t      Homework 2 \n\tName: Erick Yanez \n\tNRC: 3730\n";
	cout << "Enter an option. \n 1. Sum of 5 elements typed by keyboard. \n 2. Average of 3 floats typed by keyboard. \n 3. Find out if a specific integer is part of an array.\n";
	cin >> x;
	switch(x){
		case 1: array1(array, x);
				break;
		case 2: average();
				break;
		case 3: list();
				break;
		default:cout << "Invalid option." << endl;
				return main();
	}
	return 0;
}

void array1(int A[5], int x){
	cout << "Enter 5 numbers: " << endl;
	for(x = 0; x < 5; x++){
		cin >> A[x];
	}
	cout << "The sum of the elements is: " << A[1] + A[2] + A[3] + A[4] + A[0];
}

void average(){
	float grades[3];
	cout << "Enter 3 float numbers: " << endl;
	for(x = 0; x < 3; x++){
		cin >> grades[x];
	}
	cout << "The average is: " << (grades[0] + grades[1] + grades[2])/3;
}

void list(){
	int num, ban=0;
	int elements[7] = {12, 23, 34, 98, 87, 65, 0};
	cout << "The numbers in the array are: \n ";
	
	for(x = 0; x < 7; x++){
		cout << elements[x] << " ";
	}
	
	cout << "\nEnter a number to search in the array.\n";
	cin >> num;
	
	for(x = 0; x < 7; x++){
		if(num == elements[x]){
			ban = 1;
			cout << "The number " << num << " is in the position [" << x+1 << "]" << endl;
			break;
		}
		else ban = 0;
	}
	
	if(ban == 0){
		cout << "The number doesnt exist in the array." << endl;
	}
}
