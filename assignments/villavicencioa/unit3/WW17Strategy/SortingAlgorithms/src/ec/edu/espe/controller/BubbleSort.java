/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

/**
 *
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
 */
public class BubbleSort implements SortingStrategy{

    @Override
    public int[] sort(int[] data) {
     System.out.println("ordering"+ data + ", using Bubble sort" );
     int[] sortedData = data; // this is only her to compile
     //return sortedData; 
     mostrar(data);
     for (int i=0; i< data.length; i++){
       for(int j=0; j< data.length-1; j++){
                if(data[j]>data[j+1]){
                    int aux= data[j];
                    data[j]=data[j+1];
                    data[j+1]=aux;
                }
            
            }  
        } 
        
        public static void mostrar (int data[]){
         for(int i=0; i< data.length; i++){
             System.out.print(data[i]+"");
             
        }System.out.println(""); 
    }
    }
         
     
    
        //TODO program the bubble sort algorithm
        // sort the data and return it
       
    /**
     *
     * @param data
     */
    //public static void burbuja (int data[]){
        //sort(data);
        //
        
            
         
       
       
         
}

   
 
 
     
