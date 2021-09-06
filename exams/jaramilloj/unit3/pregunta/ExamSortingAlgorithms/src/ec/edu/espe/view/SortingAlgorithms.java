/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.view;

import ec.edu.espe.controller.SortingContext;

/**
 *
 * @autor Jaramillo Jean CODE ESPE-DCC0
 */
public class SortingAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SortingContext sortingContext = new SortingContext();

        int data[] = { 28, 7};
        int sortedList[] = sortingContext.sort(data);
        System.out.println("\n");

        int data2[] = {45, 6, 7, 5, 7};
        sortingContext.sort(data2);
        System.out.println("\n");

        int data3[] = {3, 5, 6, 7, 5, 7, 10, 12, 34, 45, 12, 23};
        sortingContext.sort(data3);
        System.out.println("\n");

        
    }

}
