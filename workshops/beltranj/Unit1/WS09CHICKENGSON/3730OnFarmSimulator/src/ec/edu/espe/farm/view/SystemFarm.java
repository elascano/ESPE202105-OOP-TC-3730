/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Date;
import ec.edu.espe.farm.model.Chicken;
/**
 *
 * @author < Jennifer Beltran Team of machine Developers>
 */
public class SystemFarm {
    public static void main(String[] args ){
        Chicken chicken;
          int id;
        String name;
        String color;
        Date age;
        Date bornOn;
        boolean molting;
        int eggCounter;
        
        id=0;
        name ="Lucy";
        color = "White";
        age = new Date();
        bornOn = new Date();
        molting = true;
        eggCounter =0;
 
        chicken = new Chicken(id, name, color, age, bornOn, molting);
        
        System.out.println("chicken -> " + chicken);
        Chicken chicken2 = new Chicken(1, "Lupita", "red", new Date(), new Date(), true);
        System.out.println("Chicken 2 " + chicken2);
        String jsonChicken = null;
        
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
       
        System.out.println("WS09- ChickenGson , \n"
                        + "Jennifer Beltran");
    }

 
}
