/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.view;

import ec.edu.espe.controller.SortingContext;
import java.util.Arrays;

/**
 *
 * @author Jean Jaramillo
 */
public class SortingAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        SortingContext sortingContext = new SortingContext();
        
        int[] data = {3,5,6,7};
        System.err.println("Arreglo a ordenar:  " +Arrays.toString(data));
        sortingContext.sort(data);
        System.err.println("Arreglo ordenado:  " +Arrays.toString(data));
        Thread.sleep(100);
        System.out.println("\n");
        
        int data2[] = {1,5,6,7,5,7};
        System.err.println("Arreglo a ordenar:  " +Arrays.toString(data2));
        sortingContext.sort(data2);
        System.err.println("Arreglo ordenado:  " +Arrays.toString(data2));
        Thread.sleep(100);
        System.out.println("\n");
        
        int data3[] = {3,5,6,7,5,7, 10,12,34,45,12,23};
        System.err.println("Arreglo a ordenar:  " +Arrays.toString(data3));
        sortingContext.sort(data3);
        System.err.println("Arreglo ordenado:  " +Arrays.toString(data3));
        Thread.sleep(100);
        System.out.println("\n");
        
        int data4[] = {3,5,6,7,5,7, 10,12,34,45,12,23,22,28,29,30,1,1,1,45,2,3,4,5,6,7,8,9,4,5,6,1,2,3};
        System.err.println("Arreglo a ordenar:  " +Arrays.toString(data4));
        sortingContext.sort(data4);
        System.err.println("Arreglo ordenado:  " +Arrays.toString(data4));
        Thread.sleep(100);
        
    }
    
}
