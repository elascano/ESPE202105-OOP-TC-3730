/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

import java.util.Scanner;

/**
 *
 * @author LILIAN IZA TOURIST GUEST OPP-ESPE
 */
public class QuickSort implements SortingStrategy {

    /*@Override
    public int[] sort(int[] data) {
        
        //TODO program the bubble sort algorithm
          //sort the data and return it 
          System.out.println("ordering"+ data + "using Quick sort");
          int[] sortedData = data; //this in only here to compile
          return sortedData;
    }*/
    //Author CodeMyN link: https://codemyn.blogspot.com/2016/10/metodo-de-ordenamiento-quicksort-en-java.html
    
    public static void main (String [] args){
    Scanner keyboard= new Scanner(System.in);
   
        System.out.print("Add dimesion: ");
        int tam=keyboard.nextInt();
        int[] arrangement= new int[tam];
     
        //Ingresando valores al arrangement
        for(int i=0; i<arrangement.length; i++){
            System.out.print("A["+i+"]= ");
            arrangement[i]=keyboard.nextInt();
        }

        quicksort(arrangement,0,tam-1);
     
        
        System.out.println("===== Sequence Order ====");
        for(int i =0; i<arrangement.length;i++){
         System.out.print("\t"+arrangement[i]);
     }
 
    }
 
    
    static void quicksort(int[] arrangement,int first,int latest){
 int central,i,j;
 int pivot;
 central=(first+latest)/2;
 pivot=arrangement[central];
 i=first;
 j=latest;
 do{
   while(arrangement[i]<pivot) i++;
   while(arrangement[j]>pivot) j--;
   if(i<=j){
    int temp;
    temp=arrangement[i];
    arrangement[i]=arrangement[j]; 
    arrangement[j]=temp;
    i++;
    j--;
   }
  }
 
 while(i<=j);
 if(first<j)
  quicksort(arrangement,first,j); 
 if(i<latest)
  quicksort(arrangement,i,latest); 
}
    
}
