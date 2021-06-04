/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package program;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int option;
        double diagonal1, diagonal2;
        double area, perimeter;
        double sides;
        Scanner read = new Scanner(System.in);
        
        System.out.println("\tRHOMBUS");
        System.out.println("1. Perimeter");
        System.out.println("2. Area");
        System.out.println("Choose the option to execute: ");
        option=read.nextInt();
        
        switch(option){
            
            case 1: 
                System.out.println("Enter the side distance (cm): ");
                sides=read.nextInt();
                perimeter=(sides*4);
                System.out.println("The Perimeter is: "+ perimeter);
        break;
        
            case 2:
                System.out.println("Enter Diagonal 1: ");
                diagonal1=read.nextInt();
                System.out.println("Enter Diagonal 2: ");
                diagonal2=read.nextInt();
                area=(diagonal1+diagonal2)/2;
                System.out.println("The area is: "+ area);  
        break;
         
            default: System.out.println("The option does not exist");
        }
    }
    
}
