/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

<<<<<<< HEAD
=======
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
>>>>>>> c4357b06b8495ba58d302d26c552b444f149850b
import ec.edu.espe.farm.model.Chicken;
import java.util.Date;

/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class FarmSystem {
<<<<<<< HEAD
    public static void main(String[] args) {
        //Variables
            Chicken chicken;
            int id;
            String name;
            String color;
            Date age;
            Date bornOn;
            boolean molting;
            int eggCounter;
            
        // Todo reading from keyboard    
            id = 0;
            name = "Lucy";
            color = "While";
            age = new Date();
            bornOn = new Date();
            molting = true;
            eggCounter = 0;
            
            
            chicken = new Chicken(id, name, color, age, bornOn, molting);
            
            System.out.println("chicken ->" + chicken);
        
    }
}
=======
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
        String jsonChicken="" ;
        
        id=0;
        name= "Lucy";
        color = "White";
        age = new Date();
        bornOn = new Date();
        molting = true;
        eggCounter = 0; 
        
        
        chicken = new Chicken(id, name, color, age, bornOn, molting);
        System.out.println("chicken -> " + chicken);
        Chicken chicken2 = new Chicken(1, "Kevin", "black", new Date(), new Date(), true);
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
        
>>>>>>> c4357b06b8495ba58d302d26c552b444f149850b
