/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmSimulator.view;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.farmComplete.model.*;
import static ec.edu.espe.farmComplete.model.Age.calculateDays;
import static ec.edu.espe.farmComplete.model.Age.calculateMonth;
import static ec.edu.espe.farmComplete.model.Age.calculateYear;

import java.io.*;
import java.util.Scanner;
import java.util.InputMismatchException;


/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class FarmSystemJsonCSV {
    public static void main(String[] args) throws IOException {
        int id = 0 ; 
        String name = null  ; 
        String color = null ; 
        boolean molting = false ;
        int eggCounter = 0 ;
        int day = 0;
        int month = 0;
        int year = 0;
        String jsonChicken = "";
        String jsonBornOn = "";      
        String jsonAge = "";
        Scanner enter = new Scanner (System.in);
        Chicken chicken [] = new Chicken[10];
        BornOnChicken bornOn[] = new BornOnChicken[10];
        Age age[] = new Age[10];
        Scanner sn = new Scanner(System.in);
        
        boolean out = false;
        int option;
         
        
        while(!out){
            
            System.out.println("Wellcome To FARM SIMULATOR\n");
            
            
         
            System.out.println("1. Farm Information Json");
            System.out.println("2. Farm Information CSV");
            System.out.println("3. Exit");
            
            try{
            
            
            System.out.println("Enter Opcion to Use");
            option = sn.nextInt();
            
            switch (option){
               
                
        case 1:
                     
        
            
        System.out.println("Welcome to my Farm\n" + "Author: LUIS ALBERTO HEREDIA IZA\n" );
        
           
        for(int i=0;i<2;i++){
            
            System.out.println("\n Chicken...");  
            
            System.out.print("Please Enter Chicken id:");
            id = enter.nextInt();
            
            System.out.print("Please Enter Chicken name:");
            name = enter.next();
            
            System.out.print("Please Enter Chicken color:");
            color = enter.next();
                                            
            System.out.print("CHICKEN IS MOLTING?");
            molting = enter.nextBoolean();
            
            System.out.print("Please Enter Chicken egg Counter:");
            eggCounter = enter.nextInt(); 
            
             System.out.print("Insert Born On:\n");
            
            System.out.print("What day was the chicken born?"); 
            day = enter.nextInt();                  
                                    
            System.out.print("What month was the chicken born?"); 
            month = enter.nextInt();
           
            System.out.print("What year was the chicken born?"); 
            year = enter.nextInt();
           
            enter.nextLine();
            
            chicken[i] = new Chicken(id,name,color,molting,eggCounter);  
            bornOn[i] = new BornOnChicken(day, month, year);
            age[i] = new Age (calculateDays(day,month,year), calculateMonth(day,month,year), calculateYear(day,month,year));    
            
           
        }
        
               
        for(int i=0;i<2;i++){
                    
               
           GsonBuilder gsonBuilder = new  GsonBuilder();
           Gson gson = gsonBuilder.create();
           jsonChicken = gson.toJson(chicken[i]);
           jsonBornOn = gson.toJson(bornOn[i]);
           jsonAge = gson.toJson(age[i]);
          
           Chicken chicken1; 
           chicken1 = gson.fromJson(jsonChicken, Chicken.class);
           BornOnChicken bornOn1;
           bornOn1 = gson.fromJson(jsonBornOn, BornOnChicken.class);
           Age age1;
           age1 = gson.fromJson(jsonAge, Age.class);
             
                                         
           System.out.print(" \n");
           System.out.println("JSON DESERIALIZATION ");

           System.out.println("The chiken  ID ->" + chicken1.getId());
           System.out.println("The chiken  Name ->" + chicken1.getName());
           System.out.println("The chiken  Color ->" + chicken1.getColor());
           System.out.println("The chiken  Moltying ->" + chicken1.isMoltying());
           System.out.println("The chiken  EggCouter ->" + chicken1.getEggCouter());
           System.out.println("The born On Day  ->"+ bornOn1.getDay());
           System.out.println("The born On  Month object ->"+ bornOn1.getMonth());
           System.out.println("The born On object Year ->"+ bornOn1.getYear());
           System.out.println("The age Chicken->"+ jsonAge);
            
          
            
           
        }   
                    break;
                    
                case 2:
                    
        File file;
        FileWriter write;
        PrintWriter line;
        file = new File ("FARM SIMULATOR LUIS HEREDIA .csv");           
                    
                          
        System.out.println("Welcome to my Farm\n" + "Author: LUIS ALBERTO HEREDIA IZA\n" );
        
           
        for(int i=0;i<2;i++){
            
            System.out.println("\n Chicken...");  
            
            System.out.print("Please Enter Chicken id:");
            id = enter.nextInt();
            
            System.out.print("Please Enter Chicken name:");
            name = enter.next();
            
            System.out.print("Please Enter Chicken color:");
            color = enter.next();
                                  
            System.out.print("CHICKEN IS MOLTING?");
            molting = enter.nextBoolean();
            
            System.out.print("Please Enter Chicken egg Counter:");
            eggCounter = enter.nextInt();                 
           
            System.out.print("Insert Born On:\n");
            
            System.out.print("What day was the chicken born?"); 
            day = enter.nextInt();                  
                                    
            System.out.print("What month was the chicken born?"); 
            month = enter.nextInt();
           
            System.out.print("What year was the chicken born?"); 
            year = enter.nextInt();
            
            
            enter.nextLine();
            
            chicken[i] = new Chicken(id,name,color,molting,eggCounter);  
            bornOn[i] = new BornOnChicken(day, month, year);
            age[i] = new Age (calculateDays(day,month,year), calculateMonth(day,month,year), calculateYear(day,month,year));
        }
             for(int i=0;i<2;i++){
            
            write = new FileWriter(file,true);
            line = new PrintWriter(write);
            
            line.println(chicken[i]);
            line.println(bornOn[i]);
            line.println(age[i]);
            System.out.println("\n");
            line.close();
            write.close();
            
                             
                                    
                        }
   

                             break;
             
                case 3:
                 out = true;    
                    break;
                default:
                    System.out.println("Select Valid Opion ");
            
            
         
            
            }
            }
            catch (InputMismatchException e){
                System.out.println("Enter Number");
                sn.next();
            }
             
            }
                    
        
              
            }
        
    
        }
 
             
        
      
          
            
    
    
        

 