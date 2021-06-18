#include<iostream>

using namespace std;

int main() 
{
    {int array[5];
    int sum = 0;
    
    
    cout << "1) Enter 5 numbers for array: "<< endl;
    
    for (int i=0; i<5; i++)
	{
	cin >> array[i];
	sum=sum+array[i];
	}
    cout <<	endl;
    cout<< "The sum of the elements of the array is: "<< sum << endl;
     cout << endl;
    }
    {float values [3];
    float average = 0;
    float sum = 0;
    
    cout << "2) Enter decimal values for the array: "<< endl;
    
    for (float i=0; i<3; i++)
	{
	cin >> values[3];
	average = average +(sum+values[3])/3;
	}
	cout <<	endl;
    cout<< "The average of the array values is: "<< average << endl;
    cout <<	endl;
   
}
    {int numbers[] = {12,23,34,98,87,65,0};
     int i;
     int datum;
     char band = 'F';
    
    cout<< "3) Enter a number:";
    cin>> datum;
    cout <<	endl;
    
    while((band == 'F') && (i<7))
    {
    	if(numbers[i]== datum)
    	{
    		band = 'V';
        }
        i++;
    }   
    
    if (band == 'F')
    {
    	cout<< "The number is not in the array.";
    }
    
    else if(band == 'V')
    {
    	cout<< "The number is in the position  "<< i-1<<endl;
    }
    
    }	
	return 0;
}
