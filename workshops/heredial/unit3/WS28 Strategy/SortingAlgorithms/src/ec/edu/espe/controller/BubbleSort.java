/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class BubbleSort implements SortingStrategy{
    
    @Override
    public int[] sort(int [] data){
        
        System.out.println("ordening" + data + ", using Bubble Sort");
        int [] sortedData = data;
        return sortedData;
        
    }
    
    
    
    
}