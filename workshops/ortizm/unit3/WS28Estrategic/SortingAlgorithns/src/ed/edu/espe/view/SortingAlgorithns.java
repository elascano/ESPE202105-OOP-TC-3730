/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.edu.espe.view;

import ed.edu.espe.controller.SortingContext;
import ed.edu.espe.controller.SortingStrategy;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class SortingAlgorithns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        SortingContext sortingContext= new SortingContext();
        
        int data[]= {3,5,6,7};
        sortingContext.sort(data);
        
        int data2[]= {3,5,6,7,8,9};
        sortingContext.sort(data2);
        
        int data3[]= {3,5,6,7,8,9,3,2,1,2,3,1};
        sortingContext.sort(data3);
        
        
    }
    
}
