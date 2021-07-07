// CUASPA ELIANA
#include<conio.h>
#include<iostream>

using namespace std;
int main()
{
    cout<<"\tUniversidad de las Fuerzas Armadas ESPE\n"<<endl;
        cout<<"\tProgramacion Orientada  a Objetos \n"<<endl;
    {
    int numbers[5];
    int sum=0;
    cout<<"\tAdd the elements of an array of 5 integers, where the integers must be entered with the keyboard"<<endl;
    for(int i=0;i<5;i++)
    {
        cin>>numbers[i];
        sum += numbers[i];
	}
	cout<<"\tThe result is?\n"<<sum<<endl;
    }
    {
        int i;
        float average;
        float vector[3];
        cout<<"\tCompute the average of three elements of an array of floats, also the numbers must be entered with the keyboards."<<endl;
        for(i=0;i<3;i++)
        {
          cout<< "\tElements["<<i<<"]:\n";
          cin>>vector[i];
        }
        cout << "\tThe average of three elements is?\n";
        average=0;
        for(i=0;i<5;i++)
            average+=vector[i];
        average/=3;
        cout<<average<<endl;
    }
    {
        int num;
        int x=0;
        int i;
        int array1[]={12,23,34,98,87,65,0};
        cout<<"\tFind out if a specific integer is part of an array,"<<endl;
        cout<<"\tthe array will have the following elements { 12,23,34,98,87,65,0},"<<endl;
        cout<<"\tthe user must enter the number to search for and the program tells"<<endl;
        cout<<"\twhether the number is in the list or not.\n"<<endl;
        cin>>num;
        for (i=0;i<7;i++)
        {
            cout<<array1[i]<<endl;
        }
        for(i=0;i<7;i++)
        {
            if(num==array1[i])
                x=1;
        }
        if(x==0)
            cout<<"\tThe number is unlisted\n"<<endl;
        else
        {
            cout<<"\tThe number is on the list\n"<<endl;
        }
        cout<<"\tThank you\n"<<endl;
    }
	getch();
	return 0;
}
