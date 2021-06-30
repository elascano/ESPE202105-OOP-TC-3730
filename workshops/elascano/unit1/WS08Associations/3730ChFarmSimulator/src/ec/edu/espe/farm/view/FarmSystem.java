/** Copyright ESPE-DECC
 */
package ec.edu.espe.farm.view;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import ec.edu.espe.farm.model.Chicken;
import java.util.Date;

/**
 *
 * @author Edison Lascano OOPTech ESPE-DCCO
 */
public class FarmSystem {

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
        String jsonChicken;

        //TODO reading from keyboard
        id = 0;
        name = "Lucy";
        color = "White";
        age = new Date();
        bornOn = new Date();
        molting = true;
        eggCounter = 0;
        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();
        
        

        chicken = new Chicken(id, name, color, age, bornOn, molting);

        System.out.println("chicken -> " + chicken);

        Chicken chickens[] = new Chicken[10];

        chickens[0] = chicken;
        chickens[1] = new Chicken(1, "Maruja", "black", age, bornOn, false);

        //jsonChicken = "{\"id\":\"" + chicken.getId() + "\"}";
        //System.out.println("jsonString" + jsonChicken);

        //serialization
        jsonChicken = gson.toJson(chicken);
        System.out.println("jsonChicken -> " + jsonChicken);

        Chicken chicken2;
        chicken2 = gson.fromJson(jsonChicken, Chicken.class);
        
        System.out.println("choen2 name -> " + chicken2.getName());
                
        
        //JAR -> Java Archive
        //EAR -> Enterprise Archive
        //WAR -> Web Archive
        
        
    }

}
