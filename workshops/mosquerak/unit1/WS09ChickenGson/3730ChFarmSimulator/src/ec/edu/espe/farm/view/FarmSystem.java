/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.farm.model.Chicken;
import java.io.FileWriter;
import java.util.Date;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


/**
 *
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class FarmSystem {
    public static void main(String[] args) {
        Chicken chicken = null;
        //reading from keyboard
        int id;
        String name;
        String color;
        int age;
        String dateBornOn;
        int moltingOption;
        boolean molting;
        int eggCounter;
        int menu;
        Date bornOn;
        String jsonChicken ="";
        Scanner read = new Scanner(System.in);
        
        
         System.out.println("HW07-Chicken-Json-Csv  \n "+ "Mosquera Kerly");
         System.out.println("WELCOME");
         System.out.println("Enter the name or the chicken");
         name=read.next();
         System.out.println("Enter the chicek ID");
         id=read.nextInt();
         System.out.println("Enter the color of the chicken");
         color=read.next();
         System.out.println("Enter the age of the chicken");
         age=read.nextInt();
         System.out.println("Enter born0n of the chicken");
         String dateBorn = read.next();
         
         System.out.println("Enter chicken moult");
         System.out.println("1)Yes");
         System.out.println("2)No");
         moltingOption= read.nextInt();
         
         if( moltingOption == 1 ){
            molting = true;
            
         }
         else {
             molting = false;
         }
         
        System.out.println("Enter chicken egg counter");
        eggCounter= read.nextInt();
        
        chicken = new chicken (id,name,color,age,bornOn,molting);
        
        System.out.println("Choose where you want to save");
        System.out.println(" Save to Jason");
        System.out.println(" Save to Cvs");
        menu=read.nextInt();
        
        switch(menu){
            case 1:
                {
                GsonBuilder gsonBuilder = new GsonBuilder() ;
                Gson gson = gsonBuilder.create();
               
                jsonChicken = gson.toJson(chicken);
                 Chicken chicken1;
                System.out.println("jsonChicken->"+ jsonChicken);
                }
                break;
            case 2:
                {
                CsvWriter csvwriter = new CsvWriter("chicken.csv");
                csvWrite.writeRecord (chicken.toString());
                 } 
                csvWrite.close();
                break;
        
      }  
        
     }  
 }  
        
        
        
        
     
       
       
    
       