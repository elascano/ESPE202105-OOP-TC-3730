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
 * @author Ariel Aulestia SkyNet.hub 00PTech ESPE-DCC0
 */
public class FarmSystem {
    public static void main(String[] args) {
        Chicken chicken;
        int id;
        String name;
        String color;
        Date age;
        Date bornOn;
        boolean molting;
        int eggCounter;
        
        id = 0;
        name = "Lala";
        color = "blue";
        age = new Date();
        bornOn = new Date();
        molting = true;
        eggCounter = 0;
        //String jsonChicken = "";
        
        //Chicken chicken = new Chicken();
        chicken = new Chicken(id, null, null, null, null, true);
        
        System.out.println("chicken -> " + chicken );
        
        Chicken chicken2 = new Chicken(2,"Daniela","red",new Date(), new Date(), false);
        System.out.println("Chicken ->" + chicken2);
        
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        
        String jsonChicken = "{\"id\":\"1\"}";
        System.out.println("Chicken json ->" + jsonChicken);
        
        jsonChicken = gson.toJson(chicken);
        
        //Serealization
        System.out.println("jsonChicken ->" + jsonChicken);
        jsonChicken = gson.toJson(chicken2);
        System.out.println("jsonChicken2 ->" + jsonChicken);
        
        //Deserealization
        Chicken chicken3;
        chicken3 = gson.fromJson(jsonChicken, Chicken.class);
        System.out.println("chicken name -> " + chicken3.getName());
    }
}
