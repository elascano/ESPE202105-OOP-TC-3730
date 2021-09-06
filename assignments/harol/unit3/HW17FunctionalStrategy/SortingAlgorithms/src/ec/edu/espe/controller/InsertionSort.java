/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

/**
 *
 * @author Luis Haro LAMESTech ESPE-DCC0
 */
public class InsertionSort implements SortingStrategy {

    //copyright Geeks for Geeks
    //https://www.geeksforgeeks.org/insertion-sort/
    @Override
    public int[] sort(int[] data) {
        System.out.println("ordering " + data+ ", using Insertion sort");
        int n = data.length;
        for (int i = 1; i < n; ++i) {
            int key = data[i];
            int j = i - 1;
            while (j >= 0 && data[j] > key) {
                data[j + 1] = data[j];
                j = j - 1;
            }
            data[j + 1] = key;
        }
        printArray(data, data.length);
        return data;
    }

    public void printArray(int[] data, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

}
