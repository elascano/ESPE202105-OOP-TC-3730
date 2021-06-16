/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.view;

import ec.edu.espe.farm.model.Chicken;
import java.util.Date;

/**
 *
 * @author Marco Arias SkyNet.hub tech ESPE-DCCO
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
        int EggCounter;
        
  
        id = 0;
        name = "Lucy";
        color = "White";
        age = new Date();
        bornon = new Date();
        molting = true;
        EggCounter = 0;
                
        chicken = new Chicken(id, name, color, age, molting); 
        
        System.out.println("chicken -> " + chicken);
    }
}
