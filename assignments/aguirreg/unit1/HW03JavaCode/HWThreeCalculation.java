/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Scanner;

/**
 *
 * @author Gabriel Aguirre
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner read = new Scanner (System.in);
        
        System.out.println("Name: Gabriel Sebastian Aguirre Almache");
        System.out.println("NRC: 3730");
        System.out.println("\n Please enter the data\n ");
        
        System.out.println("Enter Force: "); 
        float force = read.nextInt();
        System.out.println("Enter Distance: "); 
        float distance = read.nextInt();
        System.out.println("Enter Time: "); 
        float time = read.nextInt();
        
    
        float work = force * distance;
        float power = work / time;
        float impulse = force * time;
        
        System.out.println("The calculated Work is: " + work + " J");
        System.out.println("The calculated Power is: " + power + " Watts");
        System.out.println("The calculated Impulse is: " + impulse + " N/s");
        
       
        
                
        
    }
    
}
