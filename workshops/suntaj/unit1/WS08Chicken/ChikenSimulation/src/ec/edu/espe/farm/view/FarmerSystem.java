/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;


<<<<<<< HEAD
import ec.edu.espe.farm.model.Chicken;
import java.util.Date;

=======
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.farm.model.Chicken;
import java.util.Date;


>>>>>>> c4357b06b8495ba58d302d26c552b444f149850b
/**
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */
public class FarmerSystem { 
    public static void main(String[] args) {
<<<<<<< HEAD
=======
    
>>>>>>> c4357b06b8495ba58d302d26c552b444f149850b
        Chicken chicken;
        int id;
        String name;
        String color;
        Date age;
        Date born0n;
        boolean molting;
        int eggCounter;
<<<<<<< HEAD
        
=======
       String jsonChicken = ""; 
      
>>>>>>> c4357b06b8495ba58d302d26c552b444f149850b
        id= 0;
        name = "Lucky";
        color = "White";
        age = new Date ();
        born0n= new Date();
        molting = true;
        eggCounter = 0;
        
        chicken = new Chicken(id, name, color, age, born0n, molting);
        
        System.out.println("chicken ->"+ chicken);
        
<<<<<<< HEAD
        
        
        
        
                
        
        
        
        
        
        
        
        
    }
=======
        Chicken chicken2 = new Chicken(2,"Piolin", "Brown" , new Date(), new Date(), false);
        System.out.println("chiken->" + chicken2);
       
        jsonChicken= " { \"id\"; \"1\"    } ";
        System.out.println("chiken Json -> "+ jsonChicken);
         
               GsonBuilder gsonBuilder = new GsonBuilder() ;
               Gson gson = gsonBuilder.create();
               
               jsonChicken = gson.toJson(chicken);
               
               System.out.println("jsonChicken->"+ jsonChicken);
               
               Chicken chicken3;
               chicken3 = gson.fromJson(jsonChicken, Chicken.class);
               
               System.out.println("chicken object name ->"+ chicken.getName());
        

        }
>>>>>>> c4357b06b8495ba58d302d26c552b444f149850b
    
}
