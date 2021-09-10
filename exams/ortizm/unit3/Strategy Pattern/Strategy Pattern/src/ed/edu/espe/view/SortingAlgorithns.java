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
        
        int data[]= {5,8,7,2};
        sortingContext.sort(data);
        
        int data2[]= {5,8,7,2,4,5,6};
        sortingContext.sort(data2);
        
        int data3[]= {5,8,7,2,4,5,6,1,2,3,1};
        sortingContext.sort(data3);
        
        
    }
    
}
