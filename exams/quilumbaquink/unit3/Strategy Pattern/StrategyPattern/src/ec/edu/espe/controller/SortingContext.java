/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

/**
 *
 * @author AnitaQ
 */
public class SortingContext {
    private SortingStrategy sortingStrategy;
    
    public int [] sort(int data[]){
        int size=data.length;
        sortingStrategy=setSortStrategy(size);
        return sortingStrategy.sort(data);
    }
    
    public SortingStrategy setSortStrategy(int n ){
        if(n>0 && n<3){
            sortingStrategy=new BubbleSort();
           
        }
        if(n>=4 && n<7){
            sortingStrategy=new InsertionSort();
           
        }
        if(n>=7){
            sortingStrategy=new QuickSort();
           
        }
        return sortingStrategy;
        
        
    }
    
}
