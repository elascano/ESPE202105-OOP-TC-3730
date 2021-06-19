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
 * @author Marlon Ortiz Codec ESPE-DCCO
 */
public class FarmSystem {
    public static void main(String[] args) {
        Chicken chicken;
        int id;
        String name;
        String color;
        Date age;
        Date bornon;
        boolean molting;
        int eggCounter;
        String jsonChicken = "";
        
        id=0;
        name="Lucy";
        color="white";
        age= new Date();
        bornon= new Date();
        molting= true;
        eggCounter= 0;
        
        
           
          
        
        
        chicken= new Chicken(id, name, color, bornon, age, molting);
        System.out.println("chicken->" + chicken );
        Chicken chicken2 = new Chicken(1,"Cyndi","White",new Date(),new Date(), false);
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
