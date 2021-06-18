/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 *
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
 */
public class FarmeSysten {
    public static void main(String[] args) {
        Scanner inpout = new Scanner(System.in);
        Chicken chicken;
        Scanner data = new Scanner(System.in);
        int id;
        String name;
        String color;
        int eggCounter;
        boolean molting;
                
        Chicken chickens[] = new Chicken[10];
        for(int i = 0; i <2; i++){
            System.out.println("Enter the chicken data: ");
            System.out.println("Enter the id: ");
            id = data.nextInt();
            System.out.println("Enter the name: ");
            name = data.next();
            System.out.println("Enter the color: ");
            color = data.next();
            System.out.println("Date of born");
            System.out.println("Enter the day of the month: ");
            int day = data.nextInt();
            System.out.println("Enter a month: ");
            int month = data.nextInt();
            System.out.println("Enter a year: ");
            int year = data.nextInt();

        
        
            LocalDate bornOn = LocalDate.of(year, month, day); //specify year, month, date directly
            LocalDate date = LocalDate.now(); //gets localDate
            Period age = Period.between(bornOn, date); //difference between the dates is calculat
            
            
            
            
            
            System.out.println("Enter the molting: ");
            molting = data.nextBoolean();
            System.out.println("Enter the eggCounter: ");
            eggCounter = data.nextInt();
            chickens[i]= new Chicken(id, name, color, date, bornOn,age,molting,eggCounter);
            }
         System.out.println("Data of all chickens entered: ");
        for(int i = 0; i <2; i++){
          System.out.println(chickens[i].getId()+" "+chickens[i].getName()+" "+chickens[i].getColor()+" "+chickens[i].getDate()+" "+chickens[i].getBorn0n()+" "+chickens[i].getAge()+" "+chickens[i].isMolting()+" "+chickens[i].getEggCounter());
       }
 }
}

