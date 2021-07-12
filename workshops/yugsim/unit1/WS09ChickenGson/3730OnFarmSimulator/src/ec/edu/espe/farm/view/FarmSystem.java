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
 * @author Pamela Yugsi LAMESTech ESPE-DCCO
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
        String jsonChicken = "";

        //TODO reading from keyboard
        id = 0;
        name = "Estrella";
        color = "White";
        age = new Date();
        bornOn = new Date();
        molting = true;
        eggCounter = 0;

        chicken = new Chicken(id, name, color, age, bornOn, molting);

        System.out.println("WS09 - Chiken Gson, \n"
                + "Pamela Yugsi");

        System.out.println("chicken -> " + chicken);

        Chicken chickens[] = new Chicken[10];

        chickens[0] = chicken;
        chickens[1] = new Chicken(1, "Luna", "brown", age, bornOn, false);

        jsonChicken = " { \"id\"; \"1\"    } ";
        System.out.println("chiken Json -> " + jsonChicken);

        GsonBuilder gsonBuilder = new GsonBuilder();
        Gson gson = gsonBuilder.create();

        jsonChicken = gson.toJson(chicken);

        System.out.println("jsonChicken->" + jsonChicken);

        Chicken chicken3;
        chicken3 = gson.fromJson(jsonChicken, Chicken.class);

        System.out.println("chicken object name ->" + chicken.getName());
    }
}
