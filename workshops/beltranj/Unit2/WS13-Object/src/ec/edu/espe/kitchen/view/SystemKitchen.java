/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.kitchen.view;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.kitchen.model.Kitchen;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author < Jennifer Beltran Team of machine Developers>
 */
public class SystemKitchen {
   public static void main(String[] args)  {
       
        Kitchen kitchen;
        int model;
        String brand;
        String color;
        String jsonKitchen = "";
        Scanner read = new Scanner(System.in);
        int optionMenu;

        System.out.println("Welcome to the appliance store ");
        
        System.out.println("Enter the model of kitchen: ");
        model = read.nextInt();
        
        System.out.println("Enter the brand of kitchen: ");
        brand = read.next();
        
        System.out.println("Enter color of kitchen: ");
        color = read.next();
  
        kitchen = new Kitchen(model, brand, color);
        
        System.out.println(" Save Jason (1)");
        System.out.println(" Don't save in json (2)");
        System.out.println("Choose the option: ");
        
        optionMenu = read.nextInt();
        switch (optionMenu) {
            case 1:
                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                jsonKitchen = gson.toJson(kitchen);
                try {
            try (FileWriter file = new FileWriter("./files/Kitchen.json")) {
                file.write(jsonKitchen);
                file.flush();
            }

            }   catch (IOException e) {
                    
                }
                break;
                
            case 2:
                System.out.println("");
                break;
            
                
            default: System.out.println(" Error");
              
        }
        System.out.println("HW13- Object-Gson , \n"
                        + "Jennifer Beltran");
    }
        
    }

 

