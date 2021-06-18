/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ed.espe.farm.view;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.farm.model.Chicken;
import java.util.Date;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class FarmSystem {
    public static void main(String[] args) {
        Chicken chicken;
        
        //varibles
        int id; 
        String name; 
        String color; 
        Date age;
        Date bornOn;
        boolean molting;
        int eggCounter;
        
        String jsonChicken = "";     
                 
         id = 0;
         name = "Lucy";
         color = "Black";
         age = new Date();
         bornOn = new Date();
         molting = false;
         eggCounter = 5;
      
                     
        
        chicken = new Chicken(id, name, color, age, bornOn, molting);
        
        System.out.println("chiken->" + chicken);
        
         Chicken chicken2 = new Chicken(2,"Rita", "White" , new Date(), new Date(), true);
        System.out.println("chiken->" + chicken2);
        
        jsonChicken = "{\"id\";\"1\"}";
        System.out.println("chicken Json->" + jsonChicken);
        
         GsonBuilder gsonBuilder=new  GsonBuilder();
         Gson gson=gsonBuilder.create();
         
         jsonChicken = gson.toJson(chicken);
         System.out.println("jsonChicken ->" + jsonChicken);
         jsonChicken = gson.toJson(chicken2);
         System.out.println("jsonChicken ->" + jsonChicken);

         Chicken chicken3;
         chicken3 = gson.fromJson(jsonChicken, Chicken.class);
         
         System.out.println("chicken object name->" + chicken3.getName());
         
       
    }
    

    
}
