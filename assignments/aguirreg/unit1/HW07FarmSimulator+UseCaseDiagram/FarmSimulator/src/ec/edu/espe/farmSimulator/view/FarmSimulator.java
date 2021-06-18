/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmSimulator.view;

import ec.edu.espe.farmSimulator.model.BornOn;
import ec.edu.espe.farmSimulator.model.Chicken;
import ec.edu.espe.farmSimulator.model.YearsCount;
import java.util.Scanner;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class FarmSimulator {
    public static void main(String[] args) {
            
        
        int id; 
        String name; 
        String color; 
        boolean molting;
        int eggCounter;
        int day;
        int month;
        int year;
       
                       
        Scanner enter = new Scanner (System.in);
         
        
        Chicken chicken [] = new Chicken[10];
        BornOn bornOn[] = new BornOn[10];
        YearsCount yearsCount[] = new YearsCount[10]; 
        
        System.out.print("Welcome to Farm Simulator" + " Author: Gabriel Aguirre ");
        
        for(int i=0;i<10;i++){
            
            System.out.print("\n Next Chicken... \n");
            
            
            System.out.print("Insert chicken id:");
            id = enter.nextInt();
            
            System.out.print("Insert chicken name:");
            name = enter.next();
            
            System.out.print("Insert chiken color:");
            color = enter.next();
                                  
            System.out.print("Insert Born On \n");
            
            System.out.print("Insert Day:"); 
            day = enter.nextInt();                  
                                    
            System.out.print("Insert Month:"); 
            month = enter.nextInt();
           
            System.out.print("Insert Year:"); 
            year = enter.nextInt();
            
            System.out.print("Inster molting:");
            molting = enter.nextBoolean();
            
            System.out.print("Insert eggCounter: ");
            eggCounter = enter.nextInt();
            
            
           
            enter.nextLine();
            
            chicken[i] = new Chicken(id,name,color,molting,eggCounter);  
            bornOn[i] = new BornOn(day, month, year);
            yearsCount[i] = new YearsCount(month, day, year); 
        }
        
        for(int i=0;i<10;i++){
       
           System.out.println("\n" + chicken[i]);
      
           System.out.println(bornOn[i]);
          
           System.out.println(yearsCount[i]);
        
        }
    }
}