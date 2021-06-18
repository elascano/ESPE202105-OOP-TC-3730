/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Solange Tupiza search for electrical and electronic materials
 * OOP-ESPE
 */
public class FarmSystem {
    public static void main(String[] args) {
        Chicken chicken;
        
        int id; 
        String name;
        String color;
        Date age;
        Date bornOn;
        boolean molting;
        int eggCounter;
        
        
        id = 0;
        name = "Lucy";
        color = "White";
        age = new Date();
        bornOn = new Date();
        molting = true;
        eggCounter = 0;
        
        
        chicken = new Chicken(id, name, color, age, bornOn, molting);
        
        System.out.println("chicken ->"+ chicken);
        
       
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fechaNac = LocalDate.parse("24/06/2021", fmt);
        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(fechaNac, ahora);
        System.out.printf("chicken age: %s years, %s months y %s days",
                    periodo.getYears(), periodo.getMonths(), periodo.getDays());
        
         Scanner entry = new Scanner(System.in);
        char[] chickens;
        chickens = new char [3];
        
        for(int i=0;i<10;i++){
              System.out.println("Name Chicken");
              chickens[i] = entry.next().charAt(0);
          }
          
          System.out.println("The name chickens are:");
            for(int i=0;i<10;i++){
                System.out.println(chickens[i]);
            }
       
        
    }
}
