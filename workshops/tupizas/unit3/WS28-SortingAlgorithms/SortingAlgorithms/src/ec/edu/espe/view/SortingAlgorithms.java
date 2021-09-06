/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.view;

import ec.edu.espe.controller.SortingContext;



/**
 *
 * @author Solange Tupiza search for electrical and electronic materials
 * OOP-ESPE
 */
public class SortingAlgorithms {
    
    public static void main(String[] args){
  
  SortingContext sortingContext = new SortingContext();

  int data[] = {3,5,6,7};
  int sortedList[] = sortingContext.sort(data);
  
  int data2[] = {3, 5,6,7,5,7};
  sortingContext.sort(data2);
  
  int data3[] = {3,5,6,7,5,7,10,12,24,45,12,23};
  sortingContext.sort(data3);
  
   }
    
}
