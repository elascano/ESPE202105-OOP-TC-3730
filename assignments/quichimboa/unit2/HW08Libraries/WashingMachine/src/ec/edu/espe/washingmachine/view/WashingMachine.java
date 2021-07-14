/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.washingmachine.view;
import java.util.Scanner;

/**
 *
 * @author Andrea Quichimbo Program Builder ESPE-DCCO
 */
public class WashingMachine {
    public static void main(String[] args) {
    
        
     System.out.println("\t Washing Machine LIBRARY \n"
                 + " Camilo Ponce\n "
                 + " Andrea Quichimbo\n "
                 + " Karen Quilumbaquin\n ");
       
     
       Scanner read = new Scanner(System.in);
        String color = null;
        String brand = null;
        String size = null;
        int capacity = 0;
        int cycles = 0;
        
        System.out.println("Enter the color:");
        color = read.next();
        System.out.println("Enter the brand");
        brand = read.next();
        System.out.println("Enter the size");
        size = read.next();     
        System.out.println("Enter the capacity");
        capacity = read.nextInt(); 
        System.out.println("Enter the cycles");
        cycles = read.nextInt();
        
    }

    
}
