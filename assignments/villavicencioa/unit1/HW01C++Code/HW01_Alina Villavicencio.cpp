
#include<iostream>
#include<conio.h>
#include <stdio.h>

using namespace std;
int i;//variable global
void first(int number[5]);//case 1

void second(float array1[3]);//case 2

void third(int array2);//case 3


int main()
{
    int category;

    cout<<"\t\ HW02_Alina Villavicencio"<<endl;

    cout<<"\t\ What exercise will you do"<<endl;
    cout<<"\t\ 1. Add the elements of an array of 5 integers."<<endl;
    cout<<"\t\ 2. Compute the average of three elements of an array of floats."<<endl;
    cout<<"\t\ 3. Find out if a specific integer is part of an array,"<<endl;
    cout<<"\t\    the array will have the following elements{12,23,34,98,87,65,0}."<<endl;

    cout<<"\n\t\Write the category number"<<endl;
    cin >> category;
    switch(category)
    {
    case 1:
    {
        int number[5];
        first(number);
    }
    break;
    case 2:
    {
      float array1[3];
        second(array1);
    }
    break;
    case 3:
    {
      int array2;
        third(array2);
    }
    break;
    }
    return 0;
}

void first(int number[5])
{

   int sum=0;
    for (i=0;i<5; i++)
    {
        cout<<"Write the number"<< i+1<<endl;
        cin>>number[i];
        sum=sum+number[i];
    }

    cout<<"The total amount:"<<sum<< endl ;
}
void second(float array1[3])
{
    float average=0;
    for (i=0;i<3; i++)
    {
        printf("Write the number %d :\n",i+1);
        scanf("%f",&array1[i]);
        average+=array1[i];
    }
    printf("The total average is: %.2f",average/3);

}
void third(int array2)

{
        int num,resp=0;
        int elements[]={12,23,34,98,87,65,0};
    cout<<"Enter the number to search: "<<endl;
    cin>>num;
    for (i=0;i<7; i++)
    {
    cout<<elements[i]<<endl;
    }
    for (i=0;i<7; i++)
    {
    if (num==elements[i])
    resp=1;
    }
    if(resp==0)
    cout<<"The number "<< num <<" not in the arrangement"<<endl;
    else
    {
    cout<<"The number "<< num <<" is in the arrangement"<<endl;
    }
}


