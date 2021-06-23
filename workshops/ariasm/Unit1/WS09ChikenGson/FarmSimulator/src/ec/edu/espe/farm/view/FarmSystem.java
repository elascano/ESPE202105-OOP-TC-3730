/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.farm.model.Chicken;
import java.util.Date;

/**
 *
 * @author Marco Arias SkyNet.hub tech ESPE-DCCO
 */
public class FarmSystem {
    public static void main(String[] args) {
        
        Chicken chicken;
        int id;
        String name;
        String color;
        Date age;
        Date bornon;
        boolean molting;
        int EggCounter;
        
  
        id = 0;
        name = "Erick";
        color = "White";
        age = new Date();
        bornon = new Date();
        molting = true;
        EggCounter = 0;
        String jsonChicken = "";
        String jsonChickens = "";
        
        System.out.println("WS09ChikenGson - Marco Arias");
                
        chicken = new Chicken(id, name, color, age, molting); 
        System.out.println("chicken -> " + chicken);
            
        Chicken chickens = new Chicken(1, "paula", "blue", age, false);
        System.out.println("chicken 2 -> " + chickens);
        
        System.out.println("chiken Json "+ jsonChicken);
               
        GsonBuilder gsonBuilder = new GsonBuilder() ;
        Gson gson = gsonBuilder.create(); 
        
        jsonChicken = gson.toJson(chicken);
        jsonChickens = gson.toJson(chickens);
                      
        System.out.println("jsonChicken->"+ jsonChicken);
        System.out.println("jsonChicken->"+ jsonChickens);
                     
        Chicken chicken3;
        chicken3 = gson.fromJson(jsonChicken, Chicken.class);
        }
    }

