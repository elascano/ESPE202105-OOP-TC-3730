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
public class InsertionSort implements SortingStrategy {

    @Override
    public int[] sort(int[] data) {
        for(int i=1;i<data.length;i++){
             int temp=data[i];
             int j=i;
             while(j>0  && data[j-1]>temp){
                 data[j]=data[j-1];
                 j--;   
             }
             data[j]=temp;
           
         }
        System.out.println("ordering"+ data+", using Insertion sort");
        System.out.println("The new sequence: \n   ");
         for(int i=0;i<data.length;i++){
             System.out.print(data[i]+",");
         }
         System.out.println();
        int[] sortedData=data; // this is only here to compile
        return sortedData;
        
        
    }
    
}
