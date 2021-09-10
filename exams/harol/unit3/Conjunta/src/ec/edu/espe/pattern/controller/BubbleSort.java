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
public class BubbleSort implements SortingStrategy {

    public int[] sort(int data[]) {
        int n = data.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (data[j - 1] > data[j]) {

                    temp = data[j - 1];
                    data[j - 1] = data[j];
                    data[j] = temp;
                }
            }
        }

        return data;

    }
}

