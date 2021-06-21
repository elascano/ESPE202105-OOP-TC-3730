/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.associations.model.Chicken;
import java.util.Date;

/**
 *
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
 */
public class SimulatorGson {
    public static void main(String[] args) {
        
        System.out.println ("ChFarmSimulator, \n"
            + "Alina Villavicencio");
        
        Chicken chicken;
        // variables
        int id;
        String name;
        String color;
        Date age; 
        Date bornOn; 
        boolean molting;
        int eggCounter; 
        
        // TODO reading from keyboard
        id=0;
        name="Lucy";
        color="White";
        age = new Date();
        bornOn = new Date();
        molting = true;
        eggCounter =0;
        
        
        chicken= new Chicken(id, name,color,age,bornOn,molting);
         System.out.println("chicken ->"+ chicken);
        
        Chicken chickens[]=new Chicken[10];
        chickens [0] =chicken;
        chickens[1]= new Chicken(1, "Maruja","black",age, bornOn, false);
        System.out.println("chcicken1:"+chickens [0]);
        System.out.println("chcicken2:"+chickens [1]);
        
       
        String jsonChicken = "{\"id\";\"1\"}";
        System.out.println("Chicken Json"+ jsonChicken);
        
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson= gsonBuilder.create();
        jsonChicken =gson.toJson(chickens[0]);
        System.out.println("jsonChicken:"+jsonChicken);
        jsonChicken =gson.toJson(chickens[1]);
        System.out.println("jsonChicken:"+jsonChicken);
        
        Chicken chicken3;
        chicken3 = gson.fromJson(jsonChicken,Chicken.class);
        System.out.println("chcicken object name"+chicken3.getName());
        
    }
    
    
}
