/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.farm.model.BornOn;
import ec.edu.espe.farm.model.Chicken;
import java.util.Scanner;

/**
 *
 * @author Cristopher Sarmiento Futures Programmers ESPE-DCC0
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
        int year;
        String jsonChicken = "";
        String jsonBornOn = "";
        
                       
        Scanner enter = new Scanner (System.in);
         
        
        Chicken chicken [] = new Chicken[10];
        BornOn bornOn[] = new BornOn[10];
       
        
        System.out.print("Hello, Play the FarmSimulator" + "Programmer: Cristopher Sarmiento ");
        
        for(int i=0;i<2;i++){
            
            System.out.print("\n Description: \n");
            System.out.println("\n This program describe 10 chicken, now play and write ");
            
            
            System.out.print("Write chicken id:");
            id = enter.nextInt();
            
            System.out.print("Put chicken name:");
            name = enter.next();
            
            System.out.print("Write chiken color:");
            color = enter.next();
                                  
            System.out.print("Introduce Born Date Plis \n");
            
            System.out.print("Insert Day:"); 
            day = enter.nextInt();                  
                                    
            System.out.print("Write Month:"); 
            month = enter.nextInt();
           
            System.out.print("Put Year:"); 
            year = enter.nextInt();
            
            System.out.print("Put molting:");
            molting = enter.nextBoolean();
            
            System.out.print("Write eggCounter: ");
            eggCounter = enter.nextInt();
            
            
           
            enter.nextLine();
            
            chicken[i] = new Chicken(id,name,color,molting,eggCounter);  
            bornOn[i] = new BornOn(day, month, year);
            
            
            

        }
        
        for(int i=0;i<2;i++){
            
           System.out.println("Characteristics about all chickens:");
           
           System.out.println("\n");
       
           System.out.println("\n" + chicken[i]);
      
           System.out.println(bornOn[i]);
          
          GsonBuilder gsonBuilder = new  GsonBuilder();
          Gson gson = gsonBuilder.create();
          jsonChicken = gson.toJson(chicken[i]);
          jsonBornOn = gson.toJson(bornOn[i]);
          
           Chicken chicken1;
           chicken1 = gson.fromJson(jsonChicken, Chicken.class);
           BornOn bornOn1;
           bornOn1 = gson.fromJson(jsonChicken, BornOn.class);
           
           
           System.out.println("\n");
           System.out.println("Information about Json Serialization:");
                
           
           System.out.println("JsonChicken ->" + jsonChicken);
           System.out.println("JsonBornOn ->" + jsonBornOn);
           
           System.out.println("\n");
           System.out.println("Information about Json Deserialization:");
           System.out.println("ID ->" + chicken1.getId());
            System.out.println("Name ->" + chicken1.getName());
            System.out.println("Color ->" + chicken1.getColor());
            System.out.println("Moltying ->" + chicken1.isMolting());
            System.out.println("EggCounter ->" + chicken1.getEggCounter());
            System.out.println("Day ->" + bornOn1.getDay());
            System.out.println("Month object ->" + bornOn1.getMonth());
            System.out.println("Year object ->" + bornOn1.getYear());
            
                
           
           
           
           
          
           
         
        
        }
    }
}
           
      
           
  