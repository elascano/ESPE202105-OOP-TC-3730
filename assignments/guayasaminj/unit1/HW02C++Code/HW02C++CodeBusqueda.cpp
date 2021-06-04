#include<iostream>
#include<conio.h>

using namespace std;

int main()
{
	int list[]={12,23,34,98,87,65,0};
	int i=0,data;
	bool band=false;
	
	cout<<"Enter the number to search: ";
	cin>>data;
	
	while((band==false)&&(i<7)){
		 if(data==list[i]){
		 	band=true;
		 } 
		i++;
	}
	if (band==true){
		cout<<"the data sougth"<<data<<"found himself in the position"<<i-1<<endl;
		
	} else {
		   cout<<"the data sougth"<<data<<"it was not found.\n";
	}
	system("pause");
	return 0;
	 
}
