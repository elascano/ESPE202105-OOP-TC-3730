/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import java.util.Date;

/**
 *
 * @author Andrea Quichimbo Builder Program ESPE-DCCO
 */
public class FarmSystem {
    

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("ChFarmSimulator, \n"
        + "Andrea Quichimbo");
        Chicken chiken;
        //TODO reading from keyboard
        int id;
        String name;  
        String color; 
        Date age; 
        Date born0n; 
        boolean molting; 
        int eggCounter; 
        
        id = 0;
        name = "Lucy";
        color = "white";
        age = new Date();
        born0n = new Date();
        molting =true;
        eggCounter = 0;
        String jsonChicken = "";
        @SuppressWarnings("UnusedAssignment")
        String jsonChickens = "";
        
        System.out.println("WS09ChikenGson - Andrea Quichimbo");
                
        Chicken chicken = new Chicken(id, name, color, age, born0n, molting);
        System.out.println("chicken -> " + chicken);
            
        Chicken chicken = new Chicken(1, "Ellie", "pink", age, born0n, false);
        System.out.println("chicken 2 -> " + chicken);
        
        System.out.println("Jack "+ jsonChicken);
               
        GsonBuilder gsonBuilder = new GsonBuilder() ;
        Gson gson = gsonBuilder.create(); 
        
        jsonChicken = gson.toJson(chicken);
        jsonChickens = gson.toJson(chicken);
                      
        System.out.println("jsonChicken->"+ jsonChicken);
        System.out.println("jsonChicken->"+ jsonChickens);
                     
        Chicken chicken3;
        chicken3 = gson.fromJson(jsonChicken, Chicken.class);
    }
}
    

  
