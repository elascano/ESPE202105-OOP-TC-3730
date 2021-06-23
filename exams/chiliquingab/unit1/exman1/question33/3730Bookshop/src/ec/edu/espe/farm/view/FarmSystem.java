/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.espe.farm.view;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.opencsv.exceptions.CsvValidationException;
import ec.edu.espe.farm.model.Chicken;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class FarmSystem {
    public static void main(String[] args) throws IOException, CsvValidationException {
        //TODO reading from keyboard
        Scanner entrada = new Scanner(System.in);
        Chicken chicken;
        String title;
        String name; 
        String editorial;
        int year;
        boolean salir = false;
        int option;
        String jsonChicken;

    //TODO reading from keyboard

    Chicken chickens[] = new Chicken[2];
   
    for(int i=0;i<2;i++){
        System.out.println("\nEnter the book data[" + (i+1) + "]:");
        
        System.out.print("Enter the title: ");
        title = entrada.next();
        
        System.out.print("Enter the author: ");
        name = entrada.next();
        
        System.out.print("Enter the editorial: ");
        editorial = entrada.next();
        
        System.out.print("Insert year of publication: ");
        year = entrada.nextInt();
        
        entrada.nextLine();
        
        chickens[i] = new Chicken(title, name, editorial, year);

    }
     
  for(int i=0;i<2;i++){
       System.out.println("\nThere are a total of " + (i+1) + " books");
  }

    GsonBuilder gsonBuilder = new GsonBuilder();
    Gson gson = gsonBuilder.create();
    
     do{
        
    System.out.println("\nMenu: ");
    System.out.println("1. Write the jsonbookshop: ");
    System.out.println("2. Read the jsonbookshop: ");
    System.out.println("3. Exit: ");
    System.out.print("Enter an option: ");
    option = entrada.nextInt();
    
    if(option == 1){
    
    for(int i=0;i<2;i++){  
        
    System.out.println("\njsonbookshop[" + (i+1) + "]");
    jsonChicken = gson.toJson(chickens[i]);
    System.out.println("\njsonbookshop -> " + jsonChicken);
    
        }
    
    }
    
    if(option == 2){
        
    
    for(int i=0;i<2;i++){
       
    //Serealizacion
    System.out.println("\njsonChicken[" + (i+1) + "]");
    jsonChicken = gson.toJson(chickens[i]);
    
    //deserealizacion
    Chicken chicken2;
    chicken2 = gson.fromJson(jsonChicken,Chicken.class);
    
    System.out.println("\nBook object title -> " + chicken2.getTitle());
    System.out.println("Book object name -> " + chicken2.getName());
    System.out.println("Book object editorial -> " + chicken2.getEditorial());
    System.out.println("Book object eggCounter -> " + chicken2.getYear());
  
    }
    
  }
    
    if(option == 3){
        
     salir = true;
    }
    
    }while(!salir);
    
        System.out.println("\nEnd of the program");
   
     }
     }
  