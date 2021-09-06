/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.view;

import ec.espe.edu.controller.BubbleSort;
import ec.espe.edu.controller.InsertionSort;
import ec.espe.edu.controller.SortingContext;

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
        int data[] = {3,2,7,3};
        BubbleSort o = new BubbleSort();
        o.sort(data);
        
        for(int i=0;i<data.length;i++)
        {
            System.out.println(data[i]);
        }
        
       
        
    
        int data2[] = {3,5,6,7,5,7};
        sortingContext.sort(data2);
       
        InsertionSort u = new InsertionSort();
        o.sort(data);
        o.sort(data2);
        
        for(int i=0;i<data2.length;i++)
        {
            System.out.println(data2[i]);
        }
        
        
        
        int data3[] = {3,5,6,7,5,7,10,12,34,45,12,23};
        sortingContext.sort(data3);
    }
    
}
