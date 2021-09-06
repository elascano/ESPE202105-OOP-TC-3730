/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

/**
 *
 * @author Jean Jaramillo
 */
public class BubbleSort implements SortingStrategy{

    @Override
    public int[] sort(int[] data) {
       System.out.println(" ordering " + data + ", using Bubble sort"); 
       int[] sortedData = data;
       int i;
       boolean flag =true;
       int temp;
       while(flag)
       {
           flag=false;
           for(i=0; i<sortedData.length -1; i++)
           {
               if(sortedData[ i ] <  sortedData[i+1])
               {
                   temp = sortedData[i];
                   sortedData[ i ] = sortedData[ i+1];
                   sortedData[ i+1 ] = temp;
                   flag = true;
                   
               }
           }
       }
       
       return sortedData;
    }
       
}
