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
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
 */
public class SortApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SortingContext sortingContext = new SortingContext();

        int data[] = {5, 8, 7, 2};
        int sortedList[] = sortingContext.sort(data);

        int data2[] = {2,5,7,8};
        sortingContext.sort(data2);

        
    }

}
