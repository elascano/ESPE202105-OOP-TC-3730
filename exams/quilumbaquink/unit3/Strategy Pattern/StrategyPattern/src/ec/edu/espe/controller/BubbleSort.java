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
public class BubbleSort implements SortingStrategy {

    @Override
    public int[] sort(int[] data) {
        for(int i=data.length -1;i>0;i--){
             for(int j=0;j<i;j++){
                 if(data [j]>data[j+1]){
                     int temp=data[j];
                     data[j]=data[j+1];
                     data[j+1]=temp;
                 }
             }
             
         }
         
         System.out.println("ordering"+ data +", using Bubble sort");
         System.out.println("The new sequence: \n   ");
         for(int i=0;i<data.length;i++){
             System.out.print(data[i]+",");
         }
         System.out.println();
         int[] sortedData=data;
         return sortedData;
        
    }
    
}
