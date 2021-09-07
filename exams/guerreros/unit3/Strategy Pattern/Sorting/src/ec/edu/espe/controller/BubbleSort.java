/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class BubbleSort implements SortingStrategy{
    
    @Override
    public int[] sort(int [] data){
        
        //TODO program the sort algorithm
        //sort the data and return
        int temp;
        for (int i = data.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (data[j] > data[j + 1]) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
        int[] sortedData = data;  //this is only here to complete
        System.out.print("Ordening[");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "/" );
        }
        System.out.print("] , using Bubble Sort" + "\n");
        return sortedData;
    }
    }
    
    
    
    

