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
public class InsertionSort implements SortingStrategy{

    @Override
    public int[] sort(int[] data) {
        
     
     int order [] = {};
     int i ; 
     int pos, aux;
        for(i=0;i<data.length;i++){
            pos = i;
            aux = data[i];
            
            while((pos>0)&&(data[pos-1]>aux)){
                data[pos] = data[pos-1];
                pos--;
            }
            data[pos] = aux;
        }

        for(i=0; i<data.length; i++){
            order[i]=data[i];
        }

        System.out.println("Insertion Sort");
        return order;
    }
}
