/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.view;

import ec.edu.espe.controller.SortingContext;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class SortingAlgorithms {

    public static void main(String[] args) {

        SortingContext sortingContext = new SortingContext();

        int data[] = {1, 5,8,9};
        //int sortedList[] = sortingContext.sort(data);

        sortingContext.sort(data);

        //for (int i = 0; i < data.length; i++) {
        //sortingContext.sort(data);
        //}
        System.out.println("");
        int data2[] = {1, 9, 6, 2, 5, 7};
        sortingContext.sort(data2);
        int data3[] = {3, 99, 6, 100, 5, 7, 10000, 12, 34, 45, 12, 23};
        sortingContext.sort(data3);
        
    }
}
