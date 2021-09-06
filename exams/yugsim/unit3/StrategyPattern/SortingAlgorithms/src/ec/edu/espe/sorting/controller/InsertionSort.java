/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.sorting.controller;

/**
 *
 * @author Pamela Yugsi LAMESTech ESPE-DCCO
 */
public class InsertionSort implements SortingStrategy{
    
    @Override
    public int[] sort(int[] data) {
        //TODO program the bubble sort algorithm
        // sort the data and return it
        System.out.println("ordering" + data + ", using Insertion sort");
        int[] sortedData = data; // this is only her to compile
        return sortedData;
    }
    
}
