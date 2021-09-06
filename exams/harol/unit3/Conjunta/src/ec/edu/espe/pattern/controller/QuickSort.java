/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pattern.controller;

/**
 *
 * @author Luis Haro LAMESTech ESPE-DCC0
 */
public class QuickSort implements SortingStrategy {

    @Override
    public int[] sort(int[] data) {

        int left = 0, right = data.length - 1;
        data = quickSort(data, left, right);
        return data;
    }

    private int[] quickSort(int[] data, int left, int right) {

        int pivot = data[left];
        int i = left;
        int k = right;
        int aux;

        while (i < k) {
            while (data[i] <= pivot && i < k) {
                i++;
            }
            while (data[k] > pivot) {
                k--;
            }
            if (i < k) {
                aux = data[i];
                data[i] = data[k];
                data[k] = aux;
            }
        }
        data[left] = data[k];
        data[k] = pivot;

        if (left < k - 1) {
            quickSort(data, left, k - 1);
        }
        if (k + 1 < right) {
            quickSort(data, k + 1, right);
        }

        return data;
    }

}
