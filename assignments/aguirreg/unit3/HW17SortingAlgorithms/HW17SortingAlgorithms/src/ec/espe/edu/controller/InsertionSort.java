/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.controller;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class InsertionSort implements SortingStrategy {

    @Override
    public int[] sort(int[] data2) {
        
        //TODO program Insertion sort algirths
        // sort the data and return it
        
        
        int aux;
        int count1;
        int count2;
        System.out.println("Ordering using Insertion Sort");

        for(count1 =1; count1<data2.length;count1++)
        {
            aux = data2[count1];
            for(count2=count1-1;count2>=0 && data2[count2]>aux;count2--)
            {
                data2[count2+1]=data2[count2];
                data2[count2]=aux;
            }
        }
            
            
        
        int[] sortedData = data2; // this is only here to compile// this is only here to compile
        return sortedData;
    }

   
}
