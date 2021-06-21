/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.farm.model.Age;
import static ec.edu.espe.farm.model.Age.calculaAnos;
import static ec.edu.espe.farm.model.Age.calculaDias;
import static ec.edu.espe.farm.model.Age.calculaMeses;
import ec.edu.espe.farm.model.Chicken;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class FarmSystem {
    public static void main(String[] args) {
        //TODO reading from keyboard
        Scanner entrada = new Scanner(System.in);
        Chicken chicken;
        Age age;
        int id; 
        String name; 
        String color; 
        boolean molthing;
        int eggCounter;
        int dia;
        int mes;
        int ano;
        String jsonChicken;
        String jsonAge;
        
            //TODO reading from keyboard

    Chicken chickens[] = new Chicken[1];
    Age ages[] = new Age[1];
        
    for(int i=0;i<1;i++){
        System.out.println("\nEnter the chicken data[" + (i+1) + "]:");
        
        System.out.print("Enter the id: ");
        id = entrada.nextInt();
        
        System.out.print("Enter the name: ");
        name = entrada.next();
        
        System.out.print("Enter the color: ");
        color = entrada.next();
        
        System.out.print("Insert molthing: ");
        molthing = entrada.nextBoolean();
        
        System.out.print("Enter the egg counter: ");
        eggCounter = entrada.nextInt();
        
        System.out.println("Enter the chicken's date of birth[" + (i+1) + "]:");
        
        System.out.print("Enter the day: ");
        dia = entrada.nextInt();
        
        System.out.print("Enter the month: ");
        mes = entrada.nextInt();
        
        System.out.print("Enter the year: ");
        ano = entrada.nextInt();
        
        entrada.nextLine();
        
        chickens[i] = new Chicken(id, name, color, molthing, eggCounter);
        ages[i] = new Age(calculaDias(dia,mes,ano), calculaMeses(dia,mes,ano),calculaAnos(dia,mes,ano));
            
    }
        
//  for(int i=0;i<2;i++){
//       System.out.println("Chicken -> " + chickens[i]);
//       System.out.println("El pollo[" + (i+1) + "]" + " tiene la edad de " + ages[i]);
//  }

    GsonBuilder gsonBuilder = new GsonBuilder();
    Gson gson = gsonBuilder.create();
    
    for(int i=0;i<1;i++){
    //Serealizacion
    jsonChicken = gson.toJson(chickens[i]);
    System.out.println("\njsonChicken[" + (i+1) + "]");
    
    jsonAge = gson.toJson(ages[i]);
//  System.out.println("jsonAge -> " + jsonAge);
    
    //deserealizacion
    Chicken chicken2;
    chicken2 = gson.fromJson(jsonChicken,Chicken.class);
    
    System.out.println("\nChicken object id -> " + chicken2.getId());
    System.out.println("Chicken object name -> " + chicken2.getName());
    System.out.println("Chicken object color -> " + chicken2.getColor());
    System.out.println("Chicken object molthing -> " + chicken2.isMolthing());
    System.out.println("Chicken object eggCounter -> " + chicken2.getEggCounter());
    
    Age ages2;
    ages2 = gson.fromJson(jsonAge,Age.class);
    
    System.out.println("\nThe chicken[" + (i+1) + "] is " + ages2.getAno() 
            + " years, " + ages2.getMes() + " months and " 
            + ages2.getDia() + " days old");
    }
   
    }
 
  }
