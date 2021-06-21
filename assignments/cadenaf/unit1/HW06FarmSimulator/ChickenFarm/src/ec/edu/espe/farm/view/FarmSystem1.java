/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.BornOn;
import ec.edu.espe.farm.model.Chicken;
import ec.edu.espe.farm.model.YearsCount;
import java.util.Scanner;

/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class FarmSystem1 {

    private static YearsCount[] YearCount;
    private static int id;
    private static String name;
    private static String color;
    private static int day;
    private static int month;
    private static int year;
    private static boolean molting;
    private static int eggCounter;
    private static boolean[] yearsCount;
    
        public static void main(String[] args) {  
            Scanner enter = new Scanner (System.in);
            
            Chicken chicken [] = new Chicken[10];
            BornOn bornOn[] = new BornOn[10];
            YearsCount yearsCout[] = new YearsCount[10];
      
            System.out.println("Welcome to Farm Simulator" + " Author: Cadena Fernanda ");
            
            for(int i=0;i<10;i++){
                
                System.out.print("\n Next Chicken... \n");
                
                System.out.print("Insert chicken id: ");
                id = enter.nextInt();
                
                System.out.print("Insert chicken name: ");
                name = enter.next();
                
                System.out.print("Insert chicken color: ");
                color = enter.next();
                
                System.out.print("Insert Born On \n");
                
                System.out.print("Insert Day: ");
                day = enter.nextInt();
                
                System.out.print("Insert Month: ");
                month = enter.nextInt();
                
                System.out.print("Insert Year: ");
                year = enter.nextInt();
                
                System.out.print("Insert molting: ");
                molting = enter.nextBoolean();
                
                System.out.print("Insert eggCounter: ");
               eggCounter = enter.nextInt();
                
                
                enter.nextLine();
                
                chicken[i] = new Chicken(id,name,color,molting,eggCounter);
                bornOn[i] = new BornOn(day, month, year);
                YearCount[i] = new YearsCount(month, day, year);
                
            }
            for(int i=0;i<10;i++){
                
                System.out.println("\n" + chicken[i]);
                
                System.out.println(bornOn[i]);
                                
                System.out.println(yearsCount[i]);
         
     }              

    }
    
}