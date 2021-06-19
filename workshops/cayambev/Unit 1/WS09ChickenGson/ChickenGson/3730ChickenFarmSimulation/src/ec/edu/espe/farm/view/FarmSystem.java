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
 * @author Vanessa Cayambe Team of machine ESPE-DCCO
 */
public class FarmSystem {
    public static void main(String[] args) {
        //variables
        Chicken chicken;
        int id;
        String name;
        String color;
        Date age;
        Date bornOn;
        boolean molting;
        int EggCounter;
        
  
        id = 0;
        name = "Lassy";
        color = "White";
        age = new Date();
        bornOn = new Date();
        molting = true;
        EggCounter = 0;
        String jsonChicken = "";
        String jsonChickens = "";
                
        chicken = new Chicken(id, name, color, age, bornOn,  molting); 
        
        System.out.println("chicken -> " + chicken);
        
        Chicken chickens = new Chicken(1, "Pepita", "blue", age, bornOn, false); 
        
        System.out.println("chicken 2 -> " + chickens);
        
        System.out.println("chicken Gson"+ jsonChicken);
        
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
