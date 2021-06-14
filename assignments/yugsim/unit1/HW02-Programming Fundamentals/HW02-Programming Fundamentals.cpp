#include<iostream>
#include<conio.h>
using namespace std;

void Sum();
void Average();
void Search();

int main(){
	cout << "Hw02 Programming Fundamentals Pamela Yugsi" << endl << endl;
	
	cout << "Enter the values of the first array (5 whole numbers): " << endl;
	Sum();
	
	cout << "Enter the values of the second array (3 numbers): " << endl;
	Average();
	
	cout << "Enter the number to search: ";
	Search();
	
	getch();
	return 0;
}

void Sum(){
	int array1[5], a;
	int sum = 0;
	
	for(a = 0; a < 5; a++){
		cin >> array1[a];
		sum += array1[a];
	}
	cout << "The sum of the elements of the first array is: " << sum << endl << endl;
}

void Average(){
	float array2[3];
	int b;
	float sum = 0;
	float average = 0;
	
	for(b = 0; b < 3; b++){
		cin >> array2[b];
		sum += array2[b];
	}
	average = sum/3;
	cout << "The average of the elements of the second array is: " << average << endl << endl;
}

void Search(){
	int array3[7] = {12, 23, 34, 98, 87, 65, 0};
	int c, num, ban = 0;
	
	cin >> num;
	for(c = 0; c < 7; c++){
		if(num == array3[c]){
			ban = 1;
			cout << "The number if it's on the list." << endl;
		break;
		}
		else{
			ban = 0;
		}
	}
	if(ban == 0){
		cout << "The number is not on the list." << endl;
	}
}
