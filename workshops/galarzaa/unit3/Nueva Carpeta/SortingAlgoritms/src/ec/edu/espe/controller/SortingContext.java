/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

/**
 *
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
 */
public class SortingContext {

    private SortingStrategy sortingStrategy;

    public int[] sort(int data[]) {
        int size = data.length;
        sortingStrategy = setSortingStrategy(size);
        return sortingStrategy.sort(data);
    }

    public SortingStrategy setSortingStrategy(int n) {
        if (n > 0 && n < 5) {
            sortingStrategy = new BubbleSort();
        }
        if (n >= 5 && n < 10) {
            sortingStrategy = new InsertionSort();
        }
        if (n >= 10) {
            sortingStrategy = new QuickSort();
        }
        return sortingStrategy;
    }
}
