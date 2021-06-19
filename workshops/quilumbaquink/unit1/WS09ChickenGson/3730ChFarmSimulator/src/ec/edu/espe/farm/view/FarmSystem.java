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
 * @author Karen Quilumbaquin Program Builder ESPE-DCC0
 */
public class FarmSystem {
    public static void main(String[] args) {
        Chicken chicken;
        //reading from keyboard
        int id;
        String name;
        String color;
        Date age;
        Date bornOn;
        boolean molting;
        int eggCounter;
        
        //ArrayList<Chicken> chickens= new ArrayList<>();
        //Chicken chickensArrar[]=new Chicken[5];
        //String jsonChicken="";
        
     
        id=0;
        name="Lucy";
        color="White";
        age = new Date();
        bornOn = new Date();
        molting =true;
        eggCounter=0;
        String jsonChicken="";

        //Chicken chicken= new Chicken();
        chicken = new Chicken(id,name,color,age,bornOn,molting);
        System.out.println("chicken object -" + chicken);
        
        Chicken chicken2=new Chicken(2,"Maruja","black",new Date(),new Date(), false);
        
        
        //chicken =new Chicken(id,name,color,date,molting);
        
        GsonBuilder gsonBuilder= new GsonBuilder();
        Gson gson=gsonBuilder.create();
        
        jsonChicken=gson.toJson(chicken);
        
        //Serialization
        System.out.println("jsonChicken -"+jsonChicken);
        jsonChicken=gson.toJson(chicken2);
        System.out.println("jsonChicken -"+jsonChicken);
        
        //Deserialization
        Chicken chicken3;
        chicken3=gson.fromJson(jsonChicken,Chicken.class);
        
        System.out.println("chicken object name -"+chicken3.getName());
        
        
        
      
    }
            
}
