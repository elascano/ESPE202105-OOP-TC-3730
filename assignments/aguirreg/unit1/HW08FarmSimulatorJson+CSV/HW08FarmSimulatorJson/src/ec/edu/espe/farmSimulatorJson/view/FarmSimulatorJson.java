/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmSimulatorJson.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.farmSimulatorJson.model.BornOn;
import ec.edu.espe.farmSimulatorJson.model.Chicken;
import java.util.Scanner;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class FarmSimulatorJson {
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
            
            
            

        }
        
        for(int i=0;i<10;i++){
            
           System.out.println("Characteristics about chickens:");
           
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
           System.out.println("Json Serialization:");
                
           
           System.out.println("JsonChicken ->" + jsonChicken);
           System.out.println("JsonBornOn ->" + jsonBornOn);
           
           System.out.println("\n");
           System.out.println("Json Deserialization:");
           
            System.out.println("chicken ID ->" + chicken1.getId());
            System.out.println("chicken Name ->" + chicken1.getName());
            System.out.println("chicken Color ->" + chicken1.getColor());
            System.out.println("chicken Moltying ->" + chicken1.isNolting());
            System.out.println("chicken EggCounter ->" + chicken1.getEggCounter());
            System.out.println("chicken Day ->" + bornOn1.getDay());
            System.out.println("chicken Month object ->" + bornOn1.getMounth());
            System.out.println("chicken Year object ->" + bornOn1.getYear());
            
                
           
           
           
           
          
           
         
        
        }
    }
}