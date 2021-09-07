/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.SortApp.controller;

/**
 *
 * @author Johny Ango OOPTech ESPE-DCCO
 */
public class InsertionSort implements SortingStrategy {

    @Override
    public int[] sort(int[] data) {
        int n = data.length;
        for (int j = 1; j < n; j++) {
            int key = data[j];
            int i = j - 1;
            while ((i > -1) && (data[i] > key)) {
                data[i + 1] = data[i];
                i--;
            }
            data[i + 1] = key;
        }
        return data;
    }

}
