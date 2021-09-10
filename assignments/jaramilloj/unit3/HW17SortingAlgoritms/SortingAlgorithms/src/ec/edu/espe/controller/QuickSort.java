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
public class QuickSort implements SortingStrategy{

    private int i;
    private int j;
    private int temporal;

    @Override
    public int[] sort(int[] data) {
        System.out.println("ordering" + data + ",using Quick sort"); 
        int[] sortedData = data;
        int first, latest;
        this.i=0;
        for(i=0;i<sortedData.length;i++){
            this.j=0;
            this.temporal=0;
            for(j=i+1;j<sortedData.length;j++){
                if(sortedData[i]>sortedData[j]){
                    temporal=sortedData[i];
                    sortedData[i]=sortedData[j];
                    sortedData[j]=temporal;
                    
                    
                }
            }
        }
        
        return sortedData;
        
        }
    
}
