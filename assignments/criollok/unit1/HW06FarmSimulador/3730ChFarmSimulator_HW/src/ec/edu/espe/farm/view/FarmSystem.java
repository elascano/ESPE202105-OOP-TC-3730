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
 * @author Kevin Criollo BetaSoftwareTech ESPE-DCCO
 */
public class FarmSystem {
    public static void main(String[] args) {
        
        Chicken chicken;
        int id;
        String name; 
        String color; 
        Date age;
        Date bornOn;
        boolean molting;
        int eggCounter;
        
        
        id= 0;
        name = "Lucy";
        color = "white";
        age = new Date();
        bornOn = new Date();
        molting = true;
        eggCounter = 0;
        
        chicken = new Chicken(id, name, color, age, bornOn, molting);
        
        System.out.println(" chicken -> " + chicken);
        Chicken chickens[] = new Chicken [10];
        chickens[0] = chicken;
        chickens[1] = new Chicken(1, " Maria ", " blak ", age, bornOn, false);
        chickens[2] = new Chicken(2, " Juana ", " red ", age, bornOn, true);
        chickens[3] = new Chicken(3, " Diana ", " yellow ", age, bornOn, false);
        chickens[4] = new Chicken(4, " Martina ", " blue ", age, bornOn, true);
        chickens[5] = new Chicken(5, " Lola ", " green ", age, bornOn, false);
        chickens[6] = new Chicken(6, " Pancha ", " pink ", age, bornOn, false);
        chickens[7] = new Chicken(7, " Lamia ", " gray ", age, bornOn, true);
        chickens[8] = new Chicken(8, " Rosa ", " purple ", age, bornOn, true);
        chickens[9] = new Chicken(9, " Esmeralda ", " brown ", age, bornOn, true);
    
        for (int i = 0; i < chickens.length; i++) {
            System.out.println(chickens[i]);
            
            
        }
    }
}
