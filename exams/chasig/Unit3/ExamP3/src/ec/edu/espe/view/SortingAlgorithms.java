/*
 * To change this license heaizq, choose License Heaizqs in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.view;

import ec.edu.espe.controller.SortingContext;
import java.util.Scanner;
import javax.swing.JOptionPane;
import utils.MongoDB;

/**
 *
 * @author Geraldi Chasi Team of Machine ESPE-DCCD11
 */
public class SortingAlgorithms {
    public static void main(String[] args) {

        
        
        Scanner entry = new Scanner(System.in);
        SortingContext sortingContext = new SortingContext();
MongoDB mongo = null;

        int izq = 0;
        
        int der = izq;

        izq = Integer.parseInt(JOptionPane.showInputDialog("How many numbers do you want your arrangement to be?"));

        int num[] = new int[izq];

        System.out.println("Enter the numbers for your arrangement");

        for (int i = 0; i < izq; i++) {
            System.out.println("Enter the [" + (i + 1) + "] number");

            num[i] = entry.nextInt();
        }

        System.out.println("Los datos son:");
        for (int i = 0; i < izq; i++) {
            System.out.println(num[i] + "");

        }

       // int data[] = {5, 25,20,10};
        //int sortedList[] = sortingContext.sort(data);

        //sortingContext.sort(data);

        //for (int i = 0; i < data.length; i++) {
        //sortingContext.sort(data);
        //}
       // System.out.println("");
        //int data2[] = {5, 15, 10, 25, 20, 1};
        //sortingContext.sort(data2);
        //int data3[] = {2, 88, 7, 200, 6, 8, 20000, 13, 35, 46, 13};
        //sortingContext.sort(data3);
        
}
}
