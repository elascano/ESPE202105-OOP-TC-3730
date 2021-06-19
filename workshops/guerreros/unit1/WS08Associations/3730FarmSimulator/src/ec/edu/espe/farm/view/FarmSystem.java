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
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
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
         name = "Lucky";
         color = "Withe";
         age = new Date();
         bornOn = new Date();
         molting = true;
         eggCounter = 0;
       
        chicken = new Chicken(id, name, color, age, bornOn, molting);
        
        System.out.println("chiken->" + chicken);
        Chicken chicken2 = new Chicken(1,"Camila", "yellow" , new Date(), new Date(), false);
        System.out.println("chiken->" + chicken2);
        
         jsonChicken= " { \"id\"; \"1\"    } ";
         System.out.println("chiken Json -> "+ jsonChicken);
         
         
       GsonBuilder gsonBuilder = new GsonBuilder() ;
       Gson gson = gsonBuilder.create();
       jsonChicken = gson.toJson(chicken);
       
       System.out.println("jsonChicken ->" +jsonChicken);
       jsonChicken= gson.toJson(chicken2);
       System.out.println("jsonChiken ->"+ jsonChicken);
       
       Chicken chicken3;
       chicken3 = gson.fromJson(jsonChicken, Chicken.class);
       System.out.println(" chicken object name ->"+ chicken3.getName());
      
       
    }
    

    
}
        
    

