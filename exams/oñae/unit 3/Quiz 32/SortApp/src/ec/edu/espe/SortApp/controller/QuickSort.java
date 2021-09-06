/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.SortApp.controller;

/**
 *
 * @author Erick Oña PROGRAM BUILDER ESPE-DCCO
 */
public class QuickSort implements SortingStrategy {

    @Override
    public int[] sort(int[] data) {
        int[] datax = data;
        int n = datax.length;
        for (int j = 1; j < n; j++) {
            int key = datax[j];
            int i = j - 1;
            while ((i > -1) && (datax[i] > key)) {
                datax[i + 1] = datax[i];
                i--;
            }
            datax[i + 1] = key;
        }
        return datax;
    }

}
