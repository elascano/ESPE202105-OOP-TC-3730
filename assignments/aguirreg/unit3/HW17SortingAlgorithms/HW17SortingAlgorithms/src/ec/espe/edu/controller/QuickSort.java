/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.controller;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */

//Copyrigth by XCHEKO51X

public class QuickSort {
    
    public static void imprimeArreglo(int[] data) {
    
        for(int i = 0 ; i < data.length ; i++) {
            System.out.print(data[i]+" ");
        }

    
    }
    
    public static void quicksort(int[] data, int izq, int der) {
    
        // ELEGIR PIVOTE
        int pivote = data[izq];
        
        // LOS ELEMENTOS > AL PIVOTE VAN A LA DERECHA, LOS < A LA IZQUIERDA
        // VARIABLES AUXILIARES: 
        // i PARA LOS ELEMENTOS DE LA IZQUIERDA
        // j PARA LOS ELEMENTOS DE LA DERECHA
        int i = izq;
        int j = der;
        
        int swap;
        
        // SE EVALUAN LOS ELEMENTOS PARA UBICAR EL NUEVO PIVOTE
        while(i < j) {
            // MIENTRAS QUE arreglo[i] SEA MENOR O IGUAL AL PIVOTE SE AUMENTA EL VALOR DE i
            // CUANDO NO SE CUMPLE EL WHILE, EL ELEMENTO EN arreglo[i] ES MAYOR AL PIVOTE
            // Y DEBE IR A LA DERECHA
            while(data[i] <= pivote && i < j) {
                i++;
            }
            // MIENTRAS QUE EL arreglo[j] SEA MAYOR AL PIVOTE SE DISMINUYE j
            // CUANDO NO SE CUMPLE EL WHILE EL ELEMENTO EN arreglo[j] ES MENOR O IGUAL AL PIVOTE
            // Y DEBE IR A LA IZQUIERDA
            while(data[j] > pivote) {
                j--;
            }
            // SIEMPRE Y CUANDO i SEA MENOR A j, SE HACE UN CAMBIO DE LOS ELEMENTOS
            if(i < j) {
                swap = data[i];
                data[i] = data[j];
                data[j] = swap;
                
                imprimeArreglo(data);
            }
        }
        data[izq] = data[j];
        data[j] = pivote;
        
        if(izq < j - 1) {
            quicksort(data, izq, j - 1);
        }
        if(j + 1 < der) {
            quicksort(data, j + 1, der);
        }   
    }
}
