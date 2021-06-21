/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class FarmSystem {
    public static void main(String[] args) {
        int chickenId;
        String name;  
        String color; 
        Date date=new Date();  
        boolean Ismolting; 
        int eggCounter=0;
        ArrayList<Chicken> chickens =new ArrayList<>();
        Chicken chickensArray[]=new Chicken[5];
        String jsonChicken ="";
        
        //input by keyboard
        chickenId =1;
        name="Lucy";
        color="white";
        Ismolting=true;
      
         Chicken chicken;
        chicken = new Chicken(chickenId, name, color, date, Ismolting, date);
        System.out.println("chicken object ="+chicken);
      
        chicken = new Chicken(chickenId, name, color, date, Ismolting, date);
        System.out.println("chicken object =" + chicken);
        
        Chicken chicken2 = new Chicken (2,"Maruja", "Black",new Date(),false,new Date());
        System.out.println("chicken2 object="+ chicken2);
      
        chickens.add(chicken);
        chickens.add(chicken2);
        
        System.out.println("Chicken = " +chickens);
        chickensArray[0]=chicken;
        System.out.println("ChickensArray:" + chickensArray[0]);
        
        jsonChicken ="{\"id\":\"1\"}";
        System.out.println("chicken Json = "+jsonChicken); 
              
    GsonBuilder gsonBuilder=new GsonBuilder();
    Gson gson = gsonBuilder.create();
  
        //serializacion  
         jsonChicken= gson.toJson(chicken);
        System.out.println("json="+jsonChicken);
          jsonChicken= gson.toJson(chicken2);
        System.out.println("json="+jsonChicken);
        
        //Deserializacion       
        Chicken chicken3;
        chicken3 = gson.fromJson(jsonChicken, Chicken.class);
        System.out.println("Chicken object name= "+chicken3.getName());
    }

}
