/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.plant.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.plant.model.Plant;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.ParseException;
import java.util.Scanner;

/**
 *
 * @author Eliana Cuaspa Beta-SoftwareTech ESPE-DCCO
 */
public class plant {


    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException { 
        Scanner entry = new Scanner(System.in);
        String name;
        int type = 0;
        String typeFruit;
        String colorFlower;
        String typeLeaf;
        
                       
        System.out.println("\nEnter the plant information:");
        System.out.println("\nSelect the plant");
        System.out.println("Option 0: Grass");
        System.out.println("Option 1: Bush");
        System.out.println("Option 2: Shrub");
        System.out.println("Option 3: Tree");
        type = entry.nextInt();
            
        System.out.println("\nEnter the name:");
        name = entry.next();
            
        System.out.println("\nEnter the typeFruit:");
        typeFruit = entry.next ();
            
        System.out.println("\nEnter the colorFlower:");
        colorFlower = entry.next();
            
        System.out.println("\nEnter the typeLeaf:");
        typeLeaf = entry.next();                    
                        
        
        Plant plant = new Plant (name,type, typeFruit, colorFlower, typeLeaf);
        
        GsonBuilder gsonBuilder = new GsonBuilder ();
        Gson gson = gsonBuilder.create (); 
                                        
        if (type == 0){
            System.out.println("\nThe plant is a grass");
          }
        if (type == 1){
            System.out.println("\nThe plant is a bush");
           }
        if (type == 2){
            System.out.println("\nThe plant is a Shrub");
           }    
        if (type == 3){
            System.out.println("\nThe plant is a Tree");
           }

        String jsonPlant = gson.toJson(plant);
        System.out.println(jsonPlant);
        try{
            
            FileWriter file = new FileWriter("./file/Plant.json");
            file.write(plant.toJSONString());
            file.flush();
            file.close();
            }catch(Exception ex){	
			
            }
            finally{
            System.out.print(plant);
            }
                
            try (Writer writer = new FileWriter("./file/Plant.json")) {
            gson.toJson(plant, writer);
        }	
        }
        }

                    

