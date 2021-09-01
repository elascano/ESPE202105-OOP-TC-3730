/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.view;

import ec.edu.espe.controller.SortingContext;
import ec.edu.espe.controller.SortingStrategy;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class SortingAlgorithms {

    public static void main(String[] args) {
        int data[] = {3, 5, 6, 7};
        SortingContext sortingContext = new SortingContext();
        SortingStrategy sortingStartegy = sortingContext.setSortStrategy(data.length);
        int sortedList[] = sortingContext.sort(data);
    }
}
