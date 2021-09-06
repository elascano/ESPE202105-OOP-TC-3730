/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.pattern.controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Luis Haro LAMESTech ESPE-DCC0
 */
public class SortingContext {

    private SortingStrategy ss;

    public int[] sort(int[] data) {

        int size = data.length;
        ss = setSortStrategy(size, data);
        return ss.sort(data);
    }

    public SortingStrategy setSortStrategy(int n, int data[]) {

        if (n >= 0 && n <= 3) {
            ss = new BubbleSort();

        } else if (n >= 4 && n <= 7) {
            ss = new InsertionSort();
        } else if (n >= 7) {
            ss = new QuickSort();
        }

        return ss;
    }

    public String getSortStrategy(int n, int data[]) {
        String sort = "";
        if (n >= 0 && n <= 3) {
            ss = new BubbleSort();
            sort = "Bubble Sort";

        } else if (n >= 4 && n <= 7) {
            ss = new InsertionSort();
            sort = "Insertion Sort";
        } else if (n >= 7) {
            ss = new QuickSort();
            sort = "Quick Sort";
        }

        return sort;
    }
}
