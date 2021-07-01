/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmChicken.view;

import com.csvreader.CsvWriter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.farmChicken.model.Age;
import static ec.edu.espe.farmChicken.model.Age.calculateDays;
import static ec.edu.espe.farmChicken.model.Age.calculateMonth;
import static ec.edu.espe.farmChicken.model.Age.calculateYear;
import ec.edu.espe.farmChicken.model.BornOnChicken;
import ec.edu.espe.farmChicken.model.Chicken;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class SystemFarm {
    public static void main(String[] args) throws IOException {
          int id = 0; 
        String name = null; 
        String color = null; 
        boolean molting = false;
        int eggCounter = 0;
        int day = 0;
        int month = 0;
        int annun = 0;
        int year = 0;
        String jsonChicken = "";
        String jsonBornOn = "";
        String jsonAge = "";
        
       Scanner sn= new Scanner(System.in);
         Scanner enter = new Scanner (System.in);
         Chicken chicken [] = new Chicken[10];
        BornOnChicken bornOn[] = new BornOnChicken[10];
        Age age[] = new Age[10];
        
       
       boolean salir= false;
       int option;
       while(!salir){
           System.out.println("Save options menu");
           System.out.println("\n Welcome to the farm "+" \n Author: Stefany Guerrero");
           System.out.println("\n 1.Save Chicken data to Json file ");
           System.out.println("\n 2.Save Chicken data to Csv file ");
           System.out.println("\n 3.Exit");
           
           System.out.println("Enter a number ");
           option= sn.nextInt();  
           
           switch(option){
               case 1:
            
            
             for(int i=0;i<2;i++){
            
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
            System.out.println("\n ");
                  
           
            enter.nextLine();
            
            chicken[i] = new Chicken(id,name,color,molting,eggCounter);  
            bornOn[i] = new BornOnChicken(day, month, annun);
           age[i] = new Age (calculateDays(day,month,annun), calculateMonth(day,month,annun), calculateYear(day,month,annun));
           
           
        }
        
            for(int i=0;i<2;i++){
       
            System.out.println(chicken[i]);
      
            System.out.println(bornOn[i]);
          
            System.out.println(age[i]);
            GsonBuilder gsonBuilder = new  GsonBuilder();
            Gson gson = gsonBuilder.create();
            jsonChicken = gson.toJson(chicken[i]);
            jsonBornOn = gson.toJson(bornOn[i]);
            jsonAge= gson.toJson(age[i]);
            
          
            Chicken chicken1; 
            chicken1 = gson.fromJson(jsonChicken, Chicken.class);
            BornOnChicken bornOn1;
            bornOn1 = gson.fromJson(jsonBornOn, BornOnChicken.class);
            
           
           
            System.out.println("jsonChicken ->" + jsonChicken);
            System.out.println("jsonBornOn ->" + jsonBornOn);
         
            System.out.println("chiken object ID ->" + chicken1.getId());
            System.out.println("chiken object Name ->" + chicken1.getName());
            System.out.println("chiken object Color ->" + chicken1.getColor());
            System.out.println("chiken object Moltying ->" + chicken1.isMoltying());
            System.out.println("chiken object EggCouter ->" + chicken1.getEggCouter());
            System.out.println("born On Day object ->"+ bornOn1.getDay());
            System.out.println("born On  Month object ->"+ bornOn1.getMonth());
            System.out.println("born On object Year ->"+ bornOn1.getAnnun());
            System.out.println("Years ->"+ jsonAge);
            System.out.println("\n ");
            
     
           

                
        }
                   break;
                

                   
               case 2:
                   File archivo;
                   FileWriter escribir;
                   PrintWriter linea;
                  archivo= new File("System.csv");
                   
                   
                   
                   
                   
                  System.out.println(" This is option 2 ");
                  for(int i=0;i<2;i++){
                          
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
            System.out.println("\n ");
                  
           
            enter.nextLine();
            
            chicken[i] = new Chicken(id,name,color,molting,eggCounter);  
            bornOn[i] = new BornOnChicken(day, month, annun);
            age[i] = new Age (calculateDays(day,month,annun), calculateMonth(day,month,annun), calculateYear(day,month,annun));
 
          }
                        
                        for (int i=0;i<2;i++) {
                            
                            escribir= new FileWriter(archivo,true);
                            linea= new PrintWriter(escribir);
                            
                            linea.println(chicken[i]);
                            linea.println(age[i]);
                            linea.println(bornOn[i]);
                            
                            linea.close();
                            escribir.close();
                            
                            
                            
                        }
                          
                         break;
                    
                
               case 3:
                   salir=true;
                   break;
               default:
               System.out.println("The option are 1 to 3");
               
                       
              
           }
           
       }
      
       
    }
    
}
