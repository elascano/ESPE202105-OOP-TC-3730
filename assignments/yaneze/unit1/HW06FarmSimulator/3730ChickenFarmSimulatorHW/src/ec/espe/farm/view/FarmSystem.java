/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.farm.view;

import ec.espe.farm.model.Chicken;
import java.time.LocalDate;

import java.time.Period;


import java.util.Scanner; 
/**
 *
 * @author Erick Yánez LAMESTech ESPE-DCC0
 */
public class FarmSystem {

    public static void main(String[] args) {

        Scanner data = new Scanner(System.in);


        Chicken chicken [] = new Chicken[10];
        
        for(int counter = 0; counter < 10; counter++){
            System.out.println("Enter the id of the Chicken[" + (counter+1) + "]");
            int id = data.nextInt();
            System.out.println("Enter the name:");
            String name = data.next();
            System.out.println("Enter the color:");
            String color = data.next();
            System.out.println("Date of born");
            System.out.println("Enter the day of the month:");
            int day = data.nextInt();
            System.out.println("Enter a month:");
            int month = data.nextInt();
            System.out.println("Enter a year:");
            int year = data.nextInt();
            
            LocalDate bornOn = LocalDate.of(year, month, day); //specify year, month, date directly
            LocalDate age = LocalDate.now(); //gets localDate
            Period diff = Period.between(bornOn, age); //difference between the dates is calculated
            
            System.out.println(chicken[counter]);
            System.out.println(diff.getYears() + " years " + diff.getMonths() + " months " + diff.getDays() + " days");

            System.out.println("Enter the molting: ");
            boolean molting = data.nextBoolean();
            System.out.println("Enter the Egg Counter: ");
            int eggCounter = data.nextInt();
            chicken[counter] = new Chicken(id, name, color, age, bornOn, molting, eggCounter);
            
            
        }
        
        for(int counter = 0; counter < 10; counter++){
            System.out.println(chicken[counter]);

        }
        
        
       
        

    }
}
