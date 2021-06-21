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
 * @author Alexander Pachacama BUILDER ESPE-DCC0
 */
public class FarmSystem {
    public static void main(String[]args){
        Chicken chicken;
        //variables
        int id;
        String name;
        String color;
        Date age; 
        Date bornOn;  
        boolean molting;
        int eggCounter; 
        
        //Todo reading from keyboard 
        id=0;
        name = "Lucy";
        color = "White";
        age = new Date();
        bornOn = new Date();
        molting = true;
        eggCounter = 0;
        
        chicken= new Chicken(id, name, color, age, bornOn, molting);
         
        System.out.println("chicken -> " + chicken);
        
        Chicken chickens[]= new Chicken[10];
        Date born0n = null;
        chicken = new Chicken(id, name, color, age, born0n, molting);
        chickens[0] = chicken;
        chickens[1] = new Chicken(1, "Lucy", "blue", new Date(), new Date(), false);
        chickens[2] = new Chicken(2, "Kerly", "yellow", new Date(), new Date(), false);
        chickens[3] = new Chicken(3, "Maria", "black", new Date(), new Date(), false);
        chickens[4] = new Chicken(4, "Pamela", "green", new Date(), new Date(), true);
        chickens[5] = new Chicken(5, "Alex", "pin", new Date(),new Date(), false);
        chickens[6] = new Chicken(6, "Donal", "red", new Date(), new Date(), true);
        chickens[7] = new Chicken(7, "Leonel", "orange", new Date(), new Date(), true);
        chickens[8] = new Chicken(8, "Jaime", "red", new Date(), new Date(), false);
        chickens[9] = new Chicken(9, "Boss", "brown", new Date(), new Date(), true);
        
        for (int i=0; 1<10; i++){
            
            System.out.println("chicken"+ i + "=" + chickens[i]);
          
        }
        String jsonChicken;
        jsonChicken = " { \"id\"; \"1\" /* */  } ";
        System.out.println("chiken Json -> "+ jsonChicken);
         
               GsonBuilder gsonBuilder = new GsonBuilder() ;
               Gson gson = gsonBuilder.create();
               
               jsonChicken = gson.toJson(chicken);
               
               System.out.println("jsonChicken->"+ jsonChicken);
               
               Chicken chicken3;
               chicken3 = gson.fromJson(jsonChicken, Chicken.class);
               
               System.out.println("chicken object name ->"+ chicken.getName());
    }
}

