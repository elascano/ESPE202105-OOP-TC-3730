package ec.edu.espe.controller;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LILIAN IZA TOURIST GUEST OPP-ESPE
 */
//Author CodeMyN link: https://codemyn.blogspot.com/2016/10/metodo-de-ordenamiento-quicksort-en-java.html
public class ShakerSort {
    
    public static void main(String[] args){
      Scanner keyboard = new Scanner(System.in);
        int  A[]=new int [20];
        int i, k, right, left, Aux, N;
     
        System.out.print("Add dimesion: ");
        N=keyboard.nextInt();
                k=N;
               left=2;
               right=N;
             
        for(i=1;i<=N;i++){
            System.out.print("A["+i+"]= ");
            A[i]=keyboard.nextInt();
        }
     
        do{
   for(i=right;i>=left;i--){
    if(A[i-1]>A[i]){
     Aux=A[i-1];
     A[i-1]=A[i];
     A[i]=Aux;
     k=i;
    }
  }
   left=k+1;
   for(i=left;i<=right;i++)
    if(A[i-1]>A[i]){
     Aux=A[i-1];
     A[i-1]=A[i];
     A[i]=Aux;
     k=i;
    }
   right=k-1;
  }while(left<right);//Fin del ordenamiento
     
        System.out.println("The sequence order");
         for(i=1;i<=N;i++){
            System.out.print("\t"+A[i]);
         
        }
 
}
}
