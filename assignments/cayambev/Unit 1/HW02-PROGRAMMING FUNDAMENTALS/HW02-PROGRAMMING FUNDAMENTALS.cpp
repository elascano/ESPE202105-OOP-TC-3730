#include <iostream>
using namespace std;

void introduce_exercise1(int[5]);
float average(int whole[5]);

void introduce_exercise2(float[3]);
float prom(float decimal[3]);

int main()
{
	int Num1[5];
	float average1;
	float Num2[3];
	float average2;
	introduce_exercise1(Num1);
	average1= average(Num1);
	
	cout<< "This average is : " << average1 << endl;
	
	cout << endl;
	cout << endl;
	cout << endl;
	
	introduce_exercise2(Num2);
	average2= prom(Num2);
	cout<< "This average is : " << average2 << endl;
	
		
}

void introduce_exercise1(int whole[5])
{
	int a;
	for (a=0;a<5;a++)
	{
		cout<< "Write a number " << a+1 << ": ";
		cin>> whole[a];
	}
	
}

float average(int whole[5])
{
	float sum;
	int a;
	float average;
	
	for(a=0;a<5;a++)
	{
		sum=sum+whole[a];
	}
	average=sum/5;
	
	return average;
}

void introduce_exercise2(float deci[3])
{
	int a;
	for (a=0;a<3;a++)
	{
		cout<< "Write a number " << a+1 << ": ";
		cin>> deci[a];
	}
}

float prom(float deci[3])
{
	float sum;
	int a;
	float prom;
	
	for(a=0;a<3;a++)
	{
		sum=sum+deci[a];
	}
	prom=sum/3;
	
	return prom;
}
