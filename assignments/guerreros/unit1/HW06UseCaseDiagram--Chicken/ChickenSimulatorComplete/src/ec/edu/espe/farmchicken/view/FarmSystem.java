/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmchicken.view;

import ec.edu.espe.farmchicken.model.Age;
import ec.edu.espe.farmchicken.model.BornOnChicken;
import ec.edu.espe.farmchicken.model.Chicken;
import java.util.Scanner;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class FarmSystem {
    
    
    public static void main(String[] args) {
            
        int id; 
        String name; 
        String color; 
        boolean molting;
        int eggCounter;
        int day;
        int month;
        int annun;
                       
        Scanner enter = new Scanner (System.in);
        
        Chicken chicken [] = new Chicken[10];
        BornOnChicken bornOn[] = new BornOnChicken[10];
        Age age[] = new Age[10];
        for(int i=0;i<10;i++){
            
            System.out.print("Insert chicken id:");
            id = enter.nextInt();
            
            System.out.print("Insert chicken name:");
            name = enter.next();
            
            System.out.print("Insert chiken color:");
            color = enter.next();
                                  
            System.out.print("Insert Born On:\n");
            
            System.out.print("Insert Day:"); 
            day = enter.nextInt();                  
                                    
            System.out.print("Insert Month:"); 
            month = enter.nextInt();
           
            System.out.print("Insert Year:"); 
            annun = enter.nextInt();
            
            System.out.print("Inster molting:");
            molting = enter.nextBoolean();
            
            System.out.print("Insert eggCounter:");
            eggCounter = enter.nextInt();
            
                  
           
            enter.nextLine();
            
            chicken[i] = new Chicken(id,name,color,molting,eggCounter);  
            bornOn[i] = new BornOnChicken(day, month, annun);
            age[i]  = new Age(day, month, annun);
        }
        
        for(int i=0;i<10;i++){
       
           System.out.println(chicken[i]);
      
           System.out.println(bornOn[i]);
          
           System.out.println(age[i]);
        
        }
    }
    
}
