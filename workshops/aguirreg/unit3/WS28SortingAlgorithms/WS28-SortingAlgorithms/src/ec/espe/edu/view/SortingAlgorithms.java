/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.view;

import ec.espe.edu.controller.SortingContext;
import ec.espe.edu.controller.SortingStrategy;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class SortingAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SortingContext sortingContext = new SortingContext();
        
        int data[] = {3,5,6,7};
        int sortedList[] = sortingContext.sort(data);
    
        int data2[] = {3,5,6,7,5,7};
        sortingContext.sort(data2);
        
        int data3[] = {3,5,6,7,5,7,10,12,34,45,12,23};
        sortingContext.sort(data3);
    }
    
}
