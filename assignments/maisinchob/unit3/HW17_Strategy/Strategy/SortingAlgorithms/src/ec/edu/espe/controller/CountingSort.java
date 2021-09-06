/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

import java.util.Arrays;

/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class CountingSort implements SortingStrategy {

    // copyright de Soma Sharma 2021
    public static void main(String[] args) {

        System.out.println("Counting sort in Java");
        int[] input = {60, 40, 30, 20, 10, 40, 30, 60, 60, 20, 40, 30, 40};
        int k = 60;

        System.out.println("integer array before sorting");
        System.out.println(Arrays.toString(input));

        // sorting array using Counting Sort Algorithm
        countingSort(input, k);

        System.out.println("integer array after sorting using counting sort algorithm");
        System.out.println(Arrays.toString(input));

    }

    public static void countingSort(int[] input, int k) {
        // create buckets
        int counter[] = new int[k + 1];

        // fill buckets
        for (int i : input) {
            counter[i]++;
        }

        // sort array
        int ndx = 0;
        for (int i = 0; i < counter.length; i++) {
            while (0 < counter[i]) {
                input[ndx++] = i;
                counter[i]--;
            }
        }
    }

    @Override
    public int[] sort(int[] data) {
        //TODO program the Counting sort algorithm
        //sort the DATA and return It
        System.out.println("ordering" + data + ", using Counting sort");
        int[] sortedData = data; //this is only here to compile
        return sortedData;
    }

}
