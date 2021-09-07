/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

/**
 *
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class QuickSort implements SortingStrategy{

    @Override
    public int[] sort(int[] data) {
          
      int order [] = {};
        
        int i, j, pivote, aux;
        int primero=0; 
        int ultimo=data.length-1;
        
        i = primero;
        j = ultimo;
        pivote=data[(primero+ultimo)/2];
        
        do{
            while(data[i]<pivote){
                i++;
            }
            while(data[j]>pivote){
                j--;
            }
            
            if(i<=j){
                aux = data[i];
                data[i] = data[j];
                data[j] = aux;
                i++;
                j--;
            }
        }while(i<=j);
        
        
        for(i=0; i<data.length; i++){
            order[i]=data[i];
        }
        
        System.out.println("Quick Sort");
        return order;
        
    
  }
}
