/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.edu.espe.controller;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class SortingContext {
    private SortingStrategy ss;
    
    public int[] sort(int data[]){
        int size=data.length;
        ss=setSortingStrategy(size);
        return ss.sort(data);
    }
    
    public SortingStrategy setSortingStrategy(int n){
        if(n>0 && n<5){
        ss= new BubbleSort();
    } 
          if(n>5 && n<10){
        ss= new InsertionSort();
    
    } 
            if(n >= 10){
        ss= new QuickSort();
    
    } 
            return ss;
    }
    
}
