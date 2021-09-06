/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.app.controller;

/**
 *
 * @author Kerly Mosquera  ESPE-DCCO
 */
public class SortingContext {
    private SortingStrategy ss;
    
    public int[] sort(int data[]){
        int size = data.length;
        ss = setSortStrategy(size);
        return ss.sort(data);
    }
    
    public SortingStrategy setSortStrategy(int n){
       if(n>0 && n<3)
           ss = new BubbleSort();
       if(n>3 && n<7)
           ss = new InsertionSort();
       if(n>=7)
           ss = new QuickSort();
       
       return ss;
    }
}
