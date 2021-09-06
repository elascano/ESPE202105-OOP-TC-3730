/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

import java.util.Scanner;

/**
 *
 * @author LILIAN IZA TOURIST GUEST OPP-ESPE
 */
public class BubbleSort /*implements Strategy */ {
    
     /* @Override
    public int[] sort(int[] data) {
      //TODO program the bubble sort algorithm
          //sort the data and return it 
          System.out.println("ordering"+ data + "using Quick sort");
          int[] sortedData = data;//this in only here to compile
          return sortedData;

    }*/
 //Author CodeMyNlink: https://codemyn.blogspot.com/2016/10/metodo-de-ordenamiento-insertion-sort.html
    
    public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in);
    int B[]= new int [20];
    int i,j,aux;
     System.out.print("Add dimension: ");
     int number=keyboard.nextInt();
   
     for(i=1 ; i<=number; i++){
         System.out.print("A["+i+"]= ");
         B[i]=keyboard.nextInt();
     }
   
     for(i=2;i<=number;i++){
  aux=B[i];
  j=i-1;
          while((j>=1) && (aux<B[j])){
             B[j+1]=B[j];
             j=j-1;
             }
   
    B[j+1]=aux;
 }
 
     System.out.println("the sequence order:");
     for(i=1 ; i<=number; i++){
         System.out.print("\t"+B[i]);
        }
 
 
    }
   
}
