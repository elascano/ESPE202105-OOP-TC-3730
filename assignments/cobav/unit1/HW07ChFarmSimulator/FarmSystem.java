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
 * @author Victor Coba Beta Software ESPE-DCCD
 */
public class FarmSystem{
       public static void main(String[] args){
           Chicken chicken;
           //variables
           int id;
           String name;
           String color;
           Date age;
           Date bornOn;
           boolean molting;  
           int eggCounter;
           
           //todo reading
           id= 0;
           name="Lucy";
           color = "White";
           age = new Date();
           bornOn = new Date();
           molting =true ;  
           eggCounter = 0;
           String jsonChicken = "";
        String jsonChickens = "";
        
        System.out.println("WS09ChikenGson - Victor Coba ");
                
        chicken = new Chicken(id, name, color, age, born0n, molting); 
        System.out.println("chicken -> " + chicken);
            
        Chicken chickens = new Chicken(1, "Elian", "pink", age, false);
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

            

