#include<iostream>
#include<stdio.h>

using namespace std;
#define TEX 5

 int main()
{  cout<< "Autor: Stefany Guerrero "<<  "\n";
  cout<< " Item 1. " << "\n";
   cout<< "Welcome!, in this program you can create your array" << "\n";
   cout<< "Respectively enter the numbers :" << "\n";
  int nums[TEX];
  for(int i=0; i<TEX ; i++)
  {  cin>> nums[i];
  }
cout<< "the values entered in your number array are: "<<  endl;
for(int i=0;i<5;i++)
{
	cout<<nums[i]<< "  ";
}
  cout<< " \n ";
  cout << "Here you can perform the sums of your  array" << "\n";
    int numero1, numero2, numero3, numero4 , numero5 ;
    cout << "Please enter the one number of your array: " << "\n";
    cin >> numero1;
    cout << "Please enter the two number of your array: " << "\n";
    cin >> numero2;
    cout << "please enter the third number of your array: " << "\n";
    cin >> numero3;
    cout << " please enter the four number of your array: " << "\n";
    cin >> numero4;
    cout << "please enter the five number of your array:" << "\n";
    cin >> numero5;
    cout << numero1 << " + " << numero2 << "+" <<numero3 << "+" <<numero4<< "+" <<numero5<< " = " << numero1 + numero2+ numero3+ numero4 + numero5;
    cout<< "\n";
    cout<< "  Item 2. " << "\n";
float number[3];
	float average=0;
	cout<<"Calculation of the average of 3 decimal numbers"<< "\n"; 
	for(int i=0;i<3;i++)
	{
		cout<<"enter the number:"<< i+1 << "\n"; 
		cin>> number[i]; 
		average+= number[i];
		cout<<"\n"<< "\n"; 
	}
	cout<<"Average of the numbers are: "<<average/ 3<< "\n"; 
	cout<< "Item 3" << "\n";
	cout<< "Look up number in the matrix" << "\n"; 
	int a[]={12,23,34,98,87,6,0};
	int i,date;
	char band = 'F';
	cout<<"Enter the number"<< "\n";
	cin>>date;
	i=0;
	while((band=='F')&& (i<7)){
		if(a[i]==date){
			band = 'V';
		}
		i++;
	}
	if(band=='F'){
		cout<<"The number searched does not exist"<<"\n";
	}
	else if(band=='V')
	{
		cout<<"The number searched if it exists "<< "\n";
	}
   return 0;

}













