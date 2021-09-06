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
  //Copyrigth by KENNEDY MWANGI


public class BubbleSort implements SortingStrategy {

    @Override
    public int[] sort(int[] data) {
        //TODO program Bubble sort algirths
        // sort the data and return it

        
        int aux;
        boolean change = false;
        
        System.out.println("Ordering using Bubble Sort: ");
        while(true)
        {
            change = false;
            for (int i=1;i<data.length;i++)
            {
                if(data[1]<data[i-1])
                {
                    aux = data[1];
                    data[i] = data[i-1];
                    data[i-1] = aux;
                    change = true;
                }
            }
            if(change == true)
                break;
        }
        
        
        
        int[] sortedData = data; // this is only here to compile
        return sortedData;
    }
}

    
    
