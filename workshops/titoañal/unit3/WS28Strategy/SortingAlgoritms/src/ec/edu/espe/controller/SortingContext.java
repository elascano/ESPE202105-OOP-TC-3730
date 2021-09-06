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
public class SortingContext {

    public static void sort(String[] args) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.ra
    }
    private SortingStrategy sortingStrategy;
    public int[]sort(int data[]){
        
        
        int size = data.length;
        sortingStrategy = setSortStrategy(size);
        return sortingStrategy.sort(data);
    }
    
    
    public SortingStrategy setSortStrategy(int n){
        if(n>0 && n<30){
            sortingStrategy = new BubbleSort();
          
        }
        if(n>=30 && n<100){
            sortingStrategy = new InsertionSort();
        }
        if(n>=100){
            sortingStrategy = new QuickSort();
        }
        return sortingStrategy;
            
    }
    
}
