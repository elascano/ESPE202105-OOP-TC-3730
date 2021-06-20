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
 * @author Kevin Criollo BetaSoftwareTech ESPE-DCCO
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
        
        String jsonChicken = "";
        
        id=0;
        name="Maria";
        color="blue";
        age= new Date();
        bornOn= new Date();
        molting= true;
        eggCounter= 0;
        
        chicken= new Chicken(id, name, color, bornOn, age, molting);
        System.out.println("chicken->" + chicken );
        Chicken chicken2 = new Chicken(1,"Paula","Red",new Date(),new Date(), false);
        System.out.println("chicken ->" + chicken2);
        
       jsonChicken = "{ \"id\"; \"1\" }";
        System.out.println("chicken Json ->"+jsonChicken);
        
        GsonBuilder gsonBuldier = new GsonBuilder();
        Gson gson = gsonBuldier.create();
        jsonChicken = gson.toJson(chicken);
        
        System.out.println("jsonChicken ->"+ jsonChicken);
        jsonChicken = gson.toJson(chicken2);
        System.out.println("jsonChicken ->"+ jsonChicken);
             
       }
    }
