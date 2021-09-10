/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

import utils.SortingStrategy;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class QuickSort implements SortingStrategy {

    @Override
    public int[] sort(int[] data,int der) {
        //TODO program the sort algorithm
        //sort the data and return
        //System.out.println("ordering " + data + "], using Quick sort");
        int[] sortedData = data; //this is only here to complete
        quicksort(data, 0, der);
        imprimeArreglo(data);
        return sortedData;
    }

    public static void quicksort(int[] data, int i, int j) {
        int pivote = data[i]; //i -> izq
        //int i = izq;
        //int j = der;
        int swap;
        
        while (i < j) {
            while (data[i] <= pivote && i < j) {
                i++;
            }
            while (data[j] > pivote) {
                j--;
            }
            if (i < j) {
                swap = data[i];
                data[i] = data[j];
                data[j] = swap;
                imprimeArreglo(data);
            }
        }
        data[i] = data[j];//i -> izq
        data[j] = pivote;
        if (i < j - 1) { //i -> izq
            quicksort(data, i, j - 1); //i-> izq
        }
        if (j + 1 < j) {//j -> der
            quicksort(data, j + 1, j);//j -> der
        }
    }

    public static void imprimeArreglo(int[] data) {
        System.out.print("Sorted using Quick sort[");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "-");
        }
        
        System.out.println("] ");
    }
}
