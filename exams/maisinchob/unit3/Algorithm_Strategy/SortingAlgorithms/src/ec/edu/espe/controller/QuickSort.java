/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class QuickSort implements SortingStrategy {
    //copyright Cheko Peralta;

    public static void main(String[] args) {

        int[] arreglo = {9, 5, 6, 2, 1, 0, 8, 7, 3, 4};

        imprimeArreglo(arreglo);

        quicksort(arreglo, 0, 9);

        imprimeArreglo(arreglo);

    }

    public static void imprimeArreglo(int[] arreglo) {

        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println("");
        System.out.println("----------------------");

    }

    public static void quicksort(int[] arreglo, int izq, int der) {

        // ELEGIR PIVOTE
        int pivote = arreglo[izq];

        // LOS ELEMENTOS > AL PIVOTE VAN A LA DERECHA, LOS < A LA IZQUIERDA
        // VARIABLES AUXILIARES: 
        // i PARA LOS ELEMENTOS DE LA IZQUIERDA
        // j PARA LOS ELEMENTOS DE LA DERECHA
        int i = izq;
        int j = der;

        int swap;

        // SE EVALUAN LOS ELEMENTOS PARA UBICAR EL NUEVO PIVOTE
        while (i < j) {
            // MIENTRAS QUE arreglo[i] SEA MENOR O IGUAL AL PIVOTE SE AUMENTA EL VALOR DE i
            // CUANDO NO SE CUMPLE EL WHILE, EL ELEMENTO EN arreglo[i] ES MAYOR AL PIVOTE
            // Y DEBE IR A LA DERECHA
            while (arreglo[i] <= pivote && i < j) {
                i++;
            }
            // MIENTRAS QUE EL arreglo[j] SEA MAYOR AL PIVOTE SE DISMINUYE j
            // CUANDO NO SE CUMPLE EL WHILE EL ELEMENTO EN arreglo[j] ES MENOR O IGUAL AL PIVOTE
            // Y DEBE IR A LA IZQUIERDA
            while (arreglo[j] > pivote) {
                j--;
            }
            // SIEMPRE Y CUANDO i SEA MENOR A j, SE HACE UN CAMBIO DE LOS ELEMENTOS
            if (i < j) {
                swap = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = swap;

                imprimeArreglo(arreglo);
            }
        }
        arreglo[izq] = arreglo[j];
        arreglo[j] = pivote;

        if (izq < j - 1) {
            quicksort(arreglo, izq, j - 1);
        }
        if (j + 1 < der) {
            quicksort(arreglo, j + 1, der);
        }
    }

    @Override
    public int[] sort(int[] data) {
        //TODO program the quick sort algorithm
        //sort the DATA and return It
        System.out.println("ordering" + data + ", using Quick sort");
        int[] sortedData = data; //this is only here to compile
        return sortedData;
    }

}
