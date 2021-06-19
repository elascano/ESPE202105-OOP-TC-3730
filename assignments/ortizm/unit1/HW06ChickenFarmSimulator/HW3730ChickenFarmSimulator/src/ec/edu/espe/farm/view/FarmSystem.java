/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.Scanner;
//import java.util.Scanner;

/**
 *
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class FarmSystem {

    public static void main(String[] args) {

        Scanner imprim = new Scanner(System.in);
        Chicken chicken;
        Scanner data = new Scanner(System.in);
        int day;
        int month;
        int year;
        int id;
        String name;
        String color;
        boolean molthing;
        int eggCounter;
        
        
      
        Chicken chickens[] = new Chicken[10];
        for (int i = 0; i < 2; i++) {
            System.out.println("Deme dato de gallina");
            System.out.println("Introdusca id");
            id = imprim.nextInt();
            System.out.println("Introdusca name");
            name = imprim.next();
            System.out.println("Introdusca color");
            color = imprim.next();
            System.out.println("Day of born");
            System.out.println("Enter day");
            day = data.nextInt();
            System.out.println("Enter month");
            month = data.nextInt();
            System.out.println("Enter year");
            year = data.nextInt();
            
            LocalDate bornon = LocalDate.of(year, month, day); //specify year, month, date directly
            LocalDate dayactuallity = LocalDate.now(); //gets localDate
            Period diff = Period.between(bornon, dayactuallity); //difference between the dates is calculated
            
            System.out.println("Enter the molting: ");
            boolean molting = data.nextBoolean();
            System.out.println("Enter the Egg Counter: ");
            eggCounter = data.nextInt();
            System.out.println(diff.getYears() + " years "+" months " + diff.getMonths()+diff.getDays() + "days");
        
            chickens[i]= new Chicken(id, name, color, dayactuallity, bornon, molting,eggCounter);
        }
            System.out.println("Data of all chickens entered: ");
            for(int i = 0; i <2; i++){
            System.out.println(chickens[i].getId()+" "+chickens[i].getName()+" "+chickens[i].getColor()+" "+chickens[i].getDayactuallity()+" "+chickens[i].getBornon()+" "+chickens[i].isMolting()+" "+chickens[i].getEggCounter());
 
    }
  }
}
