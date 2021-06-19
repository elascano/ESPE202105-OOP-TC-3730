/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.farm.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.espe.farm.model.Chicken;
import java.util.Date;

/**
 *
 * @author Erick Yánez LAMESTech ESPE-DCCO
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
        int eggCounter;
        String jsonChicken = ""; 
        //TODO reading from keyboard
        
        id = 0;
        name = "Lucy";
        color = "White";
        age = new Date();
        bornOn = new Date ();
        molting = true;
        eggCounter = 0;
        
        chicken = new Chicken(id, name, color, age, bornOn, molting);
         
        System.out.println("chicken -> " + chicken);
        Chicken chicken2 = new Chicken(1, "Marco", "pink", new Date(), new Date(), false);
        System.out.println("Chicken 2 " + chicken2);
        
        System.out.println("Chicken json " + jsonChicken);
        
        GsonBuilder gsonBuilder = new GsonBuilder() ;
        Gson gson = gsonBuilder.create();
        jsonChicken = gson.toJson(chicken);
        
        System.out.println("jsonChicken " + jsonChicken);
        jsonChicken = gson.toJson(chicken2);
        System.out.println("jsonChicken " + jsonChicken);
        
        Chicken chicken3;
        chicken3 = gson.fromJson(jsonChicken, Chicken.class);
        System.out.println("Chicken objects name: " + chicken3.getName());
    }
}