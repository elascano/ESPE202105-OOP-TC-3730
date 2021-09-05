/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

/**
 *
 * @author AnitaQ
 */
public class QuickSort implements SortingStrategy {
    
    
    @Override
    public int [] sort(int[] data) {
        
        //TODO program the quick sort algorithm
        /// sort the data and return it
        int low=0;
        int high=data.length -1;
        
        int middle=low+(high-low)/2;
        int pivot=data[middle];
        int i=low,j=high;
       
        
        while(i<=j){
            while(data[i]<pivot){
                i++;
            }
            while(data[j]>pivot){
                j--;
            }
            if(i<=j){
                int temp=data[i];
                data[i]=data[j];
                data[j]=temp;
                i++;
                j--;
            }
        }
        System.out.println("ordering"+ data+", using Quick sort");
        System.out.println("The new sequence: \n   ");
         for(int m=0;m<data.length;m++){
             System.out.print(data[m]+",");
         }
         System.out.println();
        int[] sortedData=data; // this is only here to compile
        return sortedData;
    }
    
}
