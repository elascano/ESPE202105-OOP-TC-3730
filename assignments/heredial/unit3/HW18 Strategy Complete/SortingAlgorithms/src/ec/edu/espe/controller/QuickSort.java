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
public class QuickSort implements SortingStrategy {

    @Override
    public int[] sort(int[] data) {
        //TODO program the sort algorithm
        //sort the data and return
        //System.out.println("ordering " + data + "], using Quick sort");
        int[] sortedData = data; //this is only here to complete
        quicksort(data, 0, 11);
        imprimeArreglo(data);
        return sortedData;
    }

    public static void quicksort(int[] data, int izq, int der) {
        int pivote = data[izq];
        int i = izq;
        int j = der;
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
                //imprimeArreglo(data);
            }
        }
        data[izq] = data[j];
        data[j] = pivote;
        if (izq < j - 1) {
            quicksort(data, izq, j - 1);
        }
        if (j + 1 < der) {
            quicksort(data, j + 1, der);
        }
    }

    public void imprimeArreglo(int[] data) {
        System.out.print("Ordening[");
        for (int i = 0; i < data.length; i++) {
            System.out.print( + data[i] + "/");
        }
        System.out.println("], using Quick Sort ");
    }

}
