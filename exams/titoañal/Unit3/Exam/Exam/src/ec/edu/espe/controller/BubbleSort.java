/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

/**
 *
 * @author Leslie Titoaña LAMES Tech ESPE-DCC0
 */
public class BubbleSort implements SortingStrategy {

    @Override
    public int[] sort(int[] data) {
        //TODO program the bubble sort algorithm
        //sort the data and return it
        System.out.println("Ordering" + data + ", using Bubble sort");
        int aux;
        int size = data.length;
        for(int i=0; i<size; i++){
            for(int j=0; j<size-1; j++){
                if(data[j]>data[j+1]){
                    aux = data[j];
                    data[j]=data[j+1];
                    data[j+1]= aux;
                }
            } 
            
        }
        return data;
        
    }
     public static void show(int[] data) {
         String cadena=" ";
         
         for(int i=0; i<data.length;i++){
             cadena = cadena+data[i]+" ";

         }
            System.out.println(cadena);

     }

    
}
