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
public class SortingContext {

    private SortingStrategy sortingStrategy;

    public int[] sort(int data[]) {
        int size = data.length;
        sortingStrategy = setSortStrategy(size);
        return sortingStrategy.sort(data);
    }

    public SortingStrategy setSortStrategy(int n) {

        if (n > 0 && n < 5) {
        sortingStrategy = new BubbleSort();
        }
        //if (n <= 3) {
            //sortingStrategy = new BubbleSort();
        //}
        if (n >= 5 && n < 10) {
        sortingStrategy = new InsertionSort();
        }
        //if (n > 3 && n <= 7) {
            //sortingStrategy = new InsertionSort();
        //}
        if (n >= 10) {
        sortingStrategy = new QuickSort();
        }
        //if (n > 8) {
            //sortingStrategy = new QuickSort();
        //}

        return sortingStrategy;

    }

}
