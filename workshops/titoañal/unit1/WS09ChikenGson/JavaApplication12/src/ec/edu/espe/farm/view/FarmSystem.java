/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.farm.model.Chicken;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Leslie Titoaña LAMES Tech ESPE-DCC0
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
        String jsonChicken="";
        
        id=0;
        name="Lucy";
        color="White";
        age= new Date();
        bornOn=new Date();
        molting = true;
        eggCounter=0;
        
        System.out.println("WSO9 Chicken Json");
        System.out.println("Leslie Titoaña");
        
        chicken = new Chicken(id, name, color, age, bornOn, molting);
       
        Chicken chickens[]=new Chicken[10];
        chickens[0] = chicken;
        chickens[1] = new Chicken(1, " Maruja","black", age, bornOn, false);
        
        jsonChicken= "   { \"id\"; \"1\"   }";
        System.out.println("Chicken Json: "+ jsonChicken);
        
          GsonBuilder gsonBuilder = new GsonBuilder();
          Gson gson = gsonBuilder.create();
          jsonChicken = gson.toJson(chickens[0]);
          System.out.println("jsonChciek: "+jsonChicken);
          jsonChicken = gson.toJson(chickens[1]);
          System.out.println("jsonChciek: "+jsonChicken);
          
          Chicken chicken3;
          chicken3 = gson.fromJson(jsonChicken, Chicken.class);
          System.out.println("chicken object name"+chicken3.getName());
    }
          
    
}
    


   
