/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Bryan Maisincho Codes ESPE-DCCO
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Maisincho Bryan ,HW03 :3 Java Syntax ");
        float pesos, Dollars, ppeso, peuros, pbolivar, euros, bolivares;
        int option;
        System.out.println("\t\t\t!!!CALCULATIONS OF CHANGE FROM DOLLAR TO CURRENCY OF ANOTHER COUNTRY!!!\n\n");
        System.out.println(" \n [1]CHANGE FROM DOLLARS TO PESOS\n [2]CHANGE FROM DOLLARS TO EUROS\n [3]CAMBIOS DE DOLARES A BOLIVARES\n");
        System.out.println("\n CHOOSE AN OPTION\n");
        option = input.nextInt();
        switch (option) {

            case 1: {
                System.out.println("Enter the current price of the peso in dollars");
                ppeso = input.nextFloat();
                System.out.println("HOW MANY DOLLARS DO YOU NEED TO CHANGE TO PESOS\n");
                Dollars = input.nextFloat();
                pesos = Dollars / ppeso;
                System.out.println("WEIGHTS ARE \n" + pesos);
                break;
            }
            case 2: {
                System.out.println("Enter the current price of the euro in dollars");
                peuros = input.nextFloat();
                System.out.println("HOW MANY DOLLARS DO YOU NEED TO CHANGE TO EUROS\n");
                Dollars = input.nextFloat();
                euros = Dollars / peuros;
                System.out.println("EUROS ARE \n" + euros);
                break;
            }
            case 3: {
                System.out.println("Enter the current price of the bolivar in dollars");
                pbolivar = input.nextFloat();
                System.out.println("HOW MANY DOLLARS DO YOU NEED TO CHANGE TO BOLIVARS?\n");
                Dollars = input.nextFloat();
                bolivares = Dollars * pbolivar;
                System.out.println("THE DOLLARS ARE \n" + bolivares);
                break;
            }
        }
    }
}
    
