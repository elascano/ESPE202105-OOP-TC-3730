/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

/**
 *
 * @author Erick Oña PROGRAM BUILDER ESPE-DCCO
 */
public class SortingContext {
    private SortingStrategy ss;
    
    
    public SortingStrategy setSortStrategy(int n){
       
        if(n>0 &&  n <30){
        ss = new BubbleSort();
    }
        if(n>=30 &&  n < 100){
           ss = new InsertionSort();  
        }
            if (n>=10){
                ss = new QuickSort();
            }
            return
    }
        
        
}
