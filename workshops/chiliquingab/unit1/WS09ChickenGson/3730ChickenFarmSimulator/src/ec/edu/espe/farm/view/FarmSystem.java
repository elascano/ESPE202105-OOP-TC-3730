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
import java.util.Scanner;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class FarmSystem {
    public static void main(String[] args) {
        //TODO reading from keyboard
        Scanner entry = new Scanner(System.in);
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
        boolean salir = false;
        int option;
        String jsonChicken;
        String jsonAge;
        
    //TODO reading from keyboard 
        
    Chicken chickens[] = new Chicken[10];
    Age ages[] = new Age[10];
        
    for(int i=0;i<10;i++){
        System.out.println("\nEnter the chicken data[" + (i+1) + "]:");
        
        System.out.print("Enter the id: ");
        id = entry.nextInt();
        
        System.out.print("Enter the name: ");
        name = entry.next();
        
        System.out.print("Enter the color: ");
        color = entry.next();
        
        System.out.print("Insert molthing: ");
        molthing = entry.nextBoolean();
        
        System.out.print("Enter the egg counter: ");
        eggCounter = entry.nextInt();
        
        System.out.println("Enter the chicken's date of birth[" + (i+1) + "]:");
        
        System.out.print("Enter the day: ");
        dia = entry.nextInt();
        
        System.out.print("Enter the month: ");
        mes = entry.nextInt();
        
        System.out.print("Enter the year: ");
        ano = entry.nextInt();
        
        entry.nextLine();
        
        chickens[i] = new Chicken(id, name, color, molthing, eggCounter);
        ages[i] = new Age(calculaDias(dia,mes,ano), calculaMeses(dia,mes,ano),calculaAnos(dia,mes,ano));
            
    }
        
//  for(int i=0;i<2;i++){
//       System.out.println("Chicken -> " + chickens[i]);
//       System.out.println("El pollo[" + (i+1) + "]" + " tiene la edad de " + ages[i]);
//  }
     
    GsonBuilder gsonBuilder = new GsonBuilder();
    Gson gson = gsonBuilder.create();
    
    do{
        
        System.out.println("\nMenu: ");
    System.out.println("1. Write the jsonChicken: ");
    System.out.println("2. Read the jsonChicken: ");
    System.out.println("3. Exit: ");
    System.out.print("Enter an option: ");
    option = entry.nextInt();
    
    if(option == 1){
    
    for(int i=0;i<10;i++){
    //Serealizacion
    System.out.println("\njsonChicken[" + (i+1) + "]");
    jsonChicken = gson.toJson(chickens[i]);
    System.out.println("jsonChicken -> " + jsonChicken);
    
    jsonAge = gson.toJson(ages[i]);
    System.out.println("jsonAge -> " + jsonAge);
    
        }
    
    }
    
    if(option == 2){
    
    for(int i=0;i<10;i++){
    //Serealizacion
    System.out.println("\njsonChicken[" + (i+1) + "]");
    jsonChicken = gson.toJson(chickens[i]);
    
    jsonAge = gson.toJson(ages[i]);
    //System.out.println("jsonAge -> " + jsonAge);
    
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
    
    if(option == 3){
        salir = true;
    }
    
    }while(!salir);
    
        System.out.println("\nEnd of the program");
    }
}