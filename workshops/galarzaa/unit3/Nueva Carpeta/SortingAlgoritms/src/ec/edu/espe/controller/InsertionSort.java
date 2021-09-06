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
public class InsertionSort implements SortingStrategy {

    @Override
    public int[] sort(int[] data) {

        System.out.println("ordering" + data + "using Insertion sort");
        int[] sortedData = data;
        return sortedData;
    }
}
